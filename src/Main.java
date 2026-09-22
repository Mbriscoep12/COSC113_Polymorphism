void main() {
    Course c1 = new Course();
    c1.Display_Course_Information();

    //COSC course
    COSC113 cs1 = new COSC113();
    cs1.Display_Course_Information();

    //Polymorphism
    Course cosc214 = new Course();
    Course c2 = new COSC113();
    // The relationship is : IS-A relationship between course and COSC113

}
