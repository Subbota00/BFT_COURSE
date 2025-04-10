public class UseInstrument {

    public static void main(String[] args) {
        Guitar guitar = new Guitar();
        Piano piano = new Piano();

        guitar.play(Instrument.StringCount.GUITAR.getCount());
        piano.play(Instrument.StringCount.PIANO.getCount());


    }

}