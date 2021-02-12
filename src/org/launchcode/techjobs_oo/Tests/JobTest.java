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

    @Test
    public void toStringLabels() {
        assertEquals('\n', test_job_1.toString().charAt(0));
        assertEquals('\n', test_job_1.toString().charAt(test_job_1.toString().length()-1));
    }

    @Test
    public void toStringValues() {
        assertEquals("\n" +
                "ID: " + test_job_3.getId() +
                "\nName: " + test_job_3.getName() +
                "\nEmployer " + test_job_3.getEmployer().getValue() +
                "\nLocation " + test_job_3.getLocation().getValue() +
                "\nPosition Type" + test_job_3.getPositionType().getValue() +
                "\nCore Competency " + test_job_3.getCoreCompetency().getValue() + "\n", test_job_3.toString());

    }

}
