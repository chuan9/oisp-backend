/**
 * Copyright (c) 2015 Intel Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.intel.databackend.datastructures.responses;

import com.cedarsoftware.util.io.JsonWriter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.intel.databackend.datastructures.DeviceComponent;

import java.util.List;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeviceSearchResponse {

    private String deviceId;
    private String name;
    private List<DeviceComponent> components;

    public List<DeviceComponent> getComponents() {
        return components;
    }

    public void setComponents(List<DeviceComponent> components) {
        this.components = components;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String toString() {
        return JsonWriter.objectToJson(this);
    }
}
