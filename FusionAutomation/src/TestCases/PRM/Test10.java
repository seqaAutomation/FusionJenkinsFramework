package TestCases.PRM;

import java.io.File;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import TestEngine.Base;
import TestEngine.ReportCreator;


public class Test10 extends Base{
  @Test
  public void f() {
	  
	  String a = "Gmail{}";
	  System.out.println(a.substring(0,a.indexOf('{')));
	  System.out.println(a.substring(a.indexOf('{')+1,a.length()-1));
	  
	  if(a.substring(a.indexOf('{')+1,a.length()-1).split(",")[0].isEmpty())
	  {
		System.out.println("a");  
	  }
	  else
	  {
		  System.out.println("b"); 
	  }
	  System.out.println(a.substring(a.indexOf('{')+1,a.length()-1).split(",")[0]);
	  System.out.println("Started Test10");
	  System.out.println("End Test10");
//	  type("test", ReportCreator.getTestName());
	  String url = fileUtility.getDataFromConfig("URL");
	  driver().get(url);
	  think(3000);
	  report.captureScreenShot(url);	
	  report.log("PASS", ReportCreator.getTestName());
//	  report.log("PASS", System.getProperty("url"));
//	  report.log("PASS", System.getProperty("url")+" Ant test completed");
//	  
//	  
//	  File directory = new File("./src/test/com/TestCases");
//
//	    // get all the files from a directory
//	    File[] fList = directory.listFiles();
//
//	    for (File file : fList) {
//	      if (file.isDirectory()) {
//	            System.out.println(file.getAbsolutePath());
//	            
//	            String a = file.getName();
//	            System.out.println(a);
//	        }
//	    }
//	  System.out.println(ReportCreator.getExtentTest());
//	  ReportCreator.getExtentTest().log(LogStatus.INFO, "Test1");
//	  type("test", "Test1");
//	  report.log("Pass", "Test1");
  }
}
