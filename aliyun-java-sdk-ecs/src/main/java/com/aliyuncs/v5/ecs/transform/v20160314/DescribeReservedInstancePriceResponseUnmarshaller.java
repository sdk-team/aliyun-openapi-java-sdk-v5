/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.v5.ecs.transform.v20160314;

import com.aliyuncs.v5.ecs.model.v20160314.DescribeReservedInstancePriceResponse;
import com.aliyuncs.v5.ecs.model.v20160314.DescribeReservedInstancePriceResponse.PriceInfo;
import com.aliyuncs.v5.ecs.model.v20160314.DescribeReservedInstancePriceResponse.PriceInfo.Order;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class DescribeReservedInstancePriceResponseUnmarshaller {

	public static DescribeReservedInstancePriceResponse unmarshall(DescribeReservedInstancePriceResponse describeReservedInstancePriceResponse, UnmarshallerContext _ctx) {
		
		describeReservedInstancePriceResponse.setRequestId(_ctx.stringValue("DescribeReservedInstancePriceResponse.RequestId"));

		PriceInfo priceInfo = new PriceInfo();

		Order order = new Order();
		order.setReservedInstanceHourPrice(_ctx.floatValue("DescribeReservedInstancePriceResponse.PriceInfo.Order.ReservedInstanceHourPrice"));
		order.setTradePrice(_ctx.floatValue("DescribeReservedInstancePriceResponse.PriceInfo.Order.TradePrice"));
		order.setCurrency(_ctx.stringValue("DescribeReservedInstancePriceResponse.PriceInfo.Order.Currency"));
		priceInfo.setOrder(order);
		describeReservedInstancePriceResponse.setPriceInfo(priceInfo);
	 
	 	return describeReservedInstancePriceResponse;
	}
}