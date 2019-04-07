package solutions;

import java.util.ArrayList;

public class Josephus {

  public static ArrayList<Integer> getPossibleWinningPositions(ArrayList<Integer> positions){
    int lastIndexOfPositions = positions.size() - 1;
    int countOfPositions = positions.size();
    ArrayList<Integer> possibleWinningPositions = new ArrayList<Integer>();

    for (int i =  0; i < countOfPositions; i += 2) {
      possibleWinningPositions.add(positions.get(i));
    }

    int lastIndexOfPossibleWinningPositions = possibleWinningPositions.size() - 1;

    if (possibleWinningPositions.get(lastIndexOfPossibleWinningPositions) == positions.get(lastIndexOfPositions)){
      possibleWinningPositions.add(0, possibleWinningPositions.get(lastIndexOfPossibleWinningPositions));
      possibleWinningPositions.remove(possibleWinningPositions.size() - 1);
      return possibleWinningPositions;
    }else {
      return possibleWinningPositions;
    }
  }

  public static int getJosephusNumber(int number){
    ArrayList<Integer> possibleWinningPositions = new ArrayList<>();

    for (int i = 1; i <= number ; i++) {
      possibleWinningPositions.add(i);
    }
    while (true) {
      if (possibleWinningPositions.size() == 1) {
        break;
      } else {
        ArrayList<Integer> temp = getPossibleWinningPositions(possibleWinningPositions);
        possibleWinningPositions = temp;
      }
    }
    return possibleWinningPositions.get(0);
  }
}