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
package org.primefaces.component.megamenu;

import org.primefaces.component.menu.AbstractMenu;
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
public class MegaMenu extends AbstractMenu implements org.primefaces.component.api.Widget {


	public static final String COMPONENT_TYPE = "org.primefaces.component.MegaMenu";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";
	public static final String DEFAULT_RENDERER = "org.primefaces.component.MegaMenuRenderer";

	public enum PropertyKeys {

		widgetVar
		,model
		,style
		,styleClass
		,autoDisplay
		,activeIndex
		,orientation;

		String toString;

		PropertyKeys(String toString) {
			this.toString = toString;
		}

		PropertyKeys() {}

		public String toString() {
			return ((this.toString != null) ? this.toString : super.toString());
}
	}

	public MegaMenu() {
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

	public org.primefaces.model.menu.MenuModel getModel() {
		return (org.primefaces.model.menu.MenuModel) getStateHelper().eval(PropertyKeys.model, null);
	}
	public void setModel(org.primefaces.model.menu.MenuModel _model) {
		getStateHelper().put(PropertyKeys.model, _model);
	}

	public java.lang.String getStyle() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.style, null);
	}
	public void setStyle(java.lang.String _style) {
		getStateHelper().put(PropertyKeys.style, _style);
	}

	public java.lang.String getStyleClass() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.styleClass, null);
	}
	public void setStyleClass(java.lang.String _styleClass) {
		getStateHelper().put(PropertyKeys.styleClass, _styleClass);
	}

	public boolean isAutoDisplay() {
		return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.autoDisplay, true);
	}
	public void setAutoDisplay(boolean _autoDisplay) {
		getStateHelper().put(PropertyKeys.autoDisplay, _autoDisplay);
	}

	public int getActiveIndex() {
		return (java.lang.Integer) getStateHelper().eval(PropertyKeys.activeIndex, java.lang.Integer.MIN_VALUE);
	}
	public void setActiveIndex(int _activeIndex) {
		getStateHelper().put(PropertyKeys.activeIndex, _activeIndex);
	}

	public java.lang.String getOrientation() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.orientation, "horizontal");
	}
	public void setOrientation(java.lang.String _orientation) {
		getStateHelper().put(PropertyKeys.orientation, _orientation);
	}

    public static final String CONTAINER_CLASS = "ui-menu ui-menubar ui-megamenu ui-widget ui-widget-content ui-corner-all ui-helper-clearfix";
    public static final String VERTICAL_CLASS = "ui-megamenu-vertical";
	public String resolveWidgetVar() {
		return ComponentUtils.resolveWidgetVar(getFacesContext(), this);
	}
}