package surfExtractorGUI.surf_extractor;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

import surfExtractor.SurfExtractor;

public class Main {

	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		SurfExtractor m = new SurfExtractor();
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
