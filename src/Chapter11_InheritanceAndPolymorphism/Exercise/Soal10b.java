package Chapter11_InheritanceAndPolymorphism.Exercise;

public class Soal10b extends Soal10_ImplementMyStack{
    private java.util.ArrayList<Object> list;

    public Soal10b(){
        list = new java.util.ArrayList<Object>();
    }
    public void push(Object o){
        list.add(0, o);
    }
    public Object peek(){
        return list.get(0);
    }
    public Object pop(){
        Object o = list.get(0);
        list.remove(0);
        return o;
    }
    @Override
    public String toString(){
        return "Stack: " + list.toString();
    }
}
