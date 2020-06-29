package boimpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import bo.LockerBO;
import model.Locker;

public class LockerBOImpl implements LockerBO{
	
	private static Map<Integer, Locker> lockerMap=new HashMap<>();
	private static int fileid=0;

	@Override
	public List<String> getallfiles() {
		List<String> lockerList=new ArrayList<String>();
		lockerMap.values();
		
		for (Integer id: lockerMap.keySet()){
            Integer key = id;
            String value = lockerMap.get(id).toString();  
            System.out.println(key + " " + value);  
		}
		return lockerList;
	}
	
	public Locker demo(Locker locker) {
		getallfiles();
		return locker;
	}

	@Override
	public Locker createfile(Locker locker) {
		locker.setId(++fileid);
		lockerMap.put(locker.getId(),locker);
		System.out.println("Value entered to HashMap");
		getallfiles();
		return locker;
	}

	@Override
	public Locker deletefile(int key) {
		lockerMap.remove(key);
		System.out.println("Value deleted from HashMap");
		getallfiles();
		return null;
	}
	
	@Override
	public Locker searchfile(String filename) {
		// TODO Auto-generated method stub
		return null;
	}


}
