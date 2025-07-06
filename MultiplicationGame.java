
class MultiplicationGame {

    public static String playGame(int n) {
        int current = 1;
        boolean michaelTurn = true;

        while (current < n) {
            if (current * 3 <= n) {
                current *= 3;
            } else {
                current *= 2;
            }
            michaelTurn = !michaelTurn;
        }
        return michaelTurn ? "John wins" : "Michael wins";
    }

    public static void main(String[] args) {
        int n = 100;
        String result = playGame(n);
        System.out.println(n + " " + result);
    }
}
