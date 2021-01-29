package com.epam.task.second.processor;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOfCharsReplaceTest {

    @Test
    public void testShouldReturnStringWithRemovedWordsWhenNoConsonantLettersApplied() {

        //given
        ArrayOfCharsProcessorReplace replacer = new ArrayOfCharsProcessorReplace();

        //when
        String actual = replacer.process("input has been assigned", 4);

        //then
        Assert.assertEquals("inp$t has bee$ ass$gned", actual);

    }

}
