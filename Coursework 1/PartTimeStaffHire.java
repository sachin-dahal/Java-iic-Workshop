
public class PartTimeStaffHire extends StaffHire{
    private int workingHour;
    private int wagesPerHour;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private String shifts;
    private boolean joined;
    private boolean terminated;

    public PartTimeStaffHire(int vacancyNumber, String designation, String jobType, int workingHour, int wagesPerHour, String shifts){
        super(vacancyNumber, designation, jobType);
        this.workingHour = workingHour;
        this.wagesPerHour = wagesPerHour;
        this.shifts = shifts;
        
        staffName = "";
        joiningDate = "";
        qualification = "";
        appointedBy = "";
        joined = false;
        terminated = false;
    
    }
    
    public void setWorkingHour(int WorkingHour){
        this.workingHour = WorkingHour;
    }
    
    public int getWorkingHour(){
        return workingHour;
    }
    
    public void setWagesPerHour(int wagesPerHour){
        this.wagesPerHour = wagesPerHour;
    }
    public int getWagesPerHour(){
        return wagesPerHour;
    }
    
    public void setShifts(String newShifts){
        if(joined==true){
        shifts = newShifts;
    } else{
        this.shifts = shifts;
    }
    }
    
    public String getShifts(){
        return shifts;
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
    
    public void setTerminated(boolean terminated){
        this.terminated = terminated;
    }
    public boolean getTerminated(){
        return terminated;
    }
    
    
    public void hirePartTimeStaff(String staffName, String joiningDate, String qualification, String appointedBy){
       if(joined==true){
            System.out.println("Sorry,"+staffName+". You were already joined on"+joiningDate);
       } else {
           this.staffName =staffName;
           this.joiningDate = joiningDate;
           this.qualification = qualification;
           this.appointedBy = appointedBy;
           joined = true;
           terminated = false;
        } 
    }
    
    public void termination(){
        if(terminated == true){
            System.out.println("You are being terminated.");
        } else {
            staffName = "";
            joiningDate = "";
            qualification = "";
            appointedBy = "";
            joined = false;
            terminated = true;
        }
    }
    
    public void display(){
        super.display();
        if(joined == true){
            int incomePerDay = (wagesPerHour * workingHour); 
            System.out.println("Staff Name: "+staffName+ "\n Wages Per Hour: "+wagesPerHour+ "\n Joined Date: "+joiningDate+"\n Qualification: "+qualification+"\n Appointed By: "+appointedBy+"\n Income Per Day"+incomePerDay);
        } else {
            System.out.println("Sorry, you're not joined yet.");
    }
}
}