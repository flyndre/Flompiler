package de.flyndre.flompiler.testing;

import com.google.gson.Gson;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Program;
import org.junit.jupiter.api.Assertions;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

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

    public static void assertClassHasField(Object instance, String fieldName, Object expectedValue) {
        try {
            Field field = instance.getClass().getField(fieldName);
            Object value = field.get(instance);
            Assertions.assertEquals(expectedValue, value);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public static void assertClassHasFields(Object instance, List<String> fieldNames, List<Object> fieldValues) {
        for (int i = 1; i < fieldNames.size(); i++) {
            assertClassHasWorkingMethod(instance, fieldNames.get(i), fieldValues.get(i));
        }
    }

    public static void assertClassHasWorkingMethod(
            Object instance,
            String methodName,
            Object expectedOutput,
            Object... methodArguments
    ) {
        try {
            Method method = instance.getClass().getDeclaredMethod(methodName);
            Object result = method.invoke(instance, methodArguments);
            Assertions.assertEquals(expectedOutput, result);
        } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e ) {
            throw new RuntimeException(e);
        }
    }

    public static void assertClassHasWorkingMethods(
            Object instance,
            List<String> methodNames,
            List<Object> expectedOutputs,
            List<List<Object>> methodArguments
    ) {
        for (int i = 1; i < methodNames.size(); i++) {
            assertClassHasWorkingMethod(instance, methodNames.get(i), expectedOutputs.get(i), methodArguments.get(i).toArray());
        }
    }
}
