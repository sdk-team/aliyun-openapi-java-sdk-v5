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

import com.aliyuncs.v5.ecs.model.v20160314.DescribeDedicatedHostTypesResponse;
import com.aliyuncs.v5.ecs.model.v20160314.DescribeDedicatedHostTypesResponse.DedicatedHostType;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class DescribeDedicatedHostTypesResponseUnmarshaller {

	public static DescribeDedicatedHostTypesResponse unmarshall(DescribeDedicatedHostTypesResponse describeDedicatedHostTypesResponse, UnmarshallerContext _ctx) {
		
		describeDedicatedHostTypesResponse.setRequestId(_ctx.stringValue("DescribeDedicatedHostTypesResponse.RequestId"));

		List<DedicatedHostType> dedicatedHostTypes = new ArrayList<DedicatedHostType>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDedicatedHostTypesResponse.DedicatedHostTypes.Length"); i++) {
			DedicatedHostType dedicatedHostType = new DedicatedHostType();
			dedicatedHostType.setDedicatedHostType(_ctx.stringValue("DescribeDedicatedHostTypesResponse.DedicatedHostTypes["+ i +"].DedicatedHostType"));
			dedicatedHostType.setGeneration(_ctx.stringValue("DescribeDedicatedHostTypesResponse.DedicatedHostTypes["+ i +"].Generation"));
			dedicatedHostType.setTotalSockets(_ctx.integerValue("DescribeDedicatedHostTypesResponse.DedicatedHostTypes["+ i +"].TotalSockets"));
			dedicatedHostType.setTotalVcpus(_ctx.integerValue("DescribeDedicatedHostTypesResponse.DedicatedHostTypes["+ i +"].TotalVcpus"));
			dedicatedHostType.setTotalPhysicalCores(_ctx.integerValue("DescribeDedicatedHostTypesResponse.DedicatedHostTypes["+ i +"].TotalPhysicalCores"));
			dedicatedHostType.setMemorySize(_ctx.floatValue("DescribeDedicatedHostTypesResponse.DedicatedHostTypes["+ i +"].MemorySize"));
			dedicatedHostType.setLocalStorageCapacity(_ctx.longValue("DescribeDedicatedHostTypesResponse.DedicatedHostTypes["+ i +"].LocalStorageCapacity"));
			dedicatedHostType.setLocalStorageAmount(_ctx.integerValue("DescribeDedicatedHostTypesResponse.DedicatedHostTypes["+ i +"].LocalStorageAmount"));
			dedicatedHostType.setLocalStorageCategory(_ctx.stringValue("DescribeDedicatedHostTypesResponse.DedicatedHostTypes["+ i +"].LocalStorageCategory"));

			List<String> supportInstanceTypeFamilies = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDedicatedHostTypesResponse.DedicatedHostTypes["+ i +"].SupportInstanceTypeFamilies.Length"); j++) {
				supportInstanceTypeFamilies.add(_ctx.stringValue("DescribeDedicatedHostTypesResponse.DedicatedHostTypes["+ i +"].SupportInstanceTypeFamilies["+ j +"]"));
			}
			dedicatedHostType.setSupportInstanceTypeFamilies(supportInstanceTypeFamilies);

			dedicatedHostTypes.add(dedicatedHostType);
		}
		describeDedicatedHostTypesResponse.setDedicatedHostTypes(dedicatedHostTypes);
	 
	 	return describeDedicatedHostTypesResponse;
	}
}