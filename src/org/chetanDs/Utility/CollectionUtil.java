package org.chetanDs.Utility;

/**
 * Created by chetan on 29/8/16.
 */
public class CollectionUtil {

    public static <S, T extends Iterable<S>> void printList(T list){
        for (Object element : list){
            System.out.println(element);
        }
    }
}
