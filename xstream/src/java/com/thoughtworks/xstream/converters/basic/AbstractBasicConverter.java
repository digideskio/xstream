package com.thoughtworks.xstream.converters.basic;

import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

public abstract class AbstractBasicConverter implements Converter {

    protected abstract Object fromString(String str);

    public abstract boolean canConvert(Class type);

    protected String toString(Object obj) {
        return obj.toString();
    }

    public void toXML(Object source, HierarchicalStreamWriter writer, MarshallingContext context) {
        writer.writeText(toString(source));
    }

    public Object fromXML(UnmarshallingContext context) {
        return fromString(context.xmlText());
    }

}
