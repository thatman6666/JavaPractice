package simpleFactory01;

public class VideoFactory {
	/*public Video getVideo(String type){
		if("java".equalsIgnoreCase(type)){
			return new JavaVideo();
		}
		else if("python".equalsIgnoreCase(type)){
			return new PythonVideo();
		}
		return null;
	}*/
	public Video getVideo(Class c){
	Video video = null;
	try{
		 video = (Video) Class.forName(c.getName()).newInstance();
	}catch (Exception e) {
		// TODO: handle exception
	}
	return video;
	}
	
	
	

}
