/**
 * ReportChartSize.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class ReportChartSize implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ReportChartSize(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Tiny = "Tiny";
    public static final java.lang.String _Small = "Small";
    public static final java.lang.String _Medium = "Medium";
    public static final java.lang.String _Large = "Large";
    public static final java.lang.String _Huge = "Huge";
    public static final ReportChartSize Tiny = new ReportChartSize(_Tiny);
    public static final ReportChartSize Small = new ReportChartSize(_Small);
    public static final ReportChartSize Medium = new ReportChartSize(_Medium);
    public static final ReportChartSize Large = new ReportChartSize(_Large);
    public static final ReportChartSize Huge = new ReportChartSize(_Huge);
    public java.lang.String getValue() { return _value_;}
    public static ReportChartSize fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ReportChartSize enumeration = (ReportChartSize)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ReportChartSize fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReportChartSize.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ReportChartSize"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
