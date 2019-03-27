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

public class KzOASFactoryResolver extends org.eclipse.microprofile.openapi.spi.OASFactoryResolver {

    @Override
    @SuppressWarnings("unchecked")
    public <T extends org.eclipse.microprofile.openapi.models.Constructible> T createObject(Class<T> clazz) {
        T instance;
        if (clazz == null) {
            throw new IllegalArgumentException("Class can not be null");
        } else if (clazz == org.eclipse.microprofile.openapi.models.Components.class) {
            instance = (T) new org.openapitools.empoa.kaizen.parser.internal.models.KzComponents();
        } else if (clazz == org.eclipse.microprofile.openapi.models.ExternalDocumentation.class) {
            instance = (T) new org.openapitools.empoa.kaizen.parser.internal.models.KzExternalDocumentation();
        } else if (clazz == org.eclipse.microprofile.openapi.models.OpenAPI.class) {
            instance = (T) new org.openapitools.empoa.kaizen.parser.internal.models.KzOpenAPI();
        } else if (clazz == org.eclipse.microprofile.openapi.models.Operation.class) {
            instance = (T) new org.openapitools.empoa.kaizen.parser.internal.models.KzOperation();
        } else if (clazz == org.eclipse.microprofile.openapi.models.PathItem.class) {
            instance = (T) new org.openapitools.empoa.kaizen.parser.internal.models.KzPathItem();
        } else if (clazz == org.eclipse.microprofile.openapi.models.Paths.class) {
            instance = (T) new org.openapitools.empoa.kaizen.parser.internal.models.KzPaths();
        } else if (clazz == org.eclipse.microprofile.openapi.models.callbacks.Callback.class) {
            instance = (T) new org.openapitools.empoa.kaizen.parser.internal.models.callbacks.KzCallback();
        } else if (clazz == org.eclipse.microprofile.openapi.models.examples.Example.class) {
            instance = (T) new org.openapitools.empoa.kaizen.parser.internal.models.examples.KzExample();
        } else if (clazz == org.eclipse.microprofile.openapi.models.headers.Header.class) {
            instance = (T) new org.openapitools.empoa.kaizen.parser.internal.models.headers.KzHeader();
        } else if (clazz == org.eclipse.microprofile.openapi.models.info.Contact.class) {
            instance = (T) new org.openapitools.empoa.kaizen.parser.internal.models.info.KzContact();
        } else if (clazz == org.eclipse.microprofile.openapi.models.info.Info.class) {
            instance = (T) new org.openapitools.empoa.kaizen.parser.internal.models.info.KzInfo();
        } else if (clazz == org.eclipse.microprofile.openapi.models.info.License.class) {
            instance = (T) new org.openapitools.empoa.kaizen.parser.internal.models.info.KzLicense();
        } else if (clazz == org.eclipse.microprofile.openapi.models.links.Link.class) {
            instance = (T) new org.openapitools.empoa.kaizen.parser.internal.models.links.KzLink();
        } else if (clazz == org.eclipse.microprofile.openapi.models.media.Content.class) {
            instance = (T) new org.openapitools.empoa.kaizen.parser.internal.models.media.KzContent();
        } else if (clazz == org.eclipse.microprofile.openapi.models.media.Discriminator.class) {
            instance = (T) new org.openapitools.empoa.kaizen.parser.internal.models.media.KzDiscriminator();
        } else if (clazz == org.eclipse.microprofile.openapi.models.media.Encoding.class) {
            instance = (T) new org.openapitools.empoa.kaizen.parser.internal.models.media.KzEncoding();
        } else if (clazz == org.eclipse.microprofile.openapi.models.media.MediaType.class) {
            instance = (T) new org.openapitools.empoa.kaizen.parser.internal.models.media.KzMediaType();
        } else if (clazz == org.eclipse.microprofile.openapi.models.media.Schema.class) {
            instance = (T) new org.openapitools.empoa.kaizen.parser.internal.models.media.KzSchema();
        } else if (clazz == org.eclipse.microprofile.openapi.models.media.XML.class) {
            instance = (T) new org.openapitools.empoa.kaizen.parser.internal.models.media.KzXML();
        } else if (clazz == org.eclipse.microprofile.openapi.models.parameters.Parameter.class) {
            instance = (T) new org.openapitools.empoa.kaizen.parser.internal.models.parameters.KzParameter();
        } else if (clazz == org.eclipse.microprofile.openapi.models.parameters.RequestBody.class) {
            instance = (T) new org.openapitools.empoa.kaizen.parser.internal.models.parameters.KzRequestBody();
        } else if (clazz == org.eclipse.microprofile.openapi.models.responses.APIResponse.class) {
            instance = (T) new org.openapitools.empoa.kaizen.parser.internal.models.responses.KzAPIResponse();
        } else if (clazz == org.eclipse.microprofile.openapi.models.responses.APIResponses.class) {
            instance = (T) new org.openapitools.empoa.kaizen.parser.internal.models.responses.KzAPIResponses();
        } else if (clazz == org.eclipse.microprofile.openapi.models.security.OAuthFlow.class) {
            instance = (T) new org.openapitools.empoa.kaizen.parser.internal.models.security.KzOAuthFlow();
        } else if (clazz == org.eclipse.microprofile.openapi.models.security.OAuthFlows.class) {
            instance = (T) new org.openapitools.empoa.kaizen.parser.internal.models.security.KzOAuthFlows();
        } else if (clazz == org.eclipse.microprofile.openapi.models.security.Scopes.class) {
            instance = (T) new org.openapitools.empoa.kaizen.parser.internal.models.security.KzScopes();
        } else if (clazz == org.eclipse.microprofile.openapi.models.security.SecurityRequirement.class) {
            instance = (T) new org.openapitools.empoa.kaizen.parser.internal.models.security.KzSecurityRequirement();
        } else if (clazz == org.eclipse.microprofile.openapi.models.security.SecurityScheme.class) {
            instance = (T) new org.openapitools.empoa.kaizen.parser.internal.models.security.KzSecurityScheme();
        } else if (clazz == org.eclipse.microprofile.openapi.models.servers.Server.class) {
            instance = (T) new org.openapitools.empoa.kaizen.parser.internal.models.servers.KzServer();
        } else if (clazz == org.eclipse.microprofile.openapi.models.servers.ServerVariable.class) {
            instance = (T) new org.openapitools.empoa.kaizen.parser.internal.models.servers.KzServerVariable();
        } else if (clazz == org.eclipse.microprofile.openapi.models.servers.ServerVariables.class) {
            instance = (T) new org.openapitools.empoa.kaizen.parser.internal.models.servers.KzServerVariables();
        } else if (clazz == org.eclipse.microprofile.openapi.models.tags.Tag.class) {
            instance = (T) new org.openapitools.empoa.kaizen.parser.internal.models.tags.KzTag();
        } else {
            throw new IllegalArgumentException("Can not create " + clazz.getCanonicalName());
        }
        return instance;
    }

}
