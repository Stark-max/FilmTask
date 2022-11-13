package models;

import factories.Factory;
import models.soundtrack.Soundtrack;
import models.subtitle.Subtitle;
public class Film {
    private Soundtrack soundtrack;
    private Subtitle subtitle;

    public Film(Factory factory) {
        soundtrack = factory.createSoundtrack();
        subtitle = factory.createSubtitle();
    }

    public void play(){
        soundtrack.play();
        subtitle.play();
    }
}
