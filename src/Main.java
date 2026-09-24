void main() {
    Course c1 = new Course();
//   c1.Display_Course_Information();

    //COSC course
    COSC113 cs1 = new COSC113();
//  cs1.Display_Course_Information();

    //Polymorphism
    Course cosc214 = new Course();
    Course c2 = new COSC113();
    // The relationship is : IS-A relationship between course and COSC113
    Student arturo = new Student();

    //Courses
    Course math141 = new Course();
    Course Frac = new Course();
    Course COSC107 = new Course();
    Course Eng102 = new Course();
    Course soc101 = new Course();


    arturo.enrolled_courses[0] = math141;
    //Lab work- Populate index with other course references
    arturo.enrolled_courses[1] = Frac;
    arturo.enrolled_courses[2] = COSC107;
    arturo.enrolled_courses[3] = Eng102;
    arturo.enrolled_courses[4] = soc101;

    Instructor In1 = new Instructor();
    In1.DisplayInfo();

    BSU_Member [] members = new BSU_Member[10];

    BSU_Member b1, b2;
    //Creating a student object and storing it in a BSU_Member type
    b1 = new Student();
    b2 = new Instructor();

    members[0] =b1;
    members [1] = b2;

    for (int j = 2; j<10; j++) {
        members[j] = new BSU_Member();
    }

    for (int j = 2; j<10; j++) {
        members[j].DisplayInfo();
    }

    //Lab Work
//    BSU_Member BM1 = new BSU_Member(122222,32,"Thomas");
//    BSU_Member BM2 = new BSU_Member( 'm', 22, "Alex");
//
//
//    IO.println("ID: "+BM1.id + " Age: " + BM1.age + " Name: " + BM1.name);
//    IO.println("Gender: "+BM2.gender + " Age: " + BM2.age + " Name: " + BM2.name);

}
