package jnw;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by freewind on 9/19/16.
 */
public class TryClass {
    Logger logger = LoggerFactory.getLogger(TryClass.class);

    @Test
    public void tryClass() {
        logger.info("Hello, world");
    }
}
