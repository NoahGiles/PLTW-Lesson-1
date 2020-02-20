package weather;

public class WeatherConditionals
{
    public static String getWeatherAdvice(int temperature, String description)
    {
        boolean windy = false;

        if (description.indexOf("Windy") >= 0)
        {
            windy = true;
        }
        if (description.indexOf("Sunny") >= 0 && temperature == 100) {
            System.out.println("I DO NOT BELIEVE THIS. IT IS NOT TRUE.");
        }
        else if (temperature > 30)
        {
        if (windy == true)
        {
            System.out.println("Too windy or cold! Enjoy watching the weather through the window.");
        }
        else
            {
                System.out.println("It's safe to go outside, " + temperature + " degrees and " + description + ".");
            }
        }
        return description;
    }
}
