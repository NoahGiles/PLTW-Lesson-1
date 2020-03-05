package MediaLib;

public class Books {
    private String title;
    private int rating;
    private int x;

    public Books() {
        //initialize instance variables
        title = "";
        rating = 2;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String t) {
        title = t;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int u) {
        rating = u;
    }
}