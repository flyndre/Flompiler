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
    @DisplayName("Flompiler: Empty Class")
    public void testFlompilerEmptyClass() {
        testSuccess("/basic/EmptyClass.java");
    }

    @Test
    @DisplayName("Flompiler: Defective Empty Class")
    public void testFlompilerDefectiveEmptyClass() {
        testFailure("/basic/defective/DefectiveEmptyClass.java");
    }

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

    @Test
    @DisplayName("Flompiler: Static If Condition")
    public void testFlompilerStaticIf() {
        testSuccess("/if_condition/StaticIf.java");
    }

    @Test
    @DisplayName("Flompiler: Static If Else Condition")
    public void testFlompilerStaticIfElse() {
        testSuccess("/if_condition/StaticIfElse.java");
    }

}
