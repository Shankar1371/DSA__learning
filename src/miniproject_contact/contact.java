package miniproject_contact;

public class contact {
    private String name;
    private String phone;
    private String email;
    //these are the details that we use for a contact
    //now lets create a constructor
      public contact(String name,String phone,String email){
        this.name=name;
        this .phone=phone;
        this.email=email;
    }
    //now we need
    public String getName(){
          return name;
    }
    public String getphone(){
          return phone;
    }
    public String getemail(){
          return email;
    }
    //now we have to return the details of the contact that we have
    public void printconatct(){
          System.out.println("Name:"+name);
          System.out.println("Phone:"+phone);
          System.out.println("Email:"+email);
          System.out.println(".................................");
    }
}
