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
/**
 *
 */
package org.openapitools.empoa.specs.kaizen;

import java.util.ArrayList;
import java.util.List;

import org.openapitools.empoa.specs.ElementType;
import org.openapitools.empoa.specs.IMember;

/**
 * @author jbr
 *
 */
public class KzSpec {

    public static List<KzElement> elements() {
        List<KzElement> elements = new ArrayList<>();
        // org.eclipse.microprofile.openapi.models
        // elements.add(createComponents());
        elements.add(createExternalDocumentation());
        elements.add(createOpenAPI());
        elements.add(createOperation());
        elements.add(createPathItem());
        // elements.add(createPaths());

        // org.eclipse.microprofile.openapi.models.callbacks
        elements.add(createCallback());

        // org.eclipse.microprofile.openapi.models.examples
        elements.add(createExample());

        // org.eclipse.microprofile.openapi.models.headers
        elements.add(createHeader());

        // org.eclipse.microprofile.openapi.models.info
        elements.add(createContact());
        elements.add(createInfo());
        elements.add(createLicense());

        // org.eclipse.microprofile.openapi.models.links
        elements.add(createLink());

        // org.eclipse.microprofile.openapi.models.media
        // elements.add(createContent());
        elements.add(createDiscriminator());
        elements.add(createEncoding());
        elements.add(createMediaType());
        elements.add(createSchema());
        elements.add(createXML());

        // org.eclipse.microprofile.openapi.models.parameters
        elements.add(createParameter());
        elements.add(createRequestBody());

        // org.eclipse.microprofile.openapi.models.responses
        elements.add(createAPIResponse());
        // elements.add(createAPIResponses());

        // org.eclipse.microprofile.openapi.models.security
        elements.add(createOAuthFlow());
        // elements.add(createOAuthFlows());
        // elements.add(createScopes());
        elements.add(createSecurityRequirement());
        elements.add(createSecurityScheme());

        // org.eclipse.microprofile.openapi.models.servers
        elements.add(createServer());
        elements.add(createServerVariable());
        // elements.add(createServerVariables());

        // org.eclipse.microprofile.openapi.models.tag
        elements.add(createTag());

        return elements;
    }

    // public static KzElement createComponents() {
    // List<IMember> members = new ArrayList<>();
    // // members.add(new SwMapMember(MemberType.Components_Schemas, "Schemas", Schema.class.getCanonicalName()));
    // // members.add(new SwMapMember(MemberType.Components_Responses, "Responses", APIResponse.class.getCanonicalName()));
    // // members.add(new SwMapMember(MemberType.Components_Parameters, "Parameters", Parameter.class.getCanonicalName()));
    // // members.add(new SwMapMember(MemberType.Components_Examples, "Examples", Example.class.getCanonicalName()));
    // // members.add(new SwMapMember(MemberType.Components_RequestBodies, "RequestBodies", RequestBody.class.getCanonicalName()));
    // // members.add(new SwMapMember(MemberType.Components_Headers, "Headers", Header.class.getCanonicalName()));
    // // members.add(new SwMapMember(MemberType.Components_SecuritySchemes, "SecuritySchemes", SecurityScheme.class.getCanonicalName()));
    // // members.add(new SwMapMember(MemberType.Components_Links, "Links", Link.class.getCanonicalName()));
    // // members.add(new SwMapMember(MemberType.Components_Callbacks, "Callbacks", Callback.class.getCanonicalName()));
    // return new KzElement(ElementType.Components(), com.reprezen.kaizen.oasparser.model3.Components.class.getCanonicalName(), members);
    // }

    public static KzElement createExternalDocumentation() {
        List<IMember> members = new ArrayList<>();
        // members.add(new SwMember(MemberType.ExternalDocumentation_Description, "Description", String.class.getSimpleName()));
        // members.add(new SwMember(MemberType.ExternalDocumentation_Url, "Url", String.class.getSimpleName()));
        return new KzElement(com.reprezen.kaizen.oasparser.model3.ExternalDocs.class.getCanonicalName(), members, ElementType.ExternalDocumentation);
    }

