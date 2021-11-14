public class Application {
    
    public static void main(String[] args) {
        int number = 10;
        double aDouble = 9.5;
        String text = "Hii";
        String blank = " ";
        String moreText = "there";
        System.out.println(text + blank + moreText);
        String hiThere = text + blank + moreText;

        System.out.println("Hi" + " " + "there");
        System.out.println(text);
        System.out.println(number);

        System.out.println(hiThere);
        System.out.println("Mynumber is" + number + " ," + aDouble);
        whileLoop();
        forLoop();
        ifStatement();
    }

    public static void whileLoop(){
        int i = 0;

        while(i < 10){
            System.out.println(i);
            i++;
        }

        int number = 23;

        while(number < 34){
            System.out.println("Okay" + number );
            number+= 2;
        }
    }

    public static void forLoop(){
        for(int i  = 0 ; i < 5; i++) {
            System.out.printf("ini loop for :  %d\n", i);
        }
    }

    public static void ifStatement(){
        for(int i =1; i <= 15; i++){
            if( i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }else if(i % 3 == 0 && i % 5 != 0){
                System.out.println(("Fizz"));
            } else if(i % 3 != 0 && i % 5 == 0){
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
