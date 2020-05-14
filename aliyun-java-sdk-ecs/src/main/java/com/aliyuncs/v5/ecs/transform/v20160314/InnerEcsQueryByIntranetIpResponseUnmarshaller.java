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

package com.aliyuncs.v5.ecs.transform.v20160314;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.v5.ecs.model.v20160314.InnerEcsQueryByIntranetIpResponse;
import com.aliyuncs.v5.ecs.model.v20160314.InnerEcsQueryByIntranetIpResponse.Data;
import com.aliyuncs.v5.ecs.model.v20160314.InnerEcsQueryByIntranetIpResponse.Data.Iz;
import com.aliyuncs.v5.ecs.model.v20160314.InnerEcsQueryByIntranetIpResponse.Data.Iz.IzResourceModelItem;
import com.aliyuncs.v5.ecs.model.v20160314.InnerEcsQueryByIntranetIpResponse.Data.Region;
import com.aliyuncs.v5.ecs.model.v20160314.InnerEcsQueryByIntranetIpResponse.Data.Region.Attributes;
import com.aliyuncs.v5.ecs.model.v20160314.InnerEcsQueryByIntranetIpResponse.Data.Zone;
import com.aliyuncs.v5.ecs.model.v20160314.InnerEcsQueryByIntranetIpResponse.ErrorCode;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class InnerEcsQueryByIntranetIpResponseUnmarshaller {

	public static InnerEcsQueryByIntranetIpResponse unmarshall(InnerEcsQueryByIntranetIpResponse innerEcsQueryByIntranetIpResponse, UnmarshallerContext _ctx) {
		
		innerEcsQueryByIntranetIpResponse.setRequestId(_ctx.stringValue("InnerEcsQueryByIntranetIpResponse.RequestId"));

		ErrorCode errorCode = new ErrorCode();
		errorCode.setCode(_ctx.stringValue("InnerEcsQueryByIntranetIpResponse.errorCode.code"));
		errorCode.setMessage(_ctx.stringValue("InnerEcsQueryByIntranetIpResponse.errorCode.message"));
		errorCode.setIsSuccess(_ctx.booleanValue("InnerEcsQueryByIntranetIpResponse.errorCode.isSuccess"));
		innerEcsQueryByIntranetIpResponse.setErrorCode(errorCode);

		Data data = new Data();
		data.setRecoverable(_ctx.booleanValue("InnerEcsQueryByIntranetIpResponse.data.recoverable"));
		data.setEipInstanceId(_ctx.stringValue("InnerEcsQueryByIntranetIpResponse.data.eipInstanceId"));
		data.setIsWin(_ctx.booleanValue("InnerEcsQueryByIntranetIpResponse.data.isWin"));
		data.setGmtRelease(_ctx.stringValue("InnerEcsQueryByIntranetIpResponse.data.gmtRelease"));
		data.setSerialNumber(_ctx.stringValue("InnerEcsQueryByIntranetIpResponse.data.serialNumber"));
		data.setInstanceTypeGeneration(_ctx.stringValue("InnerEcsQueryByIntranetIpResponse.data.instanceTypeGeneration"));
		data.setIntranetRx(_ctx.integerValue("InnerEcsQueryByIntranetIpResponse.data.intranetRx"));
		data.setImageProductCode(_ctx.stringValue("InnerEcsQueryByIntranetIpResponse.data.imageProductCode"));
		data.setEcsBusinessStatus(_ctx.stringValue("InnerEcsQueryByIntranetIpResponse.data.ecsBusinessStatus"));
		data.setDescription(_ctx.stringValue("InnerEcsQueryByIntranetIpResponse.data.description"));
		data.setInternetIp(_ctx.stringValue("InnerEcsQueryByIntranetIpResponse.data.internetIp"));
		data.setImageNo(_ctx.stringValue("InnerEcsQueryByIntranetIpResponse.data.imageNo"));
		data.setInternetRx(_ctx.integerValue("InnerEcsQueryByIntranetIpResponse.data.internetRx"));
		data.setStatus(_ctx.stringValue("InnerEcsQueryByIntranetIpResponse.data.status"));
		data.setImageName(_ctx.stringValue("InnerEcsQueryByIntranetIpResponse.data.imageName"));
		data.setOsType(_ctx.stringValue("InnerEcsQueryByIntranetIpResponse.data.osType"));
		data.setHostname(_ctx.stringValue("InnerEcsQueryByIntranetIpResponse.data.hostname"));
		data.setEipBandwidth(_ctx.integerValue("InnerEcsQueryByIntranetIpResponse.data.eipBandwidth"));
		data.setNetWorkType(_ctx.stringValue("InnerEcsQueryByIntranetIpResponse.data.netWorkType"));
		data.setNatIp(_ctx.stringValue("InnerEcsQueryByIntranetIpResponse.data.natIp"));
		data.setInstanceType(_ctx.stringValue("InnerEcsQueryByIntranetIpResponse.data.instanceType"));
		data.setRecoverPolicy(_ctx.stringValue("InnerEcsQueryByIntranetIpResponse.data.recoverPolicy"));
		data.setIoOptimized(_ctx.booleanValue("InnerEcsQueryByIntranetIpResponse.data.ioOptimized"));
		data.setOsName(_ctx.stringValue("InnerEcsQueryByIntranetIpResponse.data.osName"));
		data.setIntranetIp(_ctx.stringValue("InnerEcsQueryByIntranetIpResponse.data.intranetIp"));
		data.setEip(_ctx.stringValue("InnerEcsQueryByIntranetIpResponse.data.eip"));
		data.setGmtModified(_ctx.stringValue("InnerEcsQueryByIntranetIpResponse.data.gmtModified"));
		data.setIopsSize(_ctx.integerValue("InnerEcsQueryByIntranetIpResponse.data.iopsSize"));
		data.setSystemDiskCategory(_ctx.stringValue("InnerEcsQueryByIntranetIpResponse.data.systemDiskCategory"));
		data.setIntranetTx(_ctx.integerValue("InnerEcsQueryByIntranetIpResponse.data.intranetTx"));
		data.setGmtStarted(_ctx.stringValue("InnerEcsQueryByIntranetIpResponse.data.gmtStarted"));
		data.setGmtSync(_ctx.stringValue("InnerEcsQueryByIntranetIpResponse.data.gmtSync"));
		data.setCores(_ctx.integerValue("InnerEcsQueryByIntranetIpResponse.data.cores"));
		data.setAliUid(_ctx.longValue("InnerEcsQueryByIntranetIpResponse.data.aliUid"));
		data.setImageId(_ctx.longValue("InnerEcsQueryByIntranetIpResponse.data.imageId"));
		data.setGmtCreated(_ctx.stringValue("InnerEcsQueryByIntranetIpResponse.data.gmtCreated"));
		data.setGroupNo(_ctx.stringValue("InnerEcsQueryByIntranetIpResponse.data.groupNo"));
		data.setVpcInstanceId(_ctx.stringValue("InnerEcsQueryByIntranetIpResponse.data.vpcInstanceId"));
		data.setBid(_ctx.stringValue("InnerEcsQueryByIntranetIpResponse.data.bid"));
		data.setAgentId(_ctx.integerValue("InnerEcsQueryByIntranetIpResponse.data.agentId"));
		data.setRealHostname(_ctx.stringValue("InnerEcsQueryByIntranetIpResponse.data.realHostname"));
		data.setInstanceId(_ctx.stringValue("InnerEcsQueryByIntranetIpResponse.data.instanceId"));
		data.setInstanceTypeFamily(_ctx.stringValue("InnerEcsQueryByIntranetIpResponse.data.instanceTypeFamily"));
		data.setNetworkValidation(_ctx.booleanValue("InnerEcsQueryByIntranetIpResponse.data.networkValidation"));
		data.setZoneId(_ctx.longValue("InnerEcsQueryByIntranetIpResponse.data.zoneId"));
		data.setMemory(_ctx.integerValue("InnerEcsQueryByIntranetIpResponse.data.memory"));
		data.setInternetTx(_ctx.integerValue("InnerEcsQueryByIntranetIpResponse.data.internetTx"));
		data.setVswitchInstanceId(_ctx.stringValue("InnerEcsQueryByIntranetIpResponse.data.vswitchInstanceId"));
		data.setImageType(_ctx.stringValue("InnerEcsQueryByIntranetIpResponse.data.imageType"));
		data.setIzId(_ctx.longValue("InnerEcsQueryByIntranetIpResponse.data.izId"));
		data.setDiskSize(_ctx.integerValue("InnerEcsQueryByIntranetIpResponse.data.diskSize"));

		Region region = new Region();
		region.setId(_ctx.longValue("InnerEcsQueryByIntranetIpResponse.data.region.id"));
		region.setIsActive(_ctx.stringValue("InnerEcsQueryByIntranetIpResponse.data.region.isActive"));
		region.setRegionEnName(_ctx.stringValue("InnerEcsQueryByIntranetIpResponse.data.region.regionEnName"));
		region.setRegionNoAlias(_ctx.stringValue("InnerEcsQueryByIntranetIpResponse.data.region.regionNoAlias"));
		region.setRegionName(_ctx.stringValue("InnerEcsQueryByIntranetIpResponse.data.region.regionName"));
		region.setRegionMemo(_ctx.stringValue("InnerEcsQueryByIntranetIpResponse.data.region.regionMemo"));
		region.setRegionNo(_ctx.stringValue("InnerEcsQueryByIntranetIpResponse.data.region.regionNo"));

		Attributes attributes = new Attributes();
		attributes.setSupport_image_copy(_ctx.stringValue("InnerEcsQueryByIntranetIpResponse.data.region.attributes.support_image_copy"));
		attributes.setInternal_use(_ctx.stringValue("InnerEcsQueryByIntranetIpResponse.data.region.attributes.internal_use"));
		attributes.setAk_name(_ctx.stringValue("InnerEcsQueryByIntranetIpResponse.data.region.attributes.ak_name"));
		region.setAttributes(attributes);
		data.setRegion(region);

		Iz iz = new Iz();
		iz.setRegionNo(_ctx.stringValue("InnerEcsQueryByIntranetIpResponse.data.iz.regionNo"));
		iz.setStatus(_ctx.stringValue("InnerEcsQueryByIntranetIpResponse.data.iz.status"));
		iz.setNo(_ctx.stringValue("InnerEcsQueryByIntranetIpResponse.data.iz.no"));
		iz.setEnName(_ctx.stringValue("InnerEcsQueryByIntranetIpResponse.data.iz.enName"));
		iz.setCnName(_ctx.stringValue("InnerEcsQueryByIntranetIpResponse.data.iz.cnName"));

		List<String> supportedInstanceGenerations = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("InnerEcsQueryByIntranetIpResponse.data.iz.supportedInstanceGenerations.Length"); i++) {
			supportedInstanceGenerations.add(_ctx.stringValue("InnerEcsQueryByIntranetIpResponse.data.iz.supportedInstanceGenerations["+ i +"]"));
		}
		iz.setSupportedInstanceGenerations(supportedInstanceGenerations);

		List<String> supportedInstanceTypeFamilies = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("InnerEcsQueryByIntranetIpResponse.data.iz.supportedInstanceTypeFamilies.Length"); i++) {
			supportedInstanceTypeFamilies.add(_ctx.stringValue("InnerEcsQueryByIntranetIpResponse.data.iz.supportedInstanceTypeFamilies["+ i +"]"));
		}
		iz.setSupportedInstanceTypeFamilies(supportedInstanceTypeFamilies);

		List<String> supportedInstanceTypeNames = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("InnerEcsQueryByIntranetIpResponse.data.iz.supportedInstanceTypeNames.Length"); i++) {
			supportedInstanceTypeNames.add(_ctx.stringValue("InnerEcsQueryByIntranetIpResponse.data.iz.supportedInstanceTypeNames["+ i +"]"));
		}
		iz.setSupportedInstanceTypeNames(supportedInstanceTypeNames);

		List<IzResourceModelItem> izResourceModel = new ArrayList<IzResourceModelItem>();
		for (int i = 0; i < _ctx.lengthValue("InnerEcsQueryByIntranetIpResponse.data.iz.izResourceModel.Length"); i++) {
			IzResourceModelItem izResourceModelItem = new IzResourceModelItem();
			izResourceModelItem.setSupportIoOptimized(_ctx.booleanValue("InnerEcsQueryByIntranetIpResponse.data.iz.izResourceModel["+ i +"].supportIoOptimized"));

			List<String> allowedResourceCreation = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("InnerEcsQueryByIntranetIpResponse.data.iz.izResourceModel["+ i +"].allowedResourceCreation.Length"); j++) {
				allowedResourceCreation.add(_ctx.stringValue("InnerEcsQueryByIntranetIpResponse.data.iz.izResourceModel["+ i +"].allowedResourceCreation["+ j +"]"));
			}
			izResourceModelItem.setAllowedResourceCreation(allowedResourceCreation);

			List<String> supportedDataDiskCategories = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("InnerEcsQueryByIntranetIpResponse.data.iz.izResourceModel["+ i +"].supportedDataDiskCategories.Length"); j++) {
				supportedDataDiskCategories.add(_ctx.stringValue("InnerEcsQueryByIntranetIpResponse.data.iz.izResourceModel["+ i +"].supportedDataDiskCategories["+ j +"]"));
			}
			izResourceModelItem.setSupportedDataDiskCategories(supportedDataDiskCategories);

			List<String> supportedInstanceGenerations1 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("InnerEcsQueryByIntranetIpResponse.data.iz.izResourceModel["+ i +"].supportedInstanceGenerations.Length"); j++) {
				supportedInstanceGenerations1.add(_ctx.stringValue("InnerEcsQueryByIntranetIpResponse.data.iz.izResourceModel["+ i +"].supportedInstanceGenerations["+ j +"]"));
			}
			izResourceModelItem.setSupportedInstanceGenerations1(supportedInstanceGenerations1);

			List<String> supportedNetworkCategories = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("InnerEcsQueryByIntranetIpResponse.data.iz.izResourceModel["+ i +"].supportedNetworkCategories.Length"); j++) {
				supportedNetworkCategories.add(_ctx.stringValue("InnerEcsQueryByIntranetIpResponse.data.iz.izResourceModel["+ i +"].supportedNetworkCategories["+ j +"]"));
			}
			izResourceModelItem.setSupportedNetworkCategories(supportedNetworkCategories);

			List<String> supportedSystemDiskCategories = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("InnerEcsQueryByIntranetIpResponse.data.iz.izResourceModel["+ i +"].supportedSystemDiskCategories.Length"); j++) {
				supportedSystemDiskCategories.add(_ctx.stringValue("InnerEcsQueryByIntranetIpResponse.data.iz.izResourceModel["+ i +"].supportedSystemDiskCategories["+ j +"]"));
			}
			izResourceModelItem.setSupportedSystemDiskCategories(supportedSystemDiskCategories);

			List<String> supportedInstanceTypeFamilies2 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("InnerEcsQueryByIntranetIpResponse.data.iz.izResourceModel["+ i +"].supportedInstanceTypeFamilies.Length"); j++) {
				supportedInstanceTypeFamilies2.add(_ctx.stringValue("InnerEcsQueryByIntranetIpResponse.data.iz.izResourceModel["+ i +"].supportedInstanceTypeFamilies["+ j +"]"));
			}
			izResourceModelItem.setSupportedInstanceTypeFamilies2(supportedInstanceTypeFamilies2);

			List<String> supportedInstanceTypes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("InnerEcsQueryByIntranetIpResponse.data.iz.izResourceModel["+ i +"].supportedInstanceTypes.Length"); j++) {
				supportedInstanceTypes.add(_ctx.stringValue("InnerEcsQueryByIntranetIpResponse.data.iz.izResourceModel["+ i +"].supportedInstanceTypes["+ j +"]"));
			}
			izResourceModelItem.setSupportedInstanceTypes(supportedInstanceTypes);

			izResourceModel.add(izResourceModelItem);
		}
		iz.setIzResourceModel(izResourceModel);
		data.setIz(iz);

		Zone zone = new Zone();
		zone.setZoneMemo(_ctx.stringValue("InnerEcsQueryByIntranetIpResponse.data.zone.zoneMemo"));
		zone.setIsWritable(_ctx.booleanValue("InnerEcsQueryByIntranetIpResponse.data.zone.isWritable"));
		zone.setZoneName(_ctx.stringValue("InnerEcsQueryByIntranetIpResponse.data.zone.zoneName"));
		zone.setZoneNoAlias(_ctx.stringValue("InnerEcsQueryByIntranetIpResponse.data.zone.zoneNoAlias"));
		zone.setIsActive(_ctx.stringValue("InnerEcsQueryByIntranetIpResponse.data.zone.isActive"));
		zone.setId(_ctx.longValue("InnerEcsQueryByIntranetIpResponse.data.zone.id"));
		zone.setZoneEnName(_ctx.stringValue("InnerEcsQueryByIntranetIpResponse.data.zone.zoneEnName"));
		zone.setZoneNo(_ctx.stringValue("InnerEcsQueryByIntranetIpResponse.data.zone.zoneNo"));
		zone.setRouteIpSegment(_ctx.stringValue("InnerEcsQueryByIntranetIpResponse.data.zone.routeIpSegment"));
		zone.setRegionId(_ctx.longValue("InnerEcsQueryByIntranetIpResponse.data.zone.regionId"));

		List<String> supportedDeviceCategories = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("InnerEcsQueryByIntranetIpResponse.data.zone.supportedDeviceCategories.Length"); i++) {
			supportedDeviceCategories.add(_ctx.stringValue("InnerEcsQueryByIntranetIpResponse.data.zone.supportedDeviceCategories["+ i +"]"));
		}
		zone.setSupportedDeviceCategories(supportedDeviceCategories);
		data.setZone(zone);
		innerEcsQueryByIntranetIpResponse.setData(data);
	 
	 	return innerEcsQueryByIntranetIpResponse;
	}
}