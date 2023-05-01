package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.example.sort.BubbleSort.bubbleSort;


public class BubbleSortTest {

    @Test
    void testBubbleSortwithDuplicate(){
        int[] arr = {38,7,34,95,1,60,63,85,35,60};
        bubbleSort(arr);
        int[] expected = {1,7,34,35,38,60,60,63,85,95};
        assertThat(arr).containsExactly(expected);
        //Arrays.stream(arr).forEach(i -> System.out.print(i+","));
    }

    @Test
    void testBubbleSortwithNull(){
        int[] arr= {};
        bubbleSort(arr);
        int[] expected = {};
        assertThat(arr).containsExactly(expected);
    }
}
