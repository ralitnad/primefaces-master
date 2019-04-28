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
package org.primefaces.component.panelmenu;

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
public class PanelMenu extends AbstractMenu implements org.primefaces.component.api.Widget {


	public static final String COMPONENT_TYPE = "org.primefaces.component.PanelMenu";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";
	public static final String DEFAULT_RENDERER = "org.primefaces.component.PanelMenuRenderer";

	public enum PropertyKeys {

		widgetVar
		,model
		,style
		,styleClass
		,stateful;

		String toString;

		PropertyKeys(String toString) {
			this.toString = toString;
		}

		PropertyKeys() {}

		public String toString() {
			return ((this.toString != null) ? this.toString : super.toString());
}
	}

	public PanelMenu() {
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

	public boolean isStateful() {
		return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.stateful, true);
	}
	public void setStateful(boolean _stateful) {
		getStateHelper().put(PropertyKeys.stateful, _stateful);
	}


    public final static String CONTAINER_CLASS = "ui-panelmenu ui-widget";
    public final static String INACTIVE_HEADER_CLASS = "ui-widget ui-panelmenu-header ui-state-default ui-corner-all";
    public final static String ACTIVE_HEADER_CLASS = "ui-widget ui-panelmenu-header ui-state-default ui-state-active ui-corner-top";
    public final static String INACTIVE_TAB_HEADER_ICON_CLASS = "ui-icon ui-icon-triangle-1-e";
    public final static String ACTIVE_TAB_HEADER_ICON_CLASS = "ui-icon ui-icon-triangle-1-s";
    public final static String INACTIVE_ROOT_SUBMENU_CONTENT = "ui-panelmenu-content ui-widget-content ui-helper-hidden";
    public final static String ACTIVE_ROOT_SUBMENU_CONTENT = "ui-panelmenu-content ui-widget-content";
    public final static String MENUITEM_CLASS = "ui-menuitem ui-widget ui-corner-all";
    public final static String DESCENDANT_SUBMENU_CLASS = "ui-widget ui-menuitem ui-corner-all ui-menu-parent";
    public final static String DESCENDANT_SUBMENU_EXPANDED_ICON_CLASS = "ui-panelmenu-icon ui-icon ui-icon-triangle-1-s";
    public final static String DESCENDANT_SUBMENU_COLLAPSED_ICON_CLASS = "ui-panelmenu-icon ui-icon ui-icon-triangle-1-e";
    public static final String DESCENDANT_SUBMENU_EXPANDED_LIST_CLASS = "ui-menu-list ui-helper-reset";
    public static final String DESCENDANT_SUBMENU_COLLAPSED_LIST_CLASS = "ui-menu-list ui-helper-reset ui-helper-hidden";
    public final static String PANEL_CLASS = "ui-panelmenu-panel";
    public final static String MENUITEM_LINK_WITH_ICON_CLASS = "ui-menuitem-link ui-menuitem-link-hasicon ui-corner-all";

	public String resolveWidgetVar() {
		return ComponentUtils.resolveWidgetVar(getFacesContext(), this);
	}
}