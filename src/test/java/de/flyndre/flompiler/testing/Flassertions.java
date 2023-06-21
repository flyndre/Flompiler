package de.flyndre.flompiler.testing;

import com.google.gson.Gson;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Program;
import org.junit.jupiter.api.Assertions;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

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
            // Das hier wäre die schöne Variante:
            //      List<? extends Class<?>> args = Arrays.stream(methodArguments).map(Object::getClass).toList();
            //      Method method = instance.getClass().getDeclaredMethod(methodName, args.toArray(new Class<?>[0]));
            // Leider funktioniert das wegen der Wrapper-Typen für primitive Typen nicht.
            // Da ich nicht mehr genug Zeit habe, müssen Sie hiermit vorliebnehmen:
            Optional<Method> method = Arrays.stream(instance.getClass().getDeclaredMethods()).filter((Method m) -> m.getName().equals(methodName)).findFirst();
            Assertions.assertTrue(method.isPresent());
            Object result = method.get().invoke(instance, methodArguments);
            Assertions.assertEquals(expectedOutput, result);
        } catch (IllegalAccessException | InvocationTargetException e ) {
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
