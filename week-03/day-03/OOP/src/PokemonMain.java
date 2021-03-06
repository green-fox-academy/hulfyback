import java.util.ArrayList;
import java.util.List;

public class PokemonMain {
  public static void main(String[] args) {
    List<Pokemon> pokemonOfAsh = initializePokemons();

    // Every pokemon has a name and a type.
    // Certain types are effective against others, e.g. water is effective against fire.

    // Ash has a few pokemon.
    // A wild pokemon appeared!

    Pokemon wildPokemon = new Pokemon("Oddish", "leaf", "water");

    // Which pokemon should Ash use?

    Pokemon chosenOne = choosePokemons(pokemonOfAsh, wildPokemon);

    System.out.print("I choose you, " + chosenOne.getName());
  }

  private static Pokemon choosePokemons(List<Pokemon> pokemons, Pokemon enemy){
    List<Pokemon> possiblePokemons = new ArrayList<>();

    for (Pokemon pokemon : pokemons) {
      if (pokemon.isEffectiveAgainst(enemy)) {
        possiblePokemons.add(pokemon);
      }
    }

    return getRandomPokemon(possiblePokemons);
  }

  private static Pokemon getRandomPokemon(List<Pokemon> pokemons) {
    return pokemons.get((int) (Math.random() * pokemons.size()));
  }

  private static List<Pokemon> initializePokemons() {
    List<Pokemon> pokemon = new ArrayList<>();

    pokemon.add(new Pokemon("Balbasaur", "leaf", "water"));
    pokemon.add(new Pokemon("Pikatchu", "electric", "water"));
    pokemon.add(new Pokemon("Charizard", "fire", "leaf"));
    pokemon.add(new Pokemon("Balbasaur", "water", "fire"));
    pokemon.add(new Pokemon("Kingler", "water", "fire"));

    return pokemon;
  }
}
