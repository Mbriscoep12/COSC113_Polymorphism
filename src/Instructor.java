public class Instructor extends BSU_Member {
    String Dept;

    Instructor(){
        this.Dept = "CS";
        this.status = "Faculty";
    }

    //Create a display method

    public void DisplayInfo(){
        IO.print("Dept: "+ this.Dept + " Status: "+ this.status);
    }
}
