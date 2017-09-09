package com.tsystems.javaschool.tasks;

import com.tsystems.javaschool.tasks.pyramid.PyramidBuilder;
import com.tsystems.javaschool.tasks.zones.RouteChecker;
import com.tsystems.javaschool.tasks.zones.Zone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainForTest {

    public static void main(String args[]){

        RouteChecker checker = new RouteChecker();
        List<Integer> requestedZones = Arrays.asList(1, 2, 3, 5);
        final List<Zone> state2 = new ArrayList<>();
        state2.add(new Zone(1, Arrays.asList(2)));
        state2.add(new Zone(2, Arrays.asList(3)));
        state2.add(new Zone(3, Arrays.asList(4)));
        state2.add(new Zone(4, Arrays.asList(5)));
        state2.add(new Zone(5, Arrays.asList(1)));
        System.out.println(checker.checkRoute(state2,requestedZones));




    }

}
