package com.example.fishfilms.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Film {
    private int id;
    private String original_title;
    private String backdrop_path;
    private String overview;
    private String release_date;
}
