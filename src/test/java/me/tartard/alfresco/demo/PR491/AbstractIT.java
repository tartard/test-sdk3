package me.tartard.alfresco.demo.PR491;

import org.alfresco.rad.test.AlfrescoTestRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertNotNull;

/**
 *
 * @author Alexandre Hausherr
 */
@RunWith(AlfrescoTestRunner.class)
public abstract class AbstractIT {

    @Test
    public void test() {
        Object object = getSomeObject();
        assertNotNull(object);
    }

    abstract Object getSomeObject();

}
