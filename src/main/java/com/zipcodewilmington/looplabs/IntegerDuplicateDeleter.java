package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {

    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
       String theString = "";
        for (int i = 0; i < array.length; i++) {
         int count = compareValues(i);

         if (count < maxNumberOfDuplications) {
             theString += array[i];

         }

        }
        return stringToIntegerArray(theString);
    }

    private Integer[] stringToIntegerArray(String theString) {
        String[] theStringArr = theString.split("");
        Integer[] theAnswer = new Integer[theStringArr.length];
        if (!theStringArr[0].equals("")) {
            for (int i = 0; i < theAnswer.length; i++) {
                theAnswer[i] = Integer.valueOf(theStringArr[i]);
            }
            return theAnswer;
        } else {
            return new Integer[0];
        }
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        String theString = "";
        for (int i = 0; i < array.length; i++) {
            int count = compareValues(i);

            if (count != exactNumberOfDuplications) {
                theString += array[i];

            }

        }
        return stringToIntegerArray(theString);
    }

}
