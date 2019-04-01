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
package org.openapitools.empoa.generator.kaizen;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openapitools.empoa.generator.Input;
import org.openapitools.empoa.specs.Element;
import org.openapitools.empoa.specs.ElementType;
import org.openapitools.empoa.specs.OpenAPISpec;
import org.openapitools.empoa.specs.kaizen.KzElement;
import org.openapitools.empoa.specs.kaizen.KzSpec;

public class KaizenGeneratorMain {

    public static void main(String[] args) throws Exception {
        Input input = new Input(Paths.get("../empoa-kaizen-parser/src/main/java"), "org.openapitools.empoa.kaizen.parser.internal");
        Map<ElementType, List<KzElement>> map = new HashMap<>();
        for (KzElement kzElement : KzSpec.elements()) {
            for (ElementType element : kzElement.mpElements) {
                List<KzElement> list;
                if (map.containsKey(element)) {
                    list = map.get(element);
                } else {
                    list = new ArrayList<>();
                    map.put(element, list);
                }
                list.add(kzElement);
            }
        }

        for (Element element : OpenAPISpec.elements()) {
            if (map.get(element.type) == null) {
                throw new IllegalStateException("No match for " + element.type);
            }
            KaizenGenerator generator = new KaizenGenerator(element, input, map.get(element.type));
            generator.writeFile();
        }
    }

}
