package org.opennms.ocs.inventory.client.request.logic.test;

import org.junit.Assert;
import org.junit.Test;
import org.opennms.ocs.inventory.client.request.logic.OcsInventoryClientLogic;
import org.opennms.ocs.inventory.client.request.logic.OcsInventoryClientLogicSnmpImp;
import org.opennms.ocs.inventory.client.response.snmp.SnmpDevices;

public class OCSInventoryClientIntegrationSnmpTest {

    /**
     * The host.
     */
    private String host = "https://ocs-test.bonnierdigitalservices.se";
    /**
     * The login.
     */
    private String login = "OpenNMS_System";
    /**
     * The password.
     */
    private String password = "0p3nNMS!";


    @Test
    public void test() {
        OcsInventoryClientLogic ocsInventoryClientLogic = new OcsInventoryClientLogicSnmpImp();
        try {
            ocsInventoryClientLogic.init(host, login, password);

            SnmpDevices snmpDevices = ocsInventoryClientLogic.getSnmpDevices();
            
            Assert.assertNotNull(snmpDevices);
            System.out.println(snmpDevices.getSNMPDevices());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}