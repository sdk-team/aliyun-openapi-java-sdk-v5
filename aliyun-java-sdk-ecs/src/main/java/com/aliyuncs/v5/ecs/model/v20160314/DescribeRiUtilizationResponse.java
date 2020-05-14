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

package com.aliyuncs.v5.ecs.model.v20160314;

import java.util.List;
import com.aliyuncs.v5.AcsResponse;
import com.aliyuncs.v5.ecs.transform.v20160314.DescribeRiUtilizationResponseUnmarshaller;
import com.aliyuncs.v5.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRiUtilizationResponse extends AcsResponse {

	private String requestId;

	private List<Utilization> utilizations;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Utilization> getUtilizations() {
		return this.utilizations;
	}

	public void setUtilizations(List<Utilization> utilizations) {
		this.utilizations = utilizations;
	}

	public static class Utilization {

		private String instanceId;

		private String utilization;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getUtilization() {
			return this.utilization;
		}

		public void setUtilization(String utilization) {
			this.utilization = utilization;
		}
	}

	@Override
	public DescribeRiUtilizationResponse getInstance(UnmarshallerContext context) {
		return	DescribeRiUtilizationResponseUnmarshaller.unmarshall(this, context);
	}
}
