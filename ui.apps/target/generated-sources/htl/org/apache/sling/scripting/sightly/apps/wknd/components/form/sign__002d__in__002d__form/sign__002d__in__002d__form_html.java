/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 ******************************************************************************/
package org.apache.sling.scripting.sightly.apps.wknd.components.form.sign__002d__in__002d__form;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class sign__002d__in__002d__form_html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_placeholdertemplate = null;
Object _dynamic_properties = bindings.get("properties");
Object _global_hascontent = null;
out.write("\r\n\r\n\r\n\r\n");
_global_placeholdertemplate = renderContext.call("use", "core/wcm/components/commons/v1/templates.html", obj());
_global_hascontent = (!org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(_dynamic_properties, "actionUrl"), ""));
if (renderContext.getObjectModel().toBoolean(_global_hascontent)) {
    out.write("<div class=\"wknd-sign-in-form\">\r\n\r\n    <form method=\"POST\"");
    {
        Object var_attrvalue0 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "actionUrl");
        {
            Object var_attrcontent1 = renderContext.call("xss", var_attrvalue0, "uri");
            {
                Object var_shoulddisplayattr3 = ((renderContext.getObjectModel().toBoolean(var_attrcontent1) ? var_attrcontent1 : ("false".equals(var_attrvalue0))));
                if (renderContext.getObjectModel().toBoolean(var_shoulddisplayattr3)) {
                    out.write(" action");
                    {
                        boolean var_istrueattr2 = (var_attrvalue0.equals(true));
                        if (!var_istrueattr2) {
                            out.write("=\"");
                            out.write(renderContext.getObjectModel().toString(var_attrcontent1));
                            out.write("\"");
                        }
                    }
                }
            }
        }
    }
    out.write(" id=\"wknd-sign-in-form\" class=\"wknd-sign-in-form__form\">\r\n        <input type=\"hidden\" name=\"charset\" value=\"\uD83D\uDC36\"/>\r\n        <input type=\"hidden\" name=\"j_validate\" value=\"false\"/>\r\n\r\n        ");
    {
        Object var_resourcecontent4 = renderContext.call("includeResource", "container", obj().with("resourceType", "wknd/components/container"));
        out.write(renderContext.getObjectModel().toString(var_resourcecontent4));
    }
    out.write("\r\n    </form>\r\n\r\n</div>");
}
out.write("\r\n");
{
    Object var_templatevar5 = renderContext.getObjectModel().resolveProperty(_global_placeholdertemplate, "placeholder");
    {
        boolean var_templateoptions6_field$_isempty = (!renderContext.getObjectModel().toBoolean(_global_hascontent));
        {
            java.util.Map var_templateoptions6 = obj().with("isEmpty", var_templateoptions6_field$_isempty);
            callUnit(out, renderContext, var_templatevar5, var_templateoptions6);
        }
    }
}
out.write("\r\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

