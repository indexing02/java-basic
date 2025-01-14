package static2;

public class DecoUtil2 {

    //클래스 메서드(정적 메서드) - 인스턴스 생성 없이 클래스에 있는 메서드를 바로 호출
    //인스턴스 메서드 - 인스턴스를 생성해야 호출 가능

    public static String deco(String str){
        String result = "*"+str+"*";
        return result;
    }
}
