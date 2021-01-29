package com.epam.task.second;

import com.epam.task.second.interfacesofprocessor.ArrayOfCharsProcessor;
import com.epam.task.second.interfacesofprocessor.StringProcessor;
import com.epam.task.second.processor.factories.ActionFactoryArrayOfChars;
import com.epam.task.second.processor.factories.ActionFactoryString;
import com.epam.task.second.processor.factories.Actions;

public class Manager {


    public String processArrayOfChars(String stringToBeProcessed,
                                      int inputK,
                                      Actions action) {

        ActionFactoryArrayOfChars factory = new ActionFactoryArrayOfChars();

        ArrayOfCharsProcessor processor = factory.doAction(action);

        String result = processor.process(stringToBeProcessed, inputK);

        return result;

    }

    public String processString(String stringToBeProcessed,
                                int inoutK,
                                Actions action) {

        ActionFactoryString factory = new ActionFactoryString();

        StringProcessor processor = factory.doAction(action);

        String result = processor.process(stringToBeProcessed, inoutK);

        return result;

    }


}
