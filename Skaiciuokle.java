public class Skaiciuokle {
        private final double a;
        private final double b;

        public Skaiciuokle(double a, double b) {
            this.a = a;
            this.b = b;
        }

        public double sudetis() {
            return a + b;
        }

        public double atimtis() {
            return a - b;
        }

        public double daugyba() {
            return a * b;
        }

        public double dalyba() {
            if (b == 0) {
                throw new ArithmeticException("Dalinti is nulio negalima.");
            }
            return a / b;
        }
    }