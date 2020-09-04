
// klass som ska ärvas av måste vara open
// om klassen är abstract går det ej att skapa instanser (object) av klassen
abstract open class Pokemon(var name: String, var type : String) {
    open fun attack() {
        //println("$name (${this.javaClass.simpleName}) attacks!!") // skriver ut Klassnamnet
        println("$name attacks!!")
    }
}

class Pikachu(name: String) : Pokemon(name, "electric") {

    override fun attack() {
        println("Piika! Attack!")
    }
}

class Bulbasaur(name: String) : Pokemon(name, "grass") {

    fun talk() {
        println("Argh!")
    }
}