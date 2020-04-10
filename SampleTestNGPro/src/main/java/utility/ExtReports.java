
package main.java.utility;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtReports {
	
private static ExtentReports extent;
    
    public synchronized static ExtentReports getReporter(String filePath) {
        if (extent == null) {
            extent = new ExtentReports(filePath, true);
            
            extent
                .addSystemInfo("Host Name", "Daimler")
                .addSystemInfo("Environment", "SIT");
        }        
        return extent;
    }
    
    public synchronized static ExtentReports getReporter() {
        return extent;
    }
}
