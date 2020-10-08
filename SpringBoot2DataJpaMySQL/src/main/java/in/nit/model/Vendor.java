package in.nit.model;

//ctrl+shift+O
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="vendortab")
public class Vendor {
	@Id
	private Integer venId; 
	private String venName;
	private String venType;
}






