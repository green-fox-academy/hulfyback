import solutions.conditionals.*;
import solutions.printing.*;
import solutions.types.*;
import solutions.userinput.AnimalsAndLegs;
import solutions.userinput.AverageOfInput;
import solutions.userinput.HelloUser;
import solutions.userinput.MileToKmConverter;
import solutions.variables.*;

public class Main {
  public static void main(String[] args) {
    // printing
    HelloMe.greeting("Zsolt");
    String[] names = {"Bor", "Chris", "Róza"};
    HelloOthers.greetingOthers(names);
    HumptyDumpty.humpty();

    //types
    IntroduceYourself.introduce("Zsolt", 35, 1.94f);
    TwoNumbers.twoNumbers(13, 22);
    CodingHours.codingHours(6, 17);

    //variables
    FavoriteNumber.favoriteNumber(5);
    Swap.swap(123, 526);
    Bmi.bmi();
    DefineBasicInfo.defineBasicInfo("Zsolt", 35, 1.94, false);
    VariableMutation.variableMutation();
    Cuboid.cuboid(12.5d, 24d, 3.67d);
    SecondsInADay.secondsInADay(14, 34, 42);

    //userinput
    HelloUser.helloUser();
    MileToKmConverter.mileToKmConverter();
    AnimalsAndLegs.animalsAndLegs();
    AverageOfInput.averageOfInput(5);

    //conditionals
    OddEven.oddEven();
    OneTwoALot.oneTwoALot();
    PrintBigger.printBigger();
    PartyIndicator.partyIndicator();
    ConditionalVariableMutation.conditionalVariableMutation();
  }
}