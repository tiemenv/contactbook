public class ContactFormatterByName implements ContactFormatter{

    public String format(Contact contact) {
        return contact.getName();
    }
}
