package in.nit.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import in.nit.service.AlertService;

@Component
@Profile("default")
public class MailAlertService implements AlertService {
	
	@Value("${app.code}")
	private String code;
	
	@Override
	public void showAlert() {
		System.out.println("MAIL ALERT =>"+code);
	}

}
