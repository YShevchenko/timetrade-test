package com.example.tt.util;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.BeanUtils;

public class BeanUtilHelper {

    public static void copyProperties(final Object destination, final Object source, final String exceptionMessage) {
        try {
            BeanUtils.copyProperties(destination, source);
        } catch (final IllegalAccessException | InvocationTargetException e) {
            throw new IllegalStateException(exceptionMessage, e);
        }
    }
}
