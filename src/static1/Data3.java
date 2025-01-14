package static1;

public class Data3 {
    public String name;
    public static int count;

    //인스턴스 변수 - static이 붙지 않는 멤버변수
    //인스턴스를 생성해야 사용가능, 인스턴스 소속

    //클래스 변수 - staticdl 붙은 멤버변수
    //클래스변수, 정적변수, static변수(총 3가지 용어)
    //딱 1개만 생성 -> 인스턴스와 다르게 여러곳에서 공유하는 목적으로 사용

    public Data3(String name) {
        this.name = name;
        count++;
    }
}
