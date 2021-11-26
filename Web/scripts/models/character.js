import { Status } from "./status.js"
import { Spells } from "./spells.js"

export class Character {

    #name
    #status
    #spells

    constructor(data) {
        this.#name = data.nome
        this.#status = new Status(data)
        this.#spells = new Spells(data.habilidades, this.#status)
    }
}