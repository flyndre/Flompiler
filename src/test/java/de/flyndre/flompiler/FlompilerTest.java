package de.flyndre.flompiler;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class FlompilerTest {

    private void testSuccess(String inputFilePath) {
        final var inputPath = TestConstants.RESOURCES_ROOT + inputFilePath;
        final String[] args = { inputPath };
        final Executable executable = () -> Flompiler.main(args);
        Assertions.assertDoesNotThrow(executable);
    }

    private void testFailure(String inputFilePath) {
        final var inputPath = TestConstants.RESOURCES_ROOT + inputFilePath;
        final String[] args = { inputPath };
        final Executable executable = () -> Flompiler.main(args);
        Assertions.assertThrows(Exception.class, executable);
    }

    

    @Test
    @DisplayName("Flompiler: Reflection")
    public void testFlompilerReflection() {
        File myFolder = new File(TestConstants.RESOURCES_ROOT + "/basic/EmptyClass.java");
        URLClassLoader classLoader = new URLClassLoader(new URL[]{myFolder.toURI().toURL()}, Thread.currentThread().getContextClassLoader());
        Class<?> myClass = Class.forName("my.package.Myclass", true, classLoader);
        Myclass obj = (Myclass) myClass.newInstance();
    }



    // EMPTY CLASS

    @Test
    @DisplayName("Flompiler: Empty Class")
    public void testFlompilerEmptyClass() {
        testSuccess("/basic/EmptyClass.java");
    }

    @Test
    @DisplayName("Flompiler: Defective Empty Class")
    public void testFlompilerDefectiveEmptyClass() {
        testFailure("/basic/defective/DefectiveEmptyClass.java");
    }



    // ATTRIBUTES

    @Test
    @DisplayName("Flompiler: Boolean Attribute Class")
    public void testFlompilerBooleanAttributeClass() {
        testSuccess("/attributes/BooleanClass.java");
    }

    @Test
    @DisplayName("Flompiler: Defective Boolean Attribute Class")
    public void testFlompilerDefectiveBooleanAttributeClass() {
        testFailure("/attributes/defective/DefectiveBooleanClass.java");
    }



    // METHODS (NO PARAMETERS)

    @Test
    @DisplayName("Flompiler: Boolean Method Class")
    public void testFlompilerBooleanMethodClass() {
        testSuccess("/methods/parameterless/BooleanMethod.java");
    }

    @Test
    @DisplayName("Flompiler: Defective Boolean Method Class")
    public void testFlompilerDefectiveBooleanMethodClass() {
        testFailure("/methods/parameterless/defective/BooleanMethod.java");
    }



    // METHODS WITH PARAMETERS

    @Test
    @DisplayName("Flompiler: Boolean Method Class with Boolean Parameter")
    public void testFlompilerBooleanMethodParametersClass() {
        testSuccess("/methods/parameters/BooleanMethod.java");
    }

    @Test
    @DisplayName("Flompiler: Boolean Method Class with returned Boolean Parameter")
    public void testFlompilerBooleanMethodReturnedParametersClass() {
        testSuccess("/methods/parameters/BooleanMethodReturn.java");
    }

    @Test
    @DisplayName("Flompiler: Integer Method Class with increased Integer Parameter")
    public void testFlompilerIntegerMethodParametersClass() {
        testSuccess("/methods/parameters/IntegerMethod.java");
    }

    @Test
    @DisplayName("Flompiler: Char Method Class with returned Char Parameter")
    public void testFlompilerCharMethodParametersClass() {
        testSuccess("/methods/parameters/CharMethod.java");
    }



    // STATIC IF AND IF-ELSE

    @Test
    @DisplayName("Flompiler: Static If Condition")
    public void testFlompilerStaticIf() {
        testSuccess("/if_condition/StaticIf.java");
    }

    @Test
    @DisplayName("Flompiler: Static If-Else Condition")
    public void testFlompilerStaticIfElse() {
        testSuccess("/if_condition/StaticIfElse.java");
    }



    // DYNAMIC IF AND IF-ELSE

    @Test
    @DisplayName("Flompiler: Dynamic If Condition")
    public void testFlompilerDynamicIf() {
        testSuccess("/if_condition/DynamicIf.java");
    }

    @Test
    @DisplayName("Flompiler: Dynamic If-Else Condition")
    public void testFlompilerDynamicIfElse() {
        testSuccess("/if_condition/DynamicIfElse.java");
    }
}
