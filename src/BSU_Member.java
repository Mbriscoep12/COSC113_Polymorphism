public class BSU_Member {
    int id, age;

    String status;

    String name;

    char gender;
// Lab work: Create default constructor and overloaded constructor. Create setters and getters

    BSU_Member(){
        this.id = 99999;
        this.age = 12;
        this.name = "John Doe";
        this.gender = 'm';
    }

    BSU_Member(int id, int age, String name){
        this.id = id;
        this.age = age;
        this.name = name;
    }

    BSU_Member(char gender, int age, String name){
        this.age = age;
        this.name = name;
        this.gender = gender;
    }
    //Setters and Getters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }


    public void DisplayInfo(){
        IO.print(" Status: "+ this.status);
    }
}
