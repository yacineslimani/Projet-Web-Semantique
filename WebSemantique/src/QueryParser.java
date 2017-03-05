import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class QueryParser {


	
	public static ArrayList<TriplePattern> parse (String fileQuery){
		ArrayList<TriplePattern> listTp =new ArrayList<TriplePattern>();	

		try {
			File f = new File("data/"+fileQuery);
			BufferedReader b = new BufferedReader(new FileReader(f));
			String readLine = "";
			while ((readLine = b.readLine()) != null) {
				String str[]=readLine.split(" ");
				listTp.add(new TriplePattern(str[0], str[1], str[2]));
			}
			b.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		return listTp;
	}

}
