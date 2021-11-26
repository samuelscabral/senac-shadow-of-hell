package jogopi;

import java.util.Scanner;

public class JogoPI {
    // TODO:
    // Arrumar impressão
    // Diminuir variáveis globais
    // --------------------------------------------------------------------------------------------------------------------------------
    // Linhas da interface
    static String[] linhaHorizontal;

    // Tela superior do jogo
    static char[][] telaSuperior;

    static String telaSuperiorTexto = " ";

    static String telaSuperiorTextoMenu = " ";

    // Tela inferior do jogo
    static char[][] telaInferior;

    static String telaInferiorTexto = " ";

    static String telaInferiorTextoMenu = " ";

    // Tela que mostra as informações do personagem principal
    static char[][] telaInformacoes;

    // Estados do Jogo
    static boolean menuAberto = false;

    static boolean personagemIniciado = false;

    // indices
    // ------------------------------------------------------------------------------------------------------------------------------------------------
    // Atributos
    static final int VIDA = 0;

    static final int RESILIENCIA = 1;

    static final int FE = 2;

    static final int AGILIDADE = 3;

    static final int FORCA = 4;

    static final int ASTUCIA = 5;

    static final int TOTAL = 0;

    static final int ATUAL = 1;

    // Ataque ou Defesa
    static final int ATAQUE = 0;

    static final int DEFESA = 1;

    // Indice da Habilidade
    static final int HABILIDADE_1 = 0;

    static final int HABILIDADE_2 = 1;

    static final int HABILIDADE_3 = 2;

    // Definições
    static final int NOME = 0;

    static final int TIPO = 1;

    static final int DESCRICAO = 2;

    static final int EFEITO = 3;

    // Atributos de habilidades
    static final int PODER = 0;

    static final int EFEITO_CHANCE = 1;

    // ATRIBUTOS DO PERSONAGEM PRINCIPAL
    // ------------------------------------------------------------------------------------------------------------------------------------------------
    static String nome;

    static int genero;

    static int classe;

    static int[][] gAtributos = new int[6][2];

    static String[][][] gHabilidadeDefinicao = new String[2][3][4];

    static int[][][] gHabilidadeAtributos = new int[2][3][6];

    static String[] mochila;

    // INICIALIZAÇÃO DE PERSONAGENS
    // ------------------------------------------------------------------------------------------------------------------------------------------------
    // Inicia os atributos do personagem cujo nome foi enviado pelo parâmetro.
    public static void atributosInicia(String personagemNome, int[][] atributos) {

        // Verifica qual foi o personagem enviado pelo parâmetro para iniciar seus
        // atributos.
        if (personagemNome.equals("Guardião")) {

            atributos[VIDA][TOTAL] = 100;

            atributos[RESILIENCIA][TOTAL] = 10;

            atributos[FE][TOTAL] = 10;

            atributos[AGILIDADE][TOTAL] = 10;

            if (classe == 1) {

                atributos[FORCA][TOTAL] = 2;

                atributos[ASTUCIA][TOTAL] = 10;

            } else {

                atributos[FORCA][TOTAL] = 10;

                atributos[ASTUCIA][TOTAL] = 2;

            }

            atributos[VIDA][ATUAL] = atributos[VIDA][TOTAL];

            atributos[RESILIENCIA][ATUAL] = atributos[RESILIENCIA][TOTAL];

            atributos[FE][ATUAL] = atributos[FE][TOTAL];

            atributos[AGILIDADE][ATUAL] = atributos[AGILIDADE][TOTAL];

            atributos[FORCA][ATUAL] = atributos[FORCA][TOTAL];

            atributos[ASTUCIA][ATUAL] = atributos[ASTUCIA][TOTAL];

        } else if (personagemNome.equals("Demônio Inferior")) {

            atributos[VIDA][TOTAL] = 70;

            atributos[RESILIENCIA][TOTAL] = 10;

            atributos[FE][TOTAL] = 10;

            atributos[AGILIDADE][TOTAL] = 10;

            atributos[FORCA][TOTAL] = 15;

            atributos[ASTUCIA][TOTAL] = 15;

            atributos[VIDA][ATUAL] = atributos[VIDA][TOTAL];

            atributos[RESILIENCIA][ATUAL] = atributos[RESILIENCIA][TOTAL];

            atributos[FE][ATUAL] = atributos[FE][TOTAL];

            atributos[AGILIDADE][ATUAL] = atributos[AGILIDADE][TOTAL];

            atributos[FORCA][ATUAL] = atributos[FORCA][TOTAL];

            atributos[ASTUCIA][ATUAL] = atributos[ASTUCIA][TOTAL];

        } else if (personagemNome.equals("Demônio Herege")) {

            atributos[VIDA][TOTAL] = 80;

            atributos[RESILIENCIA][TOTAL] = 20;

            atributos[FE][TOTAL] = 20;

            atributos[AGILIDADE][TOTAL] = 20;

            atributos[FORCA][TOTAL] = 20;

            atributos[ASTUCIA][TOTAL] = 20;

            atributos[VIDA][ATUAL] = atributos[VIDA][TOTAL];

            atributos[RESILIENCIA][ATUAL] = atributos[RESILIENCIA][TOTAL];

            atributos[FE][ATUAL] = atributos[FE][TOTAL];

            atributos[AGILIDADE][ATUAL] = atributos[AGILIDADE][TOTAL];

            atributos[FORCA][ATUAL] = atributos[FORCA][TOTAL];

            atributos[ASTUCIA][ATUAL] = atributos[ASTUCIA][TOTAL];

        } else if (personagemNome.equals("Demônio Superior")) {

            atributos[VIDA][TOTAL] = 90;

            atributos[RESILIENCIA][TOTAL] = 25;

            atributos[FE][TOTAL] = 25;

            atributos[AGILIDADE][TOTAL] = 20;

            atributos[FORCA][TOTAL] = 20;

            atributos[ASTUCIA][TOTAL] = 20;

            atributos[VIDA][ATUAL] = atributos[VIDA][TOTAL];

            atributos[RESILIENCIA][ATUAL] = atributos[RESILIENCIA][TOTAL];

            atributos[FE][ATUAL] = atributos[FE][TOTAL];

            atributos[AGILIDADE][ATUAL] = atributos[AGILIDADE][TOTAL];

            atributos[FORCA][ATUAL] = atributos[FORCA][TOTAL];

            atributos[ASTUCIA][ATUAL] = atributos[ASTUCIA][TOTAL];

        } else if (personagemNome.equals("Valefar")) {

            atributos[VIDA][TOTAL] = 120;

            atributos[RESILIENCIA][TOTAL] = 25;

            atributos[FE][TOTAL] = 25;

            atributos[AGILIDADE][TOTAL] = 20;

            atributos[FORCA][TOTAL] = 20;

            atributos[ASTUCIA][TOTAL] = 20;

            atributos[VIDA][ATUAL] = atributos[VIDA][TOTAL];

            atributos[RESILIENCIA][ATUAL] = atributos[RESILIENCIA][TOTAL];

            atributos[FE][ATUAL] = atributos[FE][TOTAL];

            atributos[AGILIDADE][ATUAL] = atributos[AGILIDADE][TOTAL];

            atributos[FORCA][ATUAL] = atributos[FORCA][TOTAL];

            atributos[ASTUCIA][ATUAL] = atributos[ASTUCIA][TOTAL];

        }

    }

