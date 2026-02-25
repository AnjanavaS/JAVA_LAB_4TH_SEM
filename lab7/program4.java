import java.util.Scanner;

class HrsException extends Exception {
    public HrsException(String msg) {
        super(msg);
    }
}

class MinException extends Exception {
    public MinException(String msg) {
        super(msg);
    }
}

class SecException extends Exception {
    public SecException(String msg) {
        super(msg);
    }
}

class Time {
    int hours, minutes, seconds;

    void getTime(int h, int m, int s) throws HrsException, MinException, SecException {
        if (h < 0 || h > 24)
            throw new HrsException("Invalid Hours");
        if (m < 0 || m > 60)
            throw new MinException("Invalid Minutes");
        if (s < 0 || s > 60)
            throw new SecException("Invalid Seconds");

        hours = h;
        minutes = m;
        seconds = s;

        System.out.println("Correct Time-> " + hours + ":" + minutes + ":" + seconds);
    }
}

class program4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Time t = new Time();

        try {
            int h = sc.nextInt();
            int m = sc.nextInt();
            int s = sc.nextInt();

            t.getTime(h, m, s);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
