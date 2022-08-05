import java.util.Scanner;

class Guesser {
    int GuessNum;

    int GenerateNum() {
        System.out.println("-----------------------------------");
        System.out.println("Guesser, Please Guess a Number [Between 0-9] : ");
        System.out.println("-----------------------------------");
        Scanner sc = new Scanner(System.in);
        GuessNum = sc.nextInt();
        while (GuessNum > 9 || GuessNum < 0) {
            System.out.println("_______________________________");
            System.out.println("Guesser,Enter a Valid Number :) ");
            System.out.println("_______________________________");
            GuessNum = sc.nextInt();
        }
        return GuessNum;
    }
}

class Player1 {
    int GuessNum;

    int GenerateNum() {
        System.out.println("-----------------------------------");
        System.out.println("Player 1, enter your predicted Number [0-9 Allowed only]");
        System.out.println("-----------------------------------");
        Scanner sc = new Scanner(System.in);
        GuessNum = sc.nextInt();
        while (GuessNum > 9 || GuessNum < 0) {
            System.out.println("_______________________________");
            System.out.println("Player 1,Enter a Valid Number :) ");
            System.out.println("_______________________________");
            GuessNum = sc.nextInt();
        }
        return GuessNum;
    }
}

class Player2 {
    int GuessNum;

    int GenerateNum() {
        System.out.println("-----------------------------------");
        System.out.println("Player 2, enter your predicted Number [0-9 Allowed only]");
        System.out.println("-----------------------------------");
        Scanner sc = new Scanner(System.in);
        GuessNum = sc.nextInt();
        while (GuessNum > 9 || GuessNum < 0) {
            System.out.println("_______________________________");
            System.out.println("Player 2,Enter a Valid Number :) ");
            System.out.println("_______________________________");
            GuessNum = sc.nextInt();
        }
        return GuessNum;
    }
}

class Player3 {
    int GuessNum;

    int GenerateNum() {
        System.out.println("-----------------------------------");
        System.out.println("Player 3, enter your predicted Number [0-9 Allowed only]");
        System.out.println("-----------------------------------");
        Scanner sc = new Scanner(System.in);
        GuessNum = sc.nextInt();
        while (GuessNum > 9 || GuessNum < 0) {
            System.out.println("_______________________________");
            System.out.println("Player 3,Enter a Valid Number :) ");
            System.out.println("_______________________________");
            GuessNum = sc.nextInt();
        }
        return GuessNum;
    }
}

class UmpireFor2 {
    int NumFromPlayer1, NumFromPlayer2, NumFromGuesser;

    void TakeNum() {
        Guesser Host = new Guesser();
        NumFromGuesser = Host.GenerateNum();
        Player1 P1 = new Player1();
        Player2 P2 = new Player2();
        NumFromPlayer1 = P1.GenerateNum();
        NumFromPlayer2 = P2.GenerateNum();

    }

    void Result() {
        if (NumFromGuesser == NumFromPlayer1) {
            System.out.println("-----------------------------------");
            System.out.println("Player 1 is Winner ! ");
            System.out.println("-----------------------------------");
        } else if (NumFromGuesser == NumFromPlayer2) {
            System.out.println("-----------------------------------");
            System.out.println("Player 2 is Winner ! ");
            System.out.println("-----------------------------------");
        } else if (NumFromGuesser == NumFromPlayer1 && NumFromGuesser == NumFromPlayer2) {
            System.out.println("-----------------------------------");
            System.out.println("Game Draw between Player 1 and Player 2 ! ");
            System.out.println("-----------------------------------");
        } else {
            System.out.println("-----------------------------------");
            System.out.println("Game Finished ! ");
            System.out.println("-----------------------------------");
        }
    }
}

class UmpireFor3 {
    int NumFromPlayer1, NumFromPlayer2, NumFromPlayer3, NumFromGuesser;

