package factories;

import models.soundtrack.Soundtrack;
import models.subtitle.Subtitle;

public interface Factory {
    Soundtrack createSoundtrack();
    Subtitle createSubtitle();
}
