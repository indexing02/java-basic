package class1;

public class ClassStart2 {
    public static void main(String[] args) {

        String[] studentNames = {"학생1", "학생2","학생3","학생4"};
        int[] studentAges = {15, 16, 17, 20};
        int[] studentGrade = {90, 80, 70, 60};

        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("이름:" + studentNames[i] + " 나이:" + studentAges[i] + " 성적:" + studentGrade[i]);
        }

        //배열을 사용하여 코드 변경 최소화는 성공
        //한 학생의 데이터가 3개의 배열에 나누어져있음
        //-> 한 학생의 데이터를 관리하기위해 3개 배열의 인덱스 순서를 항상 정확하게 맞추어야 함
        //학생이라는 개념을 하나로 묶어 각각의 학생 별로 본인의 이름, 나이, 성적을 관리하는 것이 필요(클래스의 필요성)



    }
}
