package AnimePage;

/**
 * Created by traitorwtf on 27.04.2017.
 */
public class Anime {
    private int id;
    private String name;
    private int data;
    private String genre;
    private String studio;
    private int position;
    private double rating;
    private int series;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "AnimePage{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", data=" + data +
                ", genre='" + genre + '\'' +
                ", studio='" + studio + '\'' +
                ", position=" + position +
                ", rating=" + rating +
                ", series=" + series +
                '}';
    }
}
