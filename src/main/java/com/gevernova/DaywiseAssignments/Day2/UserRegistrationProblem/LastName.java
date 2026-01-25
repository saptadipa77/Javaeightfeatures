public class LastName
{
    public static boolean validateLastName(String firstName)
    {
        return Pattern.matches("^[A-Z][a-z]{2,}$", firstName);
    }
    public static void main(String[] args)
    {
        System.out.println(validateLastName("Kumar"));
    }
}