export class Attribute {

    #current;
    #total;

    constructor(totalValue) {
        this.#total = totalValue;
        this.#current = totalValue;
    }

    set current(value) {
        if (value < 0) {
            this.#current = 0;
        } else if (value > this.#total) {
            this.#current = this.#total;
        } else {
            value = 0;
        }
    }

    get current() {
        return this.#current;
    }

    set total(value) {
        if (value < 0) {
            this.#total = 0;
            this.#current = 0;
        } else if (value < this.#current) {
            this.#total = value;
            this.#current = value;
        } else {
            this.#total = value;
        }
    }

    get total() {
        return this.#total;
    }
}