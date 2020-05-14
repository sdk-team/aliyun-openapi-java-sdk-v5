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
import com.aliyuncs.v5.ecs.transform.v20160314.InnerCountEcsInRegionResponseUnmarshaller;
import com.aliyuncs.v5.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class InnerCountEcsInRegionResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private List<EcsInRegion> ecsInRegions;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public List<EcsInRegion> getEcsInRegions() {
		return this.ecsInRegions;
	}

	public void setEcsInRegions(List<EcsInRegion> ecsInRegions) {
		this.ecsInRegions = ecsInRegions;
	}

	public static class EcsInRegion {

		private Integer ecsNum;

		private Long aliUid;

		private String regionNo;

		public Integer getEcsNum() {
			return this.ecsNum;
		}

		public void setEcsNum(Integer ecsNum) {
			this.ecsNum = ecsNum;
		}

		public Long getAliUid() {
			return this.aliUid;
		}

		public void setAliUid(Long aliUid) {
			this.aliUid = aliUid;
		}

		public String getRegionNo() {
			return this.regionNo;
		}

		public void setRegionNo(String regionNo) {
			this.regionNo = regionNo;
		}
	}

	@Override
	public InnerCountEcsInRegionResponse getInstance(UnmarshallerContext context) {
		return	InnerCountEcsInRegionResponseUnmarshaller.unmarshall(this, context);
	}
}
