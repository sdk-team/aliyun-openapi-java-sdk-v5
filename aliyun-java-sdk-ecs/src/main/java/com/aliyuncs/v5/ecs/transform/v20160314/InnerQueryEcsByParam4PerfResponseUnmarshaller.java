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

import com.aliyuncs.v5.ecs.model.v20160314.InnerQueryEcsByParam4PerfResponse;
import com.aliyuncs.v5.ecs.model.v20160314.InnerQueryEcsByParam4PerfResponse.EcsInstance;
import com.aliyuncs.v5.ecs.model.v20160314.InnerQueryEcsByParam4PerfResponse.EcsInstance.Iz;
import com.aliyuncs.v5.ecs.model.v20160314.InnerQueryEcsByParam4PerfResponse.EcsInstance.Iz.IzResourceMode;
import com.aliyuncs.v5.ecs.model.v20160314.InnerQueryEcsByParam4PerfResponse.EcsInstance.Region;
import com.aliyuncs.v5.ecs.model.v20160314.InnerQueryEcsByParam4PerfResponse.EcsInstance.Region.Attributes;
import com.aliyuncs.v5.ecs.model.v20160314.InnerQueryEcsByParam4PerfResponse.EcsInstance.Zone;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class InnerQueryEcsByParam4PerfResponseUnmarshaller {

	public static InnerQueryEcsByParam4PerfResponse unmarshall(InnerQueryEcsByParam4PerfResponse innerQueryEcsByParam4PerfResponse, UnmarshallerContext _ctx) {
		
		innerQueryEcsByParam4PerfResponse.setRequestId(_ctx.stringValue("InnerQueryEcsByParam4PerfResponse.RequestId"));
		innerQueryEcsByParam4PerfResponse.setPageNumber(_ctx.integerValue("InnerQueryEcsByParam4PerfResponse.PageNumber"));
		innerQueryEcsByParam4PerfResponse.setPageSize(_ctx.integerValue("InnerQueryEcsByParam4PerfResponse.PageSize"));

		List<EcsInstance> ecsInstances = new ArrayList<EcsInstance>();
		for (int i = 0; i < _ctx.lengthValue("InnerQueryEcsByParam4PerfResponse.EcsInstances.Length"); i++) {
			EcsInstance ecsInstance = new EcsInstance();
			ecsInstance.setRecoverable(_ctx.booleanValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].Recoverable"));
			ecsInstance.setEipInstanceId(_ctx.stringValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].EipInstanceId"));
			ecsInstance.setIsWin(_ctx.booleanValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].IsWin"));
			ecsInstance.setGmtRelease(_ctx.stringValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].GmtRelease"));
			ecsInstance.setSerialNumber(_ctx.stringValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].SerialNumber"));
			ecsInstance.setInstanceTypeGeneration(_ctx.stringValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].InstanceTypeGeneration"));
			ecsInstance.setIntranetRx(_ctx.integerValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].IntranetRx"));
			ecsInstance.setImageProductCode(_ctx.stringValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].ImageProductCode"));
			ecsInstance.setEcsBusinessStatus(_ctx.stringValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].EcsBusinessStatus"));
			ecsInstance.setDescription(_ctx.stringValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].Description"));
			ecsInstance.setInternetIp(_ctx.stringValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].InternetIp"));
			ecsInstance.setImageNo(_ctx.stringValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].ImageNo"));
			ecsInstance.setInternetRx(_ctx.integerValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].InternetRx"));
			ecsInstance.setStatus(_ctx.stringValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].Status"));
			ecsInstance.setImageName(_ctx.stringValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].ImageName"));
			ecsInstance.setOsType(_ctx.stringValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].OsType"));
			ecsInstance.setHostname(_ctx.stringValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].Hostname"));
			ecsInstance.setEipBandwidth(_ctx.integerValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].EipBandwidth"));
			ecsInstance.setNetWorkType(_ctx.stringValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].NetWorkType"));
			ecsInstance.setNatIp(_ctx.stringValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].NatIp"));
			ecsInstance.setInstanceType(_ctx.stringValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].InstanceType"));
			ecsInstance.setRecoverPolicy(_ctx.stringValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].RecoverPolicy"));
			ecsInstance.setIoOptimized(_ctx.booleanValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].IoOptimized"));
			ecsInstance.setOsName(_ctx.stringValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].OsName"));
			ecsInstance.setIntranetIp(_ctx.stringValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].IntranetIp"));
			ecsInstance.setEip(_ctx.stringValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].Eip"));
			ecsInstance.setGmtModified(_ctx.stringValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].GmtModified"));
			ecsInstance.setIopsSize(_ctx.integerValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].IopsSize"));
			ecsInstance.setSystemDiskCategory(_ctx.stringValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].SystemDiskCategory"));
			ecsInstance.setIntranetTx(_ctx.integerValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].IntranetTx"));
			ecsInstance.setGmtStarted(_ctx.stringValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].GmtStarted"));
			ecsInstance.setGmtSync(_ctx.stringValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].GmtSync"));
			ecsInstance.setCores(_ctx.integerValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].Cores"));
			ecsInstance.setAliUid(_ctx.longValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].AliUid"));
			ecsInstance.setImageId(_ctx.longValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].ImageId"));
			ecsInstance.setGmtCreated(_ctx.stringValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].GmtCreated"));
			ecsInstance.setGroupNo(_ctx.stringValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].GroupNo"));
			ecsInstance.setVpcInstanceId(_ctx.stringValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].VpcInstanceId"));
			ecsInstance.setBid(_ctx.stringValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].Bid"));
			ecsInstance.setAgentId(_ctx.integerValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].AgentId"));
			ecsInstance.setRealHostname(_ctx.stringValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].RealHostname"));
			ecsInstance.setInstanceId(_ctx.stringValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].InstanceId"));
			ecsInstance.setInstanceTypeFamily(_ctx.stringValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].InstanceTypeFamily"));
			ecsInstance.setNetworkValidation(_ctx.booleanValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].NetworkValidation"));
			ecsInstance.setZoneId(_ctx.longValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].ZoneId"));
			ecsInstance.setMemory(_ctx.integerValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].Memory"));
			ecsInstance.setInternetTx(_ctx.integerValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].InternetTx"));
			ecsInstance.setVswitchInstanceId(_ctx.stringValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].VswitchInstanceId"));
			ecsInstance.setImageType(_ctx.stringValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].ImageType"));
			ecsInstance.setIzId(_ctx.longValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].IzId"));
			ecsInstance.setDiskSize(_ctx.integerValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].DiskSize"));

			Region region = new Region();
			region.setId(_ctx.longValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].Region.Id"));
			region.setIsActive(_ctx.stringValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].Region.IsActive"));
			region.setRegionEnName(_ctx.stringValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].Region.RegionEnName"));
			region.setRegionNoAlias(_ctx.stringValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].Region.RegionNoAlias"));
			region.setRegionName(_ctx.stringValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].Region.RegionName"));
			region.setRegionMemo(_ctx.stringValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].Region.RegionMemo"));
			region.setRegionNo(_ctx.stringValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].Region.RegionNo"));

			Attributes attributes = new Attributes();
			attributes.setSupportImageCopy(_ctx.stringValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].Region.Attributes.SupportImageCopy"));
			attributes.setInternalUse(_ctx.stringValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].Region.Attributes.InternalUse"));
			attributes.setAkName(_ctx.stringValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].Region.Attributes.AkName"));
			region.setAttributes(attributes);
			ecsInstance.setRegion(region);

			Iz iz = new Iz();
			iz.setRegionNo(_ctx.stringValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].Iz.RegionNo"));
			iz.setStatus(_ctx.stringValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].Iz.Status"));
			iz.setNo(_ctx.stringValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].Iz.No"));
			iz.setEnName(_ctx.stringValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].Iz.EnName"));
			iz.setCnName(_ctx.stringValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].Iz.CnName"));

			List<String> supportedInstanceGenerations = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].Iz.SupportedInstanceGenerations.Length"); j++) {
				supportedInstanceGenerations.add(_ctx.stringValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].Iz.SupportedInstanceGenerations["+ j +"]"));
			}
			iz.setSupportedInstanceGenerations(supportedInstanceGenerations);

			List<String> supportedInstanceTypeFamilies = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].Iz.SupportedInstanceTypeFamilies.Length"); j++) {
				supportedInstanceTypeFamilies.add(_ctx.stringValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].Iz.SupportedInstanceTypeFamilies["+ j +"]"));
			}
			iz.setSupportedInstanceTypeFamilies(supportedInstanceTypeFamilies);

			List<String> supportedInstanceTypeNames = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].Iz.SupportedInstanceTypeNames.Length"); j++) {
				supportedInstanceTypeNames.add(_ctx.stringValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].Iz.SupportedInstanceTypeNames["+ j +"]"));
			}
			iz.setSupportedInstanceTypeNames(supportedInstanceTypeNames);

			List<IzResourceMode> izResourceModel = new ArrayList<IzResourceMode>();
			for (int j = 0; j < _ctx.lengthValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].Iz.IzResourceModel.Length"); j++) {
				IzResourceMode izResourceMode = new IzResourceMode();
				izResourceMode.setSupportIoOptimized(_ctx.booleanValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].Iz.IzResourceModel["+ j +"].SupportIoOptimized"));

				List<String> allowedResourceCreation = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].Iz.IzResourceModel["+ j +"].AllowedResourceCreation.Length"); k++) {
					allowedResourceCreation.add(_ctx.stringValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].Iz.IzResourceModel["+ j +"].AllowedResourceCreation["+ k +"]"));
				}
				izResourceMode.setAllowedResourceCreation(allowedResourceCreation);

				List<String> supportedDataDiskCategories = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].Iz.IzResourceModel["+ j +"].SupportedDataDiskCategories.Length"); k++) {
					supportedDataDiskCategories.add(_ctx.stringValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].Iz.IzResourceModel["+ j +"].SupportedDataDiskCategories["+ k +"]"));
				}
				izResourceMode.setSupportedDataDiskCategories(supportedDataDiskCategories);

				List<String> supportedInstanceGenerations1 = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].Iz.IzResourceModel["+ j +"].SupportedInstanceGenerations.Length"); k++) {
					supportedInstanceGenerations1.add(_ctx.stringValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].Iz.IzResourceModel["+ j +"].SupportedInstanceGenerations["+ k +"]"));
				}
				izResourceMode.setSupportedInstanceGenerations1(supportedInstanceGenerations1);

				List<String> supportedNetworkCategories = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].Iz.IzResourceModel["+ j +"].SupportedNetworkCategories.Length"); k++) {
					supportedNetworkCategories.add(_ctx.stringValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].Iz.IzResourceModel["+ j +"].SupportedNetworkCategories["+ k +"]"));
				}
				izResourceMode.setSupportedNetworkCategories(supportedNetworkCategories);

				List<String> supportedSystemDiskCategories = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].Iz.IzResourceModel["+ j +"].SupportedSystemDiskCategories.Length"); k++) {
					supportedSystemDiskCategories.add(_ctx.stringValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].Iz.IzResourceModel["+ j +"].SupportedSystemDiskCategories["+ k +"]"));
				}
				izResourceMode.setSupportedSystemDiskCategories(supportedSystemDiskCategories);

				List<String> supportedInstanceTypeFamilies2 = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].Iz.IzResourceModel["+ j +"].SupportedInstanceTypeFamilies.Length"); k++) {
					supportedInstanceTypeFamilies2.add(_ctx.stringValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].Iz.IzResourceModel["+ j +"].SupportedInstanceTypeFamilies["+ k +"]"));
				}
				izResourceMode.setSupportedInstanceTypeFamilies2(supportedInstanceTypeFamilies2);

				List<String> supportedInstanceTypes = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].Iz.IzResourceModel["+ j +"].SupportedInstanceTypes.Length"); k++) {
					supportedInstanceTypes.add(_ctx.stringValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].Iz.IzResourceModel["+ j +"].SupportedInstanceTypes["+ k +"]"));
				}
				izResourceMode.setSupportedInstanceTypes(supportedInstanceTypes);

				izResourceModel.add(izResourceMode);
			}
			iz.setIzResourceModel(izResourceModel);
			ecsInstance.setIz(iz);

			Zone zone = new Zone();
			zone.setZoneMemo(_ctx.stringValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].Zone.ZoneMemo"));
			zone.setIsWritable(_ctx.booleanValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].Zone.IsWritable"));
			zone.setZoneName(_ctx.stringValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].Zone.ZoneName"));
			zone.setZoneNoAlias(_ctx.stringValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].Zone.ZoneNoAlias"));
			zone.setIsActive(_ctx.stringValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].Zone.IsActive"));
			zone.setId(_ctx.longValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].Zone.Id"));
			zone.setZoneEnName(_ctx.stringValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].Zone.ZoneEnName"));
			zone.setZoneNo(_ctx.stringValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].Zone.ZoneNo"));
			zone.setRouteIpSegment(_ctx.stringValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].Zone.RouteIpSegment"));
			zone.setRegionId(_ctx.longValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].Zone.RegionId"));

			List<String> supportedDeviceCategories = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].Zone.SupportedDeviceCategories.Length"); j++) {
				supportedDeviceCategories.add(_ctx.stringValue("InnerQueryEcsByParam4PerfResponse.EcsInstances["+ i +"].Zone.SupportedDeviceCategories["+ j +"]"));
			}
			zone.setSupportedDeviceCategories(supportedDeviceCategories);
			ecsInstance.setZone(zone);

			ecsInstances.add(ecsInstance);
		}
		innerQueryEcsByParam4PerfResponse.setEcsInstances(ecsInstances);
	 
	 	return innerQueryEcsByParam4PerfResponse;
	}
}