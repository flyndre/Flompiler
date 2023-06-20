package de.flyndre.flompiler.bytecodegenerator;

import junit.framework.TestCase;

public class BytecodeGeneratorTest extends TestCase {

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
    private void testParsingSuccess(Program inputAst, String outputFilePath) {
        Assertions.assertDoesNotThrow(createBytecodeGeneratorExecutable(inputAst, outputFilePath));
    }

    /**
     * Tries to transform the given AST and expects the compilation to fail.
     * @param inputAst the input typed AST
     * @param outputFilePath where the resulting `.class` file should be placed
     */
    private void testParsingFailure(Program inputAst, String outputFilePath) {
        Assertions.assertThrows(Exception.class, createBytecodeGeneratorExecutable(inputAst, outputFilePath));
    }



    // EMPTY CLASS

    @Test
    @DisplayName("TypeChecker: Empty Class")
    public void testEmptyClass() {
        testSuccess(EmptyClassResults.TYPED_AST, "/basic/EmptyClass.class");
    }

}