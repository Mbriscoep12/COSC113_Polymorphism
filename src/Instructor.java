public class Instructor extends BSU_Member {
    String Dept;

    Instructor(){
        this.Dept = "CS";
        this.status = "Faculty";
    }

    Instructor(String Dept, String status){
        this.Dept =Dept;
        this.status = status;
    }

    Instructor(String status){
        this.status = status;
    }


    //Create a display method

    public void DisplayInfo(){
        IO.print("Dept: "+ this.Dept + " Status: "+ this.status);
    }
}
