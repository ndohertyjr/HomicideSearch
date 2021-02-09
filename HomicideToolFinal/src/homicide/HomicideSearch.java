/**
 * Search functionality for Chrome and the method to write to a .txt file.  Inherits from MainDesign.
 * 
 * @since V1.0
 * @author Neil Doherty
 * 
 */

package homicide;

import java.net.URI;
import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;





public class HomicideSearch extends MainDesign {
	
	HomicideSearch() {
		
	}
    	
	File file = new File("HomicideSearchResults.txt");
	Desktop desktop = Desktop.getDesktop();
		
	//Open file
	public void openFile(File fileLocation) throws IOException {
		
		desktop.open(fileLocation);
		
	}
	
	//Parse string to format multiple names for URI
	public String parseString(String input) {
		String parsedString = input;
		input.trim();
		parsedString = input.replaceAll(" ", "+");
		return parsedString;
	}
	
	//Execute search
	public void chromeSearch(String beneName, String insuredName, String date) {
		try {
			String updatedBeneName = parseString(beneName);
			String updatedInsuredName = parseString(insuredName);
			String updatedDate = parseString(date);
			
			String searchParam1 = "https://www.google.com/search?q="+ updatedInsuredName +"+murdered+by+" + updatedBeneName;
			String searchParam2 = "https://www.google.com/search?q=homicide+involving+" + updatedInsuredName + "+and+" + updatedBeneName;
			String searchParam3 = "https://www.google.com/search?q=" + updatedInsuredName + "+murdered+by+" + updatedBeneName + "+on+" + updatedDate;
			URI firstSearch = new URI(searchParam1);
			URI secondSearch = new URI(searchParam2);
			URI thirdSearch = new URI(searchParam3);
			
			desktop.browse(firstSearch);
			desktop.browse(secondSearch);
			desktop.browse(thirdSearch);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//Write to file
	public void outputSearchDataToFile(String data) {
		try {
			
			file.setWritable(true);
			
			//Create writers to create and add search data to file
			FileWriter writer = new FileWriter(file);
			BufferedWriter bufferedWriter = new BufferedWriter(writer);
			
		
			bufferedWriter.write(data);
			
			//open print results
			if (file.canWrite()) {
				openFile(file);
			}
			
			
			bufferedWriter.close();
			writer.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
	}
	

	
}