    public static KzElement createOpenAPI() {
        List<IMember> members = new ArrayList<>();
        // members.add(new SwMember(MemberType.OpenAPI_Openapi, "Openapi", String.class.getSimpleName()));
        // members.add(new SwMember(MemberType.OpenAPI_Info, "Info", Info.class.getCanonicalName()));
        // members.add(new SwMember(MemberType.OpenAPI_ExternalDocs, "ExternalDocs", ExternalDocumentation.class.getCanonicalName()));
        // members.add(new SwListMember(MemberType.OpenAPI_Servers, "Servers", Server.class.getCanonicalName()));
        // members.add(new SwListMember(MemberType.OpenAPI_Security, "Security", SecurityRequirement.class.getCanonicalName(), "addSecurityRequirement"));
        // members.add(new SwListMember(MemberType.OpenAPI_Tags, "Tags", Tag.class.getCanonicalName()));
        // members.add(new SwMember(MemberType.OpenAPI_Paths, "Paths", Paths.class.getCanonicalName()));
        // members.add(new SwMember(MemberType.OpenAPI_Components, "Components", Components.class.getCanonicalName()));
        return new KzElement(com.reprezen.kaizen.oasparser.model3.OpenApi3.class.getCanonicalName(), members, ElementType.OpenAPI, ElementType.Components, ElementType.Paths);
    }

    public static KzElement createOperation() {
        List<IMember> members = new ArrayList<>();
        // members.add(new SwListMember(MemberType.Operation_Tags, "Tags", String.class.getSimpleName()));
        // members.add(new SwMember(MemberType.Operation_Summary, "Summary", String.class.getSimpleName()));
        // members.add(new SwMember(MemberType.Operation_Description, "Description", String.class.getSimpleName()));
        // members.add(new SwMember(MemberType.Operation_ExternalDocs, "ExternalDocs", ExternalDocumentation.class.getCanonicalName()));
        // members.add(new SwMember(MemberType.Operation_OperationId, "OperationId", String.class.getSimpleName()));
        // members.add(new SwListMember(MemberType.Operation_Parameters, "Parameters", Parameter.class.getCanonicalName()));
        // members.add(new SwMember(MemberType.Operation_RequestBody, "RequestBody", RequestBody.class.getCanonicalName()));
        // members.add(new SwMember(MemberType.Operation_Responses, "Responses", APIResponses.class.getCanonicalName()));
        // members.add(new SwMapMember(MemberType.Operation_Callbacks, "Callbacks", Callback.class.getCanonicalName(), true, true));
        // members.add(new SwMember(MemberType.Operation_Deprecated, "Deprecated", Boolean.class.getSimpleName()));
        // members.add(new SwListMember(MemberType.Operation_Security, "Security", SecurityRequirement.class.getName(), "addSecurityRequirement"));
        // members.add(new SwListMember(MemberType.Operation_Servers, "Servers", Server.class.getCanonicalName()));
        return new KzElement(com.reprezen.kaizen.oasparser.model3.Operation.class.getCanonicalName(), members, ElementType.Operation);
    }

    public static KzElement createPathItem() {
        List<IMember> members = new ArrayList<>();
        // members.add(new SwMember(MemberType.PathItem_Summary, "Summary", String.class.getSimpleName()));
        // members.add(new SwMember(MemberType.PathItem_Description, "Description", String.class.getSimpleName()));
        // members.add(new SwMember(MemberType.PathItem_GET, "Get", Operation.class.getCanonicalName()));
        // members.add(new SwMember(MemberType.PathItem_PUT, "Put", Operation.class.getCanonicalName()));
        // members.add(new SwMember(MemberType.PathItem_POST, "Post", Operation.class.getCanonicalName()));
        // members.add(new SwMember(MemberType.PathItem_DELETE, "Delete", Operation.class.getCanonicalName()));
        // members.add(new SwMember(MemberType.PathItem_OPTIONS, "Options", Operation.class.getCanonicalName()));
        // members.add(new SwMember(MemberType.PathItem_HEAD, "Head", Operation.class.getCanonicalName()));
        // members.add(new SwMember(MemberType.PathItem_PATCH, "Patch", Operation.class.getCanonicalName()));
        // members.add(new SwMember(MemberType.PathItem_TRACE, "Trace", Operation.class.getCanonicalName()));
        // members.add(new AdditionalMethod(Type.PathItem_getOperations));
        // members.add(new SwListMember(MemberType.PathItem_Servers, "Servers", Server.class.getCanonicalName()));
        // members.add(new SwListMember(MemberType.PathItem_Parameters, "Parameters", Parameter.class.getCanonicalName()));
        return new KzElement(com.reprezen.kaizen.oasparser.model3.Path.class.getCanonicalName(), members, ElementType.PathItem);
    }

