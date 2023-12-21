package ait.validaator.utils;

public class Validator {
    public static boolean checkCreditCardNumber(String str){
        return str.matches("\\d{8,16}");
    }


    public static boolean checkDateFormatEU(String str){
        return str.matches("([0-2][0-9]|30|31)[.]([0][1-9]|[1][0-2])[.](\\d\\d\\d\\d)");
    }

    public static boolean checkDateFormatUS(String str){
        return str.matches("(\\d\\d\\d\\d)[-]([0][1-9]|[1][0-2])[-]([0-2][0-9]|30|31)");
    }

    public static boolean checkPhoneNumber(String str){
        return str.matches("[+]\\d\\d[(]\\d\\d[)]\\d\\d\\d\\d[-]\\d\\d\\d\\d");
    }

    public static boolean checkLessEquals255(String str){
         return str.matches("0*(\\d{1,2}|1\\d{2}|2[0-4]\\d|25[0-5])");


    }
}
