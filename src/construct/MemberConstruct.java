package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    //생성자 오버로딩 - 성적입력이 꼭 필요한 경우에는 grade가 있는 생성자를 호출하고
    // 아닐때는 grade가 없는 생성자를 호출

    //this()라는 기능을 사용하면 생성자 내부에서 자신의 생성자를 호출할 수 있음
    //this는 인스턴스 자신의 참조값을 가리킴
    //this는 무조건 첫번째줄에서만 사용 가능

    MemberConstruct(String name, int age){
        this(name,age,50);
//        this.name = name;
//        this.age = age;
//        this.grade = 50;
    }

    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name=" + name + ", age=" + age + ", grade=" + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
