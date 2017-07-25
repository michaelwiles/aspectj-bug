package com.afrozaar.aspectj.test;

import java.util.function.Function;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class FailsApectJ {

    private <T> Function<String, Collection<String>> ASpectJFailWithWildCardAndVarArgeMethodReference() {
        Function<T, ? extends Object> x = a -> a; // the wild card fails the compile
        x.andThen(this::get);
        return null;
    }

    private <T> List<T> get(T... args) {
        return Arrays.asList(args);
    }

}
