public class GradeBookTest {

    public static void main(String[] args)
    {
        int [] gradeArray={84,53,93,81,89,85,93,94,45,97};
        GradeBook MyGradeBook=new GradeBook("jaber daneshamooz",gradeArray);
        MyGradeBook.getCourseName();
        MyGradeBook.processGrade();
    }
}
