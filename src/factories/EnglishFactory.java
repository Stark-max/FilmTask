package factories;

import models.soundtrack.EnglishSoundtrack;
import models.soundtrack.Soundtrack;
import models.subtitle.EnglishSubtitle;
import models.subtitle.Subtitle;

public class EnglishFactory implements Factory {
    @Override
    public Soundtrack createSoundtrack() {
        return new EnglishSoundtrack();
    }

    @Override
    public Subtitle createSubtitle() {
        return new EnglishSubtitle();
    }
}
