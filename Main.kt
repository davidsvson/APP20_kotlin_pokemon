fun main() {
    val p1 = Pikachu("David")
    val p2 = Pikachu("Laura")

    val b1 = Bulbasaur("Susan")
    val b2 = Bulbasaur("Lois")

   // val pokemon = Pokemon("Per", "water") // går ej eftersom Pokemon är abstract
    //println(b2.type)

    p1.attack()
    b1.attack()

    b2.talk()

    val pokedex = mutableListOf<Pokemon>()

    pokedex.add(p1)
    pokedex.add(p2)
    pokedex.add(b1)
    pokedex.add(b2)

    for (pokemon in pokedex) {
        pokemon.attack()
       // println(pokemon.name)
    }

    // currentPokemon är av typen Pokemon
    var currentPokemon : Pokemon = p1
    currentPokemon = b2

    currentPokemon.attack()


}