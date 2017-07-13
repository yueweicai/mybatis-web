package com.orilore.mapper;
import java.util.List;
import com.orilore.entitys.*;
public interface SizeMapper{
	public void insert(Size bean);
	public Size selectOne(int id);
	public void delete(int id);
	public List<Size> select();
	public void update(Size bean);
}