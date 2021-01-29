package com.epam.task.second.processor;

import com.epam.task.second.interfacesofprocessor.StringProcessor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class StringProcessorReplace implements StringProcessor {

    private final static Logger LOGGER = LogManager.getLogger(StringProcessorReplace.class);

    @Override
    public String process(String input, int k) {

        LOGGER.info("Started replacing with '$'...");

        List<String> stringList = new ArrayList<>();

        for(String part : input.split("\\s")) {
            stringList.add(part);
        }

        String output = new String();

        List<String> processedLine = new ArrayList<>();

        for(String part : stringList) {
            if(part.length() < k) {
                processedLine.add(part);
                continue;
            }
            processedLine.add(part.replace(part.charAt(k - 1), '$'));
        }

        for(String part : processedLine) {
            output += part;
            output += ' ';
        }

        LOGGER.info("Finished replacing with '$'...");

        return output.trim();


    }

}
