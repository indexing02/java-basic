package oop1;

public class MusicPlayerMain3 {
    public static void main(String[] args) {

        //절차 지향 프로그래밍3 - 메서드 추출
        //각각의 기능을 메서드로 만들어 기능이 모듈화
        //중복제거 - 로직 중복 제거(같은 로직 필요시 메서드만 여러번 호출하면 됌)
        //변경 영향 범위 - 기능을 수정할때 해당 메서드 내부만 변경하면 됌
        //메서드 이름 추가 - 메서드 이름을 통해 코드를 더 쉽게 이해할 수 있음

        //절차 프로그래밍의 한계
        //데이터와 기능이 분리되어 있음(데이터는 MusicPlayerData, 기능(메서드)는 MusicPlayerMain3)
        // 각각의 메서드는 대부분 MusicPlayerData의 데이터를 사용중
        // 따라서 데이터가 변경된다면 MusicPlayerMain3 부분의 메서드도 함께 변경이 필요해짐
        MusicPlayerData data = new MusicPlayerData();

        //음악 플레이어 켜기
        on(data);
        //볼륨증가
        volumeUp(data);
        //볼륨증가
        volumeUp(data);
        //볼륨감소
        volumeDown(data);
        //음악 플레이어 상태
        showStatus(data);
        //음악 플레이어 끄기
        off(data);
    }

    //음악 플레이어 켜기
    static void on(MusicPlayerData data){
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    //음악 플레이어 끄기
    static void off(MusicPlayerData data){
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    //볼륨증가
    static void volumeUp(MusicPlayerData data){
        data.volume++;
        System.out.println("음악 플레이어 볼륨 : " + data.volume);
    }

    //볼륨감소
    static void volumeDown(MusicPlayerData data){
        data.volume--;
        System.out.println("음악 플레이어 볼륨 : " + data.volume);
    }

    //음악플레이어 상태 확인
    static void showStatus(MusicPlayerData data){
        System.out.println("음악 플레이어 상태 확인");
        if(data.isOn){
            System.out.println("음악 플레이어 ON, 볼륨: " +  data.volume);
        }else{
            System.out.println("음악 플레이어 OFF");
        }
    }
}
