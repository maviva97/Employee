public class Main {
    public static void main(String[] args) {

       Employee employee=new Employee();
       employee.setName("Ion");
       employee.setAge(125);
       employee.setDepartament("ALC");
       System.out.println("Nume "+employee.getName() );
        System.out.println("Varsta "+employee.getAge() );
        System.out.println("Departamentul  "+employee.getDepartament() );
    }
}