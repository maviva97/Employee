public class Employee {
    private String name;
    private int age;
    private String departament;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartament() {
        return departament;
    }
    public  void  setName(String name){
        this.name=name;
    }
    public  void  setAge(int age){
        if (age>=0 && age<=120) {
            this.age=age;
        }else System.out.println("varsta inexistenta");
    }
    public  void  setDepartament(String departament){
        this.departament=departament;
    }
}
