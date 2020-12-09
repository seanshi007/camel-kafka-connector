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
package org.apache.camel.kafkaconnector.flatpack;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSourceConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelFlatpackSourceConnectorConfig
        extends
            CamelSourceConnectorConfig {

    public static final String CAMEL_SOURCE_FLATPACK_PATH_TYPE_CONF = "camel.source.path.type";
    public static final String CAMEL_SOURCE_FLATPACK_PATH_TYPE_DOC = "Whether to use fixed or delimiter One of: [fixed] [delim]";
    public static final String CAMEL_SOURCE_FLATPACK_PATH_TYPE_DEFAULT = "delim";
    public static final String CAMEL_SOURCE_FLATPACK_PATH_RESOURCE_URI_CONF = "camel.source.path.resourceUri";
    public static final String CAMEL_SOURCE_FLATPACK_PATH_RESOURCE_URI_DOC = "URL for loading the flatpack mapping file from classpath or file system";
    public static final String CAMEL_SOURCE_FLATPACK_PATH_RESOURCE_URI_DEFAULT = null;
    public static final String CAMEL_SOURCE_FLATPACK_ENDPOINT_ALLOW_SHORT_LINES_CONF = "camel.source.endpoint.allowShortLines";
    public static final String CAMEL_SOURCE_FLATPACK_ENDPOINT_ALLOW_SHORT_LINES_DOC = "Allows for lines to be shorter than expected and ignores the extra characters";
    public static final Boolean CAMEL_SOURCE_FLATPACK_ENDPOINT_ALLOW_SHORT_LINES_DEFAULT = false;
    public static final String CAMEL_SOURCE_FLATPACK_ENDPOINT_DELIMITER_CONF = "camel.source.endpoint.delimiter";
    public static final String CAMEL_SOURCE_FLATPACK_ENDPOINT_DELIMITER_DOC = "The default character delimiter for delimited files.";
    public static final String CAMEL_SOURCE_FLATPACK_ENDPOINT_DELIMITER_DEFAULT = ",";
    public static final String CAMEL_SOURCE_FLATPACK_ENDPOINT_IGNORE_EXTRA_COLUMNS_CONF = "camel.source.endpoint.ignoreExtraColumns";
    public static final String CAMEL_SOURCE_FLATPACK_ENDPOINT_IGNORE_EXTRA_COLUMNS_DOC = "Allows for lines to be longer than expected and ignores the extra characters";
    public static final Boolean CAMEL_SOURCE_FLATPACK_ENDPOINT_IGNORE_EXTRA_COLUMNS_DEFAULT = false;
    public static final String CAMEL_SOURCE_FLATPACK_ENDPOINT_IGNORE_FIRST_RECORD_CONF = "camel.source.endpoint.ignoreFirstRecord";
    public static final String CAMEL_SOURCE_FLATPACK_ENDPOINT_IGNORE_FIRST_RECORD_DOC = "Whether the first line is ignored for delimited files (for the column headers).";
    public static final Boolean CAMEL_SOURCE_FLATPACK_ENDPOINT_IGNORE_FIRST_RECORD_DEFAULT = true;
    public static final String CAMEL_SOURCE_FLATPACK_ENDPOINT_SPLIT_ROWS_CONF = "camel.source.endpoint.splitRows";
    public static final String CAMEL_SOURCE_FLATPACK_ENDPOINT_SPLIT_ROWS_DOC = "Sets the Component to send each row as a separate exchange once parsed";
    public static final Boolean CAMEL_SOURCE_FLATPACK_ENDPOINT_SPLIT_ROWS_DEFAULT = true;
    public static final String CAMEL_SOURCE_FLATPACK_ENDPOINT_TEXT_QUALIFIER_CONF = "camel.source.endpoint.textQualifier";
    public static final String CAMEL_SOURCE_FLATPACK_ENDPOINT_TEXT_QUALIFIER_DOC = "The text qualifier for delimited files.";
    public static final String CAMEL_SOURCE_FLATPACK_ENDPOINT_TEXT_QUALIFIER_DEFAULT = null;
    public static final String CAMEL_SOURCE_FLATPACK_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF = "camel.source.endpoint.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_FLATPACK_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_FLATPACK_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_FLATPACK_ENDPOINT_SEND_EMPTY_MESSAGE_WHEN_IDLE_CONF = "camel.source.endpoint.sendEmptyMessageWhenIdle";
    public static final String CAMEL_SOURCE_FLATPACK_ENDPOINT_SEND_EMPTY_MESSAGE_WHEN_IDLE_DOC = "If the polling consumer did not poll any files, you can enable this option to send an empty message (no body) instead.";
    public static final Boolean CAMEL_SOURCE_FLATPACK_ENDPOINT_SEND_EMPTY_MESSAGE_WHEN_IDLE_DEFAULT = false;
    public static final String CAMEL_SOURCE_FLATPACK_ENDPOINT_EXCEPTION_HANDLER_CONF = "camel.source.endpoint.exceptionHandler";
    public static final String CAMEL_SOURCE_FLATPACK_ENDPOINT_EXCEPTION_HANDLER_DOC = "To let the consumer use a custom ExceptionHandler. Notice if the option bridgeErrorHandler is enabled then this option is not in use. By default the consumer will deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final String CAMEL_SOURCE_FLATPACK_ENDPOINT_EXCEPTION_HANDLER_DEFAULT = null;
    public static final String CAMEL_SOURCE_FLATPACK_ENDPOINT_EXCHANGE_PATTERN_CONF = "camel.source.endpoint.exchangePattern";
    public static final String CAMEL_SOURCE_FLATPACK_ENDPOINT_EXCHANGE_PATTERN_DOC = "Sets the exchange pattern when the consumer creates an exchange. One of: [InOnly] [InOut] [InOptionalOut]";
    public static final String CAMEL_SOURCE_FLATPACK_ENDPOINT_EXCHANGE_PATTERN_DEFAULT = null;
    public static final String CAMEL_SOURCE_FLATPACK_ENDPOINT_POLL_STRATEGY_CONF = "camel.source.endpoint.pollStrategy";
    public static final String CAMEL_SOURCE_FLATPACK_ENDPOINT_POLL_STRATEGY_DOC = "A pluggable org.apache.camel.PollingConsumerPollingStrategy allowing you to provide your custom implementation to control error handling usually occurred during the poll operation before an Exchange have been created and being routed in Camel.";
    public static final String CAMEL_SOURCE_FLATPACK_ENDPOINT_POLL_STRATEGY_DEFAULT = null;
    public static final String CAMEL_SOURCE_FLATPACK_ENDPOINT_SYNCHRONOUS_CONF = "camel.source.endpoint.synchronous";
    public static final String CAMEL_SOURCE_FLATPACK_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SOURCE_FLATPACK_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SOURCE_FLATPACK_ENDPOINT_BACKOFF_ERROR_THRESHOLD_CONF = "camel.source.endpoint.backoffErrorThreshold";
    public static final String CAMEL_SOURCE_FLATPACK_ENDPOINT_BACKOFF_ERROR_THRESHOLD_DOC = "The number of subsequent error polls (failed due some error) that should happen before the backoffMultipler should kick-in.";
    public static final Integer CAMEL_SOURCE_FLATPACK_ENDPOINT_BACKOFF_ERROR_THRESHOLD_DEFAULT = null;
    public static final String CAMEL_SOURCE_FLATPACK_ENDPOINT_BACKOFF_IDLE_THRESHOLD_CONF = "camel.source.endpoint.backoffIdleThreshold";
    public static final String CAMEL_SOURCE_FLATPACK_ENDPOINT_BACKOFF_IDLE_THRESHOLD_DOC = "The number of subsequent idle polls that should happen before the backoffMultipler should kick-in.";
    public static final Integer CAMEL_SOURCE_FLATPACK_ENDPOINT_BACKOFF_IDLE_THRESHOLD_DEFAULT = null;
    public static final String CAMEL_SOURCE_FLATPACK_ENDPOINT_BACKOFF_MULTIPLIER_CONF = "camel.source.endpoint.backoffMultiplier";
    public static final String CAMEL_SOURCE_FLATPACK_ENDPOINT_BACKOFF_MULTIPLIER_DOC = "To let the scheduled polling consumer backoff if there has been a number of subsequent idles/errors in a row. The multiplier is then the number of polls that will be skipped before the next actual attempt is happening again. When this option is in use then backoffIdleThreshold and/or backoffErrorThreshold must also be configured.";
    public static final Integer CAMEL_SOURCE_FLATPACK_ENDPOINT_BACKOFF_MULTIPLIER_DEFAULT = null;
    public static final String CAMEL_SOURCE_FLATPACK_ENDPOINT_DELAY_CONF = "camel.source.endpoint.delay";
    public static final String CAMEL_SOURCE_FLATPACK_ENDPOINT_DELAY_DOC = "Milliseconds before the next poll.";
    public static final Long CAMEL_SOURCE_FLATPACK_ENDPOINT_DELAY_DEFAULT = 500L;
    public static final String CAMEL_SOURCE_FLATPACK_ENDPOINT_GREEDY_CONF = "camel.source.endpoint.greedy";
    public static final String CAMEL_SOURCE_FLATPACK_ENDPOINT_GREEDY_DOC = "If greedy is enabled, then the ScheduledPollConsumer will run immediately again, if the previous run polled 1 or more messages.";
    public static final Boolean CAMEL_SOURCE_FLATPACK_ENDPOINT_GREEDY_DEFAULT = false;
    public static final String CAMEL_SOURCE_FLATPACK_ENDPOINT_INITIAL_DELAY_CONF = "camel.source.endpoint.initialDelay";
    public static final String CAMEL_SOURCE_FLATPACK_ENDPOINT_INITIAL_DELAY_DOC = "Milliseconds before the first poll starts.";
    public static final Long CAMEL_SOURCE_FLATPACK_ENDPOINT_INITIAL_DELAY_DEFAULT = 1000L;
    public static final String CAMEL_SOURCE_FLATPACK_ENDPOINT_REPEAT_COUNT_CONF = "camel.source.endpoint.repeatCount";
    public static final String CAMEL_SOURCE_FLATPACK_ENDPOINT_REPEAT_COUNT_DOC = "Specifies a maximum limit of number of fires. So if you set it to 1, the scheduler will only fire once. If you set it to 5, it will only fire five times. A value of zero or negative means fire forever.";
    public static final Long CAMEL_SOURCE_FLATPACK_ENDPOINT_REPEAT_COUNT_DEFAULT = 0L;
    public static final String CAMEL_SOURCE_FLATPACK_ENDPOINT_RUN_LOGGING_LEVEL_CONF = "camel.source.endpoint.runLoggingLevel";
    public static final String CAMEL_SOURCE_FLATPACK_ENDPOINT_RUN_LOGGING_LEVEL_DOC = "The consumer logs a start/complete log line when it polls. This option allows you to configure the logging level for that. One of: [TRACE] [DEBUG] [INFO] [WARN] [ERROR] [OFF]";
    public static final String CAMEL_SOURCE_FLATPACK_ENDPOINT_RUN_LOGGING_LEVEL_DEFAULT = "TRACE";
    public static final String CAMEL_SOURCE_FLATPACK_ENDPOINT_SCHEDULED_EXECUTOR_SERVICE_CONF = "camel.source.endpoint.scheduledExecutorService";
    public static final String CAMEL_SOURCE_FLATPACK_ENDPOINT_SCHEDULED_EXECUTOR_SERVICE_DOC = "Allows for configuring a custom/shared thread pool to use for the consumer. By default each consumer has its own single threaded thread pool.";
    public static final String CAMEL_SOURCE_FLATPACK_ENDPOINT_SCHEDULED_EXECUTOR_SERVICE_DEFAULT = null;
    public static final String CAMEL_SOURCE_FLATPACK_ENDPOINT_SCHEDULER_CONF = "camel.source.endpoint.scheduler";
    public static final String CAMEL_SOURCE_FLATPACK_ENDPOINT_SCHEDULER_DOC = "To use a cron scheduler from either camel-spring or camel-quartz component. Use value spring or quartz for built in scheduler";
    public static final String CAMEL_SOURCE_FLATPACK_ENDPOINT_SCHEDULER_DEFAULT = "none";
    public static final String CAMEL_SOURCE_FLATPACK_ENDPOINT_SCHEDULER_PROPERTIES_CONF = "camel.source.endpoint.schedulerProperties";
    public static final String CAMEL_SOURCE_FLATPACK_ENDPOINT_SCHEDULER_PROPERTIES_DOC = "To configure additional properties when using a custom scheduler or any of the Quartz, Spring based scheduler.";
    public static final String CAMEL_SOURCE_FLATPACK_ENDPOINT_SCHEDULER_PROPERTIES_DEFAULT = null;
    public static final String CAMEL_SOURCE_FLATPACK_ENDPOINT_START_SCHEDULER_CONF = "camel.source.endpoint.startScheduler";
    public static final String CAMEL_SOURCE_FLATPACK_ENDPOINT_START_SCHEDULER_DOC = "Whether the scheduler should be auto started.";
    public static final Boolean CAMEL_SOURCE_FLATPACK_ENDPOINT_START_SCHEDULER_DEFAULT = true;
    public static final String CAMEL_SOURCE_FLATPACK_ENDPOINT_TIME_UNIT_CONF = "camel.source.endpoint.timeUnit";
    public static final String CAMEL_SOURCE_FLATPACK_ENDPOINT_TIME_UNIT_DOC = "Time unit for initialDelay and delay options. One of: [NANOSECONDS] [MICROSECONDS] [MILLISECONDS] [SECONDS] [MINUTES] [HOURS] [DAYS]";
    public static final String CAMEL_SOURCE_FLATPACK_ENDPOINT_TIME_UNIT_DEFAULT = "MILLISECONDS";
    public static final String CAMEL_SOURCE_FLATPACK_ENDPOINT_USE_FIXED_DELAY_CONF = "camel.source.endpoint.useFixedDelay";
    public static final String CAMEL_SOURCE_FLATPACK_ENDPOINT_USE_FIXED_DELAY_DOC = "Controls if fixed delay or fixed rate is used. See ScheduledExecutorService in JDK for details.";
    public static final Boolean CAMEL_SOURCE_FLATPACK_ENDPOINT_USE_FIXED_DELAY_DEFAULT = true;
    public static final String CAMEL_SOURCE_FLATPACK_COMPONENT_BRIDGE_ERROR_HANDLER_CONF = "camel.component.flatpack.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_FLATPACK_COMPONENT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_FLATPACK_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_FLATPACK_COMPONENT_AUTOWIRED_ENABLED_CONF = "camel.component.flatpack.autowiredEnabled";
    public static final String CAMEL_SOURCE_FLATPACK_COMPONENT_AUTOWIRED_ENABLED_DOC = "Whether autowiring is enabled. This is used for automatic autowiring options (the option must be marked as autowired) by looking up in the registry to find if there is a single instance of matching type, which then gets configured on the component. This can be used for automatic configuring JDBC data sources, JMS connection factories, AWS Clients, etc.";
    public static final Boolean CAMEL_SOURCE_FLATPACK_COMPONENT_AUTOWIRED_ENABLED_DEFAULT = true;

    public CamelFlatpackSourceConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelFlatpackSourceConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSourceConnectorConfig.conf());
        conf.define(CAMEL_SOURCE_FLATPACK_PATH_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_FLATPACK_PATH_TYPE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_FLATPACK_PATH_TYPE_DOC);
        conf.define(CAMEL_SOURCE_FLATPACK_PATH_RESOURCE_URI_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_FLATPACK_PATH_RESOURCE_URI_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_FLATPACK_PATH_RESOURCE_URI_DOC);
        conf.define(CAMEL_SOURCE_FLATPACK_ENDPOINT_ALLOW_SHORT_LINES_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_FLATPACK_ENDPOINT_ALLOW_SHORT_LINES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_FLATPACK_ENDPOINT_ALLOW_SHORT_LINES_DOC);
        conf.define(CAMEL_SOURCE_FLATPACK_ENDPOINT_DELIMITER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_FLATPACK_ENDPOINT_DELIMITER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_FLATPACK_ENDPOINT_DELIMITER_DOC);
        conf.define(CAMEL_SOURCE_FLATPACK_ENDPOINT_IGNORE_EXTRA_COLUMNS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_FLATPACK_ENDPOINT_IGNORE_EXTRA_COLUMNS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_FLATPACK_ENDPOINT_IGNORE_EXTRA_COLUMNS_DOC);
        conf.define(CAMEL_SOURCE_FLATPACK_ENDPOINT_IGNORE_FIRST_RECORD_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_FLATPACK_ENDPOINT_IGNORE_FIRST_RECORD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_FLATPACK_ENDPOINT_IGNORE_FIRST_RECORD_DOC);
        conf.define(CAMEL_SOURCE_FLATPACK_ENDPOINT_SPLIT_ROWS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_FLATPACK_ENDPOINT_SPLIT_ROWS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_FLATPACK_ENDPOINT_SPLIT_ROWS_DOC);
        conf.define(CAMEL_SOURCE_FLATPACK_ENDPOINT_TEXT_QUALIFIER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_FLATPACK_ENDPOINT_TEXT_QUALIFIER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_FLATPACK_ENDPOINT_TEXT_QUALIFIER_DOC);
        conf.define(CAMEL_SOURCE_FLATPACK_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_FLATPACK_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_FLATPACK_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_FLATPACK_ENDPOINT_SEND_EMPTY_MESSAGE_WHEN_IDLE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_FLATPACK_ENDPOINT_SEND_EMPTY_MESSAGE_WHEN_IDLE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_FLATPACK_ENDPOINT_SEND_EMPTY_MESSAGE_WHEN_IDLE_DOC);
        conf.define(CAMEL_SOURCE_FLATPACK_ENDPOINT_EXCEPTION_HANDLER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_FLATPACK_ENDPOINT_EXCEPTION_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_FLATPACK_ENDPOINT_EXCEPTION_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_FLATPACK_ENDPOINT_EXCHANGE_PATTERN_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_FLATPACK_ENDPOINT_EXCHANGE_PATTERN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_FLATPACK_ENDPOINT_EXCHANGE_PATTERN_DOC);
        conf.define(CAMEL_SOURCE_FLATPACK_ENDPOINT_POLL_STRATEGY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_FLATPACK_ENDPOINT_POLL_STRATEGY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_FLATPACK_ENDPOINT_POLL_STRATEGY_DOC);
        conf.define(CAMEL_SOURCE_FLATPACK_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_FLATPACK_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_FLATPACK_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SOURCE_FLATPACK_ENDPOINT_BACKOFF_ERROR_THRESHOLD_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_FLATPACK_ENDPOINT_BACKOFF_ERROR_THRESHOLD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_FLATPACK_ENDPOINT_BACKOFF_ERROR_THRESHOLD_DOC);
        conf.define(CAMEL_SOURCE_FLATPACK_ENDPOINT_BACKOFF_IDLE_THRESHOLD_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_FLATPACK_ENDPOINT_BACKOFF_IDLE_THRESHOLD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_FLATPACK_ENDPOINT_BACKOFF_IDLE_THRESHOLD_DOC);
        conf.define(CAMEL_SOURCE_FLATPACK_ENDPOINT_BACKOFF_MULTIPLIER_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_FLATPACK_ENDPOINT_BACKOFF_MULTIPLIER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_FLATPACK_ENDPOINT_BACKOFF_MULTIPLIER_DOC);
        conf.define(CAMEL_SOURCE_FLATPACK_ENDPOINT_DELAY_CONF, ConfigDef.Type.LONG, CAMEL_SOURCE_FLATPACK_ENDPOINT_DELAY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_FLATPACK_ENDPOINT_DELAY_DOC);
        conf.define(CAMEL_SOURCE_FLATPACK_ENDPOINT_GREEDY_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_FLATPACK_ENDPOINT_GREEDY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_FLATPACK_ENDPOINT_GREEDY_DOC);
        conf.define(CAMEL_SOURCE_FLATPACK_ENDPOINT_INITIAL_DELAY_CONF, ConfigDef.Type.LONG, CAMEL_SOURCE_FLATPACK_ENDPOINT_INITIAL_DELAY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_FLATPACK_ENDPOINT_INITIAL_DELAY_DOC);
        conf.define(CAMEL_SOURCE_FLATPACK_ENDPOINT_REPEAT_COUNT_CONF, ConfigDef.Type.LONG, CAMEL_SOURCE_FLATPACK_ENDPOINT_REPEAT_COUNT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_FLATPACK_ENDPOINT_REPEAT_COUNT_DOC);
        conf.define(CAMEL_SOURCE_FLATPACK_ENDPOINT_RUN_LOGGING_LEVEL_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_FLATPACK_ENDPOINT_RUN_LOGGING_LEVEL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_FLATPACK_ENDPOINT_RUN_LOGGING_LEVEL_DOC);
        conf.define(CAMEL_SOURCE_FLATPACK_ENDPOINT_SCHEDULED_EXECUTOR_SERVICE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_FLATPACK_ENDPOINT_SCHEDULED_EXECUTOR_SERVICE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_FLATPACK_ENDPOINT_SCHEDULED_EXECUTOR_SERVICE_DOC);
        conf.define(CAMEL_SOURCE_FLATPACK_ENDPOINT_SCHEDULER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_FLATPACK_ENDPOINT_SCHEDULER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_FLATPACK_ENDPOINT_SCHEDULER_DOC);
        conf.define(CAMEL_SOURCE_FLATPACK_ENDPOINT_SCHEDULER_PROPERTIES_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_FLATPACK_ENDPOINT_SCHEDULER_PROPERTIES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_FLATPACK_ENDPOINT_SCHEDULER_PROPERTIES_DOC);
        conf.define(CAMEL_SOURCE_FLATPACK_ENDPOINT_START_SCHEDULER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_FLATPACK_ENDPOINT_START_SCHEDULER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_FLATPACK_ENDPOINT_START_SCHEDULER_DOC);
        conf.define(CAMEL_SOURCE_FLATPACK_ENDPOINT_TIME_UNIT_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_FLATPACK_ENDPOINT_TIME_UNIT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_FLATPACK_ENDPOINT_TIME_UNIT_DOC);
        conf.define(CAMEL_SOURCE_FLATPACK_ENDPOINT_USE_FIXED_DELAY_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_FLATPACK_ENDPOINT_USE_FIXED_DELAY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_FLATPACK_ENDPOINT_USE_FIXED_DELAY_DOC);
        conf.define(CAMEL_SOURCE_FLATPACK_COMPONENT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_FLATPACK_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_FLATPACK_COMPONENT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_FLATPACK_COMPONENT_AUTOWIRED_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_FLATPACK_COMPONENT_AUTOWIRED_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_FLATPACK_COMPONENT_AUTOWIRED_ENABLED_DOC);
        return conf;
    }
}