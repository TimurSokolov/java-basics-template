package com.epam.izh.rd.online.game;

/**
 * Класс, который реализует игру со спичками. Суть игры: есть n спичек, число которых задано в начале игры. Каждый игрок
 * делает ход по очереди убирая 1, 2 или 3 спички. Кто сделает ход последним - проиграл.
 *
 * В ходе программы рекомендуется использовать консоль. Считывать число можно методом new Scanner( System.in ).nextInt()
 * Программа должна объявлять о начале игры, о количесве спичек после каждого хода, кто сейчас делает свой ход и результат
 * игры.
 * При вводе недопустимого числа спичек для взятия в консоль выводится ошибка и ввод предлагается снова.
 * Право первого хода определяется случайным образом
 *
 * Реализуйте 2 метода:
 * playWithFriend - игра с другом. Каждый игрок соверщает ходы за одной консолью.
 * playWithMachine - игра против компьютера. Компьютер может брать случайное количество спичек.
 *
 * Задание под звездочкой - сделать так, чтобы выиграть playWithMachine было невозможно. (Компьютер ходит первым)
 */
public class MatchGame {

    /**
     * Число оставшихся спичек
     */
    private int matches; //TODO

    /**
     * Чей сейчас ход
     */
    private boolean currentTurn; //TODO

    public MatchGame(int i) {
        //TODO
    }

    /**
     * Метод начинает игру с двумя игроками за одной консолью
     */
    public void playWithFriend(int initialMatches) {
        // TODO
    }

    /**
     * Метод начинает игру с компьютером, который делает случайные ходы
     */
    public void playWithMachine(int initialMatches) {
        // TODO
    }

    /**
     * Метод начинает игру с компьютером, который начинает игру и никогда не проигрывает
     */
    public void playWithGodMachine(int initialMatches) {
        // TODO
    }

    private boolean isCurrentPlayerWon() {
        return false; //TODO
    }
}
