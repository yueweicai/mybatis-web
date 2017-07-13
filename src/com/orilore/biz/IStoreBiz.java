package com.orilore.biz;
import com.orilore.entitys.*;
import java.util.List;
public interface IStoreBiz{
	public boolean addStore(Store store);
	public boolean removeStore(int id);
	public boolean modifyStore(Store store);
	public Store getStore(int id);
	public List<Store> findStore();
}