package module08;

public class User {
    private String name;
    private String email;

    public User(String name, String email){
        this.name = name;
        this.email = email;
    }
    public void printInfo(){
        System.out.printf("Name : %s%nEmail: %s%n", 
        this.name, 
        this.email);
    }
    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }

    public void changeName(String newName){
        if(this.name.equals(newName)){
            System.out.println("This is the same name");
        }else{
            this.name = newName;
        }
    }

    public void changeEmail(String newEmail){
        if(this.email.equals(newEmail)){
            System.out.println("This is the same email");
        }else{
            this.email = newEmail;
        }
    }
}