    void TakeNum() {
        Guesser Host = new Guesser();
        NumFromGuesser = Host.GenerateNum();
        Player1 P1 = new Player1();
        Player2 P2 = new Player2();
        Player3 P3 = new Player3();
        NumFromPlayer1 = P1.GenerateNum();
        NumFromPlayer2 = P2.GenerateNum();
        NumFromPlayer3 = P3.GenerateNum();

    }

    void Result() {
        if (NumFromGuesser == NumFromPlayer1) {
            if (NumFromGuesser == NumFromPlayer2 && NumFromGuesser == NumFromPlayer3) {
                System.out.println("-----------------------------------");
                System.out.println("Game Draw Between Player 1, Player 2 and Player 3 ! ");
                System.out.println("-----------------------------------");
            } else if (NumFromGuesser == NumFromPlayer2) {
                System.out.println("-----------------------------------");
                System.out.println("Game Draw Between Player 1 and Player 2 ! ");
                System.out.println("-----------------------------------");
            } else if (NumFromGuesser == NumFromPlayer3) {
                System.out.println("-----------------------------------");
                System.out.println("Game Draw Between Player 1 and Player 3 ! ");
                System.out.println("-----------------------------------");
            } else {
                System.out.println("-----------------------------------");
                System.out.println("Player 1 is Winner ! ");
                System.out.println("-----------------------------------");
            }

        } else if (NumFromGuesser == NumFromPlayer2) {
            if (NumFromGuesser == NumFromPlayer3) {
                System.out.println("-----------------------------------");
                System.out.println("Game Draw Between Player 2 and Player 3");
                System.out.println("-----------------------------------");
            } else {
                System.out.println("-----------------------------------");
                System.out.println("Player 2 is Winner !");
                System.out.println("-----------------------------------");
            }
        } else if (NumFromGuesser == NumFromPlayer3) {
            System.out.println("-----------------------------------");
            System.out.println("Player 3 is Winner !");
            System.out.println("-----------------------------------");
        } else {
            System.out.println("-----------------------------------");
            System.out.println("Game Lost by Everyone ! Try Again");
            System.out.println("-----------------------------------");
        }
    }
}

public class GuessGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------------------------");
        System.out.println("Hey Alien, Wanna Play a Game ?");
        System.out.println("-----------------------------------");
        System.out.println("Enter '1' if Yes or '0' to exit : ");
        System.out.println("-----------------------------------");
        int Gamestart = sc.nextInt();
        if (Gamestart == 1) {
            System.out.println("****************************************");
            System.out.println(" GAME RULES :");
            System.out.println("****************************************");
            System.out.println(
                    " 1. This is a Multiplayer Game for upto 3 Players \n 2. Guesser will think of a number between 0-9 \n 3. Each Player will try to Guess the Number \n 4. Player who Guesses the number correctly wins !");
            System.out.println("****************************************");
            System.out.println("Enter the No.of Players [2/3] : ");
            int Playernum = sc.nextInt();
            while (Playernum != 2 && Playernum != 3) {
                System.out.println("_______________________________");
                System.out.println("Please, Enter Valid Number of Players :)");
                System.out.println("_______________________________");
                Playernum = sc.nextInt();
            }
            if (Playernum == 2) {

                UmpireFor2 Game = new UmpireFor2();
                Game.TakeNum();
                Game.Result();
            } else if (Playernum == 3) {

                UmpireFor3 Game = new UmpireFor3();
                Game.TakeNum();
                Game.Result();
            }

        } else {
            System.out.println("-----------------------------------");
            System.out.println("You have Exit the Game !");
            System.out.println("-----------------------------------");
            System.exit(0);
        }
        System.out.println("-----------------------------------");
        System.out.println("Do you want to Run this Program Again? [ Enter '1' for Yes and '0' for No ]");
        System.out.println("-----------------------------------");
        int reload = sc.nextInt();
        if (reload == 1) {
            GuessGame G1 = new GuessGame();
            G1.main(args);
        } else {
            System.out.println("-----------------------------------");
            System.out.println("You have Exit the Program");
            System.out.println("-----------------------------------");
        }
    }
}