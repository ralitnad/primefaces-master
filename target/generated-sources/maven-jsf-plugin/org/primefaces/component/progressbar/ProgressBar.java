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
package org.primefaces.component.progressbar;

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
import javax.faces.component.UIComponent;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import org.primefaces.util.Constants;
import javax.faces.event.AjaxBehaviorEvent;
import javax.faces.event.FacesEvent;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
import javax.faces.event.BehaviorEvent;
import javax.faces.event.PhaseId;

@ResourceDependencies({
	@ResourceDependency(library="primefaces", name="components.css"),
	@ResourceDependency(library="primefaces", name="jquery/jquery.js"),
	@ResourceDependency(library="primefaces", name="core.js"),
	@ResourceDependency(library="primefaces", name="components.js")
})
public class ProgressBar extends UIComponentBase implements org.primefaces.component.api.Widget,javax.faces.component.behavior.ClientBehaviorHolder,org.primefaces.component.api.PrimeClientBehaviorHolder {


	public static final String COMPONENT_TYPE = "org.primefaces.component.ProgressBar";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";
	public static final String DEFAULT_RENDERER = "org.primefaces.component.ProgressBarRenderer";

	public enum PropertyKeys {

		widgetVar
		,value
		,disabled
		,ajax
		,interval
		,style
		,styleClass
		,labelTemplate
		,displayOnly
		,global
		,mode;

		String toString;

		PropertyKeys(String toString) {
			this.toString = toString;
		}

		PropertyKeys() {}

		public String toString() {
			return ((this.toString != null) ? this.toString : super.toString());
}
	}

	public ProgressBar() {
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

	public int getValue() {
		return (java.lang.Integer) getStateHelper().eval(PropertyKeys.value, 0);
	}
	public void setValue(int _value) {
		getStateHelper().put(PropertyKeys.value, _value);
	}

	public boolean isDisabled() {
		return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.disabled, false);
	}
	public void setDisabled(boolean _disabled) {
		getStateHelper().put(PropertyKeys.disabled, _disabled);
	}

	public boolean isAjax() {
		return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.ajax, false);
	}
	public void setAjax(boolean _ajax) {
		getStateHelper().put(PropertyKeys.ajax, _ajax);
	}

	public int getInterval() {
		return (java.lang.Integer) getStateHelper().eval(PropertyKeys.interval, 3000);
	}
	public void setInterval(int _interval) {
		getStateHelper().put(PropertyKeys.interval, _interval);
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

	public java.lang.String getLabelTemplate() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.labelTemplate, null);
	}
	public void setLabelTemplate(java.lang.String _labelTemplate) {
		getStateHelper().put(PropertyKeys.labelTemplate, _labelTemplate);
	}

	public boolean isDisplayOnly() {
		return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.displayOnly, false);
	}
	public void setDisplayOnly(boolean _displayOnly) {
		getStateHelper().put(PropertyKeys.displayOnly, _displayOnly);
	}

	public boolean isGlobal() {
		return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.global, true);
	}
	public void setGlobal(boolean _global) {
		getStateHelper().put(PropertyKeys.global, _global);
	}

	public java.lang.String getMode() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.mode, "determinate");
	}
	public void setMode(java.lang.String _mode) {
		getStateHelper().put(PropertyKeys.mode, _mode);
	}


    public final static String CONTAINER_CLASS = "ui-progressbar ui-widget ui-widget-content ui-corner-all";
    public final static String DETERMINATE_CLASS = "ui-progressbar-determinate";
    public final static String INDETERMINATE_CLASS = "ui-progressbar-indeterminate";
    public final static String VALUE_CLASS = "ui-progressbar-value ui-widget-header ui-corner-all";
    public final static String LABEL_CLASS = "ui-progressbar-label";

    private final static String DEFAULT_EVENT = "complete";

    private static final Map<String, Class<? extends BehaviorEvent>> BEHAVIOR_EVENT_MAPPING = Collections.unmodifiableMap(new HashMap<String, Class<? extends BehaviorEvent>>() {{
        put("complete", null);
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
        
        if(ComponentUtils.isRequestSource(this, context)) {
            AjaxBehaviorEvent behaviorEvent = (AjaxBehaviorEvent) event;
            
            behaviorEvent.setPhaseId(PhaseId.APPLY_REQUEST_VALUES);

            super.queueEvent(behaviorEvent);
        }
        else {
            super.queueEvent(event);
        }
    }

	public String resolveWidgetVar() {
		return ComponentUtils.resolveWidgetVar(getFacesContext(), this);
	}
}