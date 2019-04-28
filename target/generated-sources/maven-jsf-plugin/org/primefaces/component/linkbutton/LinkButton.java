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
package org.primefaces.component.linkbutton;

import javax.faces.component.html.HtmlOutcomeTargetLink;
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
import java.util.Map;
import org.primefaces.util.ComponentUtils;
import org.primefaces.util.HTML;

@ResourceDependencies({
	@ResourceDependency(library="primefaces", name="components.css"),
	@ResourceDependency(library="primefaces", name="jquery/jquery.js"),
	@ResourceDependency(library="primefaces", name="core.js"),
	@ResourceDependency(library="primefaces", name="components.js")
})
public class LinkButton extends HtmlOutcomeTargetLink implements org.primefaces.component.api.UIOutcomeTarget,org.primefaces.component.api.Widget {


	public static final String COMPONENT_TYPE = "org.primefaces.component.LinkButton";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";
	public static final String DEFAULT_RENDERER = "org.primefaces.component.LinkButtonRenderer";

	public enum PropertyKeys {

		widgetVar
		,fragment
		,disableClientWindow
		,href
		,escape;

		String toString;

		PropertyKeys(String toString) {
			this.toString = toString;
		}

		PropertyKeys() {}

		public String toString() {
			return ((this.toString != null) ? this.toString : super.toString());
}
	}

	public LinkButton() {
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

	public java.lang.String getFragment() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.fragment, null);
	}
	public void setFragment(java.lang.String _fragment) {
		getStateHelper().put(PropertyKeys.fragment, _fragment);
	}

	public boolean isDisableClientWindow() {
		return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.disableClientWindow, false);
	}
	public void setDisableClientWindow(boolean _disableClientWindow) {
		getStateHelper().put(PropertyKeys.disableClientWindow, _disableClientWindow);
	}

	public java.lang.String getHref() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.href, null);
	}
	public void setHref(java.lang.String _href) {
		getStateHelper().put(PropertyKeys.href, _href);
	}

	public boolean isEscape() {
		return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.escape, true);
	}
	public void setEscape(boolean _escape) {
		getStateHelper().put(PropertyKeys.escape, _escape);
	}


    public final static String STYLE_CLASS = "ui-linkbutton " + HTML.BUTTON_TEXT_ONLY_BUTTON_CLASS;
    public final static String DISABLED_STYLE_CLASS = STYLE_CLASS + " ui-state-disabled";

    public Map<String, List<String>> getParams() {
        return ComponentUtils.getUIParams(this);
    }
	public String resolveWidgetVar() {
		return ComponentUtils.resolveWidgetVar(getFacesContext(), this);
	}
}