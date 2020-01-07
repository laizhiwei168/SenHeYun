
package com.cimc.senheyun.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.iot_data_service.web.action package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddchannelLimitParam1_QNAME = new QName("http://action.web.iot_data_service.com", "param1");
    private final static QName _AddchannelLimitParam2_QNAME = new QName("http://action.web.iot_data_service.com", "param2");
    private final static QName _AddchannelLimitParam0_QNAME = new QName("http://action.web.iot_data_service.com", "param0");
    private final static QName _SendCommandParam5_QNAME = new QName("http://action.web.iot_data_service.com", "param5");
    private final static QName _GatewayHistoryParam3_QNAME = new QName("http://action.web.iot_data_service.com", "param3");
    private final static QName _GatewayHistoryParam4_QNAME = new QName("http://action.web.iot_data_service.com", "param4");
    private final static QName _ChartDataResponseReturn_QNAME = new QName("http://action.web.iot_data_service.com", "return");
    private final static QName _ChartDataParam7_QNAME = new QName("http://action.web.iot_data_service.com", "param7");
    private final static QName _ChartDataParam6_QNAME = new QName("http://action.web.iot_data_service.com", "param6");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.iot_data_service.web.action
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GatewayData }
     * 
     */
    public GatewayData createGatewayData() {
        return new GatewayData();
    }

    /**
     * Create an instance of {@link AddchannelLimitResponse }
     * 
     */
    public AddchannelLimitResponse createAddchannelLimitResponse() {
        return new AddchannelLimitResponse();
    }

    /**
     * Create an instance of {@link AddGatewayResponse }
     * 
     */
    public AddGatewayResponse createAddGatewayResponse() {
        return new AddGatewayResponse();
    }

    /**
     * Create an instance of {@link DeletechannelLimit }
     * 
     */
    public DeletechannelLimit createDeletechannelLimit() {
        return new DeletechannelLimit();
    }

    /**
     * Create an instance of {@link GatewayHistory2 }
     * 
     */
    public GatewayHistory2 createGatewayHistory2() {
        return new GatewayHistory2();
    }

    /**
     * Create an instance of {@link GatewayHistory }
     * 
     */
    public GatewayHistory createGatewayHistory() {
        return new GatewayHistory();
    }

    /**
     * Create an instance of {@link DeleteGatewayResponse }
     * 
     */
    public DeleteGatewayResponse createDeleteGatewayResponse() {
        return new DeleteGatewayResponse();
    }

    /**
     * Create an instance of {@link GatewayList }
     * 
     */
    public GatewayList createGatewayList() {
        return new GatewayList();
    }

    /**
     * Create an instance of {@link DeletechannelLimitResponse }
     * 
     */
    public DeletechannelLimitResponse createDeletechannelLimitResponse() {
        return new DeletechannelLimitResponse();
    }

    /**
     * Create an instance of {@link SendCommand }
     * 
     */
    public SendCommand createSendCommand() {
        return new SendCommand();
    }

    /**
     * Create an instance of {@link SendCommandResponse }
     * 
     */
    public SendCommandResponse createSendCommandResponse() {
        return new SendCommandResponse();
    }

    /**
     * Create an instance of {@link AddGateway }
     * 
     */
    public AddGateway createAddGateway() {
        return new AddGateway();
    }

    /**
     * Create an instance of {@link AddchannelLimit }
     * 
     */
    public AddchannelLimit createAddchannelLimit() {
        return new AddchannelLimit();
    }

    /**
     * Create an instance of {@link FindAlert }
     * 
     */
    public FindAlert createFindAlert() {
        return new FindAlert();
    }

    /**
     * Create an instance of {@link FindChannelLimitResponse }
     * 
     */
    public FindChannelLimitResponse createFindChannelLimitResponse() {
        return new FindChannelLimitResponse();
    }

    /**
     * Create an instance of {@link DeleteGateway }
     * 
     */
    public DeleteGateway createDeleteGateway() {
        return new DeleteGateway();
    }

    /**
     * Create an instance of {@link GatewayListResponse }
     * 
     */
    public GatewayListResponse createGatewayListResponse() {
        return new GatewayListResponse();
    }

    /**
     * Create an instance of {@link GatewayHistory2Response }
     * 
     */
    public GatewayHistory2Response createGatewayHistory2Response() {
        return new GatewayHistory2Response();
    }

    /**
     * Create an instance of {@link FindAlertResponse }
     * 
     */
    public FindAlertResponse createFindAlertResponse() {
        return new FindAlertResponse();
    }

    /**
     * Create an instance of {@link ChkSensorStateResponse }
     * 
     */
    public ChkSensorStateResponse createChkSensorStateResponse() {
        return new ChkSensorStateResponse();
    }

    /**
     * Create an instance of {@link ChartData }
     * 
     */
    public ChartData createChartData() {
        return new ChartData();
    }

    /**
     * Create an instance of {@link ChkSensorState }
     * 
     */
    public ChkSensorState createChkSensorState() {
        return new ChkSensorState();
    }

    /**
     * Create an instance of {@link UpdatechannelLimit }
     * 
     */
    public UpdatechannelLimit createUpdatechannelLimit() {
        return new UpdatechannelLimit();
    }

    /**
     * Create an instance of {@link CtrlChannelResponse }
     * 
     */
    public CtrlChannelResponse createCtrlChannelResponse() {
        return new CtrlChannelResponse();
    }

    /**
     * Create an instance of {@link UpdatechannelLimitResponse }
     * 
     */
    public UpdatechannelLimitResponse createUpdatechannelLimitResponse() {
        return new UpdatechannelLimitResponse();
    }

    /**
     * Create an instance of {@link UpdateGatewayResponse }
     * 
     */
    public UpdateGatewayResponse createUpdateGatewayResponse() {
        return new UpdateGatewayResponse();
    }

    /**
     * Create an instance of {@link CtrlChannel }
     * 
     */
    public CtrlChannel createCtrlChannel() {
        return new CtrlChannel();
    }

    /**
     * Create an instance of {@link FindChannelLimit }
     * 
     */
    public FindChannelLimit createFindChannelLimit() {
        return new FindChannelLimit();
    }

    /**
     * Create an instance of {@link GatewayDataResponse }
     * 
     */
    public GatewayDataResponse createGatewayDataResponse() {
        return new GatewayDataResponse();
    }

    /**
     * Create an instance of {@link ChartDataResponse }
     * 
     */
    public ChartDataResponse createChartDataResponse() {
        return new ChartDataResponse();
    }

    /**
     * Create an instance of {@link CurAllData }
     * 
     */
    public CurAllData createCurAllData() {
        return new CurAllData();
    }

    /**
     * Create an instance of {@link UpdateGateway }
     * 
     */
    public UpdateGateway createUpdateGateway() {
        return new UpdateGateway();
    }

    /**
     * Create an instance of {@link GatewayHistoryResponse }
     * 
     */
    public GatewayHistoryResponse createGatewayHistoryResponse() {
        return new GatewayHistoryResponse();
    }

    /**
     * Create an instance of {@link CurAllDataResponse }
     * 
     */
    public CurAllDataResponse createCurAllDataResponse() {
        return new CurAllDataResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://action.web.iot_data_service.com", name = "param1", scope = AddchannelLimit.class)
    public JAXBElement<String> createAddchannelLimitParam1(String value) {
        return new JAXBElement<String>(_AddchannelLimitParam1_QNAME, String.class, AddchannelLimit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://action.web.iot_data_service.com", name = "param2", scope = AddchannelLimit.class)
    public JAXBElement<String> createAddchannelLimitParam2(String value) {
        return new JAXBElement<String>(_AddchannelLimitParam2_QNAME, String.class, AddchannelLimit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://action.web.iot_data_service.com", name = "param0", scope = AddchannelLimit.class)
    public JAXBElement<String> createAddchannelLimitParam0(String value) {
        return new JAXBElement<String>(_AddchannelLimitParam0_QNAME, String.class, AddchannelLimit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://action.web.iot_data_service.com", name = "param1", scope = DeleteGateway.class)
    public JAXBElement<String> createDeleteGatewayParam1(String value) {
        return new JAXBElement<String>(_AddchannelLimitParam1_QNAME, String.class, DeleteGateway.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://action.web.iot_data_service.com", name = "param2", scope = DeleteGateway.class)
    public JAXBElement<String> createDeleteGatewayParam2(String value) {
        return new JAXBElement<String>(_AddchannelLimitParam2_QNAME, String.class, DeleteGateway.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://action.web.iot_data_service.com", name = "param0", scope = DeleteGateway.class)
    public JAXBElement<String> createDeleteGatewayParam0(String value) {
        return new JAXBElement<String>(_AddchannelLimitParam0_QNAME, String.class, DeleteGateway.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://action.web.iot_data_service.com", name = "param1", scope = SendCommand.class)
    public JAXBElement<String> createSendCommandParam1(String value) {
        return new JAXBElement<String>(_AddchannelLimitParam1_QNAME, String.class, SendCommand.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://action.web.iot_data_service.com", name = "param2", scope = SendCommand.class)
    public JAXBElement<String> createSendCommandParam2(String value) {
        return new JAXBElement<String>(_AddchannelLimitParam2_QNAME, String.class, SendCommand.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://action.web.iot_data_service.com", name = "param0", scope = SendCommand.class)
    public JAXBElement<String> createSendCommandParam0(String value) {
        return new JAXBElement<String>(_AddchannelLimitParam0_QNAME, String.class, SendCommand.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://action.web.iot_data_service.com", name = "param5", scope = SendCommand.class)
    public JAXBElement<String> createSendCommandParam5(String value) {
        return new JAXBElement<String>(_SendCommandParam5_QNAME, String.class, SendCommand.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://action.web.iot_data_service.com", name = "param1", scope = UpdateGateway.class)
    public JAXBElement<String> createUpdateGatewayParam1(String value) {
        return new JAXBElement<String>(_AddchannelLimitParam1_QNAME, String.class, UpdateGateway.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://action.web.iot_data_service.com", name = "param2", scope = UpdateGateway.class)
    public JAXBElement<String> createUpdateGatewayParam2(String value) {
        return new JAXBElement<String>(_AddchannelLimitParam2_QNAME, String.class, UpdateGateway.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://action.web.iot_data_service.com", name = "param0", scope = UpdateGateway.class)
    public JAXBElement<String> createUpdateGatewayParam0(String value) {
        return new JAXBElement<String>(_AddchannelLimitParam0_QNAME, String.class, UpdateGateway.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://action.web.iot_data_service.com", name = "param3", scope = GatewayHistory.class)
    public JAXBElement<String> createGatewayHistoryParam3(String value) {
        return new JAXBElement<String>(_GatewayHistoryParam3_QNAME, String.class, GatewayHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://action.web.iot_data_service.com", name = "param4", scope = GatewayHistory.class)
    public JAXBElement<String> createGatewayHistoryParam4(String value) {
        return new JAXBElement<String>(_GatewayHistoryParam4_QNAME, String.class, GatewayHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://action.web.iot_data_service.com", name = "param1", scope = GatewayHistory.class)
    public JAXBElement<String> createGatewayHistoryParam1(String value) {
        return new JAXBElement<String>(_AddchannelLimitParam1_QNAME, String.class, GatewayHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://action.web.iot_data_service.com", name = "param2", scope = GatewayHistory.class)
    public JAXBElement<String> createGatewayHistoryParam2(String value) {
        return new JAXBElement<String>(_AddchannelLimitParam2_QNAME, String.class, GatewayHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://action.web.iot_data_service.com", name = "param0", scope = GatewayHistory.class)
    public JAXBElement<String> createGatewayHistoryParam0(String value) {
        return new JAXBElement<String>(_AddchannelLimitParam0_QNAME, String.class, GatewayHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://action.web.iot_data_service.com", name = "param1", scope = UpdatechannelLimit.class)
    public JAXBElement<String> createUpdatechannelLimitParam1(String value) {
        return new JAXBElement<String>(_AddchannelLimitParam1_QNAME, String.class, UpdatechannelLimit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://action.web.iot_data_service.com", name = "param2", scope = UpdatechannelLimit.class)
    public JAXBElement<String> createUpdatechannelLimitParam2(String value) {
        return new JAXBElement<String>(_AddchannelLimitParam2_QNAME, String.class, UpdatechannelLimit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://action.web.iot_data_service.com", name = "param0", scope = UpdatechannelLimit.class)
    public JAXBElement<String> createUpdatechannelLimitParam0(String value) {
        return new JAXBElement<String>(_AddchannelLimitParam0_QNAME, String.class, UpdatechannelLimit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://action.web.iot_data_service.com", name = "return", scope = ChartDataResponse.class)
    public JAXBElement<String> createChartDataResponseReturn(String value) {
        return new JAXBElement<String>(_ChartDataResponseReturn_QNAME, String.class, ChartDataResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://action.web.iot_data_service.com", name = "return", scope = DeletechannelLimitResponse.class)
    public JAXBElement<String> createDeletechannelLimitResponseReturn(String value) {
        return new JAXBElement<String>(_ChartDataResponseReturn_QNAME, String.class, DeletechannelLimitResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://action.web.iot_data_service.com", name = "return", scope = DeleteGatewayResponse.class)
    public JAXBElement<String> createDeleteGatewayResponseReturn(String value) {
        return new JAXBElement<String>(_ChartDataResponseReturn_QNAME, String.class, DeleteGatewayResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://action.web.iot_data_service.com", name = "return", scope = AddchannelLimitResponse.class)
    public JAXBElement<String> createAddchannelLimitResponseReturn(String value) {
        return new JAXBElement<String>(_ChartDataResponseReturn_QNAME, String.class, AddchannelLimitResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://action.web.iot_data_service.com", name = "return", scope = CurAllDataResponse.class)
    public JAXBElement<String> createCurAllDataResponseReturn(String value) {
        return new JAXBElement<String>(_ChartDataResponseReturn_QNAME, String.class, CurAllDataResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://action.web.iot_data_service.com", name = "return", scope = ChkSensorStateResponse.class)
    public JAXBElement<String> createChkSensorStateResponseReturn(String value) {
        return new JAXBElement<String>(_ChartDataResponseReturn_QNAME, String.class, ChkSensorStateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://action.web.iot_data_service.com", name = "return", scope = GatewayDataResponse.class)
    public JAXBElement<String> createGatewayDataResponseReturn(String value) {
        return new JAXBElement<String>(_ChartDataResponseReturn_QNAME, String.class, GatewayDataResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://action.web.iot_data_service.com", name = "param1", scope = GatewayList.class)
    public JAXBElement<String> createGatewayListParam1(String value) {
        return new JAXBElement<String>(_AddchannelLimitParam1_QNAME, String.class, GatewayList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://action.web.iot_data_service.com", name = "param0", scope = GatewayList.class)
    public JAXBElement<String> createGatewayListParam0(String value) {
        return new JAXBElement<String>(_AddchannelLimitParam0_QNAME, String.class, GatewayList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://action.web.iot_data_service.com", name = "return", scope = UpdatechannelLimitResponse.class)
    public JAXBElement<String> createUpdatechannelLimitResponseReturn(String value) {
        return new JAXBElement<String>(_ChartDataResponseReturn_QNAME, String.class, UpdatechannelLimitResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://action.web.iot_data_service.com", name = "return", scope = AddGatewayResponse.class)
    public JAXBElement<String> createAddGatewayResponseReturn(String value) {
        return new JAXBElement<String>(_ChartDataResponseReturn_QNAME, String.class, AddGatewayResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://action.web.iot_data_service.com", name = "return", scope = GatewayHistoryResponse.class)
    public JAXBElement<String> createGatewayHistoryResponseReturn(String value) {
        return new JAXBElement<String>(_ChartDataResponseReturn_QNAME, String.class, GatewayHistoryResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://action.web.iot_data_service.com", name = "return", scope = CtrlChannelResponse.class)
    public JAXBElement<String> createCtrlChannelResponseReturn(String value) {
        return new JAXBElement<String>(_ChartDataResponseReturn_QNAME, String.class, CtrlChannelResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://action.web.iot_data_service.com", name = "return", scope = GatewayHistory2Response.class)
    public JAXBElement<String> createGatewayHistory2ResponseReturn(String value) {
        return new JAXBElement<String>(_ChartDataResponseReturn_QNAME, String.class, GatewayHistory2Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://action.web.iot_data_service.com", name = "return", scope = FindAlertResponse.class)
    public JAXBElement<String> createFindAlertResponseReturn(String value) {
        return new JAXBElement<String>(_ChartDataResponseReturn_QNAME, String.class, FindAlertResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://action.web.iot_data_service.com", name = "param1", scope = DeletechannelLimit.class)
    public JAXBElement<String> createDeletechannelLimitParam1(String value) {
        return new JAXBElement<String>(_AddchannelLimitParam1_QNAME, String.class, DeletechannelLimit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://action.web.iot_data_service.com", name = "param2", scope = DeletechannelLimit.class)
    public JAXBElement<String> createDeletechannelLimitParam2(String value) {
        return new JAXBElement<String>(_AddchannelLimitParam2_QNAME, String.class, DeletechannelLimit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://action.web.iot_data_service.com", name = "param0", scope = DeletechannelLimit.class)
    public JAXBElement<String> createDeletechannelLimitParam0(String value) {
        return new JAXBElement<String>(_AddchannelLimitParam0_QNAME, String.class, DeletechannelLimit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://action.web.iot_data_service.com", name = "return", scope = GatewayListResponse.class)
    public JAXBElement<String> createGatewayListResponseReturn(String value) {
        return new JAXBElement<String>(_ChartDataResponseReturn_QNAME, String.class, GatewayListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://action.web.iot_data_service.com", name = "return", scope = FindChannelLimitResponse.class)
    public JAXBElement<String> createFindChannelLimitResponseReturn(String value) {
        return new JAXBElement<String>(_ChartDataResponseReturn_QNAME, String.class, FindChannelLimitResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://action.web.iot_data_service.com", name = "param1", scope = AddGateway.class)
    public JAXBElement<String> createAddGatewayParam1(String value) {
        return new JAXBElement<String>(_AddchannelLimitParam1_QNAME, String.class, AddGateway.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://action.web.iot_data_service.com", name = "param2", scope = AddGateway.class)
    public JAXBElement<String> createAddGatewayParam2(String value) {
        return new JAXBElement<String>(_AddchannelLimitParam2_QNAME, String.class, AddGateway.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://action.web.iot_data_service.com", name = "param0", scope = AddGateway.class)
    public JAXBElement<String> createAddGatewayParam0(String value) {
        return new JAXBElement<String>(_AddchannelLimitParam0_QNAME, String.class, AddGateway.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://action.web.iot_data_service.com", name = "param3", scope = ChartData.class)
    public JAXBElement<String> createChartDataParam3(String value) {
        return new JAXBElement<String>(_GatewayHistoryParam3_QNAME, String.class, ChartData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://action.web.iot_data_service.com", name = "param4", scope = ChartData.class)
    public JAXBElement<String> createChartDataParam4(String value) {
        return new JAXBElement<String>(_GatewayHistoryParam4_QNAME, String.class, ChartData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://action.web.iot_data_service.com", name = "param1", scope = ChartData.class)
    public JAXBElement<String> createChartDataParam1(String value) {
        return new JAXBElement<String>(_AddchannelLimitParam1_QNAME, String.class, ChartData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://action.web.iot_data_service.com", name = "param2", scope = ChartData.class)
    public JAXBElement<String> createChartDataParam2(String value) {
        return new JAXBElement<String>(_AddchannelLimitParam2_QNAME, String.class, ChartData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://action.web.iot_data_service.com", name = "param0", scope = ChartData.class)
    public JAXBElement<String> createChartDataParam0(String value) {
        return new JAXBElement<String>(_AddchannelLimitParam0_QNAME, String.class, ChartData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://action.web.iot_data_service.com", name = "param7", scope = ChartData.class)
    public JAXBElement<String> createChartDataParam7(String value) {
        return new JAXBElement<String>(_ChartDataParam7_QNAME, String.class, ChartData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://action.web.iot_data_service.com", name = "param5", scope = ChartData.class)
    public JAXBElement<String> createChartDataParam5(String value) {
        return new JAXBElement<String>(_SendCommandParam5_QNAME, String.class, ChartData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://action.web.iot_data_service.com", name = "param6", scope = ChartData.class)
    public JAXBElement<String> createChartDataParam6(String value) {
        return new JAXBElement<String>(_ChartDataParam6_QNAME, String.class, ChartData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://action.web.iot_data_service.com", name = "param1", scope = FindAlert.class)
    public JAXBElement<String> createFindAlertParam1(String value) {
        return new JAXBElement<String>(_AddchannelLimitParam1_QNAME, String.class, FindAlert.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://action.web.iot_data_service.com", name = "param0", scope = FindAlert.class)
    public JAXBElement<String> createFindAlertParam0(String value) {
        return new JAXBElement<String>(_AddchannelLimitParam0_QNAME, String.class, FindAlert.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://action.web.iot_data_service.com", name = "return", scope = SendCommandResponse.class)
    public JAXBElement<String> createSendCommandResponseReturn(String value) {
        return new JAXBElement<String>(_ChartDataResponseReturn_QNAME, String.class, SendCommandResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://action.web.iot_data_service.com", name = "return", scope = UpdateGatewayResponse.class)
    public JAXBElement<String> createUpdateGatewayResponseReturn(String value) {
        return new JAXBElement<String>(_ChartDataResponseReturn_QNAME, String.class, UpdateGatewayResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://action.web.iot_data_service.com", name = "param3", scope = GatewayHistory2 .class)
    public JAXBElement<String> createGatewayHistory2Param3(String value) {
        return new JAXBElement<String>(_GatewayHistoryParam3_QNAME, String.class, GatewayHistory2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://action.web.iot_data_service.com", name = "param1", scope = GatewayHistory2 .class)
    public JAXBElement<String> createGatewayHistory2Param1(String value) {
        return new JAXBElement<String>(_AddchannelLimitParam1_QNAME, String.class, GatewayHistory2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://action.web.iot_data_service.com", name = "param2", scope = GatewayHistory2 .class)
    public JAXBElement<String> createGatewayHistory2Param2(String value) {
        return new JAXBElement<String>(_AddchannelLimitParam2_QNAME, String.class, GatewayHistory2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://action.web.iot_data_service.com", name = "param0", scope = GatewayHistory2 .class)
    public JAXBElement<String> createGatewayHistory2Param0(String value) {
        return new JAXBElement<String>(_AddchannelLimitParam0_QNAME, String.class, GatewayHistory2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://action.web.iot_data_service.com", name = "param3", scope = CtrlChannel.class)
    public JAXBElement<String> createCtrlChannelParam3(String value) {
        return new JAXBElement<String>(_GatewayHistoryParam3_QNAME, String.class, CtrlChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://action.web.iot_data_service.com", name = "param4", scope = CtrlChannel.class)
    public JAXBElement<String> createCtrlChannelParam4(String value) {
        return new JAXBElement<String>(_GatewayHistoryParam4_QNAME, String.class, CtrlChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://action.web.iot_data_service.com", name = "param1", scope = CtrlChannel.class)
    public JAXBElement<String> createCtrlChannelParam1(String value) {
        return new JAXBElement<String>(_AddchannelLimitParam1_QNAME, String.class, CtrlChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://action.web.iot_data_service.com", name = "param2", scope = CtrlChannel.class)
    public JAXBElement<String> createCtrlChannelParam2(String value) {
        return new JAXBElement<String>(_AddchannelLimitParam2_QNAME, String.class, CtrlChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://action.web.iot_data_service.com", name = "param0", scope = CtrlChannel.class)
    public JAXBElement<String> createCtrlChannelParam0(String value) {
        return new JAXBElement<String>(_AddchannelLimitParam0_QNAME, String.class, CtrlChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://action.web.iot_data_service.com", name = "param5", scope = CtrlChannel.class)
    public JAXBElement<String> createCtrlChannelParam5(String value) {
        return new JAXBElement<String>(_SendCommandParam5_QNAME, String.class, CtrlChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://action.web.iot_data_service.com", name = "param1", scope = GatewayData.class)
    public JAXBElement<String> createGatewayDataParam1(String value) {
        return new JAXBElement<String>(_AddchannelLimitParam1_QNAME, String.class, GatewayData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://action.web.iot_data_service.com", name = "param2", scope = GatewayData.class)
    public JAXBElement<String> createGatewayDataParam2(String value) {
        return new JAXBElement<String>(_AddchannelLimitParam2_QNAME, String.class, GatewayData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://action.web.iot_data_service.com", name = "param0", scope = GatewayData.class)
    public JAXBElement<String> createGatewayDataParam0(String value) {
        return new JAXBElement<String>(_AddchannelLimitParam0_QNAME, String.class, GatewayData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://action.web.iot_data_service.com", name = "param1", scope = ChkSensorState.class)
    public JAXBElement<String> createChkSensorStateParam1(String value) {
        return new JAXBElement<String>(_AddchannelLimitParam1_QNAME, String.class, ChkSensorState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://action.web.iot_data_service.com", name = "param2", scope = ChkSensorState.class)
    public JAXBElement<String> createChkSensorStateParam2(String value) {
        return new JAXBElement<String>(_AddchannelLimitParam2_QNAME, String.class, ChkSensorState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://action.web.iot_data_service.com", name = "param0", scope = ChkSensorState.class)
    public JAXBElement<String> createChkSensorStateParam0(String value) {
        return new JAXBElement<String>(_AddchannelLimitParam0_QNAME, String.class, ChkSensorState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://action.web.iot_data_service.com", name = "param1", scope = FindChannelLimit.class)
    public JAXBElement<String> createFindChannelLimitParam1(String value) {
        return new JAXBElement<String>(_AddchannelLimitParam1_QNAME, String.class, FindChannelLimit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://action.web.iot_data_service.com", name = "param0", scope = FindChannelLimit.class)
    public JAXBElement<String> createFindChannelLimitParam0(String value) {
        return new JAXBElement<String>(_AddchannelLimitParam0_QNAME, String.class, FindChannelLimit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://action.web.iot_data_service.com", name = "param1", scope = CurAllData.class)
    public JAXBElement<String> createCurAllDataParam1(String value) {
        return new JAXBElement<String>(_AddchannelLimitParam1_QNAME, String.class, CurAllData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://action.web.iot_data_service.com", name = "param0", scope = CurAllData.class)
    public JAXBElement<String> createCurAllDataParam0(String value) {
        return new JAXBElement<String>(_AddchannelLimitParam0_QNAME, String.class, CurAllData.class, value);
    }

}
