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

import com.aliyuncs.v5.RpcAcsRequest;
import com.aliyuncs.v5.http.MethodType;
import com.aliyuncs.v5.ft.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeleteAllStrategyRequest extends RpcAcsRequest<DeleteAllStrategyResponse> {
	   

	private Long bucUid;

	private String bucName;

	private String bucEmpId;

	private String productName;

	private String env;
	public DeleteAllStrategyRequest() {
		super("Ft", "2018-07-13", "DeleteAllStrategy");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getBucUid() {
		return this.bucUid;
	}

	public void setBucUid(Long bucUid) {
		this.bucUid = bucUid;
		if(bucUid != null){
			putQueryParameter("BucUid", bucUid.toString());
		}
	}

	public String getBucName() {
		return this.bucName;
	}

	public void setBucName(String bucName) {
		this.bucName = bucName;
		if(bucName != null){
			putQueryParameter("BucName", bucName);
		}
	}

	public String getBucEmpId() {
		return this.bucEmpId;
	}

	public void setBucEmpId(String bucEmpId) {
		this.bucEmpId = bucEmpId;
		if(bucEmpId != null){
			putQueryParameter("BucEmpId", bucEmpId);
		}
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
		if(productName != null){
			putQueryParameter("ProductName", productName);
		}
	}

	public String getEnv() {
		return this.env;
	}

	public void setEnv(String env) {
		this.env = env;
		if(env != null){
			putQueryParameter("Env", env);
		}
	}

	@Override
	public Class<DeleteAllStrategyResponse> getResponseClass() {
		return DeleteAllStrategyResponse.class;
	}

}
