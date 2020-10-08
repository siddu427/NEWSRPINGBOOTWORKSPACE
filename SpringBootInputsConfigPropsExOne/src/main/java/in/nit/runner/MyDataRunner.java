package in.nit.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component // create object
@ConfigurationProperties(prefix = "my.app")
public class MyDataRunner implements CommandLineRunner{

	private int id;
	private String code;
	private double version;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);
	}
	
	//alt+shift+S O >DeselectAll > Generate
	public MyDataRunner() {
		super();
	}

	//alt+shift+S R > selectAll > Generate
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public double getVersion() {
		return version;
	}

	public void setVersion(double version) {
		this.version = version;
	}

	//alt+shift+S  S  > Generate
	@Override
	public String toString() {
		return "MyDataRunner [id=" + id + ", code=" + code + ", version=" + version + "]";
	}
	
}
