package utils;

 
public class InputValidator {
       public static boolean isString(String choice){       
          if(choice.isEmpty() || choice==null){
                return false;
            }else if(choice.matches(".*\\d.")){
                return choice.equalsIgnoreCase( "a") ||
                choice.equalsIgnoreCase( "v") ||
                choice.equalsIgnoreCase( " u") ||
                choice.equalsIgnoreCase( " d") ||
                choice.equalsIgnoreCase( "dall");
                }
            
            
            
        

        return true;
        

    }
}
