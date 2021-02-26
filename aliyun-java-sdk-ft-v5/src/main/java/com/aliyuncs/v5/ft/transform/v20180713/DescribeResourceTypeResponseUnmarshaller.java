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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.v5.ft.model.v20180713.DescribeResourceTypeResponse;
import com.aliyuncs.v5.ft.model.v20180713.DescribeResourceTypeResponse.OperationAPI;
import com.aliyuncs.v5.ft.model.v20180713.DescribeResourceTypeResponse.OperationAPI.APIIdentity;
import com.aliyuncs.v5.ft.model.v20180713.DescribeResourceTypeResponse.ResourceTypeAttributeMappings;
import com.aliyuncs.v5.ft.model.v20180713.DescribeResourceTypeResponse.ResourceTypeAttributeMappings.OperationGet;
import com.aliyuncs.v5.ft.model.v20180713.DescribeResourceTypeResponse.ResourceTypeAttributeMappings.OperationGet.ResourceTypeOperationDetail;
import com.aliyuncs.v5.ft.model.v20180713.DescribeResourceTypeResponse.ResourceTypeAttributeMappings.OperationGet.ResourceTypeOperationDetail.RequiredAttributeMappings;
import com.aliyuncs.v5.ft.model.v20180713.DescribeResourceTypeResponse.Schema;
import com.aliyuncs.v5.ft.model.v20180713.DescribeResourceTypeResponse.State;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class DescribeResourceTypeResponseUnmarshaller {

	public static DescribeResourceTypeResponse unmarshall(DescribeResourceTypeResponse describeResourceTypeResponse, UnmarshallerContext _ctx) {
		
		describeResourceTypeResponse.setRequestId(_ctx.stringValue("DescribeResourceTypeResponse.RequestId"));
		describeResourceTypeResponse.setProduct(_ctx.stringValue("DescribeResourceTypeResponse.Product"));
		describeResourceTypeResponse.setResourceTypeCode(_ctx.stringValue("DescribeResourceTypeResponse.ResourceTypeCode"));
		describeResourceTypeResponse.setResourceTypeVersion(_ctx.stringValue("DescribeResourceTypeResponse.ResourceTypeVersion"));
		describeResourceTypeResponse.setTitle(_ctx.stringValue("DescribeResourceTypeResponse.Title"));
		describeResourceTypeResponse.setUniqueIdentifier(_ctx.stringValue("DescribeResourceTypeResponse.UniqueIdentifier"));
		describeResourceTypeResponse.setDescription(_ctx.stringValue("DescribeResourceTypeResponse.Description"));
		describeResourceTypeResponse.setResourceIdField(_ctx.stringValue("DescribeResourceTypeResponse.ResourceIdField"));
		describeResourceTypeResponse.setDefinitions(_ctx.stringValue("DescribeResourceTypeResponse.Definitions"));

		Schema schema = new Schema();
		schema.setRef(_ctx.stringValue("DescribeResourceTypeResponse.Schema.Ref"));
		schema.setTitle(_ctx.stringValue("DescribeResourceTypeResponse.Schema.Title"));
		schema.setType(_ctx.stringValue("DescribeResourceTypeResponse.Schema.Type"));
		schema.setDescription(_ctx.stringValue("DescribeResourceTypeResponse.Schema.Description"));
		schema.setProperties(_ctx.stringValue("DescribeResourceTypeResponse.Schema.Properties"));
		schema.setItemName(_ctx.stringValue("DescribeResourceTypeResponse.Schema.ItemName"));
		schema.setItems(_ctx.stringValue("DescribeResourceTypeResponse.Schema.Items"));
		describeResourceTypeResponse.setSchema(schema);

		OperationAPI operationAPI = new OperationAPI();

		List<APIIdentity> createAPIsList = new ArrayList<APIIdentity>();
		for (int i = 0; i < _ctx.lengthValue("DescribeResourceTypeResponse.OperationAPI.CreateAPIs.Length"); i++) {
			APIIdentity aPIIdentity = new APIIdentity();
			aPIIdentity.setAPIGroup(_ctx.stringValue("DescribeResourceTypeResponse.OperationAPI.CreateAPIs["+ i +"].APIGroup"));
			aPIIdentity.setAPIVersion(_ctx.stringValue("DescribeResourceTypeResponse.OperationAPI.CreateAPIs["+ i +"].APIVersion"));
			aPIIdentity.setAPIName(_ctx.stringValue("DescribeResourceTypeResponse.OperationAPI.CreateAPIs["+ i +"].APIName"));

			createAPIsList.add(aPIIdentity);
		}
		operationAPI.setCreateAPIs(createAPIsList);

		List<APIIdentity> getAPIsList = new ArrayList<APIIdentity>();
		for (int i = 0; i < _ctx.lengthValue("DescribeResourceTypeResponse.OperationAPI.GetAPIs.Length"); i++) {
			APIIdentity aPIIdentity_ = new APIIdentity();
			aPIIdentity_.setAPIGroup(_ctx.stringValue("DescribeResourceTypeResponse.OperationAPI.GetAPIs["+ i +"].APIGroup"));
			aPIIdentity_.setAPIVersion(_ctx.stringValue("DescribeResourceTypeResponse.OperationAPI.GetAPIs["+ i +"].APIVersion"));
			aPIIdentity_.setAPIName(_ctx.stringValue("DescribeResourceTypeResponse.OperationAPI.GetAPIs["+ i +"].APIName"));

			getAPIsList.add(aPIIdentity_);
		}
		operationAPI.setGetAPIs(getAPIsList);

		List<APIIdentity> listAPIsList = new ArrayList<APIIdentity>();
		for (int i = 0; i < _ctx.lengthValue("DescribeResourceTypeResponse.OperationAPI.ListAPIs.Length"); i++) {
			APIIdentity aPIIdentity_ = new APIIdentity();
			aPIIdentity_.setAPIGroup(_ctx.stringValue("DescribeResourceTypeResponse.OperationAPI.ListAPIs["+ i +"].APIGroup"));
			aPIIdentity_.setAPIVersion(_ctx.stringValue("DescribeResourceTypeResponse.OperationAPI.ListAPIs["+ i +"].APIVersion"));
			aPIIdentity_.setAPIName(_ctx.stringValue("DescribeResourceTypeResponse.OperationAPI.ListAPIs["+ i +"].APIName"));

			listAPIsList.add(aPIIdentity_);
		}
		operationAPI.setListAPIs(listAPIsList);

		List<APIIdentity> updateAPIsList = new ArrayList<APIIdentity>();
		for (int i = 0; i < _ctx.lengthValue("DescribeResourceTypeResponse.OperationAPI.UpdateAPIs.Length"); i++) {
			APIIdentity aPIIdentity_ = new APIIdentity();
			aPIIdentity_.setAPIGroup(_ctx.stringValue("DescribeResourceTypeResponse.OperationAPI.UpdateAPIs["+ i +"].APIGroup"));
			aPIIdentity_.setAPIVersion(_ctx.stringValue("DescribeResourceTypeResponse.OperationAPI.UpdateAPIs["+ i +"].APIVersion"));
			aPIIdentity_.setAPIName(_ctx.stringValue("DescribeResourceTypeResponse.OperationAPI.UpdateAPIs["+ i +"].APIName"));

			updateAPIsList.add(aPIIdentity_);
		}
		operationAPI.setUpdateAPIs(updateAPIsList);

		List<APIIdentity> deleteAPIsList = new ArrayList<APIIdentity>();
		for (int i = 0; i < _ctx.lengthValue("DescribeResourceTypeResponse.OperationAPI.DeleteAPIs.Length"); i++) {
			APIIdentity aPIIdentity_ = new APIIdentity();
			aPIIdentity_.setAPIGroup(_ctx.stringValue("DescribeResourceTypeResponse.OperationAPI.DeleteAPIs["+ i +"].APIGroup"));
			aPIIdentity_.setAPIVersion(_ctx.stringValue("DescribeResourceTypeResponse.OperationAPI.DeleteAPIs["+ i +"].APIVersion"));
			aPIIdentity_.setAPIName(_ctx.stringValue("DescribeResourceTypeResponse.OperationAPI.DeleteAPIs["+ i +"].APIName"));

			deleteAPIsList.add(aPIIdentity_);
		}
		operationAPI.setDeleteAPIs(deleteAPIsList);

		List<APIIdentity> establishRelationAPIsList = new ArrayList<APIIdentity>();
		for (int i = 0; i < _ctx.lengthValue("DescribeResourceTypeResponse.OperationAPI.EstablishRelationAPIs.Length"); i++) {
			APIIdentity aPIIdentity_ = new APIIdentity();
			aPIIdentity_.setAPIGroup(_ctx.stringValue("DescribeResourceTypeResponse.OperationAPI.EstablishRelationAPIs["+ i +"].APIGroup"));
			aPIIdentity_.setAPIVersion(_ctx.stringValue("DescribeResourceTypeResponse.OperationAPI.EstablishRelationAPIs["+ i +"].APIVersion"));
			aPIIdentity_.setAPIName(_ctx.stringValue("DescribeResourceTypeResponse.OperationAPI.EstablishRelationAPIs["+ i +"].APIName"));

			establishRelationAPIsList.add(aPIIdentity_);
		}
		operationAPI.setEstablishRelationAPIs(establishRelationAPIsList);

		List<APIIdentity> destroyRelationAPIsList = new ArrayList<APIIdentity>();
		for (int i = 0; i < _ctx.lengthValue("DescribeResourceTypeResponse.OperationAPI.DestroyRelationAPIs.Length"); i++) {
			APIIdentity aPIIdentity_ = new APIIdentity();
			aPIIdentity_.setAPIGroup(_ctx.stringValue("DescribeResourceTypeResponse.OperationAPI.DestroyRelationAPIs["+ i +"].APIGroup"));
			aPIIdentity_.setAPIVersion(_ctx.stringValue("DescribeResourceTypeResponse.OperationAPI.DestroyRelationAPIs["+ i +"].APIVersion"));
			aPIIdentity_.setAPIName(_ctx.stringValue("DescribeResourceTypeResponse.OperationAPI.DestroyRelationAPIs["+ i +"].APIName"));

			destroyRelationAPIsList.add(aPIIdentity_);
		}
		operationAPI.setDestroyRelationAPIs(destroyRelationAPIsList);
		describeResourceTypeResponse.setOperationAPI(operationAPI);

		ResourceTypeAttributeMappings resourceTypeAttributeMappings = new ResourceTypeAttributeMappings();
		resourceTypeAttributeMappings.setPrePaidValue(_ctx.stringValue("DescribeResourceTypeResponse.ResourceTypeAttributeMappings.PrePaidValue"));
		resourceTypeAttributeMappings.setEnableAttributeMapping(_ctx.stringValue("DescribeResourceTypeResponse.ResourceTypeAttributeMappings.EnableAttributeMapping"));

		OperationGet operationGet = new OperationGet();

		List<ResourceTypeOperationDetail> apiInfosList = new ArrayList<ResourceTypeOperationDetail>();
		for (int i = 0; i < _ctx.lengthValue("DescribeResourceTypeResponse.ResourceTypeAttributeMappings.OperationGet.ApiInfos.Length"); i++) {
			ResourceTypeOperationDetail resourceTypeOperationDetail = new ResourceTypeOperationDetail();
			resourceTypeOperationDetail.setGatewaySource(_ctx.stringValue("DescribeResourceTypeResponse.ResourceTypeAttributeMappings.OperationGet.ApiInfos["+ i +"].GatewaySource"));
			resourceTypeOperationDetail.setGatewayProduct(_ctx.stringValue("DescribeResourceTypeResponse.ResourceTypeAttributeMappings.OperationGet.ApiInfos["+ i +"].GatewayProduct"));
			resourceTypeOperationDetail.setGatewayVersion(_ctx.stringValue("DescribeResourceTypeResponse.ResourceTypeAttributeMappings.OperationGet.ApiInfos["+ i +"].GatewayVersion"));
			resourceTypeOperationDetail.setApiName(_ctx.stringValue("DescribeResourceTypeResponse.ResourceTypeAttributeMappings.OperationGet.ApiInfos["+ i +"].ApiName"));
			resourceTypeOperationDetail.setAttributeAsyncDetections(_ctx.stringValue("DescribeResourceTypeResponse.ResourceTypeAttributeMappings.OperationGet.ApiInfos["+ i +"].AttributeAsyncDetections"));

			RequiredAttributeMappings requiredAttributeMappings = new RequiredAttributeMappings();
			requiredAttributeMappings.setIdMappings(_ctx.stringValue("DescribeResourceTypeResponse.ResourceTypeAttributeMappings.OperationGet.ApiInfos["+ i +"].RequiredAttributeMappings.IdMappings"));
			resourceTypeOperationDetail.setRequiredAttributeMappings(requiredAttributeMappings);

			apiInfosList.add(resourceTypeOperationDetail);
		}
		operationGet.setApiInfos(apiInfosList);
		resourceTypeAttributeMappings.setOperationGet(operationGet);
		describeResourceTypeResponse.setResourceTypeAttributeMappings(resourceTypeAttributeMappings);

		List<State> statesList = new ArrayList<State>();
		for (int i = 0; i < _ctx.lengthValue("DescribeResourceTypeResponse.States.Length"); i++) {
			State state = new State();
			state.setCode(_ctx.stringValue("DescribeResourceTypeResponse.States["+ i +"].Code"));
			state.setDescription(_ctx.stringValue("DescribeResourceTypeResponse.States["+ i +"].Description"));

			statesList.add(state);
		}
		describeResourceTypeResponse.setStates(statesList);
	 
	 	return describeResourceTypeResponse;
	}
}