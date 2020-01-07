
package com.cimc.senheyun.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="param0" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="param1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="param2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="param3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="param4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="param5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="param6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="param7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "param0",
    "param1",
    "param2",
    "param3",
    "param4",
    "param5",
    "param6",
    "param7"
})
@XmlRootElement(name = "ChartData")
public class ChartData {

    @XmlElementRef(name = "param0", namespace = "http://action.web.iot_data_service.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> param0;
    @XmlElementRef(name = "param1", namespace = "http://action.web.iot_data_service.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> param1;
    @XmlElementRef(name = "param2", namespace = "http://action.web.iot_data_service.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> param2;
    @XmlElementRef(name = "param3", namespace = "http://action.web.iot_data_service.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> param3;
    @XmlElementRef(name = "param4", namespace = "http://action.web.iot_data_service.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> param4;
    @XmlElementRef(name = "param5", namespace = "http://action.web.iot_data_service.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> param5;
    @XmlElementRef(name = "param6", namespace = "http://action.web.iot_data_service.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> param6;
    @XmlElementRef(name = "param7", namespace = "http://action.web.iot_data_service.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> param7;

    /**
     * ��ȡparam0���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParam0() {
        return param0;
    }

    /**
     * ����param0���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParam0(JAXBElement<String> value) {
        this.param0 = value;
    }

    /**
     * ��ȡparam1���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParam1() {
        return param1;
    }

    /**
     * ����param1���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParam1(JAXBElement<String> value) {
        this.param1 = value;
    }

    /**
     * ��ȡparam2���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParam2() {
        return param2;
    }

    /**
     * ����param2���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParam2(JAXBElement<String> value) {
        this.param2 = value;
    }

    /**
     * ��ȡparam3���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParam3() {
        return param3;
    }

    /**
     * ����param3���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParam3(JAXBElement<String> value) {
        this.param3 = value;
    }

    /**
     * ��ȡparam4���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParam4() {
        return param4;
    }

    /**
     * ����param4���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParam4(JAXBElement<String> value) {
        this.param4 = value;
    }

    /**
     * ��ȡparam5���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParam5() {
        return param5;
    }

    /**
     * ����param5���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParam5(JAXBElement<String> value) {
        this.param5 = value;
    }

    /**
     * ��ȡparam6���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParam6() {
        return param6;
    }

    /**
     * ����param6���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParam6(JAXBElement<String> value) {
        this.param6 = value;
    }

    /**
     * ��ȡparam7���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParam7() {
        return param7;
    }

    /**
     * ����param7���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParam7(JAXBElement<String> value) {
        this.param7 = value;
    }

}
