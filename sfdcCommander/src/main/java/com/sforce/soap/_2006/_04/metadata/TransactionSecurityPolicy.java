/**
 * TransactionSecurityPolicy.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class TransactionSecurityPolicy  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.TransactionSecurityAction action;

    private boolean active;

    private java.lang.String apexClass;

    private java.lang.String description;

    private java.lang.String developerName;

    private com.sforce.soap._2006._04.metadata.MonitoredEvents eventType;

    private java.lang.String executionUser;

    private java.lang.String masterLabel;

    private java.lang.String resourceName;

    public TransactionSecurityPolicy() {
    }

    public TransactionSecurityPolicy(
           java.lang.String fullName,
           com.sforce.soap._2006._04.metadata.TransactionSecurityAction action,
           boolean active,
           java.lang.String apexClass,
           java.lang.String description,
           java.lang.String developerName,
           com.sforce.soap._2006._04.metadata.MonitoredEvents eventType,
           java.lang.String executionUser,
           java.lang.String masterLabel,
           java.lang.String resourceName) {
        super(
            fullName);
        this.action = action;
        this.active = active;
        this.apexClass = apexClass;
        this.description = description;
        this.developerName = developerName;
        this.eventType = eventType;
        this.executionUser = executionUser;
        this.masterLabel = masterLabel;
        this.resourceName = resourceName;
    }


    /**
     * Gets the action value for this TransactionSecurityPolicy.
     * 
     * @return action
     */
    public com.sforce.soap._2006._04.metadata.TransactionSecurityAction getAction() {
        return action;
    }


    /**
     * Sets the action value for this TransactionSecurityPolicy.
     * 
     * @param action
     */
    public void setAction(com.sforce.soap._2006._04.metadata.TransactionSecurityAction action) {
        this.action = action;
    }


    /**
     * Gets the active value for this TransactionSecurityPolicy.
     * 
     * @return active
     */
    public boolean isActive() {
        return active;
    }


    /**
     * Sets the active value for this TransactionSecurityPolicy.
     * 
     * @param active
     */
    public void setActive(boolean active) {
        this.active = active;
    }


    /**
     * Gets the apexClass value for this TransactionSecurityPolicy.
     * 
     * @return apexClass
     */
    public java.lang.String getApexClass() {
        return apexClass;
    }


    /**
     * Sets the apexClass value for this TransactionSecurityPolicy.
     * 
     * @param apexClass
     */
    public void setApexClass(java.lang.String apexClass) {
        this.apexClass = apexClass;
    }


    /**
     * Gets the description value for this TransactionSecurityPolicy.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this TransactionSecurityPolicy.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the developerName value for this TransactionSecurityPolicy.
     * 
     * @return developerName
     */
    public java.lang.String getDeveloperName() {
        return developerName;
    }


    /**
     * Sets the developerName value for this TransactionSecurityPolicy.
     * 
     * @param developerName
     */
    public void setDeveloperName(java.lang.String developerName) {
        this.developerName = developerName;
    }


    /**
     * Gets the eventType value for this TransactionSecurityPolicy.
     * 
     * @return eventType
     */
    public com.sforce.soap._2006._04.metadata.MonitoredEvents getEventType() {
        return eventType;
    }


    /**
     * Sets the eventType value for this TransactionSecurityPolicy.
     * 
     * @param eventType
     */
    public void setEventType(com.sforce.soap._2006._04.metadata.MonitoredEvents eventType) {
        this.eventType = eventType;
    }


    /**
     * Gets the executionUser value for this TransactionSecurityPolicy.
     * 
     * @return executionUser
     */
    public java.lang.String getExecutionUser() {
        return executionUser;
    }


    /**
     * Sets the executionUser value for this TransactionSecurityPolicy.
     * 
     * @param executionUser
     */
    public void setExecutionUser(java.lang.String executionUser) {
        this.executionUser = executionUser;
    }


    /**
     * Gets the masterLabel value for this TransactionSecurityPolicy.
     * 
     * @return masterLabel
     */
    public java.lang.String getMasterLabel() {
        return masterLabel;
    }


    /**
     * Sets the masterLabel value for this TransactionSecurityPolicy.
     * 
     * @param masterLabel
     */
    public void setMasterLabel(java.lang.String masterLabel) {
        this.masterLabel = masterLabel;
    }


    /**
     * Gets the resourceName value for this TransactionSecurityPolicy.
     * 
     * @return resourceName
     */
    public java.lang.String getResourceName() {
        return resourceName;
    }


    /**
     * Sets the resourceName value for this TransactionSecurityPolicy.
     * 
     * @param resourceName
     */
    public void setResourceName(java.lang.String resourceName) {
        this.resourceName = resourceName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransactionSecurityPolicy)) return false;
        TransactionSecurityPolicy other = (TransactionSecurityPolicy) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.action==null && other.getAction()==null) || 
             (this.action!=null &&
              this.action.equals(other.getAction()))) &&
            this.active == other.isActive() &&
            ((this.apexClass==null && other.getApexClass()==null) || 
             (this.apexClass!=null &&
              this.apexClass.equals(other.getApexClass()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.developerName==null && other.getDeveloperName()==null) || 
             (this.developerName!=null &&
              this.developerName.equals(other.getDeveloperName()))) &&
            ((this.eventType==null && other.getEventType()==null) || 
             (this.eventType!=null &&
              this.eventType.equals(other.getEventType()))) &&
            ((this.executionUser==null && other.getExecutionUser()==null) || 
             (this.executionUser!=null &&
              this.executionUser.equals(other.getExecutionUser()))) &&
            ((this.masterLabel==null && other.getMasterLabel()==null) || 
             (this.masterLabel!=null &&
              this.masterLabel.equals(other.getMasterLabel()))) &&
            ((this.resourceName==null && other.getResourceName()==null) || 
             (this.resourceName!=null &&
              this.resourceName.equals(other.getResourceName())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
        _hashCode += (isActive() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getApexClass() != null) {
            _hashCode += getApexClass().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDeveloperName() != null) {
            _hashCode += getDeveloperName().hashCode();
        }
        if (getEventType() != null) {
            _hashCode += getEventType().hashCode();
        }
        if (getExecutionUser() != null) {
            _hashCode += getExecutionUser().hashCode();
        }
        if (getMasterLabel() != null) {
            _hashCode += getMasterLabel().hashCode();
        }
        if (getResourceName() != null) {
            _hashCode += getResourceName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransactionSecurityPolicy.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "TransactionSecurityPolicy"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "action"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "TransactionSecurityAction"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("active");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apexClass");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "apexClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("developerName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "developerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "eventType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "MonitoredEvents"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("executionUser");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "executionUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("masterLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "masterLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourceName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "resourceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
