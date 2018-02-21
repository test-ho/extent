package Listerners.Listerners;

import org.testng.collections.Maps;

import java.util.Map;

import com.vimalselvam.testng.SystemInfo;


	public class MySystemInfo implements SystemInfo {
	    public Map<String, String> getSystemInfo() {
	        Map<String, String> systemInfo = Maps.newHashMap();
	        systemInfo.put("Test Env", "QA");
	        systemInfo.put("Browser", "firefox");
	        System.out.println("Under SystemInfo");
	        return systemInfo;
	        
	    }
	}


