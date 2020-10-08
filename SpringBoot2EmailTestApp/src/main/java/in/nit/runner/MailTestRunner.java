/*
 * package in.nit.runner;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.boot.CommandLineRunner; import
 * org.springframework.core.io.FileSystemResource; import
 * org.springframework.stereotype.Component;
 * 
 * import in.nit.service.NitMailService;
 * 
 * @Component public class MailTestRunner implements CommandLineRunner {
 * 
 * @Autowired private NitMailService email;
 * 
 * @Override public void run(String... args) throws Exception {
 * 
 * //FileSystemResource file=new
 * FileSystemResource("C:\\Users\\Public\\Pictures\\Sample Pictures\\Koala.jpg"
 * ); FileSystemResource file=new
 * FileSystemResource("C:\\Users\\siddartha\\Desktop\\koala.jpg"); boolean
 * sent=email.sendEmail( new String[] { "javabyraghu@gmail.com", }, new String[]
 * { "vbmk6789@gmail.com", "kdipu1002@gmail.com"
 * 
 * } null, new String[] { "rm705400@gmail.com", "sarathkrreddy@gmail.com",
 * "dharmendra123space@gmail.com"
 * 
 * }null, "Welcome every one",
 * "<h3>Hello abcd</h3> <b>AA</b> <i>aa</i> <u>Welcome</u>", file); if(sent) {
 * System.out.println("Email sent"); }else {
 * System.out.println("sending failed.."); }
 * 
 * 
 * }
 * 
 * }
 * 
 */