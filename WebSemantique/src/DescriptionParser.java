import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DescriptionParser {

	

	public static SourceDescription parse(String file){
		 
		 SourceDescription sourceDescription= new SourceDescription(file);
		try {
			File f = new File("data/"+file);
			BufferedReader b = new BufferedReader(new FileReader(f));
			String readLine = "";
			while ((readLine = b.readLine()) != null) {
				System.out.println(readLine);
				String str[]=readLine.split(" ");
				String source[] = str[3].split(",");

				ArrayList<String> s = new ArrayList<String>();
				for (int i=0 ; i<source.length;i++){
					s.add(source[i]);
				}
				Capability capability = new Capability(file ,str[0], str[1], Integer.parseInt( str[2]),s);
				sourceDescription.addCapabilities(capability);
			}
			b.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		return sourceDescription;

	}

}
