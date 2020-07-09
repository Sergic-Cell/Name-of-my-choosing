import java.util.ArrayList;

public class Student {
    
    private Name name;
    private Address address;
    private String id_no;
    private ArrayList<String> courses;
    private String date;
    
   public Student(Name n, Address a, String id, String d){ // Student constructor
        name = n;
        address = a;
        id_no = id;
        date = d;
        
        courses = new ArrayList<String>();
    }
   // Search algorithim that returns true if search query is matched with string already in array
   public boolean searCours(String cQuery){ 
        boolean fnd = false;
        int iC = 0;
        
        while(!fnd && iC < courses.size()){
            String specCours = courses.get(iC);
            
            if(specCours.equalsIgnoreCase(cQuery)){
                fnd = true;
            }
            
            else{
                iC++;
            }   
        } 
        
        return fnd;
    }
   
   public Name getName(){
       return name;
   }
   
   public Address getAddress(){
       return address;
   }
   
   public String getID(){
       return id_no;
   }
  
   public ArrayList getCourses(){
       return courses;
   } 
   
   public String getDate(){
       return date;
   }
   
   public void addCourse(String c){
       courses.add(c);
   }
   
   public void removeCourse(String c){
       courses.remove(c);
   }
   
   public boolean isMax(){ // Checks if course list has less than 5 strings
       if(courses.size() < 5)
           return false;
       
       else
           return true;
   }       
           
   /*public void setID(String id){
       id_no = id;
   }
   
   public void setDate(String d){
       date = d;
   }*/
}
