package net.codejava.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProductService {
	@Autowired ProductRepository repo;
	
	public void save(Product product) {
		repo.save(product);
	}
	
	public List<Product> listAll() {
		return (List<Product>) repo.findAll();
	}
	
	public Product get(Long id) {
		return repo.findById(id).get();
	}
	
	public void delete(Long id) {
		repo.deleteById(id);
	}
	
	public List<Product> search(int keyword) {
		return repo.search(keyword);
	}
}
