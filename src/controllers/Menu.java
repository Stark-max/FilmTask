package controllers;

import factories.EnglishFactory;
import factories.Factory;
import factories.RussianFactory;
import factories.SpanishFactory;
import models.Film;

import java.util.Scanner;

public class Menu {
    public static String LANGUAGE = "russian";


    public static Film configureFilm() {
        Scanner in = new Scanner(System.in);
        Factory factory = null;
        System.out.println("1.Russian\n2.English\n3.Spanish");
        System.out.println("Choose language of film(subtitles): ");
        switch (in.nextInt()) {
            case 1:
                LANGUAGE = "russian";
                break;
            case 2:
                LANGUAGE = "english";
                break;
            case 3:
                LANGUAGE = "spanish";
                break;
        }
        String lang = LANGUAGE.toLowerCase();
        switch (lang) {
            case "russian": {
                factory = new RussianFactory();
                break;
            }
            case "english": {
                factory = new EnglishFactory();
                break;
            }
            case "spanish": {
                factory = new SpanishFactory();
                break;
            }
            default: {
                System.out.println("Wrong language!");
            }

        }
        return new Film(factory);
    }
}
