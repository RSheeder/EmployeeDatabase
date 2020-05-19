
package employeedatabase;


public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private String jobTitle;
    
    public Employee(int ID, String FirstName, String LastName, String JobTitle) {
        this.id = id;
        this.firstName = FirstName;
        this.lastName = LastName;
        this.jobTitle = JobTitle;
    }
    
    public int getId(){
        return id;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public String getJobTitle(){
        return jobTitle;
    }
    
}
