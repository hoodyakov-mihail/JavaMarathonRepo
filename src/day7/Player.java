package day7;

/*
Для игры в футбол во дворе требуется 6 человек (3х3). Класс Игрок (англ. Player), содержит следующие поля:
поле “выносливость” (англ. stamina), разное для каждого экземпляра
константы “максимальная выносливость” (англ. MAX_STAMINA) со значением 100 и “минимальная выносливость” (англ. MIN_STAMINA) со значением 0, единые для всех экземпляров
статическое поле countPlayers, которое считает кол-во игроков на футбольном поле (изначально их 0, выходом на поле считается создание экземпляра класса, уходом - когда игрок устал).

и следующие методы:
run() - Игрок бежит при вызове этого метода. Этот метод уменьшает выносливость на 1 при однократном вызове.
Когда выносливость достигает 0, игроку нужен отдых и он уходит с поля.
info() -  выводит сообщение в зависимости от кол-ва игроков на поле, если игроков менее 6, то выводит фразу “Команды неполные, еще есть ... свободных мест”,
 иначе “Мест в командах больше нет”. Грамматикой русского языка пренебречь, т.е. фраза “еще есть 1 свободных мест” допустима.
Задание: Создать класс Player по вышеописанному шаблону. Экземпляр класса при создании должен иметь значение выносливости от 90 до 100.
 Создать 6 игроков, вызвать метод info(). При попытке создать 7,8 … n игрока, количество игроков на поле меняться не должно, проверить это.
Примените к игроку метод run(), пока он полностью не выдохнется (отрицательное значение выносливости не допускается).
Вывести количество игроков на поле.

*По желанию: доработать метод info(), так, чтобы при выводе в консоль грамматика русского языка учитывалась.
 */
public class Player {
    private int stamina;
    private final int MAX_STAMINA = 100;
    private final int MIN_STAMINA = 0;
    private static int countPlayers;

    public Player() {
        this.stamina = (int)(Math.random() * ((100 - 90) + 1)) + 90;
        if (countPlayers < 6) {
            System.out.println("Игрок вышел на поле");
            countPlayers++;
        } else System.out.println("Мест в командах больше нет, игрок не вышел на поле");
    }

    public void run() {
        if (stamina > MIN_STAMINA) {
            stamina--;
            System.out.println("Игрок бежит");
        } else {
            countPlayers--;
            System.out.println("Нужен отдых, игрок уходит с поля");
        }
    }
    public void info() {
        int playersOnField = 6 - countPlayers;
        switch (playersOnField) {
            case (1):
                System.out.println("Команды неполные, еще есть одно свободное место");
                break;
            case (2):
                System.out.println("Команды неполные, еще есть два свободных места");
                break;
            case (3):
                System.out.println("Команды неполные, еще есть три свободных места");
                break;
            case (4):
                System.out.println("Команды неполные, еще есть четыре свободных места");
                break;
            case (5):
                System.out.println("Команды неполные, еще есть пять свободных мест");
                break;
            case (6):
                System.out.println("Команды неполные, еще есть шесть свободных мест");
                break;
            default:
                System.out.println("Мест в командах больше нет");
        }
    }
}
