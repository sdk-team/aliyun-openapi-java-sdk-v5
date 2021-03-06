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

package com.aliyuncs.v5.bss.transform.v20140714;

import com.aliyuncs.v5.bss.model.v20140714.SubscriptionCreateOrderApiResponse;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class SubscriptionCreateOrderApiResponseUnmarshaller {

	public static SubscriptionCreateOrderApiResponse unmarshall(SubscriptionCreateOrderApiResponse subscriptionCreateOrderApiResponse, UnmarshallerContext _ctx) {
		
		subscriptionCreateOrderApiResponse.setRequestId(_ctx.stringValue("SubscriptionCreateOrderApiResponse.RequestId"));
		subscriptionCreateOrderApiResponse.setSuccess(_ctx.booleanValue("SubscriptionCreateOrderApiResponse.Success"));
		subscriptionCreateOrderApiResponse.setCode(_ctx.stringValue("SubscriptionCreateOrderApiResponse.Code"));
		subscriptionCreateOrderApiResponse.setMessage(_ctx.stringValue("SubscriptionCreateOrderApiResponse.Message"));
		subscriptionCreateOrderApiResponse.setData(_ctx.stringValue("SubscriptionCreateOrderApiResponse.Data"));
	 
	 	return subscriptionCreateOrderApiResponse;
	}
}