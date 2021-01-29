package com.epam.task.second.processor.factories;

import com.epam.task.second.interfacesofprocessor.ArrayOfCharsProcessor;
import com.epam.task.second.processor.ArrayOfCharsProcessorRemove;
import com.epam.task.second.processor.ArrayOfCharsProcessorReplace;

public class ActionFactoryArrayOfChars {

    public ArrayOfCharsProcessor doAction(Actions action) {

        switch (action) {

            case REMOVE:
                return new ArrayOfCharsProcessorRemove();

            case REPLACE:
                return new ArrayOfCharsProcessorReplace();

            default:
                throw  new IllegalArgumentException("Unknown action: " + action);
        }

    }

}
