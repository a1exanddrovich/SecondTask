package com.epam.task.second.processor;

import com.epam.task.second.interfacesofprocessor.ArrayOfCharsProcessor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class ArrayOfCharsProcessorReplace implements ArrayOfCharsProcessor {

    private final static Logger LOGGER = LogManager.getLogger(ArrayOfCharsProcessorReplace.class);

    @Override
    public String process(String input, int k) {

        LOGGER.info("Started replacing with '$'...");

        List<String> inputList = new ArrayList<>();
        List<String> outputList = new ArrayList<>();

        for(String part : input.split("\\s")) {
            inputList.add(part);
        }

        for(int i = 0; i < inputList.size(); i++) {

            String element = inputList.get(i);

            char[] charElement = element.toCharArray();

            if(charElement.length < k) {
                outputList.add(element);
                continue;
            } else {
                charElement[k - 1] = '$';
                String temp = new String(charElement);
                outputList.add(temp);
            }

        }

        String output = new String();

        for(String part : outputList) {

            output += part;
            output += ' ';

        }

        LOGGER.info("Finished replacing with '$'...");

        return output.trim();

    }

}
