package poly.basic;

public class CastingMain1 {
    public static void main(String[] args) {
        //부모 변수가 자식 인스턴스 참조(다형성 참조)
        Parent poly = new Child();
        //자식 클래스의 기능은 호출 불가
        //poly.childMethod();

        //다운캐스팅(부모타임 -> 자식 타입)
        Child child = (Child) poly;
        child.childMethod();

        //일시적 다운캐스팅 - 해당 메서드를 호출하는 순간만 다운캐스팅
        ((Child) poly).childMethod();
    }
}
