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

import com.aliyuncs.v5.ecs.model.v20160314.InnerEcsRegionQueryAllResponse;
import com.aliyuncs.v5.ecs.model.v20160314.InnerEcsRegionQueryAllResponse.ErrorCode;
import com.aliyuncs.v5.ecs.model.v20160314.InnerEcsRegionQueryAllResponse.Item;
import com.aliyuncs.v5.ecs.model.v20160314.InnerEcsRegionQueryAllResponse.Item.Attributes;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class InnerEcsRegionQueryAllResponseUnmarshaller {

	public static InnerEcsRegionQueryAllResponse unmarshall(InnerEcsRegionQueryAllResponse innerEcsRegionQueryAllResponse, UnmarshallerContext _ctx) {
		
		innerEcsRegionQueryAllResponse.setRequestId(_ctx.stringValue("InnerEcsRegionQueryAllResponse.RequestId"));
		innerEcsRegionQueryAllResponse.setCount(_ctx.integerValue("InnerEcsRegionQueryAllResponse.count"));

		ErrorCode errorCode = new ErrorCode();
		errorCode.setCode(_ctx.stringValue("InnerEcsRegionQueryAllResponse.errorCode.code"));
		errorCode.setMessage(_ctx.stringValue("InnerEcsRegionQueryAllResponse.errorCode.message"));
		errorCode.setIsSuccess(_ctx.booleanValue("InnerEcsRegionQueryAllResponse.errorCode.isSuccess"));
		innerEcsRegionQueryAllResponse.setErrorCode(errorCode);

		List<Item> data = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("InnerEcsRegionQueryAllResponse.data.Length"); i++) {
			Item item = new Item();
			item.setRegionNoAlias(_ctx.stringValue("InnerEcsRegionQueryAllResponse.data["+ i +"].regionNoAlias"));
			item.setRegionMemo(_ctx.stringValue("InnerEcsRegionQueryAllResponse.data["+ i +"].regionMemo"));
			item.setRegionName(_ctx.stringValue("InnerEcsRegionQueryAllResponse.data["+ i +"].regionName"));
			item.setRegionNo(_ctx.stringValue("InnerEcsRegionQueryAllResponse.data["+ i +"].regionNo"));
			item.setRegionEnName(_ctx.stringValue("InnerEcsRegionQueryAllResponse.data["+ i +"].regionEnName"));
			item.setIsActive(_ctx.stringValue("InnerEcsRegionQueryAllResponse.data["+ i +"].isActive"));
			item.setId(_ctx.longValue("InnerEcsRegionQueryAllResponse.data["+ i +"].id"));

			Attributes attributes = new Attributes();
			attributes.setSupport_image_copy(_ctx.stringValue("InnerEcsRegionQueryAllResponse.data["+ i +"].attributes.support_image_copy"));
			attributes.setInternal_use(_ctx.stringValue("InnerEcsRegionQueryAllResponse.data["+ i +"].attributes.internal_use"));
			attributes.setAk_name(_ctx.stringValue("InnerEcsRegionQueryAllResponse.data["+ i +"].attributes.ak_name"));
			item.setAttributes(attributes);

			data.add(item);
		}
		innerEcsRegionQueryAllResponse.setData(data);
	 
	 	return innerEcsRegionQueryAllResponse;
	}
}