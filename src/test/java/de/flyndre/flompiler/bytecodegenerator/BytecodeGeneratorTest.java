package de.flyndre.flompiler.bytecodegenerator;

import de.flyndre.flompiler.TestConstants;
import de.flyndre.flompiler.results.attributes.BooleanClassResults;
import de.flyndre.flompiler.results.basic.EmptyClassResults;
import de.flyndre.flompiler.results.if_condition.DynamicIfResults;
import de.flyndre.flompiler.results.if_condition.StaticIfElseResults;
import de.flyndre.flompiler.results.if_condition.StaticIfResults;
import de.flyndre.flompiler.results.methods.BooleanMethodClassResults;
import de.flyndre.flompiler.results.methods.BooleanMethodReturnClassResults;
import de.flyndre.flompiler.results.methods.CharMethodClassResults;
import de.flyndre.flompiler.results.methods.IntegerMethodClassResults;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Program;
import de.flyndre.flompiler.testing.Flassertions;
import de.flyndre.flompiler.testing.Fleflection;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Optional;

public class BytecodeGeneratorTest {

    /**
     * Prepares the compilation of the given file.
     * @param inputAst the input typed AST
     * @param outputFilePath where the resulting `.class` file should be placed
     * @return an executable which attempts to compile the file
     */
    private Executable createBytecodeGeneratorExecutable(Program inputAst, String outputFilePath) {
        var outputFile = new File(TestConstants.RESOURCES_ROOT + outputFilePath);
        return () -> BytecodeGenerator.generateByteCode(inputAst, outputFile);
    }

    /**
     * Attempts to transform the given AST into a java program.
     * If successful, the compilation produces a `.class` file next to the given `.java` file.
     * @param inputAst the input typed AST
     * @param outputFilePath where the resulting `.class` file should be placed
     */
    private void testBytecodeGenerationSuccess(Program inputAst, String outputFilePath) {
        Assertions.assertDoesNotThrow(createBytecodeGeneratorExecutable(inputAst, outputFilePath));
    }

    /**
     * Tries to transform the given AST and expects the compilation to fail.
     * @param inputAst the input typed AST
     * @param outputFilePath where the resulting `.class` file should be placed
     */
    private void testBytecodeGenerationFailure(Program inputAst, String outputFilePath) {
        Assertions.assertThrows(Exception.class, createBytecodeGeneratorExecutable(inputAst, outputFilePath));
    }



    // EMPTY CLASS

    @Test
    @DisplayName("TypeChecker: Empty Class")
    public void testEmptyClass() {
        testBytecodeGenerationSuccess(EmptyClassResults.TYPED_AST, "/basic/EmptyClass.class");
        Object instance = Fleflection.getReflectionInstance("/basic", "EmptyClass");
        Flassertions.assertClassNameEquals(instance, "EmptyClass");
    }



    // ATTRIBUTES

    @Test
    @DisplayName("TypeChecker: Boolean Attribute Class")
    public void testBooleanAttributeClass() {
        testBytecodeGenerationSuccess(BooleanClassResults.TYPED_AST, "/attributes/BooleanClass.class");
        Object instance = Fleflection.getReflectionInstance("/attributes", "BooleanClass");
        Flassertions.assertClassNameEquals(instance, "BooleanClass");
    }



    // METHODS (NO PARAMETERS)

    @Test
    @DisplayName("TypeChecker: Boolean Method Class")
    public void testBooleanMethodClass() {
        testBytecodeGenerationSuccess(BooleanMethodClassResults.TYPED_AST, "/methods/parameterless/BooleanMethod.class");
        Object instance = Fleflection.getReflectionInstance("/methods/parameterless", "BooleanMethod");
        Flassertions.assertClassNameEquals(instance, "BooleanMethod");
    }



    // METHODS WITH PARAMETERS

