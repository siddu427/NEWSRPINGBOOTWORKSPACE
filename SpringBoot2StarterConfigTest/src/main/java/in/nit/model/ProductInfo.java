package in.nit.model;

public class ProductInfo {

	private Integer pid;

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	@Override
	public String toString() {
		return "ProductInfo [pid=" + pid + "]";
	}
	
	
}
