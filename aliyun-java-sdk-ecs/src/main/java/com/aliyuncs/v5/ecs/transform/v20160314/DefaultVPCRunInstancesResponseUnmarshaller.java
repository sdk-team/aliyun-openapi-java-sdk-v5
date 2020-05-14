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

import com.aliyuncs.v5.ecs.model.v20160314.DefaultVPCRunInstancesResponse;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class DefaultVPCRunInstancesResponseUnmarshaller {

	public static DefaultVPCRunInstancesResponse unmarshall(DefaultVPCRunInstancesResponse defaultVPCRunInstancesResponse, UnmarshallerContext _ctx) {
		
		defaultVPCRunInstancesResponse.setRequestId(_ctx.stringValue("DefaultVPCRunInstancesResponse.RequestId"));
		defaultVPCRunInstancesResponse.setTaskId(_ctx.stringValue("DefaultVPCRunInstancesResponse.TaskId"));

		List<String> instanceIdSets = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DefaultVPCRunInstancesResponse.InstanceIdSets.Length"); i++) {
			instanceIdSets.add(_ctx.stringValue("DefaultVPCRunInstancesResponse.InstanceIdSets["+ i +"]"));
		}
		defaultVPCRunInstancesResponse.setInstanceIdSets(instanceIdSets);
	 
	 	return defaultVPCRunInstancesResponse;
	}
}