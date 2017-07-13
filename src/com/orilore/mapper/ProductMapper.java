package com.orilore.mapper;
import java.util.List;
import com.orilore.entitys.*;
public interface ProductMapper{
	public void insert(Product bean);
	public Product selectOne(int id);
	public void delete(int id);
	public List<Product> select();
	public void update(Product bean);
}