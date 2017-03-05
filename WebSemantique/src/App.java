import java.util.ArrayList;

public class App {



	

		ArrayList<TriplePattern> listTP = QueryParser.parse("query");
		SourceDescription sourceDescription1 = DescriptionParser.parse("source1");
		SourceDescription sourceDescription2 = DescriptionParser.parse("source2");
		SourceDescription sourceDescription3 = DescriptionParser.parse("source3");
		
		
		public App(){
			
			relevantCapability(sourceDescription1);
			relevantCapability(sourceDescription2);
			relevantCapability(sourceDescription3);
		}
		
		public void relevantCapability(SourceDescription sourceDescription){
			for (TriplePattern tp : listTP){

				for (Capability cap : sourceDescription.getCapabilities()) {
					if(tp.getPredicate().equals(cap.getPredicate())){
						tp.addrelevantCapability(cap);
					}
				}
			}
		}
		
		public void optimisationFragment (){
			
			
		}
		
		public void affichier(){
			
			for (TriplePattern tp : listTP){
				System.out.println("relevante capability for triple pattern : "+ tp.getPredicate());
				for (Capability cap : tp.getRelevantCapability()) {
					System.out.println("\t"+ cap.getSourceName());
				}
			}
			
		}
		
		

	}
	
	



