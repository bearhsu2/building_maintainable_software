package idv.kuma.chap02.bad;

import java.awt.Color;
import java.util.Arrays;
import java.util.List;

import static java.awt.Color.*;

public class FlagColors {

    public List<Color> getFlagColors(String nationality) {

        List<Color> result;
        switch (nationality) {
            case "Dutch":
                result = Arrays.asList(RED, WHITE, BLUE);
                break;
            case "German":
                result = Arrays.asList(BLACK, RED, YELLOW);
                break;
            case "Belgian":
                result = Arrays.asList(BLACK, YELLOW, RED);
                break;
            case "French":
                result = Arrays.asList(BLUE, WHITE, RED);
                break;
            case "Italian":
                result = Arrays.asList(GREEN, WHITE, RED);
                break;
            case "Taiwanese":
                result = Arrays.asList(RED, WHITE, BLUE);
                break;
            case "Unclassified":
            default:
                result = Arrays.asList(GRAY);
                break;
        }


        return result;
    }
}
