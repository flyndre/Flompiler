package de.flyndre.flompiler;

import de.flyndre.flompiler.bytecodegenerator.BytecodeGenerator;
import de.flyndre.flompiler.scannerparserlexer.ScannerParserLexer;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Program;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * The minimal Java-Compiler "Flompiler".
 * @author Ruben Kraft, Paul Lehmann, Lukas Burkhardt, David Maier
 */
public class Flompiler {

    /**
     * Compiles a .java file to a .class file.
     * @param args The arguments of the compiler, the first of which must be the path to the input file.
     */
    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            throw new RuntimeException("Please specify an input file as first argument.");
        }

        final var inputPath = args[0];
        final var inputFile = new File(inputPath);

        if (!inputFile.getName().endsWith(".java")) {
            throw new RuntimeException("Input file must be .java-file.");
        }

        final var outputFile = new File(
                inputFile.getAbsolutePath()
                        .replace(".java", ".class")
        );

        String inputString = Files.readString(Path.of(inputFile.getAbsolutePath()));

        Program ast = ScannerParserLexer.compile(inputString);

        Program typedAst = ast.typeCheck();

        BytecodeGenerator.generateByteCode(typedAst, outputFile);
    }
}
