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

import static org.assertj.core.api.Assertions.*;

import org.eclipse.microprofile.openapi.OASFactory;
import org.junit.jupiter.api.Test;

public class KzOASFactoryResolverTest {

    @Test
    public void testCreateObject() {
        assertThat(OASFactory.createObject(org.eclipse.microprofile.openapi.models.Components.class))
            .isOfAnyClassIn(org.openapitools.empoa.kaizen.parser.internal.models.KzComponents.class);

        assertThat(OASFactory.createObject(org.eclipse.microprofile.openapi.models.ExternalDocumentation.class))
            .isOfAnyClassIn(org.openapitools.empoa.kaizen.parser.internal.models.KzExternalDocumentation.class);

        assertThat(OASFactory.createObject(org.eclipse.microprofile.openapi.models.OpenAPI.class))
            .isOfAnyClassIn(org.openapitools.empoa.kaizen.parser.internal.models.KzOpenAPI.class);

        assertThat(OASFactory.createObject(org.eclipse.microprofile.openapi.models.Operation.class))
            .isOfAnyClassIn(org.openapitools.empoa.kaizen.parser.internal.models.KzOperation.class);

        assertThat(OASFactory.createObject(org.eclipse.microprofile.openapi.models.PathItem.class))
            .isOfAnyClassIn(org.openapitools.empoa.kaizen.parser.internal.models.KzPathItem.class);

        assertThat(OASFactory.createObject(org.eclipse.microprofile.openapi.models.Paths.class))
            .isOfAnyClassIn(org.openapitools.empoa.kaizen.parser.internal.models.KzPaths.class);

        assertThat(OASFactory.createObject(org.eclipse.microprofile.openapi.models.callbacks.Callback.class))
            .isOfAnyClassIn(org.openapitools.empoa.kaizen.parser.internal.models.callbacks.KzCallback.class);

        assertThat(OASFactory.createObject(org.eclipse.microprofile.openapi.models.examples.Example.class))
            .isOfAnyClassIn(org.openapitools.empoa.kaizen.parser.internal.models.examples.KzExample.class);

        assertThat(OASFactory.createObject(org.eclipse.microprofile.openapi.models.headers.Header.class))
            .isOfAnyClassIn(org.openapitools.empoa.kaizen.parser.internal.models.headers.KzHeader.class);

        assertThat(OASFactory.createObject(org.eclipse.microprofile.openapi.models.info.Contact.class))
            .isOfAnyClassIn(org.openapitools.empoa.kaizen.parser.internal.models.info.KzContact.class);

        assertThat(OASFactory.createObject(org.eclipse.microprofile.openapi.models.info.Info.class))
            .isOfAnyClassIn(org.openapitools.empoa.kaizen.parser.internal.models.info.KzInfo.class);

        assertThat(OASFactory.createObject(org.eclipse.microprofile.openapi.models.info.License.class))
            .isOfAnyClassIn(org.openapitools.empoa.kaizen.parser.internal.models.info.KzLicense.class);

        assertThat(OASFactory.createObject(org.eclipse.microprofile.openapi.models.links.Link.class))
            .isOfAnyClassIn(org.openapitools.empoa.kaizen.parser.internal.models.links.KzLink.class);

        assertThat(OASFactory.createObject(org.eclipse.microprofile.openapi.models.media.Content.class))
            .isOfAnyClassIn(org.openapitools.empoa.kaizen.parser.internal.models.media.KzContent.class);

        assertThat(OASFactory.createObject(org.eclipse.microprofile.openapi.models.media.Discriminator.class))
            .isOfAnyClassIn(org.openapitools.empoa.kaizen.parser.internal.models.media.KzDiscriminator.class);

        assertThat(OASFactory.createObject(org.eclipse.microprofile.openapi.models.media.Encoding.class))
            .isOfAnyClassIn(org.openapitools.empoa.kaizen.parser.internal.models.media.KzEncoding.class);

        assertThat(OASFactory.createObject(org.eclipse.microprofile.openapi.models.media.MediaType.class))
            .isOfAnyClassIn(org.openapitools.empoa.kaizen.parser.internal.models.media.KzMediaType.class);

        assertThat(OASFactory.createObject(org.eclipse.microprofile.openapi.models.media.Schema.class))
            .isOfAnyClassIn(org.openapitools.empoa.kaizen.parser.internal.models.media.KzSchema.class);

        assertThat(OASFactory.createObject(org.eclipse.microprofile.openapi.models.media.XML.class))
            .isOfAnyClassIn(org.openapitools.empoa.kaizen.parser.internal.models.media.KzXML.class);

        assertThat(OASFactory.createObject(org.eclipse.microprofile.openapi.models.parameters.Parameter.class))
            .isOfAnyClassIn(org.openapitools.empoa.kaizen.parser.internal.models.parameters.KzParameter.class);

        assertThat(OASFactory.createObject(org.eclipse.microprofile.openapi.models.parameters.RequestBody.class))
            .isOfAnyClassIn(org.openapitools.empoa.kaizen.parser.internal.models.parameters.KzRequestBody.class);

        assertThat(OASFactory.createObject(org.eclipse.microprofile.openapi.models.responses.APIResponse.class))
            .isOfAnyClassIn(org.openapitools.empoa.kaizen.parser.internal.models.responses.KzAPIResponse.class);

        assertThat(OASFactory.createObject(org.eclipse.microprofile.openapi.models.responses.APIResponses.class))
            .isOfAnyClassIn(org.openapitools.empoa.kaizen.parser.internal.models.responses.KzAPIResponses.class);

        assertThat(OASFactory.createObject(org.eclipse.microprofile.openapi.models.security.OAuthFlow.class))
            .isOfAnyClassIn(org.openapitools.empoa.kaizen.parser.internal.models.security.KzOAuthFlow.class);

        assertThat(OASFactory.createObject(org.eclipse.microprofile.openapi.models.security.OAuthFlows.class))
            .isOfAnyClassIn(org.openapitools.empoa.kaizen.parser.internal.models.security.KzOAuthFlows.class);

        assertThat(OASFactory.createObject(org.eclipse.microprofile.openapi.models.security.Scopes.class))
            .isOfAnyClassIn(org.openapitools.empoa.kaizen.parser.internal.models.security.KzScopes.class);

        assertThat(OASFactory.createObject(org.eclipse.microprofile.openapi.models.security.SecurityRequirement.class))
            .isOfAnyClassIn(org.openapitools.empoa.kaizen.parser.internal.models.security.KzSecurityRequirement.class);

        assertThat(OASFactory.createObject(org.eclipse.microprofile.openapi.models.security.SecurityScheme.class))
            .isOfAnyClassIn(org.openapitools.empoa.kaizen.parser.internal.models.security.KzSecurityScheme.class);

        assertThat(OASFactory.createObject(org.eclipse.microprofile.openapi.models.servers.Server.class))
            .isOfAnyClassIn(org.openapitools.empoa.kaizen.parser.internal.models.servers.KzServer.class);

        assertThat(OASFactory.createObject(org.eclipse.microprofile.openapi.models.servers.ServerVariable.class))
            .isOfAnyClassIn(org.openapitools.empoa.kaizen.parser.internal.models.servers.KzServerVariable.class);

        assertThat(OASFactory.createObject(org.eclipse.microprofile.openapi.models.servers.ServerVariables.class))
            .isOfAnyClassIn(org.openapitools.empoa.kaizen.parser.internal.models.servers.KzServerVariables.class);

        assertThat(OASFactory.createObject(org.eclipse.microprofile.openapi.models.tags.Tag.class))
            .isOfAnyClassIn(org.openapitools.empoa.kaizen.parser.internal.models.tags.KzTag.class);
    }
}
