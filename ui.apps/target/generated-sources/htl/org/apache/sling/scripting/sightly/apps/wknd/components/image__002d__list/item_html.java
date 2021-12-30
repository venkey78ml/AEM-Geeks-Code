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
package org.apache.sling.scripting.sightly.apps.wknd.components.image__002d__list;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class item_html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _dynamic_item = getProperty("item");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------

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
addSubTemplate("item", new RenderUnit() {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Sub-Template Body -------------------------------------------------------------------------

Object _dynamic_item = arguments.get("item");
out.write("\r\n    <article class=\"cmp-image-list__item-content\">\r\n        ");
{
    Object var_testvariable0 = renderContext.getObjectModel().resolveProperty(_dynamic_item, "image");
    if (renderContext.getObjectModel().toBoolean(var_testvariable0)) {
        out.write("<a class=\"cmp-image-list__item-image-link\"");
        {
            Object var_attrvalue1 = renderContext.getObjectModel().resolveProperty(_dynamic_item, "URL");
            {
                Object var_attrcontent2 = renderContext.call("xss", var_attrvalue1, "uri");
                {
                    Object var_shoulddisplayattr4 = ((renderContext.getObjectModel().toBoolean(var_attrcontent2) ? var_attrcontent2 : ("false".equals(var_attrvalue1))));
                    if (renderContext.getObjectModel().toBoolean(var_shoulddisplayattr4)) {
                        out.write(" href");
                        {
                            boolean var_istrueattr3 = (var_attrvalue1.equals(true));
                            if (!var_istrueattr3) {
                                out.write("=\"");
                                out.write(renderContext.getObjectModel().toString(var_attrcontent2));
                                out.write("\"");
                            }
                        }
                    }
                }
            }
        }
        {
            boolean var_attrvalue5 = (renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_dynamic_item, "data")) ? true : false);
            {
                Object var_attrcontent6 = renderContext.call("xss", var_attrvalue5, "attribute");
                {
                    Object var_shoulddisplayattr8 = ((renderContext.getObjectModel().toBoolean(var_attrcontent6) ? var_attrcontent6 : ("false".equals(var_attrvalue5))));
                    if (renderContext.getObjectModel().toBoolean(var_shoulddisplayattr8)) {
                        out.write(" data-cmp-clickable");
                        {
                            boolean var_istrueattr7 = (var_attrvalue5 == true);
                            if (!var_istrueattr7) {
                                out.write("=\"");
                                out.write(renderContext.getObjectModel().toString(var_attrcontent6));
                                out.write("\"");
                            }
                        }
                    }
                }
            }
        }
        out.write(">\r\n            <div class=\"cmp-image-list__item-image\">");
        {
            Object var_resourcecontent9 = renderContext.call("includeResource", renderContext.getObjectModel().resolveProperty(_dynamic_item, "image"), obj().with("wcmmode", "disabled"));
            out.write(renderContext.getObjectModel().toString(var_resourcecontent9));
        }
        out.write("</div>\r\n        </a>");
    }
}
out.write("\r\n\r\n        <a class=\"cmp-image-list__item-title-link\"");
{
    Object var_attrvalue10 = renderContext.getObjectModel().resolveProperty(_dynamic_item, "URL");
    {
        Object var_attrcontent11 = renderContext.call("xss", var_attrvalue10, "uri");
        {
            Object var_shoulddisplayattr13 = ((renderContext.getObjectModel().toBoolean(var_attrcontent11) ? var_attrcontent11 : ("false".equals(var_attrvalue10))));
            if (renderContext.getObjectModel().toBoolean(var_shoulddisplayattr13)) {
                out.write(" href");
                {
                    boolean var_istrueattr12 = (var_attrvalue10.equals(true));
                    if (!var_istrueattr12) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent11));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
{
    boolean var_attrvalue14 = (renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_dynamic_item, "data")) ? true : false);
    {
        Object var_attrcontent15 = renderContext.call("xss", var_attrvalue14, "attribute");
        {
            Object var_shoulddisplayattr17 = ((renderContext.getObjectModel().toBoolean(var_attrcontent15) ? var_attrcontent15 : ("false".equals(var_attrvalue14))));
            if (renderContext.getObjectModel().toBoolean(var_shoulddisplayattr17)) {
                out.write(" data-cmp-clickable");
                {
                    boolean var_istrueattr16 = (var_attrvalue14 == true);
                    if (!var_istrueattr16) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent15));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write(">\r\n            <span class=\"cmp-image-list__item-title\">");
{
    Object var_18 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_item, "title"), "text");
    out.write(renderContext.getObjectModel().toString(var_18));
}
out.write("</span>\r\n        </a>\r\n\r\n        ");
{
    Object var_testvariable19 = renderContext.getObjectModel().resolveProperty(_dynamic_item, "description");
    if (renderContext.getObjectModel().toBoolean(var_testvariable19)) {
        out.write("<span class=\"cmp-image-list__item-description\">");
        {
            Object var_20 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_item, "description"), "text");
            out.write(renderContext.getObjectModel().toString(var_20));
        }
        out.write("</span>");
    }
}
out.write("\r\n    </article>\r\n");


// End Of Main Sub-Template Body ------------------------------------------------------------------
    }



    {
//Sub-Sub-Templates Initialization ----------------------------------------------------------------



//End of Sub-Sub-Templates Initialization ---------------------------------------------------------
    }
    
});


//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

