package number3;


public class Employee {
   // private long id;
    private String name;
    private String job;
    private String email;
    private String phoneNumber;
    private int salary;
    int age;
    public Employee(String name, String job, String email, String phoneNumber, int salary, int age) {
      //  this.id = id;
        this.name = name;
        this.job = job;
        this.phoneNumber = phoneNumber;
        this.salary = 30000;
        this.age = age;

    }
    /* public long getId(){

         return id;
     }
     public String getName(){
         return name;
     }
     public String getJob(){
         return job;
     }
     public String getPhoneNumber(){
         return phoneNumber;
     }
     public String getSalary(){
         return salary;
     }
     */
    public int getAge(){
        return age;
    }
    public void print(){
        System.out.println("FIO: "+ name);
        System.out.println("Job "+ job);
        System.out.println("Email "+ email);
        System.out.println("PhoneNumber "+phoneNumber);
        System.out.println("Salary "+ salary);
        System.out.println("Age "+ age);
    }
}
