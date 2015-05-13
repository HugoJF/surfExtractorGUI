package surfExtractorGUI.surf_extractor;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

public class Main {

	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		surfExtractor.SurfExtractor m = new surfExtractor.SurfExtractor();
		UserInterface.start();
		UserInterface.hold();
		try {
			m.generateArff(UserInterface.imagesetPath.getAbsolutePath(), 
					(Integer) UserInterface.kmeanskSpinner.getValue(), 
					(Integer) UserInterface.kmeansIterSpinner.getValue(), 
					"TestingGUI", UserInterface.arffDestinationPath.getAbsolutePath());
		} catch (FileNotFoundException | UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		UserInterface.done();
		
	}
}
