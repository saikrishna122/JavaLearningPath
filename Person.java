public class Person {
    // Java Program to demonstrate
// Java Encapsulation

    // Person Class

        // Encapsulating the name and age
        // only approachable and used using
        // methods defined
        private String name;
        private int age;

        private String sex;

        private int phoneNumber;

        public String getName() { return name; }

        public void setName(String name) { this.name = name; }

        public int getAge() { return age; }

        public void setAge(int age) { this.age = age; }

        public String getSex() {return sex; }

        public  void setSex (String sex) {this.sex = sex; }

        public int getPhoneNumber()
        {
               return phoneNumber;
        }

        public void setPhoneNumber(int phoneNumber)
        {
               this.phoneNumber = phoneNumber;
        }

    }


