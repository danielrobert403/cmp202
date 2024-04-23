public class user {
    String username = "Robert";
    String password = "Dave"
    String Login (){
        if (username.equals("Dave") && password.equals("Dave")) {
            return "Logged In"; 
        } else {
            return"Failed";
        
        }
    }
    public static void main(String[]args){
        User jane = new User ();
        System.out.println(jane.login());
    }
}
