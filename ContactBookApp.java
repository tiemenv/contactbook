public class ContactBookApp {

    public static void main(String[] args) {
        new ContactBookApp().run();

    }

    private void run() {
        System.out.println("test");

        ContactBook contacts = new ContactBook();


        Contact joske = new Contact("Joske", "09/222.33.44");
        Contact eva = new Contact("Eva", "08/444.11.21");
        eva.setWork(new Address("laan", "45", "lichtervelde"));
        joske.setHome(new Address("straatnaam", "26", "Toeroet"));

        contacts.add(joske);
        contacts.add(eva);


        System.out.println(contacts);

        contacts.setFmt(new ContactFormatterByName());
        System.out.println(contacts);

        contacts.setCmp(new SortContactByName());
        System.out.println(contacts);
    }
}
