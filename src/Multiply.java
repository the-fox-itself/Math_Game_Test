/*
 * Created by creeper on 13.02.18.
 */
class Multiply {
    int trueAnswers = 0;
    int numberMultiplyNumber(long level) { //Этот метод отвечает за умножение. Возвращает 1 при правильном ответе, 0 при неправильном и -1 при ошибке в программе.
        int oneNumber;
        int twoNumber;
        if (level == 1) {
            while (true) {
                oneNumber = (int) (Math.random() * 10);
                if (oneNumber != 0) {
                    break;
                }
            }
            while (true) {
                twoNumber = (int) (Math.random() * 10);
                if (twoNumber != 0) {
                    break;
                }
            }
            long answer = oneNumber * twoNumber;
            System.out.println(oneNumber + " x " + twoNumber);
            Reader reader = new Reader();
            long intUserAnswer;
            while (true) {
                String userAnswer = reader.reader();
                try {
                    if (userAnswer != null) {
                        intUserAnswer = (long) Integer.parseInt(userAnswer);
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Не вводите буквы и чрезмерно гигантские числа!");
                }
            }
            if (intUserAnswer == answer) {
                trueAnswers++;
                System.out.println("Переменная trueAnswers изменена");
                return 1;
            } else {
                return 0;
            }
        } else if (level == 2) {
            while (true) {
                oneNumber = (int) (Math.random() * 10);
                if (oneNumber != 0) {
                    break;
                }
            }
            while (true) {
                twoNumber = (int) (Math.random() * 100);
                if (twoNumber > 9) {
                    break;
                }
            }
            long answer = oneNumber * twoNumber;
            System.out.println(oneNumber + " x " + twoNumber);
            Reader reader = new Reader();
            long intUserAnswer;
            while (true) {
                String userAnswer = reader.reader();
                try {
                    if (userAnswer != null) {
                        intUserAnswer = Integer.parseInt(userAnswer);
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Не вводите буквы и чрезмерно гигантские числа!");
                }
            }
            if (intUserAnswer == answer) {
                trueAnswers++;
                return 1;
            } else {
                return 0;
            }
        } else if (level == 3) {
            while (true) {
                oneNumber = (int) (Math.random() * 100);
                if (oneNumber > 9) {
                    break;
                }
            }
            while (true) {
                twoNumber = (int) (Math.random() * 100);
                if (twoNumber > 9) {
                    break;
                }
            }
            long answer = oneNumber * twoNumber;
            System.out.println(oneNumber + " x " + twoNumber);
            Reader reader = new Reader();
            long intUserAnswer;
            while (true) {
                String userAnswer = reader.reader();
                try {
                    if (userAnswer != null) {
                        intUserAnswer = Integer.parseInt(userAnswer);
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Не вводите буквы и чрезмерно гигантские числа!");
                }
            }
            if (intUserAnswer == answer) {
                trueAnswers++;
                return 1;
            } else {
                return 0;
            }
        } else if (level == 4) {
            while (true) {
                oneNumber = (int) (Math.random() * 100);
                if (oneNumber > 9) {
                    break;
                }
            }
            while (true) {
                twoNumber = (int) (Math.random() * 1000);
                if (twoNumber > 99) {
                    break;
                }
            }
            long answer = oneNumber * twoNumber;
            System.out.println(oneNumber + " x " + twoNumber);
            Reader reader = new Reader();
            long intUserAnswer;
            while (true) {
                String userAnswer = reader.reader();
                try {
                    if (userAnswer != null) {
                        intUserAnswer = Integer.parseInt(userAnswer);
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Не вводите буквы и чрезмерно гигантские числа!");
                }
            }
            if (intUserAnswer == answer) {
                trueAnswers++;
                return 1;
            } else {
                return 0;
            }
        } else if (level == 5) {
            while (true) {
                oneNumber = (int) (Math.random() * 1000);
                if (oneNumber > 99) {
                    break;
                }
            }
            while (true) {
                twoNumber = (int) (Math.random() * 1000);
                if (twoNumber > 99) {
                    break;
                }
            }
            long answer = oneNumber * twoNumber;
            System.out.println(oneNumber + " x " + twoNumber);
            Reader reader = new Reader();
            long intUserAnswer;
            while (true) {
                String userAnswer = reader.reader();
                try {
                    if (userAnswer != null) {
                        intUserAnswer = Integer.parseInt(userAnswer);
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Не вводите буквы и чрезмерно гигантские числа!");
                }
            }
            if (intUserAnswer == answer) {
                trueAnswers++;
                return 1;
            } else {
                return 0;
            }
        } else {
            return -1;
        }
    }
}
