public class NameDemo {

    public String name(String firstName){
        return "firstName";
    }

    public String name(String firstName, String lastName){
        //System.out.println(firstName + " "+ lastName);
        return firstName + " " + lastName;
    }

    public void name(String firstName, String middleName, String lastName){
        System.out.println(firstName + " " + middleName + " " + lastName);
        //return "firstName" + "middleName" + "lastName";
    }
}
