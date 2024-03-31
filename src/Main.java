import generated.EmojiLangLexer;
import generated.EmojiLangParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Main {
    public static void main(String[] args) throws Exception {
        CharStream input = CharStreams.fromFileName(args[0]);

        EmojiLangLexer lexer = new EmojiLangLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        EmojiLangParser parser = new EmojiLangParser(tokens);

        ParseTree tree = parser.prog();

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new LLVMActions(), tree);

    }
}
