package org.openapitools.empoa.kaizen.parser.internal.models.info;

import org.eclipse.microprofile.openapi.models.info.License;

public class KzLicense implements License {

    private com.reprezen.kaizen.oasparser.model3.License _kzLicense;

    public KzLicense() {
        // _kzLicense = new com.reprezen.kaizen.oasparser.model3.License();
    }

    public KzLicense(com.reprezen.kaizen.oasparser.model3.License _kzLicense) {
        this._kzLicense = _kzLicense;
    }

    public com.reprezen.kaizen.oasparser.model3.License getKz() {
        return _kzLicense;
    }

    private java.util.Map<String, Object> _extensions;

    @Override
    public java.util.Map<String, Object> getExtensions() {
        if (_extensions == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(_extensions);
    }

    @Override
    public void setExtensions(java.util.Map<String, Object> extensions) {
        if (extensions == null) {
            _extensions = null;
        } else {
            _extensions = new java.util.LinkedHashMap<>();
            _extensions.putAll(extensions);
        }
    }

    @Override
    public License addExtension(String key, Object object) {
        if (object == null) {
            throw new IllegalArgumentException("Null value for key '" + key + "' is not allowed");
        } else {
            if (_extensions == null) {
                _extensions = new java.util.LinkedHashMap<>();
            }
            _extensions.put(key, object);
        }
        return this;
    }

    @Override
    public void removeExtension(String key) {
        if (_extensions != null) {
            _extensions.remove(key);
        }
    }

    private String _name;

    @Override
    public String getName() {
        return _name;
    }

    @Override
    public void setName(String name) {
        _name = name;
    }

    private String _url;

    @Override
    public String getUrl() {
        return _url;
    }

    @Override
    public void setUrl(String url) {
        _url = url;
    }

}
