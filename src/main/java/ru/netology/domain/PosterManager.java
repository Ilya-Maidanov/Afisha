package ru.netology.domain;

public class PosterManager {
    private String[] filmsName = new String[0];
    private int limit;

    public PosterManager() {
        this.limit = 5;
    }

    public PosterManager(int limit) {
        this.limit = limit;
    }

    public void addFilm(String film) {
        String[] tmp = new String[filmsName.length + 1];
        for (int i = 0; i < filmsName.length; i++) {
            tmp[i] = filmsName[i];
        }
        tmp[tmp.length - 1] = film;
        filmsName = tmp;

    }

    public String[] findAll() {
        return filmsName;
    }

    public String[] findLast() {
        int resultLength;
        if (filmsName.length < limit) {
            resultLength = filmsName.length;
        } else {
            resultLength = limit;
        }
        String[] tmp = new String[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = filmsName[filmsName.length - 1 - i];
        }
        return tmp;
    }

}
