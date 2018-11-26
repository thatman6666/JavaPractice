package abstarctfactory;

public class Test {
	public static void main(String[] args) {
		CourseFactory courseFactory = new JavaCourseFactory();
		Article article = courseFactory.getArticle();
		Video video = courseFactory.getVideo();
		article.produce();
		
	}

}
