import java.util.TreeMap;

public class Person {
    private String name;
    private String email;
    private int number;

    public Person(String name, String email) {
       // this.name = name;
       // this.email = email;


        //проверка Имени:
        String regexName = "[^A-Za-z]";
        this.name = name.replaceAll(regexName,"");
        String regexEmail = "[^A-Za-z]@[^a-z].[a-z]{2}";
        this.email = email.replaceAll(regexEmail,"");;


    }




    public String toString()
    {
        return " Имя : " + name + ", email : " + email + "]";
    }

}
