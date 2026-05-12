/**

  * This class adds the SpeedBost on top of the monstor observer
  *
  * @author Ivan Torriani
  * @version 1.0
  *
  */

public class MonsterObserver implements WeatherObserver {

    private String name; //create name variable

    public MonsterObserver(String name) {

        this.name = name; //initialize
    }

    @Override
    public void updateWeather(String newWeather) {

        System.out.println("Monster " + name + " reacts to " + newWeather + " weather"); //'notify'
    }
}
