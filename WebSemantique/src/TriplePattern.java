import java.util.ArrayList;

public class TriplePattern {
	
	String object;
	String predicate;
	String subject;
	ArrayList<Capability> relevantCapability ;
	
	public TriplePattern(String object, String predicate, String subject) {
		super();
		this.object = object;
		this.predicate = predicate;
		this.subject = subject;
		relevantCapability = new ArrayList<Capability>();
	}

	public String getObject() {
		return object;
	}

	public void setObject(String object) {
		this.object = object;
	}

	public String getPredicate() {
		return predicate;
	}

	public void setPredicate(String predicate) {
		this.predicate = predicate;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public void addrelevantCapability(Capability capability){
		relevantCapability.add(capability);
	}

	public ArrayList<Capability> getRelevantCapability() {
		return relevantCapability;
	}

	public void setRelevantCapability(ArrayList<Capability> relevantCapability) {
		this.relevantCapability = relevantCapability;
	}
	
	
	
	

}
