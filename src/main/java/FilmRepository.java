public class FilmRepository {
    private PosterItems[] items = new PosterItems[0];


    public void save(PosterItems item) {
        PosterItems[] tmp = new PosterItems[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];

        }
        tmp[tmp.length - 1] = item;
        items = tmp;

    }

    public PosterItems[] getItems() {
        return items;
    }

    public void removeFilm(int id) {

        PosterItems[] tmp = new PosterItems[items.length - 1];
        int copyToIndex = 0;
        for (PosterItems item : items) {
            if (item.getId() != id) {
                tmp[copyToIndex] = item;
                copyToIndex++;
            }
        }
        items = tmp;

    }
}





