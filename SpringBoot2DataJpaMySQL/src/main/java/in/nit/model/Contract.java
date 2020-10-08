package in.nit.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="cnttab")
@NamedQuery(name = "Contract.typeBasedConract", query = "from in.nit.model.Contract")
public class Contract {
	@Id
	private Integer cid;
	private String ctype;
	private Double camt;
}
