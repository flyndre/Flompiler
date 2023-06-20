package de.flyndre.flompiler.testing;

import com.google.gson.Gson;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Program;
import org.junit.jupiter.api.Assertions;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

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

    public static void assertClassNameEquals(Object instance, String className) {
        Assertions.assertEquals(className, instance.getClass().getName());
    }

    public static void assertClassDeclaresField(Object instance, Field field) {

    }

    public static void assertClassDeclaresFields(Object instance, Field[] fields) {
        for (Field f : fields) {
            assertClassDeclaresField(instance, f);
        }
    }

    public static void assertClassDeclaresMethod(Object instance, Method method) {

    }

    public static void assertClassDeclaresMethods(Object instance, Method[] methods) {
        for (Method m : methods) {
            assertClassDeclaresMethod(instance, m);
        }
    }
}
