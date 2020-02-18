package weather;

public class WeatherConditionals {
    public static String getWeatherAdvice(int temperature, String description) {
        boolean windy = false;
        //

        if (description.indexOf("Windy") >= 0) {
            windy = true;
        }
        if (description.indexOf("Sunny") >= 0 && temperature == 100) {
            System.out.println("I DO NOT BELIEVE THIS. IT IS NOT TRUE.");
        }

    }
}
