/**

  * This class adds the hero observer
  *
  * @author Ivan Torriani
  * @version 1.0
  *
  */

public class HeroObserver implements WeatherObserver {

    private String name;

    public HeroObserver(String name) {
        this.name = name;
    }

    @Override
    public void updateWeather(String newWeather) {
        System.out.println("Hero " + name + " reacots to " + newWeather + " weather");
    }
}
