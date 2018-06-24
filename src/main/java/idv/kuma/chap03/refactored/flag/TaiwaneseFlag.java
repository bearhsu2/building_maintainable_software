package idv.kuma.chap03.refactored.flag;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

import static java.awt.Color.BLUE;
import static java.awt.Color.RED;
import static java.awt.Color.WHITE;

public class TaiwaneseFlag implements Flag {
    @Override
    public List<Color> getColors() {
        return Arrays.asList(RED, WHITE, BLUE);
    }
}
