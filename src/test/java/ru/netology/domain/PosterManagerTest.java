package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {
    @Test
    public void shouldAddOneFilms() {
        PosterManager manager = new PosterManager();
        manager.addFilm("Бладшот");

        manager.findAll();

        String[] expected = {"Бладшот"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldAddTwoFilms() {
        PosterManager manager = new PosterManager();
        manager.addFilm("Бладшот");
        manager.addFilm("Вперед");

        manager.findAll();

        String[] expected = {"Бладшот", "Вперед"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldAddAllFilms() {
        PosterManager manager = new PosterManager();
        manager.addFilm("Бладшот");
        manager.addFilm("Вперед");
        manager.addFilm("Отель Белград");
        manager.addFilm("Джентельмены");
        manager.addFilm("Человек-невидимка");
        manager.addFilm("Тролли. Мировой тур.");
        manager.addFilm("Номер один");

        manager.findAll();

        String[] expected = {"Бладшот", "Вперед", "Отель Белград", "Джентельмены", "Человек-невидимка", "Тролли. Мировой тур.", "Номер один"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldAddFourFiveFilms() {
        PosterManager manager = new PosterManager();
        manager.addFilm("Бладшот");
        manager.addFilm("Вперед");
        manager.addFilm("Отель Белград");
        manager.addFilm("Джентельмены");
        manager.addFilm("Человек-невидимка");
        manager.addFilm("Тролли. Мировой тур.");
        manager.addFilm("Номер один");

        manager.findLast();

        String[] expected = {"Номер один", "Тролли. Мировой тур.", "Человек-невидимка", "Джентельмены", "Отель Белград"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldThreeFilmsIfFourLimit() {
        PosterManager manager = new PosterManager(4);
        manager.addFilm("Бладшот");
        manager.addFilm("Вперед");
        manager.addFilm("Отель Белград");

        manager.findAll();

        String[] expected = {"Бладшот", "Вперед", "Отель Белград"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldLastThreeFilmsIfFourLimit() {
        PosterManager manager = new PosterManager(4);
        manager.addFilm("Бладшот");
        manager.addFilm("Вперед");
        manager.addFilm("Отель Белград");

        manager.findLast();

        String[] expected = {"Отель Белград", "Вперед", "Бладшот"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldLastFourFilmsIfFourLimit() {
        PosterManager manager = new PosterManager(4);
        manager.addFilm("Бладшот");
        manager.addFilm("Вперед");
        manager.addFilm("Отель Белград");
        manager.addFilm("Джентельмены");

        manager.findLast();

        String[] expected = {"Джентельмены", "Отель Белград", "Вперед", "Бладшот"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldLastThreeFilmsIfThreeLimitAddFiveFilms() {
        PosterManager manager = new PosterManager(3);
        manager.addFilm("Бладшот");
        manager.addFilm("Вперед");
        manager.addFilm("Отель Белград");
        manager.addFilm("Джентельмены");
        manager.addFilm("Человек-невидимка");

        manager.findLast();

        String[] expected = {"Человек-невидимка", "Джентельмены", "Отель Белград"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

}
