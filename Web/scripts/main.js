import { WindowManager } from "./utils/window-manager.js"
import { Character } from "./models/character.js"
import { NarrativeScript } from "./controllers/narrative-script.js"

let url = 'assets/characters.json';
let windowManager = new WindowManager();

const gen = NarrativeScript(windowManager.windows.inGameView.dialog);

function test(context) {
    gen?.next(context);
}

test();
windowManager.windows.inGameView.dialog.onProceed.addListener(test);


fetch(url)
    .then(res => res.json())
    .then(dados => {
        for (let dadoPersonagem of Object.values(dados)) {
            console.log(new Character(dadoPersonagem))
        }
    })
    .catch(err => { throw err });


