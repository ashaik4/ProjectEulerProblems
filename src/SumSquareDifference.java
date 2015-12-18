/**
 * Created by arshadshaik on 12/17/15.
 * Project Euler Problem 6
 *
 *The sum of the squares of the first ten natural numbers is,
 *12 + 22 + ... + 102 = 385
 *The square of the sum of the first ten natural numbers is,
 *(1 + 2 + ... + 10)2 = 552 = 3025
 *Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
 *Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */
public class SumSquareDifference {
    public int sumOfSquares(){
        int sumOfSquares = 0;
        for (int i = 1; i<=100; ++i){

            sumOfSquares = sumOfSquares + i*i;

        }
        return sumOfSquares;

    }

    public int squareOfSum(){
        int squareOfSum = 0;
        for (int i = 1 ; i<=100;++i){
            squareOfSum = squareOfSum + i;

        }
        return squareOfSum*squareOfSum;
    }
    public static void main(String args[]){
        SumSquareDifference ssd = new SumSquareDifference();
        int difference = ssd.squareOfSum() - ssd.sumOfSquares();
        System.out.println(ssd.sumOfSquares());
        System.out.println(ssd.squareOfSum());
        System.out.println(difference);
    }
}
