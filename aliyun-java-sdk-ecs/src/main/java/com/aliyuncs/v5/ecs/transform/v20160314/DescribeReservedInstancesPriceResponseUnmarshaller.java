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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.v5.ecs.model.v20160314.DescribeReservedInstancesPriceResponse;
import com.aliyuncs.v5.ecs.model.v20160314.DescribeReservedInstancesPriceResponse.ReservedInstance;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class DescribeReservedInstancesPriceResponseUnmarshaller {

	public static DescribeReservedInstancesPriceResponse unmarshall(DescribeReservedInstancesPriceResponse describeReservedInstancesPriceResponse, UnmarshallerContext _ctx) {
		
		describeReservedInstancesPriceResponse.setRequestId(_ctx.stringValue("DescribeReservedInstancesPriceResponse.RequestId"));

		List<ReservedInstance> reservedInstances = new ArrayList<ReservedInstance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeReservedInstancesPriceResponse.ReservedInstances.Length"); i++) {
			ReservedInstance reservedInstance = new ReservedInstance();
			reservedInstance.setReservedInstanceId(_ctx.stringValue("DescribeReservedInstancesPriceResponse.ReservedInstances["+ i +"].ReservedInstanceId"));
			reservedInstance.setReservedInstanceHourPrice(_ctx.floatValue("DescribeReservedInstancesPriceResponse.ReservedInstances["+ i +"].ReservedInstanceHourPrice"));
			reservedInstance.setTradePrice(_ctx.floatValue("DescribeReservedInstancesPriceResponse.ReservedInstances["+ i +"].TradePrice"));

			reservedInstances.add(reservedInstance);
		}
		describeReservedInstancesPriceResponse.setReservedInstances(reservedInstances);
	 
	 	return describeReservedInstancesPriceResponse;
	}
}