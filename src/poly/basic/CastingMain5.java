package poly.basic;

public class CastingMain5 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);

        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);

    }

    private static void call(Parent parent) {
        parent.parentMethod();
        //자바 버전 16이상부터는 instanceof Child 뒤에 변수명을 지정할 수 있음
        //덕분에 인스턴스가 맞는 경우 다운캐스팅 하는 코드 생략 가능
        if(parent instanceof Child child) {
            System.out.println("Child 인스턴스가 맞음");
            child.childMethod();
        }else{
            System.out.println("Child 인스턴스가 아님");
        }
    }
}
