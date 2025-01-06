package ref;

public class InitMain {
    public static void main(String[] args) {
        InitData data = new InitData();
        System.out.println("value1 = " + data.value1);
        System.out.println("value2 = " + data.value2);

        //멤버 변수는 초기화 하지 않아도 자동으로 초기화 된다.
        //int=0, boolean=false, 참조형=null
    }
}
