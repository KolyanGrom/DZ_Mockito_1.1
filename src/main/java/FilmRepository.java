class PosterItems {
    private int id;
    private String genreFilm;
    private String filmName;

    public PosterItems(int id, String genreFilm, String filmName) {
        this.id = id;
        this.genreFilm = genreFilm;
        this.filmName = filmName;
    }
}

public class FilmRepository {
    private PosterItems[] items = new PosterItems[0];
    private int limit;

    public FilmRepository() {
        this.limit = 5;
    }

    public FilmRepository(int limit) {
        this.limit = limit;
    }

    public void add(PosterItems item) {
        PosterItems[] tmp = new PosterItems[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];

        }
        tmp[tmp.length - 1] = item;
        items = tmp;
    }

    public PosterItems[] findAll() {
        return items;
    }

    public PosterItems[] findLast() {
        int resultLenght;
        if (limit < items.length) {
            resultLenght = limit;
        } else {
            resultLenght = items.length;
            ;
        }

        PosterItems[] result = new PosterItems[resultLenght];
        for (int i = 0; i < resultLenght; i++) {
            result[i] = items[items.length - 1 - i];
        }
        return result;
    }
}