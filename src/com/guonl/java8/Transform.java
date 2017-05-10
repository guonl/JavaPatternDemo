package com.guonl.java8;

/**
 * 函数式接口
 * @param <A>
 * @param <B>
 */
@FunctionalInterface
interface Transform<A,B>{
    B transform(A a);
}
