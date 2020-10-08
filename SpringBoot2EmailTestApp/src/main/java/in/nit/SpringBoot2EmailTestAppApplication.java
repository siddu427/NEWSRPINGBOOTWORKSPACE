package in.nit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.io.FileSystemResource;

import in.nit.service.NitMailService;
@SpringBootApplication
public class SpringBoot2EmailTestAppApplication {
	public static final String[] TO= {"siddarthakamble427@gmail.com"};
	public static final String[] CC= {"siddarthakamble1994@gmail.com"};
	public static final String SUBJECT="HELLO BODDY WELCOME TO TEDBAKERS PROJECT\n"+ "<b>siddartha</b>";
	public static final String TEXT="HELLO BODDY WELCOME TO TEDBAKERS PROJECT";
	public static final FileSystemResource file=new FileSystemResource("C:\\Users\\siddartha\\Desktop\\koala.jpg");


	public static void main(String[] args) {
		
		ConfigurableApplicationContext run = SpringApplication.run(SpringBoot2EmailTestAppApplication.class, args);
	
	NitMailService bean = run.getBean(NitMailService.class);
	boolean sendEmail = bean.sendEmail(TO, CC, null, SUBJECT, TEXT, file);
	System.out.println("****************************");
	System.out.println(sendEmail);
	}
	

}
