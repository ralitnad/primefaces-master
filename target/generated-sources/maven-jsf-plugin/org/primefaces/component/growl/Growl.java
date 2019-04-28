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
package org.primefaces.component.growl;

import javax.faces.component.UIMessages;
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

@ResourceDependencies({
	@ResourceDependency(library="primefaces", name="components.css"),
	@ResourceDependency(library="primefaces", name="jquery/jquery.js"),
	@ResourceDependency(library="primefaces", name="jquery/jquery-plugins.js"),
	@ResourceDependency(library="primefaces", name="core.js"),
	@ResourceDependency(library="primefaces", name="components.js")
})
public class Growl extends UIMessages implements org.primefaces.component.api.Widget,org.primefaces.component.api.UINotification {


	public static final String COMPONENT_TYPE = "org.primefaces.component.Growl";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";
	public static final String DEFAULT_RENDERER = "org.primefaces.component.GrowlRenderer";

	public enum PropertyKeys {

		widgetVar
		,sticky
		,life
		,escape
		,severity
		,keepAlive;

		String toString;

		PropertyKeys(String toString) {
			this.toString = toString;
		}

		PropertyKeys() {}

		public String toString() {
			return ((this.toString != null) ? this.toString : super.toString());
}
	}

	public Growl() {
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

	public boolean isSticky() {
		return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.sticky, false);
	}
	public void setSticky(boolean _sticky) {
		getStateHelper().put(PropertyKeys.sticky, _sticky);
	}

	public int getLife() {
		return (java.lang.Integer) getStateHelper().eval(PropertyKeys.life, 6000);
	}
	public void setLife(int _life) {
		getStateHelper().put(PropertyKeys.life, _life);
	}

	public boolean isEscape() {
		return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.escape, true);
	}
	public void setEscape(boolean _escape) {
		getStateHelper().put(PropertyKeys.escape, _escape);
	}

	public java.lang.String getSeverity() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.severity, null);
	}
	public void setSeverity(java.lang.String _severity) {
		getStateHelper().put(PropertyKeys.severity, _severity);
	}

	public boolean isKeepAlive() {
		return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.keepAlive, false);
	}
	public void setKeepAlive(boolean _keepAlive) {
		getStateHelper().put(PropertyKeys.keepAlive, _keepAlive);
	}

	public String resolveWidgetVar() {
		return ComponentUtils.resolveWidgetVar(getFacesContext(), this);
	}
}