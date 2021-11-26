import { GameElement } from "../../utils/game-element.js";

export class StatusView extends GameElement {

    constructor(parent) {
        super(parent);
    }

    template() {
        return /*html*/`
            <div class="telaDeJogo_playerInfo">
                <span class="playerInfo_name">Player Name</span>
                <div class="playerInfo_lifeBar">
                    <div class="playerInfo_lifeBarCurrent"></div>
                </div>
                <table class="playerInfo_status">
                    <tr class="attribute">
                        <th class="attribute_name">Vida</td>
                        <td class="attribute_value">10</td>
                    </tr>
                    <tr class="attribute">
                        <th class="attribute_name">Resiliencia</td>
                        <td class="attribute_value">10</td>
                    </tr>
                    <tr class="attribute">
                        <th class="attribute_name">Fé</td>
                        <td class="attribute_value">10</td>
                    </tr>
                    <tr class="attribute">
                        <th class="attribute_name">Agilidade</td>
                        <td class="attribute_value">10</td>
                    </tr>
                    <tr class="attribute">
                        <th class="attribute_name">Força</td>
                        <td class="attribute_value">10</td>
                    </tr>
                    <tr class="attribute">
                        <th class="attribute_name">Astúcia</td>
                        <td class="attribute_value">10/10</td>
                    </tr>
                </table>
            </div>
        `
    }

}
