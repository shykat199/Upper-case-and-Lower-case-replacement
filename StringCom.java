import java.util.*;

public class StringCom {
    StringBuilder strb;

    public StringBuilder String() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = sc.next();
        StringBuilder strb = new StringBuilder(str);
        return strb;
    }

    public void Convert() {
        strb = String();
        int i;
        String s;
        for (i = 0; i < strb.length(); i++) {
            Character c = strb.charAt(i);
            if (Character.isLowerCase(c)) {
                // Character.toUpperCase(c);
                strb.setCharAt(i, Character.toUpperCase(c));
                // str.replace(i, Character.toUpperCase(c));
            } else if (Character.isUpperCase(c)) {
                // Character.toLpperCase(c);
                strb.setCharAt(i, Character.toLowerCase(c));
                // str.replace(i, Character.toUpperCase(c));
            } else {
                System.out.println("Nothing");
            }
        }
        System.out.println("String after conversion:"+strb);
    }
    public static void main(String[] args) {
        StringCom st= new StringCom();
        st.Convert();
    }
}
