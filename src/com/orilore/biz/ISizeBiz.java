package com.orilore.biz;
import com.orilore.entitys.*;
import java.util.List;
public interface ISizeBiz{
	public boolean addSize(Size size);
	public boolean removeSize(int id);
	public boolean modifySize(Size size);
	public Size getSize(int id);
	public List<Size> findSize();
}