    // Inicializa a definição e os atributos das habilidades do personagem cujo nome
    // foi enviado pelo parâmetro.
    public static void habilidadesInicia(String personagemNome, String[][][] habilidadesDefinicao,
            int[][][] habilidadesAtributos) {

        // Uso de Constantes para evitar de digitação na hora da criação de habilidades
        // Efeitos de habilidades de ataques
        final String SEM_EFEITOS = "Sem Efeitos";

        final String SAGACIDADE = "Sagacidade;";

        final String QUEIMADURAS = "Queimaduras";

        final String ENVENENAMENTO = "Envenenamento";

        final String ESCUDO = "Escudo";

        final String CURA = "Cura";

        final String DEBUFF = "Debuff";

        final String CONTRA_ATAQUE = "Contra-Ataque";

        final String DESVIAR = "Desviar";

        // Verifica qual personagem foi passado pelo parâmetro
        switch (personagemNome) {

        case "Guardião":

            if (classe == 1) {

                // Ataque - Habilidade 1 Astúcia > Agilidade
                habilidadesDefinicao[ATAQUE][HABILIDADE_1][NOME] = "Singularidade";

                habilidadesDefinicao[ATAQUE][HABILIDADE_1][DESCRICAO] = "conjura raios de luz e concentra em um único ponto de seu inimigo, a fim de causar um dano massivo";

                habilidadesAtributos[ATAQUE][HABILIDADE_1][PODER] = 5 + 3 * gAtributos[ASTUCIA][ATUAL]
                        + 1 * gAtributos[AGILIDADE][ATUAL];

                habilidadesDefinicao[ATAQUE][HABILIDADE_1][EFEITO] = SEM_EFEITOS;

                habilidadesAtributos[ATAQUE][HABILIDADE_1][EFEITO_CHANCE] = 0;

                // Ataque - Habilidade 2 Agilidade > Astúcia
                habilidadesDefinicao[ATAQUE][HABILIDADE_2][NOME] = "Subterfúgio Celestial";

                habilidadesDefinicao[ATAQUE][HABILIDADE_2][DESCRICAO] = "conjura uma ilusão de sua própria imagem, para destrair seu inimigo e desferir um golpe mais preciso";

                habilidadesAtributos[ATAQUE][HABILIDADE_2][PODER] = 5 + 1 * gAtributos[ASTUCIA][ATUAL]
                        + 3 * gAtributos[ASTUCIA][ATUAL];

                habilidadesDefinicao[ATAQUE][HABILIDADE_2][EFEITO] = SAGACIDADE;

                habilidadesAtributos[ATAQUE][HABILIDADE_2][EFEITO_CHANCE] = 30 + 1 * gAtributos[ASTUCIA][ATUAL]
                        + 3 * gAtributos[ASTUCIA][ATUAL];

                // Ataque - Habilidade 3 Agilidade = Astúcia
                habilidadesDefinicao[ATAQUE][HABILIDADE_3][NOME] = "Feixes Divino";

                habilidadesDefinicao[ATAQUE][HABILIDADE_3][DESCRICAO] = "lança feixes de luz nos olhos de seu inimigo";

                habilidadesAtributos[ATAQUE][HABILIDADE_3][PODER] = 5 + 2 * gAtributos[ASTUCIA][ATUAL]
                        + 2 * gAtributos[ASTUCIA][ATUAL];

                habilidadesDefinicao[ATAQUE][HABILIDADE_3][EFEITO] = QUEIMADURAS;

                habilidadesAtributos[ATAQUE][HABILIDADE_3][EFEITO_CHANCE] = 10 + 2 * gAtributos[ASTUCIA][ATUAL]
                        + 2 * gAtributos[ASTUCIA][ATUAL];

                // Defesa - Habilidade 1 Agilidade > Astúcia
                habilidadesDefinicao[DEFESA][HABILIDADE_1][NOME] = "Teleporte";

                habilidadesDefinicao[DEFESA][HABILIDADE_1][DESCRICAO] = "tenta se teletransportar para longe do ataque inimigo";

                habilidadesAtributos[DEFESA][HABILIDADE_1][PODER] = 0;

                habilidadesDefinicao[DEFESA][HABILIDADE_1][EFEITO] = DESVIAR;

                habilidadesAtributos[DEFESA][HABILIDADE_1][EFEITO_CHANCE] = 30 + 3 * gAtributos[AGILIDADE][ATUAL]
                        + 1 * gAtributos[ASTUCIA][ATUAL];

                // Defesa - Habilidade 2 Astúcia = Agilidade
                habilidadesDefinicao[DEFESA][HABILIDADE_2][NOME] = "Reflexão";

                habilidadesDefinicao[DEFESA][HABILIDADE_2][DESCRICAO] = "tenta criar uma barreira mágica que retorna parte do dano recebido";

                habilidadesAtributos[DEFESA][HABILIDADE_2][PODER] = 10 + 5 * gAtributos[ASTUCIA][ATUAL]
                        + 2 * gAtributos[ASTUCIA][ATUAL];

                habilidadesDefinicao[DEFESA][HABILIDADE_2][EFEITO] = CONTRA_ATAQUE;

                habilidadesAtributos[DEFESA][HABILIDADE_2][EFEITO_CHANCE] = 30 + 2 * gAtributos[ASTUCIA][ATUAL]
                        + 2 * gAtributos[ASTUCIA][ATUAL];

                // Barreira de Luz Astúcia > Agilidade
                habilidadesDefinicao[DEFESA][HABILIDADE_3][NOME] = "Barreia de Luz";

                habilidadesDefinicao[DEFESA][HABILIDADE_3][DESCRICAO] = "cria uma barreira de luz que desintrega magia";

                habilidadesAtributos[DEFESA][HABILIDADE_3][PODER] = 10 + 2 * gAtributos[ASTUCIA][ATUAL]
                        + 2 * gAtributos[ASTUCIA][ATUAL];

                habilidadesDefinicao[DEFESA][HABILIDADE_3][EFEITO] = ESCUDO;

                habilidadesAtributos[DEFESA][HABILIDADE_3][EFEITO_CHANCE] = 100;

            } else if (classe == 2) {

                //// Defesa - Habilidade 1 Força > agilidade
                habilidadesDefinicao[ATAQUE][HABILIDADE_1][NOME] = "Investida";

                habilidadesDefinicao[ATAQUE][HABILIDADE_1][DESCRICAO] = "avança em direção ao inimigo com toda a força de seu corpo para causar um dano massivo";

                habilidadesAtributos[ATAQUE][HABILIDADE_1][PODER] = 10 + 3 * gAtributos[ASTUCIA][ATUAL]
                        + 1 * gAtributos[AGILIDADE][ATUAL];

                habilidadesDefinicao[ATAQUE][HABILIDADE_1][EFEITO] = SEM_EFEITOS;

                habilidadesAtributos[ATAQUE][HABILIDADE_1][EFEITO_CHANCE] = 0;

                //// Defesa - Habilidade 2 agilidade > Força
                habilidadesDefinicao[ATAQUE][HABILIDADE_2][NOME] = "Zéfiro Mortal";

                habilidadesDefinicao[ATAQUE][HABILIDADE_2][DESCRICAO] = "usa a agilidade de seu corpo para esquivar de seu oponente e causar dano";

                habilidadesAtributos[ATAQUE][HABILIDADE_2][PODER] = 1 * gAtributos[ASTUCIA][ATUAL]
                        + 3 * gAtributos[AGILIDADE][ATUAL];

                habilidadesDefinicao[ATAQUE][HABILIDADE_2][EFEITO] = SAGACIDADE;

                habilidadesAtributos[ATAQUE][HABILIDADE_2][EFEITO_CHANCE] = 30 + 1 * gAtributos[ASTUCIA][ATUAL]
                        + 3 * gAtributos[AGILIDADE][ATUAL];

                // Ataque - Habilidade 3 agilidade = Força
                habilidadesDefinicao[ATAQUE][HABILIDADE_3][NOME] = "Sabre da Serpente";

                habilidadesDefinicao[ATAQUE][HABILIDADE_3][DESCRICAO] = "envenena sua lâmina e desfere um golpe preciso";

                habilidadesAtributos[ATAQUE][HABILIDADE_3][PODER] = 0;

                habilidadesDefinicao[ATAQUE][HABILIDADE_3][EFEITO] = ENVENENAMENTO;

                habilidadesAtributos[ATAQUE][HABILIDADE_3][EFEITO_CHANCE] = 10 + 2 * gAtributos[ASTUCIA][ATUAL]
                        + 2 * gAtributos[ASTUCIA][ATUAL];

                // Defesa - Habilidade 1 Agilidade = Força
                habilidadesDefinicao[DEFESA][HABILIDADE_1][NOME] = "Aparar";

                habilidadesDefinicao[DEFESA][HABILIDADE_1][DESCRICAO] = "apara o golpe de seu oponente e contra-ataca rapidamente com sua espada";

                habilidadesAtributos[DEFESA][HABILIDADE_1][PODER] = 5 + 2 * gAtributos[AGILIDADE][ATUAL]
                        + 2 * gAtributos[FORCA][ATUAL];
                ;

                habilidadesDefinicao[DEFESA][HABILIDADE_1][EFEITO] = CONTRA_ATAQUE;

                habilidadesAtributos[DEFESA][HABILIDADE_1][EFEITO_CHANCE] = 50 + 2 * gAtributos[AGILIDADE][ATUAL]
                        + 2 * gAtributos[FORCA][ATUAL];

                // Defesa - Habilidade 2 Força > Agilidade
                habilidadesDefinicao[DEFESA][HABILIDADE_2][NOME] = "Escudo Dourado de Salomão";

                habilidadesDefinicao[DEFESA][HABILIDADE_2][DESCRICAO] = "usa seu escudo divino que protege de ataques inimigo";

                habilidadesAtributos[DEFESA][HABILIDADE_2][PODER] = 10 + 3 * gAtributos[FORCA][ATUAL]
                        + 1 * gAtributos[AGILIDADE][ATUAL];

                habilidadesDefinicao[DEFESA][HABILIDADE_2][EFEITO] = ESCUDO;

                habilidadesAtributos[DEFESA][HABILIDADE_2][EFEITO_CHANCE] = 100;

                // Defesa - Habilidade 3 Agilidade > Força
                habilidadesDefinicao[DEFESA][HABILIDADE_3][NOME] = "Zéfiro Angelical";

                habilidadesDefinicao[DEFESA][HABILIDADE_3][DESCRICAO] = "se torna ágil e leve como o vento conseguindo desviar de ataques inimigos";

                habilidadesAtributos[DEFESA][HABILIDADE_3][PODER] = 0;

                habilidadesDefinicao[DEFESA][HABILIDADE_3][EFEITO] = DESVIAR;

                habilidadesAtributos[DEFESA][HABILIDADE_3][EFEITO_CHANCE] = 50 + 3 * gAtributos[AGILIDADE][ATUAL]
                        + gAtributos[FORCA][ATUAL];

            }

            break;

        case "Demônio Inferior":

            // Ataque - Habilidade 1
            habilidadesDefinicao[ATAQUE][HABILIDADE_1][NOME] = "Ataque Infernal";

            habilidadesDefinicao[ATAQUE][HABILIDADE_1][DESCRICAO] = "acende as chamas de sua espada e desfere um golpe mortal";

            habilidadesAtributos[ATAQUE][HABILIDADE_1][PODER] = 10;

            habilidadesDefinicao[ATAQUE][HABILIDADE_1][EFEITO] = "Queimaduras";

            habilidadesAtributos[ATAQUE][HABILIDADE_1][EFEITO_CHANCE] = 50;

            // Ataque - Habilidade 2
            habilidadesDefinicao[ATAQUE][HABILIDADE_2][NOME] = "Ataque demoníaco";

            habilidadesDefinicao[ATAQUE][HABILIDADE_2][DESCRICAO] = "faz chamas negras saírem de seu corpo e avança em sua direção";

            habilidadesAtributos[ATAQUE][HABILIDADE_2][PODER] = 10;

            habilidadesDefinicao[ATAQUE][HABILIDADE_2][EFEITO] = "Envenenamento";

            habilidadesAtributos[ATAQUE][HABILIDADE_2][EFEITO_CHANCE] = 50;

            // Ataque - Habilidade 3
            habilidadesAtributos[ATAQUE][HABILIDADE_2][EFEITO_CHANCE] = 30;

            habilidadesDefinicao[ATAQUE][HABILIDADE_3][NOME] = "bola de fogo";

            habilidadesDefinicao[ATAQUE][HABILIDADE_2][DESCRICAO] = "conjura e lança bolas de fogo";

            habilidadesAtributos[ATAQUE][HABILIDADE_3][PODER] = 10;

            habilidadesDefinicao[ATAQUE][HABILIDADE_3][EFEITO] = "Queimaduras";

            habilidadesAtributos[ATAQUE][HABILIDADE_3][EFEITO_CHANCE] = 50;

            // Defesa - Habilidade 1
            habilidadesDefinicao[DEFESA][HABILIDADE_1][NOME] = "Labaredas de fogo infernais";

            habilidadesDefinicao[DEFESA][HABILIDADE_1][DESCRICAO] = "ascende labaredas de fogo infernais envolta de si mesmo e devolve parte do dano a quem a ataca";

            habilidadesAtributos[DEFESA][HABILIDADE_1][PODER] = 0;

            habilidadesDefinicao[DEFESA][HABILIDADE_1][EFEITO] = "Contra-Ataque";

            habilidadesAtributos[DEFESA][HABILIDADE_1][EFEITO_CHANCE] = 50;

            // Defesa - Habilidade 2
            habilidadesDefinicao[DEFESA][HABILIDADE_2][NOME] = "Carapaça demoníaca";

            habilidadesDefinicao[DEFESA][HABILIDADE_2][DESCRICAO] = "se defende de ataques com sua carapaça";

            habilidadesAtributos[DEFESA][HABILIDADE_2][PODER] = 10;

            habilidadesDefinicao[DEFESA][HABILIDADE_2][EFEITO] = "Escudo";

            habilidadesAtributos[DEFESA][HABILIDADE_2][EFEITO_CHANCE] = 100;

            // Defesa - Habilidade 3
            habilidadesDefinicao[DEFESA][HABILIDADE_3][NOME] = "Asas de Lúcifer";

            habilidadesDefinicao[DEFESA][HABILIDADE_3][DESCRICAO] = "voa o mais longe possível de seu ataque";

            habilidadesAtributos[DEFESA][HABILIDADE_3][PODER] = 0;

            habilidadesDefinicao[DEFESA][HABILIDADE_3][EFEITO] = "Desviar";

            habilidadesAtributos[DEFESA][HABILIDADE_3][EFEITO_CHANCE] = 60;

            break;

        case "Demônio Herege":

            // Ataque - Habilidade 1
            habilidadesDefinicao[ATAQUE][HABILIDADE_1][NOME] = "Corrente de Andrômeda";

            habilidadesDefinicao[ATAQUE][HABILIDADE_1][DESCRICAO] = "usa uma corrente mágica para tentar prender seu alvo e causar um dano massivo";

            habilidadesAtributos[ATAQUE][HABILIDADE_1][PODER] = 15;

            habilidadesDefinicao[ATAQUE][HABILIDADE_1][EFEITO] = "Sagacidade e Queimaduras";

            habilidadesAtributos[ATAQUE][HABILIDADE_1][EFEITO_CHANCE] = 100;

            // Ataque - Habilidade 2
            habilidadesDefinicao[ATAQUE][HABILIDADE_2][NOME] = "Espiral de Andrômeda";

            habilidadesDefinicao[ATAQUE][HABILIDADE_2][DESCRICAO] = "invoca um espiral de fogo em direção ao seu alvo";

            habilidadesAtributos[ATAQUE][HABILIDADE_2][PODER] = 15;

            habilidadesDefinicao[ATAQUE][HABILIDADE_2][EFEITO] = "Queimaduras";

            habilidadesAtributos[ATAQUE][HABILIDADE_2][EFEITO_CHANCE] = 100;

            // Ataque - Habilidade 3
            habilidadesAtributos[ATAQUE][HABILIDADE_2][EFEITO_CHANCE] = 30;

            habilidadesDefinicao[ATAQUE][HABILIDADE_3][NOME] = "Bumerangue de Andrômeda";

            habilidadesDefinicao[ATAQUE][HABILIDADE_2][DESCRICAO] = "lança um boomerange mágico ";

            habilidadesAtributos[ATAQUE][HABILIDADE_3][PODER] = 15;

            habilidadesDefinicao[ATAQUE][HABILIDADE_3][EFEITO] = "Queimaduras";

            habilidadesAtributos[ATAQUE][HABILIDADE_3][EFEITO_CHANCE] = 100;

            // Defesa - Habilidade 1
            habilidadesDefinicao[DEFESA][HABILIDADE_1][NOME] = "Rendeçao Infernal";

            habilidadesDefinicao[DEFESA][HABILIDADE_1][DESCRICAO] = "Se cura e restaura seus atributos";

            habilidadesAtributos[DEFESA][HABILIDADE_1][PODER] = 20;

            habilidadesDefinicao[DEFESA][HABILIDADE_1][EFEITO] = "Debuff e Cura";

            habilidadesAtributos[DEFESA][HABILIDADE_1][EFEITO_CHANCE] = 100;

            // Defesa - Habilidade 2
            habilidadesDefinicao[DEFESA][HABILIDADE_2][NOME] = "Defesa Circular";

            habilidadesDefinicao[DEFESA][HABILIDADE_2][DESCRICAO] = "se defende de ataques físicos com sua carapaça";

            habilidadesAtributos[DEFESA][HABILIDADE_2][PODER] = 10;

            habilidadesDefinicao[DEFESA][HABILIDADE_2][EFEITO] = "Escudo";

            habilidadesAtributos[DEFESA][HABILIDADE_2][EFEITO_CHANCE] = 10;

            // Defesa - Habilidade 3
            habilidadesDefinicao[DEFESA][HABILIDADE_3][NOME] = "Grande Captura de Andrômeda";

            habilidadesDefinicao[DEFESA][HABILIDADE_3][DESCRICAO] = "invoca uma armadilha mágica enfraquece e causa danos e paralisa quem o ataca, conseguindo desviar facilmente";

            habilidadesAtributos[DEFESA][HABILIDADE_3][PODER] = 20;

            habilidadesDefinicao[DEFESA][HABILIDADE_3][EFEITO] = "Contra-Ataque e Desviar";

            habilidadesAtributos[DEFESA][HABILIDADE_3][EFEITO_CHANCE] = 70;

            break;

        case "Demônio Superior":

            // Ataque - Habilidade 1
            habilidadesDefinicao[ATAQUE][HABILIDADE_1][NOME] = "Cólera dos Mil Demônios";

            habilidadesDefinicao[ATAQUE][HABILIDADE_1][DESCRICAO] = "infecta o ar com uma fumaça negra, que queima e envenena seus alvos, para se camuflar e atacar seu oponente de surpresa";

            habilidadesAtributos[ATAQUE][HABILIDADE_1][PODER] = 20;

            habilidadesDefinicao[ATAQUE][HABILIDADE_1][EFEITO] = "Queimaduras, Envenenamento e Sagacidade";

            habilidadesAtributos[ATAQUE][HABILIDADE_1][EFEITO_CHANCE] = 60;

            // Ataque - Habilidade 2
            habilidadesDefinicao[ATAQUE][HABILIDADE_2][NOME] = "Sacramento da morte";

            habilidadesDefinicao[ATAQUE][HABILIDADE_2][DESCRICAO] = "desfere um golpe com sua foice";

            habilidadesAtributos[ATAQUE][HABILIDADE_2][PODER] = 20;

            habilidadesDefinicao[ATAQUE][HABILIDADE_2][EFEITO] = "Envenenamento";

            habilidadesAtributos[ATAQUE][HABILIDADE_2][EFEITO_CHANCE] = 30;

            // Ataque - Habilidade 3
            habilidadesDefinicao[ATAQUE][HABILIDADE_3][NOME] = "Tempestade Nebulosa";

            habilidadesDefinicao[ATAQUE][HABILIDADE_2][DESCRICAO] = "invoca uma tempestade ácida que queima seus oponentes";

            habilidadesAtributos[ATAQUE][HABILIDADE_3][PODER] = 20;

            habilidadesDefinicao[ATAQUE][HABILIDADE_3][EFEITO] = "Queimaduras";

            habilidadesAtributos[ATAQUE][HABILIDADE_3][EFEITO_CHANCE] = 30;

            // Defesa - Habilidade 1
            habilidadesDefinicao[DEFESA][HABILIDADE_1][NOME] = "Benção Demoníaca";

            habilidadesDefinicao[DEFESA][HABILIDADE_1][DESCRICAO] = "invoca a benção dos demônios para se curar e restaurar suas defesas";

            habilidadesAtributos[DEFESA][HABILIDADE_1][PODER] = 20;

            habilidadesDefinicao[DEFESA][HABILIDADE_1][EFEITO] = "Cura e Debuff";

            habilidadesAtributos[DEFESA][HABILIDADE_1][EFEITO_CHANCE] = 50;

            // Defesa - Habilidade 2
            habilidadesDefinicao[DEFESA][HABILIDADE_2][NOME] = "Couraça Infernal";

            habilidadesDefinicao[DEFESA][HABILIDADE_2][DESCRICAO] = "se defende de ataques físicos com sua carapaça";

            habilidadesAtributos[DEFESA][HABILIDADE_2][PODER] = 30;

            habilidadesDefinicao[DEFESA][HABILIDADE_2][EFEITO] = "Escudo";

            habilidadesAtributos[DEFESA][HABILIDADE_2][EFEITO_CHANCE] = 10;

            // Defesa - Habilidade 3
            habilidadesDefinicao[DEFESA][HABILIDADE_3][NOME] = "Asas Demoníaca";

            habilidadesDefinicao[DEFESA][HABILIDADE_3][DESCRICAO] = "voa o mais longe possível de seu ataque";

            habilidadesAtributos[DEFESA][HABILIDADE_3][PODER] = 30;

            habilidadesDefinicao[DEFESA][HABILIDADE_3][EFEITO] = "Desviar";

            habilidadesAtributos[DEFESA][HABILIDADE_3][EFEITO_CHANCE] = 10;

            break;

        case "Valefar":

            // Ataque - Habilidade 1
            habilidadesDefinicao[ATAQUE][HABILIDADE_1][NOME] = "Esfera da morte";

            habilidadesDefinicao[ATAQUE][HABILIDADE_1][DESCRICAO] = "invoca uma esfera que enfraquece tudo que se aproxima";

            habilidadesAtributos[ATAQUE][HABILIDADE_1][PODER] = 25;

            habilidadesDefinicao[ATAQUE][HABILIDADE_1][EFEITO] = "Queimaduras e Envenenamento";

            habilidadesAtributos[ATAQUE][HABILIDADE_1][EFEITO_CHANCE] = 30;

            // Ataque - Habilidade 2
            habilidadesDefinicao[ATAQUE][HABILIDADE_2][NOME] = "Sopro de Dragão";

            habilidadesDefinicao[ATAQUE][HABILIDADE_2][DESCRICAO] = "envenena o ar com uma nuvem tóxica";

            habilidadesAtributos[ATAQUE][HABILIDADE_2][PODER] = 25;

            habilidadesDefinicao[ATAQUE][HABILIDADE_2][EFEITO] = "Queimaduras e Sagacidade";

            habilidadesAtributos[ATAQUE][HABILIDADE_2][EFEITO_CHANCE] = 100;

            // Ataque - Habilidade 3
            habilidadesDefinicao[ATAQUE][HABILIDADE_3][NOME] = "bola de fogo";

            habilidadesDefinicao[ATAQUE][HABILIDADE_2][DESCRICAO] = "conjura e lança bolas de fogo";

            habilidadesAtributos[ATAQUE][HABILIDADE_3][PODER] = 25;

            habilidadesDefinicao[ATAQUE][HABILIDADE_3][EFEITO] = "Queimaduras";

            habilidadesAtributos[ATAQUE][HABILIDADE_3][EFEITO_CHANCE] = 30;

            // Defesa - Habilidade 1
            habilidadesDefinicao[DEFESA][HABILIDADE_1][NOME] = "";

            habilidadesDefinicao[DEFESA][HABILIDADE_1][DESCRICAO] = "invoca uma barreira elétrica ";

            habilidadesAtributos[DEFESA][HABILIDADE_1][PODER] = 100;

            habilidadesDefinicao[DEFESA][HABILIDADE_1][EFEITO] = "Contra-Ataque";

            habilidadesAtributos[DEFESA][HABILIDADE_1][EFEITO_CHANCE] = 10;

            // Defesa - Habilidade 2
            habilidadesDefinicao[DEFESA][HABILIDADE_2][NOME] = "Couraça dos Dragões";

            habilidadesDefinicao[DEFESA][HABILIDADE_2][DESCRICAO] = "se defende com sua couraça";

            habilidadesAtributos[DEFESA][HABILIDADE_2][PODER] = 50;

            habilidadesDefinicao[DEFESA][HABILIDADE_2][EFEITO] = "Escudo";

            habilidadesAtributos[DEFESA][HABILIDADE_2][EFEITO_CHANCE] = 10;

            // Defesa - Habilidade 3
            habilidadesDefinicao[DEFESA][HABILIDADE_3][NOME] = "Asas de Dragão";

            habilidadesDefinicao[DEFESA][HABILIDADE_3][DESCRICAO] = "voa o mais longe possível de seu ataque";

            habilidadesAtributos[DEFESA][HABILIDADE_3][PODER] = 10;

            habilidadesDefinicao[DEFESA][HABILIDADE_3][EFEITO] = "Desviar";

            habilidadesAtributos[DEFESA][HABILIDADE_3][EFEITO_CHANCE] = 10;

            break;

        default:

            break;

        }

    }

