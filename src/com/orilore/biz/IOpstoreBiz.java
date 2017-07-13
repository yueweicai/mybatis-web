package com.orilore.biz;
import com.orilore.entitys.*;
import java.util.List;
public interface IOpstoreBiz{
	public boolean addOpstore(Opstore opstore);
	public boolean removeOpstore(int id);
	public boolean modifyOpstore(Opstore opstore);
	public Opstore getOpstore(int id);
	public List<Opstore> findOpstore();
}