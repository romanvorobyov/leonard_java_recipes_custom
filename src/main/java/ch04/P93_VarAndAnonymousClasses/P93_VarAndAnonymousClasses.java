package ch04.P93_VarAndAnonymousClasses;

public class P93_VarAndAnonymousClasses {

    public static void main(String[] args) {

        // Prefer
        var weighter = new Weighter() {
            @Override
            public int getWeight(Player player) {
                return 85;
            }
        };

        Player player = new Player();
        int weight = weighter.getWeight(player);

        System.out.println("Player weight: " + weight);
    }
}
