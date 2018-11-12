package com.robinsm.interview;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class DefaultInterviewServiceTest {

    InterviewService interviewService = new DefaultInterviewService();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getAll() {
        final InterviewData data = interviewService.create(new CreateInterviewRequest());

        interviewService.getAll();

    }

    @Test
    public void create() {
    }

    @Test
    public void getOne() {
    }

    @Test
    public void delete() {
    }

    @Test
    public void update() {
    }
}