package factories;

import models.soundtrack.RussianSoundtrack;
import models.soundtrack.Soundtrack;
import models.subtitle.RussianSubtitle;
import models.subtitle.Subtitle;

public class RussianFactory implements Factory {
    @Override
    public Soundtrack createSoundtrack() {
        return new RussianSoundtrack();
    }

    @Override
    public Subtitle createSubtitle() {
        return new RussianSubtitle();
    }
}
