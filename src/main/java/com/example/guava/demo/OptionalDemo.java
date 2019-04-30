package com.example.guava.demo;

import com.google.common.base.Preconditions;

import java.util.Collections;
import java.util.Optional;
import java.util.Set;

public class OptionalDemo {

    public static void main(String[] args) {
        Set<Integer> integers = Optional.of(1).map(Collections::singleton).orElse(Collections.emptySet());
        int i = 10;
        Preconditions.checkArgument(i >= 0,"aaa");
    }
}
