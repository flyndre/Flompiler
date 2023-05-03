package de.flyndre.flompiler;

import com.google.gson.Gson;
import org.junit.jupiter.api.Assertions;

/**
 * Assertions used to test the Flompiler.
 * @author David Maier
 */
public class Flassertions {

    private final static Gson gson = new Gson();

    public static void assertDeeplyAlike(Object expected, Object actual) {
        Assertions.assertEquals(
                gson.toJson(expected, expected.getClass()),
                gson.toJson(actual, actual.getClass())
        );
    }
}
