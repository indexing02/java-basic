package oop1;

public class MusicPlayerMain4 {
    public static void main(String[] args) {
        //객체지향 프로그래밍
        //캡슐화 - 속성과 기능을 하나로 묶어서 필요한 기능을 메서드를 통해 외부에 제공하는 것
        //MusicPlayer의 데이터 변경이 생기더라도 기능 호출부분 MusicPlayerMain4의 코드는 변경하지 않아도됌

        MusicPlayer player = new MusicPlayer();
        //음악 플레이어 켜기
        player.on();
        //볼륨증가
        player.volumeUp();
        //볼륨증가
        player.volumeUp();
        //볼륨감소
        player.volumeDown();
        //음악 플레이어 상태
        player.showStatus();
        //음악 플레이어 끄기
        player.off();
    }
}
