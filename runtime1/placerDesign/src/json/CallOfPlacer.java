package json;

import java.io.File;
import placer.Global;

public class CallOfPlacer {
	
	/**
	 * function that allow to call Placer and get the return of it with a creation of placerOut.json
	 * @param global
	 * @param newFolderString
	 */
	
	protected static void placerCall(Global global, String newFolderString) {
		String pathPlacer = "placerFile";
		File pathPlacerFile = new File(pathPlacer);
		if(!pathPlacerFile.exists()) {
			System.out.println("The File placerFile is not at a good place");
		} else if (!pathPlacerFile.isDirectory()) {
			System.out.println("The path '" + pathPlacerFile + "' is not a folder");
		}
		
		File pathJsonFile = new File(newFolderString);
		
		String command = "java -classpath \"" + pathPlacer + "\\oscar-algo_2.11-4.0.0-SNAPSHOT.jar;" + pathPlacer + "\\" +
		"oscar-cp_2.11-4.0.0-SNAPSHOT.jar;" + pathPlacer + "\\PlacerBeta5Beta4.jar\" placer.Main --in="
		+ newFolderString + "\\CopyFile-placer.json --out="+ newFolderString +"\\placerOut.json --timeLimit=5\r\n";
		// --verbose";
		
		/*String command = "java -classpath \"" + pathPlacer + "\\oscar-algo_2.11-4.0.0-SNAPSHOT.jar;" + pathPlacer + "\\" +
		"oscar-cp_2.11-4.0.0-SNAPSHOT.jar;" + pathPlacer + "\\PlacerBeta5.jar\" placer.Main --in="
		+ newFolderString + "\\CopyFile-placer.json --out="+ newFolderString +"\\placerOut.json";
		if(!global.getCommandLineParameters().isEmpty()) {
			//op sur chaque char
			command = command+" "+ global.getCommandLineParameters();
		}*/
		
		try {
			//allow to use the terminal
			Runtime runtime = Runtime.getRuntime();
			//Process process = runtime.exec("cmd.exe /c start cmd /s /k \"" + command + "\"");
			Process process = runtime.exec(command);
			process.waitFor();
			if(pathJsonFile.listFiles().length == 5) {
				System.out.println("Creation of PlacerOut");
			}
			else{
				System.out.println("Fail of PlacerOut Creation !!!");
			}
			File copyFilePlacerJson = new File(newFolderString+"\\placerOut.json");
			copyFilePlacerJson.setWritable(false);
		}
		catch(Exception e) {
			System.out.println("Error of terminal execution");
		}
		DataRecoveryOfPlacer.dataRecovery(newFolderString, global);
	}
}