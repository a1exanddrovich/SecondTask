package com.epam.task.second.processor.factories;

import com.epam.task.second.interfacesofprocessor.StringProcessor;
import com.epam.task.second.processor.StringProcessorRemove;
import com.epam.task.second.processor.StringProcessorReplace;

public class ActionFactoryString {

    public StringProcessor doAction(Actions action) {

        switch (action) {

            case REMOVE:
                return new StringProcessorRemove();

            case REPLACE:
                return new StringProcessorReplace();

            default:
                throw  new IllegalArgumentException("Unknown action: " + action);
        }

    }

}
