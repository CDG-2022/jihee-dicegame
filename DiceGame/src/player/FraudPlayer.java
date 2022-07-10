package player;

public class FraudPlayer {
    String name;
    int total;

    int levelOfDice() {
        // (플레이어의 total > 사기 플레이어의 total) then 사기 주사위 하드모드
        // (사기 플레이어의 total - 플레이어의 total > 6) then 사기 주사위 이지모드
        // else 사기 주사위 노말모드
        return 0;
    }
}
