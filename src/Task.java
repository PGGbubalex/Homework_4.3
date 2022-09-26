public class Task {
    public static void main(String[] args) {

        int one = 4;
        int two = 2;
        int three = 3;

        boolean oneBigger = one>two && one>three;
        boolean twoBigger = two>one && two>three;
        boolean threeBigger = three>one && three>two;
        boolean oneSameTwo = one == two;
        boolean oneSameThree = one == three;
        boolean twoSameThree = two == three;

        if (oneBigger){
            System.out.println(one + " наибольшее число");
        }
        else if (twoBigger){
            System.out.println(two + " наибольшее число");
        }
        else if (threeBigger){
            System.out.println(three + " наибольшее число");
        }

        else if(one==two && two==three){
            System.out.println("Числа равны");
        }

        else if(oneSameTwo){
            System.out.println("Числа " + one + " и " + two + " равны");
        }
        else if(oneSameThree){
            System.out.println("Числа " + one + " и " + three + " равны");
        }
        else if(twoSameThree){
            System.out.println("Числа " + three + " и " + two + " равны");
        }


    }
}