    @Test
    @DisplayName("TypeChecker: Boolean Method Class with Boolean Parameter")
    public void testFlompilerBooleanMethodParametersClass() {
        testBytecodeGenerationSuccess(BooleanMethodClassResults.TYPED_AST, "/methods/parameters/BooleanMethod.class");
        Object instance = Fleflection.getReflectionInstance("/methods/parameters", "BooleanMethod");
        Flassertions.assertClassNameEquals(instance, "BooleanMethod");
    }

    @Test
    @DisplayName("TypeChecker: Boolean Method Class with returned Boolean Parameter")
    public void testFlompilerBooleanMethodReturnedParametersClass() {
        testBytecodeGenerationSuccess(BooleanMethodReturnClassResults.TYPED_AST, "/methods/parameters/BooleanMethodReturn.class");
        Object instance = Fleflection.getReflectionInstance("/methods/parameters", "BooleanMethodReturn");
        Flassertions.assertClassNameEquals(instance, "BooleanMethodReturn");
    }

    @Test
    @DisplayName("TypeChecker: Integer Method Class with increased Integer Parameter")
    public void testFlompilerIntegerMethodParametersClass() {
        testBytecodeGenerationSuccess(IntegerMethodClassResults.TYPED_AST, "/methods/parameters/IntegerMethod.class");
        Object instance = Fleflection.getReflectionInstance("/methods/parameters", "IntegerMethod");
        Flassertions.assertClassNameEquals(instance, "IntegerMethod");
    }

    @Test
    @DisplayName("TypeChecker: Char Method Class with returned Char Parameter")
    public void testFlompilerCharMethodParametersClass() {
        testBytecodeGenerationSuccess(CharMethodClassResults.TYPED_AST, "/methods/parameters/CharMethod.class");
        Object instance = Fleflection.getReflectionInstance("/methods/parameters", "CharMethod");
        Flassertions.assertClassNameEquals(instance, "CharMethod");
    }



    // STATIC IF AND IF-ELSE

    @Test
    @DisplayName("Flompiler: Static If Condition")
    public void testFlompilerStaticIf() {
        testBytecodeGenerationSuccess(StaticIfResults.TYPED_AST, "/if_condition/StaticIf.class");
        Object instance = Fleflection.getReflectionInstance("/if_condition", "StaticIf");
        Flassertions.assertClassNameEquals(instance, "StaticIf");
        Optional<Method> method = Arrays.stream(instance.getClass().getDeclaredMethods())
                .filter((Method m) -> m.getName().equals("method")).findFirst();
        Assertions.assertTrue(method.isPresent());
        int result;
        try {
            result = (int) method.get().invoke(instance);
        } catch (IllegalAccessException | InvocationTargetException e ) {
            throw new RuntimeException(e);
        }
        Assertions.assertEquals(1, result);
    }

    @Test
    @DisplayName("Flompiler: Static If-Else Condition")
    public void testFlompilerStaticIfElse() {
        testBytecodeGenerationSuccess(StaticIfElseResults.TYPED_AST, "/if_condition/StaticIfElse.class");
        Object instance = Fleflection.getReflectionInstance("/if_condition", "StaticIfElse");
        Flassertions.assertClassNameEquals(instance, "StaticIfElse");
    }



    // DYNAMIC IF AND IF-ELSE

    @Test
    @DisplayName("Flompiler: Dynamic If Condition")
    public void testFlompilerDynamicIf() {
        testBytecodeGenerationSuccess(DynamicIfResults.TYPED_AST, "/if_condition/DynamicIf.class");
        Object instance = Fleflection.getReflectionInstance("/if_condition", "DynamicIf");
        Flassertions.assertClassNameEquals(instance, "DynamicIf");
    }

//    @Test
//    @DisplayName("Flompiler: Dynamic If-Else Condition")
//    public void testFlompilerDynamicIfElse() {
//        testBytecodeGenerationSuccess(DynamicIfElseResults.TYPED_AST, "/if_condition/DynamicIfElse.class");
//        Object instance = Fleflection.getReflectionInstance("/if_condition", "DynamicIfElse");
//        Flassertions.assertClassNameEquals(instance, "DynamicIfElse");
//    }
}