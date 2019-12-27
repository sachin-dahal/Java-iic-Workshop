
public class StaffHire
{
   private int vacancyNumber;
   private String designation;
   private String jobType;
   
   public void setVacancyNumber(int vacancyNumber){
       this.vacancyNumber = vacancyNumber;
    }
    
   public int getVacancyNumber(){
    return vacancyNumber;
    }
    
   public void setDesignation(String designation){
       this.designation = designation;
    }

   public String getDesignation(){
    return designation;
    }
    
    public void setJobType(String jobType){
       this.jobType = jobType;
    }
    
   public String getJobType(){
    return jobType;
    }
    
   public StaffHire(int vacancyNumber, String designation, String jobType){
       this.vacancyNumber = vacancyNumber;
       this.designation = designation;
       this.jobType = jobType;
    }
    
    // public String display(){
        // return ("Vacancy Number: "+vacancyNumber+ "Designation: "+designation+ "Job Type: "+jobType);
    // }
    
    public void display(){
    System.out.println("Vacancy Number: "+vacancyNumber);
    System.out.println("Designation: "+designation);
    System.out.println("Job Type: "+jobType);
    }
}





