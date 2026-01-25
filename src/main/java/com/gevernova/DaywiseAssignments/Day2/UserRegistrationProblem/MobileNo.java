public class MobileNo {
    public static boolean validateMobile(String mobile) {

        return Pattern.matches("^[0-9]{2}\\s[0-9]{10}$", mobile);
    }

    public static void main(String[] args){
        System.out.println(validateMobile("987654321"));
        System.out.println(validateMobile("789"));
    }
}