package com.example.teacherapp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;

import javax.annotation.Nullable;

public class Testing {
    private dateConversion eventRecyclerAdapter;


    private SummaryCalculation attendance;


    @BeforeEach
    public void setUp() {

        attendance = new SummaryCalculation();

    }

    //IT20188054
    @Test
    public void summaryCalculation_isCorrect() {

        Object ob = 100L;  //Value retrieve  from the database  {Use object datatype since retrieve value from DB must be object}

        long result = attendance.calculateSummary(ob, 20);

        Assert.assertEquals(120, result);
    }
}

