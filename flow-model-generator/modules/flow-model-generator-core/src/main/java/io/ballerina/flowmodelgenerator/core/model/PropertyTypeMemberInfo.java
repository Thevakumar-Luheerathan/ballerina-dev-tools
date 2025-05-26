/*
 *  Copyright (c) 2024, WSO2 LLC. (http://www.wso2.com)
 *
 *  WSO2 LLC. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */


package io.ballerina.flowmodelgenerator.core.model;

/**
 * Represents the metadata of a diagram component.
 *
 * @since 2.0.0
 */
public class PropertyTypeMemberInfo {

    private final String type;
    private final String packageInfo;
    private final String packageName;
    private final String kind;
    private boolean selected;

    public PropertyTypeMemberInfo(String type, String packageInfo, String packageName, String kind, boolean selected) {
        this.type = type;
        this.packageInfo = packageInfo;
        this.packageName = packageName;
        this.kind = kind;
        this.selected = selected;
    }

    public String type() {
        return type;
    }

    public String packageInfo() {
        return packageInfo;
    }

    public String packageName() {
        return packageName;
    }

    public String kind() {
        return kind;
    }

    public boolean selected() {
        return selected;
    }

    public void selected(boolean selected) {
        this.selected = selected;
    }

    public static class Builder<T> extends FacetedBuilder<T> {

        private String type;
        private String packageInfo;
        private String packageName;
        private String kind;
        private boolean selected = false;

        public Builder(T parentBuilder) {
            super(parentBuilder);
        }

        public Builder<T> type(String type) {
            this.type = type;
            return this;
        }

        public Builder<T> packageInfo(String packageInfo) {
            this.packageInfo = packageInfo;
            return this;
        }

        public Builder<T> kind(String kind) {
            this.kind = kind;
            return this;
        }

        public Builder<T> selected(boolean selected) {
            this.selected = selected;
            return this;
        }

        public Builder<T> packageName(String packageName) {
            this.packageName = packageName;
            return this;
        }

        public PropertyTypeMemberInfo build() {
            return new PropertyTypeMemberInfo(type, packageInfo, packageName, kind, selected);
        }
    }
}
