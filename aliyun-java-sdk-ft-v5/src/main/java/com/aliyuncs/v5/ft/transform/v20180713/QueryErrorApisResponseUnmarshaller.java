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

package com.aliyuncs.v5.ft.transform.v20180713;

import com.aliyuncs.v5.ft.model.v20180713.QueryErrorApisResponse;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class QueryErrorApisResponseUnmarshaller {

	public static QueryErrorApisResponse unmarshall(QueryErrorApisResponse queryErrorApisResponse, UnmarshallerContext _ctx) {
		
		queryErrorApisResponse.setRequestId(_ctx.stringValue("QueryErrorApisResponse.RequestId"));
		queryErrorApisResponse.setCode(_ctx.stringValue("QueryErrorApisResponse.Code"));
		queryErrorApisResponse.setData(_ctx.booleanValue("QueryErrorApisResponse.Data"));
		queryErrorApisResponse.setMessage(_ctx.stringValue("QueryErrorApisResponse.Message"));
		queryErrorApisResponse.setMessageCN(_ctx.stringValue("QueryErrorApisResponse.MessageCN"));
		queryErrorApisResponse.setSuccess(_ctx.booleanValue("QueryErrorApisResponse.Success"));
	 
	 	return queryErrorApisResponse;
	}
}