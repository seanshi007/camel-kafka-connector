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
package org.apache.camel.kafkaconnector.directvm;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSourceConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelDirectvmSourceConnectorConfig
        extends
            CamelSourceConnectorConfig {

    public static final String CAMEL_SOURCE_DIRECTVM_PATH_NAME_CONF = "camel.source.path.name";
    public static final String CAMEL_SOURCE_DIRECTVM_PATH_NAME_DOC = "Name of direct-vm endpoint";
    public static final String CAMEL_SOURCE_DIRECTVM_PATH_NAME_DEFAULT = null;
    public static final String CAMEL_SOURCE_DIRECTVM_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF = "camel.source.endpoint.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_DIRECTVM_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_DIRECTVM_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_DIRECTVM_ENDPOINT_EXCEPTION_HANDLER_CONF = "camel.source.endpoint.exceptionHandler";
    public static final String CAMEL_SOURCE_DIRECTVM_ENDPOINT_EXCEPTION_HANDLER_DOC = "To let the consumer use a custom ExceptionHandler. Notice if the option bridgeErrorHandler is enabled then this option is not in use. By default the consumer will deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final String CAMEL_SOURCE_DIRECTVM_ENDPOINT_EXCEPTION_HANDLER_DEFAULT = null;
    public static final String CAMEL_SOURCE_DIRECTVM_ENDPOINT_EXCHANGE_PATTERN_CONF = "camel.source.endpoint.exchangePattern";
    public static final String CAMEL_SOURCE_DIRECTVM_ENDPOINT_EXCHANGE_PATTERN_DOC = "Sets the exchange pattern when the consumer creates an exchange. One of: [InOnly] [InOut] [InOptionalOut]";
    public static final String CAMEL_SOURCE_DIRECTVM_ENDPOINT_EXCHANGE_PATTERN_DEFAULT = null;
    public static final String CAMEL_SOURCE_DIRECTVM_ENDPOINT_PROPAGATE_PROPERTIES_CONF = "camel.source.endpoint.propagateProperties";
    public static final String CAMEL_SOURCE_DIRECTVM_ENDPOINT_PROPAGATE_PROPERTIES_DOC = "Whether to propagate or not properties from the producer side to the consumer side, and vice versa. Default value: true.";
    public static final Boolean CAMEL_SOURCE_DIRECTVM_ENDPOINT_PROPAGATE_PROPERTIES_DEFAULT = true;
    public static final String CAMEL_SOURCE_DIRECTVM_ENDPOINT_SYNCHRONOUS_CONF = "camel.source.endpoint.synchronous";
    public static final String CAMEL_SOURCE_DIRECTVM_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SOURCE_DIRECTVM_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SOURCE_DIRECTVM_COMPONENT_BRIDGE_ERROR_HANDLER_CONF = "camel.component.direct-vm.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_DIRECTVM_COMPONENT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_DIRECTVM_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_DIRECTVM_COMPONENT_AUTOWIRED_ENABLED_CONF = "camel.component.direct-vm.autowiredEnabled";
    public static final String CAMEL_SOURCE_DIRECTVM_COMPONENT_AUTOWIRED_ENABLED_DOC = "Whether autowiring is enabled. This is used for automatic autowiring options (the option must be marked as autowired) by looking up in the registry to find if there is a single instance of matching type, which then gets configured on the component. This can be used for automatic configuring JDBC data sources, JMS connection factories, AWS Clients, etc.";
    public static final Boolean CAMEL_SOURCE_DIRECTVM_COMPONENT_AUTOWIRED_ENABLED_DEFAULT = true;
    public static final String CAMEL_SOURCE_DIRECTVM_COMPONENT_HEADER_FILTER_STRATEGY_CONF = "camel.component.direct-vm.headerFilterStrategy";
    public static final String CAMEL_SOURCE_DIRECTVM_COMPONENT_HEADER_FILTER_STRATEGY_DOC = "Sets a HeaderFilterStrategy that will only be applied on producer endpoints (on both directions: request and response). Default value: none.";
    public static final String CAMEL_SOURCE_DIRECTVM_COMPONENT_HEADER_FILTER_STRATEGY_DEFAULT = null;
    public static final String CAMEL_SOURCE_DIRECTVM_COMPONENT_PROPAGATE_PROPERTIES_CONF = "camel.component.direct-vm.propagateProperties";
    public static final String CAMEL_SOURCE_DIRECTVM_COMPONENT_PROPAGATE_PROPERTIES_DOC = "Whether to propagate or not properties from the producer side to the consumer side, and vice versa. Default value: true.";
    public static final Boolean CAMEL_SOURCE_DIRECTVM_COMPONENT_PROPAGATE_PROPERTIES_DEFAULT = true;

    public CamelDirectvmSourceConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelDirectvmSourceConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSourceConnectorConfig.conf());
        conf.define(CAMEL_SOURCE_DIRECTVM_PATH_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_DIRECTVM_PATH_NAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_DIRECTVM_PATH_NAME_DOC);
        conf.define(CAMEL_SOURCE_DIRECTVM_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_DIRECTVM_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_DIRECTVM_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_DIRECTVM_ENDPOINT_EXCEPTION_HANDLER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_DIRECTVM_ENDPOINT_EXCEPTION_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_DIRECTVM_ENDPOINT_EXCEPTION_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_DIRECTVM_ENDPOINT_EXCHANGE_PATTERN_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_DIRECTVM_ENDPOINT_EXCHANGE_PATTERN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_DIRECTVM_ENDPOINT_EXCHANGE_PATTERN_DOC);
        conf.define(CAMEL_SOURCE_DIRECTVM_ENDPOINT_PROPAGATE_PROPERTIES_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_DIRECTVM_ENDPOINT_PROPAGATE_PROPERTIES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_DIRECTVM_ENDPOINT_PROPAGATE_PROPERTIES_DOC);
        conf.define(CAMEL_SOURCE_DIRECTVM_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_DIRECTVM_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_DIRECTVM_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SOURCE_DIRECTVM_COMPONENT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_DIRECTVM_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_DIRECTVM_COMPONENT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_DIRECTVM_COMPONENT_AUTOWIRED_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_DIRECTVM_COMPONENT_AUTOWIRED_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_DIRECTVM_COMPONENT_AUTOWIRED_ENABLED_DOC);
        conf.define(CAMEL_SOURCE_DIRECTVM_COMPONENT_HEADER_FILTER_STRATEGY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_DIRECTVM_COMPONENT_HEADER_FILTER_STRATEGY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_DIRECTVM_COMPONENT_HEADER_FILTER_STRATEGY_DOC);
        conf.define(CAMEL_SOURCE_DIRECTVM_COMPONENT_PROPAGATE_PROPERTIES_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_DIRECTVM_COMPONENT_PROPAGATE_PROPERTIES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_DIRECTVM_COMPONENT_PROPAGATE_PROPERTIES_DOC);
        return conf;
    }
}