package idv.kuma.chap02.refactored.flag;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

import static java.awt.Color.BLUE;
import static java.awt.Color.RED;
import static java.awt.Color.WHITE;

public class FrenchFlag implements Flag {
    @Override
    public List<Color> getColors() {
        return Arrays.asList(BLUE, WHITE, RED);
    }
}
