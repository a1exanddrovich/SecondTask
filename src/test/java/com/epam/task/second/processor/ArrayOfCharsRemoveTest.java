package com.epam.task.second.processor;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOfCharsRemoveTest {

    @Test
    public void testShouldReturnArrayOfCharsWithRemovedWordsWhenThreeApplied() {

        //given
        ArrayOfCharsProcessorRemove remover = new ArrayOfCharsProcessorRemove();

        //when
        String actual = remover.process("he has ok", 3);

        //then
        Assert.assertEquals("he ok", actual);

    }

    @Test
    public void testShouldReturnArrayOfCharsWithRemovedWordsWhenFourApplied() {

        //given
        ArrayOfCharsProcessorRemove remover = new ArrayOfCharsProcessorRemove();

        //when
        String actual = remover.process("when he came everything has been ok", 4);

        //then
        Assert.assertEquals("he everything has been ok", actual);

    }

    @Test
    public void testShouldReturnArrayOfCharsWithRemovedWordsWhenNoConsonantLettersApplied() {

        //given
        ArrayOfCharsProcessorRemove remover = new ArrayOfCharsProcessorRemove();

        //when
        String actual = remover.process("array applied to be processed", 5);

        //then
        Assert.assertEquals("array applied to be processed", actual);

    }

}
