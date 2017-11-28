package r.beans;

public class Vender {
	String VenderName;
	String Venderid;
	
	public Vender(String venderName, String venderid) {
		super();
		VenderName = venderName;
		Venderid = venderid;
	}

	public String getVenderName() {
		return VenderName;
	}

	public void setVenderName(String venderName) {
		VenderName = venderName;
	}

	public String getVenderid() {
		return Venderid;
	}

	public void setVenderid(String venderid) {
		Venderid = venderid;
	}

	@Override
	public String toString() {
		return "VenderName=" + VenderName + ", Venderid=" + Venderid ;
	}
	
	
}
