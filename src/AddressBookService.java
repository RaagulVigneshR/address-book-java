import java.util.Scanner;

public class AddressBookService {
    public String display(Person p){
        return p.getFirstname()+" "+p.getLastname()+" "+p.getCity()+" "+p.getState()+" "+p.getPhonenumber()+" "+p.getZip()+" "+p.getEmail();
    }
    public void setValues(Person p){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Name : ");
        String fn = sc.next();
        p.setFirstname(fn);
        System.out.println("Enter the Last Name : ");
        String ln = sc.next();
        p.setLastname(ln);
        System.out.println("Enter the City : ");
        String c = sc.next();
        p.setCity(c);
        System.out.println("Enter the State : ");
        String st = sc.next();
        p.setState(st);
        System.out.println("Enter the Phone Number : ");
        Integer ph = sc.nextInt();
        p.setPhonenumber(ph);
        System.out.println("Enter the Zip : ");
        Integer z = sc.nextInt();
        p.setZip(z);
        System.out.println("Enter the Email Address : ");
        String em = sc.next();
        p.setEmail(em);


    }
}
