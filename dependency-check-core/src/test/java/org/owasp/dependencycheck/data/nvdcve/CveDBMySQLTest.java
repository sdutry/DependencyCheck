/*
 * This file is part of dependency-check-core.
 *
 * Dependency-check-core is free software: you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by the Free
 * Software Foundation, either version 3 of the License, or (at your option) any
 * later version.
 *
 * Dependency-check-core is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 *
 * You should have received a copy of the GNU General Public License along with
 * dependency-check-core. If not, see http://www.gnu.org/licenses/.
 *
 * Copyright (c) 2014 Jeremy Long. All Rights Reserved.
 */
package org.owasp.dependencycheck.data.nvdcve;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Jeremy Long <jeremy.long@owasp.org>
 */
public class CveDBMySQLTest {

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    /**
     * Pretty useless tests of open, commit, and close methods, of class CveDB.
     */
    @Test
    public void testOpen() throws Exception {
//        String con = Settings.getString(Settings.KEYS.DB_CONNECTION_STRING);
//        String driver = Settings.getString(Settings.KEYS.DB_DRIVER_NAME);
//        String path = Settings.getString(Settings.KEYS.DB_DRIVER_PATH);
//
//        System.out.println("con: " + con);
//        System.out.println("driver: " + driver);
//        System.out.println("path: " + path);
//        Settings.setString(Settings.KEYS.DB_CONNECTION_STRING, "jdbc:mysql://localhost:3306/dependencycheck");
//        Settings.setString(Settings.KEYS.DB_DRIVER_NAME, "com.mysql.jdbc.Driver");
//        Settings.setString(Settings.KEYS.DB_DRIVER_PATH, "c:\\Users\\jeremy\\Documents\\NetBeansProjects\\DependencyCheck\\dependency-check-core/src/test/resources/mysql-connector-java-5.1.27-bin.jar");

        CveDB instance = new CveDB();
        instance.open();
        instance.close();
    }

    /**
     * Test of getCPEs method, of class CveDB.
     */
    @Test
    public void testGetCPEs() throws Exception {
        /*
         CveDB instance = new CveDB();
         try {
         String vendor = "apache";
         String product = "struts";
         instance.open();
         Set<VulnerableSoftware> result = instance.getCPEs(vendor, product);
         assertTrue(result.size() > 5);
         } finally {
         instance.close();
         }
         */
    }

    /**
     * Test of getVulnerabilities method, of class CveDB.
     */
    @Test
    public void testGetVulnerabilities() throws Exception {
        /*
         String cpeStr = "cpe:/a:apache:struts:2.1.2";
         CveDB instance = new CveDB();
         try {
         instance.open();
         List result = instance.getVulnerabilities(cpeStr);
         assertTrue(result.size() > 5);
         } finally {
         instance.close();
         }
         */
    }
}