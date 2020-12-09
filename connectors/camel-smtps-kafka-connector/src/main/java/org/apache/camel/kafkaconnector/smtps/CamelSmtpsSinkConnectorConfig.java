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
package org.apache.camel.kafkaconnector.smtps;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelSmtpsSinkConnectorConfig extends CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_SMTPS_PATH_HOST_CONF = "camel.sink.path.host";
    public static final String CAMEL_SINK_SMTPS_PATH_HOST_DOC = "The mail server host name";
    public static final String CAMEL_SINK_SMTPS_PATH_HOST_DEFAULT = null;
    public static final String CAMEL_SINK_SMTPS_PATH_PORT_CONF = "camel.sink.path.port";
    public static final String CAMEL_SINK_SMTPS_PATH_PORT_DOC = "The port number of the mail server";
    public static final Integer CAMEL_SINK_SMTPS_PATH_PORT_DEFAULT = null;
    public static final String CAMEL_SINK_SMTPS_ENDPOINT_BCC_CONF = "camel.sink.endpoint.bcc";
    public static final String CAMEL_SINK_SMTPS_ENDPOINT_BCC_DOC = "Sets the BCC email address. Separate multiple email addresses with comma.";
    public static final String CAMEL_SINK_SMTPS_ENDPOINT_BCC_DEFAULT = null;
    public static final String CAMEL_SINK_SMTPS_ENDPOINT_CC_CONF = "camel.sink.endpoint.cc";
    public static final String CAMEL_SINK_SMTPS_ENDPOINT_CC_DOC = "Sets the CC email address. Separate multiple email addresses with comma.";
    public static final String CAMEL_SINK_SMTPS_ENDPOINT_CC_DEFAULT = null;
    public static final String CAMEL_SINK_SMTPS_ENDPOINT_FROM_CONF = "camel.sink.endpoint.from";
    public static final String CAMEL_SINK_SMTPS_ENDPOINT_FROM_DOC = "The from email address";
    public static final String CAMEL_SINK_SMTPS_ENDPOINT_FROM_DEFAULT = "camel@localhost";
    public static final String CAMEL_SINK_SMTPS_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_SMTPS_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_SMTPS_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_SMTPS_ENDPOINT_REPLY_TO_CONF = "camel.sink.endpoint.replyTo";
    public static final String CAMEL_SINK_SMTPS_ENDPOINT_REPLY_TO_DOC = "The Reply-To recipients (the receivers of the response mail). Separate multiple email addresses with a comma.";
    public static final String CAMEL_SINK_SMTPS_ENDPOINT_REPLY_TO_DEFAULT = null;
    public static final String CAMEL_SINK_SMTPS_ENDPOINT_SUBJECT_CONF = "camel.sink.endpoint.subject";
    public static final String CAMEL_SINK_SMTPS_ENDPOINT_SUBJECT_DOC = "The Subject of the message being sent. Note: Setting the subject in the header takes precedence over this option.";
    public static final String CAMEL_SINK_SMTPS_ENDPOINT_SUBJECT_DEFAULT = null;
    public static final String CAMEL_SINK_SMTPS_ENDPOINT_TO_CONF = "camel.sink.endpoint.to";
    public static final String CAMEL_SINK_SMTPS_ENDPOINT_TO_DOC = "Sets the To email address. Separate multiple email addresses with comma.";
    public static final String CAMEL_SINK_SMTPS_ENDPOINT_TO_DEFAULT = null;
    public static final String CAMEL_SINK_SMTPS_ENDPOINT_JAVA_MAIL_SENDER_CONF = "camel.sink.endpoint.javaMailSender";
    public static final String CAMEL_SINK_SMTPS_ENDPOINT_JAVA_MAIL_SENDER_DOC = "To use a custom org.apache.camel.component.mail.JavaMailSender for sending emails.";
    public static final String CAMEL_SINK_SMTPS_ENDPOINT_JAVA_MAIL_SENDER_DEFAULT = null;
    public static final String CAMEL_SINK_SMTPS_ENDPOINT_ADDITIONAL_JAVA_MAIL_PROPERTIES_CONF = "camel.sink.endpoint.additionalJavaMailProperties";
    public static final String CAMEL_SINK_SMTPS_ENDPOINT_ADDITIONAL_JAVA_MAIL_PROPERTIES_DOC = "Sets additional java mail properties, that will append/override any default properties that is set based on all the other options. This is useful if you need to add some special options but want to keep the others as is.";
    public static final String CAMEL_SINK_SMTPS_ENDPOINT_ADDITIONAL_JAVA_MAIL_PROPERTIES_DEFAULT = null;
    public static final String CAMEL_SINK_SMTPS_ENDPOINT_ALTERNATIVE_BODY_HEADER_CONF = "camel.sink.endpoint.alternativeBodyHeader";
    public static final String CAMEL_SINK_SMTPS_ENDPOINT_ALTERNATIVE_BODY_HEADER_DOC = "Specifies the key to an IN message header that contains an alternative email body. For example, if you send emails in text/html format and want to provide an alternative mail body for non-HTML email clients, set the alternative mail body with this key as a header.";
    public static final String CAMEL_SINK_SMTPS_ENDPOINT_ALTERNATIVE_BODY_HEADER_DEFAULT = "CamelMailAlternativeBody";
    public static final String CAMEL_SINK_SMTPS_ENDPOINT_ATTACHMENTS_CONTENT_TRANSFER_ENCODING_RESOLVER_CONF = "camel.sink.endpoint.attachmentsContentTransferEncodingResolver";
    public static final String CAMEL_SINK_SMTPS_ENDPOINT_ATTACHMENTS_CONTENT_TRANSFER_ENCODING_RESOLVER_DOC = "To use a custom AttachmentsContentTransferEncodingResolver to resolve what content-type-encoding to use for attachments.";
    public static final String CAMEL_SINK_SMTPS_ENDPOINT_ATTACHMENTS_CONTENT_TRANSFER_ENCODING_RESOLVER_DEFAULT = null;
    public static final String CAMEL_SINK_SMTPS_ENDPOINT_AUTHENTICATOR_CONF = "camel.sink.endpoint.authenticator";
    public static final String CAMEL_SINK_SMTPS_ENDPOINT_AUTHENTICATOR_DOC = "The authenticator for login. If set then the password and username are ignored. Can be used for tokens which can expire and therefore must be read dynamically.";
    public static final String CAMEL_SINK_SMTPS_ENDPOINT_AUTHENTICATOR_DEFAULT = null;
    public static final String CAMEL_SINK_SMTPS_ENDPOINT_BINDING_CONF = "camel.sink.endpoint.binding";
    public static final String CAMEL_SINK_SMTPS_ENDPOINT_BINDING_DOC = "Sets the binding used to convert from a Camel message to and from a Mail message";
    public static final String CAMEL_SINK_SMTPS_ENDPOINT_BINDING_DEFAULT = null;
    public static final String CAMEL_SINK_SMTPS_ENDPOINT_CONNECTION_TIMEOUT_CONF = "camel.sink.endpoint.connectionTimeout";
    public static final String CAMEL_SINK_SMTPS_ENDPOINT_CONNECTION_TIMEOUT_DOC = "The connection timeout in milliseconds.";
    public static final Integer CAMEL_SINK_SMTPS_ENDPOINT_CONNECTION_TIMEOUT_DEFAULT = 30000;
    public static final String CAMEL_SINK_SMTPS_ENDPOINT_CONTENT_TYPE_CONF = "camel.sink.endpoint.contentType";
    public static final String CAMEL_SINK_SMTPS_ENDPOINT_CONTENT_TYPE_DOC = "The mail message content type. Use text/html for HTML mails.";
    public static final String CAMEL_SINK_SMTPS_ENDPOINT_CONTENT_TYPE_DEFAULT = "text/plain";
    public static final String CAMEL_SINK_SMTPS_ENDPOINT_CONTENT_TYPE_RESOLVER_CONF = "camel.sink.endpoint.contentTypeResolver";
    public static final String CAMEL_SINK_SMTPS_ENDPOINT_CONTENT_TYPE_RESOLVER_DOC = "Resolver to determine Content-Type for file attachments.";
    public static final String CAMEL_SINK_SMTPS_ENDPOINT_CONTENT_TYPE_RESOLVER_DEFAULT = null;
    public static final String CAMEL_SINK_SMTPS_ENDPOINT_DEBUG_MODE_CONF = "camel.sink.endpoint.debugMode";
    public static final String CAMEL_SINK_SMTPS_ENDPOINT_DEBUG_MODE_DOC = "Enable debug mode on the underlying mail framework. The SUN Mail framework logs the debug messages to System.out by default.";
    public static final Boolean CAMEL_SINK_SMTPS_ENDPOINT_DEBUG_MODE_DEFAULT = false;
    public static final String CAMEL_SINK_SMTPS_ENDPOINT_HEADER_FILTER_STRATEGY_CONF = "camel.sink.endpoint.headerFilterStrategy";
    public static final String CAMEL_SINK_SMTPS_ENDPOINT_HEADER_FILTER_STRATEGY_DOC = "To use a custom org.apache.camel.spi.HeaderFilterStrategy to filter headers.";
    public static final String CAMEL_SINK_SMTPS_ENDPOINT_HEADER_FILTER_STRATEGY_DEFAULT = null;
    public static final String CAMEL_SINK_SMTPS_ENDPOINT_IGNORE_UNSUPPORTED_CHARSET_CONF = "camel.sink.endpoint.ignoreUnsupportedCharset";
    public static final String CAMEL_SINK_SMTPS_ENDPOINT_IGNORE_UNSUPPORTED_CHARSET_DOC = "Option to let Camel ignore unsupported charset in the local JVM when sending mails. If the charset is unsupported then charset=XXX (where XXX represents the unsupported charset) is removed from the content-type and it relies on the platform default instead.";
    public static final Boolean CAMEL_SINK_SMTPS_ENDPOINT_IGNORE_UNSUPPORTED_CHARSET_DEFAULT = false;
    public static final String CAMEL_SINK_SMTPS_ENDPOINT_IGNORE_URI_SCHEME_CONF = "camel.sink.endpoint.ignoreUriScheme";
    public static final String CAMEL_SINK_SMTPS_ENDPOINT_IGNORE_URI_SCHEME_DOC = "Option to let Camel ignore unsupported charset in the local JVM when sending mails. If the charset is unsupported then charset=XXX (where XXX represents the unsupported charset) is removed from the content-type and it relies on the platform default instead.";
    public static final Boolean CAMEL_SINK_SMTPS_ENDPOINT_IGNORE_URI_SCHEME_DEFAULT = false;
    public static final String CAMEL_SINK_SMTPS_ENDPOINT_JAVA_MAIL_PROPERTIES_CONF = "camel.sink.endpoint.javaMailProperties";
    public static final String CAMEL_SINK_SMTPS_ENDPOINT_JAVA_MAIL_PROPERTIES_DOC = "Sets the java mail options. Will clear any default properties and only use the properties provided for this method.";
    public static final String CAMEL_SINK_SMTPS_ENDPOINT_JAVA_MAIL_PROPERTIES_DEFAULT = null;
    public static final String CAMEL_SINK_SMTPS_ENDPOINT_SESSION_CONF = "camel.sink.endpoint.session";
    public static final String CAMEL_SINK_SMTPS_ENDPOINT_SESSION_DOC = "Specifies the mail session that camel should use for all mail interactions. Useful in scenarios where mail sessions are created and managed by some other resource, such as a JavaEE container. When using a custom mail session, then the hostname and port from the mail session will be used (if configured on the session).";
    public static final String CAMEL_SINK_SMTPS_ENDPOINT_SESSION_DEFAULT = null;
    public static final String CAMEL_SINK_SMTPS_ENDPOINT_SYNCHRONOUS_CONF = "camel.sink.endpoint.synchronous";
    public static final String CAMEL_SINK_SMTPS_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SINK_SMTPS_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SINK_SMTPS_ENDPOINT_USE_INLINE_ATTACHMENTS_CONF = "camel.sink.endpoint.useInlineAttachments";
    public static final String CAMEL_SINK_SMTPS_ENDPOINT_USE_INLINE_ATTACHMENTS_DOC = "Whether to use disposition inline or attachment.";
    public static final Boolean CAMEL_SINK_SMTPS_ENDPOINT_USE_INLINE_ATTACHMENTS_DEFAULT = false;
    public static final String CAMEL_SINK_SMTPS_ENDPOINT_PASSWORD_CONF = "camel.sink.endpoint.password";
    public static final String CAMEL_SINK_SMTPS_ENDPOINT_PASSWORD_DOC = "The password for login. See also setAuthenticator(MailAuthenticator).";
    public static final String CAMEL_SINK_SMTPS_ENDPOINT_PASSWORD_DEFAULT = null;
    public static final String CAMEL_SINK_SMTPS_ENDPOINT_SSL_CONTEXT_PARAMETERS_CONF = "camel.sink.endpoint.sslContextParameters";
    public static final String CAMEL_SINK_SMTPS_ENDPOINT_SSL_CONTEXT_PARAMETERS_DOC = "To configure security using SSLContextParameters.";
    public static final String CAMEL_SINK_SMTPS_ENDPOINT_SSL_CONTEXT_PARAMETERS_DEFAULT = null;
    public static final String CAMEL_SINK_SMTPS_ENDPOINT_USERNAME_CONF = "camel.sink.endpoint.username";
    public static final String CAMEL_SINK_SMTPS_ENDPOINT_USERNAME_DOC = "The username for login. See also setAuthenticator(MailAuthenticator).";
    public static final String CAMEL_SINK_SMTPS_ENDPOINT_USERNAME_DEFAULT = null;
    public static final String CAMEL_SINK_SMTPS_COMPONENT_BCC_CONF = "camel.component.smtps.bcc";
    public static final String CAMEL_SINK_SMTPS_COMPONENT_BCC_DOC = "Sets the BCC email address. Separate multiple email addresses with comma.";
    public static final String CAMEL_SINK_SMTPS_COMPONENT_BCC_DEFAULT = null;
    public static final String CAMEL_SINK_SMTPS_COMPONENT_CC_CONF = "camel.component.smtps.cc";
    public static final String CAMEL_SINK_SMTPS_COMPONENT_CC_DOC = "Sets the CC email address. Separate multiple email addresses with comma.";
    public static final String CAMEL_SINK_SMTPS_COMPONENT_CC_DEFAULT = null;
    public static final String CAMEL_SINK_SMTPS_COMPONENT_FROM_CONF = "camel.component.smtps.from";
    public static final String CAMEL_SINK_SMTPS_COMPONENT_FROM_DOC = "The from email address";
    public static final String CAMEL_SINK_SMTPS_COMPONENT_FROM_DEFAULT = "camel@localhost";
    public static final String CAMEL_SINK_SMTPS_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.smtps.lazyStartProducer";
    public static final String CAMEL_SINK_SMTPS_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_SMTPS_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_SMTPS_COMPONENT_REPLY_TO_CONF = "camel.component.smtps.replyTo";
    public static final String CAMEL_SINK_SMTPS_COMPONENT_REPLY_TO_DOC = "The Reply-To recipients (the receivers of the response mail). Separate multiple email addresses with a comma.";
    public static final String CAMEL_SINK_SMTPS_COMPONENT_REPLY_TO_DEFAULT = null;
    public static final String CAMEL_SINK_SMTPS_COMPONENT_SUBJECT_CONF = "camel.component.smtps.subject";
    public static final String CAMEL_SINK_SMTPS_COMPONENT_SUBJECT_DOC = "The Subject of the message being sent. Note: Setting the subject in the header takes precedence over this option.";
    public static final String CAMEL_SINK_SMTPS_COMPONENT_SUBJECT_DEFAULT = null;
    public static final String CAMEL_SINK_SMTPS_COMPONENT_TO_CONF = "camel.component.smtps.to";
    public static final String CAMEL_SINK_SMTPS_COMPONENT_TO_DOC = "Sets the To email address. Separate multiple email addresses with comma.";
    public static final String CAMEL_SINK_SMTPS_COMPONENT_TO_DEFAULT = null;
    public static final String CAMEL_SINK_SMTPS_COMPONENT_JAVA_MAIL_SENDER_CONF = "camel.component.smtps.javaMailSender";
    public static final String CAMEL_SINK_SMTPS_COMPONENT_JAVA_MAIL_SENDER_DOC = "To use a custom org.apache.camel.component.mail.JavaMailSender for sending emails.";
    public static final String CAMEL_SINK_SMTPS_COMPONENT_JAVA_MAIL_SENDER_DEFAULT = null;
    public static final String CAMEL_SINK_SMTPS_COMPONENT_ADDITIONAL_JAVA_MAIL_PROPERTIES_CONF = "camel.component.smtps.additionalJavaMailProperties";
    public static final String CAMEL_SINK_SMTPS_COMPONENT_ADDITIONAL_JAVA_MAIL_PROPERTIES_DOC = "Sets additional java mail properties, that will append/override any default properties that is set based on all the other options. This is useful if you need to add some special options but want to keep the others as is.";
    public static final String CAMEL_SINK_SMTPS_COMPONENT_ADDITIONAL_JAVA_MAIL_PROPERTIES_DEFAULT = null;
    public static final String CAMEL_SINK_SMTPS_COMPONENT_ALTERNATIVE_BODY_HEADER_CONF = "camel.component.smtps.alternativeBodyHeader";
    public static final String CAMEL_SINK_SMTPS_COMPONENT_ALTERNATIVE_BODY_HEADER_DOC = "Specifies the key to an IN message header that contains an alternative email body. For example, if you send emails in text/html format and want to provide an alternative mail body for non-HTML email clients, set the alternative mail body with this key as a header.";
    public static final String CAMEL_SINK_SMTPS_COMPONENT_ALTERNATIVE_BODY_HEADER_DEFAULT = "CamelMailAlternativeBody";
    public static final String CAMEL_SINK_SMTPS_COMPONENT_ATTACHMENTS_CONTENT_TRANSFER_ENCODING_RESOLVER_CONF = "camel.component.smtps.attachmentsContentTransferEncodingResolver";
    public static final String CAMEL_SINK_SMTPS_COMPONENT_ATTACHMENTS_CONTENT_TRANSFER_ENCODING_RESOLVER_DOC = "To use a custom AttachmentsContentTransferEncodingResolver to resolve what content-type-encoding to use for attachments.";
    public static final String CAMEL_SINK_SMTPS_COMPONENT_ATTACHMENTS_CONTENT_TRANSFER_ENCODING_RESOLVER_DEFAULT = null;
    public static final String CAMEL_SINK_SMTPS_COMPONENT_AUTHENTICATOR_CONF = "camel.component.smtps.authenticator";
    public static final String CAMEL_SINK_SMTPS_COMPONENT_AUTHENTICATOR_DOC = "The authenticator for login. If set then the password and username are ignored. Can be used for tokens which can expire and therefore must be read dynamically.";
    public static final String CAMEL_SINK_SMTPS_COMPONENT_AUTHENTICATOR_DEFAULT = null;
    public static final String CAMEL_SINK_SMTPS_COMPONENT_AUTOWIRED_ENABLED_CONF = "camel.component.smtps.autowiredEnabled";
    public static final String CAMEL_SINK_SMTPS_COMPONENT_AUTOWIRED_ENABLED_DOC = "Whether autowiring is enabled. This is used for automatic autowiring options (the option must be marked as autowired) by looking up in the registry to find if there is a single instance of matching type, which then gets configured on the component. This can be used for automatic configuring JDBC data sources, JMS connection factories, AWS Clients, etc.";
    public static final Boolean CAMEL_SINK_SMTPS_COMPONENT_AUTOWIRED_ENABLED_DEFAULT = true;
    public static final String CAMEL_SINK_SMTPS_COMPONENT_CONFIGURATION_CONF = "camel.component.smtps.configuration";
    public static final String CAMEL_SINK_SMTPS_COMPONENT_CONFIGURATION_DOC = "Sets the Mail configuration";
    public static final String CAMEL_SINK_SMTPS_COMPONENT_CONFIGURATION_DEFAULT = null;
    public static final String CAMEL_SINK_SMTPS_COMPONENT_CONNECTION_TIMEOUT_CONF = "camel.component.smtps.connectionTimeout";
    public static final String CAMEL_SINK_SMTPS_COMPONENT_CONNECTION_TIMEOUT_DOC = "The connection timeout in milliseconds.";
    public static final Integer CAMEL_SINK_SMTPS_COMPONENT_CONNECTION_TIMEOUT_DEFAULT = 30000;
    public static final String CAMEL_SINK_SMTPS_COMPONENT_CONTENT_TYPE_CONF = "camel.component.smtps.contentType";
    public static final String CAMEL_SINK_SMTPS_COMPONENT_CONTENT_TYPE_DOC = "The mail message content type. Use text/html for HTML mails.";
    public static final String CAMEL_SINK_SMTPS_COMPONENT_CONTENT_TYPE_DEFAULT = "text/plain";
    public static final String CAMEL_SINK_SMTPS_COMPONENT_CONTENT_TYPE_RESOLVER_CONF = "camel.component.smtps.contentTypeResolver";
    public static final String CAMEL_SINK_SMTPS_COMPONENT_CONTENT_TYPE_RESOLVER_DOC = "Resolver to determine Content-Type for file attachments.";
    public static final String CAMEL_SINK_SMTPS_COMPONENT_CONTENT_TYPE_RESOLVER_DEFAULT = null;
    public static final String CAMEL_SINK_SMTPS_COMPONENT_DEBUG_MODE_CONF = "camel.component.smtps.debugMode";
    public static final String CAMEL_SINK_SMTPS_COMPONENT_DEBUG_MODE_DOC = "Enable debug mode on the underlying mail framework. The SUN Mail framework logs the debug messages to System.out by default.";
    public static final Boolean CAMEL_SINK_SMTPS_COMPONENT_DEBUG_MODE_DEFAULT = false;
    public static final String CAMEL_SINK_SMTPS_COMPONENT_IGNORE_UNSUPPORTED_CHARSET_CONF = "camel.component.smtps.ignoreUnsupportedCharset";
    public static final String CAMEL_SINK_SMTPS_COMPONENT_IGNORE_UNSUPPORTED_CHARSET_DOC = "Option to let Camel ignore unsupported charset in the local JVM when sending mails. If the charset is unsupported then charset=XXX (where XXX represents the unsupported charset) is removed from the content-type and it relies on the platform default instead.";
    public static final Boolean CAMEL_SINK_SMTPS_COMPONENT_IGNORE_UNSUPPORTED_CHARSET_DEFAULT = false;
    public static final String CAMEL_SINK_SMTPS_COMPONENT_IGNORE_URI_SCHEME_CONF = "camel.component.smtps.ignoreUriScheme";
    public static final String CAMEL_SINK_SMTPS_COMPONENT_IGNORE_URI_SCHEME_DOC = "Option to let Camel ignore unsupported charset in the local JVM when sending mails. If the charset is unsupported then charset=XXX (where XXX represents the unsupported charset) is removed from the content-type and it relies on the platform default instead.";
    public static final Boolean CAMEL_SINK_SMTPS_COMPONENT_IGNORE_URI_SCHEME_DEFAULT = false;
    public static final String CAMEL_SINK_SMTPS_COMPONENT_JAVA_MAIL_PROPERTIES_CONF = "camel.component.smtps.javaMailProperties";
    public static final String CAMEL_SINK_SMTPS_COMPONENT_JAVA_MAIL_PROPERTIES_DOC = "Sets the java mail options. Will clear any default properties and only use the properties provided for this method.";
    public static final String CAMEL_SINK_SMTPS_COMPONENT_JAVA_MAIL_PROPERTIES_DEFAULT = null;
    public static final String CAMEL_SINK_SMTPS_COMPONENT_SESSION_CONF = "camel.component.smtps.session";
    public static final String CAMEL_SINK_SMTPS_COMPONENT_SESSION_DOC = "Specifies the mail session that camel should use for all mail interactions. Useful in scenarios where mail sessions are created and managed by some other resource, such as a JavaEE container. When using a custom mail session, then the hostname and port from the mail session will be used (if configured on the session).";
    public static final String CAMEL_SINK_SMTPS_COMPONENT_SESSION_DEFAULT = null;
    public static final String CAMEL_SINK_SMTPS_COMPONENT_USE_INLINE_ATTACHMENTS_CONF = "camel.component.smtps.useInlineAttachments";
    public static final String CAMEL_SINK_SMTPS_COMPONENT_USE_INLINE_ATTACHMENTS_DOC = "Whether to use disposition inline or attachment.";
    public static final Boolean CAMEL_SINK_SMTPS_COMPONENT_USE_INLINE_ATTACHMENTS_DEFAULT = false;
    public static final String CAMEL_SINK_SMTPS_COMPONENT_HEADER_FILTER_STRATEGY_CONF = "camel.component.smtps.headerFilterStrategy";
    public static final String CAMEL_SINK_SMTPS_COMPONENT_HEADER_FILTER_STRATEGY_DOC = "To use a custom org.apache.camel.spi.HeaderFilterStrategy to filter header to and from Camel message.";
    public static final String CAMEL_SINK_SMTPS_COMPONENT_HEADER_FILTER_STRATEGY_DEFAULT = null;
    public static final String CAMEL_SINK_SMTPS_COMPONENT_PASSWORD_CONF = "camel.component.smtps.password";
    public static final String CAMEL_SINK_SMTPS_COMPONENT_PASSWORD_DOC = "The password for login. See also setAuthenticator(MailAuthenticator).";
    public static final String CAMEL_SINK_SMTPS_COMPONENT_PASSWORD_DEFAULT = null;
    public static final String CAMEL_SINK_SMTPS_COMPONENT_SSL_CONTEXT_PARAMETERS_CONF = "camel.component.smtps.sslContextParameters";
    public static final String CAMEL_SINK_SMTPS_COMPONENT_SSL_CONTEXT_PARAMETERS_DOC = "To configure security using SSLContextParameters.";
    public static final String CAMEL_SINK_SMTPS_COMPONENT_SSL_CONTEXT_PARAMETERS_DEFAULT = null;
    public static final String CAMEL_SINK_SMTPS_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_CONF = "camel.component.smtps.useGlobalSslContextParameters";
    public static final String CAMEL_SINK_SMTPS_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_DOC = "Enable usage of global SSL context parameters.";
    public static final Boolean CAMEL_SINK_SMTPS_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_DEFAULT = false;
    public static final String CAMEL_SINK_SMTPS_COMPONENT_USERNAME_CONF = "camel.component.smtps.username";
    public static final String CAMEL_SINK_SMTPS_COMPONENT_USERNAME_DOC = "The username for login. See also setAuthenticator(MailAuthenticator).";
    public static final String CAMEL_SINK_SMTPS_COMPONENT_USERNAME_DEFAULT = null;

    public CamelSmtpsSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelSmtpsSinkConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_SMTPS_PATH_HOST_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SMTPS_PATH_HOST_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_SMTPS_PATH_HOST_DOC);
        conf.define(CAMEL_SINK_SMTPS_PATH_PORT_CONF, ConfigDef.Type.INT, CAMEL_SINK_SMTPS_PATH_PORT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SMTPS_PATH_PORT_DOC);
        conf.define(CAMEL_SINK_SMTPS_ENDPOINT_BCC_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SMTPS_ENDPOINT_BCC_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SMTPS_ENDPOINT_BCC_DOC);
        conf.define(CAMEL_SINK_SMTPS_ENDPOINT_CC_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SMTPS_ENDPOINT_CC_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SMTPS_ENDPOINT_CC_DOC);
        conf.define(CAMEL_SINK_SMTPS_ENDPOINT_FROM_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SMTPS_ENDPOINT_FROM_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SMTPS_ENDPOINT_FROM_DOC);
        conf.define(CAMEL_SINK_SMTPS_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_SMTPS_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SMTPS_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_SMTPS_ENDPOINT_REPLY_TO_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SMTPS_ENDPOINT_REPLY_TO_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SMTPS_ENDPOINT_REPLY_TO_DOC);
        conf.define(CAMEL_SINK_SMTPS_ENDPOINT_SUBJECT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SMTPS_ENDPOINT_SUBJECT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SMTPS_ENDPOINT_SUBJECT_DOC);
        conf.define(CAMEL_SINK_SMTPS_ENDPOINT_TO_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SMTPS_ENDPOINT_TO_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SMTPS_ENDPOINT_TO_DOC);
        conf.define(CAMEL_SINK_SMTPS_ENDPOINT_JAVA_MAIL_SENDER_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SMTPS_ENDPOINT_JAVA_MAIL_SENDER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SMTPS_ENDPOINT_JAVA_MAIL_SENDER_DOC);
        conf.define(CAMEL_SINK_SMTPS_ENDPOINT_ADDITIONAL_JAVA_MAIL_PROPERTIES_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SMTPS_ENDPOINT_ADDITIONAL_JAVA_MAIL_PROPERTIES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SMTPS_ENDPOINT_ADDITIONAL_JAVA_MAIL_PROPERTIES_DOC);
        conf.define(CAMEL_SINK_SMTPS_ENDPOINT_ALTERNATIVE_BODY_HEADER_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SMTPS_ENDPOINT_ALTERNATIVE_BODY_HEADER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SMTPS_ENDPOINT_ALTERNATIVE_BODY_HEADER_DOC);
        conf.define(CAMEL_SINK_SMTPS_ENDPOINT_ATTACHMENTS_CONTENT_TRANSFER_ENCODING_RESOLVER_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SMTPS_ENDPOINT_ATTACHMENTS_CONTENT_TRANSFER_ENCODING_RESOLVER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SMTPS_ENDPOINT_ATTACHMENTS_CONTENT_TRANSFER_ENCODING_RESOLVER_DOC);
        conf.define(CAMEL_SINK_SMTPS_ENDPOINT_AUTHENTICATOR_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SMTPS_ENDPOINT_AUTHENTICATOR_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SMTPS_ENDPOINT_AUTHENTICATOR_DOC);
        conf.define(CAMEL_SINK_SMTPS_ENDPOINT_BINDING_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SMTPS_ENDPOINT_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SMTPS_ENDPOINT_BINDING_DOC);
        conf.define(CAMEL_SINK_SMTPS_ENDPOINT_CONNECTION_TIMEOUT_CONF, ConfigDef.Type.INT, CAMEL_SINK_SMTPS_ENDPOINT_CONNECTION_TIMEOUT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SMTPS_ENDPOINT_CONNECTION_TIMEOUT_DOC);
        conf.define(CAMEL_SINK_SMTPS_ENDPOINT_CONTENT_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SMTPS_ENDPOINT_CONTENT_TYPE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SMTPS_ENDPOINT_CONTENT_TYPE_DOC);
        conf.define(CAMEL_SINK_SMTPS_ENDPOINT_CONTENT_TYPE_RESOLVER_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SMTPS_ENDPOINT_CONTENT_TYPE_RESOLVER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SMTPS_ENDPOINT_CONTENT_TYPE_RESOLVER_DOC);
        conf.define(CAMEL_SINK_SMTPS_ENDPOINT_DEBUG_MODE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_SMTPS_ENDPOINT_DEBUG_MODE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SMTPS_ENDPOINT_DEBUG_MODE_DOC);
        conf.define(CAMEL_SINK_SMTPS_ENDPOINT_HEADER_FILTER_STRATEGY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SMTPS_ENDPOINT_HEADER_FILTER_STRATEGY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SMTPS_ENDPOINT_HEADER_FILTER_STRATEGY_DOC);
        conf.define(CAMEL_SINK_SMTPS_ENDPOINT_IGNORE_UNSUPPORTED_CHARSET_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_SMTPS_ENDPOINT_IGNORE_UNSUPPORTED_CHARSET_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SMTPS_ENDPOINT_IGNORE_UNSUPPORTED_CHARSET_DOC);
        conf.define(CAMEL_SINK_SMTPS_ENDPOINT_IGNORE_URI_SCHEME_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_SMTPS_ENDPOINT_IGNORE_URI_SCHEME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SMTPS_ENDPOINT_IGNORE_URI_SCHEME_DOC);
        conf.define(CAMEL_SINK_SMTPS_ENDPOINT_JAVA_MAIL_PROPERTIES_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SMTPS_ENDPOINT_JAVA_MAIL_PROPERTIES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SMTPS_ENDPOINT_JAVA_MAIL_PROPERTIES_DOC);
        conf.define(CAMEL_SINK_SMTPS_ENDPOINT_SESSION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SMTPS_ENDPOINT_SESSION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SMTPS_ENDPOINT_SESSION_DOC);
        conf.define(CAMEL_SINK_SMTPS_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_SMTPS_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SMTPS_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SINK_SMTPS_ENDPOINT_USE_INLINE_ATTACHMENTS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_SMTPS_ENDPOINT_USE_INLINE_ATTACHMENTS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SMTPS_ENDPOINT_USE_INLINE_ATTACHMENTS_DOC);
        conf.define(CAMEL_SINK_SMTPS_ENDPOINT_PASSWORD_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SMTPS_ENDPOINT_PASSWORD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SMTPS_ENDPOINT_PASSWORD_DOC);
        conf.define(CAMEL_SINK_SMTPS_ENDPOINT_SSL_CONTEXT_PARAMETERS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SMTPS_ENDPOINT_SSL_CONTEXT_PARAMETERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SMTPS_ENDPOINT_SSL_CONTEXT_PARAMETERS_DOC);
        conf.define(CAMEL_SINK_SMTPS_ENDPOINT_USERNAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SMTPS_ENDPOINT_USERNAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SMTPS_ENDPOINT_USERNAME_DOC);
        conf.define(CAMEL_SINK_SMTPS_COMPONENT_BCC_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SMTPS_COMPONENT_BCC_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SMTPS_COMPONENT_BCC_DOC);
        conf.define(CAMEL_SINK_SMTPS_COMPONENT_CC_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SMTPS_COMPONENT_CC_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SMTPS_COMPONENT_CC_DOC);
        conf.define(CAMEL_SINK_SMTPS_COMPONENT_FROM_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SMTPS_COMPONENT_FROM_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SMTPS_COMPONENT_FROM_DOC);
        conf.define(CAMEL_SINK_SMTPS_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_SMTPS_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SMTPS_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_SMTPS_COMPONENT_REPLY_TO_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SMTPS_COMPONENT_REPLY_TO_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SMTPS_COMPONENT_REPLY_TO_DOC);
        conf.define(CAMEL_SINK_SMTPS_COMPONENT_SUBJECT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SMTPS_COMPONENT_SUBJECT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SMTPS_COMPONENT_SUBJECT_DOC);
        conf.define(CAMEL_SINK_SMTPS_COMPONENT_TO_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SMTPS_COMPONENT_TO_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SMTPS_COMPONENT_TO_DOC);
        conf.define(CAMEL_SINK_SMTPS_COMPONENT_JAVA_MAIL_SENDER_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SMTPS_COMPONENT_JAVA_MAIL_SENDER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SMTPS_COMPONENT_JAVA_MAIL_SENDER_DOC);
        conf.define(CAMEL_SINK_SMTPS_COMPONENT_ADDITIONAL_JAVA_MAIL_PROPERTIES_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SMTPS_COMPONENT_ADDITIONAL_JAVA_MAIL_PROPERTIES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SMTPS_COMPONENT_ADDITIONAL_JAVA_MAIL_PROPERTIES_DOC);
        conf.define(CAMEL_SINK_SMTPS_COMPONENT_ALTERNATIVE_BODY_HEADER_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SMTPS_COMPONENT_ALTERNATIVE_BODY_HEADER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SMTPS_COMPONENT_ALTERNATIVE_BODY_HEADER_DOC);
        conf.define(CAMEL_SINK_SMTPS_COMPONENT_ATTACHMENTS_CONTENT_TRANSFER_ENCODING_RESOLVER_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SMTPS_COMPONENT_ATTACHMENTS_CONTENT_TRANSFER_ENCODING_RESOLVER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SMTPS_COMPONENT_ATTACHMENTS_CONTENT_TRANSFER_ENCODING_RESOLVER_DOC);
        conf.define(CAMEL_SINK_SMTPS_COMPONENT_AUTHENTICATOR_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SMTPS_COMPONENT_AUTHENTICATOR_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SMTPS_COMPONENT_AUTHENTICATOR_DOC);
        conf.define(CAMEL_SINK_SMTPS_COMPONENT_AUTOWIRED_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_SMTPS_COMPONENT_AUTOWIRED_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SMTPS_COMPONENT_AUTOWIRED_ENABLED_DOC);
        conf.define(CAMEL_SINK_SMTPS_COMPONENT_CONFIGURATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SMTPS_COMPONENT_CONFIGURATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SMTPS_COMPONENT_CONFIGURATION_DOC);
        conf.define(CAMEL_SINK_SMTPS_COMPONENT_CONNECTION_TIMEOUT_CONF, ConfigDef.Type.INT, CAMEL_SINK_SMTPS_COMPONENT_CONNECTION_TIMEOUT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SMTPS_COMPONENT_CONNECTION_TIMEOUT_DOC);
        conf.define(CAMEL_SINK_SMTPS_COMPONENT_CONTENT_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SMTPS_COMPONENT_CONTENT_TYPE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SMTPS_COMPONENT_CONTENT_TYPE_DOC);
        conf.define(CAMEL_SINK_SMTPS_COMPONENT_CONTENT_TYPE_RESOLVER_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SMTPS_COMPONENT_CONTENT_TYPE_RESOLVER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SMTPS_COMPONENT_CONTENT_TYPE_RESOLVER_DOC);
        conf.define(CAMEL_SINK_SMTPS_COMPONENT_DEBUG_MODE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_SMTPS_COMPONENT_DEBUG_MODE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SMTPS_COMPONENT_DEBUG_MODE_DOC);
        conf.define(CAMEL_SINK_SMTPS_COMPONENT_IGNORE_UNSUPPORTED_CHARSET_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_SMTPS_COMPONENT_IGNORE_UNSUPPORTED_CHARSET_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SMTPS_COMPONENT_IGNORE_UNSUPPORTED_CHARSET_DOC);
        conf.define(CAMEL_SINK_SMTPS_COMPONENT_IGNORE_URI_SCHEME_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_SMTPS_COMPONENT_IGNORE_URI_SCHEME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SMTPS_COMPONENT_IGNORE_URI_SCHEME_DOC);
        conf.define(CAMEL_SINK_SMTPS_COMPONENT_JAVA_MAIL_PROPERTIES_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SMTPS_COMPONENT_JAVA_MAIL_PROPERTIES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SMTPS_COMPONENT_JAVA_MAIL_PROPERTIES_DOC);
        conf.define(CAMEL_SINK_SMTPS_COMPONENT_SESSION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SMTPS_COMPONENT_SESSION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SMTPS_COMPONENT_SESSION_DOC);
        conf.define(CAMEL_SINK_SMTPS_COMPONENT_USE_INLINE_ATTACHMENTS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_SMTPS_COMPONENT_USE_INLINE_ATTACHMENTS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SMTPS_COMPONENT_USE_INLINE_ATTACHMENTS_DOC);
        conf.define(CAMEL_SINK_SMTPS_COMPONENT_HEADER_FILTER_STRATEGY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SMTPS_COMPONENT_HEADER_FILTER_STRATEGY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SMTPS_COMPONENT_HEADER_FILTER_STRATEGY_DOC);
        conf.define(CAMEL_SINK_SMTPS_COMPONENT_PASSWORD_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SMTPS_COMPONENT_PASSWORD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SMTPS_COMPONENT_PASSWORD_DOC);
        conf.define(CAMEL_SINK_SMTPS_COMPONENT_SSL_CONTEXT_PARAMETERS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SMTPS_COMPONENT_SSL_CONTEXT_PARAMETERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SMTPS_COMPONENT_SSL_CONTEXT_PARAMETERS_DOC);
        conf.define(CAMEL_SINK_SMTPS_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_SMTPS_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SMTPS_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_DOC);
        conf.define(CAMEL_SINK_SMTPS_COMPONENT_USERNAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SMTPS_COMPONENT_USERNAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SMTPS_COMPONENT_USERNAME_DOC);
        return conf;
    }
}