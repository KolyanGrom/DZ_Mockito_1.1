import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {

    FilmRepository repo = new FilmRepository();
    FilmManager manager = new FilmManager(repo);
    PosterItems item1 = new PosterItems(1, "Боевик", "Бладшот");
    PosterItems item2 = new PosterItems(2, "Мультфильм", "Вперёд");
    PosterItems item3 = new PosterItems(3, "Комедия", "Отель Белград");
    PosterItems item4 = new PosterItems(4, "Боевик", "Джентельмены");
    PosterItems item5 = new PosterItems(5, "Ужасы", "Человек-невидимка");
    PosterItems item6 = new PosterItems(6, "Мультфильм", "Тролли. Мировой тур");
    PosterItems item7 = new PosterItems(7, "Комедия", "Номер один");

    @BeforeEach
    public void setup() {
        manager.findAll(item1);
        manager.findAll(item2);
        manager.findAll(item3);
        manager.findAll(item4);
        manager.findAll(item5);
        manager.findAll(item6);
        manager.findAll(item7);
    }


    @Test
    public void shouldReversAllFilms() {

        PosterItems[] expected = {item7, item6, item5, item4, item3, item2, item1};
        PosterItems[] actual = manager.getItems();

        Assertions.assertArrayEquals(expected, actual);

    }
}
