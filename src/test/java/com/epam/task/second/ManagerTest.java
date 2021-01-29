package com.epam.task.second;

import com.epam.task.second.processor.factories.Actions;
import org.junit.Assert;
import org.junit.Test;

public class ManagerTest {

    @Test
    public void processTestReplaceString() {

        Manager manager = new Manager();

        String actual = manager.processString("Have been done", 4, Actions.REPLACE);

        Assert.assertEquals("Hav$ bee$ don$", actual);

    }

    @Test
    public void processTestRemoveString() {

        Manager manager = new Manager();

        String actual = manager.processString("Have been visited", 4, Actions.REMOVE);

        Assert.assertEquals("visited", actual);

    }

    @Test
    public void processTestRemoveArrayOfChars() {

        Manager manager = new Manager();

        String actual = manager.processArrayOfChars("Have been visited", 4, Actions.REPLACE);

        Assert.assertEquals("Hav$ bee$ vis$ted", actual);

    }

}
