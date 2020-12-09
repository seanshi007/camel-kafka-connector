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
package org.apache.camel.kafkaconnector.aws2sns;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelAws2snsSinkConnectorConfig extends CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_AWS2SNS_PATH_TOPIC_NAME_OR_ARN_CONF = "camel.sink.path.topicNameOrArn";
    public static final String CAMEL_SINK_AWS2SNS_PATH_TOPIC_NAME_OR_ARN_DOC = "Topic name or ARN";
    public static final String CAMEL_SINK_AWS2SNS_PATH_TOPIC_NAME_OR_ARN_DEFAULT = null;
    public static final String CAMEL_SINK_AWS2SNS_ENDPOINT_AMAZON_SNSCLIENT_CONF = "camel.sink.endpoint.amazonSNSClient";
    public static final String CAMEL_SINK_AWS2SNS_ENDPOINT_AMAZON_SNSCLIENT_DOC = "To use the AmazonSNS as the client";
    public static final String CAMEL_SINK_AWS2SNS_ENDPOINT_AMAZON_SNSCLIENT_DEFAULT = null;
    public static final String CAMEL_SINK_AWS2SNS_ENDPOINT_AUTO_CREATE_TOPIC_CONF = "camel.sink.endpoint.autoCreateTopic";
    public static final String CAMEL_SINK_AWS2SNS_ENDPOINT_AUTO_CREATE_TOPIC_DOC = "Setting the autocreation of the topic";
    public static final Boolean CAMEL_SINK_AWS2SNS_ENDPOINT_AUTO_CREATE_TOPIC_DEFAULT = true;
    public static final String CAMEL_SINK_AWS2SNS_ENDPOINT_HEADER_FILTER_STRATEGY_CONF = "camel.sink.endpoint.headerFilterStrategy";
    public static final String CAMEL_SINK_AWS2SNS_ENDPOINT_HEADER_FILTER_STRATEGY_DOC = "To use a custom HeaderFilterStrategy to map headers to/from Camel.";
    public static final String CAMEL_SINK_AWS2SNS_ENDPOINT_HEADER_FILTER_STRATEGY_DEFAULT = null;
    public static final String CAMEL_SINK_AWS2SNS_ENDPOINT_KMS_MASTER_KEY_ID_CONF = "camel.sink.endpoint.kmsMasterKeyId";
    public static final String CAMEL_SINK_AWS2SNS_ENDPOINT_KMS_MASTER_KEY_ID_DOC = "The ID of an AWS-managed customer master key (CMK) for Amazon SNS or a custom CMK.";
    public static final String CAMEL_SINK_AWS2SNS_ENDPOINT_KMS_MASTER_KEY_ID_DEFAULT = null;
    public static final String CAMEL_SINK_AWS2SNS_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_AWS2SNS_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_AWS2SNS_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_AWS2SNS_ENDPOINT_MESSAGE_DEDUPLICATION_ID_STRATEGY_CONF = "camel.sink.endpoint.messageDeduplicationIdStrategy";
    public static final String CAMEL_SINK_AWS2SNS_ENDPOINT_MESSAGE_DEDUPLICATION_ID_STRATEGY_DOC = "Only for FIFO Topic. Strategy for setting the messageDeduplicationId on the message. Can be one of the following options: useExchangeId, useContentBasedDeduplication. For the useContentBasedDeduplication option, no messageDeduplicationId will be set on the message. One of: [useExchangeId] [useContentBasedDeduplication]";
    public static final String CAMEL_SINK_AWS2SNS_ENDPOINT_MESSAGE_DEDUPLICATION_ID_STRATEGY_DEFAULT = "useExchangeId";
    public static final String CAMEL_SINK_AWS2SNS_ENDPOINT_MESSAGE_GROUP_ID_STRATEGY_CONF = "camel.sink.endpoint.messageGroupIdStrategy";
    public static final String CAMEL_SINK_AWS2SNS_ENDPOINT_MESSAGE_GROUP_ID_STRATEGY_DOC = "Only for FIFO Topic. Strategy for setting the messageGroupId on the message. Can be one of the following options: useConstant, useExchangeId, usePropertyValue. For the usePropertyValue option, the value of property CamelAwsMessageGroupId will be used. One of: [useConstant] [useExchangeId] [usePropertyValue]";
    public static final String CAMEL_SINK_AWS2SNS_ENDPOINT_MESSAGE_GROUP_ID_STRATEGY_DEFAULT = null;
    public static final String CAMEL_SINK_AWS2SNS_ENDPOINT_MESSAGE_STRUCTURE_CONF = "camel.sink.endpoint.messageStructure";
    public static final String CAMEL_SINK_AWS2SNS_ENDPOINT_MESSAGE_STRUCTURE_DOC = "The message structure to use such as json";
    public static final String CAMEL_SINK_AWS2SNS_ENDPOINT_MESSAGE_STRUCTURE_DEFAULT = null;
    public static final String CAMEL_SINK_AWS2SNS_ENDPOINT_POLICY_CONF = "camel.sink.endpoint.policy";
    public static final String CAMEL_SINK_AWS2SNS_ENDPOINT_POLICY_DOC = "The policy for this queue";
    public static final String CAMEL_SINK_AWS2SNS_ENDPOINT_POLICY_DEFAULT = null;
    public static final String CAMEL_SINK_AWS2SNS_ENDPOINT_PROXY_HOST_CONF = "camel.sink.endpoint.proxyHost";
    public static final String CAMEL_SINK_AWS2SNS_ENDPOINT_PROXY_HOST_DOC = "To define a proxy host when instantiating the SNS client";
    public static final String CAMEL_SINK_AWS2SNS_ENDPOINT_PROXY_HOST_DEFAULT = null;
    public static final String CAMEL_SINK_AWS2SNS_ENDPOINT_PROXY_PORT_CONF = "camel.sink.endpoint.proxyPort";
    public static final String CAMEL_SINK_AWS2SNS_ENDPOINT_PROXY_PORT_DOC = "To define a proxy port when instantiating the SNS client";
    public static final String CAMEL_SINK_AWS2SNS_ENDPOINT_PROXY_PORT_DEFAULT = null;
    public static final String CAMEL_SINK_AWS2SNS_ENDPOINT_PROXY_PROTOCOL_CONF = "camel.sink.endpoint.proxyProtocol";
    public static final String CAMEL_SINK_AWS2SNS_ENDPOINT_PROXY_PROTOCOL_DOC = "To define a proxy protocol when instantiating the SNS client One of: [HTTP] [HTTPS]";
    public static final String CAMEL_SINK_AWS2SNS_ENDPOINT_PROXY_PROTOCOL_DEFAULT = "HTTPS";
    public static final String CAMEL_SINK_AWS2SNS_ENDPOINT_QUEUE_URL_CONF = "camel.sink.endpoint.queueUrl";
    public static final String CAMEL_SINK_AWS2SNS_ENDPOINT_QUEUE_URL_DOC = "The queueUrl to subscribe to";
    public static final String CAMEL_SINK_AWS2SNS_ENDPOINT_QUEUE_URL_DEFAULT = null;
    public static final String CAMEL_SINK_AWS2SNS_ENDPOINT_REGION_CONF = "camel.sink.endpoint.region";
    public static final String CAMEL_SINK_AWS2SNS_ENDPOINT_REGION_DOC = "The region in which SNS client needs to work. When using this parameter, the configuration will expect the lowercase name of the region (for example ap-east-1) You'll need to use the name Region.EU_WEST_1.id()";
    public static final String CAMEL_SINK_AWS2SNS_ENDPOINT_REGION_DEFAULT = null;
    public static final String CAMEL_SINK_AWS2SNS_ENDPOINT_SERVER_SIDE_ENCRYPTION_ENABLED_CONF = "camel.sink.endpoint.serverSideEncryptionEnabled";
    public static final String CAMEL_SINK_AWS2SNS_ENDPOINT_SERVER_SIDE_ENCRYPTION_ENABLED_DOC = "Define if Server Side Encryption is enabled or not on the topic";
    public static final Boolean CAMEL_SINK_AWS2SNS_ENDPOINT_SERVER_SIDE_ENCRYPTION_ENABLED_DEFAULT = false;
    public static final String CAMEL_SINK_AWS2SNS_ENDPOINT_SUBJECT_CONF = "camel.sink.endpoint.subject";
    public static final String CAMEL_SINK_AWS2SNS_ENDPOINT_SUBJECT_DOC = "The subject which is used if the message header 'CamelAwsSnsSubject' is not present.";
    public static final String CAMEL_SINK_AWS2SNS_ENDPOINT_SUBJECT_DEFAULT = null;
    public static final String CAMEL_SINK_AWS2SNS_ENDPOINT_SUBSCRIBE_SNSTO_SQSCONF = "camel.sink.endpoint.subscribeSNStoSQS";
    public static final String CAMEL_SINK_AWS2SNS_ENDPOINT_SUBSCRIBE_SNSTO_SQSDOC = "Define if the subscription between SNS Topic and SQS must be done or not";
    public static final Boolean CAMEL_SINK_AWS2SNS_ENDPOINT_SUBSCRIBE_SNSTO_SQSDEFAULT = false;
    public static final String CAMEL_SINK_AWS2SNS_ENDPOINT_TRUST_ALL_CERTIFICATES_CONF = "camel.sink.endpoint.trustAllCertificates";
    public static final String CAMEL_SINK_AWS2SNS_ENDPOINT_TRUST_ALL_CERTIFICATES_DOC = "If we want to trust all certificates in case of overriding the endpoint";
    public static final Boolean CAMEL_SINK_AWS2SNS_ENDPOINT_TRUST_ALL_CERTIFICATES_DEFAULT = false;
    public static final String CAMEL_SINK_AWS2SNS_ENDPOINT_USE_DEFAULT_CREDENTIALS_PROVIDER_CONF = "camel.sink.endpoint.useDefaultCredentialsProvider";
    public static final String CAMEL_SINK_AWS2SNS_ENDPOINT_USE_DEFAULT_CREDENTIALS_PROVIDER_DOC = "Set whether the SNS client should expect to load credentials on an AWS infra instance or to expect static credentials to be passed in.";
    public static final Boolean CAMEL_SINK_AWS2SNS_ENDPOINT_USE_DEFAULT_CREDENTIALS_PROVIDER_DEFAULT = false;
    public static final String CAMEL_SINK_AWS2SNS_ENDPOINT_SYNCHRONOUS_CONF = "camel.sink.endpoint.synchronous";
    public static final String CAMEL_SINK_AWS2SNS_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SINK_AWS2SNS_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SINK_AWS2SNS_ENDPOINT_ACCESS_KEY_CONF = "camel.sink.endpoint.accessKey";
    public static final String CAMEL_SINK_AWS2SNS_ENDPOINT_ACCESS_KEY_DOC = "Amazon AWS Access Key";
    public static final String CAMEL_SINK_AWS2SNS_ENDPOINT_ACCESS_KEY_DEFAULT = null;
    public static final String CAMEL_SINK_AWS2SNS_ENDPOINT_SECRET_KEY_CONF = "camel.sink.endpoint.secretKey";
    public static final String CAMEL_SINK_AWS2SNS_ENDPOINT_SECRET_KEY_DOC = "Amazon AWS Secret Key";
    public static final String CAMEL_SINK_AWS2SNS_ENDPOINT_SECRET_KEY_DEFAULT = null;
    public static final String CAMEL_SINK_AWS2SNS_COMPONENT_AMAZON_SNSCLIENT_CONF = "camel.component.aws2-sns.amazonSNSClient";
    public static final String CAMEL_SINK_AWS2SNS_COMPONENT_AMAZON_SNSCLIENT_DOC = "To use the AmazonSNS as the client";
    public static final String CAMEL_SINK_AWS2SNS_COMPONENT_AMAZON_SNSCLIENT_DEFAULT = null;
    public static final String CAMEL_SINK_AWS2SNS_COMPONENT_AUTO_CREATE_TOPIC_CONF = "camel.component.aws2-sns.autoCreateTopic";
    public static final String CAMEL_SINK_AWS2SNS_COMPONENT_AUTO_CREATE_TOPIC_DOC = "Setting the autocreation of the topic";
    public static final Boolean CAMEL_SINK_AWS2SNS_COMPONENT_AUTO_CREATE_TOPIC_DEFAULT = true;
    public static final String CAMEL_SINK_AWS2SNS_COMPONENT_CONFIGURATION_CONF = "camel.component.aws2-sns.configuration";
    public static final String CAMEL_SINK_AWS2SNS_COMPONENT_CONFIGURATION_DOC = "Component configuration";
    public static final String CAMEL_SINK_AWS2SNS_COMPONENT_CONFIGURATION_DEFAULT = null;
    public static final String CAMEL_SINK_AWS2SNS_COMPONENT_KMS_MASTER_KEY_ID_CONF = "camel.component.aws2-sns.kmsMasterKeyId";
    public static final String CAMEL_SINK_AWS2SNS_COMPONENT_KMS_MASTER_KEY_ID_DOC = "The ID of an AWS-managed customer master key (CMK) for Amazon SNS or a custom CMK.";
    public static final String CAMEL_SINK_AWS2SNS_COMPONENT_KMS_MASTER_KEY_ID_DEFAULT = null;
    public static final String CAMEL_SINK_AWS2SNS_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.aws2-sns.lazyStartProducer";
    public static final String CAMEL_SINK_AWS2SNS_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_AWS2SNS_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_AWS2SNS_COMPONENT_MESSAGE_DEDUPLICATION_ID_STRATEGY_CONF = "camel.component.aws2-sns.messageDeduplicationIdStrategy";
    public static final String CAMEL_SINK_AWS2SNS_COMPONENT_MESSAGE_DEDUPLICATION_ID_STRATEGY_DOC = "Only for FIFO Topic. Strategy for setting the messageDeduplicationId on the message. Can be one of the following options: useExchangeId, useContentBasedDeduplication. For the useContentBasedDeduplication option, no messageDeduplicationId will be set on the message. One of: [useExchangeId] [useContentBasedDeduplication]";
    public static final String CAMEL_SINK_AWS2SNS_COMPONENT_MESSAGE_DEDUPLICATION_ID_STRATEGY_DEFAULT = "useExchangeId";
    public static final String CAMEL_SINK_AWS2SNS_COMPONENT_MESSAGE_GROUP_ID_STRATEGY_CONF = "camel.component.aws2-sns.messageGroupIdStrategy";
    public static final String CAMEL_SINK_AWS2SNS_COMPONENT_MESSAGE_GROUP_ID_STRATEGY_DOC = "Only for FIFO Topic. Strategy for setting the messageGroupId on the message. Can be one of the following options: useConstant, useExchangeId, usePropertyValue. For the usePropertyValue option, the value of property CamelAwsMessageGroupId will be used. One of: [useConstant] [useExchangeId] [usePropertyValue]";
    public static final String CAMEL_SINK_AWS2SNS_COMPONENT_MESSAGE_GROUP_ID_STRATEGY_DEFAULT = null;
    public static final String CAMEL_SINK_AWS2SNS_COMPONENT_MESSAGE_STRUCTURE_CONF = "camel.component.aws2-sns.messageStructure";
    public static final String CAMEL_SINK_AWS2SNS_COMPONENT_MESSAGE_STRUCTURE_DOC = "The message structure to use such as json";
    public static final String CAMEL_SINK_AWS2SNS_COMPONENT_MESSAGE_STRUCTURE_DEFAULT = null;
    public static final String CAMEL_SINK_AWS2SNS_COMPONENT_POLICY_CONF = "camel.component.aws2-sns.policy";
    public static final String CAMEL_SINK_AWS2SNS_COMPONENT_POLICY_DOC = "The policy for this queue";
    public static final String CAMEL_SINK_AWS2SNS_COMPONENT_POLICY_DEFAULT = null;
    public static final String CAMEL_SINK_AWS2SNS_COMPONENT_PROXY_HOST_CONF = "camel.component.aws2-sns.proxyHost";
    public static final String CAMEL_SINK_AWS2SNS_COMPONENT_PROXY_HOST_DOC = "To define a proxy host when instantiating the SNS client";
    public static final String CAMEL_SINK_AWS2SNS_COMPONENT_PROXY_HOST_DEFAULT = null;
    public static final String CAMEL_SINK_AWS2SNS_COMPONENT_PROXY_PORT_CONF = "camel.component.aws2-sns.proxyPort";
    public static final String CAMEL_SINK_AWS2SNS_COMPONENT_PROXY_PORT_DOC = "To define a proxy port when instantiating the SNS client";
    public static final String CAMEL_SINK_AWS2SNS_COMPONENT_PROXY_PORT_DEFAULT = null;
    public static final String CAMEL_SINK_AWS2SNS_COMPONENT_PROXY_PROTOCOL_CONF = "camel.component.aws2-sns.proxyProtocol";
    public static final String CAMEL_SINK_AWS2SNS_COMPONENT_PROXY_PROTOCOL_DOC = "To define a proxy protocol when instantiating the SNS client One of: [HTTP] [HTTPS]";
    public static final String CAMEL_SINK_AWS2SNS_COMPONENT_PROXY_PROTOCOL_DEFAULT = "HTTPS";
    public static final String CAMEL_SINK_AWS2SNS_COMPONENT_QUEUE_URL_CONF = "camel.component.aws2-sns.queueUrl";
    public static final String CAMEL_SINK_AWS2SNS_COMPONENT_QUEUE_URL_DOC = "The queueUrl to subscribe to";
    public static final String CAMEL_SINK_AWS2SNS_COMPONENT_QUEUE_URL_DEFAULT = null;
    public static final String CAMEL_SINK_AWS2SNS_COMPONENT_REGION_CONF = "camel.component.aws2-sns.region";
    public static final String CAMEL_SINK_AWS2SNS_COMPONENT_REGION_DOC = "The region in which SNS client needs to work. When using this parameter, the configuration will expect the lowercase name of the region (for example ap-east-1) You'll need to use the name Region.EU_WEST_1.id()";
    public static final String CAMEL_SINK_AWS2SNS_COMPONENT_REGION_DEFAULT = null;
    public static final String CAMEL_SINK_AWS2SNS_COMPONENT_SERVER_SIDE_ENCRYPTION_ENABLED_CONF = "camel.component.aws2-sns.serverSideEncryptionEnabled";
    public static final String CAMEL_SINK_AWS2SNS_COMPONENT_SERVER_SIDE_ENCRYPTION_ENABLED_DOC = "Define if Server Side Encryption is enabled or not on the topic";
    public static final Boolean CAMEL_SINK_AWS2SNS_COMPONENT_SERVER_SIDE_ENCRYPTION_ENABLED_DEFAULT = false;
    public static final String CAMEL_SINK_AWS2SNS_COMPONENT_SUBJECT_CONF = "camel.component.aws2-sns.subject";
    public static final String CAMEL_SINK_AWS2SNS_COMPONENT_SUBJECT_DOC = "The subject which is used if the message header 'CamelAwsSnsSubject' is not present.";
    public static final String CAMEL_SINK_AWS2SNS_COMPONENT_SUBJECT_DEFAULT = null;
    public static final String CAMEL_SINK_AWS2SNS_COMPONENT_SUBSCRIBE_SNSTO_SQSCONF = "camel.component.aws2-sns.subscribeSNStoSQS";
    public static final String CAMEL_SINK_AWS2SNS_COMPONENT_SUBSCRIBE_SNSTO_SQSDOC = "Define if the subscription between SNS Topic and SQS must be done or not";
    public static final Boolean CAMEL_SINK_AWS2SNS_COMPONENT_SUBSCRIBE_SNSTO_SQSDEFAULT = false;
    public static final String CAMEL_SINK_AWS2SNS_COMPONENT_TRUST_ALL_CERTIFICATES_CONF = "camel.component.aws2-sns.trustAllCertificates";
    public static final String CAMEL_SINK_AWS2SNS_COMPONENT_TRUST_ALL_CERTIFICATES_DOC = "If we want to trust all certificates in case of overriding the endpoint";
    public static final Boolean CAMEL_SINK_AWS2SNS_COMPONENT_TRUST_ALL_CERTIFICATES_DEFAULT = false;
    public static final String CAMEL_SINK_AWS2SNS_COMPONENT_USE_DEFAULT_CREDENTIALS_PROVIDER_CONF = "camel.component.aws2-sns.useDefaultCredentialsProvider";
    public static final String CAMEL_SINK_AWS2SNS_COMPONENT_USE_DEFAULT_CREDENTIALS_PROVIDER_DOC = "Set whether the SNS client should expect to load credentials on an AWS infra instance or to expect static credentials to be passed in.";
    public static final Boolean CAMEL_SINK_AWS2SNS_COMPONENT_USE_DEFAULT_CREDENTIALS_PROVIDER_DEFAULT = false;
    public static final String CAMEL_SINK_AWS2SNS_COMPONENT_AUTOWIRED_ENABLED_CONF = "camel.component.aws2-sns.autowiredEnabled";
    public static final String CAMEL_SINK_AWS2SNS_COMPONENT_AUTOWIRED_ENABLED_DOC = "Whether autowiring is enabled. This is used for automatic autowiring options (the option must be marked as autowired) by looking up in the registry to find if there is a single instance of matching type, which then gets configured on the component. This can be used for automatic configuring JDBC data sources, JMS connection factories, AWS Clients, etc.";
    public static final Boolean CAMEL_SINK_AWS2SNS_COMPONENT_AUTOWIRED_ENABLED_DEFAULT = true;
    public static final String CAMEL_SINK_AWS2SNS_COMPONENT_ACCESS_KEY_CONF = "camel.component.aws2-sns.accessKey";
    public static final String CAMEL_SINK_AWS2SNS_COMPONENT_ACCESS_KEY_DOC = "Amazon AWS Access Key";
    public static final String CAMEL_SINK_AWS2SNS_COMPONENT_ACCESS_KEY_DEFAULT = null;
    public static final String CAMEL_SINK_AWS2SNS_COMPONENT_SECRET_KEY_CONF = "camel.component.aws2-sns.secretKey";
    public static final String CAMEL_SINK_AWS2SNS_COMPONENT_SECRET_KEY_DOC = "Amazon AWS Secret Key";
    public static final String CAMEL_SINK_AWS2SNS_COMPONENT_SECRET_KEY_DEFAULT = null;

    public CamelAws2snsSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelAws2snsSinkConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_AWS2SNS_PATH_TOPIC_NAME_OR_ARN_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWS2SNS_PATH_TOPIC_NAME_OR_ARN_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_AWS2SNS_PATH_TOPIC_NAME_OR_ARN_DOC);
        conf.define(CAMEL_SINK_AWS2SNS_ENDPOINT_AMAZON_SNSCLIENT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWS2SNS_ENDPOINT_AMAZON_SNSCLIENT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWS2SNS_ENDPOINT_AMAZON_SNSCLIENT_DOC);
        conf.define(CAMEL_SINK_AWS2SNS_ENDPOINT_AUTO_CREATE_TOPIC_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AWS2SNS_ENDPOINT_AUTO_CREATE_TOPIC_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWS2SNS_ENDPOINT_AUTO_CREATE_TOPIC_DOC);
        conf.define(CAMEL_SINK_AWS2SNS_ENDPOINT_HEADER_FILTER_STRATEGY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWS2SNS_ENDPOINT_HEADER_FILTER_STRATEGY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWS2SNS_ENDPOINT_HEADER_FILTER_STRATEGY_DOC);
        conf.define(CAMEL_SINK_AWS2SNS_ENDPOINT_KMS_MASTER_KEY_ID_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWS2SNS_ENDPOINT_KMS_MASTER_KEY_ID_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWS2SNS_ENDPOINT_KMS_MASTER_KEY_ID_DOC);
        conf.define(CAMEL_SINK_AWS2SNS_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AWS2SNS_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWS2SNS_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_AWS2SNS_ENDPOINT_MESSAGE_DEDUPLICATION_ID_STRATEGY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWS2SNS_ENDPOINT_MESSAGE_DEDUPLICATION_ID_STRATEGY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWS2SNS_ENDPOINT_MESSAGE_DEDUPLICATION_ID_STRATEGY_DOC);
        conf.define(CAMEL_SINK_AWS2SNS_ENDPOINT_MESSAGE_GROUP_ID_STRATEGY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWS2SNS_ENDPOINT_MESSAGE_GROUP_ID_STRATEGY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWS2SNS_ENDPOINT_MESSAGE_GROUP_ID_STRATEGY_DOC);
        conf.define(CAMEL_SINK_AWS2SNS_ENDPOINT_MESSAGE_STRUCTURE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWS2SNS_ENDPOINT_MESSAGE_STRUCTURE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWS2SNS_ENDPOINT_MESSAGE_STRUCTURE_DOC);
        conf.define(CAMEL_SINK_AWS2SNS_ENDPOINT_POLICY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWS2SNS_ENDPOINT_POLICY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWS2SNS_ENDPOINT_POLICY_DOC);
        conf.define(CAMEL_SINK_AWS2SNS_ENDPOINT_PROXY_HOST_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWS2SNS_ENDPOINT_PROXY_HOST_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWS2SNS_ENDPOINT_PROXY_HOST_DOC);
        conf.define(CAMEL_SINK_AWS2SNS_ENDPOINT_PROXY_PORT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWS2SNS_ENDPOINT_PROXY_PORT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWS2SNS_ENDPOINT_PROXY_PORT_DOC);
        conf.define(CAMEL_SINK_AWS2SNS_ENDPOINT_PROXY_PROTOCOL_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWS2SNS_ENDPOINT_PROXY_PROTOCOL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWS2SNS_ENDPOINT_PROXY_PROTOCOL_DOC);
        conf.define(CAMEL_SINK_AWS2SNS_ENDPOINT_QUEUE_URL_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWS2SNS_ENDPOINT_QUEUE_URL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWS2SNS_ENDPOINT_QUEUE_URL_DOC);
        conf.define(CAMEL_SINK_AWS2SNS_ENDPOINT_REGION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWS2SNS_ENDPOINT_REGION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWS2SNS_ENDPOINT_REGION_DOC);
        conf.define(CAMEL_SINK_AWS2SNS_ENDPOINT_SERVER_SIDE_ENCRYPTION_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AWS2SNS_ENDPOINT_SERVER_SIDE_ENCRYPTION_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWS2SNS_ENDPOINT_SERVER_SIDE_ENCRYPTION_ENABLED_DOC);
        conf.define(CAMEL_SINK_AWS2SNS_ENDPOINT_SUBJECT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWS2SNS_ENDPOINT_SUBJECT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWS2SNS_ENDPOINT_SUBJECT_DOC);
        conf.define(CAMEL_SINK_AWS2SNS_ENDPOINT_SUBSCRIBE_SNSTO_SQSCONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AWS2SNS_ENDPOINT_SUBSCRIBE_SNSTO_SQSDEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWS2SNS_ENDPOINT_SUBSCRIBE_SNSTO_SQSDOC);
        conf.define(CAMEL_SINK_AWS2SNS_ENDPOINT_TRUST_ALL_CERTIFICATES_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AWS2SNS_ENDPOINT_TRUST_ALL_CERTIFICATES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWS2SNS_ENDPOINT_TRUST_ALL_CERTIFICATES_DOC);
        conf.define(CAMEL_SINK_AWS2SNS_ENDPOINT_USE_DEFAULT_CREDENTIALS_PROVIDER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AWS2SNS_ENDPOINT_USE_DEFAULT_CREDENTIALS_PROVIDER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWS2SNS_ENDPOINT_USE_DEFAULT_CREDENTIALS_PROVIDER_DOC);
        conf.define(CAMEL_SINK_AWS2SNS_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AWS2SNS_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWS2SNS_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SINK_AWS2SNS_ENDPOINT_ACCESS_KEY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWS2SNS_ENDPOINT_ACCESS_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWS2SNS_ENDPOINT_ACCESS_KEY_DOC);
        conf.define(CAMEL_SINK_AWS2SNS_ENDPOINT_SECRET_KEY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWS2SNS_ENDPOINT_SECRET_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWS2SNS_ENDPOINT_SECRET_KEY_DOC);
        conf.define(CAMEL_SINK_AWS2SNS_COMPONENT_AMAZON_SNSCLIENT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWS2SNS_COMPONENT_AMAZON_SNSCLIENT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWS2SNS_COMPONENT_AMAZON_SNSCLIENT_DOC);
        conf.define(CAMEL_SINK_AWS2SNS_COMPONENT_AUTO_CREATE_TOPIC_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AWS2SNS_COMPONENT_AUTO_CREATE_TOPIC_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWS2SNS_COMPONENT_AUTO_CREATE_TOPIC_DOC);
        conf.define(CAMEL_SINK_AWS2SNS_COMPONENT_CONFIGURATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWS2SNS_COMPONENT_CONFIGURATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWS2SNS_COMPONENT_CONFIGURATION_DOC);
        conf.define(CAMEL_SINK_AWS2SNS_COMPONENT_KMS_MASTER_KEY_ID_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWS2SNS_COMPONENT_KMS_MASTER_KEY_ID_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWS2SNS_COMPONENT_KMS_MASTER_KEY_ID_DOC);
        conf.define(CAMEL_SINK_AWS2SNS_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AWS2SNS_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWS2SNS_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_AWS2SNS_COMPONENT_MESSAGE_DEDUPLICATION_ID_STRATEGY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWS2SNS_COMPONENT_MESSAGE_DEDUPLICATION_ID_STRATEGY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWS2SNS_COMPONENT_MESSAGE_DEDUPLICATION_ID_STRATEGY_DOC);
        conf.define(CAMEL_SINK_AWS2SNS_COMPONENT_MESSAGE_GROUP_ID_STRATEGY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWS2SNS_COMPONENT_MESSAGE_GROUP_ID_STRATEGY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWS2SNS_COMPONENT_MESSAGE_GROUP_ID_STRATEGY_DOC);
        conf.define(CAMEL_SINK_AWS2SNS_COMPONENT_MESSAGE_STRUCTURE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWS2SNS_COMPONENT_MESSAGE_STRUCTURE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWS2SNS_COMPONENT_MESSAGE_STRUCTURE_DOC);
        conf.define(CAMEL_SINK_AWS2SNS_COMPONENT_POLICY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWS2SNS_COMPONENT_POLICY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWS2SNS_COMPONENT_POLICY_DOC);
        conf.define(CAMEL_SINK_AWS2SNS_COMPONENT_PROXY_HOST_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWS2SNS_COMPONENT_PROXY_HOST_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWS2SNS_COMPONENT_PROXY_HOST_DOC);
        conf.define(CAMEL_SINK_AWS2SNS_COMPONENT_PROXY_PORT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWS2SNS_COMPONENT_PROXY_PORT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWS2SNS_COMPONENT_PROXY_PORT_DOC);
        conf.define(CAMEL_SINK_AWS2SNS_COMPONENT_PROXY_PROTOCOL_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWS2SNS_COMPONENT_PROXY_PROTOCOL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWS2SNS_COMPONENT_PROXY_PROTOCOL_DOC);
        conf.define(CAMEL_SINK_AWS2SNS_COMPONENT_QUEUE_URL_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWS2SNS_COMPONENT_QUEUE_URL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWS2SNS_COMPONENT_QUEUE_URL_DOC);
        conf.define(CAMEL_SINK_AWS2SNS_COMPONENT_REGION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWS2SNS_COMPONENT_REGION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWS2SNS_COMPONENT_REGION_DOC);
        conf.define(CAMEL_SINK_AWS2SNS_COMPONENT_SERVER_SIDE_ENCRYPTION_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AWS2SNS_COMPONENT_SERVER_SIDE_ENCRYPTION_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWS2SNS_COMPONENT_SERVER_SIDE_ENCRYPTION_ENABLED_DOC);
        conf.define(CAMEL_SINK_AWS2SNS_COMPONENT_SUBJECT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWS2SNS_COMPONENT_SUBJECT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWS2SNS_COMPONENT_SUBJECT_DOC);
        conf.define(CAMEL_SINK_AWS2SNS_COMPONENT_SUBSCRIBE_SNSTO_SQSCONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AWS2SNS_COMPONENT_SUBSCRIBE_SNSTO_SQSDEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWS2SNS_COMPONENT_SUBSCRIBE_SNSTO_SQSDOC);
        conf.define(CAMEL_SINK_AWS2SNS_COMPONENT_TRUST_ALL_CERTIFICATES_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AWS2SNS_COMPONENT_TRUST_ALL_CERTIFICATES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWS2SNS_COMPONENT_TRUST_ALL_CERTIFICATES_DOC);
        conf.define(CAMEL_SINK_AWS2SNS_COMPONENT_USE_DEFAULT_CREDENTIALS_PROVIDER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AWS2SNS_COMPONENT_USE_DEFAULT_CREDENTIALS_PROVIDER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWS2SNS_COMPONENT_USE_DEFAULT_CREDENTIALS_PROVIDER_DOC);
        conf.define(CAMEL_SINK_AWS2SNS_COMPONENT_AUTOWIRED_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AWS2SNS_COMPONENT_AUTOWIRED_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWS2SNS_COMPONENT_AUTOWIRED_ENABLED_DOC);
        conf.define(CAMEL_SINK_AWS2SNS_COMPONENT_ACCESS_KEY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWS2SNS_COMPONENT_ACCESS_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWS2SNS_COMPONENT_ACCESS_KEY_DOC);
        conf.define(CAMEL_SINK_AWS2SNS_COMPONENT_SECRET_KEY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWS2SNS_COMPONENT_SECRET_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWS2SNS_COMPONENT_SECRET_KEY_DOC);
        return conf;
    }
}