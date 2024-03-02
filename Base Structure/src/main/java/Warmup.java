public class Warmup {

    /**
     * Goal : Simple Introduction To Strings
     * In the first function, your inputs are a number and a sentence
     * @return is the number th word of the sentence
     */
    public String wordFinder(String sentence, int number)
    {
        String[] arraySentence = sentence.split(" ");
        //الان تو هر عنصر از ارایه به ترتیب کلمات وجود دارن
        int numberOfWords = arraySentence.length;

        if (number <= numberOfWords)
        {
            //System.out.println(arraySentence[number-1]);
            return arraySentence[number-1];
        }
        else
        {
            //System.out.println("number %d is out Of Bound",number);
            //System.out.print("number ");
            //System.out.print(number);
            //System.out.print(" is out Of Bound.");
            return " Number = " + number + " is out Of Bound";
        }
    }

    /**
     * Goal : Basic introduction to Strings & using foreach
     * @param number        is in String type
     * @param searchForEven is a boolean entry
     * @return if searchForEven is true ? return the number of even numbers : return the number of odd numbers
     */
    public int oddEvenCounter(String number, boolean searchForEven) {

        int num = Integer.parseInt(number);

        int n = num;
        int lengthOfNumber =0;
        while (n > 0)
        {
            n = n / 10;
            lengthOfNumber++;
        }

        int[] arrayHaveNumbers = new int[lengthOfNumber];
        n = num;
        int j = 0;
        while ( j < lengthOfNumber )
        {
            arrayHaveNumbers[j] = n%10;
            n = n/10;
            j++;
        }


        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0 ; i < lengthOfNumber ; i++)
        {
            if ( arrayHaveNumbers[i] % 2 == 0 )
            {
                evenCount++;
            }
            else
            {
                oddCount++;
            }
        }
        if ( searchForEven == true )
        {
            return evenCount;
        }
        else
        {
            return oddCount;
        }
    }

    /**
     * @param wordA --> first word
     * @param wordB --> second word
     * @return The word that is first in alphabet column
     */
    public String firstWord(String wordA, String wordB) {
        char[] wordAarray = wordA.toCharArray();
        char[] wordBarray = wordB.toCharArray();

        int lengthOfWordA = wordAarray.length;
        int lengthOfWordB = wordBarray.length;
        int lowerLength;
        if (lengthOfWordA < lengthOfWordB)
        {
            lowerLength = lengthOfWordA;
        }
        else
        {
            lowerLength = lengthOfWordB;
        }

        //int codeAsciA = wordAarray[0];
        //int codeAsciB = wordBarray[0];

        int codeAsciA = 0,codeAsciB = 0;

        for (int i = 0 ; i < lowerLength ; i++)
        {
            if (wordAarray[i]==wordBarray[i])
            {
                continue;
            }
            else
            {
                codeAsciA = wordAarray[i];
                codeAsciB = wordBarray[i];
                break;
            }
        }


        if (codeAsciA < codeAsciB)
        {
            return wordA;
        }
        else
        {
            return wordB;
        }
    }
}
