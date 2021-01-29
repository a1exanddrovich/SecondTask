package com.epam.task.second.processor;

import com.epam.task.second.interfacesofprocessor.ArrayOfCharsProcessor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayOfCharsProcessorRemove implements ArrayOfCharsProcessor {

    private final static Logger LOGGER = LogManager.getLogger(ArrayOfCharsProcessorRemove.class);

    @Override
    public String process(String inputArrayStr, int inputLength) {

        LOGGER.info("Started removing inappropriate words...");

        int length = inputArrayStr.length();
        char[] outputArray = new char[length];
        char[] inputArray = inputArrayStr.toCharArray();
        int indexOfOutputArray = 0;
        int indexOfInputArray = 0;

        for(int i = 0; i < length;) {

            int j = i;
            i++;
            int wordLength = 0;

            while((inputArray[j] != ' ') && (inputArray[j] != '\n') && (j < length - 1)) {
                wordLength++;
                j++;
            }

            if(wordLength == inputLength) {

                j++;
                i = j;
                indexOfInputArray = i;
                continue;

            }

            while(inputArray[indexOfOutputArray] != ' ' ) {
                outputArray[indexOfOutputArray] = inputArray[indexOfInputArray];
                indexOfOutputArray++;
                indexOfInputArray++;
            }

            indexOfOutputArray++;
            indexOfInputArray++;
            j++;

            outputArray[indexOfOutputArray] = ' ';

            i = j;

        }

        LOGGER.info("Finished removing inappropriate words...");

        return outputArray.toString();

    }

}
