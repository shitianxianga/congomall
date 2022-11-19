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

package org.opengoofy.congomall.biz.cart.application.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 查询选中购物车商品出参
 *
 * @author chen.ma
 * @github https://github.com/opengoofy
 */
@Data
public class CartItemQuerySelectRespDTO {

    @ApiModelProperty("商品 spu id")
    private String productId;
    
    @ApiModelProperty("商品 sku id")
    private String productSkuId;
    
    @ApiModelProperty("c 端用户 id")
    private String customerUserId;
    
    @ApiModelProperty("商品图")
    private String productPic;
    
    @ApiModelProperty("商品名称")
    private String productName;
    
    @ApiModelProperty("商品品牌")
    private String productBrand;
    
    @ApiModelProperty("商品价格")
    private BigDecimal productPrice;
    
    @ApiModelProperty("加购物车数量")
    private Integer productQuantity;
    
    @ApiModelProperty("商品规格，json 格式")
    private String productAttribute;
}