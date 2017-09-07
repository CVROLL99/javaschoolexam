package com.tsystems.javaschool.tasks.pyramid;

import java.util.List;

public class PyramidBuilder {

    /**
     * Builds a pyramid with sorted values (with minumum value at the top line and maximum at the bottom,
     * from left to right). All vacant positions in the array are zeros.
     *
     * @param inputNumbers to be used in the pyramid
     * @return 2d array with pyramid inside
     * @throws {@link CannotBuildPyramidException} if the pyramid cannot be build with given input
     */
    public int[][] buildPyramid(List<Integer> inputNumbers) {
        boolean flag;//Флаг для возможности/невозможности построения пирамиды

        System.out.println(inputNumbers);
        int size = inputNumbers.size();//Проверяем размер полученного массива

        //Проверим, является ли данное число треугольным
        int i = 0;int schet = 1;
        while(size > i){
           i=i+schet;
           schet++;
        }
        if(size==i) {
            flag = true;
        }else flag = false;

        //Выбрасываем исключение
        if(flag==false){
            throw new CannotBuildPyramidException();
        }


        return new int[0][0];
    }



}
