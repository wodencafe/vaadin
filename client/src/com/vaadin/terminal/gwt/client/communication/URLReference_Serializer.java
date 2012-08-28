/* 
 * Copyright 2011 Vaadin Ltd.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.vaadin.terminal.gwt.client.communication;

import com.google.gwt.core.client.GWT;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;
import com.vaadin.shared.communication.URLReference;
import com.vaadin.terminal.gwt.client.ApplicationConnection;
import com.vaadin.terminal.gwt.client.metadata.Type;

public class URLReference_Serializer implements JSONSerializer<URLReference> {

    // setURL() -> uRL as first char becomes lower case...
    private static final String URL_FIELD = "uRL";

    @Override
    public URLReference deserialize(Type type, JSONValue jsonValue,
            ApplicationConnection connection) {
        URLReference reference = GWT.create(URLReference.class);
        JSONObject json = (JSONObject) jsonValue;
        if (json.containsKey(URL_FIELD)) {
            JSONValue jsonURL = json.get(URL_FIELD);
            String URL = (String) JsonDecoder.decodeValue(
                    new Type(String.class.getName(), null), jsonURL, null,
                    connection);
            reference.setURL(connection.translateVaadinUri(URL));
        }
        return reference;
    }

    @Override
    public JSONValue serialize(URLReference value,
            ApplicationConnection connection) {
        JSONObject json = new JSONObject();
        json.put(URL_FIELD,
                JsonEncoder.encode(value.getURL(), true, connection));
        return json;
    }

}
