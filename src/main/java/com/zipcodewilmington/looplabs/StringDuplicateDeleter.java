package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {


    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        String theAnswer = "";
        for (int i = 0; i < array.length; i++) {
            int count = compareValues(i);

            if (count < maxNumberOfDuplications) {
                theAnswer += array[i] + " ";
            }
        }
        String[] answer = theAnswer.split(" ");
        if("".equals(answer[0])) {
            return new String[0];
        } else {
            return answer;
        }
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
      String theAnswer = "";
        for (int i = 0; i < array.length; i++) {
            int count = compareValues(i);


            if (count != exactNumberOfDuplications) {
                theAnswer = theAnswer + array[i] + " ";

            }
        }
        String[] result = theAnswer.split(" ");

        return result;
    }

}