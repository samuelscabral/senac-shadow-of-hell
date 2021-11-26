class Statistics extends GameElement {

    constructor() {
        super();
    }

    template() {
        return /*html*/ `
        <div class="estatisticas disabled">
            <div class="estatisticas_atributos"></div>
            <div class="estatisticas_habilidades"></div>
        </div>
        `
    }
}
