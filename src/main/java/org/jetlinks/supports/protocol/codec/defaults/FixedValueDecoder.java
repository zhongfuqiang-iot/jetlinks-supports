package org.jetlinks.supports.protocol.codec.defaults;

import org.jetlinks.supports.protocol.codec.BinaryPartDecoder;

public class FixedValueDecoder<T> implements BinaryPartDecoder<T> {

    private final T fixed;

    public static <T> FixedValueDecoder<T> of(T fixed){
        return new FixedValueDecoder<>(fixed);
    }

    public FixedValueDecoder(T fixed) {
        this.fixed = fixed;
    }

    @Override
    public T decode(byte[] payload, int offset) {
        return fixed;
    }

}
