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
package org.primefaces.component.selectcheckboxmenu;

import javax.faces.component.html.HtmlSelectManyCheckbox;
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
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import javax.faces.event.FacesEvent;
import javax.faces.event.AjaxBehaviorEvent;
import org.primefaces.event.ToggleSelectEvent;
import org.primefaces.util.Constants;
import java.util.HashMap;
import javax.faces.event.BehaviorEvent;

@ResourceDependencies({
	@ResourceDependency(library="primefaces", name="components.css"),
	@ResourceDependency(library="primefaces", name="jquery/jquery.js"),
	@ResourceDependency(library="primefaces", name="jquery/jquery-plugins.js"),
	@ResourceDependency(library="primefaces", name="core.js"),
	@ResourceDependency(library="primefaces", name="components.js")
})
public class SelectCheckboxMenu extends HtmlSelectManyCheckbox implements org.primefaces.component.api.Widget,org.primefaces.component.api.PrimeClientBehaviorHolder {


	public static final String COMPONENT_TYPE = "org.primefaces.component.SelectCheckboxMenu";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";
	public static final String DEFAULT_RENDERER = "org.primefaces.component.SelectCheckboxMenuRenderer";

	public enum PropertyKeys {

		widgetVar
		,scrollHeight
		,onShow
		,onHide
		,filter
		,filterMatchMode
		,filterFunction
		,caseSensitive
		,panelStyle
		,panelStyleClass
		,appendTo
		,tabindex
		,title
		,showHeader
		,updateLabel
		,multiple
		,dynamic;

		String toString;

		PropertyKeys(String toString) {
			this.toString = toString;
		}

		PropertyKeys() {}

		public String toString() {
			return ((this.toString != null) ? this.toString : super.toString());
}
	}

