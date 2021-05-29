package com.example.fishfilms.service.impl;

import com.example.fishfilms.model.dto.Film;
import com.example.fishfilms.service.FilmService;
import com.google.gson.Gson;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Random;

@Service
public class FilmServiceImpl implements FilmService {
    private static final String HOST = "https://api.themoviedb.org/3/movie/";
    private static final String KEY = "f48016bb1769345bd698c211ed425c48";
    private static final int FILM_CAPACITY = 1000;

    @Override
    public Film getRandomFilm() {
        Random random = new Random();
        OkHttpClient client = new OkHttpClient();
        try {
            Response response;
            Film film = null;
            do {
                Request randomFilmRequest = new Request.Builder()
                        .url(HOST + random.nextInt(FILM_CAPACITY) + "?api_key=" + KEY)
                        .get()
                        .build();
                response = client.newCall(randomFilmRequest).execute();
                System.out.println(response.toString());
                if (response.code() != 404) {
                    Gson g = new Gson();
                    film = g.fromJson(response.body().string(), Film.class);
                }
            } while (response.code() == 404 || film.getBackdrop_path() == null);
            return film;
        } catch (IOException e) {
            System.out.println("Error");
        }
        return null;
    }

    @Override
    public Film getFilmById(String id) {
        OkHttpClient client = new OkHttpClient();
        try {
            Response response;
            Film film = null;
            Request randomFilmRequest = new Request.Builder()
                    .url(HOST + id + "?api_key=" + KEY)
                    .get()
                    .build();
            response = client.newCall(randomFilmRequest).execute();
            System.out.println(response.toString());
            if (response.code() != 404) {
                Gson g = new Gson();
                film = g.fromJson(response.body().string(), Film.class);
            }
            return film;
        } catch (IOException e) {
            System.out.println("Error");
        }
        return null;
    }


}
