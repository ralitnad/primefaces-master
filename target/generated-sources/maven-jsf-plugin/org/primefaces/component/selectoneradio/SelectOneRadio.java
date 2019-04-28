/*
 * Generated, Do Not Modify
 */
/*
 * Copyright 2009-2013 PrimeTek.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.primefaces.component.selectoneradio;

import javax.faces.component.html.HtmlSelectOneRadio;
import javax.faces.context.FacesContext;
import javax.faces.component.UINamingContainer;
import javax.el.ValueExpression;
import javax.el.MethodExpression;
import javax.faces.render.Renderer;
import java.io.IOException;
import javax.faces.component.UIComponent;
import javax.faces.event.AbortProcessingException;
import javax.faces.application.ResourceDependencies;
import javax.faces.application.ResourceDependency;
import java.util.List;
import java.util.ArrayList;
import org.primefaces.util.ComponentUtils;
import java.util.List;
import javax.faces.model.SelectItem;
import javax.faces.component.UINamingContainer;

@ResourceDependencies({
	@ResourceDependency(library="primefaces", name="components.css"),
	@ResourceDependency(library="primefaces", name="jquery/jquery.js"),
	@ResourceDependency(library="primefaces", name="core.js"),
	@ResourceDependency(library="primefaces", name="components.js")
})
public class SelectOneRadio extends HtmlSelectOneRadio implements org.primefaces.component.api.Widget {


	public static final String COMPONENT_TYPE = "org.primefaces.component.SelectOneRadio";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";
	public static final String DEFAULT_RENDERER = "org.primefaces.component.SelectOneRadioRenderer";

	public enum PropertyKeys {

		widgetVar
		,columns
		,plain;

		String toString;

		PropertyKeys(String toString) {
			this.toString = toString;
		}

		PropertyKeys() {}

		public String toString() {
			return ((this.toString != null) ? this.toString : super.toString());
}
	}

	public SelectOneRadio() {
		setRendererType(DEFAULT_RENDERER);
	}

	public String getFamily() {
		return COMPONENT_FAMILY;
	}

	public java.lang.String getWidgetVar() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.widgetVar, null);
	}
	public void setWidgetVar(java.lang.String _widgetVar) {
		getStateHelper().put(PropertyKeys.widgetVar, _widgetVar);
	}

	public int getColumns() {
		return (java.lang.Integer) getStateHelper().eval(PropertyKeys.columns, 0);
	}
	public void setColumns(int _columns) {
		getStateHelper().put(PropertyKeys.columns, _columns);
	}

	public boolean isPlain() {
		return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.plain, false);
	}
	public void setPlain(boolean _plain) {
		getStateHelper().put(PropertyKeys.plain, _plain);
	}


    public final static String[] SUPPORTED_EVENTS = new String[]{"onchange","onclick"};
    
    public final static String STYLE_CLASS = "ui-selectoneradio ui-widget";
    public final static String NATIVE_STYLE_CLASS = "ui-selectoneradio ui-selectoneradio-native ui-widget";

    private int index = -1;

    public String getRadioButtonId(FacesContext context) {
        index++;

        return this.getClientId(context) + UINamingContainer.getSeparatorChar(context) + index;
    }

    private List<SelectItem> selectItems;

    public void setSelectItems(List<SelectItem> selectItems) {  
        this.selectItems = selectItems;
    }

    public List<SelectItem> getSelectItems() {
        return this.selectItems;
    }
	public String resolveWidgetVar() {
		return ComponentUtils.resolveWidgetVar(getFacesContext(), this);
	}
}