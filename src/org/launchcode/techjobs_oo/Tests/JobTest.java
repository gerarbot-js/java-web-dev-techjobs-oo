package org.launchcode.techjobs_oo.Tests;


import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {

    Job test_job_1;
    Job test_job_2;
    Job test_job_3;
    Job test_job_4;

    @Before
    public void createNewJob() {
        test_job_1 = new Job();
        test_job_2 = new Job();
        test_job_3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        test_job_4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    }

    @Test
    public void testSettingJobId() {
        assertFalse(test_job_1.getId() == test_job_2.getId());

        assertTrue(test_job_2.getId() - test_job_1.getId() == 1);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        assertEquals(3, test_job_3.getId());
        assertEquals("Product tester", test_job_3.getName());
        assertEquals("ACME", test_job_3.getEmployer().getValue());
        assertEquals("Desert", test_job_3.getLocation().getValue());
        assertEquals("Quality control", test_job_3.getPositionType().getValue());
        assertEquals("Persistence", test_job_3.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality() {
        assertFalse(test_job_3.getId() == test_job_4.getId());
    }

}
