public class WeatherStone {

    private static WeatherStone instance;
    private String currentWeather;

    private WeatherStone() {
        currentWeather = "sunny";
    }

    public static WeatherStone getInstance() {
        if (instance == null) {
            instance = new WeatherStone();
        }
        return instance;
    }

    public String getWeather() {
        return currentWeather;
    }

    public void setWeather(String newWeather) {
        currentWeather = newWeather;
    }
}
