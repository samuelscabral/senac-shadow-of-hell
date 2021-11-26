export class Spell {

    _status;
    _data;

    constructor(data, status) {
        this._status = status;
        this._data = data;
    }

    get name() { return this._data.nome };

    get description() { return this._data.descricao };

    get power() {
        return (this._data.poder_inicial ?? 0) +
            (this._data.fator_astucia ?? 0 * this._status.astucia.atual) +
            (this._data.fator_agilidade ?? 0 * this._status.agilidade.atual)
    }

    get chance() {
        return (this._data.chance_efeito_inicial ?? 0) +
            (this._data.chance_efeito_astucia ?? 0 * this.atributos.astucia.atual) +
            (this._data.chance_efeito_agilidade ?? 0 * this.atributos.agilidade.atual)
    };

    get effect() { return this._data.efeito };
}