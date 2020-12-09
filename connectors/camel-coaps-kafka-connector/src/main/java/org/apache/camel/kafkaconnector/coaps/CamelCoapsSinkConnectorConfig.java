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
package org.apache.camel.kafkaconnector.coaps;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelCoapsSinkConnectorConfig extends CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_COAPS_PATH_URI_CONF = "camel.sink.path.uri";
    public static final String CAMEL_SINK_COAPS_PATH_URI_DOC = "The URI for the CoAP endpoint";
    public static final String CAMEL_SINK_COAPS_PATH_URI_DEFAULT = null;
    public static final String CAMEL_SINK_COAPS_ENDPOINT_ALIAS_CONF = "camel.sink.endpoint.alias";
    public static final String CAMEL_SINK_COAPS_ENDPOINT_ALIAS_DOC = "Sets the alias used to query the KeyStore for the private key and certificate. This parameter is used when we are enabling TLS with certificates on the service side, and similarly on the client side when TLS is used with certificates and client authentication. If the parameter is not specified then the default behavior is to use the first alias in the keystore that contains a key entry. This configuration parameter does not apply to configuring TLS via a Raw Public Key or a Pre-Shared Key.";
    public static final String CAMEL_SINK_COAPS_ENDPOINT_ALIAS_DEFAULT = null;
    public static final String CAMEL_SINK_COAPS_ENDPOINT_CIPHER_SUITES_CONF = "camel.sink.endpoint.cipherSuites";
    public static final String CAMEL_SINK_COAPS_ENDPOINT_CIPHER_SUITES_DOC = "Sets the cipherSuites String. This is a comma separated String of ciphersuites to configure. If it is not specified, then it falls back to getting the ciphersuites from the sslContextParameters object.";
    public static final String CAMEL_SINK_COAPS_ENDPOINT_CIPHER_SUITES_DEFAULT = null;
    public static final String CAMEL_SINK_COAPS_ENDPOINT_CLIENT_AUTHENTICATION_CONF = "camel.sink.endpoint.clientAuthentication";
    public static final String CAMEL_SINK_COAPS_ENDPOINT_CLIENT_AUTHENTICATION_DOC = "Sets the configuration options for server-side client-authentication requirements. The value must be one of NONE, WANT, REQUIRE. If this value is not specified, then it falls back to checking the sslContextParameters.getServerParameters().getClientAuthentication() value.";
    public static final String CAMEL_SINK_COAPS_ENDPOINT_CLIENT_AUTHENTICATION_DEFAULT = null;
    public static final String CAMEL_SINK_COAPS_ENDPOINT_PRIVATE_KEY_CONF = "camel.sink.endpoint.privateKey";
    public static final String CAMEL_SINK_COAPS_ENDPOINT_PRIVATE_KEY_DOC = "Set the configured private key for use with Raw Public Key.";
    public static final String CAMEL_SINK_COAPS_ENDPOINT_PRIVATE_KEY_DEFAULT = null;
    public static final String CAMEL_SINK_COAPS_ENDPOINT_PSK_STORE_CONF = "camel.sink.endpoint.pskStore";
    public static final String CAMEL_SINK_COAPS_ENDPOINT_PSK_STORE_DOC = "Set the PskStore to use for pre-shared key.";
    public static final String CAMEL_SINK_COAPS_ENDPOINT_PSK_STORE_DEFAULT = null;
    public static final String CAMEL_SINK_COAPS_ENDPOINT_PUBLIC_KEY_CONF = "camel.sink.endpoint.publicKey";
    public static final String CAMEL_SINK_COAPS_ENDPOINT_PUBLIC_KEY_DOC = "Set the configured public key for use with Raw Public Key.";
    public static final String CAMEL_SINK_COAPS_ENDPOINT_PUBLIC_KEY_DEFAULT = null;
    public static final String CAMEL_SINK_COAPS_ENDPOINT_RECOMMENDED_CIPHER_SUITES_ONLY_CONF = "camel.sink.endpoint.recommendedCipherSuitesOnly";
    public static final String CAMEL_SINK_COAPS_ENDPOINT_RECOMMENDED_CIPHER_SUITES_ONLY_DOC = "The CBC cipher suites are not recommended. If you want to use them, you first need to set the recommendedCipherSuitesOnly option to false.";
    public static final Boolean CAMEL_SINK_COAPS_ENDPOINT_RECOMMENDED_CIPHER_SUITES_ONLY_DEFAULT = true;
    public static final String CAMEL_SINK_COAPS_ENDPOINT_SSL_CONTEXT_PARAMETERS_CONF = "camel.sink.endpoint.sslContextParameters";
    public static final String CAMEL_SINK_COAPS_ENDPOINT_SSL_CONTEXT_PARAMETERS_DOC = "Set the SSLContextParameters object for setting up TLS. This is required for coapstcp, and for coaps when we are using certificates for TLS (as opposed to RPK or PKS).";
    public static final String CAMEL_SINK_COAPS_ENDPOINT_SSL_CONTEXT_PARAMETERS_DEFAULT = null;
    public static final String CAMEL_SINK_COAPS_ENDPOINT_TRUSTED_RPK_STORE_CONF = "camel.sink.endpoint.trustedRpkStore";
    public static final String CAMEL_SINK_COAPS_ENDPOINT_TRUSTED_RPK_STORE_DOC = "Set the TrustedRpkStore to use to determine trust in raw public keys.";
    public static final String CAMEL_SINK_COAPS_ENDPOINT_TRUSTED_RPK_STORE_DEFAULT = null;
    public static final String CAMEL_SINK_COAPS_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_COAPS_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_COAPS_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_COAPS_ENDPOINT_SYNCHRONOUS_CONF = "camel.sink.endpoint.synchronous";
    public static final String CAMEL_SINK_COAPS_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SINK_COAPS_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SINK_COAPS_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.coaps.lazyStartProducer";
    public static final String CAMEL_SINK_COAPS_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_COAPS_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_COAPS_COMPONENT_AUTOWIRED_ENABLED_CONF = "camel.component.coaps.autowiredEnabled";
    public static final String CAMEL_SINK_COAPS_COMPONENT_AUTOWIRED_ENABLED_DOC = "Whether autowiring is enabled. This is used for automatic autowiring options (the option must be marked as autowired) by looking up in the registry to find if there is a single instance of matching type, which then gets configured on the component. This can be used for automatic configuring JDBC data sources, JMS connection factories, AWS Clients, etc.";
    public static final Boolean CAMEL_SINK_COAPS_COMPONENT_AUTOWIRED_ENABLED_DEFAULT = true;

    public CamelCoapsSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelCoapsSinkConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_COAPS_PATH_URI_CONF, ConfigDef.Type.STRING, CAMEL_SINK_COAPS_PATH_URI_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_COAPS_PATH_URI_DOC);
        conf.define(CAMEL_SINK_COAPS_ENDPOINT_ALIAS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_COAPS_ENDPOINT_ALIAS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_COAPS_ENDPOINT_ALIAS_DOC);
        conf.define(CAMEL_SINK_COAPS_ENDPOINT_CIPHER_SUITES_CONF, ConfigDef.Type.STRING, CAMEL_SINK_COAPS_ENDPOINT_CIPHER_SUITES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_COAPS_ENDPOINT_CIPHER_SUITES_DOC);
        conf.define(CAMEL_SINK_COAPS_ENDPOINT_CLIENT_AUTHENTICATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_COAPS_ENDPOINT_CLIENT_AUTHENTICATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_COAPS_ENDPOINT_CLIENT_AUTHENTICATION_DOC);
        conf.define(CAMEL_SINK_COAPS_ENDPOINT_PRIVATE_KEY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_COAPS_ENDPOINT_PRIVATE_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_COAPS_ENDPOINT_PRIVATE_KEY_DOC);
        conf.define(CAMEL_SINK_COAPS_ENDPOINT_PSK_STORE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_COAPS_ENDPOINT_PSK_STORE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_COAPS_ENDPOINT_PSK_STORE_DOC);
        conf.define(CAMEL_SINK_COAPS_ENDPOINT_PUBLIC_KEY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_COAPS_ENDPOINT_PUBLIC_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_COAPS_ENDPOINT_PUBLIC_KEY_DOC);
        conf.define(CAMEL_SINK_COAPS_ENDPOINT_RECOMMENDED_CIPHER_SUITES_ONLY_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_COAPS_ENDPOINT_RECOMMENDED_CIPHER_SUITES_ONLY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_COAPS_ENDPOINT_RECOMMENDED_CIPHER_SUITES_ONLY_DOC);
        conf.define(CAMEL_SINK_COAPS_ENDPOINT_SSL_CONTEXT_PARAMETERS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_COAPS_ENDPOINT_SSL_CONTEXT_PARAMETERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_COAPS_ENDPOINT_SSL_CONTEXT_PARAMETERS_DOC);
        conf.define(CAMEL_SINK_COAPS_ENDPOINT_TRUSTED_RPK_STORE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_COAPS_ENDPOINT_TRUSTED_RPK_STORE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_COAPS_ENDPOINT_TRUSTED_RPK_STORE_DOC);
        conf.define(CAMEL_SINK_COAPS_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_COAPS_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_COAPS_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_COAPS_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_COAPS_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_COAPS_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SINK_COAPS_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_COAPS_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_COAPS_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_COAPS_COMPONENT_AUTOWIRED_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_COAPS_COMPONENT_AUTOWIRED_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_COAPS_COMPONENT_AUTOWIRED_ENABLED_DOC);
        return conf;
    }
}