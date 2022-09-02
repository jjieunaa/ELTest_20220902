package hello;

import java.util.Collections;
import java.util.List;
import java.util.Map;


public class DataBean implements java.io.Serializable{

	public static final long serialVersionUID = 289892892L;
	
	private Map<String, Object> map;
	private List<String> list;
	private String[] strArray;
	
	public DataBean() {
		map = Collections.EMPTY_MAP;
		list = Collections.EMPTY_LIST;
		strArray = new String[3];
	}

	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public String[] getStrArray() {
		return strArray;
	}

	public void setStrArray(String[] strArray) {
		this.strArray = strArray;
	}
} 
