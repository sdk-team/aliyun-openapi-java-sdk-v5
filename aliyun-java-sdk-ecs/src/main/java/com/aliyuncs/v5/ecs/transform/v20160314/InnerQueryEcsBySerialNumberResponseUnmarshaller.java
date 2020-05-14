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

import com.aliyuncs.v5.ecs.model.v20160314.InnerQueryEcsBySerialNumberResponse;
import com.aliyuncs.v5.ecs.model.v20160314.InnerQueryEcsBySerialNumberResponse.EcsInstance;
import com.aliyuncs.v5.ecs.model.v20160314.InnerQueryEcsBySerialNumberResponse.EcsInstance.Iz;
import com.aliyuncs.v5.ecs.model.v20160314.InnerQueryEcsBySerialNumberResponse.EcsInstance.Iz.IzResourceMode;
import com.aliyuncs.v5.ecs.model.v20160314.InnerQueryEcsBySerialNumberResponse.EcsInstance.Region;
import com.aliyuncs.v5.ecs.model.v20160314.InnerQueryEcsBySerialNumberResponse.EcsInstance.Region.Attributes;
import com.aliyuncs.v5.ecs.model.v20160314.InnerQueryEcsBySerialNumberResponse.EcsInstance.Zone;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class InnerQueryEcsBySerialNumberResponseUnmarshaller {

	public static InnerQueryEcsBySerialNumberResponse unmarshall(InnerQueryEcsBySerialNumberResponse innerQueryEcsBySerialNumberResponse, UnmarshallerContext _ctx) {
		
		innerQueryEcsBySerialNumberResponse.setRequestId(_ctx.stringValue("InnerQueryEcsBySerialNumberResponse.RequestId"));

		EcsInstance ecsInstance = new EcsInstance();
		ecsInstance.setRecoverable(_ctx.booleanValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.Recoverable"));
		ecsInstance.setEipInstanceId(_ctx.stringValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.EipInstanceId"));
		ecsInstance.setIsWin(_ctx.booleanValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.IsWin"));
		ecsInstance.setGmtRelease(_ctx.stringValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.GmtRelease"));
		ecsInstance.setSerialNumber(_ctx.stringValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.SerialNumber"));
		ecsInstance.setInstanceTypeGeneration(_ctx.stringValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.InstanceTypeGeneration"));
		ecsInstance.setIntranetRx(_ctx.integerValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.IntranetRx"));
		ecsInstance.setImageProductCode(_ctx.stringValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.ImageProductCode"));
		ecsInstance.setEcsBusinessStatus(_ctx.stringValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.EcsBusinessStatus"));
		ecsInstance.setDescription(_ctx.stringValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.Description"));
		ecsInstance.setInternetIp(_ctx.stringValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.InternetIp"));
		ecsInstance.setImageNo(_ctx.stringValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.ImageNo"));
		ecsInstance.setInternetRx(_ctx.integerValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.InternetRx"));
		ecsInstance.setStatus(_ctx.stringValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.Status"));
		ecsInstance.setImageName(_ctx.stringValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.ImageName"));
		ecsInstance.setOsType(_ctx.stringValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.OsType"));
		ecsInstance.setHostname(_ctx.stringValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.Hostname"));
		ecsInstance.setEipBandwidth(_ctx.integerValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.EipBandwidth"));
		ecsInstance.setNetWorkType(_ctx.stringValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.NetWorkType"));
		ecsInstance.setNatIp(_ctx.stringValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.NatIp"));
		ecsInstance.setInstanceType(_ctx.stringValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.InstanceType"));
		ecsInstance.setRecoverPolicy(_ctx.stringValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.RecoverPolicy"));
		ecsInstance.setIoOptimized(_ctx.booleanValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.IoOptimized"));
		ecsInstance.setOsName(_ctx.stringValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.OsName"));
		ecsInstance.setIntranetIp(_ctx.stringValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.IntranetIp"));
		ecsInstance.setEip(_ctx.stringValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.Eip"));
		ecsInstance.setGmtModified(_ctx.stringValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.GmtModified"));
		ecsInstance.setIopsSize(_ctx.integerValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.IopsSize"));
		ecsInstance.setSystemDiskCategory(_ctx.stringValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.SystemDiskCategory"));
		ecsInstance.setIntranetTx(_ctx.integerValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.IntranetTx"));
		ecsInstance.setGmtStarted(_ctx.stringValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.GmtStarted"));
		ecsInstance.setGmtSync(_ctx.stringValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.GmtSync"));
		ecsInstance.setCores(_ctx.integerValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.Cores"));
		ecsInstance.setAliUid(_ctx.longValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.AliUid"));
		ecsInstance.setImageId(_ctx.longValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.ImageId"));
		ecsInstance.setGmtCreated(_ctx.stringValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.GmtCreated"));
		ecsInstance.setGroupNo(_ctx.stringValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.GroupNo"));
		ecsInstance.setVpcInstanceId(_ctx.stringValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.VpcInstanceId"));
		ecsInstance.setBid(_ctx.stringValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.Bid"));
		ecsInstance.setAgentId(_ctx.integerValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.AgentId"));
		ecsInstance.setRealHostname(_ctx.stringValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.RealHostname"));
		ecsInstance.setInstanceId(_ctx.stringValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.InstanceId"));
		ecsInstance.setInstanceTypeFamily(_ctx.stringValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.InstanceTypeFamily"));
		ecsInstance.setNetworkValidation(_ctx.booleanValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.NetworkValidation"));
		ecsInstance.setZoneId(_ctx.longValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.ZoneId"));
		ecsInstance.setMemory(_ctx.integerValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.Memory"));
		ecsInstance.setInternetTx(_ctx.integerValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.InternetTx"));
		ecsInstance.setVswitchInstanceId(_ctx.stringValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.VswitchInstanceId"));
		ecsInstance.setImageType(_ctx.stringValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.ImageType"));
		ecsInstance.setIzId(_ctx.longValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.IzId"));
		ecsInstance.setDiskSize(_ctx.integerValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.DiskSize"));

		Region region = new Region();
		region.setId(_ctx.longValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.Region.Id"));
		region.setIsActive(_ctx.stringValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.Region.IsActive"));
		region.setRegionEnName(_ctx.stringValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.Region.RegionEnName"));
		region.setRegionNoAlias(_ctx.stringValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.Region.RegionNoAlias"));
		region.setRegionName(_ctx.stringValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.Region.RegionName"));
		region.setRegionMemo(_ctx.stringValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.Region.RegionMemo"));
		region.setRegionNo(_ctx.stringValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.Region.RegionNo"));

		Attributes attributes = new Attributes();
		attributes.setSupportImageCopy(_ctx.stringValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.Region.Attributes.SupportImageCopy"));
		attributes.setInternalUse(_ctx.stringValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.Region.Attributes.InternalUse"));
		attributes.setAkName(_ctx.stringValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.Region.Attributes.AkName"));
		region.setAttributes(attributes);
		ecsInstance.setRegion(region);

		Iz iz = new Iz();
		iz.setRegionNo(_ctx.stringValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.Iz.RegionNo"));
		iz.setStatus(_ctx.stringValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.Iz.Status"));
		iz.setNo(_ctx.stringValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.Iz.No"));
		iz.setEnName(_ctx.stringValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.Iz.EnName"));
		iz.setCnName(_ctx.stringValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.Iz.CnName"));

		List<String> supportedInstanceGenerations = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.Iz.SupportedInstanceGenerations.Length"); i++) {
			supportedInstanceGenerations.add(_ctx.stringValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.Iz.SupportedInstanceGenerations["+ i +"]"));
		}
		iz.setSupportedInstanceGenerations(supportedInstanceGenerations);

		List<String> supportedInstanceTypeFamilies = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.Iz.SupportedInstanceTypeFamilies.Length"); i++) {
			supportedInstanceTypeFamilies.add(_ctx.stringValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.Iz.SupportedInstanceTypeFamilies["+ i +"]"));
		}
		iz.setSupportedInstanceTypeFamilies(supportedInstanceTypeFamilies);

		List<String> supportedInstanceTypeNames = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.Iz.SupportedInstanceTypeNames.Length"); i++) {
			supportedInstanceTypeNames.add(_ctx.stringValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.Iz.SupportedInstanceTypeNames["+ i +"]"));
		}
		iz.setSupportedInstanceTypeNames(supportedInstanceTypeNames);

		List<IzResourceMode> izResourceModel = new ArrayList<IzResourceMode>();
		for (int i = 0; i < _ctx.lengthValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.Iz.IzResourceModel.Length"); i++) {
			IzResourceMode izResourceMode = new IzResourceMode();
			izResourceMode.setSupportIoOptimized(_ctx.booleanValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.Iz.IzResourceModel["+ i +"].SupportIoOptimized"));

			List<String> allowedResourceCreation = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.Iz.IzResourceModel["+ i +"].AllowedResourceCreation.Length"); j++) {
				allowedResourceCreation.add(_ctx.stringValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.Iz.IzResourceModel["+ i +"].AllowedResourceCreation["+ j +"]"));
			}
			izResourceMode.setAllowedResourceCreation(allowedResourceCreation);

			List<String> supportedDataDiskCategories = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.Iz.IzResourceModel["+ i +"].SupportedDataDiskCategories.Length"); j++) {
				supportedDataDiskCategories.add(_ctx.stringValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.Iz.IzResourceModel["+ i +"].SupportedDataDiskCategories["+ j +"]"));
			}
			izResourceMode.setSupportedDataDiskCategories(supportedDataDiskCategories);

			List<String> supportedInstanceGenerations1 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.Iz.IzResourceModel["+ i +"].SupportedInstanceGenerations.Length"); j++) {
				supportedInstanceGenerations1.add(_ctx.stringValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.Iz.IzResourceModel["+ i +"].SupportedInstanceGenerations["+ j +"]"));
			}
			izResourceMode.setSupportedInstanceGenerations1(supportedInstanceGenerations1);

			List<String> supportedNetworkCategories = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.Iz.IzResourceModel["+ i +"].SupportedNetworkCategories.Length"); j++) {
				supportedNetworkCategories.add(_ctx.stringValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.Iz.IzResourceModel["+ i +"].SupportedNetworkCategories["+ j +"]"));
			}
			izResourceMode.setSupportedNetworkCategories(supportedNetworkCategories);

			List<String> supportedSystemDiskCategories = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.Iz.IzResourceModel["+ i +"].SupportedSystemDiskCategories.Length"); j++) {
				supportedSystemDiskCategories.add(_ctx.stringValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.Iz.IzResourceModel["+ i +"].SupportedSystemDiskCategories["+ j +"]"));
			}
			izResourceMode.setSupportedSystemDiskCategories(supportedSystemDiskCategories);

			List<String> supportedInstanceTypeFamilies2 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.Iz.IzResourceModel["+ i +"].SupportedInstanceTypeFamilies.Length"); j++) {
				supportedInstanceTypeFamilies2.add(_ctx.stringValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.Iz.IzResourceModel["+ i +"].SupportedInstanceTypeFamilies["+ j +"]"));
			}
			izResourceMode.setSupportedInstanceTypeFamilies2(supportedInstanceTypeFamilies2);

			List<String> supportedInstanceTypes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.Iz.IzResourceModel["+ i +"].SupportedInstanceTypes.Length"); j++) {
				supportedInstanceTypes.add(_ctx.stringValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.Iz.IzResourceModel["+ i +"].SupportedInstanceTypes["+ j +"]"));
			}
			izResourceMode.setSupportedInstanceTypes(supportedInstanceTypes);

			izResourceModel.add(izResourceMode);
		}
		iz.setIzResourceModel(izResourceModel);
		ecsInstance.setIz(iz);

		Zone zone = new Zone();
		zone.setZoneMemo(_ctx.stringValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.Zone.ZoneMemo"));
		zone.setIsWritable(_ctx.booleanValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.Zone.IsWritable"));
		zone.setZoneName(_ctx.stringValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.Zone.ZoneName"));
		zone.setZoneNoAlias(_ctx.stringValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.Zone.ZoneNoAlias"));
		zone.setIsActive(_ctx.stringValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.Zone.IsActive"));
		zone.setId(_ctx.longValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.Zone.Id"));
		zone.setZoneEnName(_ctx.stringValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.Zone.ZoneEnName"));
		zone.setZoneNo(_ctx.stringValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.Zone.ZoneNo"));
		zone.setRouteIpSegment(_ctx.stringValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.Zone.RouteIpSegment"));
		zone.setRegionId(_ctx.longValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.Zone.RegionId"));

		List<String> supportedDeviceCategories = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.Zone.SupportedDeviceCategories.Length"); i++) {
			supportedDeviceCategories.add(_ctx.stringValue("InnerQueryEcsBySerialNumberResponse.EcsInstance.Zone.SupportedDeviceCategories["+ i +"]"));
		}
		zone.setSupportedDeviceCategories(supportedDeviceCategories);
		ecsInstance.setZone(zone);
		innerQueryEcsBySerialNumberResponse.setEcsInstance(ecsInstance);
	 
	 	return innerQueryEcsBySerialNumberResponse;
	}
}