package com.travellazy;

/**
 * Created by will on 5/14/15.
 */
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class PhoneNumber {

    @XmlAttribute
    private String type;

    @XmlValue
    private String number;

    public PhoneNumber(String type, String number) {
        this.type = type;
        this.number = number;
    }

    public PhoneNumber(){}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PhoneNumber)) return false;

        PhoneNumber that = (PhoneNumber) o;

        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        return !(number != null ? !number.equals(that.number) : that.number != null);

    }

    @Override
    public int hashCode() {
        int result = type != null ? type.hashCode() : 0;
        result = 31 * result + (number != null ? number.hashCode() : 0);
        return result;
    }
}
