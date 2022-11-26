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

package org.opengoofy.congomall.flow.monitor.agent.context;

import com.wujiuye.flow.FlowHelper;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 来源客户端参数
 *
 * @author chen.ma
 * @github https://github.com/opengoofy
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FlowMonitorSourceParam {
    
    /**
     * 请求方法
     */
    private String requestMethod;
    
    /**
     * 来源应用名
     */
    private String sourceApplicationName;
    
    /**
     * 来源请求 URI
     */
    private String sourceHttpUri;
    
    /**
     * 来源 Host
     */
    private String sourceHost;
    
    /**
     * 目标 Host
     */
    private String targetHost;
    
    /**
     * 目标请求 URI
     */
    private String targetHttpUri;
    
    /**
     * 流量统计
     */
    private FlowHelper flowHelper;
}