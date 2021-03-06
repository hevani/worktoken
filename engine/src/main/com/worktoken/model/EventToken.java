/*
 * Copyright (c) 2011. Rush Project Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.worktoken.model;


import java.util.HashMap;
import java.util.Map;

/**
 * @author Alex Pavlov (alex@rushproject.com)
 */
public class EventToken {
    private String definitionId;
    private long triggerInstanceId;
    private Map<String, Object> data;

    public String getDefinitionId() {
        return definitionId;
    }

    public void setDefinitionId(String definitionId) {
        this.definitionId = definitionId;
    }

    public Map<String, Object> getData() {
        if (data == null) {
            data = new HashMap<String, Object>();
        }
        return data;
    }

    public long getTriggerInstanceId() {
        return triggerInstanceId;
    }

    public void setTriggerInstanceId(long triggerInstanceId) {
        this.triggerInstanceId = triggerInstanceId;
    }
}
