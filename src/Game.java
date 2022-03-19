/*
 * Created by creeper on 15.05.18.
 */
class Game {
    private Reader reader = new Reader();
    private int a1 = 0;
    private int a2 = 0;
    private int a3 = 0;
    private int a4 = 0;
    private int a5 = 0;
    private Multiply NMultiplyN = new Multiply();
    private Divide NDivideN = new Divide();
    private Plus NPlusN = new Plus();
    private Minus NMinusN = new Minus();

    void MainGame() {
        int level = reader.instructions1();
        int answer = 0;
        int n = 1;
        while (n < 6) {
            System.out.println("Пример №" + n + ":");
            if (level > 0 && level < 6) {
                answer = NMultiplyN.numberMultiplyNumber(level);
            }
            //else if (level > 5 && level < 11) {
            //    answer = NPlusN.numberMultiplyNumber(level);
            //}
            if (answer == 1) {
                if (n == 1) {
                    a1 = 1;
                }
                if (n == 2) {
                    a2 = 1;
                }
                if (n == 3) {
                    a3 = 1;
                }
                if (n == 4) {
                    a4 = 1;
                }
                if (n == 5) {
                    a5 = 1;
                }
            }
            n++;
        }
        System.out.println("Тест пройден!");
        if (NMultiplyN.trueAnswers == 0) {
            System.out.println("Вам нужно ещё тренироваться.");
        }
        if (NMultiplyN.trueAnswers == 1) {
            System.out.println("Вам следует больше стараться.");
        }
        if (NMultiplyN.trueAnswers == 2) {
            System.out.println("Можно лучше!");
        }
        if (NMultiplyN.trueAnswers == 3) {
            System.out.println("Не плохо!");
        }
        if (NMultiplyN.trueAnswers == 4) {
            System.out.println("Хорошо!");
        }
        if (NMultiplyN.trueAnswers == 5) {
            System.out.println("Блестяще!!!");
        }
        System.out.println("Ваше количество баллов: " + NMultiplyN.trueAnswers);
        System.out.println("Ваши ответы: " + a1 + " " + a2 + " " + a3 + " " + a4 + " " + a5);
        System.out.println("(1 - правильно, 0 - неправильно)\n\n");
    }
}
