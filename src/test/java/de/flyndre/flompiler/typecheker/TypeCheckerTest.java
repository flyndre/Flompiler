package de.flyndre.flompiler.typecheker;

import de.flyndre.flompiler.Flassertions;
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

    @Test
    @DisplayName("TypeChecker: Empty Class")
    public void testEmptyClass() {
        testSuccess(EmptyClassResults.AST, EmptyClassResults.TYPED_AST);
    }
}