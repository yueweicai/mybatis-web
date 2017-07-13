package com.orilore.biz;
import com.orilore.entitys.*;
import com.orilore.mapper.*;
import java.util.*;
import org.apache.ibatis.session.SqlSession;
public class StoreBiz implements IStoreBiz{
	private SqlSession session = null;
	@Override
	public boolean addStore(Store bean) {
		try{
			StoreMapper mapper = session.getMapper(StoreMapper.class);
			mapper.insert(bean);
			session.commit();
			return true;
		}catch(Exception ex){
			ex.printStackTrace();
			return false;
		}finally{
			session.close();
		}
	}
	@Override
	public boolean removeStore(int id) {
		try{
			StoreMapper mapper = session.getMapper(StoreMapper.class);
			mapper.delete(id);
			session.commit();
			return true;
		}catch(Exception ex){
			ex.printStackTrace();
			return false;
		}finally{
			session.close();
		}
	}
	@Override
	public boolean modifyStore(Store bean) {
		try{
			StoreMapper mapper = session.getMapper(StoreMapper.class);
			mapper.update(bean);
			session.commit();
			return true;
		}catch(Exception ex){
			ex.printStackTrace();
			return false;
		}finally{
			session.close();
		}
	}
	@Override
	public Store getStore(int id) {
		Store bean = null;
		try{
			StoreMapper mapper = session.getMapper(StoreMapper.class);
			bean = mapper.selectOne(id);
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			session.close();
		}
		return bean;
	}
	@Override
	public List<Store> findStore() {
		List<Store> beans = null;
		try{
			StoreMapper mapper = session.getMapper(StoreMapper.class);
			beans = mapper.select();
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			session.close();
		}
		return beans;
	}
}
