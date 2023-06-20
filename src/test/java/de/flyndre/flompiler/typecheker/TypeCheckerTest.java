package de.flyndre.flompiler.typecheker;

import de.flyndre.flompiler.testing.Flassertions;
import de.flyndre.flompiler.results.attributes.BooleanClassResults;
import de.flyndre.flompiler.results.attributes.CharClassResults;
import de.flyndre.flompiler.results.attributes.IntegerClassResults;
import de.flyndre.flompiler.results.attributes.StringClassResults;
import de.flyndre.flompiler.results.basic.EmptyClassResults;
import de.flyndre.flompiler.results.methods.BooleanMethodClassResults;
import de.flyndre.flompiler.results.methods.CharMethodClassResults;
import de.flyndre.flompiler.results.methods.IntegerMethodClassResults;
import de.flyndre.flompiler.results.methods.StringMethodClassResults;
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
    @DisplayName("TypeChecker: Parameterless Integer Method Class")
    public void testMethodIntegerParameterlessClass() {
        testSuccess(IntegerMethodClassResults.AST, IntegerMethodClassResults.TYPED_AST);
    }

    @Test
    @DisplayName("TypeChecker: Parameterless Char Method Class")
    public void testMethodCharParameterlessClass() {
        testSuccess(CharMethodClassResults.AST, CharMethodClassResults.TYPED_AST);
    }

    @Test
    @DisplayName("TypeChecker: Parameterless String Method Class")
    public void testMethodStringParameterlessClass() {
        testSuccess(StringMethodClassResults.AST, StringMethodClassResults.TYPED_AST);
    }

}