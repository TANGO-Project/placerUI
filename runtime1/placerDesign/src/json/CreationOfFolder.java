package json;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import placer.Global;

public class CreationOfFolder {
	
	/**
	 * function which allow to copy all files of the project for having a save
	 * @param pathSource
	 * @param pathDestination
	 * @param dateFolder
	 * @param condition
	 */

	private static void CopyFileProject(Path pathSource, Path pathDestination, String dateFolder, int condition) {
		BufferedReader readerlineFirst = null, reader = null;
		int compteur = 0;
		try {
			//count the numbre of line in the file
			readerlineFirst = Files.newBufferedReader(pathSource);
			while (readerlineFirst.readLine() != null) {
				compteur++;
			}
			reader = Files.newBufferedReader(pathSource);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("error CopyFile");
			e.printStackTrace();
		}
		List<String> stringlist = new ArrayList<String>();
		for (int j = 0; j < compteur; j++) {
			try {
				//read the file
				stringlist.add(reader.readLine());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("error CopyFile");
				e.printStackTrace();
			}
		}
		//if it is the first file
		if(condition==0) {
			StringBuilder add = new StringBuilder();
			for (int j = 0; j < stringlist.get(2).length(); j++) {
				if (j == 19) {
					//that change the name of the copy project
					add.append(dateFolder);
				}
				add.append(stringlist.get(2).charAt(j));
			}
			stringlist.set(2, add.toString());
		}

		StringBuilder display = new StringBuilder();
		for (int j = 0; j < stringlist.size(); j++) {
			display.append(stringlist.get(j) + "\n");
		}
		try {
			//write in the new file
			Files.write(pathDestination, display.toString().getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("error writing on CopyFile");
			e.printStackTrace();
		}
	}
	
	/**
	 * Create the folder of the saving and the files of this folder which are copies of the project
	 * @param json
	 * @param global
	 */
	
	protected static void actionOnComputeur(StringBuilder json, Global global) {
		String saveFolderPath = "saveRuntimePlacerSample";
		File saveFolder = new File(saveFolderPath);
		if(!saveFolder.exists()) {
			saveFolder.mkdir();
		}
		else if (!saveFolder.isDirectory()) {
			System.out.println("The path '" + saveFolder + "' is a folder");
		}
		SimpleDateFormat date = new SimpleDateFormat("YYYY.MM.dd-kk.mm.ss");
		String dateFolder = date.format(System.currentTimeMillis());
		String directoryPathSource = null, newFolderString = null;
		File fileJson = null;
		switch (System.getProperty("os.name").toLowerCase().substring(0, 3)) {
			case "win":
				directoryPathSource = "runtime1\\placerSample";
				newFolderString = "saveRuntimePlacerSample\\save-" + dateFolder;
				fileJson = new File(newFolderString+"\\"+"CopyFile-placer.json");
				break;
			default://linux and mac
				directoryPathSource = "runtime1/placerSample";
				newFolderString = "saveRuntimePlacerSample/save-" + dateFolder;
				fileJson = new File(newFolderString+"/"+"CopyFile-placer.json");
				break;
		}
		
		File directorySource = new File(directoryPathSource);
		File directoryDestination = new File(newFolderString);
		//create a folder
		directoryDestination.mkdir();
		
		//create the Placer input in .json
		try {
			fileJson.createNewFile();
			FileWriter writer = new FileWriter(fileJson);
			try {
				writer.write(json.toString());
			} finally {
				writer.close();
			}
		} catch (Exception e) {
			System.out.println("Impossible to create the file");
		}
		//impossible to have the access writing
		fileJson.setWritable(false);
		List<String> saveName = new ArrayList<String>();

		if (!directorySource.exists()) {
			System.out.println("The folder '" + directoryPathSource + "' does not exist");
		} else if (!directorySource.isDirectory()) {
			System.out.println("The path '" + directoryPathSource + "' is not a folder");
		}
		if (!directoryDestination.exists()) {
			System.out.println("The folder '" + newFolderString + "' does not exist");
		} else if (!directoryDestination.isDirectory()) {
			System.out.println("The path '" + newFolderString + "' is not a folder");
		} else {
			File[] subfiles = directorySource.listFiles();
			for (int i = 0; i < subfiles.length; i++) {
				File file = null;
				switch (System.getProperty("os.name").toLowerCase().substring(0, 3)) {
				case "win":
					saveName.add(newFolderString + "\\" +(i!=0?"CopyFile-":"") + subfiles[i].getName());
					file = new File(saveName.get(i));
					try {
						file.createNewFile();
					} catch (Exception e) {
						System.out.println("Impossible to create the file");
					}
					CopyFileProject(Paths.get(directoryPathSource + "\\" + subfiles[i].getName()), Paths.get(saveName.get(i)), dateFolder, i);
					break;
				default://linux and mac
					saveName.add(newFolderString + "/" +(i!=0?"CopyFile-":"")+ subfiles[i].getName());
					file = new File(saveName.get(i));
					try {
						file.createNewFile();
					} catch (Exception e) {
						System.out.println("Impossible to create the file");
					}
					CopyFileProject(Paths.get(directoryPathSource + "/" + subfiles[i].getName()), Paths.get(saveName.get(i)), dateFolder, i);
					break;
				}
				file.setWritable(false);
			}
		}
		CallOfPlacer.placerCall(global, newFolderString);
	}
}