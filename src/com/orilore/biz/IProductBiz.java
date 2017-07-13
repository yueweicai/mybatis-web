package com.orilore.biz;
import com.orilore.entitys.*;
import java.util.List;
public interface IProductBiz{
	public boolean addProduct(Product product);
	public boolean removeProduct(int id);
	public boolean modifyProduct(Product product);
	public Product getProduct(int id);
	public List<Product> findProduct(int page);
}