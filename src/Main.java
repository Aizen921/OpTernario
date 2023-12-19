public class Main {
    public static void main(String[] args) {
        System.out.println(checkString("Questa è una Stringa"));
    }

   /* private static String checkString(String value) {
        String result;
        if (value.length() >= 10) {
            result = "Lunghezza maggiore o uguale di 10";
        } else {
            result = "Lunghezza minore di 10";
        }
        return result;
    }*/
    private static String checkString(String value){
        String result;
        result = value.length() >=10 ?"Lunghezza maggiore o uguale di 10": "Lunghezza minore di 10";
        return result;
    }
}
