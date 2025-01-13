package access.ex;

public class MaxCounter {
    private int count;
    private int max;

    //최대값 설정 생성자 메서드
    public MaxCounter(int max) {
        this.max = max;
    }

    //숫자증가 메서드
    public void increment() {
        if(max>count){
            count++;
        }else{
            System.out.println("최대값을 초과할 수 없습니다.");
        }
    }

    //증가한 값 반환 메서드
    public int getCount() {
        return count;
    }
}