    // --------------------------------------------------
    public static void combate(String inimigoNome) {

        menuAberto = true;

        int[][] inimigoAtributos = new int[6][2];

        String[][][] inimigoHabilidadesDefinicao = new String[2][3][4];

        int[][][] inimigoHabilidadesAtributos = new int[2][3][6];

        atributosInicia(inimigoNome, inimigoAtributos);

        habilidadesInicia(inimigoNome, inimigoHabilidadesDefinicao, inimigoHabilidadesAtributos);

        printTexto(informacoesInimigo(inimigoNome, inimigoAtributos), "Você iniciou uma batalha com " + inimigoNome);

        do {

            ataque(nome, inimigoNome, inimigoAtributos, inimigoHabilidadesDefinicao, inimigoHabilidadesAtributos);

            if ((gAtributos[VIDA][ATUAL] > 0) && (inimigoAtributos[VIDA][ATUAL] > 0)) {

                ataque(inimigoNome, inimigoNome, inimigoAtributos, inimigoHabilidadesDefinicao,
                        inimigoHabilidadesAtributos);

            }

        } while ((gAtributos[VIDA][ATUAL] > 0) && (inimigoAtributos[VIDA][ATUAL] > 0));

        if (gAtributos[VIDA][ATUAL] <= 0) {

            printTexto(informacoesInimigo(inimigoNome, inimigoAtributos), "Você morreu");

        } else {

            printTexto(informacoesInimigo(inimigoNome, inimigoAtributos),
                    "Você desferiu um golpe mortal em " + inimigoNome);

        }

        menuAberto = false;

    }

