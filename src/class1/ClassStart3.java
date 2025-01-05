package class1;
public class ClassStart3 {
    public static void main(String[] args) {
        Student student1;
        student1 = new Student(); // Student 객체생성
        student1.name="학생1"; //new Student()의 결과로 참조값 반환
        student1.age=15;
        student1.grade=90;

        Student student2 = new Student();
        student2.name="학생2";
        student2.age=18;
        student2.grade=80;

        System.out.println("이름:" + student1.name + " 나이:" + student1.age + " 성적:" + student1.grade);
        System.out.println("이름:" + student2.name + " 나이:" + student2.age + " 성적:" + student2.grade);
    }

    //클래스를 사용하면 int, String과 같은 타입을 직접 만들 수 있음
    //사용자가 직접 정의하는 사용자 정의 탕비을 만들려면 설계도가 필요하고 이 설계도가 바로 클래스
    //설계도인 클래스를 사용해서 실제 메모리에 만들어진 실체를 객체 또는 인스턴스라고함

}
