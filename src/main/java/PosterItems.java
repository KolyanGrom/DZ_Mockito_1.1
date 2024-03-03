public class PosterItems {
    private int id;
    private String genreFilm;
    private String filmName;


    public PosterItems(int id, String genreFilm, String filmName) {
        this.id = id;
        this.genreFilm = genreFilm;
        this.filmName = filmName;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getgenreFilm() {
        return genreFilm;
    }

    public void setgenreFilm(String genreFilm) {
        this.genreFilm = genreFilm;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setProductName(String filmName) {
        this.filmName = filmName;
    }
}
