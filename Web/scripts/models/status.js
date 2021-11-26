import { Attribute } from "./attribute.js"

export class Status {

    vida
    resiliencia
    fe
    agilidade
    forca
    astucia

    constructor(data) {
        this.vida = new Attribute(data.vida);
        this.resiliencia = new Attribute(data.resiliencia);
        this.fe = new Attribute(data.fe);
        this.agilidade = new Attribute(data.agilidade);
        this.forca = new Attribute(data.forca);
        this.astucia = new Attribute(data.astucia);
    }
}