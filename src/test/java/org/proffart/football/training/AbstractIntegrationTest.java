package org.proffart.football.training;

import org.junit.Ignore;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Author Artak Mnatsakanyan
 * Date 9/20/16
 * Time 9:10 AM
 */
@Ignore
@ContextConfiguration("classpath:integration-test-applicationContext.xml")
public abstract class AbstractIntegrationTest extends AbstractTransactionalJUnit4SpringContextTests {

    @PersistenceContext
    protected EntityManager entityManager;

    protected void flushAndClear() {
        entityManager.flush();
        entityManager.clear();
    }
}
