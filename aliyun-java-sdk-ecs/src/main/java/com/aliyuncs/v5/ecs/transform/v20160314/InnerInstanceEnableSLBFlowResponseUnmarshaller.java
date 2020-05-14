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

import com.aliyuncs.v5.ecs.model.v20160314.InnerInstanceEnableSLBFlowResponse;
import com.aliyuncs.v5.ecs.model.v20160314.InnerInstanceEnableSLBFlowResponse.ErrorCode;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class InnerInstanceEnableSLBFlowResponseUnmarshaller {

	public static InnerInstanceEnableSLBFlowResponse unmarshall(InnerInstanceEnableSLBFlowResponse innerInstanceEnableSLBFlowResponse, UnmarshallerContext _ctx) {
		
		innerInstanceEnableSLBFlowResponse.setRequestId(_ctx.stringValue("InnerInstanceEnableSLBFlowResponse.RequestId"));
		innerInstanceEnableSLBFlowResponse.setData(_ctx.stringValue("InnerInstanceEnableSLBFlowResponse.data"));

		ErrorCode errorCode = new ErrorCode();
		errorCode.setCode(_ctx.stringValue("InnerInstanceEnableSLBFlowResponse.errorCode.code"));
		errorCode.setMessage(_ctx.stringValue("InnerInstanceEnableSLBFlowResponse.errorCode.message"));
		errorCode.setIsSuccess(_ctx.booleanValue("InnerInstanceEnableSLBFlowResponse.errorCode.isSuccess"));
		innerInstanceEnableSLBFlowResponse.setErrorCode(errorCode);
	 
	 	return innerInstanceEnableSLBFlowResponse;
	}
}