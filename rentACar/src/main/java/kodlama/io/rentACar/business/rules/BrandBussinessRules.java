package kodlama.io.rentACar.business.rules;

import org.springframework.stereotype.Service;

import kodlama.io.rentACar.core.utilities.exceptions.BussinessException;
import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import lombok.AllArgsConstructor;
@AllArgsConstructor
@Service
public class BrandBussinessRules {
	private BrandRepository brandRepository;
	public void checkIfBrandNameExist(String name) {
		if(this.brandRepository.existsByName(name)) {
			throw new BussinessException("Brand name already exist");
		}
		
	}

}