    public static void ataque(String atacante, String inimigoNome, int[][] inimigoAtributos,
            String[][][] habilidadesDefinicao, int[][][] habilidadesAtributos) {

        int escolhaAtaque;

        String efeitoAtaque;

        int dano;

        // boolean para determinar o sucesso dos efeitos das habilidades de ataque;
        boolean efeitoAtaqueSucesso;

        // Boolean para determinar se o defensor consiguirá de defender;
        boolean defesa = true;

        // Atributos do personagem que está atacando.
        int[][] atacanteAtributos;

        int[][][] atacanteHabAtr;

        String[][][] atacanteHabDef;

        // Atributos do personagem que está defendendo.
        String defensor = inimigoNome;

        int[][] defensorAtributos;

        int[][][] defensorHabAtributos;

        String[][][] defensorHabDefinicao;

        // Verifica qual personagem está atacando (O jogador ou um inimigo) e inicializa
        // os atributos.
        if (atacante.equals(nome)) {

            // Inicializa os valores caso seja a vez de atacar do usuário.
            atacanteAtributos = gAtributos;

            atacanteHabDef = gHabilidadeDefinicao;

            atacanteHabAtr = gHabilidadeAtributos;

            defensorAtributos = inimigoAtributos;

            defensorHabDefinicao = habilidadesDefinicao;

            defensorHabAtributos = habilidadesAtributos;

            // Mostra as opções de Habilidades de Ataque do usuário e permite a escolha de
            // uma.
            printOpcoes(informacoesInimigo(inimigoNome, inimigoAtributos),
                    "Você pode usar as seguintes habilidades para atacar \n" + "     1.   "
                            + atacanteHabDef[ATAQUE][HABILIDADE_1][NOME] + "\n" + "     2.   "
                            + atacanteHabDef[ATAQUE][HABILIDADE_2][NOME] + "\n" + "     3.   "
                            + atacanteHabDef[ATAQUE][HABILIDADE_3][NOME]);

            escolhaAtaque = recebeInteiro(3) - 1;

        } else {

            // Inicializa os valores caso seja a vez de atacar do Inimigo.
            atacanteAtributos = inimigoAtributos;

            atacanteHabDef = habilidadesDefinicao;

            atacanteHabAtr = habilidadesAtributos;

            defensor = nome;

            defensorAtributos = gAtributos;

            defensorHabDefinicao = gHabilidadeDefinicao;

            defensorHabAtributos = atacanteHabAtr;

            // Escolha automática de uma habilidade para o inimigo.
            escolhaAtaque = (int) (Math.random() * 2);

        }

        // Verifica o dano total que o personagem atacante consiguirá causar no inimigo.
        // (O dano pode ser menor caso o defensor realize a defesa.
        dano = atacanteHabAtr[ATAQUE][escolhaAtaque][PODER];

        // Efeito da habilidade do atacante.
        efeitoAtaque = atacanteHabDef[ATAQUE][escolhaAtaque][EFEITO];

        // Verifica se o atacante conseguiu aplicar os efeitos de suas habilidades
        efeitoAtaqueSucesso = atacanteHabAtr[ATAQUE][escolhaAtaque][EFEITO_CHANCE] >= Math.round(Math.random() * 100);

        // Imprime o texto de combate da habilidade escolhida.
        printTexto(informacoesInimigo(inimigoNome, inimigoAtributos),
                atacante + " " + atacanteHabDef[ATAQUE][escolhaAtaque][DESCRICAO]);

        // Verifica se a habilidade escolhida possui o efeito [Sagacidade]
        // Esse efeito é o único analisado antes da defesa do Defensor
        // Os outros efeitos são aplicados "junto ao Dano".
        // Caso o atacante consiga aplicar esse efeito com sucesso, o defensor não
        // consegue se defender
        if (efeitoAtaque.contains("Sagacidade")) {

            if (efeitoAtaqueSucesso) {

                printTexto(defensor + " não preve os ataque de " + atacante + " a tempo e não consegue se defender");

                if (defensorAtributos[VIDA][ATUAL] > dano) {

                    defensorAtributos[VIDA][ATUAL] -= dano;

                } else {

                    defensorAtributos[VIDA][ATUAL] = 0;

                }

                printTexto(informacoesInimigo(inimigoNome, inimigoAtributos),
                        atacante + " causou " + dano + " de dano à " + defensor);

                defesa = false;

            } else {

                printTexto(inimigoNome + " percebe seus planos e consegue se planejar a tempo");

            }

        }

        // Defesa do defensor -----
        if (defesa) {

            int escolhaDefesa;

            String efeitoDefesa;

            boolean efeitoDefesaSucesso;

            // Verifica de quem é a vez de realizar a defesa (Do jogador ou do inimigo)
            if (atacante.equals(inimigoNome)) {

                // Caso seja a vez do jogador de se defender, imprime as opções de Habilidades
                // de Defesa e permite a escolha de uma.
                printOpcoes(informacoesInimigo(inimigoNome, inimigoAtributos),
                        "Você tenta se defender \n" + "     1.   " + defensorHabDefinicao[DEFESA][HABILIDADE_1][NOME]
                                + "\n" + "     2.   " + defensorHabDefinicao[DEFESA][HABILIDADE_2][NOME] + "\n"
                                + "     3.   " + defensorHabDefinicao[DEFESA][HABILIDADE_3][NOME]);

                escolhaDefesa = recebeInteiro(3) - 1;

            } else {

                // Escolha automática de uma habilidade para o inimigo.
                escolhaDefesa = (int) (Math.random() * 2);

            }

            // Imprime o texto de combate da Habilidade de defesa.
            printTexto(informacoesInimigo(inimigoNome, inimigoAtributos),
                    defensor + " " + defensorHabDefinicao[DEFESA][escolhaDefesa][DESCRICAO]);

            // Efeito da habilidade do Defensor.
            efeitoDefesa = defensorHabDefinicao[DEFESA][escolhaDefesa][EFEITO];

            // Verifica se o defensor conseguiu aplicar os efeitos de suas habilidades.
            efeitoDefesaSucesso = defensorHabAtributos[DEFESA][escolhaDefesa][EFEITO_CHANCE] >= Math
                    .round(Math.random() * 100);

            // Verifica se a habilidade escolhida possui o efeito [Cura]
            // Caso o Defensor consiga aplicar esse efeito com sucesso, parte de sua [Vida]
            // é restaurada.
            if (efeitoDefesa.contains("Cura") && efeitoDefesaSucesso) {

                // Cura a vida do defensor
                defensorAtributos[VIDA][ATUAL] += defensorHabAtributos[DEFESA][escolhaDefesa][PODER];

                // Limita a cura até a Vida total do alvo.
                if (defensorAtributos[VIDA][ATUAL] > defensorAtributos[VIDA][TOTAL]) {

                    defensorAtributos[VIDA][ATUAL] = defensorAtributos[VIDA][TOTAL];

                }

                printTexto(informacoesInimigo(inimigoNome, inimigoAtributos), defensor + " se cura com "
                        + defensorHabAtributos[DEFESA][escolhaDefesa][PODER] + " pontos de vida");

            }

            // Verifica se a habilidade escolhida possui o efeito [Debuff]
            // Caso o Defensor consiga aplicar esse efeito com sucesso, sua [Fe] e
            // [Resiliencia] são restauradas.
            if (efeitoDefesa.contains("Debuff") && efeitoDefesaSucesso) {

                // Restaura a fé e a resiliência do Defensor
                defensorAtributos[RESILIENCIA][ATUAL] = defensorAtributos[RESILIENCIA][TOTAL];

                defensorAtributos[FE][ATUAL] = defensorAtributos[FE][TOTAL];

                printTexto(informacoesInimigo(inimigoNome, inimigoAtributos),
                        defensor + " teve sua Fé e Resiliência restauradas");

            }

            // Verifica se a habilidade escolhida possui o efeito [Contra-Ataque]
            // Caso o Defensor consiga aplicar esse efeito com sucesso, parte do dano
            // recebido é devolvido.
            if (efeitoDefesa.contains("Contra-Ataque") && efeitoDefesaSucesso) {

                dano = dano / 2;

                //
                atacanteAtributos[VIDA][ATUAL] -= dano;

                if (atacanteAtributos[VIDA][ATUAL] < 0) {

                    atacanteAtributos[VIDA][ATUAL] = 0;

                }

                printTexto(informacoesInimigo(inimigoNome, inimigoAtributos),
                        defensor + " conseguiu contra-atacar, devolvendo 50% do dano de " + atacante);

            }

            // Verifica se a habilidade escolhida possui o efeito [Escudo]
            // Caso o Defensor consiga aplicar esse efeito com sucesso, parte do dano
            // recebido é bloqueado.
            if (efeitoDefesa.contains("Escudo") && efeitoDefesaSucesso) {

                dano = dano - defensorHabAtributos[DEFESA][escolhaDefesa][PODER];

                if (dano < 0) {

                    dano = 0;

                }

                printTexto(informacoesInimigo(inimigoNome, inimigoAtributos),
                        defensor + " bloqueiou "
                                + (defensorHabAtributos[DEFESA][escolhaDefesa][PODER] * 100)
                                        / (dano + defensorHabAtributos[DEFESA][escolhaDefesa][PODER])
                                + "% do dano de " + atacante);

            }

            // Verifica se a habilidade escolhida possui o efeito [Desviar]
            // Caso o Defensor consiga aplicar esse efeito com sucesso, nenhum dano é
            // recebido.
            if (efeitoDefesa.contains("Desviar")) {

                if (efeitoDefesaSucesso) {

                    dano = 0;

                    printTexto(informacoesInimigo(inimigoNome, inimigoAtributos),
                            defensor + " desvia com sucesso das habilidades de " + atacante);

                } else {

                    printTexto(informacoesInimigo(inimigoNome, inimigoAtributos),
                            defensor + " não consegue desviar das habilidades de " + atacante);

                }

            }

            // Atualiza a vida do defensor com o dano recebido.
            if (defensorAtributos[VIDA][ATUAL] - dano > 0) {

                defensorAtributos[VIDA][ATUAL] -= dano;

            } else {

                defensorAtributos[VIDA][ATUAL] = 0;

            }

            // Verifica se algum dano foi causado e aplica o efeito da habilidade de ataque.
            if (dano > 0) {

                printTexto(informacoesInimigo(inimigoNome, inimigoAtributos),
                        atacante + " causou " + dano + " de dano a " + defensor);

                // Verifica se a habilidade escolhida possui o efeito [Queimaduras]
                // Caso o atacante consiga aplicar esse efeito com sucesso, o defensor perde
                // parter de sua [Fé] (resistência mágica)
                if (efeitoAtaque.contains("Queimaduras") && efeitoAtaqueSucesso) {

                    if (defensorAtributos[FE][ATUAL] >= 5) {

                        defensorAtributos[FE][ATUAL] -= 5;

                        printTexto(informacoesInimigo(inimigoNome, inimigoAtributos), atacante + " deixou " + defensor
                                + " em chamas\n" + defensor + " perdeu " + 5 + " de Fé");

                    } else {

                        defensorAtributos[FE][ATUAL] = 0;

                        printTexto(informacoesInimigo(inimigoNome, inimigoAtributos),
                                atacante + " deixou " + defensor + " em chamas\n" + defensor
                                        + " Perdeu toda a sua Fé e não possui mais resistência mágica.\n"
                                        + "O dano mágico de " + atacante + " está amplificado.");

                    }

                }

                // Verifica se a habilidade escolhida possui o efeito [Envenenamento]
                // Caso o atacante consiga aplicar esse efeito com sucesso, o defensor perde
                // parte de sua [Resiliência] (resistência mágica)
                if (efeitoAtaque.contains("Envenenamento") && efeitoAtaqueSucesso) {

                    if (defensorAtributos[RESILIENCIA][ATUAL] >= 5) {

                        defensorAtributos[RESILIENCIA][ATUAL] -= 5;

                        printTexto(informacoesInimigo(inimigoNome, inimigoAtributos), atacante + " envenenou "
                                + defensor + "\n" + defensor + " perdeu " + 5 + " de De Resiliência");

                    } else {

                        defensorAtributos[RESILIENCIA][ATUAL] = 0;

                        printTexto(informacoesInimigo(inimigoNome, inimigoAtributos),
                                atacante + " envenenou " + defensor + "\n" + defensor
                                        + " Perdeu toda a sua Resiliência e não possui mais resistência física.\n"
                                        + "O dano físico de " + atacante + " está amplificado.");

                    }

                }

            } else {

                printTexto(informacoesInimigo(inimigoNome, inimigoAtributos),
                        atacante + " não causou danos a " + defensor);

            }

        }

    }

    // Métodos das telas individuais
    // --------------------------------------------------------------------------------------------------------------------------------
    // Atualiza uma tela com o texto enviado para o parâmetro.
    public static void telaAtualiza(char[][] tela, String texto) {

        int posicaoNaString = 0;

        for (char[] tela1 : tela) {

            for (int j = 0; j < tela1.length; j++) {

                if (posicaoNaString < texto.length()) {

                    if (texto.charAt(posicaoNaString) == '\n') {

                        for (int m = j; m < tela1.length; m++) {

                            tela1[m] = ' ';

                        }

                        j = tela1.length;

                    } else {

                        tela1[j] = texto.charAt(posicaoNaString);

                    }

                } else {

                    tela1[j] = ' ';

                }

                posicaoNaString++;

            }

        }

    }

