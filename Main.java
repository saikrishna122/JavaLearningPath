// Driver Class
public class Main {
    // main function
    public static void main(String[] args) {
        // person object created
        Person person = new Person();
        person.setName("John");
        person.setAge(30);
        person.setSex("M");
        person.setPhoneNumber(254981);

        // Using methods to get the values from the
        // variables
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Sex:" +person.getSex());
        System.out.println("Mobile Number :"+person.getPhoneNumber());
}
}