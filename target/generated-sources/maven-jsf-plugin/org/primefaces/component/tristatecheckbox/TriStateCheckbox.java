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
package org.primefaces.component.tristatecheckbox;

import javax.faces.component.html.HtmlInputText;
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
public class TriStateCheckbox extends HtmlInputText implements org.primefaces.component.api.Widget {


	public static final String COMPONENT_TYPE = "org.primefaces.component.TriStateCheckbox";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";
	public static final String DEFAULT_RENDERER = "org.primefaces.component.TriStateCheckboxRenderer";

	public enum PropertyKeys {

		widgetVar
		,stateOneIcon
		,stateTwoIcon
		,stateThreeIcon
		,itemLabel
		,stateOneTitle
		,stateTwoTitle
		,stateThreeTitle;

		String toString;

		PropertyKeys(String toString) {
			this.toString = toString;
		}

		PropertyKeys() {}

		public String toString() {
			return ((this.toString != null) ? this.toString : super.toString());
}
	}

	public TriStateCheckbox() {
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

	public java.lang.String getStateOneIcon() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.stateOneIcon, null);
	}
	public void setStateOneIcon(java.lang.String _stateOneIcon) {
		getStateHelper().put(PropertyKeys.stateOneIcon, _stateOneIcon);
	}

	public java.lang.String getStateTwoIcon() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.stateTwoIcon, null);
	}
	public void setStateTwoIcon(java.lang.String _stateTwoIcon) {
		getStateHelper().put(PropertyKeys.stateTwoIcon, _stateTwoIcon);
	}

	public java.lang.String getStateThreeIcon() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.stateThreeIcon, null);
	}
	public void setStateThreeIcon(java.lang.String _stateThreeIcon) {
		getStateHelper().put(PropertyKeys.stateThreeIcon, _stateThreeIcon);
	}

	public java.lang.String getItemLabel() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.itemLabel, null);
	}
	public void setItemLabel(java.lang.String _itemLabel) {
		getStateHelper().put(PropertyKeys.itemLabel, _itemLabel);
	}

	public java.lang.String getStateOneTitle() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.stateOneTitle, null);
	}
	public void setStateOneTitle(java.lang.String _stateOneTitle) {
		getStateHelper().put(PropertyKeys.stateOneTitle, _stateOneTitle);
	}

	public java.lang.String getStateTwoTitle() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.stateTwoTitle, null);
	}
	public void setStateTwoTitle(java.lang.String _stateTwoTitle) {
		getStateHelper().put(PropertyKeys.stateTwoTitle, _stateTwoTitle);
	}

	public java.lang.String getStateThreeTitle() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.stateThreeTitle, null);
	}
	public void setStateThreeTitle(java.lang.String _stateThreeTitle) {
		getStateHelper().put(PropertyKeys.stateThreeTitle, _stateThreeTitle);
	}

    public final static String UI_ICON = "ui-icon ";

    @Override
    public String getDefaultEventName() {
        return "valueChange";   
    }

	public String resolveWidgetVar() {
		return ComponentUtils.resolveWidgetVar(getFacesContext(), this);
	}
}