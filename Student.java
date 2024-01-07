public class student {
    
    private String name;
    private int age;
    private double gpa;


    public void setName(String name){
        this.name =name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setGpa(double gpa){
        this.gpa=gpa;
    }

    public String getGpaStatus(){
    if(gpa>3){
    return "Excellent"; 
    }else if (gpa<=3){
        return "Good" ;
    }else  (gpa<2){
        return "Needs Improvements";
    }  }

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    

    public void setGpa(double gpa){
        if(gpa>= 0.0 && gpa<= 4.0){
            this.gpa=gpa;
    } else {
        System.out.println("Error: Gpa must be between 0.0 and 4.0.")
        this.gpa = 0.0;
    }
     
    public static void main(String[] args) throws Exception {
        student student = new student();

        student.setName("Fatma");
        student.setAge(23);
        student.setGpa(3.4);
    }
    
    
}
