import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AddressBookService {
    private static final String EMAIL_REGEX =
            "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@" +
                    "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
    private static final String Phno_Regex="^[6-9]{1}[0-9]{9}";
    private static final String Pin_Regex="^[0-9]{6}";
    public String display(Person p){

        return p.getFirstName()+" "+p.getLastName()+" "+p.getCity()+" "+p.getState()+" "+ p.getEmail()+" "+p.getPhoneNumber()+ " "+p.getZip();
    }
    public void setValues(Person p){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name");
        String first = sc.next();
        p.setFirstName(first);
        System.out.println("Enter Last Name");
        String last = sc.next();
        p.setLastName(last);
        System.out.println("Enter City");
        String city = sc.next();
        p.setCity(city);
        System.out.println("Enter State");
        String state = sc.next();
        p.setState(state);
        System.out.println("Enter Email");
        String email = sc.next();
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(email);
        while(!matcher.matches()){
            System.out.println("Enter ur Email again");
            String z=sc.next();
            p.setEmail(z);
            matcher=pattern.matcher(z);

        }
        p.setEmail(email);

        System.out.println("Enter Phone Number");
        String phoneNo = sc.next();
        Pattern patterns = Pattern.compile(Phno_Regex);
        Matcher matchers = patterns.matcher(phoneNo);
        while(!matchers.matches()){
            System.out.println("Enter ur phno again");
            String phone=sc.next();
            p.setEmail(phone);
            matchers=patterns.matcher(phone);

        }
        p.setPhoneNumber(phoneNo);
        System.out.println("Enter zip");
        String zip = sc.next();
        Pattern patter = Pattern.compile(Pin_Regex);
        Matcher matche = patter.matcher(zip);
        while(!matche.matches()){
            System.out.println("Enter ur pincode again");
            String pin=sc.next();
            p.setEmail(pin);
            matche=patter.matcher(pin);
        }
        p.setZip(zip);
    }
}