import { GameElement } from "../../utils/game-element.js";
import { GameEvent } from "../../utils/game-event.js";
import { GenderIdentifier } from "../../utils/gender-identifier.js";

export class DialogView extends GameElement {

    onProceed;
    #dialog;

    constructor(parent) {
        super(parent);
        this.onProceed = new GameEvent();

        this.#dialog = {
            speaker: document.getElementById("dialog_speaker"),
            text: document.getElementById("dialog_text"),
            formOptions: document.getElementById("dialogo_formulario"),
            options: [
                document.getElementById("dialog_option1"),
                document.getElementById("dialog_option2"),
                document.getElementById("dialog_option3"),
                document.getElementById("dialog_option4"),
            ],
            buttonNext: document.getElementById("dialog_buttonNext"),
        }
        this.#dialog.buttonNext.addEventListener("click", () => this.onProceed.raise());
        this.#dialog.options.forEach((option, index) =>
            option.addEventListener("click", () => this.onProceed.raise({ option: index + 1 }))
        )
    }


    talk(speech) {
        this.#dialog.speaker.textContent = speech.speaker ?? ""
        this.#dialog.text.textContent = (speech.gender != null || speech.gender != undefined) ?
            GenderIdentifier.manualReplace(speech.text, speech.gender) :
            GenderIdentifier.autoReplace(speech.text)

        if (speech.options) {
            this.updateOptions(speech.options, speech.gender);
        } else {
            this.updateProceedButton();
        }
    }

    updateProceedButton() {
        this.#dialog.options.forEach((option) => option.disabled = true)
        this.#dialog.buttonNext.disabled = false
    }

    updateOptions(options, gender) {
        this.#dialog.options.forEach((option, index) => {
            if (options[index]) {
                option.value = (gender != null || gender != undefined) ?
                    GenderIdentifier.manualReplace(options[index], gender) :
                    GenderIdentifier.autoReplace(options[index])
                option.disabled = false;
            } else {
                option.disabled = true;
            }
        })
        this.#dialog.buttonNext.disabled = true;
    }

    template() {
        return/*html*/`
        <div class="dialog">
            <p><span class="dialog_speaker" id="dialog_speaker">Test diz:</span></p>            
            <p class="dialog_text" id="dialog_text">Text</p>
            <form class="dialog_options">
                <input id="dialog_option1" class="button" type="button" value="Test">
                <input id="dialog_option2" class="button" type="button" value="Test">
                <input id="dialog_option3" class="button" type="button" value="Test">
                <input id="dialog_option4" class="button" type="button" value="Test">
            </form>
            <button id="dialog_buttonNext" class="dialog_buttonNext button" accesskey="enter">Prosseguir</button>
        </div>
        `
    }


    replacePronounPlaceholders(str) {
        const pronounPattern = /\[([^\/]*)\/([^\/]*)\/([^\]]*)\@(\d)]/g;

        return str.replace(pronounPattern, (matchDaRegex, group1, group2, group3, group4) => {
            let pronouns = [group1, group2, group3]
            return pronouns[group4 ?? 1]
        });
    }
}