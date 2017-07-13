package com.orilore.biz;
import com.orilore.entitys.*;
import com.orilore.mapper.*;
import java.util.*;
import org.apache.ibatis.session.SqlSession;
public class SizeBiz implements ISizeBiz{
	private SqlSession session = null;
	@Override
	public boolean addSize(Size bean) {
		try{
			SizeMapper mapper = session.getMapper(SizeMapper.class);
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
	public boolean removeSize(int id) {
		try{
			SizeMapper mapper = session.getMapper(SizeMapper.class);
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
	public boolean modifySize(Size bean) {
		try{
			SizeMapper mapper = session.getMapper(SizeMapper.class);
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
	public Size getSize(int id) {
		Size bean = null;
		try{
			SizeMapper mapper = session.getMapper(SizeMapper.class);
			bean = mapper.selectOne(id);
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			session.close();
		}
		return bean;
	}
	@Override
	public List<Size> findSize() {
		List<Size> beans = null;
		try{
			SizeMapper mapper = session.getMapper(SizeMapper.class);
			beans = mapper.select();
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			session.close();
		}
		return beans;
	}
}
