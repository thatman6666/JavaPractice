package abstarctfactory;

public class JavaCourseFactory implements
CourseFactory{

	public Video getVideo() {
		// TODO Auto-generated method stub
		return new JavaVideo();
	}

	public Article getArticle() {
		// TODO Auto-generated method stub
		return new JavaArticle();
	}
	

}
