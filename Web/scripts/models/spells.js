import { Spell } from "./spell.js"

export class Spells {

    _attack
    _defense

    constructor(data, status) {
        this._attack = []
        this._defense = []

        for (let item of data.ataque) {
            this._attack.push(new Spell(item, status))
        }

        for (let item of data.defesa) {
            this._defense.push(new Spell(item, status))
        }
    }
}