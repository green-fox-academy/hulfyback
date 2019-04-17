public class Main {
  public static void main(String[] args) {
    Station station = new Station();

    Car car1 = new Car();
    Car car2 = new Car();
    Car car3 = new Car();

    station.refill(car1);
    station.refill(car2);
    station.refill(car3);

    System.out.println(station.getGasAmount());
  }
}
