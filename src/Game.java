import java.util.List;
import java.util.concurrent.TimeUnit;

public class Game
{
    public static void main(String[] args) throws InterruptedException
    {
        OnlineGame onlineGame = new OnlineGame();
        onlineGame.start();
    }

    public static class OnlineGame extends Thread
    {
        public static volatile boolean isWinnerFound = false;

        public static List<String> steps = List.of("Начало игры", "Сбор ресурсов", "Рост экономики", "Убийство врагов");

        protected Gamer gamer1 = new Gamer("Player 1", 3);
        protected Gamer gamer2 = new Gamer("Player 2", 1);
        protected Gamer gamer3 = new Gamer("Player 3", 5);

        public void run()
        {
            gamer1.start();
            gamer2.start();
            gamer3.start();

            while (!isWinnerFound)
            {
            }
            gamer1.interrupt();
            gamer2.interrupt();
            gamer3.interrupt();
        }
    }

    public static class Gamer extends Thread
    {
        private int rating;

        public Gamer(String name, int rating)
        {
            super(name);
            this.rating = rating;
        }

        @Override
        public void run()
        {
            try{
                for (int i = 0; i <= 3; i++){
                    if (i == 3) {
                        OnlineGame.isWinnerFound = true;
                        System.out.println(this.getName() + ": победитель!");
                        break;
                    }
                    else System.out.println(this.getName() + ": " + OnlineGame.steps.get(i));
                    TimeUnit.MILLISECONDS.sleep(1000 / rating);
                }
            }
            catch (InterruptedException exc) {
                System.out.println(this.getName() + ": проиграл");
            }
        }
    }
}