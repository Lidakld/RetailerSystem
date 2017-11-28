package r.beans;

public class Brand {
	String BrandName;
	String Brandid;
	Vender vender;
	
	public Brand(String brandName, String brandid, Vender vender) {
		super();
		BrandName = brandName;
		Brandid = brandid;
		this.vender = vender;
	}

	public String getBrandName() {
		return BrandName;
	}

	public void setBrandName(String brandName) {
		BrandName = brandName;
	}

	public String getBrandid() {
		return Brandid;
	}

	public void setBrandid(String brandid) {
		Brandid = brandid;
	}

	public Vender getVender() {
		return vender;
	}

	public void setVender(Vender vender) {
		this.vender = vender;
	}

	@Override
	public String toString() {
		return "BrandName=" + BrandName + ", Brandid=" + Brandid + ", vender=" + vender ;
	}
	
	
}
