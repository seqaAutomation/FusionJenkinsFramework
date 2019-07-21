package Utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ConfigCreator {
  @Test
  public void loadConfigValFromJenkins() 
  {
	  String url = System.getProperty("url");
	  String browser = System.getProperty("Browser");
	  String productParallelRun = System.getProperty("ProductParallelRun");
	  String testCaseInProductParallelRun = System.getProperty("TestCaseInProductParallelRun");
	  String parallelSessions = System.getProperty("ParallelSessions");
	  String product = System.getProperty("Product");
	  String sendEmail = System.getProperty("SendEmail");
	  String emailId = System.getProperty("EmailId");
	  String release = System.getProperty("Release");
	  try 
	  {
      FileInputStream in = new FileInputStream("Files/Config.properties");
      Properties props = new Properties();
      
		props.load(in);
	
      in.close();
      
      if(url !=null)
      {
    	  props.setProperty("URL", url);
      }
      if(browser !=null)
      {
    	  props.setProperty("Browser", browser);
      }
      if(productParallelRun !=null)
      {
      props.setProperty("ProductParallelRun", productParallelRun);
      }
      if(testCaseInProductParallelRun !=null)
      {
      props.setProperty("TestCaseInProductParallelRun", testCaseInProductParallelRun);
      }
      if(parallelSessions !=null)
      {
    	  props.setProperty("ParallelSessions", parallelSessions);
      }
      if(product !=null)
      {
      props.setProperty("Product", product);
      }
      if(sendEmail !=null)
      {
    	  props.setProperty("SendEmail", sendEmail);
      }
      if(emailId !=null)
      {
    	  props.setProperty("EmailId", emailId);
      }
      if(release !=null)
      {
    	  props.setProperty("Release", release);
      }
      
      FileOutputStream out = new FileOutputStream("Files/Config.properties");
      props.store(out, null);
      out.close();
      } catch (IOException e) {
  		// TODO Auto-generated catch block
  		e.printStackTrace();
  	}
	  
  }
}
