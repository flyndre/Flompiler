package de.flyndre.flompiler;

import com.google.gson.Gson;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Method;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Program;
import org.junit.jupiter.api.Assertions;

import java.lang.reflect.Field;

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
        Assertions.assertEquals(instance.getClass().getName(), className);
    }

    public static void assertClassDeclaresField(Object instance, Field field) {
        assertClassDeclaresFields(instance, new Field[]{ field });
    }

    public static void assertClassDeclaresFields(Object instance, Field[] fields) {
        // TODO: loop fields to check whether non-null fields on it match with any fields of instance
    }

    public static void assertClassDeclaresMethod(Object instance, Method method) {
        assertClassDeclaresMethods(instance, new Method[]{ method });
    }

    public static void assertClassDeclaresMethods(Object instance, Method[] methods) {
        // TODO: loop methods to check whether non-null fields on it match with any methods of instance
    }
}
