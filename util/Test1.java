package util;

public class Test1 {

    // ask user for an number and print it
    public static void main(String[] args) {
        
        String input = "dw,jw,djwe.,dkw.s,dkwe:979874983749283749823749287";
        String[] splitString = input.split(":");
        System.out.println(splitString.length);
        
        
        System.out.println("table: " + splitString[0]);
        System.out.println("id: " + splitString[1]);

        

    }
    
}
