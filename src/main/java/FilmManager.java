public class FilmManager {

    private FilmRepository repo;
    private PosterItems[] items = new PosterItems[0];

    public FilmManager(FilmRepository repo) {
        this.repo = repo;
    }

    public void add(PosterItems item) {
        repo.save(item);
    }

    public PosterItems[] getItems() {

        PosterItems[] all = repo.getItems();
        PosterItems[] reversed = new PosterItems[all.length];
        for (int x = 0; x < reversed.length; x++) {
            reversed[x] = all[all.length - 1 - x];
        }
        return reversed;
    }


    public PosterItems[] getItemsReverse() {

        PosterItems[] all = repo.getItems();
        return all;
    }

    public PosterItems[] getfindLast() {

        PosterItems[] all = repo.getItems();
        int[] resultLength = new int[5];
        PosterItems[] reversed = new PosterItems[resultLength.length];
        for (int x = 0; x < reversed.length; x++) {
            reversed[x] = all[all.length - 1 - x];
        }
        return reversed;
    }

}