    // public static KzElement createPaths() {
    // List<IMember> members = new ArrayList<>();
    // // members.add(new SwMapMember(MemberType.Paths_PathItems, "PathItems", PathItem.class.getCanonicalName()));
    // return new KzElement(ElementType.Paths(), com.reprezen.kaizen.oasparser.model3.Paths.class.getCanonicalName(), members);
    // }

    public static KzElement createCallback() {
        List<IMember> members = new ArrayList<>();
        // members.add(new SwMapMember(MemberType.Callback_PathItems, "PathItems", PathItem.class.getCanonicalName()));
        return new KzElement(com.reprezen.kaizen.oasparser.model3.Callback.class.getCanonicalName(), members, ElementType.Callback);
    }

    public static KzElement createExample() {
        List<IMember> members = new ArrayList<>();
        // members.add(new SwMember(MemberType.Example_Summary, "Summary", String.class.getSimpleName()));
        // members.add(new SwMember(MemberType.Example_Description, "Description", String.class.getSimpleName()));
        // members.add(new SwMember(MemberType.Example_Value, "Value", Object.class.getSimpleName()));
        // members.add(new SwMember(MemberType.Example_ExternalValue, "ExternalValue", String.class.getSimpleName()));
        return new KzElement(com.reprezen.kaizen.oasparser.model3.Example.class.getCanonicalName(), members, ElementType.Example);
    }

    public static KzElement createHeader() {
        List<IMember> members = new ArrayList<>();
        // members.add(new SwMember(MemberType.Header_Description, "Description", String.class.getSimpleName()));
        // members.add(new SwMember(MemberType.Header_Required, "Required", Boolean.class.getSimpleName()));
        // members.add(new SwMember(MemberType.Header_Deprecated, "Deprecated", Boolean.class.getSimpleName()));
        // members.add(new SwMember(MemberType.Header_AllowEmptyValue, "AllowEmptyValue", Boolean.class.getSimpleName()));
        // members.add(new SwMember(MemberType.Header_Style, "Style", com.reprezen.kaizen.oasparser.model3.headers.Header.StyleEnum.class.getCanonicalName()));
        // members.add(new SwMember(MemberType.Header_Explode, "Explode", Boolean.class.getSimpleName()));
        // members.add(new SwMember(MemberType.Header_Schema, "Schema", Schema.class.getCanonicalName()));
        // members.add(new SwMapMember(MemberType.Header_Examples, "Examples", Example.class.getCanonicalName()));
        // members.add(new SwMember(MemberType.Header_Example, "Example", Object.class.getSimpleName()));
        // members.add(new SwMember(MemberType.Header_Content, "Content", Content.class.getCanonicalName()));
        return new KzElement(com.reprezen.kaizen.oasparser.model3.Header.class.getCanonicalName(), members, ElementType.Header);
    }

    public static KzElement createContact() {
        List<IMember> members = new ArrayList<>();
        // members.add(new SwMember(MemberType.Contact_Name, "Name", String.class.getSimpleName()));
        // members.add(new SwMember(MemberType.Contact_Url, "Url", String.class.getSimpleName()));
        // members.add(new SwMember(MemberType.Contact_Email, "Email", String.class.getSimpleName()));
        return new KzElement(com.reprezen.kaizen.oasparser.model3.Contact.class.getCanonicalName(), members, ElementType.Contact);
    }

