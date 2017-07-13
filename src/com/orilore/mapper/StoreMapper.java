package com.orilore.mapper;
import java.util.List;
import com.orilore.entitys.*;
public interface StoreMapper{
	public void insert(Store bean);
	public Store selectOne(int id);
	public void delete(int id);
	public List<Store> select();
	public void update(Store bean);
}