package org.sg.collection;

import java.util.List;
import java.util.Set;

public class SetAndListCompare {

    static void main() {
        Set<String> set = Set.of("a", "b");
        System.out.println(set.contains("a"));

        List<String> list = List.of("a", "b");
        System.out.println(list.contains("a"));
    }
}
