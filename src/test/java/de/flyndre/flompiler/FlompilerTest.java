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
        Flassertions.assertClassHasField(instance, "isFalse", false);
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
        // Method should statically return the boolean constant true
        Flassertions.assertClassHasWorkingMethod(instance, "method", true);
    }

    @Test
    @DisplayName("Flompiler: Defective Boolean Method Class")
    public void testFlompilerDefectiveBooleanMethodClass() {
        testParsingFailure("/methods/parameterless/defective/BooleanMethod.java");
    }



    // METHODS (USING FIELDS)

    @Test
    @DisplayName("Flompiler: Boolean Method using Field")
    public void testFlompilerBooleanMethodFieldClass() {
        testParsingSuccess("/methods/attributes/BooleanMethod.java");
        Object instance = Fleflection.getReflectionInstance("/methods/attributes", "BooleanMethod");
        Flassertions.assertClassNameEquals(instance, "BooleanMethod");
        // Method should statically return true from the class' field isTrue
        Flassertions.assertClassHasWorkingMethod(instance, "method", true);
    }

    @Test
    @DisplayName("Flompiler: Defective Boolean Method using Field")
    public void testFlompilerDefectiveBooleanMethodFieldClass() {
        testParsingFailure("/methods/attributes/defective/BooleanMethod.java");
    }



    // METHODS (WITH PARAMETERS)

    @Test
    @DisplayName("Flompiler: Boolean Method Class with Boolean Parameter")
    public void testFlompilerBooleanMethodParametersClass() {
        testParsingSuccess("/methods/parameters/BooleanMethod.java");
        Object instance = Fleflection.getReflectionInstance("/methods/parameters", "BooleanMethod");
        Flassertions.assertClassNameEquals(instance, "BooleanMethod");
        // Method with parameters should statically return the boolean constant false
        Flassertions.assertClassHasWorkingMethod(instance, "method", false, true);
    }

    @Test
    @DisplayName("Flompiler: Boolean Method Class with returned Boolean Parameter")
    public void testFlompilerBooleanMethodReturnedParametersClass() {
        testParsingSuccess("/methods/parameters/BooleanMethodReturn.java");
        Object instance = Fleflection.getReflectionInstance("/methods/parameters", "BooleanMethodReturn");
        Flassertions.assertClassNameEquals(instance, "BooleanMethodReturn");
        // Method should return the given parameter
        Flassertions.assertClassHasWorkingMethod(instance, "method", true, true);
        Flassertions.assertClassHasWorkingMethod(instance, "method", false, false);
    }

    @Test
    @DisplayName("Flompiler: Integer Method Class with returned Integer Parameter")
    public void testFlompilerIntegerMethodParametersClass() {
        testParsingSuccess("/methods/parameters/IntegerMethod.java");
        Object instance = Fleflection.getReflectionInstance("/methods/parameters", "IntegerMethod");
        Flassertions.assertClassNameEquals(instance, "IntegerMethod");
        // Method should return the given parameter
        Flassertions.assertClassHasWorkingMethod(instance, "method", 1, 1);
        Flassertions.assertClassHasWorkingMethod(instance, "method", 420, 420);
    }

    @Test
    @DisplayName("Flompiler: Char Method Class with returned Char Parameter")
    public void testFlompilerCharMethodParametersClass() {
        testParsingSuccess("/methods/parameters/CharMethod.java");
        Object instance = Fleflection.getReflectionInstance("/methods/parameters", "CharMethod");
        Flassertions.assertClassNameEquals(instance, "CharMethod");
        // Method should return the given parameter
        Flassertions.assertClassHasWorkingMethod(instance, "method", 'a', 'a');
        Flassertions.assertClassHasWorkingMethod(instance, "method", '5', '5');
    }



    // STATIC IF AND IF-ELSE

    @Test
    @DisplayName("Flompiler: Static If Condition")
    public void testFlompilerStaticIf() {
        testParsingSuccess("/if_condition/StaticIf.java");
        Object instance = Fleflection.getReflectionInstance("/if_condition", "StaticIf");
        Flassertions.assertClassNameEquals(instance, "StaticIf");
        // Method should return 1
        Flassertions.assertClassHasWorkingMethod(instance, "method", 1);
    }

    @Test
    @DisplayName("Flompiler: Static If-Else Condition")
    public void testFlompilerStaticIfElse() {
        testParsingSuccess("/if_condition/StaticIfElse.java");
        Object instance = Fleflection.getReflectionInstance("/if_condition", "StaticIfElse");
        Flassertions.assertClassNameEquals(instance, "StaticIfElse");
        // Method should return 2
        Flassertions.assertClassHasWorkingMethod(instance, "method", 2);
    }



    // DYNAMIC IF AND IF-ELSE

    @Test
    @DisplayName("Flompiler: Dynamic If Condition")
    public void testFlompilerDynamicIf() {
        testParsingSuccess("/if_condition/DynamicIf.java");
        Object instance = Fleflection.getReflectionInstance("/if_condition", "DynamicIf");
        Flassertions.assertClassNameEquals(instance, "DynamicIf");
        // Function arg is "returnOne"
        Flassertions.assertClassHasWorkingMethod(instance, "method", 1, true);
        Flassertions.assertClassHasWorkingMethod(instance, "method", 2, false);
    }

    @Test
    @DisplayName("Flompiler: Dynamic If-Else Condition")
    public void testFlompilerDynamicIfElse() {
        testParsingSuccess("/if_condition/DynamicIfElse.java");
        Object instance = Fleflection.getReflectionInstance("/if_condition", "DynamicIfElse");
        Flassertions.assertClassNameEquals(instance, "DynamicIfElse");
        // Function arg is "returnOne", but with else
        Flassertions.assertClassHasWorkingMethod(instance, "method", 1, true);
        Flassertions.assertClassHasWorkingMethod(instance, "method", 2, false);
    }



    // MATHEMATICAL OPERATIONS

    @Test
    @DisplayName("Flompiler: Add")
    public void testFlompilerAdd(){
        testParsingSuccess("/operators/Add.java");
        Object instance = Fleflection.getReflectionInstance("/operators", "Add");
        Flassertions.assertClassNameEquals(instance, "Add");
        // Method should return given argument increased by 2
        Flassertions.assertClassHasWorkingMethod(instance, "method", 2, 0);
        Flassertions.assertClassHasWorkingMethod(instance, "method", 420, 418);
    }

    @Test
    @DisplayName("Flompiler: Subtract")
    public void testFlompilerSubtract(){
        testParsingSuccess("/operators/Subtract.java");
        Object instance = Fleflection.getReflectionInstance("/operators", "Subtract");
        Flassertions.assertClassNameEquals(instance, "Subtract");
        // Method should return given argument decreased by 2
        Flassertions.assertClassHasWorkingMethod(instance, "method", 2, 4);
        Flassertions.assertClassHasWorkingMethod(instance, "method", 420, 422);
    }


    @Test
    @DisplayName("Flompiler: Multiply")
    public void testFlompilerMultiply(){
        testParsingSuccess("/operators/Multiply.java");
        Object instance = Fleflection.getReflectionInstance("/operators", "Multiply");
        Flassertions.assertClassNameEquals(instance, "Multiply");
        // Method should return given argument multiplied by 2
        Flassertions.assertClassHasWorkingMethod(instance, "method", 2, 1);
        Flassertions.assertClassHasWorkingMethod(instance, "method", 420, 210);
    }


    @Test
    @DisplayName("Flompiler: Divide")
    public void testFlompilerDivide(){
        testParsingSuccess("/operators/Divide.java");
        Object instance = Fleflection.getReflectionInstance("/operators", "Divide");
        Flassertions.assertClassNameEquals(instance, "Divide");
        // Method should return given argument divided by 2
        Flassertions.assertClassHasWorkingMethod(instance, "method", 2, 4);
        Flassertions.assertClassHasWorkingMethod(instance, "method", 420, 840);
    }



    // INCREMENT/DECREMENT

    @Test
    @DisplayName("Flompiler: Pre-Increment")
    public void testFlompilerPreIncrement() {
        testParsingSuccess("/operators/PreIncrement.java");
        Object instance = Fleflection.getReflectionInstance("/operators", "PreIncrement");
        Flassertions.assertClassNameEquals(instance, "PreIncrement");
        Flassertions.assertClassHasWorkingMethod(instance, "method", 1);
    }

    @Test
    @DisplayName("Flompiler: Pre-Decrement")
    public void testFlompilerPreDecrement() {
        testParsingSuccess("/operators/PreDecrement.java");
        Object instance = Fleflection.getReflectionInstance("/operators", "PreDecrement");
        Flassertions.assertClassNameEquals(instance, "PreDecrement");
        Flassertions.assertClassHasWorkingMethod(instance, "method", 0);
    }



    // COMPLEX TESTS

    @Test
    @DisplayName("Flompiler: Complex Test A")
    public void testFlompilerComplexTestA() {
        testParsingSuccess("/complete/ComplexTestA.java");
        Object instance = Fleflection.getReflectionInstance("/complete", "ComplexTestA");
        Flassertions.assertClassNameEquals(instance, "ComplexTestA");
    }

}
