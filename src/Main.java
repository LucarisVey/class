public class Main {
    public static void main(String[] args) {
        Aircraft aircraft = new Aircraft();
        aircraft.setModel("F-16");
        aircraft.setSpeedMax(2410);
        aircraft.setYearOfFirstFlight(1974);
        System.out.println("Aircraft's model - " + aircraft.getModel());
        System.out.println("Aircraft's speed max - " + aircraft.getSpeedMax() + "km/h");
        System.out.println("Aircraft's year of first flight - " + aircraft.getYearOfFirstFlight());
    }
}