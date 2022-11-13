package factories;

import models.soundtrack.Soundtrack;
import models.soundtrack.SpanishSoundtrack;
import models.subtitle.SpanishSubtitle;
import models.subtitle.Subtitle;

public class SpanishFactory implements Factory {
    @Override
    public Soundtrack createSoundtrack() {
        return new SpanishSoundtrack();
    }

    @Override
    public Subtitle createSubtitle() {
        return new SpanishSubtitle();
    }
}
