public class FilmManager {

    private FilmRepository repo;

    public FilmManager(FilmRepository repo) {
        this.repo = repo;
    }

    public PosterItems[] getItems() {

        PosterItems[] all = repo.getItems();
        PosterItems[] reversed = new PosterItems[all.length];
        for (int x = 0; x < reversed.length; x++) {
            reversed[x] = all[all.length - 1 - x];
        }
        return reversed;
    }

    public void findAll(PosterItems item) {
        repo.save(item);
    }

    public void findLast(PosterItems item) {
        repo.save(item);
    }

}
