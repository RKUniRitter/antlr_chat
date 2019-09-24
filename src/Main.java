import java.io.IOException;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//https://stackoverflow.com/a/52850358/2396999
		//https://stackoverflow.com/a/44355814/2396999
		//ANTLRInputStream input = new ANTLRInputStream( System.in);
		//CharStream charStream = CharStreams.fromFileName("/path/to/file.ext");
		CharStream input = CharStreams.fromString("john SAYS: hello @michael this will not work");
		//CharStream input = CharStreams.fromStream(System.in);
	    
		Chat lexer = new Chat(input);

		CommonTokenStream tokens = new CommonTokenStream(lexer);

		HelloParser parser = new HelloParser(tokens);
		ParseTree tree = parser.r(); // begin parsing at rule 'r'
		System.out.println(tree.toStringTree(parser)); // print LISP-style tree		

	}

}
