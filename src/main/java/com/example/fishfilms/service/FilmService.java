package com.example.fishfilms.service;

import com.example.fishfilms.model.dto.Film;

public interface FilmService {

    Film getRandomFilm();

    Film getFilmById(String id);

}
