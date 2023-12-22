package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> result = new LinkedList<>();
        List<Integer> dishes = new ArrayList<>();
        IntStream.rangeClosed(1, numberOfDishes).forEach(dishes::add);
        int index = 0;
        while (!dishes.isEmpty()) {
            index = (index + everyDishNumberToEat - 1) % dishes.size();
            result.add(dishes.remove(index));
        }
        return result;
    }
}
