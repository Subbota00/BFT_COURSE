public class Instrument {
    enum StringCount {
        GUITAR(6),
        PIANO(230);

        private final int count;

        StringCount(int count) {
            this.count = count;
        }

        public int getCount() {
            return count;
        }
    }
}