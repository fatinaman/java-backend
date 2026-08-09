package module08;

public class Admin extends User{
    private String  role;
    public Admin(String name, String email, String role){
        super(name, email);
        this.role = role;
    }
    public String getRole() {
        return role;
    }
    public void changeRole(String role) {
        // ignoring checking for null or empty strings for now
        this.role = role;
    }
    public void printRole(){
        System.out.printf("Admin role : %s%n",
            this.role
        );
    }
    @Override
    public void printInfo(){
        super.printInfo();
        this.printRole();
    }
}
