public class Main {
    public static void main(String[] args) {
        Planet[] planets = Planet.values();
        for (Planet planet : planets) {
            System.out.println(planet + " " + planet.getFeature());
        }

    }
}