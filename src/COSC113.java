//Parent class: Course
//Child class: COSC113
public class COSC113 extends Course {
    //public, default, protected attributes are inherited
    // Not inherited, Constructors(Still invokable)

    //Methods: Public, default, protected methods are inherited
    //Package: Java files under the same folder

    Instructor i1;

    String Programming_Language;
    String syllabus;

    Student[] students;

    COSC113(){
        this.syllabus = "Java";
        this.Programming_Language = "Java";
        this.i1 = null;
        this.students = null;
        this.course_number =  113;
        this.credit = 4;
        this.name = "COSC113";
    }
    //Parent class Constructors aren't inherited, but can be called.
    //Invoked by super()

    COSC113(int course_number, int credit, String name){
//        super(); //invokes the parent class' default constructor - course()
        super(course_number,credit, name);
        this.syllabus = "Java";
        this.Programming_Language = "Java";
        this.i1 = null;
        this.students = null;
    }
    //Setters and Getters - Lab Work

    public Instructor getI1() {
        return i1;
    }

    public void setI1(Instructor i1) {
        this.i1 = i1;
    }

    public String getProgramming_Language() {
        return Programming_Language;
    }

    public void setProgramming_Language(String programming_Language) {
        Programming_Language = programming_Language;
    }

    public String getSyllabus() {
        return syllabus;
    }

    public void setSyllabus(String syllabus) {
        this.syllabus = syllabus;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    //Method Overriding: Making a method with the same method signature from the parent class
    @Override
    public void Display_Course_Information(){
        //Lab work - use super.attribute_Name inside a print statement
        super.Display_Course_Information();
        IO.println(super.name);
        IO.println("Syllabus: " + this.syllabus + "Language" + this.Programming_Language +
                "Instructor: "+ this.i1 + "Students: "+ this.students);
    }

}
