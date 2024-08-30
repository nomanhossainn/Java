package Fall2022;

public class Movie {
    private String name;
    protected String origin;
    public String genre;
    public float rating;

    public Movie(String name, String origin, String genre, float rating) {
        this.name = name;
        this.origin = origin;
        this.genre = genre;
        this.rating = rating;
    }

    public Movie(String name, String genre) {
        this.name = name;
        this.name = genre;
    }

    public String getName() {
        return name;
    }

    public String getOrigin() {
        return origin;
    }

    public void Details(){
        System.out.println("You are watching: " + name);
        System.out.println("Origin: " + origin);
        System.out.println("Genre: " + genre);
        System.out.println("Rating: " + rating);   
    }
}