	public SelectCheckboxMenu() {
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

	public int getScrollHeight() {
		return (java.lang.Integer) getStateHelper().eval(PropertyKeys.scrollHeight, java.lang.Integer.MAX_VALUE);
	}
	public void setScrollHeight(int _scrollHeight) {
		getStateHelper().put(PropertyKeys.scrollHeight, _scrollHeight);
	}

	public java.lang.String getOnShow() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.onShow, null);
	}
	public void setOnShow(java.lang.String _onShow) {
		getStateHelper().put(PropertyKeys.onShow, _onShow);
	}

	public java.lang.String getOnHide() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.onHide, null);
	}
	public void setOnHide(java.lang.String _onHide) {
		getStateHelper().put(PropertyKeys.onHide, _onHide);
	}

	public boolean isFilter() {
		return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.filter, false);
	}
	public void setFilter(boolean _filter) {
		getStateHelper().put(PropertyKeys.filter, _filter);
	}

	public java.lang.String getFilterMatchMode() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.filterMatchMode, null);
	}
	public void setFilterMatchMode(java.lang.String _filterMatchMode) {
		getStateHelper().put(PropertyKeys.filterMatchMode, _filterMatchMode);
	}

	public java.lang.String getFilterFunction() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.filterFunction, null);
	}
	public void setFilterFunction(java.lang.String _filterFunction) {
		getStateHelper().put(PropertyKeys.filterFunction, _filterFunction);
	}

	public boolean isCaseSensitive() {
		return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.caseSensitive, false);
	}
	public void setCaseSensitive(boolean _caseSensitive) {
		getStateHelper().put(PropertyKeys.caseSensitive, _caseSensitive);
	}

	public java.lang.String getPanelStyle() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.panelStyle, null);
	}
	public void setPanelStyle(java.lang.String _panelStyle) {
		getStateHelper().put(PropertyKeys.panelStyle, _panelStyle);
	}

	public java.lang.String getPanelStyleClass() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.panelStyleClass, null);
	}
	public void setPanelStyleClass(java.lang.String _panelStyleClass) {
		getStateHelper().put(PropertyKeys.panelStyleClass, _panelStyleClass);
	}

	public java.lang.String getAppendTo() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.appendTo, "@(body)");
	}
	public void setAppendTo(java.lang.String _appendTo) {
		getStateHelper().put(PropertyKeys.appendTo, _appendTo);
	}

	public java.lang.String getTabindex() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.tabindex, null);
	}
	public void setTabindex(java.lang.String _tabindex) {
		getStateHelper().put(PropertyKeys.tabindex, _tabindex);
	}

	public java.lang.String getTitle() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.title, null);
	}
	public void setTitle(java.lang.String _title) {
		getStateHelper().put(PropertyKeys.title, _title);
	}

	public boolean isShowHeader() {
		return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.showHeader, true);
	}
	public void setShowHeader(boolean _showHeader) {
		getStateHelper().put(PropertyKeys.showHeader, _showHeader);
	}

	public boolean isUpdateLabel() {
		return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.updateLabel, false);
	}
	public void setUpdateLabel(boolean _updateLabel) {
		getStateHelper().put(PropertyKeys.updateLabel, _updateLabel);
	}

	public boolean isMultiple() {
		return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.multiple, false);
	}
	public void setMultiple(boolean _multiple) {
		getStateHelper().put(PropertyKeys.multiple, _multiple);
	}

	public boolean isDynamic() {
		return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.dynamic, false);
	}
	public void setDynamic(boolean _dynamic) {
		getStateHelper().put(PropertyKeys.dynamic, _dynamic);
	}


    public final static String STYLE_CLASS = "ui-selectcheckboxmenu ui-widget ui-state-default ui-corner-all";
    public final static String LABEL_CONTAINER_CLASS = "ui-selectcheckboxmenu-label-container";
    public final static String LABEL_CLASS = "ui-selectcheckboxmenu-label ui-corner-all";
    public final static String TRIGGER_CLASS = "ui-selectcheckboxmenu-trigger ui-state-default ui-corner-right";
    public final static String PANEL_CLASS = "ui-selectcheckboxmenu-panel ui-widget-content ui-corner-all ui-helper-hidden";
    public final static String LIST_CLASS = "ui-selectcheckboxmenu-items ui-selectcheckboxmenu-list ui-widget-content ui-widget ui-corner-all ui-helper-reset";
    public final static String ITEM_CLASS = "ui-selectcheckboxmenu-item ui-selectcheckboxmenu-list-item ui-corner-all ui-helper-clearfix";
    public final static String MULTIPLE_CLASS = "ui-selectcheckboxmenu-multiple";
    public final static String MULTIPLE_CONTAINER_CLASS = "ui-selectcheckboxmenu-multiple-container ui-widget ui-inputfield ui-state-default ui-corner-all";
    public final static String TOKEN_DISPLAY_CLASS = "ui-selectcheckboxmenu-token ui-state-active ui-corner-all";
    public final static String TOKEN_LABEL_CLASS = "ui-selectcheckboxmenu-token-label";
    public final static String TOKEN_ICON_CLASS = "ui-selectcheckboxmenu-token-icon ui-icon ui-icon-close";

    private final static String DEFAULT_EVENT = "change";

    private static final Map<String, Class<? extends BehaviorEvent>> BEHAVIOR_EVENT_MAPPING = Collections.unmodifiableMap(new HashMap<String, Class<? extends BehaviorEvent>>() {{
        put("change", null);
        put("toggleSelect", ToggleSelectEvent.class);
    }});

    private static final Collection<String> EVENT_NAMES = BEHAVIOR_EVENT_MAPPING.keySet();

    @Override
    public Map<String, Class<? extends BehaviorEvent>> getBehaviorEventMapping() {
         return BEHAVIOR_EVENT_MAPPING;
    }

    @Override
    public Collection<String> getEventNames() {
        return EVENT_NAMES;
    }

    @Override
    public String getDefaultEventName() {
        return DEFAULT_EVENT;
    }

    @Override
    public void queueEvent(FacesEvent event) {
        FacesContext context = getFacesContext();
        String eventName = context.getExternalContext().getRequestParameterMap().get(Constants.RequestParams.PARTIAL_BEHAVIOR_EVENT_PARAM);
        
        if(event instanceof AjaxBehaviorEvent && eventName.equals("toggleSelect")) {
            Map<String,String> params = context.getExternalContext().getRequestParameterMap();
            String clientId = this.getClientId(context);
            boolean checked = Boolean.valueOf(params.get(clientId + "_checked"));
            ToggleSelectEvent toggleSelectEvent = new ToggleSelectEvent(this, ((AjaxBehaviorEvent) event).getBehavior(), checked);
            toggleSelectEvent.setPhaseId(event.getPhaseId());

            super.queueEvent(toggleSelectEvent);
        }
        else {
            super.queueEvent(event);
        }
    }
	public String resolveWidgetVar() {
		return ComponentUtils.resolveWidgetVar(getFacesContext(), this);
	}
}