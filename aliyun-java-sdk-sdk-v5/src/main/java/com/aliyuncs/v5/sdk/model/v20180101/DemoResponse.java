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

package com.aliyuncs.v5.sdk.model.v20180101;

import java.util.List;
import java.util.Map;
import com.aliyuncs.v5.AcsResponse;
import com.aliyuncs.v5.sdk.transform.v20180101.DemoResponseUnmarshaller;
import com.aliyuncs.v5.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DemoResponse extends AcsResponse {

	private String requestId;

	private String tetMap;

	private List<Map<Object,Object>> listMap;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTetMap() {
		return this.tetMap;
	}

	public void setTetMap(String tetMap) {
		this.tetMap = tetMap;
	}

	public List<Map<Object,Object>> getListMap() {
		return this.listMap;
	}

	public void setListMap(List<Map<Object,Object>> listMap) {
		this.listMap = listMap;
	}

	@Override
	public DemoResponse getInstance(UnmarshallerContext context) {
		return	DemoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
