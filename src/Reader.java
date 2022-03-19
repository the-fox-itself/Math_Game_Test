import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Created by creeper on 15.05.18.
 */
class Reader {
    String reader() { //Этот метод считывает ответ пользователя. Если ответ пользователя - "Выход", значит программа завершается
        String strAnswer = null;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            strAnswer = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (strAnswer.equals("выход") || strAnswer.equals("Выход")) {
            System.out.println("Вы вышли из игры!");
            System.exit(0);
        }
        return strAnswer;
    }

    int instructions1() { //Этот метод нужен для выведения стартовых инструкций, выбора вида примера и вызова методов для вычисления уровня сложности. Этот метод вовращает полученный из методов уровень сложности.
        int returnI;
        System.out.println("Игра \"Математика\":");
        System.out.println("Напишите \"Выход\", чтобы выйти из игры.");
        System.out.println("Выберите вид примера:\nс - Сложение\nв - Вычитание\nу - Умножение\nд - Деление");
        while (true) {
            String choose = reader();
            if (choose.equals("с")) {
                returnI = instructionsP();
                break;
            } else if (choose.equals("в")) {
                returnI = instructionsMi();
                break;
            } else if (choose.equals("у")) {
                returnI = instructionsM();
                break;
            } else if (choose.equals("д")) {
                returnI = instructionsD();
                break;
            } else {
                System.out.println("Попробуйте ещё раз (проверьте, русским вы пишите или английским).");
            }
        }
        return returnI;
    }
    private int instructionsM() { //Возвращает уровень сложности
        int levelN = 0;
        System.out.println("Введите уровень сложности (1-5):");
        System.out.println("1 уровень: однозн. число умножается на однозн. (без нулей)");
        System.out.println("2 уровень: однозн. число умножается на двухзн. (без нулей)");
        System.out.println("3 уровень: двухзн. число умножается на двухзн.");
        System.out.println("4 уровень: двухзн. число умножается на трёхзн.");
        System.out.println("5 уровень: трёхзн. число умножается на трёхзн.");
        while (true) {
            String line = reader();
            try {
                if (line != null) {
                    levelN = Integer.parseInt(line);
                    if (levelN != 1 && levelN != 2 && levelN != 3 && levelN != 4 && levelN != 5) {
                        System.out.println("Введите число от 1 до 5 включительно!");
                    }
                }
            } catch (NumberFormatException e) {
                if (levelN > 0 || levelN < 1) {
                    System.out.println("Не вводите буквы и гигантские числа!");
                } else {
                    System.out.println("Введите число от 1 до 5, включительно!");
                }
            }
            if (levelN > 0 && levelN < 6) {
                break;
            }
        }
        System.out.println("Уровень сложности: " + levelN);
        return levelN;
    }

    private int instructionsP() {
        int levelN = 0;
        System.out.println("Введите уровень сложности (1-5):");
        System.out.println("1 уровень: однозн. число умножается на однозн. (без нулей)");
        System.out.println("2 уровень: однозн. число умножается на двухзн. (без нулей)");
        System.out.println("3 уровень: двухзн. число умножается на двухзн.");
        System.out.println("4 уровень: двухзн. число умножается на трёхзн.");
        System.out.println("5 уровень: трёхзн. число умножается на трёхзн.");
        while (true) {
            String line = reader();
            try {
                if (line != null) {
                    levelN = Integer.parseInt(line);
                    if (levelN != 1 && levelN != 2 && levelN != 3 && levelN != 4 && levelN != 5) {
                        System.out.println("Введите число от 1 до 5 включительно!");
                    }
                }
            } catch (NumberFormatException e) {
                if (levelN > 0 || levelN < 1) {
                    System.out.println("Не вводите буквы и гигантские числа!");
                } else {
                    System.out.println("Введите число от 1 до 5, включительно!");
                }
            }
            if (levelN > 0 && levelN < 6) {
                break;
            }
        }
        System.out.println("Уровень сложности: " + levelN);
        return levelN + 5;
    }

    private int instructionsMi() {
        int levelN = 0;
        System.out.println("Введите уровень сложности (1-5):");
        System.out.println("1 уровень: однозн. число умножается на однозн. (без нулей)");
        System.out.println("2 уровень: однозн. число умножается на двухзн. (без нулей)");
        System.out.println("3 уровень: двухзн. число умножается на двухзн.");
        System.out.println("4 уровень: двухзн. число умножается на трёхзн.");
        System.out.println("5 уровень: трёхзн. число умножается на трёхзн.");
        while (true) {
            String line = reader();
            try {
                if (line != null) {
                    levelN = Integer.parseInt(line);
                    if (levelN != 1 && levelN != 2 && levelN != 3 && levelN != 4 && levelN != 5) {
                        System.out.println("Введите число от 1 до 5 включительно!");
                    }
                }
            } catch (NumberFormatException e) {
                if (levelN > 0 || levelN < 1) {
                    System.out.println("Не вводите буквы и гигантские числа!");
                } else {
                    System.out.println("Введите число от 1 до 5, включительно!");
                }
            }
            if (levelN > 0 && levelN < 6) {
                break;
            }
        }
        System.out.println("Уровень сложности: " + levelN);
        return levelN + 10;
    }

    private int instructionsD() {
        int levelN = 0;
        System.out.println("Введите уровень сложности (1-5):");
        System.out.println("1 уровень: однозн. число умножается на однозн. (без нулей)");
        System.out.println("2 уровень: однозн. число умножается на двухзн. (без нулей)");
        System.out.println("3 уровень: двухзн. число умножается на двухзн.");
        System.out.println("4 уровень: двухзн. число умножается на трёхзн.");
        System.out.println("5 уровень: трёхзн. число умножается на трёхзн.");
        while (true) {
            String line = reader();
            try {
                if (line != null) {
                    levelN = Integer.parseInt(line);
                    if (levelN != 1 && levelN != 2 && levelN != 3 && levelN != 4 && levelN != 5) {
                        System.out.println("Введите число от 1 до 5 включительно!");
                    }
                }
            } catch (NumberFormatException e) {
                if (levelN > 0 || levelN < 1) {
                    System.out.println("Не вводите буквы и гигантские числа!");
                } else {
                    System.out.println("Введите число от 1 до 5, включительно!");
                }
            }
            if (levelN > 0 && levelN < 6) {
                break;
            }
        }
        System.out.println("Уровень сложности: " + levelN);
        return levelN + 15;
    }
}