    public static KzElement createInfo() {
        List<IMember> members = new ArrayList<>();
        // members.add(new SwMember(MemberType.Info_Title, "Title", String.class.getSimpleName()));
        // members.add(new SwMember(MemberType.Info_Description, "Description", String.class.getSimpleName()));
        // members.add(new SwMember(MemberType.Info_TermsOfService, "TermsOfService", String.class.getSimpleName()));
        // members.add(new SwMember(MemberType.Info_Contact, "Contact", Contact.class.getCanonicalName()));
        // members.add(new SwMember(MemberType.Info_License, "License", License.class.getCanonicalName()));
        // members.add(new SwMember(MemberType.Info_Version, "Version", String.class.getSimpleName()));
        return new KzElement(com.reprezen.kaizen.oasparser.model3.Info.class.getCanonicalName(), members, ElementType.Info);
    }

    public static KzElement createLicense() {
        List<IMember> members = new ArrayList<>();
        // members.add(new SwMember(MemberType.License_Name, "Name", String.class.getSimpleName()));
        // members.add(new SwMember(MemberType.License_Url, "Url", String.class.getSimpleName()));
        return new KzElement(com.reprezen.kaizen.oasparser.model3.License.class.getCanonicalName(), members, ElementType.License);
    }

    public static KzElement createLink() {
        List<IMember> members = new ArrayList<>();
        // members.add(new SwMember(MemberType.Link_Server, "Server", Server.class.getCanonicalName()));
        // members.add(new SwMember(MemberType.Link_OperationRef, "OperationRef", String.class.getSimpleName()));
        // members.add(new SwMember(MemberType.Link_RequestBody, "RequestBody", Object.class.getSimpleName()));
        // members.add(new SwMember(MemberType.Link_OperationId, "OperationId", String.class.getSimpleName()));
        // members.add(new SwMapMember(MemberType.Link_Parameters, "Parameters", Object.class.getSimpleName()));
        // members.add(new SwMember(MemberType.Link_Description, "Description", String.class.getSimpleName()));
        return new KzElement(com.reprezen.kaizen.oasparser.model3.Link.class.getCanonicalName(), members, ElementType.Link);
    }

    // public static KzElement createContent() {
    // List<IMember> members = new ArrayList<>();
    // // members.add(new SwMapMember(MemberType.Content_MediaTypes, "MediaTypes", MediaType.class.getCanonicalName()));
    // return new KzElement(ElementType.Content(), com.reprezen.kaizen.oasparser.model3.Content.class.getCanonicalName(), members);
    // }

    public static KzElement createDiscriminator() {
        List<IMember> members = new ArrayList<>();
        // members.add(new SwMember(MemberType.Discriminator_PropertyName, "PropertyName", String.class.getSimpleName()));
        // members.add(new SwMapMember(MemberType.Discriminator_Mapping, "Mapping", String.class.getSimpleName()));
        return new KzElement(com.reprezen.kaizen.oasparser.model3.Discriminator.class.getCanonicalName(), members, ElementType.Discriminator);
    }

    public static KzElement createEncoding() {
        List<IMember> members = new ArrayList<>();
        // members.add(new SwMember(MemberType.Encoding_ContentType, "ContentType", String.class.getSimpleName()));
        // members.add(new SwMapMember(MemberType.Encoding_Headers, "Headers", Header.class.getName(), true, true));
        // members.add(new SwMember(MemberType.Encoding_Style, "Style", com.reprezen.kaizen.oasparser.model3.media.Encoding.StyleEnum.class.getCanonicalName()));
        // members.add(new SwMember(MemberType.Encoding_Explode, "Explode", Boolean.class.getSimpleName()));
        // members.add(new SwMember(MemberType.Encoding_AllowReserved, "AllowReserved", Boolean.class.getSimpleName()));
        return new KzElement(com.reprezen.kaizen.oasparser.model3.EncodingProperty.class.getCanonicalName(), members, ElementType.Encoding);
    }

