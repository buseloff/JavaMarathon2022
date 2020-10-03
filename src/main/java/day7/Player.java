package day7;

public class Player {
    private int stamina;
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    private static int countPlayers;
    private static final int maxPlayers = 6;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < maxPlayers) {
            countPlayers++;
        }
    }
    public void run() {
        if (stamina == MIN_STAMINA) {
            return;
        }
        stamina--;
        if (stamina == MIN_STAMINA) {
            countPlayers--;
        }
    }

    public static void info() {
        switch (countPlayers) {
            case maxPlayers:
                System.out.println("На поле нет свободных мест");
                break;
            case maxPlayers - 1:
                System.out.println("Команды неполные." +
                        " На поле еще есть "+ (maxPlayers - countPlayers) +" свободное место");
                break;
            case maxPlayers - 2:
            case maxPlayers - 3:
            case maxPlayers - 4:
                System.out.println("Команды неполные." +
                        " На поле еще есть "+ (maxPlayers - countPlayers) +" свободных места");
                break;
            case maxPlayers - 5:
                System.out.println("Команды неполные." +
                        " На поле еще есть 5 свободных мест");
                break;
        }
    }
}

