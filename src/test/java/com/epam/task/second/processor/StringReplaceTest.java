package com.epam.task.second.processor;

import org.junit.Assert;
import org.junit.Test;

public class StringReplaceTest {

    @Test
    public void testShouldReturnStringWithRemovedWordsWhenNoConsonantLettersApplied() {

        //given
        StringProcessorReplace replacer = new StringProcessorReplace();

        //when
        String actual = replacer.process("input has been assigned", 4);

        //then
        Assert.assertEquals("inp$t has bee$ ass$gned", actual);

    }

}
