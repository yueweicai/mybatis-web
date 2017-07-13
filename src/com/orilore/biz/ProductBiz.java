package com.orilore.biz;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.orilore.entitys.*;
import com.orilore.mapper.*;
import com.util.SessionUtil;

import java.util.*;
import org.apache.ibatis.session.SqlSession;
public class ProductBiz implements IProductBiz{
	private SqlSession session = null;
	@Override
	public boolean addProduct(Product bean) {
		try{
			ProductMapper mapper = session.getMapper(ProductMapper.class);
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
	public boolean removeProduct(int id) {
		try{
			ProductMapper mapper = session.getMapper(ProductMapper.class);
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
	public boolean modifyProduct(Product bean) {
		try{
			ProductMapper mapper = session.getMapper(ProductMapper.class);
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
	public Product getProduct(int id) {
		Product bean = null;
		try{
			ProductMapper mapper = session.getMapper(ProductMapper.class);
			bean = mapper.selectOne(id);
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			session.close();
		}
		return bean;
	}
	@Override
	public List<Product> findProduct(int page) {
		List<Product> beans = null;
		try{
			this.session = SessionUtil.getSession();
			ProductMapper mapper = session.getMapper(ProductMapper.class);
			PageHelper.startPage(page, 10);
			beans = mapper.select();
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			session.close();
		}
		return beans;
	}
}