    // MÉTODOS DE TEXTOS PRE DEFINIDOS DAS TELAS DE JOGO
    // ---------------------------------------------------------------------------------------------------------------------
    // Exibe o menu "[E] Estatísticas do Personagem [I] Inventário " na ultima linha
    // da tela superior
    public static void telaSuperiorExibeMenu() {

        String telaSuperiorMenu = "[E] Estatísticas do Personagem       [I] Inventário ";

        for (int i = 0; i < telaSuperiorMenu.length(); i++) {

            telaSuperior[telaSuperior.length - 1][telaSuperior[0].length - telaSuperiorMenu.length() - 2
                    + i] = telaSuperiorMenu.charAt(i);

        }

    }

    // Exibe "Pressione [ENTER] para prosseguir" na ultima linha da tela inferior
    public static void telaInferiorExibeProsseguir() {

        String textoProsseguir = "Pressione [ENTER] para prosseguir.";

        for (int i = 0; i < textoProsseguir.length(); i++) {

            telaInferior[telaInferior.length - 1][i] = textoProsseguir.charAt(i);

        }

    }

    // Atualiza o texto de informações do Jogador.
    public static String informacoes() {

        String informacoes = " ";

        if (personagemIniciado) {

            String barraDeVida = "";

            int vidaPercentual = Math.round((gAtributos[VIDA][ATUAL] * 1.0f / (gAtributos[VIDA][TOTAL] * 1.0f)) * 5.0f);

            for (int i = 1; i <= 5; i++) {

                if (vidaPercentual >= i) {

                    barraDeVida += " §";

                } else {

                    barraDeVida += " -";

                }

            }

            informacoes = "\n Vida: " + gAtributos[VIDA][ATUAL] + "/" + gAtributos[VIDA][TOTAL] + "\n" + barraDeVida
                    + "\n" + "\n Resiliência: " + gAtributos[RESILIENCIA][ATUAL] + "\n Fé:          "
                    + gAtributos[FE][ATUAL] + "\n Agilidade:   " + gAtributos[AGILIDADE][ATUAL] + "\n Força:       "
                    + gAtributos[FORCA][ATUAL] + "\n Astúcia:     " + gAtributos[ASTUCIA][ATUAL];

        }

        return informacoes;

    }

    // Atualiza o texto de informações do inimigo quando em batalha.
    public static String informacoesInimigo(String inimigoNome, int[][] inimigoAtributos) {

        String informacoes;

        String barraDeVida = "";

        int vidaPercentual = Math.round((inimigoAtributos[VIDA][ATUAL] / (inimigoAtributos[VIDA][TOTAL] * 1.0f)) * 10f);

        for (int i = 1; i <= 10; i++) {

            if (vidaPercentual >= i) {

                barraDeVida += " §";

            } else {

                barraDeVida += " -";

            }

        }

        informacoes = textoCentraliza(inimigoNome, 200) + "\n"
                + textoCentraliza("Vida: "
                        + inimigoAtributos[VIDA][ATUAL] + "/" + inimigoAtributos[VIDA][TOTAL] + "  " + barraDeVida, 200)
                + "\n"
                + textoCentraliza("Res: " + inimigoAtributos[RESILIENCIA][ATUAL] + "   Fé: "
                        + inimigoAtributos[FE][ATUAL] + "   Agil: " + inimigoAtributos[AGILIDADE][ATUAL] + "   For: "
                        + inimigoAtributos[FORCA][ATUAL] + "   Ast: " + inimigoAtributos[ASTUCIA][ATUAL], 200);

        return informacoes;

    }

    // MÉTODOS DA INTERFACE
    // --------------------------------------------------------------------------------------------------------------------------------
    // inicia os valores da interface para que seja possível imprimir o jogo.
    public static void interfaceInicia() {

        telaSuperior = new char[30][200];

        telaInferior = new char[10][160];

        telaInformacoes = new char[10][39];

        linhaHorizontal = new String[3];

        telaAtualiza(telaSuperior, " ");

        telaAtualiza(telaInferior, " ");

        telaAtualiza(telaInformacoes, informacoes());

        // Constroi a linha de cima
        linhaHorizontal[0] = " ";

        for (int i = 0; i < telaSuperior[0].length; i++) {

            linhaHorizontal[0] += "_";

        }

        linhaHorizontal[0] += " ";

        // Constroi a linha central
        linhaHorizontal[1] = "|";

        for (int i = 0; i < telaInformacoes[0].length; i++) {

            linhaHorizontal[1] += "_";

        }

        linhaHorizontal[1] += "_";

        for (int i = 0; i < telaInferior[0].length; i++) {

            linhaHorizontal[1] += "_";

        }

        linhaHorizontal[1] += "|";

        // Constroi a linha inferior
        linhaHorizontal[2] = "|";

        for (int i = 0; i < telaInformacoes[0].length; i++) {

            linhaHorizontal[2] += "_";

        }

        linhaHorizontal[2] += "_";

        for (int i = 0; i < telaInferior[0].length; i++) {

            linhaHorizontal[2] += "_";

        }

        linhaHorizontal[2] += "|";

    }

    // atualiza o texto das telas Superior e Inferior com o texto enviado
    public static void interfaceAtualiza(String textoSuperior, String textoInferior) {

        telaAtualiza(telaSuperior, textoSuperior);

        telaAtualiza(telaInferior, textoInferior);

        telaAtualiza(telaInformacoes, informacoes());

        if (menuAberto) {

            telaSuperiorTextoMenu = textoSuperior;

            telaInferiorTextoMenu = textoInferior;

        } else {

            telaSuperiorTexto = textoSuperior;

            telaInferiorTexto = textoInferior;

            telaSuperiorExibeMenu();

        }

    }

    // atualiza o texto das telas Superior e Inferior com ultimo texto enviado
    public static void interfaceAtualiza() {

        if (menuAberto) {

            telaAtualiza(telaSuperior, telaSuperiorTextoMenu);

            telaAtualiza(telaInferior, telaInferiorTextoMenu);

            telaAtualiza(telaInformacoes, informacoes());

        } else {

            telaAtualiza(telaSuperior, telaSuperiorTexto);

            telaAtualiza(telaInferior, telaInferiorTexto);

            telaAtualiza(telaInformacoes, informacoes());

            telaSuperiorExibeMenu();

        }

    }

