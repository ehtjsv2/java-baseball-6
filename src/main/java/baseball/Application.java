package baseball;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Application {
    private final static int ON = 1;

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("숫자 야구 게임을 시작합니다.");
        Game game = new Game(br);
        while (game.getStatus() == ON) {
            game.start();
            game.askRestart();
        }

    }
}
