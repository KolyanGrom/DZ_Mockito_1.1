import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmRepositoryTest {

    PosterItems item1 = new PosterItems(1, "Боевик", "Бладшот");
    PosterItems item2 = new PosterItems(2, "Мультфильм", "Вперёд");
    PosterItems item3 = new PosterItems(3, "Комедия", "Отель Белград");
    PosterItems item4 = new PosterItems(4, "Боевик", "Джентельмены");
    PosterItems item5 = new PosterItems(5, "Ужасы", "Человек-невидимка");
    PosterItems item6 = new PosterItems(6, "Мультфильм", "Тролли. Мировой тур");
    PosterItems item7 = new PosterItems(7, "Комедия", "Номер один");


    @Test
    public void addNewFilm() {
        FilmRepository repo = new FilmRepository();
        repo.save(item1);
        repo.save(item2);
        repo.save(item3);
        repo.save(item4);
        repo.save(item5);
        repo.save(item6);
        repo.save(item7);

        PosterItems[] expected = {item1, item2, item3, item4, item5, item6, item7};
        PosterItems[] actual = repo.getItems();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldIdFilm() {
        FilmRepository repo = new FilmRepository();
        repo.save(item2);


        int expected = 2;
        int actual = item2.getId();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    void removeFilm() {
        FilmRepository repo = new FilmRepository();
        repo.save(item1);
        repo.save(item2);
        repo.save(item3);
        repo.save(item4);
        repo.save(item5);
        repo.save(item6);
        repo.save(item7);
        repo.removeFilm(item2.getId());

        PosterItems[] expected = {item1, item3, item4, item5, item6, item7};
        PosterItems[] actual = repo.getItems();

        Assertions.assertArrayEquals(expected, actual);
    }
}
