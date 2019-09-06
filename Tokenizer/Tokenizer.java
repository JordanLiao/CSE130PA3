import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.IOException;

public class Tokenizer {
	public static void tokenize(String file) {
		StringBuilder builder = new StringBuilder();
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			PrintWriter out = new PrintWriter("tokenized_" + file);
			
			String line = reader.readLine();
			while(line != null) {
				tokenizeLine(line, builder);
				line = reader.readLine();
			}
			out.println(builder.toString());
			reader.close();
			out.close();
		}
		catch(IOException e) {
			System.err.println("Error: Please Enter Correct File.");
		}
	}

	private static void tokenizeLine(String line, StringBuilder builder) {
		String[] terms = line.split(" ");
		for(int i = 0; i < terms.length; i++) {
			builder.append(matchToken(terms[i]) + " ");
		}
	}

	private static String matchToken(String term){
		try {
			Float.parseFloat(term);
			return "num";
		}
	  catch(Exception e) {
			switch(term) {
				case "\\":
					return "backslash";
				case "(":
					return "leftParens";
				case ")":
					return "rightParens";
				case ".":
					return "dot";
				case "+":
					return "plus";
				case "-":
					return "minus";
				case "*":
					return "multiply";
				case "/":
					return "divide";
				case "%":
					return "mod";
				default:
					return "identifier";
			}
		}
	}

	public static void main(String[] args) {
		Tokenizer.tokenize(args[0]);
	}

}
