package com.afrozaar.aspectj.test;

import java.util.function.Function;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class PassAspectJ {

    private <T> Function<String, Collection<String>> noWildCardWithVarArgsMethodReference() {
        Function<T, Object> x = a -> a; // no wild card - passes
        x.andThen(this::get);
        return null;
    }

    private <T> List<T> get(T... args) {
        return Arrays.asList(args);
    }

    private <T> Function<String, Collection<String>> wildCardWithVarArgsNoMethodReference() {
        Function<T, ? extends Object> x = a -> a; // no wild card - passes
        x.andThen(t -> get(t));
        return null;
    }

}
