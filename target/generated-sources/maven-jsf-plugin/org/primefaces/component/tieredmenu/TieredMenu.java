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
package org.primefaces.component.tieredmenu;

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
public class TieredMenu extends AbstractMenu implements org.primefaces.component.api.Widget,org.primefaces.component.menu.OverlayMenu {


	public static final String COMPONENT_TYPE = "org.primefaces.component.TieredMenu";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";
	public static final String DEFAULT_RENDERER = "org.primefaces.component.TieredMenuRenderer";

	public enum PropertyKeys {

		widgetVar
		,model
		,style
		,styleClass
		,autoDisplay
		,trigger
		,my
		,at
		,overlay
		,triggerEvent
		,toggleEvent;

		String toString;

		PropertyKeys(String toString) {
			this.toString = toString;
		}

		PropertyKeys() {}

		public String toString() {
			return ((this.toString != null) ? this.toString : super.toString());
}
	}

	public TieredMenu() {
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

	public java.lang.String getTrigger() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.trigger, null);
	}
	public void setTrigger(java.lang.String _trigger) {
		getStateHelper().put(PropertyKeys.trigger, _trigger);
	}

	public java.lang.String getMy() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.my, null);
	}
	public void setMy(java.lang.String _my) {
		getStateHelper().put(PropertyKeys.my, _my);
	}

	public java.lang.String getAt() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.at, null);
	}
	public void setAt(java.lang.String _at) {
		getStateHelper().put(PropertyKeys.at, _at);
	}

	public boolean isOverlay() {
		return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.overlay, false);
	}
	public void setOverlay(boolean _overlay) {
		getStateHelper().put(PropertyKeys.overlay, _overlay);
	}

	public java.lang.String getTriggerEvent() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.triggerEvent, "click");
	}
	public void setTriggerEvent(java.lang.String _triggerEvent) {
		getStateHelper().put(PropertyKeys.triggerEvent, _triggerEvent);
	}

	public java.lang.String getToggleEvent() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.toggleEvent, null);
	}
	public void setToggleEvent(java.lang.String _toggleEvent) {
		getStateHelper().put(PropertyKeys.toggleEvent, _toggleEvent);
	}


    public static final String STATIC_CONTAINER_CLASS = "ui-menu ui-tieredmenu ui-widget ui-widget-content ui-corner-all ui-helper-clearfix";
    public static final String DYNAMIC_CONTAINER_CLASS = "ui-menu ui-tieredmenu ui-menu-dynamic ui-widget ui-widget-content ui-corner-all ui-helper-clearfix ui-shadow";
	public String resolveWidgetVar() {
		return ComponentUtils.resolveWidgetVar(getFacesContext(), this);
	}
}