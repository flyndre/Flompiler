package de.flyndre.flompiler;

import com.google.gson.Gson;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Program;
import org.junit.jupiter.api.Assertions;

/**
 * Assertions used to test the Flompiler.
 * @author David Maier
 */
public class Flassertions {

    private final static Gson gson = new Gson();

    public static void assertDeeplyAlike(String expectedJson, Program actual) {
        Assertions.assertEquals(
                expectedJson.replaceAll("[\n\r\t ]", ""),
                gson.toJson(actual, actual.getClass())
        );
    }

    public static void assertDeeplyAlike(Program expected, Program actual) {
        Assertions.assertEquals(
                gson.toJson(expected, expected.getClass()),
                gson.toJson(actual, actual.getClass())
        );
    }
}
