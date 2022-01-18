package arraysmultidementionalarrays;

public class Encapsulation01 {
    // If you want to hide data in an app you use encapsulation
    //how do we do encapsulation?
    //make variable private
    //to read private variable create get methods
    //to update private variables cretae set method
    //why?
    // 1- security
    // 2- simplicity

    private String ssn = " 123456789";
    private int salary= 12345;
    private  boolean retired =false;
    private char initials ='A';
    private String adress = "Cary, NC";

    public String getSsn() {
        return ssn;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isRetired(){//if the variable boolean java use is beside get
        return retired;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void setRetired(Boolean retired){
        this.retired= retired;
    }

    //make the initial read only
    //we should not create setter just getter is enough

    public char getInitials(){
        return initials;
    }
    //address is only updatable
    public void setAdress(String adress){
        this.adress= adress;
    }
}
/*
-- if you want updates any value do not create any setter. If you make all variables private and then I don't create any setter method for them. This class is immutable.

 */
