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
package org.openapitools.empoa.specs.kaizen;

import java.util.Arrays;
import java.util.List;

import org.openapitools.empoa.specs.ElementType;
import org.openapitools.empoa.specs.IMember;

public class KzElement {

    public final List<ElementType> mpElements;
    public final String kzFqName;
    public final List<IMember> members;

    public KzElement(String kzFqName, List<IMember> members, ElementType... mpElements) {
        this.mpElements = Arrays.asList(mpElements);
        this.kzFqName = kzFqName;
        this.members = members;
    }
}
