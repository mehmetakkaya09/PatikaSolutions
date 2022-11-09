package patika;

public class overloading {

    static void print(){
        System.out.println("parametresiz metod");
    }
    static void print(int a){
        System.out.println("parametreler : " +a);
    }
    static int print(int a, int b){
        return a+b;
    }
    static int print(int a,int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
print();
print(15);
        System.out.println(print(2,3));
        System.out.println(print(4,2,6));
    }

    }
