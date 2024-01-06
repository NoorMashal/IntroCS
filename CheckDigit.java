public class CheckDigit {

    public static void main(String[] args)

    {

        int sum1=0, sum2=0;

        // Reading and storing a long integer in a long variable

        long number = Long.parseLong(args[0]);

        int count = 1;

        // Loop to find sum of alternate digits

        while(number>0)

        {

            // Finding the sum of every other digit starting with the last digit

            if(count%2!=0)

                sum1 += number%10;

            // Finding the sum of every other digit starting with the second to last digit

            else

                sum2 += number%10;

            // Removing the rightmost digit of the number because it has been added to one of the sums

            number /= 10;

            count++;

        }

        // Discarding the tens digit of both the sums

        sum1 %= 10;

        sum2 %= 10;

        // Multiplying the second number obtained by discarding the tens digit of the second sum by 3

        sum2 *= 3;

        // Again discarding the tens digit

        sum2 %= 10;

        // Adding both the numbers obtained

        int digit = sum1+sum2;

        // Again discarding the tens digit from the result

        digit %= 10;

        // Printing the result

        System.out.println(digit);

    }

}
