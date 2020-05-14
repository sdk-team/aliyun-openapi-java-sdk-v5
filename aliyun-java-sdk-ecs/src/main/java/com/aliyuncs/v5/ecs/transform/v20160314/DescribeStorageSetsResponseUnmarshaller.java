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

import com.aliyuncs.v5.ecs.model.v20160314.DescribeStorageSetsResponse;
import com.aliyuncs.v5.ecs.model.v20160314.DescribeStorageSetsResponse.StorageSet;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class DescribeStorageSetsResponseUnmarshaller {

	public static DescribeStorageSetsResponse unmarshall(DescribeStorageSetsResponse describeStorageSetsResponse, UnmarshallerContext _ctx) {
		
		describeStorageSetsResponse.setRequestId(_ctx.stringValue("DescribeStorageSetsResponse.RequestId"));
		describeStorageSetsResponse.setTotalCount(_ctx.integerValue("DescribeStorageSetsResponse.TotalCount"));
		describeStorageSetsResponse.setPageNumber(_ctx.integerValue("DescribeStorageSetsResponse.PageNumber"));
		describeStorageSetsResponse.setPageSize(_ctx.integerValue("DescribeStorageSetsResponse.PageSize"));

		List<StorageSet> storageSets = new ArrayList<StorageSet>();
		for (int i = 0; i < _ctx.lengthValue("DescribeStorageSetsResponse.StorageSets.Length"); i++) {
			StorageSet storageSet = new StorageSet();
			storageSet.setStorageSetId(_ctx.stringValue("DescribeStorageSetsResponse.StorageSets["+ i +"].StorageSetId"));
			storageSet.setCreationTime(_ctx.stringValue("DescribeStorageSetsResponse.StorageSets["+ i +"].CreationTime"));
			storageSet.setStorageSetName(_ctx.stringValue("DescribeStorageSetsResponse.StorageSets["+ i +"].StorageSetName"));
			storageSet.setDescription(_ctx.stringValue("DescribeStorageSetsResponse.StorageSets["+ i +"].Description"));
			storageSet.setMaxPartitionNumber(_ctx.integerValue("DescribeStorageSetsResponse.StorageSets["+ i +"].MaxPartitionNumber"));
			storageSet.setRegionId(_ctx.stringValue("DescribeStorageSetsResponse.StorageSets["+ i +"].RegionId"));
			storageSet.setZoneId(_ctx.stringValue("DescribeStorageSetsResponse.StorageSets["+ i +"].ZoneId"));

			storageSets.add(storageSet);
		}
		describeStorageSetsResponse.setStorageSets(storageSets);
	 
	 	return describeStorageSetsResponse;
	}
}