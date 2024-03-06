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
        repo.add(item1);
        repo.add(item2);
        repo.add(item3);
        repo.add(item4);
        repo.add(item5);
        repo.add(item6);
        repo.add(item7);

        PosterItems[] expected = {item1, item2, item3, item4, item5, item6, item7};
        PosterItems[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAllFilm() {
        FilmRepository repo = new FilmRepository(7);
        repo.add(item1);
        repo.add(item2);
        repo.add(item3);
        repo.add(item4);
        repo.add(item5);
        repo.add(item6);
        repo.add(item7);

        PosterItems[] expected = {item7, item6, item5, item4, item3, item2, item1};
        PosterItems[] actual = repo.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void removeHigherLimitFilm() {
        FilmRepository repo = new FilmRepository(10);
        repo.add(item1);
        repo.add(item2);
        repo.add(item3);
        repo.add(item4);
        repo.add(item5);
        repo.add(item6);
        repo.add(item7);

        PosterItems[] expected = {item7, item6, item5, item4, item3, item2, item1};
        PosterItems[] actual = repo.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void removeMinLimitFilm() {
        FilmRepository repo = new FilmRepository(4);
        repo.add(item1);
        repo.add(item2);
        repo.add(item3);
        repo.add(item4);
        repo.add(item5);
        repo.add(item6);
        repo.add(item7);

        PosterItems[] expected = {item7, item6, item5, item4};
        PosterItems[] actual = repo.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}