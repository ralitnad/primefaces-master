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
package org.primefaces.component.fieldset;

import javax.faces.component.UIPanel;
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
import javax.faces.component.UIComponent;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import org.primefaces.model.Visibility;
import org.primefaces.event.ToggleEvent;
import org.primefaces.util.Constants;
import javax.faces.event.AjaxBehaviorEvent;
import javax.faces.event.FacesEvent;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
import javax.faces.event.PhaseId;
import javax.faces.event.BehaviorEvent;

@ResourceDependencies({
	@ResourceDependency(library="primefaces", name="components.css"),
	@ResourceDependency(library="primefaces", name="jquery/jquery.js"),
	@ResourceDependency(library="primefaces", name="jquery/jquery-plugins.js"),
	@ResourceDependency(library="primefaces", name="core.js"),
	@ResourceDependency(library="primefaces", name="components.js")
})
public class Fieldset extends UIPanel implements org.primefaces.component.api.Widget,javax.faces.component.behavior.ClientBehaviorHolder,org.primefaces.component.api.PrimeClientBehaviorHolder {


	public static final String COMPONENT_TYPE = "org.primefaces.component.Fieldset";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";
	public static final String DEFAULT_RENDERER = "org.primefaces.component.FieldsetRenderer";

	public enum PropertyKeys {

		widgetVar
		,legend
		,style
		,styleClass
		,toggleable
		,toggleSpeed
		,collapsed
		,tabindex
		,escape
		,title;

		String toString;

		PropertyKeys(String toString) {
			this.toString = toString;
		}

		PropertyKeys() {}

		public String toString() {
			return ((this.toString != null) ? this.toString : super.toString());
}
	}

	public Fieldset() {
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

	public java.lang.String getLegend() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.legend, null);
	}
	public void setLegend(java.lang.String _legend) {
		getStateHelper().put(PropertyKeys.legend, _legend);
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

	public boolean isToggleable() {
		return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.toggleable, false);
	}
	public void setToggleable(boolean _toggleable) {
		getStateHelper().put(PropertyKeys.toggleable, _toggleable);
	}

	public int getToggleSpeed() {
		return (java.lang.Integer) getStateHelper().eval(PropertyKeys.toggleSpeed, 500);
	}
	public void setToggleSpeed(int _toggleSpeed) {
		getStateHelper().put(PropertyKeys.toggleSpeed, _toggleSpeed);
	}

	public boolean isCollapsed() {
		return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.collapsed, false);
	}
	public void setCollapsed(boolean _collapsed) {
		getStateHelper().put(PropertyKeys.collapsed, _collapsed);
	}

	public java.lang.String getTabindex() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.tabindex, "0");
	}
	public void setTabindex(java.lang.String _tabindex) {
		getStateHelper().put(PropertyKeys.tabindex, _tabindex);
	}

	public boolean isEscape() {
		return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.escape, true);
	}
	public void setEscape(boolean _escape) {
		getStateHelper().put(PropertyKeys.escape, _escape);
	}

	public java.lang.String getTitle() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.title, null);
	}
	public void setTitle(java.lang.String _title) {
		getStateHelper().put(PropertyKeys.title, _title);
	}


    public static final String FIELDSET_CLASS = "ui-fieldset ui-widget ui-widget-content ui-corner-all ui-hidden-container";
    public static final String TOGGLEABLE_FIELDSET_CLASS = FIELDSET_CLASS + " ui-fieldset-toggleable";
    public static final String CONTENT_CLASS = "ui-fieldset-content";
    public static final String LEGEND_CLASS = "ui-fieldset-legend ui-corner-all ui-state-default";
    public static final String TOGGLER_MINUS_CLASS = "ui-fieldset-toggler ui-icon ui-icon-minusthick";
    public static final String TOGGLER_PLUS_CLASS = "ui-fieldset-toggler ui-icon ui-icon-plusthick";

    private static final Map<String, Class<? extends BehaviorEvent>> BEHAVIOR_EVENT_MAPPING = Collections.unmodifiableMap(new HashMap<String, Class<? extends BehaviorEvent>>() {{
        put("toggle", ToggleEvent.class);
    }});

    private static final Collection<String> EVENT_NAMES = BEHAVIOR_EVENT_MAPPING.keySet();

    @Override
    public void queueEvent(FacesEvent event) {
        FacesContext context = getFacesContext();
        
        if(ComponentUtils.isRequestSource(this, context)) {
            Map<String,String> params = context.getExternalContext().getRequestParameterMap();
            String eventName = params.get(Constants.RequestParams.PARTIAL_BEHAVIOR_EVENT_PARAM);
            AjaxBehaviorEvent behaviorEvent = (AjaxBehaviorEvent) event;
            
            if(eventName.equals("toggle")) {
                Visibility visibility = this.isCollapsed() ? Visibility.HIDDEN : Visibility.VISIBLE;

                super.queueEvent(new ToggleEvent(this, behaviorEvent.getBehavior(), visibility));
            }
        }
        else {
            super.queueEvent(event);
        }
    }

    @Override
    public Collection<String> getEventNames() {
        return EVENT_NAMES;
    }

    @Override
    public Map<String, Class<? extends BehaviorEvent>> getBehaviorEventMapping() {
         return BEHAVIOR_EVENT_MAPPING;
    }

    @Override
    public void processDecodes(FacesContext context) {
        if(ComponentUtils.isRequestSource(this, context)) {
            this.decode(context);
        }
        else {
            super.processDecodes(context);
        }
    }

    @Override
    public void processValidators(FacesContext context) {
        if(!ComponentUtils.isRequestSource(this, context)) {
            super.processValidators(context);
        }
    }

    @Override
    public void processUpdates(FacesContext context) {
        if(!ComponentUtils.isRequestSource(this, context)) {
            super.processUpdates(context);
        }
    }
	public String resolveWidgetVar() {
		return ComponentUtils.resolveWidgetVar(getFacesContext(), this);
	}
}