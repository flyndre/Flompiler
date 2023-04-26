import java.io.File;
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
    public static void main(String[] args) {
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

        // TODO: ScannerParserLexer

        // TODO: Syntax

        // TODO: Bytecode
    }
}
