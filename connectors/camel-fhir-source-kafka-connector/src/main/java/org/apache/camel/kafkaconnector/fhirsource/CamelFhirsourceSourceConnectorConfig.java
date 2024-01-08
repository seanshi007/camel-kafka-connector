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
 */package org.apache.camel.kafkaconnector.fhirsource;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSourceConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelFhirsourceSourceConnectorConfig
        extends
            CamelSourceConnectorConfig {

    public static final String CAMEL_SOURCE_FHIRSOURCE_KAMELET_SERVER_URL_CONF = "camel.kamelet.fhir-source.serverUrl";
    public static final String CAMEL_SOURCE_FHIRSOURCE_KAMELET_SERVER_URL_DOC = "The Fhir server url";
    public static final String CAMEL_SOURCE_FHIRSOURCE_KAMELET_SERVER_URL_DEFAULT = null;
    public static final String CAMEL_SOURCE_FHIRSOURCE_KAMELET_URL_CONF = "camel.kamelet.fhir-source.url";
    public static final String CAMEL_SOURCE_FHIRSOURCE_KAMELET_URL_DOC = "The Fhir resource type url";
    public static final String CAMEL_SOURCE_FHIRSOURCE_KAMELET_URL_DEFAULT = "/Patient";
    public static final String CAMEL_SOURCE_FHIRSOURCE_KAMELET_ENCODING_CONF = "camel.kamelet.fhir-source.encoding";
    public static final String CAMEL_SOURCE_FHIRSOURCE_KAMELET_ENCODING_DOC = "Encoding to use for all request.";
    public static final String CAMEL_SOURCE_FHIRSOURCE_KAMELET_ENCODING_DEFAULT = "JSON";
    public static final String CAMEL_SOURCE_FHIRSOURCE_KAMELET_FHIR_VERSION_CONF = "camel.kamelet.fhir-source.fhirVersion";
    public static final String CAMEL_SOURCE_FHIRSOURCE_KAMELET_FHIR_VERSION_DOC = "The FHIR Version to use.";
    public static final String CAMEL_SOURCE_FHIRSOURCE_KAMELET_FHIR_VERSION_DEFAULT = "R4";
    public static final String CAMEL_SOURCE_FHIRSOURCE_KAMELET_USERNAME_CONF = "camel.kamelet.fhir-source.username";
    public static final String CAMEL_SOURCE_FHIRSOURCE_KAMELET_USERNAME_DOC = "The username to access the Fhir server";
    public static final String CAMEL_SOURCE_FHIRSOURCE_KAMELET_USERNAME_DEFAULT = null;
    public static final String CAMEL_SOURCE_FHIRSOURCE_KAMELET_PASSWORD_CONF = "camel.kamelet.fhir-source.password";
    public static final String CAMEL_SOURCE_FHIRSOURCE_KAMELET_PASSWORD_DOC = "The password to access the Fhir server";
    public static final String CAMEL_SOURCE_FHIRSOURCE_KAMELET_PASSWORD_DEFAULT = null;
    public static final String CAMEL_SOURCE_FHIRSOURCE_KAMELET_PRETTY_PRINT_CONF = "camel.kamelet.fhir-source.prettyPrint";
    public static final String CAMEL_SOURCE_FHIRSOURCE_KAMELET_PRETTY_PRINT_DOC = "Define if the Json must be pretty print or not";
    public static final Boolean CAMEL_SOURCE_FHIRSOURCE_KAMELET_PRETTY_PRINT_DEFAULT = true;

    public CamelFhirsourceSourceConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelFhirsourceSourceConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSourceConnectorConfig.conf());
        conf.define(CAMEL_SOURCE_FHIRSOURCE_KAMELET_SERVER_URL_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_FHIRSOURCE_KAMELET_SERVER_URL_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_FHIRSOURCE_KAMELET_SERVER_URL_DOC);
        conf.define(CAMEL_SOURCE_FHIRSOURCE_KAMELET_URL_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_FHIRSOURCE_KAMELET_URL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_FHIRSOURCE_KAMELET_URL_DOC);
        conf.define(CAMEL_SOURCE_FHIRSOURCE_KAMELET_ENCODING_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_FHIRSOURCE_KAMELET_ENCODING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_FHIRSOURCE_KAMELET_ENCODING_DOC);
        conf.define(CAMEL_SOURCE_FHIRSOURCE_KAMELET_FHIR_VERSION_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_FHIRSOURCE_KAMELET_FHIR_VERSION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_FHIRSOURCE_KAMELET_FHIR_VERSION_DOC);
        conf.define(CAMEL_SOURCE_FHIRSOURCE_KAMELET_USERNAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_FHIRSOURCE_KAMELET_USERNAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_FHIRSOURCE_KAMELET_USERNAME_DOC);
        conf.define(CAMEL_SOURCE_FHIRSOURCE_KAMELET_PASSWORD_CONF, ConfigDef.Type.PASSWORD, CAMEL_SOURCE_FHIRSOURCE_KAMELET_PASSWORD_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_FHIRSOURCE_KAMELET_PASSWORD_DOC);
        conf.define(CAMEL_SOURCE_FHIRSOURCE_KAMELET_PRETTY_PRINT_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_FHIRSOURCE_KAMELET_PRETTY_PRINT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_FHIRSOURCE_KAMELET_PRETTY_PRINT_DOC);
        return conf;
    }
}