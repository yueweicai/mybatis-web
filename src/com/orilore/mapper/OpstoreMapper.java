package com.orilore.mapper;
import java.util.List;
import com.orilore.entitys.*;
public interface OpstoreMapper{
	public void insert(Opstore bean);
	public Opstore selectOne(int id);
	public void delete(int id);
	public List<Opstore> select();
	public void update(Opstore bean);
}