    public static KzElement createMediaType() {
        List<IMember> members = new ArrayList<>();
        // members.add(new SwMember(MemberType.MediaType_Schema, "Schema", Schema.class.getCanonicalName()));
        // members.add(new SwMapMember(MemberType.MediaType_Examples, "Examples", Example.class.getCanonicalName()));
        // members.add(new SwMember(MemberType.MediaType_Example, "Example", Object.class.getSimpleName()));
        // members.add(new SwMapMember(MemberType.MediaType_Encoding, "Encoding", Encoding.class.getCanonicalName()));
        return new KzElement(com.reprezen.kaizen.oasparser.model3.MediaType.class.getCanonicalName(), members, ElementType.MediaType);
    }

    public static KzElement createSchema() {
        List<IMember> members = new ArrayList<>();
        // members.add(new SwMember(MemberType.Schema_Discriminator, "Discriminator", Discriminator.class.getCanonicalName()));
        // members.add(new SwMember(MemberType.Schema_Title, "Title", String.class.getSimpleName()));
        // members.add(new SwMember(MemberType.Schema_DefaultValue, "Default", Object.class.getSimpleName()));
        // members.add(new SwListMember(MemberType.Schema_Enumeration, "Enum", Object.class.getSimpleName(), "addEnumItemObject"));
        // members.add(new SwMember(MemberType.Schema_MultipleOf, "MultipleOf", BigDecimal.class.getCanonicalName()));
        // members.add(new SwMember(MemberType.Schema_Maximum, "Maximum", BigDecimal.class.getCanonicalName()));
        // members.add(new SwMember(MemberType.Schema_ExclusiveMaximum, "ExclusiveMaximum", Boolean.class.getSimpleName()));
        // members.add(new SwMember(MemberType.Schema_Minimum, "Minimum", BigDecimal.class.getCanonicalName()));
        // members.add(new SwMember(MemberType.Schema_ExclusiveMinimum, "ExclusiveMinimum", Boolean.class.getSimpleName()));
        // members.add(new SwMember(MemberType.Schema_MaxLength, "MaxLength", Integer.class.getSimpleName()));
        // members.add(new SwMember(MemberType.Schema_MinLength, "MinLength", Integer.class.getSimpleName()));
        // members.add(new SwMember(MemberType.Schema_Pattern, "Pattern", String.class.getSimpleName()));
        // members.add(new SwMember(MemberType.Schema_MaxItems, "MaxItems", Integer.class.getSimpleName()));
        // members.add(new SwMember(MemberType.Schema_MinItems, "MinItems", Integer.class.getSimpleName()));
        // members.add(new SwMember(MemberType.Schema_UniqueItems, "UniqueItems", Boolean.class.getSimpleName()));
        // members.add(new SwMember(MemberType.Schema_MaxProperties, "MaxProperties", Integer.class.getSimpleName()));
        // members.add(new SwMember(MemberType.Schema_MinProperties, "MinProperties", Integer.class.getSimpleName()));
        // members.add(new SwListMember(MemberType.Schema_Required, "Required", String.class.getSimpleName()));
        // members.add(new SwMember(MemberType.Schema_Type, "Type", Schema.SchemaType.class.getSimpleName()));
        // members.add(new SwMember(MemberType.Schema_Not, "Not", Schema.class.getCanonicalName()));
        // members.add(new SwMapMember(MemberType.Schema_Properties, "Properties", Schema.class.getCanonicalName()));
        // members.add(new SwMember(MemberType.Schema_AdditionalProperties_Schema, "AdditionalPropertiesSchema", Schema.class.getCanonicalName(), true, true, false, true));
        // members.add(new AdditionalMethod(Type.Schema_setAdditionalPropertiesSchema));
        // members.add(new SwMember(MemberType.Schema_AdditionalProperties_Boolean, "AdditionalPropertiesBoolean", Boolean.class.getSimpleName(), true, true, false, true));
        // members.add(new AdditionalMethod(Type.Schema_setAdditionalPropertiesBoolean));
        // members.add(new SwMember(MemberType.Schema_Description, "Description", String.class.getSimpleName()));
        // members.add(new SwMember(MemberType.Schema_Format, "Format", String.class.getSimpleName()));
        // members.add(new SwMember(MemberType.Schema_Nullable, "Nullable", Boolean.class.getSimpleName()));
        // members.add(new SwMember(MemberType.Schema_ReadOnly, "ReadOnly", Boolean.class.getSimpleName()));
        // members.add(new SwMember(MemberType.Schema_WriteOnly, "WriteOnly", Boolean.class.getSimpleName()));
        // members.add(new SwMember(MemberType.Schema_Example, "Example", Object.class.getSimpleName()));
        // members.add(new SwMember(MemberType.Schema_ExternalDocs, "ExternalDocs", ExternalDocumentation.class.getCanonicalName()));
        // members.add(new SwMember(MemberType.Schema_Deprecated, "Deprecated", Boolean.class.getSimpleName()));
        // members.add(new SwMember(MemberType.Schema_Xml, "Xml", XML.class.getCanonicalName()));
        // members.add(new SwMember(MemberType.Schema_Items, "Items", Schema.class.getCanonicalName()));
        // members.add(new SwListMember(MemberType.Schema_AllOf, "AllOf", Schema.class.getCanonicalName()));
        // members.add(new SwListMember(MemberType.Schema_AnyOf, "AnyOf", Schema.class.getCanonicalName()));
        // members.add(new SwListMember(MemberType.Schema_OneOf, "OneOf", Schema.class.getCanonicalName()));
        return new KzElement(com.reprezen.kaizen.oasparser.model3.Schema.class.getCanonicalName(), members, ElementType.Schema);
    }

