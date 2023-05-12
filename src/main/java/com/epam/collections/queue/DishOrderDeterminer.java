package com.epam.collections.queue;


import java.util.ArrayList;
import java.util.List;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {

        List<Integer> list = new ArrayList<>();
        List<Integer> secondList = new ArrayList<>();

        for(int i = 1; i <= numberOfDishes; i++){
            secondList.add(i);
        }

        int i = everyDishNumberToEat;
        int s = 0;

//        while(list.size() != numberOfDishes){
//            if(i > 0 && i <= numberOfDishes){
//                while()
//                if(secondList.get(i - 1) != 0 && s == 0){
//                    list.add(secondList.get(i-1));
//                }
//            } else {
//               i = everyDishNumberToEat - (numberOfDishes - (i - everyDishNumberToEat));
//               continue;
//            }
//            i += everyDishNumberToEat;
//        }
        while(list.size() != numberOfDishes){
            if(s == 0 && secondList.get(i - 1) != 0){
                list.add(secondList.get(i - 1));
                secondList.set(i - 1, 0);
                s = everyDishNumberToEat - 1;
                ++i;
                if(i > numberOfDishes){
                    i = everyDishNumberToEat - (numberOfDishes - (i - everyDishNumberToEat));
                }
            } else if(s == 0 && secondList.get(i - 1) == 0) {
                i += 1;
                if(i > numberOfDishes){
                    i = everyDishNumberToEat - (numberOfDishes - (i - everyDishNumberToEat));
                }
            } else {
                if(secondList.get(i - 1) != 0){
                    s -= 1;
                }
                i += 1;
                if(i > numberOfDishes){
                    i = everyDishNumberToEat - (numberOfDishes - (i - everyDishNumberToEat));
                }
            }
        }
        return list;
    }
}
