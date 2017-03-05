import java.util.ArrayList;

public class SourceDescription {
	
	String name;
	ArrayList<Capability> capabilities;
	
	public SourceDescription(String name) {
		super();
		this.name = name;
		capabilities = new ArrayList<Capability>();
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Capability> getCapabilities() {
		return capabilities;
	}

	public void addCapabilities(Capability capability) {
		this.capabilities.add(capability); 
	}
	
	
	
	

}
