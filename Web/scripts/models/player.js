export class Player extends Personagem {

    genero;
    classe;

    constructor(dados, nome, genero) {
        Personagem.call(dados);
        this.nome = nome;
        this.genero = genero;
    }
}