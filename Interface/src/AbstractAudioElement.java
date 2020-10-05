import java.io.*;

public abstract class AbstractAudioElement implements ElementAudio{
	public File file;
	public String title = "";
	public String path = "";
	
	//Constructor
	
	public AbstractAudioElement(String title, String path) {
		this.title = title;
		this.path = path;
		file = new File(path);
		if (file.exists()) {
			System.out.println("file exists");
		}
	}
	
	//Getter
	
	public File getFile() {
		return file;
	}
	
	@Override
	public String getTitle() {
		return title;
	}
	
	@Override
	public String getPath() {
		return path;
	}
	
	//Setter
	
	public void setFile(File file) {
		this.file = file;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
}

