package com.example.medifizer.baseClass;

import org.apache.commons.lang3.SerializationUtils;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.io.Serial;
import java.io.Serializable;

public class BaseWSEntity implements Serializable,Cloneable {
    @Serial
    private static final long serialVersionUID = 8605141415661568046L;

    /*
 Serialization Based Clone may be slow so use it wisely
  */
    @Override
    public Object clone() {
        return SerializationUtils.clone(this);
    }

    @Override
    public int hashCode() {
        if(getExcludedFields()==null){
            return HashCodeBuilder.reflectionHashCode(this, false);
        }else {
            return HashCodeBuilder.reflectionHashCode(this, getExcludedFields());
        }
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    protected String[] getExcludedFields(){return null;};


}
