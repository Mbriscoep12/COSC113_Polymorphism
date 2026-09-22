public class Course {

    String name;
    int course_number;
    int credit;

    private String classroom;

    //Students
    //Instructor
    Course(){
        name = "";
        course_number = 0;
        credit = 0;
    }

    Course(int course_number, int credit, String name){
        this.course_number = course_number;
        this.credit = credit;
        this.name = name;
    }

    //getter and setter
    public void Set_Classroom(String classroom){
        this.classroom = classroom;
    }

    public String get_classroom(){
        return this.classroom;
    }

    public void Display_Course_Information(){
        IO.println("Course name: "+ this.name + "Course number: " + this.course_number);
    }

}
