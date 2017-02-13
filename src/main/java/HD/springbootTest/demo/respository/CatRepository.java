package HD.springbootTest.demo.respository;

import org.springframework.data.repository.CrudRepository;

import HD.springbootTest.demo.bean.Cat;

public interface CatRepository extends CrudRepository<Cat, Integer>{

}
