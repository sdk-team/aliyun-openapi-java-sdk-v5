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

import com.aliyuncs.v5.ft.model.v20180713.MigrateStrategyResponse;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class MigrateStrategyResponseUnmarshaller {

	public static MigrateStrategyResponse unmarshall(MigrateStrategyResponse migrateStrategyResponse, UnmarshallerContext _ctx) {
		
		migrateStrategyResponse.setRequestId(_ctx.stringValue("MigrateStrategyResponse.RequestId"));
		migrateStrategyResponse.setSuccess(_ctx.booleanValue("MigrateStrategyResponse.Success"));
		migrateStrategyResponse.setCode(_ctx.stringValue("MigrateStrategyResponse.Code"));
		migrateStrategyResponse.setMessage(_ctx.stringValue("MigrateStrategyResponse.Message"));
		migrateStrategyResponse.setMessageCN(_ctx.stringValue("MigrateStrategyResponse.MessageCN"));
		migrateStrategyResponse.setData(_ctx.booleanValue("MigrateStrategyResponse.Data"));
	 
	 	return migrateStrategyResponse;
	}
}