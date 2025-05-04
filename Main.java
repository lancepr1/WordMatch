public class Main
{
    public static void main(String[]args)
    {
        WordMatch w = new WordMatch("mississippi");
        System.out.println(w.scoreGuess("i"));
        System.out.println(w.scoreGuess("iss"));
        System.out.println(w.scoreGuess("issipp"));
        System.out.println(w.scoreGuess("mississippi"));
        WordMatch game = new WordMatch("aaaabb");
        System.out.println(game.scoreGuess("a"));
        System.out.println(game.scoreGuess("aa"));
        System.out.println(game.scoreGuess("aaa"));
        System.out.println(game.scoreGuess("aabb"));
        System.out.println(game.scoreGuess("c"));
        WordMatch g = new WordMatch("concatenation");
        System.out.println(g.scoreGuess("ten"));
        System.out.println(g.scoreGuess("nation"));
        System.out.println(g.findBetterGuess("ten", "nation"));
        System.out.println(g.scoreGuess("con"));
        System.out.println(g.scoreGuess("cat"));
        System.out.println(g.findBetterGuess("con", "cat"));

    }
}
