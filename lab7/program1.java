class program1 {
    public static void main(String[] args) {

        int[] arr = new int[4];

        try {
            arr[0] = 1;
            arr[1] = 2;
            arr[2] = 3;
            arr[3] = 4;
            arr[4] = 5;   
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}
