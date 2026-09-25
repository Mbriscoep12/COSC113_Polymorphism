public class Student extends BSU_Member {


    double GPA;

    Course [] enrolled_courses;
    Student(){
        this.GPA = 0;
        this.enrolled_courses = new Course[6];
        this.status = "Student";
    }

    Student(Double GPA, int enrolled_courses, String status){
        this.enrolled_courses = new Course[enrolled_courses];
        this.GPA = GPA;
        this.status = status;
    }

    Student(String status){
        this.status = status;
    }
    //Lab work- Create getter method for enrolled_courses
    public Course[] getEnrolled_courses() {
        return enrolled_courses;
    }

}
