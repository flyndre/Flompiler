import de.flyndre.flompiler.scannerparserlexer.ScannerParserLexer;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Program;

import java.io.*;
import java.net.URI;

/**
 * The minimal Java-Compiler "Flompiler".
 * @author Ruben Kraft, Paul Lehmann, Lukas Burkhardt, David Maier
 */
public class Flompiler {

    /**
     * Compiles a .java file to a .class file.
     * @param args The arguments of the compiler, the first of which must be the path to the input file.
     */
    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            throw new RuntimeException("Please specify an input file as first argument.");
        }
        final var inputFile = new File(args[0]);
        System.out.println(inputFile.getAbsolutePath());
        if (!inputFile.getName().endsWith(".java")) {
            throw new RuntimeException("Input file must be .java-file.");
        }
        final var outputFile = new File(
                inputFile.getAbsolutePath()
                        .replace(".java", ".class")
        );
        System.out.println(outputFile.getAbsolutePath());

        BufferedReader objReader = new BufferedReader(new FileReader(inputFile));

        String strCurrentLine;
        String input = "";

        while ((strCurrentLine = objReader.readLine()) != null) {
            input += strCurrentLine;

        }
        Program program = ScannerParserLexer.compile(input);
        // TODO: ScannerParserLexer

        // TODO: Syntax

        // TODO: Bytecode
    }
}
