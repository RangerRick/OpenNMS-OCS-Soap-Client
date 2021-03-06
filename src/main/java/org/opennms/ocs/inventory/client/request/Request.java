//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.06.16 at 07:05:26 PM EEST 
//


package org.opennms.ocs.inventory.client.request;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "_engine",
    "_begin",
    "_askingfor",
    "_checksum",
    "_offset",
    "_wanted",
    "_id",
    "_tag",
    "_userId"
})
@XmlRootElement(name = "REQUEST")
public class Request {
    
    @XmlElement(name = "ENGINE", required = true)
    protected Engine _engine;
    @XmlElement(name = "BEGIN", required = true)
    protected Begin _begin;
    @XmlElement(name = "ASKING_FOR", required = true)
    protected String _askingfor;
    @XmlElement(name = "CHECKSUM", required = true)
    protected String _checksum;
    @XmlElement(name = "WANTED", required = true)
    protected String _wanted;
    @XmlElement(name = "OFFSET", required = true)
    protected String _offset;
    @XmlElement(name = "ID")
    protected List<Id> _id;
    @XmlElement(name = "TAG")
    protected List<Tag> _tag;
    @XmlElement(name = "USERID")
    protected List<UserId> _userId;

    /**
     * Gets the value of the _begin property.
     * 
     * @return
     *     possible object is
     *     {@link _begin }
     *     
     */
    public Begin getBegin() {
        return _begin;
    }

    /**
     * Sets the value of the _begin property.
     * 
     * @param value
     *     allowed object is
     *     {@link _begin }
     *     
     */
    public void setBegin(Begin value) {
        this._begin = value;
    }

    /**
     * Gets the value of the _askingfor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAskingfor() {
        return _askingfor;
    }

    /**
     * Sets the value of the _askingfor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAskingfor(String value) {
        this._askingfor = value;
    }

    /**
     * Gets the value of the _checksum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChecksum() {
        return _checksum;
    }

    /**
     * Sets the value of the _checksum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChecksum(String value) {
        this._checksum = value;
    }

    /**
     * Gets the value of the _wanted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWanted() {
        return _wanted;
    }

    /**
     * Sets the value of the _wanted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWanted(String value) {
        this._wanted = value;
    }

    /**
     * Gets the value of the _id property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present ins_ide the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the _id property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Id }
     * 
     * 
     */
    public List<Id> getId() {
        if (_id == null) {
            _id = new ArrayList<Id>();
        }
        return this._id;
    }

    /**
     * Gets the value of the _tag property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present ins_ide the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the _tag property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTag().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tag }
     * 
     * 
     */
    public List<Tag> getTag() {
        if (_tag == null) {
            _tag = new ArrayList<Tag>();
        }
        return this._tag;
    }

    /**
     * Gets the value of the _userId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present ins_ide the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the _userId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUSERId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link USERId }
     * 
     * 
     */
    public List<UserId> getUserId() {
        if (_userId == null) {
            _userId = new ArrayList<UserId>();
        }
        return this._userId;
    }

    public Engine getEngine() {
        return _engine;
    }

    public void setEngine(Engine _engine) {
        this._engine = _engine;
    }

    public String getOffset() {
        return _offset;
    }

    public void setOffset(String _offset) {
        this._offset = _offset;
    }

    @Override
    public String toString() {
        return "Request [_engine=" + _engine + ", _begin=" + _begin
                + ", _askingfor=" + _askingfor + ", _checksum=" + _checksum
                + ", _wanted=" + _wanted + ", _offset=" + _offset + ", _id="
                + _id + ", _tag=" + _tag + ", _userId=" + _userId + "]";
    }

//    public void addId(String requestedId) {
//        Id id = new Id();
//        id.setValue(requestedId);
//        if(_id != null) {
//            _id.add(id);
//        } else {
//            _id = new ArrayList<Id>();
//            _id.add(id);
//        }
//    }
}
