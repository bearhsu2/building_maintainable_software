package idv.kuma.chap03.better.flag;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

import static java.awt.Color.GRAY;

public class DefaultFlag implements Flag {
    @Override
    public List<Color> getColors() {
        return Arrays.asList(GRAY);
    }
}
