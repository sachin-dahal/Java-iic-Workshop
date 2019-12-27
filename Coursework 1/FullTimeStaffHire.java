
public class FullTimeStaffHire extends StaffHire{
    private int salary;
    private int workingHour;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private boolean joined;
    
    public FullTimeStaffHire(int vacancyNumber, String designation, String jobType, int salary, int workingHours){
        super(vacancyNumber, designation, jobType);
        this.salary = salary;
        this.workingHour = workingHour;
        
        staffName ="";
        joiningDate = "";
        qualification = "";
        appointedBy = "";
        joined = false;
        
        
    }
    
    public void setSalary(int newSalary){
        if(joined == false){
            salary = newSalary;
        } else{
            System.out.println("Not possible change the salary");
        }
    
    }
    
    public int getSalary(){
        return salary;
    }
    
    
    public void setWorkingHour(int newWorkingHour){
        this.workingHour = newWorkingHour;
    }
    
    public int getWorkingHour(){
        return workingHour;
    }
    
    public void setStaffName(String staffName){
        this.staffName = staffName;
    }
    public String getStaffName(){
        return staffName;
    }
    
    public void setJoiningDate(String joiningDate){
        this.joiningDate = joiningDate;
    }
    public String getJoiningDate(){
        return joiningDate;
    }
    
    public void setQualification(String qualification){
        this.qualification = qualification;
    }
    public String getQualification(){
        return qualification;
    }
    
    public void setAppointedBy(String appointedBy){
        this.appointedBy = appointedBy;
    }
    public String getAppointedBy(){
        return appointedBy;
    }
    
    public void setJoined(boolean joined){
        this.joined = joined;
    }
    public boolean getJoined(){
        return joined;
    }
    
    public void hireFullTimeStaff(String staffName, String joiningDate, String qualification, String appoinetdBy){
        if(joined==true){
            System.out.println("Sorry,"+staffName+". You were already joined on"+joiningDate);
       } else {
           this.staffName =staffName;
           this.joiningDate = joiningDate;
           this.qualification = qualification;
           this.appointedBy = appointedBy;
           joined = true;
        } 
    }
    
    public void display(){
        super.display();
        if(joined==true){
            System.out.println("Staff Name: "+staffName+"\n Salary: "+salary+"\n Working Hour: "+workingHour+"\n Joining Date: "+joiningDate+"\n Qualification: "+qualification+"\n Appointed by: "+appointedBy);
        } else {
            System.out.println("Sorry, you're not joined yet.");
        }
    }
}







