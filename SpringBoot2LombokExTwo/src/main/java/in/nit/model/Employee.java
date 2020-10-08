package in.nit.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	@NonNull
	private Integer eid;
	private String ename;
	private Double esal;
}
