package com.epam.task.second.processor;

import org.junit.Assert;
import org.junit.Test;

public class StringRemoveTest {

        @Test
        public void testShouldReturnStringWithRemovedWordsWhenThreeApplied() {

            //given
            StringProcessorRemove remover = new StringProcessorRemove();

            //when
            String actual = remover.process("when he has been ok", 3);

            //then
            Assert.assertEquals("when he been ok", actual);

        }

        @Test
        public void testShouldReturnStringWithRemovedWordsWhenFourApplied() {

            //given
            StringProcessorRemove remover = new StringProcessorRemove();

            //when
            String actual = remover.process("when he came everything has been ok", 4);

            //then
            Assert.assertEquals("he everything has ok", actual);

        }

        @Test
        public void testShouldReturnStringWithRemovedWordsWhenNoConsonantLettersApplied() {

            //given
            StringProcessorRemove remover = new StringProcessorRemove();

            //when
            String actual = remover.process("array applied to be processed", 5);

            //then
            Assert.assertEquals("applied to be processed", actual);

        }

}
