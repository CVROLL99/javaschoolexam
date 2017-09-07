package com.tsystems.javaschool.tasks;

import com.tsystems.javaschool.tasks.pyramid.PyramidBuilder;

import java.util.Arrays;
import java.util.List;

public class MainForTest {

    public static void main(String args[]){

        PyramidBuilder pyramidBuilder = new PyramidBuilder();
        List<Integer> input = Arrays.asList(10, 15, 22,25);

        pyramidBuilder.buildPyramid(input);

    }

}
