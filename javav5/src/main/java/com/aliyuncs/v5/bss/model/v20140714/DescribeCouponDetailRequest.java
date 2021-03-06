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

package com.aliyuncs.v5.bss.model.v20140714;

import com.aliyuncs.v5.RpcAcsRequest;
import com.aliyuncs.v5.http.ProtocolType;
import com.aliyuncs.v5.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeCouponDetailRequest extends RpcAcsRequest<DescribeCouponDetailResponse> {
	   

	private String couponNumber;
	public DescribeCouponDetailRequest() {
		super("Bss", "2014-07-14", "DescribeCouponDetail");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.GET);
	}

	public String getCouponNumber() {
		return this.couponNumber;
	}

	public void setCouponNumber(String couponNumber) {
		this.couponNumber = couponNumber;
		if(couponNumber != null){
			putQueryParameter("CouponNumber", couponNumber);
		}
	}

	@Override
	public Class<DescribeCouponDetailResponse> getResponseClass() {
		return DescribeCouponDetailResponse.class;
	}

}
