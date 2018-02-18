package utilities;

/**
 * Created by Markus on 18/02/2018.
 */
public class formData {
     public static String firstName;
     public static String lastName;
    
    public static String getFirstName(String fn) throws Throwable {
        switch(fn) {
            default:
                firstName  = System.getProperty("common.first.name");
                break;
        }
        
        return firstName;
    }
    
    public static String getLastName(String ln) throws Throwable {
        switch(ln){
            default:
                lastName = System.getProperty("common.first.name");
                break;
        }
        
        return lastName;
    }
    
    
}
