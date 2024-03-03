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
}



