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
package org.primefaces.component.keyfilter;

import javax.faces.component.UIComponentBase;
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
	@ResourceDependency(library="primefaces", name="keyfilter/keyfilter.js")
})
public class KeyFilter extends UIComponentBase implements org.primefaces.component.api.Widget {


	public static final String COMPONENT_TYPE = "org.primefaces.component.KeyFilter";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";
	public static final String DEFAULT_RENDERER = "org.primefaces.component.KeyFilterRenderer";

	public enum PropertyKeys {

		widgetVar
		,forValue("for")
		,regEx
		,inputRegEx
		,mask
		,testFunction
		,preventPaste;

		String toString;

		PropertyKeys(String toString) {
			this.toString = toString;
		}

		PropertyKeys() {}

		public String toString() {
			return ((this.toString != null) ? this.toString : super.toString());
}
	}

	public KeyFilter() {
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

	public java.lang.String getFor() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.forValue, null);
	}
	public void setFor(java.lang.String _for) {
		getStateHelper().put(PropertyKeys.forValue, _for);
	}

	public java.lang.String getRegEx() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.regEx, null);
	}
	public void setRegEx(java.lang.String _regEx) {
		getStateHelper().put(PropertyKeys.regEx, _regEx);
	}

	public java.lang.String getInputRegEx() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.inputRegEx, null);
	}
	public void setInputRegEx(java.lang.String _inputRegEx) {
		getStateHelper().put(PropertyKeys.inputRegEx, _inputRegEx);
	}

	public java.lang.String getMask() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.mask, null);
	}
	public void setMask(java.lang.String _mask) {
		getStateHelper().put(PropertyKeys.mask, _mask);
	}

	public java.lang.String getTestFunction() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.testFunction, null);
	}
	public void setTestFunction(java.lang.String _testFunction) {
		getStateHelper().put(PropertyKeys.testFunction, _testFunction);
	}

	public boolean isPreventPaste() {
		return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.preventPaste, true);
	}
	public void setPreventPaste(boolean _preventPaste) {
		getStateHelper().put(PropertyKeys.preventPaste, _preventPaste);
	}

	public String resolveWidgetVar() {
		return ComponentUtils.resolveWidgetVar(getFacesContext(), this);
	}
}