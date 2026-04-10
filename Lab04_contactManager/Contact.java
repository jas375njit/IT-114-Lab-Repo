public class Contact{
  private String name;
  private String email;
  private String phoneNumber;

  public Contact (String n, String e, String pN){
    name = n;
    email = e;
    phoneNumber = pN;
  }
  public String getName(){
    return name;
  }
  public String getEmail(){
    return email;
  }
  public String getPhoneNumber(){
    return phoneNumber;
  }
  public void setName (String n){
    name = n;
  }
  public void setEmail (String e){
    email = e;
  }
  public void setPhoneNumber (String pN){
    phoneNumber = pN;
  }

  public String toString(){
    return "Name: " + name + " | Phone: " + phoneNumber;
  }
}