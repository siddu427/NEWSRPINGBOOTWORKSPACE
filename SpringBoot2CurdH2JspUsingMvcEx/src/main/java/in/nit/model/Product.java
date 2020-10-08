package in.nit.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Product {
	@Id
	private Integer prodId;
	private String prodCode;
	private Double prodCost;
	
	private Double prodDiscount;
	private Double prodGst;
}
