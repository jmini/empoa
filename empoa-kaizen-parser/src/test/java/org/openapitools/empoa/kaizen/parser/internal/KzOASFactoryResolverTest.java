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
package org.openapitools.empoa.kaizen.parser.internal;

import static org.testng.Assert.*;

import org.eclipse.microprofile.openapi.OASFactory;
import org.testng.annotations.Test;

public class KzOASFactoryResolverTest {

    @Test
    public void testCreateObject() {
        assertEquals(
            OASFactory.createObject(org.eclipse.microprofile.openapi.models.Components.class)
                .getClass(), org.openapitools.empoa.kaizen.parser.internal.models.KzComponents.class
        );

        assertEquals(
            OASFactory.createObject(org.eclipse.microprofile.openapi.models.ExternalDocumentation.class)
                .getClass(), org.openapitools.empoa.kaizen.parser.internal.models.KzExternalDocumentation.class
        );

        assertEquals(
            OASFactory.createObject(org.eclipse.microprofile.openapi.models.OpenAPI.class)
                .getClass(), org.openapitools.empoa.kaizen.parser.internal.models.KzOpenAPI.class
        );

        assertEquals(
            OASFactory.createObject(org.eclipse.microprofile.openapi.models.Operation.class)
                .getClass(), org.openapitools.empoa.kaizen.parser.internal.models.KzOperation.class
        );

        assertEquals(
            OASFactory.createObject(org.eclipse.microprofile.openapi.models.PathItem.class)
                .getClass(), org.openapitools.empoa.kaizen.parser.internal.models.KzPathItem.class
        );

        assertEquals(
            OASFactory.createObject(org.eclipse.microprofile.openapi.models.Paths.class)
                .getClass(), org.openapitools.empoa.kaizen.parser.internal.models.KzPaths.class
        );

        assertEquals(
            OASFactory.createObject(org.eclipse.microprofile.openapi.models.callbacks.Callback.class)
                .getClass(), org.openapitools.empoa.kaizen.parser.internal.models.callbacks.KzCallback.class
        );

        assertEquals(
            OASFactory.createObject(org.eclipse.microprofile.openapi.models.examples.Example.class)
                .getClass(), org.openapitools.empoa.kaizen.parser.internal.models.examples.KzExample.class
        );

        assertEquals(
            OASFactory.createObject(org.eclipse.microprofile.openapi.models.headers.Header.class)
                .getClass(), org.openapitools.empoa.kaizen.parser.internal.models.headers.KzHeader.class
        );

        assertEquals(
            OASFactory.createObject(org.eclipse.microprofile.openapi.models.info.Contact.class)
                .getClass(), org.openapitools.empoa.kaizen.parser.internal.models.info.KzContact.class
        );

        assertEquals(
            OASFactory.createObject(org.eclipse.microprofile.openapi.models.info.Info.class)
                .getClass(), org.openapitools.empoa.kaizen.parser.internal.models.info.KzInfo.class
        );

        assertEquals(
            OASFactory.createObject(org.eclipse.microprofile.openapi.models.info.License.class)
                .getClass(), org.openapitools.empoa.kaizen.parser.internal.models.info.KzLicense.class
        );

        assertEquals(
            OASFactory.createObject(org.eclipse.microprofile.openapi.models.links.Link.class)
                .getClass(), org.openapitools.empoa.kaizen.parser.internal.models.links.KzLink.class
        );

        assertEquals(
            OASFactory.createObject(org.eclipse.microprofile.openapi.models.media.Content.class)
                .getClass(), org.openapitools.empoa.kaizen.parser.internal.models.media.KzContent.class
        );

        assertEquals(
            OASFactory.createObject(org.eclipse.microprofile.openapi.models.media.Discriminator.class)
                .getClass(), org.openapitools.empoa.kaizen.parser.internal.models.media.KzDiscriminator.class
        );

        assertEquals(
            OASFactory.createObject(org.eclipse.microprofile.openapi.models.media.Encoding.class)
                .getClass(), org.openapitools.empoa.kaizen.parser.internal.models.media.KzEncoding.class
        );

        assertEquals(
            OASFactory.createObject(org.eclipse.microprofile.openapi.models.media.MediaType.class)
                .getClass(), org.openapitools.empoa.kaizen.parser.internal.models.media.KzMediaType.class
        );

        assertEquals(
            OASFactory.createObject(org.eclipse.microprofile.openapi.models.media.Schema.class)
                .getClass(), org.openapitools.empoa.kaizen.parser.internal.models.media.KzSchema.class
        );

        assertEquals(
            OASFactory.createObject(org.eclipse.microprofile.openapi.models.media.XML.class)
                .getClass(), org.openapitools.empoa.kaizen.parser.internal.models.media.KzXML.class
        );

        assertEquals(
            OASFactory.createObject(org.eclipse.microprofile.openapi.models.parameters.Parameter.class)
                .getClass(), org.openapitools.empoa.kaizen.parser.internal.models.parameters.KzParameter.class
        );

        assertEquals(
            OASFactory.createObject(org.eclipse.microprofile.openapi.models.parameters.RequestBody.class)
                .getClass(), org.openapitools.empoa.kaizen.parser.internal.models.parameters.KzRequestBody.class
        );

        assertEquals(
            OASFactory.createObject(org.eclipse.microprofile.openapi.models.responses.APIResponse.class)
                .getClass(), org.openapitools.empoa.kaizen.parser.internal.models.responses.KzAPIResponse.class
        );

        assertEquals(
            OASFactory.createObject(org.eclipse.microprofile.openapi.models.responses.APIResponses.class)
                .getClass(), org.openapitools.empoa.kaizen.parser.internal.models.responses.KzAPIResponses.class
        );

        assertEquals(
            OASFactory.createObject(org.eclipse.microprofile.openapi.models.security.OAuthFlow.class)
                .getClass(), org.openapitools.empoa.kaizen.parser.internal.models.security.KzOAuthFlow.class
        );

        assertEquals(
            OASFactory.createObject(org.eclipse.microprofile.openapi.models.security.OAuthFlows.class)
                .getClass(), org.openapitools.empoa.kaizen.parser.internal.models.security.KzOAuthFlows.class
        );

        assertEquals(
            OASFactory.createObject(org.eclipse.microprofile.openapi.models.security.Scopes.class)
                .getClass(), org.openapitools.empoa.kaizen.parser.internal.models.security.KzScopes.class
        );

        assertEquals(
            OASFactory.createObject(org.eclipse.microprofile.openapi.models.security.SecurityRequirement.class)
                .getClass(), org.openapitools.empoa.kaizen.parser.internal.models.security.KzSecurityRequirement.class
        );

        assertEquals(
            OASFactory.createObject(org.eclipse.microprofile.openapi.models.security.SecurityScheme.class)
                .getClass(), org.openapitools.empoa.kaizen.parser.internal.models.security.KzSecurityScheme.class
        );

        assertEquals(
            OASFactory.createObject(org.eclipse.microprofile.openapi.models.servers.Server.class)
                .getClass(), org.openapitools.empoa.kaizen.parser.internal.models.servers.KzServer.class
        );

        assertEquals(
            OASFactory.createObject(org.eclipse.microprofile.openapi.models.servers.ServerVariable.class)
                .getClass(), org.openapitools.empoa.kaizen.parser.internal.models.servers.KzServerVariable.class
        );

        assertEquals(
            OASFactory.createObject(org.eclipse.microprofile.openapi.models.servers.ServerVariables.class)
                .getClass(), org.openapitools.empoa.kaizen.parser.internal.models.servers.KzServerVariables.class
        );

        assertEquals(
            OASFactory.createObject(org.eclipse.microprofile.openapi.models.tags.Tag.class)
                .getClass(), org.openapitools.empoa.kaizen.parser.internal.models.tags.KzTag.class
        );
    }

}
