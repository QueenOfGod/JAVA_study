class Singleton{
    private static Singleton one;
    private Singleton(){
    }
    public static Singleton getInstance(){
        if(one == null) {
            one = new Singleton();                 // 같은 클래스이므로 생성자 호출 가능
        }
        return one;
    }
}

public class singleton_ex{
    public static void main(String[] args){
        // Singleton singleton = new Singleton()   // 컴파일 에러
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton1==singleton2);
    }
}