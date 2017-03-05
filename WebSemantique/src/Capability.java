import java.util.ArrayList;

public class Capability {
	String sourceName;
	String predicate ;
	String filter ;
	int triplet;
	ArrayList<String> replication;
	
	public Capability(String sourceName, String predicate, String filter, int triplet, ArrayList<String> replication) {
		super();
		this.predicate = predicate;
		this.filter = filter;
		this.triplet = triplet;
		this.replication = replication;
		this.sourceName = sourceName;
	}

	public String getPredicate() {
		return predicate;
	}

	public void setPredicate(String predicate) {
		this.predicate = predicate;
	}

	public String getFilter() {
		return filter;
	}

	public void setFilter(String filter) {
		this.filter = filter;
	}

	public int getTriplet() {
		return triplet;
	}

	public void setTriplet(int triplet) {
		this.triplet = triplet;
	}

	public ArrayList<String> getReplication() {
		return replication;
	}

	public void addReplication(String source) {
		this.replication.add(source); 
	}

	public String getSourceName() {
		return sourceName;
	}

	public void setSourceName(String sourceName) {
		this.sourceName = sourceName;
	}

	
	
	
	
	

}
