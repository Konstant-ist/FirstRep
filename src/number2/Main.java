package number2;


public class Main {
    public static void main(String[] args) {
        findSymbolOccurance();
        findWordPosition();
        stringReverse();

    }

    public static String findSymbolOccurance() {
        String str = "hgchftfhjvcvchfkfj/l";
        char ch = 'l';
        int count = str.length() - str.replace(String.valueOf(ch), "").length();
        System.out.println(count);

        return str;
    }


    public static void findWordPosition() {
        String string = "sours";
        String first = "target";
        int rezult = string.indexOf("target" + string);
        System.out.println(rezult);

    }

    public static String stringReverse() {
        String string = "Konstantin";
        String rezult = new StringBuilder(string).reverse().toString();
        System.out.println(rezult);
        return string;
    }
}

