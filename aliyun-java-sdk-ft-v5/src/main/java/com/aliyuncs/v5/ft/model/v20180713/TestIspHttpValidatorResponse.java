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

package com.aliyuncs.v5.ft.model.v20180713;

import com.aliyuncs.v5.AcsResponse;
import com.aliyuncs.v5.ft.transform.v20180713.TestIspHttpValidatorResponseUnmarshaller;
import com.aliyuncs.v5.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class TestIspHttpValidatorResponse extends AcsResponse {

	private Boolean success;

	private String message;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public TestIspHttpValidatorResponse getInstance(UnmarshallerContext context) {
		return	TestIspHttpValidatorResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
