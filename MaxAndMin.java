public class MaxAndMin {
    public static void main(String[] args) {
        int[] input = {54, 546, 548, 60};
        Largest(input);
        Smallest(input);
        System.out.println(Largest(input)+" "+Smallest(input));
    }

    private static int Smallest(int[] input) {
        int tiny = input[0];
        for (int i=0;i<input.length;i++){
            if (input[i]<tiny){
                tiny=input[i];
            }
        }
        return tiny;
    }

    private static int Largest(int[] input) {
        int lar = input[0];
        for (int i=0;i<input.length;i++){
            if (input[i]>lar){
                lar=input[i];
            }
        }
        return lar;
    }

}
