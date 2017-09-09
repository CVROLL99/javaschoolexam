package com.tsystems.javaschool.tasks.zones;

import java.util.List;

public class RouteChecker {

    /**
     * Checks whether required zones are connected with each other.
     * By connected we mean that there is a path from any zone to any zone from the requested list.
     *
     * Each zone from initial state may contain a list of it's neighbours. The link is defined as unidirectional,
     * but can be used as bidirectional.
     * For instance, if zone A is connected with B either:
     *  - A has link to B
     *  - OR B has a link to A
     *  - OR both of them have a link to each other
     *
     * @param zoneState current list of all available zones
     * @param requestedZoneIds zone IDs from request
     * @return true of zones are connected, false otherwise
     */
    public boolean checkRoute(List<Zone> zoneState, List<Integer> requestedZoneIds){

        boolean can = true;
        int countOfSteps = requestedZoneIds.size();
        int countOfZone = 0;
        int actualZone;
        int nextZone;
        List<Integer> neigbours;
        List<Integer> neigbours2;

        if(requestedZoneIds.size()<=1){
            can = false;
        }

        while(can){
                while(countOfZone < countOfSteps-1) {
                actualZone = requestedZoneIds.get(countOfZone);
                neigbours = zoneState.get(actualZone - 1).getNeighbours();
                nextZone = requestedZoneIds.get(countOfZone + 1);
                neigbours2 = zoneState.get(nextZone - 1).getNeighbours();
                if (neigbours.contains(nextZone) || neigbours2.contains(actualZone)){
                    can = true;
                    countOfZone++;
                } else {
                    can = false;
                    break;
                }
            }
            if(countOfZone==countOfSteps-1){
                break;
            }

        }

        return can;
    }

}