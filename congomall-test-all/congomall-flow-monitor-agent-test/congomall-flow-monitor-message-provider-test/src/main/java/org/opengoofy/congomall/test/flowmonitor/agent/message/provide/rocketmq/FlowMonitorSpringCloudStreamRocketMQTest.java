/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.opengoofy.congomall.test.flowmonitor.agent.message.provide.rocketmq;


import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Component;

/**
 * 流量治理之 RocketMQ 测试
 *
 * @author chen.ma
 * @github https://github.com/opengoofy
 */
@Slf4j
@Component
@AllArgsConstructor
public class FlowMonitorSpringCloudStreamRocketMQTest implements CommandLineRunner {
    
    private final MessageChannel output;
    
    @Override
    public void run(String... args) throws Exception {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            Message<?> message = MessageBuilder
                    .withPayload("Flow Monitor SpringCloud Stream RocketMQ Test.")
                    .build();
            output.send(message);
            Thread.sleep(1000L);
        }
    }
    
    @StreamListener(Sink.INPUT)
    public void springCloudStreamRocketMQConsumerTest(String param) {
        log.info("================ param: {}", param);
    }
}