package surfExtractorGUI.surf_extractor;

import java.io.FileNotFoundException;

import surfExtractor.image_set.ImageSet;
import surfExtractor.surf_extractor.SurfExtractor;

public class Main {

	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		surfExtractor.surf_extractor.Main m = new surfExtractor.surf_extractor.Main();
		UserInterface.start();
		UserInterface.hold();
		m.generateArff(UserInterface.imagesetPath.getAbsolutePath(), 
				(Integer) UserInterface.kmeanskSpinner.getValue(), 
				(Integer) UserInterface.kmeansIterSpinner.getValue(), 
				"TestingGUI", UserInterface.arffDestinationPath.getAbsolutePath());
		UserInterface.done();
		
	}
}
