package com.epam.task.second.processor;

import com.epam.task.second.interfacesofprocessor.StringProcessor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class StringProcessorRemove implements StringProcessor {

    private final static Logger LOGGER = LogManager.getLogger(StringProcessorRemove.class);

    @Override
    public String process(String input, int inputLength) {

        LOGGER.info("Started removing...");

        List<String> stringList = new ArrayList<>();

        for(String part : input.split("\\s")) {
            stringList.add(part);
        }

        String output = new String();

        for(String part : stringList) {
            if(part.length() != inputLength) {
                output += part;
                output += ' ';
            }
        }

        LOGGER.info("Finished removing...");

        return output.trim();

    }

}
