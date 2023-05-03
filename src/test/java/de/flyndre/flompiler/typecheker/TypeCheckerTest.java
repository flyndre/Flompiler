package de.flyndre.flompiler.typecheker;

import de.flyndre.flompiler.Flassertions;
import de.flyndre.flompiler.results.basic.EmptyClassResults;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Program;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.concurrent.atomic.AtomicReference;

public class TypeCheckerTest {

    /**
     * Parse empty class.
     */
    @Test
    public void testEmptyClass() {
        final var input = EmptyClassResults.AST;
        final var expected = EmptyClassResults.TYPED_AST;
        AtomicReference<Program> actual = new AtomicReference<>();
        final Executable executable = () -> actual.set(input.typeCheck());
        Assertions.assertDoesNotThrow(executable);
        Flassertions.assertDeeplyAlike(expected, actual.get());
    }
}