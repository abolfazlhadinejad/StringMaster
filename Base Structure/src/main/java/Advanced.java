import java.util.Objects;

public class Advanced {

    /**
     * Goal : Changing a Sentence Content
     * <p>
     * In this function, you have a sentence, a word & a newWord as Entry
     * You have to search the sentence to find the word that you were given as input and change it with the newWord
     */
    public String wordCensor(String sentence, String word, String newWord) {
        String[] arraySentence = sentence.split(" ");
        int numberOfWords = arraySentence.length;

        for (int i = 0; i < numberOfWords; i++) {
            if (arraySentence[i].equals(word)) {
                arraySentence[i] = newWord;
            }
        }

        String finalWord = "";
        for (int j = 0; j < numberOfWords; j++)
        {
            if (j == numberOfWords - 1)
            {
                finalWord = finalWord + arraySentence[j];
            }
            else
            {
                finalWord = finalWord + arraySentence[j] + " ";
            }

        }
        //finalWord = finalWord - " ";  error
        return finalWord;
    }

    /**
     * In this function You have a firstName and a lastName as Entry and you have to normalize them as a fullName
     *
     * @param firstName is a first name with irregular letters (example : hARry)
     * @param lastName  is a last name with irregular letters (example : pOtTeR)
     * @return fullName is a normal full name that just the first letter of firstName & lastName is Capitalized (example : Harry Potter)
     */
    public String normalizingName(String firstName, String lastName)
    {
        char[] arrayFirstName = firstName.toCharArray();
        char[] arrayLastName = lastName.toCharArray();

        int lengthOfFirstName = arrayFirstName.length;
        int lengthOfLastName = arrayLastName.length;
        /*
        اگر بازه کد اسکی کاراکتر بین 65 تا 90 بود یعنی حروف بزرگ است و باید به حروف کوچک تبدیل شود پس بعلاوه 32 میکنیم
        اگر در بازه 97  تا 122 بود یعنی حروف کوچک است و باید به حروف بزرگ تبدیل شود پس منهای 32 میکنی
         */
        if ( arrayFirstName[0] >= 97 && arrayFirstName[0] <= 122 )
        {
            arrayFirstName[0] = (char) (arrayFirstName[0] - 32);
            //arrayFirstName[0] = Character.toUpperCase(arrayFirstName[0]);
        }

        if ( arrayLastName[0] >= 97 && arrayLastName[0] <= 122 )
        {
           //arrayLastName[0] = (char) (arrayLastName[0] - 32);
           arrayLastName[0] = Character.toUpperCase(arrayLastName[0]);
        }

        for (int i = 1 ; i < lengthOfFirstName ; i++)
        {
            if (arrayFirstName[i] >= 65 && arrayFirstName[i] <= 90)
            {
                arrayFirstName[i] = (char) (arrayFirstName[i] + 32);
            }
        }

        for (int i = 1 ; i < lengthOfLastName ; i++)
        {
            if (arrayLastName[i] >= 65 && arrayLastName[i] <= 90)
            {
                arrayLastName[i] = Character.toLowerCase(arrayLastName[i]);
                //arrayLastName[i] = (char) (arrayLastName[i] + 32);
            }
        }



        String finalWord = "";
        for (int j = 0; j < lengthOfFirstName; j++)
        {
                finalWord = finalWord + arrayFirstName[j];
        }

        if (lastName != " ")
        {
            finalWord = finalWord + " ";
        }

        if (lastName != " ")
        {
            for (int j = 0; j < lengthOfLastName; j++)
            {
                finalWord = finalWord + arrayLastName[j];

            }
        }

        return finalWord;
    }

    /**
     * Removing repeated letter in a word
     *
     * @param word This input could have Consecutive repeated letters or not
     * @return if word contains Consecutive repeated letters, one of the repeated letters should be omitted
     */
    public String doubleChar(String word)
    {
        String[] arraySentence = word.split("");
        int lengthOfArray = arraySentence.length;
        for (int i = 1; i < lengthOfArray; i++) {
            if (Objects.equals(arraySentence[i], arraySentence[i - 1])) {
                arraySentence[i - 1] = "";
            }
        }

        String finalSentence = "";
        for (int i = 0; i < lengthOfArray; i++) {
            finalSentence += arraySentence[i];
        }
        return finalSentence;
    }
}

