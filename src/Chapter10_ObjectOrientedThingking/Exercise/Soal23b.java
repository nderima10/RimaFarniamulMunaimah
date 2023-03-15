package Chapter10_ObjectOrientedThingking.Exercise;

public class Soal23b {
    private String s;
    public Soal23b(String s){
        this.s = " ";
        for (int i = 0; i< s.length(); i++) {
            this.s += s.charAt(i) + "";
        }
    }
    public int compare(String s){
        int index = 0;
        if (this.s.length() < s.length())
            index = -1;
        if (s.length() < this.s.length())
            index = 1;


        for (int i = 0; i < this.s.length(); i++){
            if (this.s.charAt(i) < s.charAt(i))
                index  = -(i + 1);
            if (this.s.charAt(i) > s.charAt(i))
                index = i + 1;
        }
        return index;
    }
    public Soal23b substring(int begin){
        String b = " ";
        for (int i = begin, j = 0; i < s.length(); i++, j++){
            b += s.charAt(i) + "";
        }
        return new Soal23b(b);
    }
    public Soal23b toUpperCase(){
        String n = "";
        for (int i = 0;  i < s.length(); i++){
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
                n += String.valueOf((char) (s.charAt(i) - 32));
            else
                n += String.valueOf(s.charAt(i));
        }
        return new Soal23b(n);
    }
    public char[] toChars(){
        char[] ch = new char[s.length()];
        for (int i = 0; i < s.length(); i++){
            ch[i] = s.charAt(i);
        }
        return ch;
    }
    public static Soal23b valueOf(boolean b){
        return (b ? new Soal23b("true") : new Soal23b("false"));
    }
}
