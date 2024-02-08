package tr.com.workintech.monsterrpg;

public class Main {
    public static void main(String[] args) {
        Troll troll = new Troll("Troll", 100, 20);
        Snake snake = new Snake("Snake", 100, 10);

        System.out.println("Troll attacks " + troll.attack());
        System.out.println("Snake attacks " + snake.attack());

        System.out.println("Troll bleeds " + troll.bleed());
        System.out.println("Snake poisoned " + snake.poison());


    }
}
