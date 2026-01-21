class program4 {

    int balance = 5000;

    static class InterestCalculator {
        static double simpleInterest(double p, double r, double t) {
            return (p * r * t) / 100;
        }
    }

    public static void main(String[] args) {
        double si = InterestCalculator.simpleInterest(1000, 5, 2);
        System.out.println("Simple Interest: " + si);
    }
}
