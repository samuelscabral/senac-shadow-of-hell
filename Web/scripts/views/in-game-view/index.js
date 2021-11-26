import { GameElement } from "../../utils/game-element.js"
import { DialogView } from "./dialog-view.js";
import { StatusView } from "./status-view.js";

export class InGameView extends GameElement {

    constructor() {
        super();
        this.hided = true;
        this.dialog = new DialogView(document.getElementById("inGameView_dialog"));
        this.status = new StatusView(document.getElementById("inGameView_status"))
    }

    template() {
        return /*html*/`
        <div class="inGameView">
            <div class="inGameView_image"></div>
            <div class="inGameView_status" id="inGameView_status"></div>
            <div class="inGameView_dialog" id="inGameView_dialog"></div>
            <div class="inGameView_enemyInfo"></div>
        </div>
        `
    }

}
