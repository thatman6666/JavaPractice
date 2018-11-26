package simpleFactory01;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//普通的实例化
		/*Video video = new JavaVideo();
		video.makevideo();
*/		//简单工厂模式
		/*VideoFactory videoFactory = new VideoFactory();
		Video video= videoFactory.getVideo("java");
		video.makevideo();*/
		
		//通过反射的简单工厂模式
		VideoFactory videoFactory = new VideoFactory();
		Video video= videoFactory.getVideo(JavaVideo.class);
		if(video == null){
			return;
		}
		video.makevideo();
	}

}
