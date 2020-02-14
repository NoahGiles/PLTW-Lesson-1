public class Movies {
    private String title;
    private int rating;
    private int x;
    private int duration;
    private int numSongs;
    public Movies() {
        //initialize instance variables
        title = "";
        rating = 4;
        duration = 2;
    }
    public String getTitle()
    {
        return title;
    }
    public void setTitle(String t)
    {
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
    public int getDuration()
    {
        return duration;
    }
    public void setDuration(int v)
    {
        duration = v;
    }
    public int getNumSongs()
    {
        return numSongs;
    }
    public void setNumSongs(int w)
    {
        numSongs = w;
    }

}