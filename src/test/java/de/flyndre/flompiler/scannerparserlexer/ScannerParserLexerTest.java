package de.flyndre.flompiler.scannerparserlexer;

import de.flyndre.flompiler.Flassertions;
import de.flyndre.flompiler.TestConstants;
import de.flyndre.flompiler.results.attributes.BooleanClassResults;
import de.flyndre.flompiler.results.basic.EmptyClassResults;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Program;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.function.Executable;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ScannerParserLexerTest {

    /**
     * Tests if a .java file can be successfully parsed by the `ScannerParserLexer`.
     * @param inputFilePath path to the .java file
     * @param expected the expected AST
     */
    private void testSuccess(String inputFilePath, Program expected) {
        final var inputPath = TestConstants.RESOURCES_ROOT + inputFilePath;
        final String inputString;
        try {
            inputString = Files.readString(Path.of(inputPath));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        final var actual = ScannerParserLexer.compile(inputString);
        Flassertions.assertDeeplyAlike(expected, actual);
    }

    /**
     * Tests if a faulty .java file produces an exception when parsed.
     * @param inputFilePath path to the .java file
     */
    private void testFailure(String inputFilePath) {
        final var inputPath = TestConstants.RESOURCES_ROOT + inputFilePath;
        final String inputString;
        try {
            inputString = Files.readString(Path.of(inputPath));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        final Executable executable = () -> ScannerParserLexer.compile(inputString);
        Assertions.assertThrows(Exception.class, executable);
    }

    @Test
    @DisplayName("ScannerParserLexer: Empty Class")
    public void testEmptyClass() {
        testSuccess("/basic/EmptyClass.java", EmptyClassResults.AST);
    }

    @Test
    @DisplayName("ScannerParserLexer: Defective Empty Class")
    public void testDefectiveEmptyClass() {
        testFailure("/basic/defective/DefectiveEmptyClass.java");
    }

    @Test
    @DisplayName("ScannerParserLexer: Boolean Attribute Class")
    public void testAttributeBooleanClass() {
        testSuccess("/attributes/BooleanClass.java", BooleanClassResults.AST);
    }

    @Test
    @DisplayName("ScannerParserLexer: Defective Boolean Attribute Class")
    public void testAttributeDefectiveBooleanClass() {
        testFailure("/attributes/defective/DefectiveBooleanClass.java");
    }

}