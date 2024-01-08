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
 */package org.apache.camel.kafkaconnector.slacksource;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSourceConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelSlacksourceSourceConnectorConfig
        extends
            CamelSourceConnectorConfig {

    public static final String CAMEL_SOURCE_SLACKSOURCE_KAMELET_CHANNEL_CONF = "camel.kamelet.slack-source.channel";
    public static final String CAMEL_SOURCE_SLACKSOURCE_KAMELET_CHANNEL_DOC = "The Slack channel to receive messages from. Example: #myroom";
    public static final String CAMEL_SOURCE_SLACKSOURCE_KAMELET_CHANNEL_DEFAULT = null;
    public static final String CAMEL_SOURCE_SLACKSOURCE_KAMELET_TOKEN_CONF = "camel.kamelet.slack-source.token";
    public static final String CAMEL_SOURCE_SLACKSOURCE_KAMELET_TOKEN_DOC = "The Bot User OAuth Access Token to access Slack. A Slack app that has the following permissions is required: `channels:history`, `groups:history`, `im:history`, `mpim:history`, `channels:read`, `groups:read`, `im:read`, and `mpim:read`.";
    public static final String CAMEL_SOURCE_SLACKSOURCE_KAMELET_TOKEN_DEFAULT = null;
    public static final String CAMEL_SOURCE_SLACKSOURCE_KAMELET_DELAY_CONF = "camel.kamelet.slack-source.delay";
    public static final String CAMEL_SOURCE_SLACKSOURCE_KAMELET_DELAY_DOC = "The delay between polls. If no unit provided, miliseconds is the default. Example: 60s or 6000 or 1m";
    public static final String CAMEL_SOURCE_SLACKSOURCE_KAMELET_DELAY_DEFAULT = "60000";

    public CamelSlacksourceSourceConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelSlacksourceSourceConnectorConfig(
            Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSourceConnectorConfig.conf());
        conf.define(CAMEL_SOURCE_SLACKSOURCE_KAMELET_CHANNEL_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SLACKSOURCE_KAMELET_CHANNEL_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_SLACKSOURCE_KAMELET_CHANNEL_DOC);
        conf.define(CAMEL_SOURCE_SLACKSOURCE_KAMELET_TOKEN_CONF, ConfigDef.Type.PASSWORD, CAMEL_SOURCE_SLACKSOURCE_KAMELET_TOKEN_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_SLACKSOURCE_KAMELET_TOKEN_DOC);
        conf.define(CAMEL_SOURCE_SLACKSOURCE_KAMELET_DELAY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SLACKSOURCE_KAMELET_DELAY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SLACKSOURCE_KAMELET_DELAY_DOC);
        return conf;
    }
}