    public static KzElement createXML() {
        List<IMember> members = new ArrayList<>();
        // members.add(new SwMember(MemberType.XML_Name, "Name", String.class.getSimpleName()));
        // members.add(new SwMember(MemberType.XML_Namespace, "Namespace", String.class.getSimpleName()));
        // members.add(new SwMember(MemberType.XML_Prefix, "Prefix", String.class.getSimpleName()));
        // members.add(new SwMember(MemberType.XML_Attribute, "Attribute", Boolean.class.getSimpleName()));
        // members.add(new SwMember(MemberType.XML_Wrapped, "Wrapped", Boolean.class.getSimpleName()));
        return new KzElement(com.reprezen.kaizen.oasparser.model3.Xml.class.getCanonicalName(), members, ElementType.XML);
    }

    public static KzElement createParameter() {
        List<IMember> members = new ArrayList<>();
        // members.add(new SwMember(MemberType.Parameter_Name, "Name", String.class.getSimpleName()));
        // members.add(new SwMember(MemberType.Parameter_In, "In", String.class.getSimpleName()));
        // members.add(new SwMember(MemberType.Parameter_Description, "Description", String.class.getSimpleName()));
        // members.add(new SwMember(MemberType.Parameter_Required, "Required", Boolean.class.getSimpleName()));
        // members.add(new SwMember(MemberType.Parameter_Deprecated, "Deprecated", Boolean.class.getSimpleName()));
        // members.add(new SwMember(MemberType.Parameter_AllowEmptyValue, "AllowEmptyValue", Boolean.class.getSimpleName()));
        // members.add(new SwMember(MemberType.Parameter_Style, "Style", com.reprezen.kaizen.oasparser.model3.parameters.Parameter.StyleEnum.class.getCanonicalName()));
        // members.add(new SwMember(MemberType.Parameter_Explode, "Explode", Boolean.class.getSimpleName()));
        // members.add(new SwMember(MemberType.Parameter_AllowReserved, "AllowReserved", Boolean.class.getSimpleName()));
        // members.add(new SwMember(MemberType.Parameter_Schema, "Schema", Schema.class.getCanonicalName()));
        // members.add(new SwMapMember(MemberType.Parameter_Examples, "Examples", Example.class.getCanonicalName()));
        // members.add(new SwMember(MemberType.Parameter_Example, "Example", Object.class.getSimpleName()));
        // members.add(new SwMember(MemberType.Parameter_Content, "Content", Content.class.getCanonicalName()));
        return new KzElement(com.reprezen.kaizen.oasparser.model3.Parameter.class.getCanonicalName(), members, ElementType.Parameter);
    }

