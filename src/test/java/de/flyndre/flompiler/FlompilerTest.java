package de.flyndre.flompiler;

import de.flyndre.flompiler.testing.Flassertions;
import de.flyndre.flompiler.testing.Fleflection;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;


public class FlompilerTest {



    // HELPER-METHODS

    /**
     * Prepares the compilation of the given file.
     * @param inputFilePath the path to the .java file
     * @return an executable which attempts to compile the file
     */
    private Executable createCompilationExecutable(String inputFilePath) {
        final var inputPath = TestConstants.RESOURCES_ROOT + inputFilePath;
        final String[] args = { inputPath };
        return () -> Flompiler.main(args);
    }

    /**
     * Tries to compile the given file.
     * If successful, the compilation produces a `.class` file next to the given `.java` file.
     * @param inputFilePath the path to the .java file
     */
    private void testParsingSuccess(String inputFilePath) {
        Assertions.assertDoesNotThrow(createCompilationExecutable(inputFilePath));
    }

    /**
     * Tries to compile the given file and expects the compilation to fail.
     * @param inputFilePath the path to the `.java` file
     */
    private void testParsingFailure(String inputFilePath) {
        Assertions.assertThrows(Exception.class, createCompilationExecutable(inputFilePath));
    }



    // EMPTY CLASS

    @Test
    @DisplayName("Flompiler: Empty Class")
    public void testFlompilerEmptyClass() {
        testParsingSuccess("/basic/EmptyClass.java");
        Object instance = Fleflection.getReflectionInstance("/basic", "EmptyClass");
        Flassertions.assertClassNameEquals(instance, "EmptyClass");
    }

    @Test
    @DisplayName("Flompiler: Defective Empty Class")
    public void testFlompilerDefectiveEmptyClass() {
        testParsingFailure("/basic/defective/DefectiveEmptyClass.java");
    }



    // ATTRIBUTES

    @Test
    @DisplayName("Flompiler: Boolean Attribute Class")
    public void testFlompilerBooleanAttributeClass() {
        testParsingSuccess("/attributes/BooleanClass.java");
        Object instance = Fleflection.getReflectionInstance("/attributes", "BooleanClass");
        Flassertions.assertClassNameEquals(instance, "BooleanClass");
    }

    @Test
    @DisplayName("Flompiler: Defective Boolean Attribute Class")
    public void testFlompilerDefectiveBooleanAttributeClass() {
        testParsingFailure("/attributes/defective/DefectiveBooleanClass.java");
    }



    // METHODS (NO PARAMETERS)

    @Test
    @DisplayName("Flompiler: Boolean Method Class")
    public void testFlompilerBooleanMethodClass() {
        testParsingSuccess("/methods/parameterless/BooleanMethod.java");
        Object instance = Fleflection.getReflectionInstance("/methods/parameterless", "BooleanMethod");
        Flassertions.assertClassNameEquals(instance, "BooleanMethod");
    }

    @Test
    @DisplayName("Flompiler: Defective Boolean Method Class")
    public void testFlompilerDefectiveBooleanMethodClass() {
        testParsingFailure("/methods/parameterless/defective/BooleanMethod.java");
    }



    // METHODS WITH PARAMETERS

    @Test
    @DisplayName("Flompiler: Boolean Method Class with Boolean Parameter")
    public void testFlompilerBooleanMethodParametersClass() {
        testParsingSuccess("/methods/parameters/BooleanMethod.java");
        Object instance = Fleflection.getReflectionInstance("/methods/parameters", "BooleanMethod");
        Flassertions.assertClassNameEquals(instance, "BooleanMethod");
    }

    @Test
    @DisplayName("Flompiler: Boolean Method Class with returned Boolean Parameter")
    public void testFlompilerBooleanMethodReturnedParametersClass() {
        testParsingSuccess("/methods/parameters/BooleanMethodReturn.java");
        Object instance = Fleflection.getReflectionInstance("/methods/parameters", "BooleanMethodReturn");
        Flassertions.assertClassNameEquals(instance, "BooleanMethodReturn");
    }

    @Test
    @DisplayName("Flompiler: Integer Method Class with increased Integer Parameter")
    public void testFlompilerIntegerMethodParametersClass() {
        testParsingSuccess("/methods/parameters/IntegerMethod.java");
        Object instance = Fleflection.getReflectionInstance("/methods/parameters", "IntegerMethod");
        Flassertions.assertClassNameEquals(instance, "IntegerMethod");
    }

    @Test
    @DisplayName("Flompiler: Char Method Class with returned Char Parameter")
    public void testFlompilerCharMethodParametersClass() {
        testParsingSuccess("/methods/parameters/CharMethod.java");
        Object instance = Fleflection.getReflectionInstance("/methods/parameters", "CharMethod");
        Flassertions.assertClassNameEquals(instance, "CharMethod");
    }



    // STATIC IF AND IF-ELSE

    @Test
    @DisplayName("Flompiler: Static If Condition")
    public void testFlompilerStaticIf() {
        testParsingSuccess("/if_condition/StaticIf.java");
        Object instance = Fleflection.getReflectionInstance("/if_condition", "StaticIf");
        Flassertions.assertClassNameEquals(instance, "StaticIf");
    }

    @Test
    @DisplayName("Flompiler: Static If-Else Condition")
    public void testFlompilerStaticIfElse() {
        testParsingSuccess("/if_condition/StaticIfElse.java");
        Object instance = Fleflection.getReflectionInstance("/if_condition", "StaticIfElse");
        Flassertions.assertClassNameEquals(instance, "StaticIfElse");
    }



    // DYNAMIC IF AND IF-ELSE

    @Test
    @DisplayName("Flompiler: Dynamic If Condition")
    public void testFlompilerDynamicIf() {
        testParsingSuccess("/if_condition/DynamicIf.java");
        Object instance = Fleflection.getReflectionInstance("/if_condition", "DynamicIf");
        Flassertions.assertClassNameEquals(instance, "DynamicIf");
    }

    @Test
    @DisplayName("Flompiler: Dynamic If-Else Condition")
    public void testFlompilerDynamicIfElse() {
        testParsingSuccess("/if_condition/DynamicIfElse.java");
        Object instance = Fleflection.getReflectionInstance("/if_condition", "DynamicIfElse");
        Flassertions.assertClassNameEquals(instance, "DynamicIfElse");
    }
}
