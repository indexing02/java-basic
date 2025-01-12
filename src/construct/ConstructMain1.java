package construct;

public class ConstructMain1 {
    public static void main(String[] args) {

        //생성자 장점
        //1.중복 호출 제거
        //2.제약 - 생성자 호출 필수:일반 메서드는 값들을 필수로 입력해야 할 때 문제 발생(ex)유령회원 등장)
        //->객체를 생성할 때 직접 정의한 생성자가 있다면 직접 정의한 생성자를 반드시 호출해야한다는 것이 가장 큰 장점

        MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
        MemberConstruct member2 = new MemberConstruct("user2", 16, 80);

        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct member : members) {
            System.out.println("이름:" + member.name+" 나이:" + member.age+" 성적:" + member.grade);
        }

    }
}

