package idv.kuma.chap02.refactored;

import idv.kuma.chap02.refactored.flag.*;

import java.awt.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.awt.Color.*;

public class FlagColors {

    public static final Map<String, Flag> flags = new HashMap<>();

    static {
        flags.put("Dutch", new DutchFlag());
        flags.put("German", new GermanFlag());
        flags.put("Belgian", new BelgianFlag());
        flags.put("French", new FrenchFlag());
        flags.put("Italian", new ItalianFlag());
        flags.put("Taiwanese", new TaiwaneseFlag());
        flags.put("Unclassified", new DefaultFlag());
    }

    public List<Color> getFlagColors(String nationality) {

        Flag flag = flags.get(nationality);

        return (flag == null ? new DefaultFlag() : flag).getColors();
    }
}
