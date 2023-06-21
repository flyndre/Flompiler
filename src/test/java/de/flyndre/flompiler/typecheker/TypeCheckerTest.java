package de.flyndre.flompiler.typecheker;

import de.flyndre.flompiler.results.if_condition.DynamicIfElseResults;
import de.flyndre.flompiler.results.if_condition.DynamicIfResults;
import de.flyndre.flompiler.results.if_condition.StaticIfElseResults;
import de.flyndre.flompiler.results.if_condition.StaticIfResults;
import de.flyndre.flompiler.results.methods.*;
import de.flyndre.flompiler.testing.Flassertions;
import de.flyndre.flompiler.results.attributes.BooleanClassResults;
import de.flyndre.flompiler.results.attributes.CharClassResults;
import de.flyndre.flompiler.results.attributes.IntegerClassResults;
import de.flyndre.flompiler.results.attributes.StringClassResults;
import de.flyndre.flompiler.results.basic.EmptyClassResults;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Program;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.concurrent.atomic.AtomicReference;

public class TypeCheckerTest {

    /**
     * Tests if an untyped AST can be successfully and correctly type-checked to a typed AST.
     * @param input the untyped AST
     * @param expected the expected typed AST
     */
    private void testSuccess(Program input, Program expected) {
        var actual = new AtomicReference<Program>();
        final Executable executable = () -> actual.set(input.typeCheck());
        Assertions.assertDoesNotThrow(executable);
        Flassertions.assertDeeplyAlike(expected, actual.get());
    }

    /**
     * Tests if a faulty untyped AST produces an exception when type-checked.
     * @param input the faulty untyped AST
     */
    private void testFailure(Program input) {
        var actual = new AtomicReference<Program>();
        final Executable executable = () -> actual.set(input.typeCheck());
        Assertions.assertThrows(Exception.class, executable);
    }



    // EMPTY CLASS

    @Test
    @DisplayName("TypeChecker: Empty Class")
    public void testEmptyClass() {
        testSuccess(EmptyClassResults.AST, EmptyClassResults.TYPED_AST);
    }



    // ATTRIBUTES

    @Test
    @DisplayName("TypeChecker: Boolean Attribute Class")
    public void testBooleanAttributeClass() {
        testSuccess(BooleanClassResults.AST, BooleanClassResults.TYPED_AST);
    }

    @Test
    @DisplayName("TypeChecker: Integer Attribute Class")
    public void testIntegerAttributeClass() {
        testSuccess(IntegerClassResults.AST, IntegerClassResults.TYPED_AST);
    }

    @Test
    @DisplayName("TypeChecker: Char Attribute Class")
    public void testCharAttributeClass() {
        testSuccess(CharClassResults.AST, CharClassResults.TYPED_AST);
    }

    @Test
    @DisplayName("TypeChecker: String Attribute Class")
    public void testStringAttributeClass() {
        testSuccess(StringClassResults.AST, StringClassResults.TYPED_AST);
    }



    // ATTRIBUTE ASSIGNMENTS

    // METHODS

    // EMPTY METHODS

    @Test
    @DisplayName("TypeChecker: Parameterless Boolean Method Class")
    public void testMethodBooleanParameterlessClass() {
        testSuccess(BooleanMethodClassResults.AST, BooleanMethodClassResults.TYPED_AST);
    }

    @Test
    @DisplayName("TypeChecker: Parameterless String Method Class")
    public void testMethodStringParameterlessClass() {
        testSuccess(StringMethodClassResults.AST, StringMethodClassResults.TYPED_AST);
    }



    // METHODS WITH PARAMETERS

    @Test
    @DisplayName("TypeChecker: Boolean Method Class With Parameters")
    public void testMethodBooleanClassWithParameters() {
        testSuccess(BooleanMethodReturnClassResults.AST, BooleanMethodReturnClassResults.TYPED_AST);
    }

    @Test
    @DisplayName("TypeChecker: Integer Method Class With Parameters")
    public void testMethodIntegerClassWithParameters() {
        testSuccess(IntegerMethodClassResults.AST, IntegerMethodClassResults.TYPED_AST);
    }

    @Test
    @DisplayName("TypeChecker: Char Method Class With Parameters")
    public void testMethodCharClassWithParameters() {
        testSuccess(CharMethodClassResults.AST, CharMethodClassResults.TYPED_AST);
    }



    // STATIC IF AND IF-ELSE

    @Test
    @DisplayName("TypeChecker: Static If-Condition")
    public void testMethodStaticIf() {
        testSuccess(StaticIfResults.AST, StaticIfResults.TYPED_AST);
    }

    @Test
    @DisplayName("TypeChecker: Static If-Else-Condition")
    public void testMethodStaticIfElse() {
        testSuccess(StaticIfElseResults.AST, StaticIfElseResults.TYPED_AST);
    }



    // DYNAMIC IF AND IF-ELSE

    @Test
    @DisplayName("TypeChecker: Dynamic If-Condition")
    public void testMethodDynamicIf() {
        testSuccess(DynamicIfResults.AST, DynamicIfResults.TYPED_AST);
    }

    @Test
    @DisplayName("TypeChecker: Dynamic If-Else-Condition")
    public void testMethodDynamicIfElse() {
        testSuccess(DynamicIfElseResults.AST, DynamicIfElseResults.TYPED_AST);
    }

}