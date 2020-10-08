package in.nit.runner;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nit.model.Vendor;

@Component
public class VendorDatatestRunner implements CommandLineRunner {
	@Autowired
	private EntityManager em;
	
	@Override
	public void run(String... args) throws Exception {
		CriteriaBuilder builder=em.getCriteriaBuilder();
		
		//SQL: select vname from vendortab where vtype=?
		
		//1. Specify Output Type: one variable : String(DT)
		CriteriaQuery<String> query=builder.createQuery(String.class);
		
		//2. provide from section
		Root<Vendor> from=query.from(Vendor.class);
		
		//3. specify column name/variable name
		query.select(from.get("venName"));
		
		//4. where condition
		query.where(builder.equal(from.get("venType"), "CONT"));
		
		//--Execution of Query-----------------
		em.createQuery(query).getResultList()
		.forEach(System.out::println);
			
	}
}
