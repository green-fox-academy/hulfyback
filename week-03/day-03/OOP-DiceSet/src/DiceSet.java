import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiceSet {
    ArrayList<Integer> dice = new ArrayList<>();
    int countOfRolls = 0;

    public List<Integer> roll() {
        for (int i = 0; i < 6; i++) {
            dice.add((int) (Math.random() * 6) + 1);
        }
        return dice;
    }

    public List<Integer> getCurrent() {
        return dice;
    }

    public int getSize() {
        return this.dice.size();
    }

    public int getCurrent(int i) {
        return dice.get(i);
    }

    public void reroll() {
        for (int i = 0; i < dice.size(); i++) {
            dice.set(i, (int) (Math.random() * 6) + 1);
        }
        countOfRolls++;
    }

    public void reroll(int k) {
        dice.set(k, (int) (Math.random() * 6) + 1);
        countOfRolls++;
    }

    public ArrayList<Integer> getNoSixes() {
        ArrayList<Integer> noSixes = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            if (this.getCurrent(i) != 6) {
                noSixes.add(i);
            }
        }

        return noSixes;
    }

    public static void main(String[] args) {
        // You have a `DiceSet` class which has a list for 6 dice
        // You can roll all of them with roll()
        // Check the current rolled numbers with getCurrent()
        // You can reroll with reroll()
        // Your task is to roll the dice until all of the dice are 6

        DiceSet diceSet = new DiceSet();
        System.out.println(diceSet.roll());

        while (true) {
            for ( int i : diceSet.getNoSixes()){
                diceSet.reroll(i);
            }
            if (diceSet.getNoSixes().isEmpty()) {
                System.out.println("rolls: " + diceSet.countOfRolls);
                System.out.println(diceSet.getCurrent());
                break;
            }
        }
    }
}
