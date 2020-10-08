package in.nit.service;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MyReportsService {
	
	@Scheduled(cron = "*/10 * * * * *")
	public void genRepo() {
		System.out.println("Hello"+new Date());
	}
}
