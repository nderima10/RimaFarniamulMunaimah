package Chapter10_ObjectOrientedThingking.Exercise;

public class Soal27b {
    private String s;

    public Soal27b(String s) {
        this.s = s;
    }
    public Soal27b append(Soal27b  s){
        String newStr = this.s;
        newStr += s;
        return new Soal27b(newStr);
    }
    public Soal27b append(int i){
        String newStr = this.s;
        newStr += i + "";
        return new Soal27b(newStr);
    }
    public int length() {
        return s.length();
    }
    public char chatAt(int index){
        return s.charAt(index);
    }
    public Soal27b toLowerCase(){
        String newStr = "";
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                newStr += (char)(s.charAt(i) + 32) + "";
            }
        }
        return new Soal27b (newStr);
    }
    public Soal27b substring(int begin, int end){
        String newStr = "";
        for (int i = begin; i < end; i++){
            newStr += s.charAt(i) + "";
        }
        return new Soal27b(newStr);
    }
    public String toString(){
        return s;
    }
}
