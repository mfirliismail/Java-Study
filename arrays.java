public class arrays {
    public static void main(String[] args) {
         int number = 10;

         int[] numbers = new int[5];
        //  int[] numbers = {15 , 20, 30, 5, 40};

         System.out.println(numbers[0]);
         numbers[0] = 15;
         numbers[1] = 10;
         numbers[2] = 20;
         numbers[3] = 40;
         numbers[4] = 4;

         System.out.println(numbers[0]);
         System.out.println(numbers[1]);
         System.out.println(numbers[2]);
         System.out.println(numbers[3]);
         System.out.println(numbers[4]);

         for(int i = 0; i < numbers.length; i++){
             System.out.println(numbers[i]);
         }


    }
}
