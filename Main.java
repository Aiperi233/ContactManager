public class Main {
    public static void main(String [] args){
        ContactsManager myContactsManager = new ContactsManager();

        // Contact Aisha
        Contact contact1 = new Contact();
        contact1.name = "Aisha";
        contact1.phoneNumber = "+996 502 002 111";
        myContactsManager.addContact(contact1);

        // Contact Akima 
        Contact contact2 = new Contact();
        contact2.name = "Akima";
        contact2.phoneNumber = "+996 776 882 007";
        myContactsManager.addContact(contact2);

        // Contact Elnura
        Contact contact3 = new Contact();
        contact3.name = "Elnura";
        contact3.phoneNumber = "+996 700 277 951";
        myContactsManager.addContact(contact3);

        // Contact Aidana
        Contact contact4 = new Contact();
        contact4.name = "Aidana";
        contact4.phoneNumber = "+996 550 241 100";
        myContactsManager.addContact(contact4);
        
        // Searching for contact
        Contact result = myContactsManager.searchContact("Akima");
        System.out.println(result.name + ": " + result.phoneNumber);

    }
}