    public static KzElement createRequestBody() {
        List<IMember> members = new ArrayList<>();
        // members.add(new SwMember(MemberType.RequestBody_Description, "Description", String.class.getSimpleName()));
        // members.add(new SwMember(MemberType.RequestBody_Content, "Content", Content.class.getCanonicalName()));
        // members.add(new SwMember(MemberType.RequestBody_Required, "Required", Boolean.class.getSimpleName()));
        return new KzElement(com.reprezen.kaizen.oasparser.model3.RequestBody.class.getCanonicalName(), members, ElementType.RequestBody);
    }

    public static KzElement createAPIResponse() {
        List<IMember> members = new ArrayList<>();
        // members.add(new SwMember(MemberType.APIResponse_Description, "Description", String.class.getSimpleName()));
        // members.add(new SwMapMember(MemberType.APIResponse_Headers, "Headers", Header.class.getCanonicalName()));
        // members.add(new SwMember(MemberType.APIResponse_Content, "Content", Content.class.getCanonicalName()));
        // members.add(new SwMapMember(MemberType.APIResponse_Links, "Links", Link.class.getCanonicalName()));
        return new KzElement(com.reprezen.kaizen.oasparser.model3.Response.class.getCanonicalName(), members, ElementType.APIResponse);
    }

    // public static KzElement createAPIResponses() {
    // List<IMember> members = new ArrayList<>();
    // // members.add(new SwMapMember(MemberType.APIResponses_APIResponses, "APIResponses", APIResponse.class.getCanonicalName()));
    // // members.add(new AdditionalMethod(Type.APIResponses_getDefaultValue));
    // // members.add(new AdditionalMethod(Type.APIResponses_setDefaultValue));
    // return new KzElement(ElementType.APIResponses(), com.reprezen.kaizen.oasparser.model3.ApiResponses.class.getCanonicalName(), members);
    // }

    public static KzElement createOAuthFlow() {
        List<IMember> members = new ArrayList<>();
        // members.add(new SwMember(MemberType.OAuthFlow_AuthorizationUrl, "AuthorizationUrl", String.class.getSimpleName()));
        // members.add(new SwMember(MemberType.OAuthFlow_TokenUrl, "TokenUrl", String.class.getSimpleName()));
        // members.add(new SwMember(MemberType.OAuthFlow_RefreshUrl, "RefreshUrl", String.class.getSimpleName()));
        // members.add(new SwMember(MemberType.OAuthFlow_Scopes, "Scopes", Scopes.class.getCanonicalName()));
        return new KzElement(com.reprezen.kaizen.oasparser.model3.OAuthFlow.class.getCanonicalName(), members, ElementType.OAuthFlow);
    }

    // public static KzElement createOAuthFlows() {
    // List<IMember> members = new ArrayList<>();
    // // members.add(new SwMember(MemberType.OAuthFlows_Implicit, "Implicit", OAuthFlow.class.getCanonicalName()));
    // // members.add(new SwMember(MemberType.OAuthFlows_Password, "Password", OAuthFlow.class.getCanonicalName()));
    // // members.add(new SwMember(MemberType.OAuthFlows_ClientCredentials, "ClientCredentials", OAuthFlow.class.getCanonicalName()));
    // // members.add(new SwMember(MemberType.OAuthFlows_AuthorizationCode, "AuthorizationCode", OAuthFlow.class.getCanonicalName()));
    // return new KzElement(ElementType.OAuthFlows(), com.reprezen.kaizen.oasparser.model3.OAuthFlows.class.getCanonicalName(), members);
    // }

    // public static KzElement createScopes() {
    // List<IMember> members = new ArrayList<>();
    // // members.add(new SwMapMember(MemberType.Scopes_Scopes, "Scopes", String.class.getSimpleName()));
    // return new KzElement(ElementType.Scopes(), com.reprezen.kaizen.oasparser.model3.Scopes.class.getCanonicalName(), members);
    // }

