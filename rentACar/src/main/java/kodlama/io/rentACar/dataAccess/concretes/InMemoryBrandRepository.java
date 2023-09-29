package kodlama.io.rentACar.dataAccess.concretes;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;

@Repository
public class InMemoryBrandRepository implements BrandRepository{

	
	List<Brand> brands;
	
	public InMemoryBrandRepository() {
		
		brands = new ArrayList<Brand>();
		brands.add(new Brand(1,"BMW"));
		brands.add(new Brand(2,"Audi"));
		brands.add(new Brand(3,"Porche"));
		brands.add(new Brand(4,"AlfaRomeo"));
		brands.add(new Brand(5,"Bugatti"));
		brands.add(new Brand(6,"Şahin"));
	}
	
	
	@Override
	public List<Brand> getALL() {
		
		return brands;
	}

}
