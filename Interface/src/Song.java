

public class Song extends AbstractAudioElement {

	public String singer;
	public float duration;
	
	public Song(String title, String path, float duration, String singer) throws IncorrectFileNameException{
		super(title, path);
		this.duration = duration;
		this.singer = singer;
		if (getFile().exists()) throw new IncorrectFileNameException();
	}


	@Override
	public float getDuration() {
		return duration;
	}

	@Override
	public long getSize() throws FileIOException{
		return file.length() throw new FileIOException();
	}


	
}
