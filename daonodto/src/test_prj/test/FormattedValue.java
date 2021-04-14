package test_prj.test;

import java.util.HashMap;
import java.util.Map;

public class FormattedValue implements Scalar<String> {
	Map <String, String> map;
	
	public FormattedValue(Map<String, String> cp) {
		this.map = new HashMap<String, String>(cp);
	}
	
	@Override
	public String value() {
		String s = "";
		for(Map.Entry<String,String> entry : this.map.entrySet()) {
             s +=  "<b>"+entry.getValue()+"</b>";
		}
		return s;
	}
}
