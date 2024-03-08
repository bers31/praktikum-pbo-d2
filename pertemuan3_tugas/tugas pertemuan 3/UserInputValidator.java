public class UserInputValidator {
    
    public static void validateUsername(String username) {
        // Check if username is not null
        assert username != null : "Username cannot be null";
        
        // Check length requirement
        assert username.length() >= 5 && username.length() <= 20 : "Username length must be between 5 and 20 characters";
        
        // Check character requirements
        assert username.matches("^[a-zA-Z][a-zA-Z0-9_]*$") : "Username must start with a letter and can only contain letters, numbers, and underscores";
    }

    public static void validateEmail(String email) {
        // Check if email is not null
        assert email != null : "Email cannot be null";
        
        // Check email format using regular expression
        assert email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$") : "Invalid email format";
    }

    public static void validateAge(int age) {
        // Check age range requirement
        assert age >= 17 && age <= 99 : "Age must be between 17 and 99 years old";
    }
}
