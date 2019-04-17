public class FleetOfThings {

  public static void main(String[] args) {
    Fleet fleet = new Fleet();
    // Create a fleet of things to have this output:
    // 1. [ ] Get milk
    // 2. [ ] Remove the obstacles
    // 3. [x] Stand up
    // 4. [x] Eat lunch

    fleet.add(new Thing("Get milk"));
    fleet.add(new Thing("Remove the obstacles"));
    fleet.add(new Thing("Stand up"));
    fleet.add(new Thing("Eat lunch"));

    for (int i = 0; i < fleet.getSize() ; i++) {
      if (i >1) {
        fleet.getThing(i).complete();
      }
    }

    System.out.println(fleet);
  }
}
