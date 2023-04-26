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
        final String inputFile = args[0];

        // TODO: ScannerParserLexer

        // TODO: Syntax

        // TODO: Bytecode
    }
}
