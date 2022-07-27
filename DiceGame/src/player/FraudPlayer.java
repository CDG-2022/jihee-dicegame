package player;

import dice.FraudDice;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class FraudPlayer {
    private String name;
    private int total;

    private FraudDice fraudDice;

    public FraudPlayer(String name, FraudDice fraudDice){
        this.name = name;
        System.out.println("사기꾼 등장! 내 이름은 " + name);
        System.out.println("나는 사기 주사위를 가지고 있지!");
        this.fraudDice = fraudDice;
    }

    int levelOfDice() {
        // (플레이어의 total > 사기 플레이어의 total) then 사기 주사위 rollHard()
        // (사기 플레이어의 total - 플레이어의 total > 6) then 사기 주사위 rollEasy()
        // else 사기 주사위 노말모드
        return 0;
    }
}
