import { MainMenu } from "../views/main-menu.js"
import { InGameView } from "../views/in-game-view/index.js"

export class WindowManager {

    windows

    constructor() {
        this.windows = {
            mainMenu: new MainMenu(),
            inGameView: new InGameView()
        }

        this.windows.mainMenu.buttonPlay.addEventListener("click", (event) => this.play(event));
    }

    changeWindow(windowName) {
        for (let window of Object.values(this.windows)) {
            console.log(this.windows)
            window.hided = true
        }
        this.windows[windowName].hided = false;
    }


    play(event) {
        event.preventDefault();
        this.changeWindow("inGameView");
    }


}