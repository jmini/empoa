/*******************************************************************************
 * Copyright 2019 Jeremie Bresson
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.  You may obtain a copy
 * of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations under
 * the License.
 ******************************************************************************/
package org.openapitools.empoa.jackson;

import java.io.IOException;

import org.eclipse.microprofile.openapi.models.OpenAPI;
import org.openapitools.empoa.extended.tck.AbstractSerializerTest;

public class SerializerTckTest extends AbstractSerializerTest {

    @Override
    protected String convertToJson(OpenAPI openAPI) throws IOException {
        // tag::usage[]
        String json = OpenAPISerializer.serialize(openAPI, OpenAPISerializer.Format.JSON);
        // end::usage[]
        return json;
    }
}
