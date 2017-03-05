import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<TriplePattern> lisTP = QueryParser.parse("query");
		
		for (TriplePattern triplePattern : lisTP) {
			System.out.println(triplePattern.getObject());
			System.out.println(triplePattern.getPredicate());
			System.out.println(triplePattern.getSubject());
			System.out.println("----------------------------");
		}
		
		SourceDescription sourceDescription = DescriptionParser.parse("source1");
		SourceDescription sourceDescription2 = DescriptionParser.parse("source2");
		SourceDescription sourceDescription3 = DescriptionParser.parse("source3");
		
		System.out.println("-------------- source ---------------------");
		System.out.println(sourceDescription.getName());
		
		for (Capability cap : sourceDescription.getCapabilities()) {
			System.out.println("Capability");
			System.out.println("\t"+cap.getSourceName());
			System.out.println("\t"+cap.getPredicate());
			System.out.println("\t"+cap.getFilter());
			System.out.println("\t"+cap.getTriplet());
			System.out.println("\t"+cap.getReplication().toString());
			
		}
		
		System.out.println("-------------- source ---------------------");
		System.out.println(sourceDescription2.getName());
		
		for (Capability cap : sourceDescription2.getCapabilities()) {
			System.out.println("Capability");
			System.out.println("\t"+cap.getSourceName());
			System.out.println("\t"+cap.getPredicate());
			System.out.println("\t"+cap.getFilter());
			System.out.println("\t"+cap.getTriplet());
			System.out.println("\t"+cap.getReplication().toString());
			
		}
		
		System.out.println("-------------- source ---------------------");
		System.out.println(sourceDescription3.getName());
		
		for (Capability cap : sourceDescription3.getCapabilities()) {
			System.out.println("Capability");
			System.out.println("\t"+cap.getSourceName());
			System.out.println("\t"+cap.getPredicate());
			System.out.println("\t"+cap.getFilter());
			System.out.println("\t"+cap.getTriplet());
			System.out.println("\t"+cap.getReplication().toString());
		}
		
		App app = new App();
		
		app.affichier();
		

	}

}
