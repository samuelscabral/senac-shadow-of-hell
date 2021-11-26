export function* NarrativeScript(dialog) {

    dialog.talk({
        text: "Selecione seus pronomes",
        options: ["(Ele/Dele)", "(Ela/Dela)", "(Elu/Delu)"]
    });

    let gender = (yield).option - 1;


    yield dialog.talk({ text: "..." });
    yield dialog.talk({ text: "Você se encontra perdido, em um local escuro e quente, não sabe como e o porquê de você estar ali." });
    yield dialog.talk({ text: "Porém a única coisa que você se lembra é que..." });

    dialog.talk({
        text: "Você é",
        options: [`Feitiçeir[o/a/e]`, `Guerreir[o/a/e]`],
        gender
    });

    let classe = (yield).option;

    yield dialog.talk({ text: "Você também tenta lembrar seu nome..." });

    let nome = prompt("Digite seu nome")

    yield dialog.talk({ text: `Seu nome é ${nome}.` });
    yield dialog.talk({ text: "O seu nome e o que você é, são as únicas coisas que você se lembra." });
    yield dialog.talk({ text: "Você se levanta e caminha até a borda do que parece ser um despenhadeiro." });
    yield dialog.talk({ text: "Você olha para tudo o que há abaixo daquela montanha. E você vê algo que te assusta: você está no inferno." });
    yield dialog.talk({ text: `De primeiro momento você pensa que está mort[o/a/e] .`, gender }
    );
    yield dialog.talk({ text: "Porém, logo a sua frente, uma figura é projetada. Um senhor de barba branca." });
    yield dialog.talk({ text: `Se aproxime ${"feiticeir"}[o/a/e].`, gender });

    let continuaDialogo = true;

    do {
        dialog.talk({
            text: "Você pergunta:",
            options: ["'Quem é você?'", `'Estou mort[o/a/e]?'`, "*Atacar o velho*", "Sair do diálogo."],
            gender
        });

        let escolha = (yield).option;

        switch (escolha) {
            case 1:
                yield dialog.talk({ text: "- Quem é você?" });
                yield dialog.talk({ text: "- Sou o Mago Superior Organ, da igreja do amanhã. - diz o senhor." });
                yield dialog.talk({ text: " Mago do templo dos Templários. Você foi teletransportado para cá para cumprir sua missão." });
                yield dialog.talk({ text: "- Tenho o objetivo de te ajudar durante essa jornada." });
                yield dialog.talk({ text: " Tenho como objetivo te ajudar e te explicar tudo do que for necessário para haver sucesso nessa missão." });
                yield dialog.talk({ text: "Porém não estou aqui fisicamente, estou como forma de aparição, apenas como um fantasma." });
                yield dialog.talk({ text: "Portanto, não irei poder fazer mais nada senão te ajudar com dicas." });
                break;
            case 2:
                yield dialog.talk({ text: "- Eu morri? - você pergunta ao velho?" });
                yield dialog.talk({ text: "- Não, você não morreu. Porém está aqui para uma missão." });
                yield dialog.talk({ text: "- Que missão?" });
                yield dialog.talk({ text: "- Você deve recuperar a Pedra Celestial, artefato mágico sagrado, roubado por Valefar e seus lacaios." });
                yield dialog.talk({ text: "- Valefar? Quem é este? E porque recuperar este objeto?" });
                yield dialog.talk({ text: "- Não é importante você saber quem é Valefar, só necessitas saber que ele está prestes a iniciar o Apocalipse." });
                yield dialog.talk({ text: "- Somente por causa do artefato ele tem esse poder?" });
                yield dialog.talk({ text: "- Sim!" });
                break;
            case 3:
                yield dialog.talk({ text: "*Você pula no velho*" });
                yield dialog.talk({ text: "*Você percebe que ele não passará de um espectro*" });
                yield dialog.talk({ text: `- Se acalme guardiã[o,a,e]. Como percebes, não estou aqui em forma física. Estou somente como uma alma que te dará suporte. - Diz o velho.`, gender });
                yield dialog.talk({ text: "*Você caiu de cara no chão*" });
                yield dialog.talk({ text: "'Você pode fazer outras perguntas para o velho'" });
                break;
            case 4:
                continuaDialogo = false
        }
    } while (continuaDialogo)

    yield dialog.talk({
        text: `Pois bem, guardiã[o/a/e] ${nome}, vá logo, antes que seja tarde demais.`, gender
    });

    //REFATORAR
    let item;

    if (classe == 1) {
        item = "varinha"
    } else {
        item = "espada"
    }

    yield dialog.talk({ text: `*O mago te dá uma ${item}.*` });
    yield dialog.talk({ text: `- Você irá precisar disso, guardiã[o/a/e].`, gender });
    yield dialog.talk({ text: "- Mas por que exatamente? - Você pergunta." });
    yield dialog.talk({ text: "- Pelos desafios que irá encontrar. - Responde o mago, com uma feição muito risonha." });
    yield dialog.talk({ text: `*Você está muito preocupad[o/a/e], mas entende o quanto é necessário enfrentar essa jornada.`, gender });
    yield dialog.talk({ text: "Este é o inventário e você pode abri-lo a qualquer momento" });
    yield dialog.talk({ text: "Você caminha através de um corredor que está logo na sua frente." });
    yield dialog.talk({ text: "Um cheiro forte de enxofre e podridão inunda seu nariz, deixando você agoniad[o/a/e].", gender });
    yield dialog.talk({ text: "Você chega em uma sala, onde apenas uma lâmpada ilumina o espaço." });
    yield dialog.talk({ text: "Você avista uma espécie de caixa..." });
    yield dialog.talk({ text: "UM BAÚ. A caixa na verdade é um possível precioso baú." });
    yield dialog.talk({ text: "Você se aproxima dele." });
    dialog.talk({
        text: "Gostaria de abrir o baú?",
        options: ["Sim", "Não"]
    });

    if ((yield).option == 1) {
        REFATORAR.lootAleatorio(bau);
    };

    yield dialog.talk({ text: "Você continua caminhando por um outro corredor estreito, agora tudo parece mais quente e abafado." });
    yield dialog.talk({ text: "Criaturas descem pelas paredes daquele lugar." });
    yield dialog.talk({ text: "Você esta chegando em uma outra localidade, uma espécie de prisão." });
    yield dialog.talk({ text: "Ao entrar na sala você é surpreendid[o/a/e] por um ser monstruoso que pula em sua direção.", gender });
    yield dialog.talk({ text: "Tudo indica que ele é um ser demôniaco. ele tem um par de chifres, pequenos, porém muito afiados." });

    // Inicio de diálogo.
    yield dialog.talk({ text: "- O que você faz aqui, human[o/a/e] imund[o/a/e]?" }, gender);
    yield dialog.talk({ text: "Você está sem reação, de primeiro momento." });
    yield dialog.talk({ text: "- Irei acabar com você." });

    // ****** Luta entre o personagem e o demônio. ******
    REFATORAR.combate("Demônio Inferior")

    if (REFATORAR.gAtributos[VIDA][ATUAL] <= 0) {
        yield dialog.talk({ text: "GAME OVER" });
        REFATORAR.finalizaJogo();
    }

    // LOOT DO DÊMONIO
    yield dialog.talk({ text: "Você derrotou o pequeno demônio." });

    yield dialog.talk({ text: "O corpo daquele ser se torna pó. No meio do que era seu corpo, agora só resta as vestes." });

    yield dialog.talk({ text: "No meio daquela armadura, você encontra: " });

    if (classe == 1) {

        let itensDropados = ["Poção de Cura", "Peça de Varinha" + naoDescartavel];

        REFATORAR.loot(itensDropados);

    } else {

        let itensDropados = ["Poção de Cura", "Peça de Espada" + naoDescartavel];

        REFATORAR.loot(itensDropados);
    }

    // O pergaminho
    yield dialog.talk({ text: "Ao aproximar-se de um pedestal, você se depara com um pedaço de papel com um aspecto envelhecido." });
    yield dialog.talk({ text: "*Você guarda o pergaminho*" });

    REFATORAR.itemGuardar("Pergaminho de Valefar" + naoDescartavel);

    dialog.talk({
        text: "*Gostaria de ler agora?",
        options: ["Sim", "Não"]
    })

    let pergaminhoesc = (yield).option;

    if (pergaminhoesc == 1) {
        yield dialog.talk({
            text: `
                Valefar é o Duque dos Inferno. 
                Ele tenta roubar as pessoas e está a cargo de um bom relacionamento entre os ladrões, porém, mais tarde, depois ele traz-los para a forca.
                Valefar é considerado um bom familiar para os seus associadosaté que sejam apanhados na armadilha
                Ele comanda dez legiões de demônios", " *Você lê o pergaminho*
            `
        });
    }

    yield dialog.talk({ text: "Você pode ler o pergaminho a qualquer hora em quanto ele estiver no seu inventário." });
    yield dialog.talk({ text: "Você sai daquele lugar." });
    dialog.talk({
        text:
            "Logo na frente você encontra um grande corredor, com dois lados possíveis para ir, que parece dar em dois locais diferentes."
            + "\n Você deseja ir para esquerda ou para direita do corredor?",
        options: ["Esquerda ", "Direita"]
    });

    corredoresc = (yield).option

    if (corredoresc == 1) {

        yield dialog.talk({ text: "*Você vai pelo seu lado esquerdo.*" });
        yield dialog.talk({ text: "Você se encontra novamente em outra sala, e outro demônio está no seu caminho." });
        yield dialog.talk({ text: "Este parece ser mais forte que o anterior." });
        yield dialog.talk({ text: "- O que faz aqui " + classeAux + "?" });
        yield dialog.talk({ text: "- O que acha que faço aqui?! Vim para matar Valefar e recuperar a pedra celestial." });
        yield dialog.talk({ text: "- Tol[o/a/e]! Nunca irás recuperá-la! Em breve, todas as tropas infernais estarão subindo para superfície para iniciar o reinado de Lúcifer.", gender });
        yield dialog.talk({ text: "- Não deixarei isto acontecer!" });

        REFATORAR.combate("Demônio Herege")

        if (REFATORAR.gAtributos[VIDA][ATUAL] <= 0) {
            yield dialog.talk({ text: "GAME OVER" });
            REFATORAR.finalizaJogo();
        }

        yield dialog.talk({ text: "Ao derrotar o demônio, novamente, apenas suas roupas se encontram no chão, pois seu corpo se tornou cinzas." });
        dialog.talk({
            text: "Você deseja vasculhar as vestes?\n\n" + "1.   Sim\n\n" + "2.   Não"
        })

        if (recebeInteiro(2) == 1) {
            REFATORAR.itemGuardar("Poção de Cura")
            REFATORAR.itemGuardar("Poção de Restauração")
            REFATORAR.itemGuardar("Poção de Cura")
        }

        yield dialog.talk({ text: "Na mesma sala, você encontra um baú." });
        dialog.talk({
            text: "Gostaria de abrir o baú?",
            options: ["Sim", "Não"]
        })

        if ((yield).option == 1) {
            REFATORAR.lootAleatorio(bau);
        }

    }

    yield dialog.talk({
        text: `Você caminha por perto de uma espécie de muro. Muitos barulhos e gritos podem ser ouvidos.
        Você chega em uma sala muito escura. O calor naquele local causava um grande maú-estar.`});
    yield dialog.talk({ text: "Você acaba ascendendo um pequeno lampião que acabara de ver." });
    yield dialog.talk({
        text: `Por um momento, você olha para baixo e acaba vendo que há um pequeno lampião. Você liga ele.
      Ele parece usar uma espécie de combustível diferente que produzia uma luz branca suficientemente forte para clarear toda a sala.`});
    yield dialog.talk({ text: "Agora com a luz, você consegue se guiar pelo caminho escuro." });
    yield dialog.talk({ text: "O chão parece tremer de forma fraca." })
    yield dialog.talk({
        text: "O você chega a outra sala, agora, diferente da outra, esta iluminada pela luz emanada pelo mar de lava e fogo. \n"
            + "Você consegue ver tudo isto pois uma grande fenda esta aberta. \n Você também pode ver e ouvir diversas pessoas gritando, todas aqueles gritos eram do lado de fora. \n Ao examinar, também pode ver que todo esse local que você se encontra é algum tipo de 'construção infernal'."
    })
    yield dialog.talk({ text: "Você vê algum outro pilar, parecido com aquele já visto antes aqui perto, no qual se encontra um outro tipo de manuscrito." })

    dialog.talk({
        text: "Você deseja ler esse manuscrito?",
        options: ["Sim", "Não"]
    })
    if ((yield).option == 1) {
        yield dialog.talk({ text: "Valefar, em breve, estará preparado para iniciar a guerra. Lúcifer confia muito nele. \n Mal posso esperar para ver a feição de Lúcifer ao perceber que Valefar quer tomar seu lugar. \nSó espero que eu esteja do lado certo quando tudo terminar." })
        yield dialog.talk({ text: "*Valefar parece querer tomar o lugar de Lúcifer no domínio do plano terreno.* \n *Esse jogo político e religioso só parece piorar.* " })
        REFATORAR.itemGuardar("Manuscrito" + naoDescartavel);
    } else {
        yield dialog.talk({ text: "*Você pode acessar esse item na hora que você desejar.*" })
        REFATORAR.itemGuardar("Manuscrito" + naoDescartavel);
    }
    yield dialog.talk({ text: "Você continuar a caminhar e chega em uma sala. \nDe primeiro momento não percebe que nela há um ser bestial. Um demônio que parece ser de nível superior." })
    yield dialog.talk({ text: "- O que faz aqui, human[o/a/e] suj[o/a/e]?" })
    yield dialog.talk({ text: "- Vim para aniquilar Valefar." })
    yield dialog.talk({ text: "- HAHAHAHA - O demônio deu uma risada que arrepiaria qualquer pessoa - Você não é páreo sequer para mim." })
    yield dialog.talk({ text: "- É isso que iremos ver!" })

    REFATORAR.combate("Demônio Superior")

    if (REFATORAR.gAtributos[VIDA][ATUAL] <= 0) {

        yield dialog.talk({ text: "GAME OVER" })
        REFATORAR.finalizaJogo();

    }

    dialog.talk({
        text: "Você deseja vasculhar o corpo do demônio?",
        options: ["Sim", "Não"]
    })

    if (recebeInteiro(2) == 1) {
        REFATORAR.itemGuardar("Poção de Cura")
        REFATORAR.itemGuardar("Poção de Restauração")
        REFATORAR.itemGuardar("Poção de Cura")
    }

    yield dialog.talk({ text: "Você caminha até um portal, na qual há grandes portões de mármore negro." })
    yield dialog.talk({ text: "*Você empurra as grandes portas*" })
    yield dialog.talk({ text: "Você dá de cara com um ser de mais de 4 metros de alturas sentado em um grande trono. \n Ele possui grandes asas e corpo de cor preta." })

    dialog.talk({
        text: "O que você irá dizer?",
        options: ["Valefar, eu vim destruí-lo.", "*Ficar quiet[o/a/e].*", "Meu Deus, como você é feio!"],
        gender
    })


    switch ((yield).option) {
        case 1:
            yield dialog.talk({ text: "- Quem ousa me pertubar? - Valefar responde em alto tom." })
            yield dialog.talk({ text: `- Eu sou ${nome}, ${classeAux}, e vim parar você e seus planos.` })
            yield dialog.talk({ text: "- Você? HAHAHA - Ele ri - Você é um ser engraçado, talvez depois de toda essa guerra você não seja meu bicho de estimação." })
            break
        case 2:
            yield dialog.talk({ text: "*Ficar quieto*" })
            yield dialog.talk({ text: "*O demônio percebe sua presença*" })
            yield dialog.talk({ text: "- Quem ousa me pertubar? - Valefar responde em alto tom." })
            yield dialog.talk({ text: `- Eu sou ${nome}, ${classeAux}, e vim parar você e seus planos.` })
            break
        case 3:
            yield dialog.talk({ text: "- Meu Deus, você é horroroso. - Você fala." })
            yield dialog.talk({ text: "*O dêmonio olha para você com um olhar de ódio." })
            break
    }

    yield dialog.talk({ text: "- Como você chegou aqui, verme?" })

    dialog.talk({
        text: "Você responde:",
        options: ["Não te interessa.", "*Falar a verdade.*", "*Ficar quieto*"],
        gender
    })

    switch ((yield).option) {
        case 1:
            yield dialog.talk({ text: "Não te interessa. Só precisa saber que irei destruí-lo." })
            yield dialog.talk({ text: "- Pois iremos ver. - Valefar levanta do seu grande trono de pedra e pula em sua direção." })
            break
        case 2:
            yield dialog.talk({ text: "- Vim a mando dos sacerdotes da igreja da manhã." })
            yield dialog.talk({ text: "- Porcos imundos! Irei matá-lo!" })
            yield dialog.talk({ text: "*Valefar pula em sua direção.*" })
            break
        case 3:
            yield dialog.talk({ text: "*Você fica quieto*" })
            yield dialog.talk({ text: "*Valefar levanta de seu trono e pula em sua direção*" })
            break
    }

    combate("Valefar")

    if (REFATORAR.gAtributos[VIDA][ATUAL] <= 0) {
        yield dialog.talk({ text: "GAME OVER" })
        REFATORAR.finalizaJogo();
    }

    yield dialog.talk({ text: "Valefar agora está morto. Você acaba visualizando de longe algo muito brilhante. \nSua luz é parece com algo próximo de um arco íris. \n Você acaba percebendo que essa coisa brilhante nada mais é que a pedra celestial. \n*Você corre em direção do artefato*" })
    yield dialog.talk({ text: "*Você pega a pedra celestial*" })

    REFATORAR.itemGuardar("Pedra celestial" + naoDescartavel);

    yield dialog.talk({ text: "Ao virar para o lado, você toma um susto com a aparição do velho." })
    yield dialog.talk({ text: "- Parabéns Guardiã[o//e] você recuperou a pedra e salvou o nosso universo da dominação de Satanás. Muito obrigado.", gender })

    dialog.talk({
        text: "Você fala:",
        options: ["Descobri algumas coisas interessantes.", "*Se gabar.*", "Nada de obrigado. Quero minha recompensa!"]
    })

    let selectedOption = (yield).option

    do {
        switch (selectedOption) {
            case 1:

                yield dialog.talk({ text: "- Descobri que Valefar pretendia tomar o lugar de Lúcifer." })
                yield dialog.talk({ text: "- Isso é muito interessante. Sinceramente, é esperado coisas desse tipo por aqui. \nNós, da igreja da manhã, iremos ficar de olho por aqui." })
                break
            case 2:

                yield dialog.talk({ text: "- Mas é claro, eu sou demais..." })
                yield dialog.talk({ text: "- Por isso temos outras missões para você, guardião. - Fala o velho." })
                yield dialog.talk({ text: "- Que? - Você responde assustado." })
                yield dialog.talk({ text: "- Em breve falaremos mais sobre isto." })
                break
            case 3:
                yield dialog.talk({ text: "- Nada de obrigado. Quero minha recompensa." })
                yield dialog.talk({ text: "*O velho te dá uma porção de moedas*" })
                yield dialog.talk({ text: "- Só isso? - Você o pergunta." })
                yield dialog.talk({ text: "Por enquanto este é apenas o começo." })
                yield dialog.talk({ text: "- Apenas o começo?" })
                yield dialog.talk({ text: "- Sim, temos mais missões pra você." })
                yield dialog.talk({ text: "- Que?" })
                yield dialog.talk({ text: "- Em breve, iremos contar mais sobre isto para você." })
                break
        }

        dialog.talk({
            text: "Você fala:",
            options: ["Descobri algumas coisas interessantes.", "*Se gabar.*", "Nada de obrigado. Quero minha recompensa!", "Sair do Diálogo"]
        })
        selectedOption = (yield).option

    } while (selectedOption != 4)

    yield dialog.talk({ text: "Parabéns! Você terminou o jogo." })
    REFATORAR.menuCreditos();
}

