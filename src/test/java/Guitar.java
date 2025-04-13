public class Guitar implements Playable {
    @Override
    public void play(int stringCount) {
        System.out.println("У гитары "  + stringCount + " струн");

    }
}