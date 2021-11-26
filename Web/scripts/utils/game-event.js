export class GameEvent {

    callbacks = []

    addListener = (callback) => this.callbacks.push(callback)

    raise = (context) => this.callbacks.forEach((callback) => callback(context))
}