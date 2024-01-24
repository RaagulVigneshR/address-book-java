//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        AddressBookService a1 = new AddressBookService();
        a1.setValues(p1);
        System.out.println(a1.display(p1));
        AddressBook a = new AddressBook();
        a.contactList.put(1,p1);
        System.out.println(a.contactList);

    }
}