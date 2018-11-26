package abstarctfactory;

public class PythonCourseFactory implements CourseFactory {

	public Video getVideo() {
		// TODO Auto-generated method stub
		return new PythonVideo();
	}

	public Article getArticle() {
		// TODO Auto-generated method stub
		return new PythonArticle();
	}

}
