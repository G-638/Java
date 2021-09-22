class A{
    private  String name, gender;
    private int age; 

    public String getName() {
        return name;
    }
    public String getGender() {
        return gender;
    }
    public int getAge() {
        return age;
    }
    public void setUserData(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
public class EncapsulationExample {
    public static void main(String[] args) {
        A obj = new A();
        obj.setUserData("sathish", 21, "male");
        System.out.println(obj.getName() + ' ' + obj.getAge() + ' ' +obj.getGender());

    }
}


//output: 
// sathish 21 male