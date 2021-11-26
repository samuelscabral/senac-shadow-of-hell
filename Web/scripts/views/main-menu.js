import { GameElement } from "../utils/game-element.js"

export class MainMenu extends GameElement {

    buttonPlay
    buttonCredits

    constructor() {
        super()
        this.buttonPlay = document.getElementById("mainMenu_buttonPlay")
        this.buttonCredits = document.getElementById("mainMenu_buttonCredits")
    }

    template() {
        return /*html*/`
        <div class="mainMenu">
            <header class="mainMenu_header">Shadow of Hell</header>
            <div class="mainMenu_buttons">
                <button id="mainMenu_buttonPlay" class="button">Jogar</button>
                <button id="mainMenu_buttonCredits" class="button">Créditos</button>
            </div>
        </div>
        `
    }

}