    // imprime toda a interface do jogo.
    public static void interfacePrint() {

        // Impressão dos espaços para separar um "frame" do outro.
        System.out.println(
                "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

        // Impressão da linha horizontal superior.
        System.out.println(linhaHorizontal[0]);

        // Impressão da tela Superior com as divisões horizontais.
        for (char[] telaSuperior1 : telaSuperior) {

            System.out.print("|");

            for (int j = 0; j < telaSuperior[0].length; j++) {

                System.out.print(telaSuperior1[j]);

            }

            System.out.println("|");

        }

        // Impressão da linha horizontal central.
        System.out.println(linhaHorizontal[1]);

        // Impressão das telas inferiores com as divisões horizontais.
        // Na esquerda é impresso a tela de informações do personagem. Na direita é
        // impresso diálogos e a narração do jogo.
        for (int i = 0; i < telaInferior.length; i++) {

            System.out.print("|");

            for (int j = 0; j < telaInformacoes[0].length; j++) {

                System.out.print(telaInformacoes[i][j]);

            }

            System.out.print("|");

            for (int j = 0; j < telaInferior[0].length; j++) {

                System.out.print(telaInferior[i][j]);

            }

            System.out.println("|");

        }

        // Impressão da linha inferior
        System.out.println(linhaHorizontal[2]);

    }

    // MÉTODOS DO JOGO
    // -----------------------------------------------------------------------------------------------------------------
    // Atualizam e imprime a interface de jogo
    // printOpcoes - Quando dois argumentos são enviados, atualiza o texto da tela
    // superior e inferior e imprime o jogo.
    public static void printOpcoes(String textoSup, String textoInf) {

        interfaceAtualiza(textoSup, textoInf);

        interfacePrint();

    }

    // printOpcoes - Quando apenas um argumento é enviado, atualiza o texto da tela
    // inferior e imprime o jogo.
    public static void printOpcoes(String textoInf) {

        // Condição que evita a mistura de texto quando o jogador abrir algum menu a
        // qualquer momento do jogo.
        if (menuAberto) {

            interfaceAtualiza(telaSuperiorTextoMenu, textoInf);

        } else {

            interfaceAtualiza(telaSuperiorTexto, textoInf);

        }

        interfacePrint();

    }

    // printTexto - Quando dois argumentos são enviados, atualiza o texto da tela
    // superior e inferior,
    // insere o texto "Pressione [Enter] para prosseguir" e imprime o texto.
    public static void printTexto(String textoSup, String textoInf) {

        Scanner leitor = new Scanner(System.in);

        do {

            interfaceAtualiza(textoSup, textoInf);

            telaInferiorExibeProsseguir();

            interfacePrint();

            // O código só segue em frente quando o usuário NÃO abre nenhum menu.
        } while (menuOpcoes(leitor.nextLine()));

    }

    // printOpcoes - Quando apenas um argumento é enviado, atualiza o texto da tela
    // inferior,
    // insere o texto "Pressione [Enter] para prosseguir" e imprime o texto.
    public static void printTexto(String textoInf) {

        Scanner leitor = new Scanner(System.in);

        do {

            // Condição que evita a mistura de texto quando o jogador abrir algum menu a
            // qualquer momento do jogo.
            if (menuAberto) {

                interfaceAtualiza(telaSuperiorTextoMenu, textoInf);

            } else {

                interfaceAtualiza(telaSuperiorTexto, textoInf);

            }

            telaInferiorExibeProsseguir();

            interfacePrint();

            // O código só segue em frente quando o usuário NÃO abre nenhum menu.
        } while (menuOpcoes(leitor.nextLine()));

    }

    // ---------------------------------------------------------------------------------------------------------------------------------
    // Tratamento de dados
    // Devolve um numero caso 'entrada' armazene um inteiro menor ou igual ao
    // 'intervalo', caso contrário devolve '0'.
    static public int valorDecisao(int intervalo, String entrada) {

        // K é o valor que a função retornará
        int k = 0;

        // Verifica se o valor da entrada está dentro do intervalo. Caso contrário
        // retorna 0.
        for (int i = 1; i <= intervalo; i++) {

            if (entrada.equals(String.valueOf(i))) {

                k = i;

                i = intervalo + 1;

            }

        }

        return k;

    }

    // Aguarda a digitação de um número menor ou igual ao intervalo e retorna esse
    // numero.
    public static int recebeInteiro(int intervalo) {

        Scanner leitor = new Scanner(System.in);

        String entrada = leitor.nextLine();

        int escolha = valorDecisao(intervalo, entrada);

        while (escolha == 0) {

            // Verifica se há algum menu aberto para evitar abrir mais de um ao mesmo tempo.
            if (!menuAberto) {

                if (escolha == 0) {

                    menuOpcoes(entrada);

                }

                interfaceAtualiza();

            }

            interfacePrint();

            entrada = leitor.nextLine();

            escolha = valorDecisao(intervalo, entrada);

        }

        return escolha;

    }

    // Aguarda a digitação de uma String não vazia e diferente das letras reservadas
    // para o menu.
    public static String recebeTexto() {

        Scanner leitor = new Scanner(System.in);

        String entrada;

        boolean continuar = false;

        do {

            entrada = leitor.nextLine();

            if (!menuAberto) {

                continuar = menuOpcoes(entrada);

                interfaceAtualiza();

            }

            interfacePrint();

        } while (continuar || entrada.trim().isEmpty());

        return entrada;

    }

    // Recebe e centraliza um texto de acordo com a largura da tela passada como
    // parâmetro.
    public static String textoCentraliza(String texto, int larguraTela) {

        int tamanhoTexto = texto.length();

        for (int i = 0; i < (larguraTela - tamanhoTexto) / 2; i++) {

            texto = " " + texto + " ";

        }

        return texto;

    }

    // Completa uma LINHA de uma String, de acordo com a largura da tela.
    public static String textoCompletaLinha(String texto, int largura) {

        if (texto.length() < largura) {

            for (int i = texto.length(); i < largura; i++) {

                texto = texto + " ";

            }

        }

        return texto;

    }

    // Converte um vetor de Strings para uma única String.
    static public String textoConverteVetor(String[] array) {

        String text = "";

        for (String array1 : array) {

            text += array1 + "\n";

        }

        return text;

    }

    // Divide a tela em duas colunas.
    public static String textoDivideColunas(String texto1, String texto2, int larguraColuna1, int larguraColuna2) {

        String texto = "";

        String textoAux;

        boolean texto1Completo = false;

        boolean texto2Completo = false;

        do {

            int k = texto1.indexOf('\n');

            if (!texto1Completo) {

                if (k >= 0) {

                    if (k < larguraColuna1) {

                        textoAux = textoCompletaLinha(texto1.substring(0, k), larguraColuna1);

                        texto1 = texto1.substring(k + 1, texto1.length());

                    } else {

                        textoAux = texto1.substring(0, larguraColuna1);

                        texto1 = texto1.substring(larguraColuna1);

                    }

                } else {

                    if (texto1.length() < larguraColuna1) {

                        textoAux = textoCompletaLinha(texto1, larguraColuna1);

                        texto1Completo = true;

                    } else {

                        textoAux = texto1.substring(0, larguraColuna1);

                        texto1 = texto1.substring(larguraColuna1);

                    }

                }

                texto += textoAux;

            } else {

                texto += textoCompletaLinha("", larguraColuna1);

            }

            int j = texto2.indexOf('\n');

            if (!texto2Completo) {

                if (j >= 0) {

                    if (j < larguraColuna2) {

                        textoAux = textoCompletaLinha(texto2.substring(0, j), larguraColuna2);

                        texto2 = texto2.substring(j + 1, texto2.length());

                    } else {

                        textoAux = texto2.substring(0, larguraColuna2);

                        texto2 = texto2.substring(larguraColuna2);

                    }

                } else {

                    if (texto2.length() < larguraColuna2) {

                        textoAux = textoCompletaLinha(texto2, larguraColuna2);

                        texto2Completo = true;

                    } else {

                        textoAux = texto2.substring(0, larguraColuna2);

                        texto2 = texto2.substring(larguraColuna2);

                    }

                }

                texto += textoAux + "\n";

            } else {

                texto += textoCompletaLinha("", larguraColuna2) + "\n";

            }

        } while (!(texto1Completo && texto2Completo));

        return texto;

    }

    // Retorna o sufixo final da palavra de acordo com o gênero do personagem.
    public static String textoGenero(String genero, String masculino, String feminino) {

        String sufixo;

        if (genero.equals("homem")) {

            sufixo = masculino;

        } else {

            sufixo = feminino;

        }

        return sufixo;

    }

    // -------------------------------------------------------------------------------------------------------
    // Menus
    public static boolean menuOpcoes(String entrada) {

        boolean verificaExecucao = true;

        if (!menuAberto) {

            switch (entrada) {

            case "e":

            case "E":

                // Mostra estatisticas
                menuEstatistica();

                break;

            case "i":

            case "I":

                // Mostra inventário
                menuInventario();

                break;

            default:

                verificaExecucao = false;

                break;

            }

        } else {

            verificaExecucao = false;

        }

        return verificaExecucao;

    }

    public static void menuInicial() {

        int escolha;

        do {

            menuAberto = true;

            printOpcoes("\n" + "\n" + "\n"
                    + "                                                   (                                  )           )            \n"
                    + "                                                    )\\ )   )       (                ( /( (      ( /(     (  (   \n"
                    + "                                                   (()/(( /(    )  )\\ )    (  (     )\\()))\\ )   )\\())  ( )\\ )\\  \n"
                    + "                                                    /(_))\\())( /( (()/( (  )\\))(   ((_)\\(()/(  ((_)\\  ))((_((_) \n"
                    + "                                                   (_))((_)\\ )(_)) ((_)))\\((_)()\\    ((_)/(_))  _((_)/((__  _   \n"
                    + "                                                   / __| |(_((_)_  _| |((__(()((_)  / _ (_) _| | || (_))| || |  \n"
                    + "                                                   \\__ | ' \\/ _` / _` / _ \\ V  V / | (_) |  _| | __ / -_| || |  \n"
                    + "                                                   |___|_||_\\__,_\\__,_\\___/\\_/\\_/   \\___/|_|   |_||_\\___|_||_|  \n"
                    + "\n\n                                                          ",
                    "   1.     Iniciar Jogo\n" + "   2.     Créditos");

            escolha = recebeInteiro(2);

            if (escolha == 2) {

                menuCreditos();

            }

        } while (escolha != 1);

        menuAberto = false;

    }

    public static void menuCreditos() {

        menuAberto = true;

        String creditos = "\n\n" + textoCentraliza("PROJETO INTEGRADOR - PENSAMENTO COMPUTACIONAL", 200) + "\n\n"
                + textoCentraliza("", 200) + "\n\n\n\n\n" + textoCentraliza("Programadores:", 200) + "\n"
                + textoCentraliza("Gabriel Bizarria Santos", 200) + "\n" + textoCentraliza("Samuel Souza Cabral", 200)
                + "\n" + textoCentraliza("Tiago Kauan Rodrigues Brito", 200) + "\n\n\n\n\n\n\n\n\n\n\n"
                + textoCentraliza("SENAC", 200) + "\n" + textoCentraliza("2019 ", 200);

        printTexto(creditos, " ");

        menuAberto = false;

    }

    static public void menuInventario() {

        Scanner leitor = new Scanner(System.in);

        int escolha;

        int itemEscolhido;

        menuAberto = true;

        while (menuAberto) {

            printOpcoes("Inventário:\n" + textoConverteVetor(mochila),
                    "Você deseja:\n" + "1.   Usar um item\n" + "2.   Descartar\n" + "3.   Sair do inventário\n");

            escolha = recebeInteiro(3);

            switch (escolha) {

            case 1:

                itemUsar();

                break;

            case 2:

                itemDescartar();

                break;

            case 3:

                menuAberto = false;

                break;

            default:

                break;

            }

        }

    }

    static public void menuEstatistica() {

        menuAberto = true;

        Scanner leitor = new Scanner(System.in);

        String estatisticasAtributos = "\n\n\n" + "Atributos:" + "\n\n Vida: " + gAtributos[VIDA][ATUAL] + "/"
                + gAtributos[VIDA][TOTAL] + "\n Resiliência: " + gAtributos[RESILIENCIA][ATUAL]
                + "\n - A sua [Resiliência] determina a sua resistência a ataques físicos" + "\n\n Fé: "
                + gAtributos[FE][ATUAL] + "\n - A sua [Fé] determina a sua resistência a ataques mágicos"
                + "\n\n Agilidade: " + gAtributos[AGILIDADE][ATUAL]
                + "\n - A sua [Agilidade] aumenta suas chances de se esquivar e causar golpes"
                + "\nprecisos, tirando a possibilidade de defesa de inimigos" + "\n\n Força: "
                + gAtributos[FORCA][ATUAL] + "\n - A sua [Força] aumenta o poder de suas habilidades físicas"
                + "\n\n Astúcia: " + gAtributos[ASTUCIA][ATUAL]
                + "\n - A sua [Astúcia] aumenta o poder de suas habilidades mágicas";

        String estatisticasHabilidades = "\n\n\n" + "Habilidades de Ataque:" + "\n\n"
                + gHabilidadeDefinicao[ATAQUE][HABILIDADE_1][NOME] + "\n" + nome + " "
                + gHabilidadeDefinicao[ATAQUE][HABILIDADE_1][DESCRICAO] + "\n\n"
                + gHabilidadeDefinicao[ATAQUE][HABILIDADE_2][NOME] + "\n" + nome + " "
                + gHabilidadeDefinicao[ATAQUE][HABILIDADE_2][DESCRICAO] + "\n\n"
                + gHabilidadeDefinicao[ATAQUE][HABILIDADE_3][NOME] + "\n" + nome + " "
                + gHabilidadeDefinicao[ATAQUE][HABILIDADE_3][DESCRICAO] + "\n\n\nHabilidades de Defesa:" + "\n\n"
                + gHabilidadeDefinicao[DEFESA][HABILIDADE_1][NOME] + "\n" + nome + " "
                + gHabilidadeDefinicao[DEFESA][HABILIDADE_1][DESCRICAO] + "\n\n"
                + gHabilidadeDefinicao[DEFESA][HABILIDADE_2][NOME] + "\n" + nome + " "
                + gHabilidadeDefinicao[DEFESA][HABILIDADE_2][DESCRICAO] + "\n\n"
                + gHabilidadeDefinicao[DEFESA][HABILIDADE_3][NOME] + "\n" + nome + " "
                + gHabilidadeDefinicao[DEFESA][HABILIDADE_3][DESCRICAO];

        printOpcoes(textoDivideColunas(estatisticasAtributos, estatisticasHabilidades, 80, telaSuperior[0].length - 90),
                "Essas são as estatísticas do seu personagem" + "\n\n1.   Voltar");

        recebeInteiro(1);

        menuAberto = false;

    }

    // -------------------------------------------------------------------------------------------------------
    // Inventário
    static public void inventarioInicia() {

        mochila = new String[12];

        for (int i = 0; i < 12; i++) {

            mochila[i] = (i + 1) + ".   Vazio";

        }

    }

    static public void itemDescartar() {

        int escolha;

        printOpcoes("Inventário:  \n" + textoConverteVetor(mochila) + "\n13. Sair",
                "Escolha um item do inventário para descartar ou digite [13] para voltar");

        escolha = recebeInteiro(13);

        if (escolha != 13) {

            escolha--;

            if (mochila[escolha].contains("Não descartável")) {

                printTexto("Este item não é descartável");

            } else if (mochila[escolha].contains(".   Vazio")) {

                printTexto("Compartimento indicado está vazio");

            } else {

                printOpcoes("Tem certeza que deseja descartar \"" + mochila[escolha] + "\"\n\n" + "1.   Sim\n"
                        + "2.   Não");

                if (recebeInteiro(2) == 1) {

                    mochila[escolha] = escolha + 1 + ".   Vazio";

                }

            }

        }

    }

    static public void itemGuardar(String item) {

        boolean itemGuardado = false;

        for (int i = 0; i < 12 && itemGuardado == false; i++) {

            if (mochila[i].contains(".   Vazio")) {

                mochila[i] = (i + 1) + ".   " + item;

                itemGuardado = true;

                printTexto("item \"" + item + "\" armazenado no inventário.");

            }

        }

        if (!itemGuardado) {

            if (item.contains("Não descartável")) {

                printTexto("Não há espaço para armazenar [" + item + "]\n"
                        + "Libere espaço em seu inventário para armazená-lo.");

                itemGuardar(item);

            } else {

                printOpcoes("Não há espaço para armazenar [" + item + "]\n"
                        + "Gostaria de liberar espaço no inventário para armazená-lo?\n\n" + "1.    Sim\n"
                        + "2.    Não  (Jogar \"" + item + "\" fora)");

                if (recebeInteiro(2) == 1) {

                    menuInventario();

                    itemGuardar(item);

                }

            }

        }

    }

    static public void itemUsar() {

        int escolha;

        printOpcoes("Inventário:  \n" + textoConverteVetor(mochila) + "\n13. Sair",
                "Selecione um item do inventário para usar ou digite [13] para voltar.");

        escolha = recebeInteiro(13);

        if (escolha != 13) {

            escolha -= 1;

            if (mochila[escolha].contains("Poção de Cura")) {

                if (gAtributos[VIDA][TOTAL] - gAtributos[VIDA][ATUAL] < 50) {

                    gAtributos[VIDA][ATUAL] = gAtributos[VIDA][TOTAL];

                } else {

                    gAtributos[VIDA][ATUAL] += 50;

                }

                mochila[escolha] = (escolha + 1) + ".   Vazio";

            } else if (mochila[escolha].contains("Poção de Restauração")) {

                gAtributos[FE][ATUAL] = gAtributos[FE][TOTAL];

                gAtributos[RESILIENCIA][ATUAL] = gAtributos[RESILIENCIA][TOTAL];

            } else if (mochila[escolha].contains("Pergaminho de Valefar")) {

                printTexto("\n Valefar é o Duque dos Inferno. "
                        + "\n Ele tenta roubar as pessoas e está a cargo de um bom relacionamento entre os ladrões, porém, mais tarde, depois ele traz-los para a forca. "
                        + "\n Valefar é considerado um bom familiar para os seus associados, até que sejam apanhados na armadilha "
                        + "\n Ele comanda dez legiões de demônios", "*Você lê o pergaminho*");

            } else if (mochila[escolha].contains("Manuscrito")) {

                printTexto("Valefar, embreve, estará preparado para iniciar a guerra. Lucifer confia muito nele. \n "
                        + "Mal posso esperar para ver a feição de Lúcifer ao perceber que Valefar quer tomar seu lugar. \n"
                        + "Só espero que eu esteja do lado certo quando tudo terminar.", "");

            } else {

                printTexto("Item não utilizável");

            }

        }

    }

    static public void lootAleatorio(String[] itensContidos) {

        String itemEncontrado = itensContidos[(int) (Math.random() * itensContidos.length)];

        if (itemEncontrado.contains("Não descartável")) {

            itemGuardar(itemEncontrado);

        } else {

            printOpcoes("Você encontrou " + itemEncontrado + ". Deseja guardar em seu inventário?\n\n" + "1.   Sim\n\n"
                    + "2.   Não (Jogar fora)");

            if (recebeInteiro(2) == 1) {

                itemGuardar(itemEncontrado);

            }

        }

    }

    static public void loot(String[] itensContidos) {

        for (String itemEncontrado : itensContidos) {

            if (itemEncontrado.contains("Não descartável")) {

                printTexto("Você encontrou " + itemEncontrado);

                itemGuardar(itemEncontrado);

            } else {

                printOpcoes("Você encontrou " + itemEncontrado + ". Deseja guardar em seu inventário?\n\n"
                        + "1.   Sim\n\n" + "2.   Não (Jogar fora)");

                if (recebeInteiro(2) == 1) {

                    itemGuardar(itemEncontrado);

                }

            }

        }

    }

    // -------------------------------------------------------------------------------------------------------
    static public void personagemInicia() {

        atributosInicia("Guardião", gAtributos);

        habilidadesInicia("Guardião", gHabilidadeDefinicao, gHabilidadeAtributos);

        inventarioInicia();

        personagemIniciado = true;

    }

    // Função Principal
    public static void main(String[] args) {

        // Declaração do leitor para entrada dos dados.
        Scanner leitor = new Scanner(System.in);

        // Variável que determina se o jogo termina ou ínicia.
        boolean continuaJogo = true;

        // Abre o menu inicial
        // As linha abaixo dão entrada a história e abre a possibilidade da escolha do
        // gênero do personagem principal.
        while (continuaJogo) {

            // Inicia a interface de jogo.
            interfaceInicia();

            personagemIniciado = false;

            menuInicial();

            String generoAux = "";

            String classeAux = "";

            // Variável de texto para evitar erros de digitação.
            String naoDescartavel = "   (Não descartável) ";

            String bau[] = { "Poção de Cura", "Poção de Restauração" };

            // Trata o inicio do jogo até o final da personalização do personagem como um
            // Menu.
            // Assim, o jogador só vai poder abrir as estatisticas e o inventário quando seu
            // personagem estiver definido.
            menuAberto = true;

            // printTexto imprime nas telas Superior e Inferior a String enviada e atualiza
            // a tela de informações.
            // Caso seja usada com apenas um argumento, só a tela inferior que será
            // atualizada.
            printTexto("...");

            printTexto(
                    "Você se encontra perdido, em um local escuro e quente, não sabe como e o porquê de você estar ali.");

            printTexto("Porém a única coisa que você se lembra é que...");

            printOpcoes("Você é: \n" + "\n" + "1 - Homem                  2 - Mulher \n");

            // As linhas abaixo definem o genero do jogador.
            // Aqui, genero recebe um inteiro entre 1 e o argumento enviado [2].
            genero = recebeInteiro(2);

            if (genero == 1) {

                printTexto("Você é um homem.");

                generoAux = "homem";

            } else if (genero == 2) {

                printTexto("Você é uma mulher.");

                generoAux = "mulher";

            }

            // As linhas abaixo são o que define a classe do jogador.
            // textoGenero(genero,sufixoMasculino,sufixoFeminino) devolve o sufixo da
            // palavra de acordo com o gênero do jogador.
            printOpcoes("E que \n" + "\n" + "1 - Feiticeir" + textoGenero(generoAux, "o", "a")
                    + "                2 - Guerreir" + textoGenero(generoAux, "o", "a"));

            classe = recebeInteiro(2);

            if (classe == 1) {

                printTexto("E você é um" + textoGenero(generoAux, "", "a") + " feiticeir"
                        + textoGenero(generoAux, "o", "a"));

                classeAux = "feiticeir" + textoGenero(generoAux, "o", "a");

            } else if (classe == 2) {

                printTexto("E você é um" + textoGenero(generoAux, "", "a") + " guerreir"
                        + textoGenero(generoAux, "o", "a"));

                classeAux = "guerreir" + textoGenero(generoAux, "o", "a");

            }

            // Aqui o jogador determina o nome do personagem.
            printOpcoes(
                    "Você também tenta lembrar seu nome... \n" + "\n" + "\n" + "\n" + "\n" + "'Digite o seu nome: '");

            nome = recebeTexto();

            // Capitaliza a primeira letra do nome do Jogador e deixa as outras minusculas.
            nome = nome.substring(0, 1).toUpperCase() + nome.substring(1).toLowerCase();

            // Aqui os atributos, habilidades e inventário do personagem são iniciados.
            personagemInicia();

            // Acaba a personalização do personagem e o jogador pode abrir qualquer menu
            // dentro do jogo.
            menuAberto = false;

            printTexto("Seu nome é " + nome + ".");

            printTexto("O seu nome e o que você é, são as únicas coisas que você se lembra.");

            printTexto("Você se levanta e caminha até a borda do que parece ser um despenhadeiro.");

            printTexto(
                    "Você olha para tudo o que há abaixo daquela montanha. E você vê algo que te assusta: você está no inferno.");

            printTexto("De primeiro momento você pensa que está mort" + textoGenero(generoAux, "o", "a") + ".");

            printTexto("Porém, logo a sua frente, uma figura é projetada. Um senhor de barba branca.");

            printTexto("- Se aproxime " + classeAux + " " + nome + ".");

            // Esse bloco de código executa o diálogo 1.
            int acao1Aux = 0;

            while (acao1Aux == 0) {

                printOpcoes("Você pergunta:                 \n\n" + "1 - 'Quem é você?'           \n"
                        + "2 - 'Estou morto?'           \n" + "3 - *Atacar o velho*         \n"
                        + "4 - Sair do diálogo.         \n");

                int acao1 = recebeInteiro(5);

                switch (acao1) {

                case 1:

                    printTexto("- Quem é você?");

                    printTexto("- Sou o Mago Superior Organ, da igreja do amanhã. - diz o senhor.");

                    printTexto(
                            " Mago do templo dos Templários. Você foi teletransportado para cá para cumprir sua missão.");

                    printTexto("- Tenho o objetivo de te ajudar durante essa jornada.");

                    printTexto(
                            " Tenho como objetivo te ajudar e te explicar tudo do que for necessário para haver sucesso nessa missão.");

                    printTexto(
                            "Porém não estou aqui fisicamente, estou como forma de aparição, apenas como um fantasma.");

                    printTexto("Portanto, não irei poder fazer mais nada senão te ajudar com dicas.");

                    break;

                case 2:

                    printTexto("- Eu morri? - você pergunta ao velho?");

                    printTexto("- Não, você não morreu. Porém está aqui para uma missão.");

                    printTexto("- Que missão?");

                    printTexto(
                            "- Você deve recuperar a Pedra Celestial, artefato mágico sagrado, roubado por Valefor e seus lacaios.");

                    printTexto("- Valefor? Quem é este? E porque recuperar este objeto?");

                    printTexto(
                            "- Não é importante você saber quem é Valefor, só necessitas saber que ele está prestes a iniciar o Apocalipse.");

                    printTexto("- Somente por causa do artefato ele tem esse poder?");

                    printTexto("- Sim!");

                    break;

                case 3:

                    printTexto("*Você pula no velho*");

                    printTexto("*Você percebe que ele não passará de um espectro*");

                    printTexto("- Se acalme guardiã" + textoGenero(generoAux, "o", "")
                            + ". Como percebes, não estou aqui em forma física. Estou somente como uma alma que te dará suporte. - Diz o velho.");

                    printTexto("*Você caiu de cara no chão*");

                    printTexto("'Você pode fazer outras perguntas para o velho'");

                    break;

                case 4:

                    acao1Aux = 1;

                    break;

                default:

                    break;

                }

            }

            printTexto("Pois bem, guardiã" + textoGenero(generoAux, "o", "") + " " + nome
                    + " vá logo, antes que seja tarde demais.");

            // Recebe um item de acordo com a classe
            if (classe == 1) {

                printTexto("*O mago te dá uma varinha");

                printTexto("- Você irá precisar dela, guardião.");

                printTexto("- Mas por que exatamente? - Você pergunta.");

                printTexto("- Pelos desafios que irá encontrar. - Responde o mago, com uma feição muito risonha.");

                printTexto("*Você está muito preocupado, mas entende o quanto é necessário enfrentar essa jornada.");

                itemGuardar("Varinha" + naoDescartavel);

            } else if (classe == 2) {

                printTexto("*O mago te dá uma espada.*");

                printTexto("- Você irá precisar dela, guardião.");

                printTexto("- Mas por que exatamente? - Você pergunta.");

                printTexto("- Pelos desafios que irá encontrar. - Responde o mago, com uma feição muito risonha.");

                printTexto("*Você está muito preocupado, mas entende o quanto é necessário enfrentar essa jornada.");

                itemGuardar("Espada" + naoDescartavel);

            }

            // Abre o inventário.
            menuInventario();

            printTexto("Este é o inventário e você pode abri-lo a qualquer momento");

            printTexto("Você caminha através de um corredor que está logo na sua frente.");

            printTexto("Um cheiro forte de enxofre e podridão inunda seu nariz, deixando você agoniado.");

            printTexto("Você chega em uma sala, onde apenas uma lâmpada ilumina o espaço.");

            printTexto("Você avista uma espécie de caixa...");

            printTexto("UM BAÚ. A caixa na verdade é um possível precioso baú.");

            printTexto("Você se aproxima dele.");

            // Abre um baú e recebe itens contidos por meio de um sorteio.
            printOpcoes("Gostaria de abrir o baú \n\n" + "1.   Sim\n\n" + "2.   Não\n\n");

            if (recebeInteiro(2) == 1) {

                lootAleatorio(bau);

            }

            // Continuação da história.
            printTexto(
                    "Você continua caminhando por um outro corredor estreito, agora tudo parece mais quente e abafado.");

            printTexto("Criaturas descem pelas paredes daquele lugar.");

            printTexto("Você esta chegando em uma outra localidade, uma espécie de prisão.");

            printTexto("Ao entrar na sala você é surpreendid" + textoGenero(generoAux, "o", "a")
                    + " por um ser monstruoso que pula em sua direção.");

            printTexto(
                    "Tudo indica que ele é um ser demôniaco. ele tem um par de chifres, pequenos, porém muito afiados.");

            // Inicio de diálogo.
            printTexto("- O que você faz aqui, human" + textoGenero(generoAux, "o", "a") + " imund"
                    + textoGenero(generoAux, "o", "a") + "? ");

            printTexto("Você está sem reação, de primeiro momento.");

            printTexto("- Irei acabar com você.");

            // ****** Luta entre o personagem e o demônio. ******
            combate("Demônio Inferior");

            if (gAtributos[VIDA][ATUAL] <= 0) {

                printTexto("GAME OVER");

                continue;

            }

            // LOOT DO DÊMONIO
            printTexto("Você derrotou o pequeno demônio.");

            printTexto("O corpo daquele ser se torna pó. No meio do que era seu corpo, agora só resta as vestes.");

            printTexto("No meio daquela armadura, você encontra: ");

            if (classe == 1) {

                String itensDropados[] = { "Poção de Cura", "Peça de Varinha" + naoDescartavel };

                loot(itensDropados);

            } else {

                String itensDropados[] = { "Poção de Cura", "Peça de Espada" + naoDescartavel };

                loot(itensDropados);

            }

            // O pergaminho
            printTexto(
                    "Ao aproximar-se de um pedestal, você se depara com um pedaço de papel com um aspecto envelhecido.");

            printTexto("*Você guarda o pergaminho*");

            itemGuardar("Pergaminho de Valefar" + naoDescartavel);

            printOpcoes("*Gostaria de ler agora?" + "\n 1 - Sim" + "\n 2 - Não");

            int pergaminhoesc = recebeInteiro(2);

            if (pergaminhoesc == 1) {

                printTexto("\n Valefar é o Duque dos Inferno. "
                        + "\n Ele tenta roubar as pessoas e está a cargo de um bom relacionamento entre os ladrões, porém, mais tarde, depois ele traz-los para a forca. "
                        + "\n Valefar é considerado um bom familiar para os seus associadosaté que sejam apanhados na armadilha "
                        + "\n Ele comanda dez legiões de demônios", " *Você lê o pergaminho* ");

            }

            printTexto(" ", "Você pode ler o pergaminho a qualquer hora em quanto ele estiver no seu inventário.");

            printTexto("Você sai daquele lugar.");

            printOpcoes(
                    "Logo na frente você encontra um grande corredor, com dois lados possíveis para ir, que parece dar em dois locais diferentes."
                            + "\n Você deseja ir para esquerda ou para direita do corredor? " + "\n "
                            + "\n 1 - Esquerda " + "\n 2 - Direita ");

            int corredoresc = recebeInteiro(2);

            if (corredoresc == 1) {

                printTexto("*Você vai pelo seu lado esquerdo.*");

                printTexto("Você se encontra novamente em outra sala, e outro demônio está no seu caminho.");

                printTexto("Este parece ser mais forte que o anterior.");

                printTexto("- O que faz aqui " + classeAux + "?");

                printTexto("- O que acha que faço aqui?! Vim para matar Valefar e recuperar a pedra celestial.");

                printTexto("- Tol" + textoGenero(generoAux, "o", "a")
                        + "! Nunca irás recuperá-la! Em breve, todas as tropas infernais estarão subindo para superfície para iniciar o reinado de Lúcifer.");

                printTexto("- Não deixarei isto acontecer!");

                combate("Demônio Herege");

                if (gAtributos[VIDA][ATUAL] <= 0) {

                    printTexto("GAME OVER");

                    continue;

                }

                // LOOTEAR
                printTexto(
                        "Ao derrotar o demônio, novamente, apenas suas roupas se encontram no chão, pois seu corpo se tornou cinzas.");

                printOpcoes("Você deseja vasculhar as vestes?\n\n" + "1.   Sim\n\n" + "2.   Não");

                if (recebeInteiro(2) == 1) {

                    itemGuardar("Poção de Cura");

                    itemGuardar("Poção de Restauração");

                    itemGuardar("Poção de Cura");

                }

                printTexto("Na mesma sala, você encontra um baú.");

                printOpcoes("Gostaria de abrir o baú \n\n" + "1.   Sim\n\n" + "2.   Não\n\n");

                if (recebeInteiro(2) == 1) {

                    lootAleatorio(bau);

                }

            }

            printTexto("Você caminha por perto de uma espécie de muro. Muitos barulhos e gritos podem ser ouvidos. \n"
                    + "Você chega em uma sala muito escura. O calor naquele local causava um grande maú-estar.");

            printTexto("Você acaba ascendendo um pequeno lampião que acabara de ver.");

            printTexto(
                    "Por um momento, você olha para baixo e acaba vendo que há um pequeno lampião. Você liga ele. \n "
                            + "Ele parece usar uma espécie de combustível diferente que produzia uma luz branca suficientemente forte para clarear toda a sala.");

            printTexto("Agora com a luz, você consegue se guiar pelo caminho escuro.");

            printTexto("O chão parece tremer de forma fraca.");

            printTexto(
                    "O você chega a outra sala, agora, diferente da outra, esta iluminada pela luz emanada pelo mar de lava e fogo. \n"
                            + "Você consegue ver tudo isto pois uma grande fenda esta aberta. \n "
                            + "Você também pode ver e ouvir diversas pessoas gritando, todas aqueles gritos eram do lado de fora. \n "
                            + "Ao examinar, também pode ver que todo esse local que você se encontra é algum tipo de 'construção infernal'.");

            printTexto(
                    "Você vê algum outro pilar, parecido com aquele já visto antes aqui perto, no qual se encontra um outro tipo de manuscrito.");

            printOpcoes("Você deseja ler esse manuscrito? \n " + "1 - SIM  \n " + "2 - NÃO");

            int manuscrito2 = recebeInteiro(2);

            if (manuscrito2 == 1) {

                printTexto("Valefar, em breve, estará preparado para iniciar a guerra. Lúcifer confia muito nele. \n "
                        + "Mal posso esperar para ver a feição de Lúcifer ao perceber que Valefar quer tomar seu lugar. \n"
                        + "Só espero que eu esteja do lado certo quando tudo terminar.");

                printTexto("*Valefar parece querer tomar o lugar de Lúcifer no domínio do plano terreno.* \n "
                        + "*Esse jogo político e religioso só parece piorar.* ");

                itemGuardar("Manuscrito" + naoDescartavel);

            } else {

                printTexto("*Você pode acessar esse item na hora que você desejar.*");

                itemGuardar("Manuscrito" + naoDescartavel);

            }

            printTexto("Você continuar a caminhar e chega em uma sala. \n "
                    + "De primeiro momento não percebe que nela há um ser bestial. Um demônio que parece ser de nível superior.");

            printTexto("- O que faz aqui, human" + textoGenero(generoAux, "o", "a") + " suj"
                    + textoGenero(generoAux, "o", "a") + "?");

            printTexto("- Vim para aniquilar Valefar.");

            printTexto(
                    "- HAHAHAHA - O demônio deu uma risada que arrepiaria qualquer pessoa - Você não é páreo sequer para mim.");

            printTexto("- É isso que iremos ver!");

            combate("Demônio Superior");

            if (gAtributos[VIDA][ATUAL] <= 0) {

                printTexto("GAME OVER");

                continue;

            }

            printOpcoes("Você deseja vasculhar o corpo do demônio?\n\n" + "1.   Sim\n\n" + "2.   Não");

            if (recebeInteiro(2) == 1) {

                itemGuardar("Poção de Cura");

                itemGuardar("Poção de Restauração");

                itemGuardar("Poção de Cura");

            }

            printTexto("Você caminha até um portal, na qual há grandes portões de mármore negro.");

            printTexto("*Você empurra as grandes portas*");

            printTexto("Você dá de cara com um ser de mais de 4 metros de alturas sentado em um grande trono. \n "
                    + " Ele possui grandes asas e corpo de cor preta.");

            printOpcoes("O que você irá dizer? \n " + "1 - Valefar, eu vim destruí-lo. \n " + "2 - *Ficar quieto.* \n "
                    + "3 - Meu Deus, como você é feio!");

            int fparavalefar = recebeInteiro(3);

            if (fparavalefar == 1) {

                printTexto("- Quem ousa me pertubar? - Valefar responde em alto tom.");

                printTexto("- Eu sou " + nome + ", " + classeAux + ", e vim parar você e seus planos.");

                printTexto(
                        "- Você? HAHAHA - Ele ri - Você é um ser engraçado, talvez depois de toda essa guerra você não seja meu bicho de estimação.");

            } else if (fparavalefar == 2) {

                printTexto("*Ficar quieto*");

                printTexto("*O demônio percebe sua presença*");

                printTexto("- Quem ousa me pertubar? - Valefar responde em alto tom.");

                printTexto("- Eu sou " + nome + ", " + classeAux + ", e vim parar você e seus planos.");

            } else if (fparavalefar == 3) {

                printTexto("- Meu Deus, você é horroroso. - Você fala.");

                printTexto("*O dêmonio olha para você com um olhar de ódio.");

            }

            printTexto("- Como você chegou aqui, verme?");

            printOpcoes("Você responde: \n " + "1 - Não te interessa. \n " + "2 - Falar a verdade. \n"
                    + "3 - *Ficar quieto*.");

            int fparavalefar2 = recebeInteiro(3);

            if (fparavalefar2 == 1) {

                printTexto("Não te interessa. Só precisa saber que irei destruí-lo.");

                printTexto("- Pois iremos ver. - Valefar levanta do seu grande trono de pedra e pula em sua direção.");

                combate("Valefar");

            } else if (fparavalefar2 == 2) {

                printTexto("- Vim a mando dos sacerdotes da igreja da manhã.");

                printTexto("- Porcos imundos! Irei matá-lo!");

                printTexto("*Valefar pula em sua direção.*");

                combate("Valefar");

            } else if (fparavalefar2 == 3) {

                printTexto("*Você fica quieto*");

                printTexto("*Valefar levanta de seu trono e pula em sua direção*");

                combate("Valefar");

            }

            if (gAtributos[VIDA][ATUAL] <= 0) {

                printTexto("GAME OVER");

                continue;

            }

            printTexto("Valefar agora está morto. Você acaba visualizando de longe algo muito brilhante. \n"
                    + "Sua luz é parece com algo próximo de um arco íris. \n "
                    + "Você acaba percebendo que essa coisa brilhante nada mais é que a pedra celestial. \n"
                    + "*Você corre em direção do artefato*");

            printTexto("*Você pega a pedra celestial*");

            itemGuardar("Pedra celestial" + naoDescartavel);

            printTexto("Ao virar para o lado, você toma um susto com a aparição do velho.");

            printTexto("- Parabéns Guardiã" + textoGenero(generoAux, "o", "")
                    + ", você recuperou a pedra e salvou o nosso universo da dominação de Satanás. Muito obrigado.");

            printOpcoes("Você fala: \n " + "1 - Descobri algumas coisas interessantes. \n " + "2 - *Se gabar.* \n"
                    + "3 - Nada de obrigado. Quero minha recompensa!");

            int decfalafim;

            printOpcoes("Você fala: \n " + "1 - Descobri algumas coisas interessantes. \n " + "2 - *Se gabar.* \n"
                    + "3 - Nada de obrigado. Quero minha recompensa!");

            decfalafim = recebeInteiro(3);

            while (decfalafim != 4) {

                if (decfalafim == 1) {

                    printTexto("- Descobri que Valefar pretendia tomar o lugar de Lúcifer.");

                    printTexto("- Isso é muito interessante. Sinceramente, é esperado coisas desse tipo por aqui. \n"
                            + "Nós, da igreja da manhã, iremos ficar de olho por aqui.");

                } else if (decfalafim == 2) {

                    printTexto("- Mas é claro, eu sou demais...");

                    printTexto("- Por isso temos outras missões para você, guardião. - Fala o velho.");

                    printTexto("- Que? - Você responde assustado.");

                    printTexto("- Em breve falaremos mais sobre isto.");

                } else if (decfalafim == 3) {

                    printTexto("- Nada de obrigado. Quero minha recompensa.");

                    printTexto("*O velho te dá uma porção de moedas*");

                    printTexto("- Só isso? - Você o pergunta.");

                    printTexto("Por enquanto este é apenas o começo.");

                    printTexto("- Apenas o começo?");

                    printTexto("- Sim, temos mais missões pra você.");

                    printTexto("- Que?");

                    printTexto("- Em breve, iremos contar mais sobre isto para você.");

                }

                printOpcoes("Você fala: \n " + "1 - Descobri algumas coisas interessantes. \n " + "2 - *Se gabar.* \n"
                        + "3 - Nada de obrigado. Quero minha recompensa! \n" + "4 - Sair do Diálogo");

                decfalafim = recebeInteiro(4);

            }

            printTexto("Parabéns! Você terminou o jogo.");

            menuCreditos();

        }

    }

}