    public static KzElement createSecurityRequirement() {
        List<IMember> members = new ArrayList<>();
        // members.add(new SwMapMember(MemberType.SecurityRequirement_Schemes, "Schemes", "java.util.List<String>"));
        // members.add(new AdditionalMethod(Type.SecurityRequirement_addScheme_singleton));
        // members.add(new AdditionalMethod(Type.SecurityRequirement_addScheme_empty));
        return new KzElement(com.reprezen.kaizen.oasparser.model3.SecurityRequirement.class.getCanonicalName(), members, ElementType.SecurityRequirement);
    }

    public static KzElement createSecurityScheme() {
        List<IMember> members = new ArrayList<>();
        // members.add(new SwMember(MemberType.SecurityScheme_Type, "Type", com.reprezen.kaizen.oasparser.model3.security.SecurityScheme.Type.class.getCanonicalName()));
        // members.add(new SwMember(MemberType.SecurityScheme_Description, "Description", String.class.getSimpleName()));
        // members.add(new SwMember(MemberType.SecurityScheme_Name, "Name", String.class.getSimpleName()));
        // members.add(new SwMember(MemberType.SecurityScheme_In, "In", com.reprezen.kaizen.oasparser.model3.security.SecurityScheme.In.class.getCanonicalName()));
        // members.add(new SwMember(MemberType.SecurityScheme_Scheme, "Scheme", String.class.getSimpleName()));
        // members.add(new SwMember(MemberType.SecurityScheme_BearerFormat, "BearerFormat", String.class.getSimpleName()));
        // members.add(new SwMember(MemberType.SecurityScheme_Flows, "Flows", OAuthFlows.class.getCanonicalName()));
        // members.add(new SwMember(MemberType.SecurityScheme_OpenIdConnectUrl, "OpenIdConnectUrl", String.class.getSimpleName()));
        return new KzElement(com.reprezen.kaizen.oasparser.model3.SecurityScheme.class.getCanonicalName(), members, ElementType.SecurityScheme);
    }

    public static KzElement createServer() {
        List<IMember> members = new ArrayList<>();
        // members.add(new SwMember(MemberType.Server_Url, "Url", String.class.getSimpleName()));
        // members.add(new SwMember(MemberType.Server_Description, "Description", String.class.getSimpleName()));
        // members.add(new SwMember(MemberType.Server_Variables, "Variables", ServerVariables.class.getCanonicalName()));
        return new KzElement(com.reprezen.kaizen.oasparser.model3.Server.class.getCanonicalName(), members, ElementType.Server);
    }

    public static KzElement createServerVariable() {
        List<IMember> members = new ArrayList<>();
        // members.add(new SwListMember(MemberType.ServerVariable_Enumeration, "Enum", String.class.getSimpleName()));
        // members.add(new SwMember(MemberType.ServerVariable_DefaultValue, "Default", String.class.getSimpleName()));
        // members.add(new SwMember(MemberType.ServerVariable_Description, "Description", String.class.getSimpleName()));
        return new KzElement(com.reprezen.kaizen.oasparser.model3.ServerVariable.class.getCanonicalName(), members, ElementType.ServerVariable);
    }

    // public static KzElement createServerVariables() {
    // List<IMember> members = new ArrayList<>();
    // // members.add(new SwMapMember(MemberType.ServerVariables_ServerVariables, "ServerVariables", ServerVariable.class.getCanonicalName()));
    // return new KzElement(ElementType.ServerVariables(), com.reprezen.kaizen.oasparser.model3.ServerVariables.class.getCanonicalName(), members);
    // }

    public static KzElement createTag() {
        List<IMember> members = new ArrayList<>();
        // members.add(new SwMember(MemberType.Tag_Name, "Name", String.class.getSimpleName()));
        // members.add(new SwMember(MemberType.Tag_Description, "Description", String.class.getSimpleName()));
        // members.add(new SwMember(MemberType.Tag_ExternalDocs, "ExternalDocs", ExternalDocumentation.class.getCanonicalName()));
        return new KzElement(com.reprezen.kaizen.oasparser.model3.Tag.class.getCanonicalName(), members, ElementType.Tag);
    }
}
