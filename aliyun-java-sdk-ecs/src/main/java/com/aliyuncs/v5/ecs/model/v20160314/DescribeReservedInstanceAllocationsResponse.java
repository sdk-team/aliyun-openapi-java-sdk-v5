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
import com.aliyuncs.v5.ecs.transform.v20160314.DescribeReservedInstanceAllocationsResponseUnmarshaller;
import com.aliyuncs.v5.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeReservedInstanceAllocationsResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<Allocation> allocations;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<Allocation> getAllocations() {
		return this.allocations;
	}

	public void setAllocations(List<Allocation> allocations) {
		this.allocations = allocations;
	}

	public static class Allocation {

		private String resourceOwnerId;

		private String beAllocatedAccountId;

		private String reservedInstanceId;

		public String getResourceOwnerId() {
			return this.resourceOwnerId;
		}

		public void setResourceOwnerId(String resourceOwnerId) {
			this.resourceOwnerId = resourceOwnerId;
		}

		public String getBeAllocatedAccountId() {
			return this.beAllocatedAccountId;
		}

		public void setBeAllocatedAccountId(String beAllocatedAccountId) {
			this.beAllocatedAccountId = beAllocatedAccountId;
		}

		public String getReservedInstanceId() {
			return this.reservedInstanceId;
		}

		public void setReservedInstanceId(String reservedInstanceId) {
			this.reservedInstanceId = reservedInstanceId;
		}
	}

	@Override
	public DescribeReservedInstanceAllocationsResponse getInstance(UnmarshallerContext context) {
		return	DescribeReservedInstanceAllocationsResponseUnmarshaller.unmarshall(this, context);
	}
}
