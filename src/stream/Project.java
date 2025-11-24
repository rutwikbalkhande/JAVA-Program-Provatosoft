package stream;


public class Project {
         String status;
         String salary;
         String name;


    public Project( String name,String status,   String salary ) {
        this.status = status;
        this.salary = salary;
        this.name= name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public void getName(){
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
