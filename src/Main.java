import controllers.Menu;
import factories.EnglishFactory;
import factories.Factory;
import factories.RussianFactory;
import factories.SpanishFactory;
import models.Film;

import static controllers.Menu.configureFilm;

public class Main {


    public static void main(String[] args) {
        Film film = configureFilm();
        film.play();

    }


}