package com.epam.collections.queue;

import java.util.*;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {

        ArrayList<String> lowerCase = new ArrayList<>();
        ArrayList<String> upperCase = new ArrayList<>();

        String regExUp = "[A-Z]\\w*";

        for (String element : firstList){
            if(element.matches(regExUp)) {
                upperCase.add(element);
            } else {
                lowerCase.add(element);
            }

        }

        for (String element : secondList){
            if(element.matches(regExUp)) {
                upperCase.add(element);
            } else {
                lowerCase.add(element);
            }
        }

        lowerCase.sort(Collections.reverseOrder());
        Collections.sort(upperCase);

        PriorityQueue<String> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());

        for (String element : lowerCase){
            priorityQueue.offer(element);
        }

        for (String element : upperCase){
            priorityQueue.offer(element);
        }

        return priorityQueue;
    }
}
