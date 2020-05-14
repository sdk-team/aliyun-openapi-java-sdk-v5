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

import com.aliyuncs.v5.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.v5.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ModifyReservedInstancesRequest extends RpcAcsRequest<ModifyReservedInstancesResponse> {
	   

	private Long resourceOwnerId;

	private List<Configuration> configurations;

	private List<Tag> tags;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private List<String> reservedInstanceIds;
	public ModifyReservedInstancesRequest() {
		super("Ecs", "2016-03-14", "ModifyReservedInstances", "ecs");
		setMethod(MethodType.POST);
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public List<Configuration> getConfigurations() {
		return this.configurations;
	}

	public void setConfigurations(List<Configuration> configurations) {
		this.configurations = configurations;	
		if (configurations != null) {
			for (int depth1 = 0; depth1 < configurations.size(); depth1++) {
				putQueryParameter("Configuration." + (depth1 + 1) + ".ZoneId" , configurations.get(depth1).getZoneId());
				putQueryParameter("Configuration." + (depth1 + 1) + ".ReservedInstanceName" , configurations.get(depth1).getReservedInstanceName());
				putQueryParameter("Configuration." + (depth1 + 1) + ".InstanceType" , configurations.get(depth1).getInstanceType());
				putQueryParameter("Configuration." + (depth1 + 1) + ".Scope" , configurations.get(depth1).getScope());
				putQueryParameter("Configuration." + (depth1 + 1) + ".InstanceAmount" , configurations.get(depth1).getInstanceAmount());
			}
		}	
	}

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;	
		if (tags != null) {
			for (int depth1 = 0; depth1 < tags.size(); depth1++) {
				putQueryParameter("Tag." + (depth1 + 1) + ".Key" , tags.get(depth1).getKey());
				putQueryParameter("Tag." + (depth1 + 1) + ".Value" , tags.get(depth1).getValue());
			}
		}	
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public List<String> getReservedInstanceIds() {
		return this.reservedInstanceIds;
	}

	public void setReservedInstanceIds(List<String> reservedInstanceIds) {
		this.reservedInstanceIds = reservedInstanceIds;	
		if (reservedInstanceIds != null) {
			for (int i = 0; i < reservedInstanceIds.size(); i++) {
				putQueryParameter("ReservedInstanceId." + (i + 1) , reservedInstanceIds.get(i));
			}
		}	
	}

	public static class Configuration {

		private String zoneId;

		private String reservedInstanceName;

		private String instanceType;

		private String scope;

		private Integer instanceAmount;

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getReservedInstanceName() {
			return this.reservedInstanceName;
		}

		public void setReservedInstanceName(String reservedInstanceName) {
			this.reservedInstanceName = reservedInstanceName;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public String getScope() {
			return this.scope;
		}

		public void setScope(String scope) {
			this.scope = scope;
		}

		public Integer getInstanceAmount() {
			return this.instanceAmount;
		}

		public void setInstanceAmount(Integer instanceAmount) {
			this.instanceAmount = instanceAmount;
		}
	}

	public static class Tag {

		private String key;

		private String value;

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}

	@Override
	public Class<ModifyReservedInstancesResponse> getResponseClass() {
		return ModifyReservedInstancesResponse.class;
	}

}
