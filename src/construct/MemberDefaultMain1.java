package construct;

public class MemberDefaultMain1 {
    public static void main(String[] args) {

        //생성자 기능이 필요하지 않은 경우도 많기 때문에 자바에서는 기본 생성자를 자동으로 만들어줌
        //생성자는 반드시 호출되어야 하며, 생성자가 없으면 기본 생성자가 제공
        //생성자가 하나라도 있으면 기본 생성자는 제공되지 않음
        MemberDefault memberDefault = new MemberDefault();
    }
}
