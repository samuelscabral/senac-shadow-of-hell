export class GameElement {

    _element
    _hided

    constructor(parent) {
        if (!parent) parent = document.getElementById("root")

        let wrapper = document.createElement("div")
        wrapper.innerHTML = this.template().trim()
        this._element = wrapper.firstChild;

        parent.appendChild(this._element);
        this._hided = this._element.classList.contains("disabled")
    }

    template() {
        throw new Error("template not implemented");
    }

    set hided(value) {
        if (value) {
            this._element.classList.add("disabled")
        } else {
            this._element.classList.remove("disabled")
        }
        this._hided = value
    }

    get hided() {
        this._hided
    }

    get element() {
        return this._element
    }
}