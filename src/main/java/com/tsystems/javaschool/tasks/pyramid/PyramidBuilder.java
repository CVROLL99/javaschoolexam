package com.tsystems.javaschool.tasks.pyramid;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PyramidBuilder {

    /**
     * Builds a pyramid with sorted values (with minumum value at the top line and maximum at the bottom,
     * from left to right). All vacant positions in the array are zeros.
     *
     * @param inputNumbers to be used in the pyramid
     * @return 2d array with pyramid inside
     * @throws {@link CannotBuildPyramidException} if the pyramid cannot be build with given input
     */
    public int[][] buildPyramid(List<Integer> inputNumbers) throws CannotBuildPyramidException {
        boolean flag = false;
        int[][] matrix;
        int size = inputNumbers.size();
        int count = 0;
        int rows = 1;
        int cols = 1;

        while (count < size) {
            count += rows;
            rows++;
            cols += 2;
        }
        rows = rows - 1;
        cols = cols - 2;

        if (size == count) {
            flag = true;
        }

        count = 0;
        while (count < size) {
            if (inputNumbers.get(count) != null) {
                flag = true;
            }
            count++;
        }
        try {
            if (flag) {
                List<Integer> sorted = inputNumbers.stream().sorted().collect(Collectors.toList());

                matrix = new int[rows][cols];

                int middle = cols / 2;
                int sortedIndex = 0;
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j <= i; j++) {
                        matrix[i][middle - i + j * 2] = sorted.get(sortedIndex++);
                    }
                }

                for (int[] a : matrix)
                {
                    for (int b : a)
                        System.out.print(b + "   ");
                    System.out.println();
                }
            }else throw new CannotBuildPyramidException();

        } catch (Exception e) {
            throw new CannotBuildPyramidException();
        }

        return matrix;
    }

}
