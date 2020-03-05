package MediaLib;

public class Song {

    private String title;
    private int rating;
    private double price;
    private Boolean favorite;
    public Song()
    {
        //initialize instance variables
        title = "";
        rating = 0;
        price = 0.0;
    }
    public String getTitle()
    {
        return title;
    }
    public void setTitle(String t) {
        title = t;
    }
    public int getRating()
    {
        return rating;
    }

    public void setRating(int u)
    {
        rating = u;
    }
    public double getPrice ()
    {
        return price;
    }
    public void setPrice (double v)
    {
        price = v;
    }
    public void addToFavorites()
    {
    favorite = true;
    }
    public Song(String title, double price, int rating)
    {
        this.title = title;
        this.price = price;
        this.rating = rating;
    }
}
