package Condition;

public class If_else {
    public static void main(String[] args) {
        int grade= 94;

        if(grade<0 ||grade >100){
            System.out.println("invalid score");
        }

        else if(grade >=95 & grade<=100){
            System.out.println("grade:A");
        }else if ( grade<=94& grade>=83){
            System.out.println("grade:B");

        }else if (grade <=82 & grade >=70){
            System.out.println("grade:C");    
        }else 
            {System.out.println("grade:F");} 


            
            

        }

}
