package idv.kuma.chap02.refactored.flag;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

import static java.awt.Color.BLACK;
import static java.awt.Color.RED;
import static java.awt.Color.YELLOW;

public class GermanFlag implements Flag {
    @Override
    public List<Color> getColors() {
        return Arrays.asList(BLACK, RED, YELLOW);
    }
}
