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
        List<Integer> requestedZones;// = Arrays.asList(2, 4, 5);
        /*final List<Zone> state1 = new ArrayList<>();
        state1.add(new Zone(1, Arrays.asList(2)));
        state1.add(new Zone(2, Collections.emptyList()));
        state1.add(new Zone(3, Arrays.asList(2)));
        state1.add(new Zone(4, Arrays.asList(2, 5)));
        state1.add(new Zone(5, Collections.emptyList()));
        System.out.println(checker.checkRoute(state1,requestedZones));*/


        requestedZones = Arrays.asList(1, 2, 4, 5, 7);
        final List<Zone> state6 = new ArrayList<>();
        state6.add(new Zone(1, Arrays.asList(2)));
        state6.add(new Zone(2, Arrays.asList(4)));
        state6.add(new Zone(3, Collections.emptyList()));
        state6.add(new Zone(4, Arrays.asList(5, 7)));
        state6.add(new Zone(5, Arrays.asList(7)));
        state6.add(new Zone(6, Collections.emptyList()));
        state6.add(new Zone(7, Collections.emptyList()));
        System.out.println(checker.checkRoute(state6,requestedZones));

    }

}
