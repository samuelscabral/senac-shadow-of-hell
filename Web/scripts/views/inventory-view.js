class InventoryView extends GameElement {

    constructor() {
        super();
    }

    template() {
        return /*html*/ `
            <div class="inventario disabled">
                <span class="inventario_nome">Inventário</span>
                <div class="inventario_itens">
                    <div class="item">
                        <span class="item_nome">Nome</span>
                        <button class="item_botaoUsar">Usar</button>
                        <button class="item_botaoDescartar">Descartar</button>
                    </div>
                </div>
            </div>
        `
    }
}
