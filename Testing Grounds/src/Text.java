
public class Text {
    public static void main(String[] args) {
        int a = 80928;
        String b = "3";
        System.out.println(b + " " + a);
        System.out.println(Double.valueOf(b));
        System.out.println(String.valueOf(a));

        String text = "text";
        String text2 = null;
        String text3 = text2 + text;
        System.out.println(text + text2 + text3);

        String tekst = " teKst";

        System.out.println(tekst.length());
        System.out.println(tekst.toUpperCase());
        System.out.println(tekst.toLowerCase());
        System.out.println(tekst.trim());
        System.out.println(tekst.substring(1, 2));
        System.out.println(tekst.indexOf("e"));
        System.out.println(tekst.indexOf("t", 1));
        System.out.println(tekst.lastIndexOf("e"));
        System.out.println(tekst.substring(0, 1));

    }
}
