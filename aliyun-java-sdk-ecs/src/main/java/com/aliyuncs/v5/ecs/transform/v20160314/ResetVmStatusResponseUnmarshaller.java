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

import com.aliyuncs.v5.ecs.model.v20160314.ResetVmStatusResponse;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class ResetVmStatusResponseUnmarshaller {

	public static ResetVmStatusResponse unmarshall(ResetVmStatusResponse resetVmStatusResponse, UnmarshallerContext _ctx) {
		
		resetVmStatusResponse.setRequestId(_ctx.stringValue("ResetVmStatusResponse.RequestId"));
		resetVmStatusResponse.setResult(_ctx.stringValue("ResetVmStatusResponse.Result"));
	 
	 	return resetVmStatusResponse;
	}
}