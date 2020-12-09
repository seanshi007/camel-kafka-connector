/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.kafkaconnector.iec60870client;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSourceConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelIec60870clientSourceConnectorConfig
        extends
            CamelSourceConnectorConfig {

    public static final String CAMEL_SOURCE_IEC60870CLIENT_PATH_URI_PATH_CONF = "camel.source.path.uriPath";
    public static final String CAMEL_SOURCE_IEC60870CLIENT_PATH_URI_PATH_DOC = "The object information address";
    public static final String CAMEL_SOURCE_IEC60870CLIENT_PATH_URI_PATH_DEFAULT = null;
    public static final String CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_DATA_MODULE_OPTIONS_CONF = "camel.source.endpoint.dataModuleOptions";
    public static final String CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_DATA_MODULE_OPTIONS_DOC = "Data module options";
    public static final String CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_DATA_MODULE_OPTIONS_DEFAULT = null;
    public static final String CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_PROTOCOL_OPTIONS_CONF = "camel.source.endpoint.protocolOptions";
    public static final String CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_PROTOCOL_OPTIONS_DOC = "Protocol options";
    public static final String CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_PROTOCOL_OPTIONS_DEFAULT = null;
    public static final String CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF = "camel.source.endpoint.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_EXCEPTION_HANDLER_CONF = "camel.source.endpoint.exceptionHandler";
    public static final String CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_EXCEPTION_HANDLER_DOC = "To let the consumer use a custom ExceptionHandler. Notice if the option bridgeErrorHandler is enabled then this option is not in use. By default the consumer will deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final String CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_EXCEPTION_HANDLER_DEFAULT = null;
    public static final String CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_EXCHANGE_PATTERN_CONF = "camel.source.endpoint.exchangePattern";
    public static final String CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_EXCHANGE_PATTERN_DOC = "Sets the exchange pattern when the consumer creates an exchange. One of: [InOnly] [InOut] [InOptionalOut]";
    public static final String CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_EXCHANGE_PATTERN_DEFAULT = null;
    public static final String CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_SYNCHRONOUS_CONF = "camel.source.endpoint.synchronous";
    public static final String CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_ACKNOWLEDGE_WINDOW_CONF = "camel.source.endpoint.acknowledgeWindow";
    public static final String CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_ACKNOWLEDGE_WINDOW_DOC = "Parameter W - Acknowledgment window.";
    public static final Short CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_ACKNOWLEDGE_WINDOW_DEFAULT = 10;
    public static final String CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_ADSU_ADDRESS_TYPE_CONF = "camel.source.endpoint.adsuAddressType";
    public static final String CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_ADSU_ADDRESS_TYPE_DOC = "The common ASDU address size. May be either SIZE_1 or SIZE_2. One of: [SIZE_1] [SIZE_2]";
    public static final String CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_ADSU_ADDRESS_TYPE_DEFAULT = null;
    public static final String CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_CAUSE_OF_TRANSMISSION_TYPE_CONF = "camel.source.endpoint.causeOfTransmissionType";
    public static final String CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_CAUSE_OF_TRANSMISSION_TYPE_DOC = "The cause of transmission type. May be either SIZE_1 or SIZE_2. One of: [SIZE_1] [SIZE_2]";
    public static final String CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_CAUSE_OF_TRANSMISSION_TYPE_DEFAULT = null;
    public static final String CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_INFORMATION_OBJECT_ADDRESS_TYPE_CONF = "camel.source.endpoint.informationObjectAddressType";
    public static final String CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_INFORMATION_OBJECT_ADDRESS_TYPE_DOC = "The information address size. May be either SIZE_1, SIZE_2 or SIZE_3. One of: [SIZE_1] [SIZE_2] [SIZE_3]";
    public static final String CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_INFORMATION_OBJECT_ADDRESS_TYPE_DEFAULT = null;
    public static final String CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_MAX_UNACKNOWLEDGED_CONF = "camel.source.endpoint.maxUnacknowledged";
    public static final String CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_MAX_UNACKNOWLEDGED_DOC = "Parameter K - Maximum number of un-acknowledged messages.";
    public static final Short CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_MAX_UNACKNOWLEDGED_DEFAULT = 15;
    public static final String CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_TIMEOUT_1CONF = "camel.source.endpoint.timeout1";
    public static final String CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_TIMEOUT_1DOC = "Timeout T1 in milliseconds.";
    public static final Integer CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_TIMEOUT_1DEFAULT = 15000;
    public static final String CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_TIMEOUT_2CONF = "camel.source.endpoint.timeout2";
    public static final String CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_TIMEOUT_2DOC = "Timeout T2 in milliseconds.";
    public static final Integer CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_TIMEOUT_2DEFAULT = 10000;
    public static final String CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_TIMEOUT_3CONF = "camel.source.endpoint.timeout3";
    public static final String CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_TIMEOUT_3DOC = "Timeout T3 in milliseconds.";
    public static final Integer CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_TIMEOUT_3DEFAULT = 20000;
    public static final String CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_CAUSE_SOURCE_ADDRESS_CONF = "camel.source.endpoint.causeSourceAddress";
    public static final String CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_CAUSE_SOURCE_ADDRESS_DOC = "Whether to include the source address";
    public static final String CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_CAUSE_SOURCE_ADDRESS_DEFAULT = null;
    public static final String CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_CONNECTION_TIMEOUT_CONF = "camel.source.endpoint.connectionTimeout";
    public static final String CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_CONNECTION_TIMEOUT_DOC = "Timeout in millis to wait for client to establish a connected connection.";
    public static final Integer CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_CONNECTION_TIMEOUT_DEFAULT = 10000;
    public static final String CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_IGNORE_BACKGROUND_SCAN_CONF = "camel.source.endpoint.ignoreBackgroundScan";
    public static final String CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_IGNORE_BACKGROUND_SCAN_DOC = "Whether background scan transmissions should be ignored.";
    public static final Boolean CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_IGNORE_BACKGROUND_SCAN_DEFAULT = true;
    public static final String CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_IGNORE_DAYLIGHT_SAVING_TIME_CONF = "camel.source.endpoint.ignoreDaylightSavingTime";
    public static final String CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_IGNORE_DAYLIGHT_SAVING_TIME_DOC = "Whether to ignore or respect DST";
    public static final Boolean CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_IGNORE_DAYLIGHT_SAVING_TIME_DEFAULT = false;
    public static final String CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_TIME_ZONE_CONF = "camel.source.endpoint.timeZone";
    public static final String CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_TIME_ZONE_DOC = "The timezone to use. May be any Java time zone string";
    public static final String CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_TIME_ZONE_DEFAULT = "UTC";
    public static final String CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_CONNECTION_ID_CONF = "camel.source.endpoint.connectionId";
    public static final String CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_CONNECTION_ID_DOC = "An identifier grouping connection instances";
    public static final String CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_CONNECTION_ID_DEFAULT = null;
    public static final String CAMEL_SOURCE_IEC60870CLIENT_COMPONENT_DEFAULT_CONNECTION_OPTIONS_CONF = "camel.component.iec60870-client.defaultConnectionOptions";
    public static final String CAMEL_SOURCE_IEC60870CLIENT_COMPONENT_DEFAULT_CONNECTION_OPTIONS_DOC = "Default connection options";
    public static final String CAMEL_SOURCE_IEC60870CLIENT_COMPONENT_DEFAULT_CONNECTION_OPTIONS_DEFAULT = null;
    public static final String CAMEL_SOURCE_IEC60870CLIENT_COMPONENT_BRIDGE_ERROR_HANDLER_CONF = "camel.component.iec60870-client.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_IEC60870CLIENT_COMPONENT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_IEC60870CLIENT_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_IEC60870CLIENT_COMPONENT_AUTOWIRED_ENABLED_CONF = "camel.component.iec60870-client.autowiredEnabled";
    public static final String CAMEL_SOURCE_IEC60870CLIENT_COMPONENT_AUTOWIRED_ENABLED_DOC = "Whether autowiring is enabled. This is used for automatic autowiring options (the option must be marked as autowired) by looking up in the registry to find if there is a single instance of matching type, which then gets configured on the component. This can be used for automatic configuring JDBC data sources, JMS connection factories, AWS Clients, etc.";
    public static final Boolean CAMEL_SOURCE_IEC60870CLIENT_COMPONENT_AUTOWIRED_ENABLED_DEFAULT = true;

    public CamelIec60870clientSourceConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelIec60870clientSourceConnectorConfig(
            Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSourceConnectorConfig.conf());
        conf.define(CAMEL_SOURCE_IEC60870CLIENT_PATH_URI_PATH_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_IEC60870CLIENT_PATH_URI_PATH_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_IEC60870CLIENT_PATH_URI_PATH_DOC);
        conf.define(CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_DATA_MODULE_OPTIONS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_DATA_MODULE_OPTIONS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_DATA_MODULE_OPTIONS_DOC);
        conf.define(CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_PROTOCOL_OPTIONS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_PROTOCOL_OPTIONS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_PROTOCOL_OPTIONS_DOC);
        conf.define(CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_EXCEPTION_HANDLER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_EXCEPTION_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_EXCEPTION_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_EXCHANGE_PATTERN_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_EXCHANGE_PATTERN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_EXCHANGE_PATTERN_DOC);
        conf.define(CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_ACKNOWLEDGE_WINDOW_CONF, ConfigDef.Type.SHORT, CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_ACKNOWLEDGE_WINDOW_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_ACKNOWLEDGE_WINDOW_DOC);
        conf.define(CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_ADSU_ADDRESS_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_ADSU_ADDRESS_TYPE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_ADSU_ADDRESS_TYPE_DOC);
        conf.define(CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_CAUSE_OF_TRANSMISSION_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_CAUSE_OF_TRANSMISSION_TYPE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_CAUSE_OF_TRANSMISSION_TYPE_DOC);
        conf.define(CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_INFORMATION_OBJECT_ADDRESS_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_INFORMATION_OBJECT_ADDRESS_TYPE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_INFORMATION_OBJECT_ADDRESS_TYPE_DOC);
        conf.define(CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_MAX_UNACKNOWLEDGED_CONF, ConfigDef.Type.SHORT, CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_MAX_UNACKNOWLEDGED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_MAX_UNACKNOWLEDGED_DOC);
        conf.define(CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_TIMEOUT_1CONF, ConfigDef.Type.INT, CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_TIMEOUT_1DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_TIMEOUT_1DOC);
        conf.define(CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_TIMEOUT_2CONF, ConfigDef.Type.INT, CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_TIMEOUT_2DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_TIMEOUT_2DOC);
        conf.define(CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_TIMEOUT_3CONF, ConfigDef.Type.INT, CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_TIMEOUT_3DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_TIMEOUT_3DOC);
        conf.define(CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_CAUSE_SOURCE_ADDRESS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_CAUSE_SOURCE_ADDRESS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_CAUSE_SOURCE_ADDRESS_DOC);
        conf.define(CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_CONNECTION_TIMEOUT_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_CONNECTION_TIMEOUT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_CONNECTION_TIMEOUT_DOC);
        conf.define(CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_IGNORE_BACKGROUND_SCAN_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_IGNORE_BACKGROUND_SCAN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_IGNORE_BACKGROUND_SCAN_DOC);
        conf.define(CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_IGNORE_DAYLIGHT_SAVING_TIME_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_IGNORE_DAYLIGHT_SAVING_TIME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_IGNORE_DAYLIGHT_SAVING_TIME_DOC);
        conf.define(CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_TIME_ZONE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_TIME_ZONE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_TIME_ZONE_DOC);
        conf.define(CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_CONNECTION_ID_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_CONNECTION_ID_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_IEC60870CLIENT_ENDPOINT_CONNECTION_ID_DOC);
        conf.define(CAMEL_SOURCE_IEC60870CLIENT_COMPONENT_DEFAULT_CONNECTION_OPTIONS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_IEC60870CLIENT_COMPONENT_DEFAULT_CONNECTION_OPTIONS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_IEC60870CLIENT_COMPONENT_DEFAULT_CONNECTION_OPTIONS_DOC);
        conf.define(CAMEL_SOURCE_IEC60870CLIENT_COMPONENT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_IEC60870CLIENT_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_IEC60870CLIENT_COMPONENT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_IEC60870CLIENT_COMPONENT_AUTOWIRED_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_IEC60870CLIENT_COMPONENT_AUTOWIRED_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_IEC60870CLIENT_COMPONENT_AUTOWIRED_ENABLED_DOC);
        return conf;
    }
}