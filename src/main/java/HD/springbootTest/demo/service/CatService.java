package HD.springbootTest.demo.service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import HD.springbootTest.demo.bean.Cat;
import HD.springbootTest.demo.respository.Cat2Repository;
import HD.springbootTest.demo.respository.CatRepository;

@Service
public class CatService {
	
	@Resource
	private CatRepository catRepository;
	
	@Resource
	private Cat2Repository cat2Repository;
	
	/**
	 * save,update ,delete 方法需要绑定事务.
	 * 
	 * 使用@Transactional进行事务的绑定.
	 * 
	 * @param cat
	 */
	
	//保存数据.
	@Transactional
	public void save(Cat cat){
		catRepository.save(cat);
	}
	
	//删除数据》
	@Transactional
	public void delete(int id){
		catRepository.delete(id);
	}
	
	//查询数据.
	public Iterable<Cat> getAll(){
		return catRepository.findAll();
	}
	
	public Cat findByCatName(String catName){
		return cat2Repository.findByCatName(catName);
	}
	
	
	public Cat findByCatName2(String catName){
		return cat2Repository.findMyCatName2(catName);
	}
	
}
