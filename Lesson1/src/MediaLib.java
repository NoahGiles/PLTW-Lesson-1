public class MediaLib {
    public static void main(String[] args)
    {
        System.out.println("Welcome to your media library");
        Song song1 = new Song("The Floor", .99, 5);
        Song song2 = new Song("The Roof", 1.29, 2);
        Song song3 = new Song("Ceiling", 4.58, 3);
        Song song4 = new Song("The Cyst", .99, 5);
        Song song5 = new Song("The Wall", 1.29, 4);
        Song song6 = new Song("What the Heck", 2.99, 1);
        Song song7 = new Song("Okay", .99, 3);
        double totalCost = song1.getPrice() + song2.getPrice() + song3.getPrice() + song4.getPrice() +
                song5.getPrice() + song6.getPrice() + song7.getPrice();
        int totalRatings = song1.getRating() + song2.getRating() + song3.getRating() + song4.getRating() +
                song5.getRating() + song6.getRating() + song7.getRating();
        Movies movies1 = new Movies();
        Books books1 = new Books();
        int numSongs = 0;
        double avgCost;
        int avgRating;

        //totalCost.setScale();
        System.out.println(song1);


//        song1.setTitle("Johnny B. Goode");
//        song1.setRating(3);
//        song1.setPrice(90.00);
        System.out.println("Title : " + song1.getTitle() + " Price : " + song1.getPrice() + " Rating : "
                + song1.getRating());
        ++numSongs;
        System.out.println("Title : " + song2.getTitle() + " Price : " + song2.getPrice() + " Rating : "
                + song2.getRating());
        ++numSongs;
        System.out.println("Title : " + song3.getTitle() + " Price : " + song3.getPrice() + " Rating : "
                + song3.getRating());
        ++numSongs;
        System.out.println("Title : " + song4.getTitle() + " Price : " + song4.getPrice() + " Rating : "
                + song4.getRating());
        ++numSongs;
        System.out.println("Title : " + song5.getTitle() + " Price : " + song5.getPrice() + " Rating : "
                + song5.getRating());
        ++numSongs;
        System.out.println("Title : " + song6.getTitle() + " Price : " + song6.getPrice() + " Rating : "
                + song6.getRating());
        ++numSongs;
        System.out.println("Title : " + song7.getTitle() + " Price : " + song7.getPrice() + " Rating : "
                + song7.getRating());
        ++numSongs;
        avgCost = totalCost / numSongs;
        avgRating = totalRatings / numSongs;
        System.out.println("There are a total of " + numSongs + " songs.");
        System.out.println("The total rating of all of the songs is " + totalRatings + ".");
        System.out.println("Average song cost : " + avgCost + ".");
        System.out.println("Average song rating : " + avgRating + ".");
        System.out.println();
        song1.addToFavorites();
        System.out.println(totalCost);
        movies1.setTitle("George");
        System.out.println("Title : " + movies1.getTitle());
        movies1.setRating(4);
        System.out.println("Rating : " + movies1.getRating());
        movies1.setDuration(199);
        books1.setTitle("Mother");
        System.out.println("Title : " + books1.getTitle());
        books1.setRating(2);
        System.out.println("Rating : " + books1.getRating());
    }
}
