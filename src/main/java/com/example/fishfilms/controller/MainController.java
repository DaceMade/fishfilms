package com.example.fishfilms.controller;

import com.example.fishfilms.model.dto.Film;
import com.example.fishfilms.model.entity.DirectorEntity;
import com.example.fishfilms.model.entity.FilmsEntity;
import com.example.fishfilms.model.entity.ViewsEntity;
import com.example.fishfilms.repository.FilmsRepository;
import com.example.fishfilms.service.FilmService;
import com.example.fishfilms.service.UserService;
import com.example.fishfilms.service.ViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    @Autowired
    FilmService filmService;

    @Autowired
    UserService userService;

    @Autowired
    ViewService viewService;

    @GetMapping(path = "/films")
    public String filmPage(Model model){
        Film film = filmService.getRandomFilm();
        model.addAttribute("filmName", film.getOriginal_title());
        model.addAttribute("filmOverview", film.getOverview());
        model.addAttribute("filmId", film.getId());
        model.addAttribute("filmPic", "https://image.tmdb.org/t/p/original/" + film.getBackdrop_path());
        return "films.html";
    }

    @GetMapping(path = "/directors")
    public String directorsPage(){
        return "directors.html";
    }

    @GetMapping(path = "/login")
    public String loginPage(){
        return "login.html";
    }

    @GetMapping(path = "/profile")
    public String profilePage(@AuthenticationPrincipal OAuth2User user, Model model) {
        model.addAttribute("pic", user.getAttribute("picture"));
        model.addAttribute("name", user.getAttribute("name"));
        userService.saveNewUser(user.getAttribute("name"));
        return "profile.html";
    }

    @PostMapping(path = "/like/{id}")
    public String like(@AuthenticationPrincipal OAuth2User user, @PathVariable String id){
        String name = user.getAttribute("name");
        Film film = filmService.getFilmById(id);
        FilmsEntity test = FilmsEntity.builder()
                .name(film.getOriginal_title())
                .genre("safs")
                .year(12)
                .directorId(DirectorEntity.builder().name("df").img("dd").build())
                .img("ds")
                .build();
        viewService.saveView(test, userService.getUserByName(name));
        return "redirect:/films";
    }
}
