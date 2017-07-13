package com.orilore.biz;
import com.orilore.entitys.*;
import com.orilore.mapper.*;
import java.util.*;
import org.apache.ibatis.session.SqlSession;
public class OpstoreBiz implements IOpstoreBiz{
	private SqlSession session = null;
	@Override
	public boolean addOpstore(Opstore bean) {
		try{
			OpstoreMapper mapper = session.getMapper(OpstoreMapper.class);
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
	public boolean removeOpstore(int id) {
		try{
			OpstoreMapper mapper = session.getMapper(OpstoreMapper.class);
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
	public boolean modifyOpstore(Opstore bean) {
		try{
			OpstoreMapper mapper = session.getMapper(OpstoreMapper.class);
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
	public Opstore getOpstore(int id) {
		Opstore bean = null;
		try{
			OpstoreMapper mapper = session.getMapper(OpstoreMapper.class);
			bean = mapper.selectOne(id);
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			session.close();
		}
		return bean;
	}
	@Override
	public List<Opstore> findOpstore() {
		List<Opstore> beans = null;
		try{
			OpstoreMapper mapper = session.getMapper(OpstoreMapper.class);
			beans = mapper.select();
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			session.close();
		}
		return beans;
	}
}
