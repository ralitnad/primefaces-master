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
package org.primefaces.component.chips;

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
import java.util.Arrays;
import java.util.Map;
import java.util.Collection;
import java.util.Collections;
import org.primefaces.util.ComponentUtils;
import org.primefaces.util.Constants;
import org.primefaces.event.SelectEvent;
import org.primefaces.event.UnselectEvent;
import javax.faces.event.AjaxBehaviorEvent;
import javax.faces.event.FacesEvent;
import javax.faces.convert.Converter;
import javax.faces.component.behavior.Behavior;

@ResourceDependencies({
	@ResourceDependency(library="primefaces", name="components.css"),
	@ResourceDependency(library="primefaces", name="jquery/jquery.js"),
	@ResourceDependency(library="primefaces", name="core.js"),
	@ResourceDependency(library="primefaces", name="components.js")
})
public class Chips extends HtmlInputText implements org.primefaces.component.api.Widget,org.primefaces.component.api.InputHolder,org.primefaces.component.api.MixedClientBehaviorHolder {


	public static final String COMPONENT_TYPE = "org.primefaces.component.Chips";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";
	public static final String DEFAULT_RENDERER = "org.primefaces.component.ChipsRenderer";

	public enum PropertyKeys {

		placeholder
		,widgetVar
		,max
		,inputStyle
		,inputStyleClass;

		String toString;

		PropertyKeys(String toString) {
			this.toString = toString;
		}

		PropertyKeys() {}

		public String toString() {
			return ((this.toString != null) ? this.toString : super.toString());
}
	}

	public Chips() {
		setRendererType(DEFAULT_RENDERER);
	}

	public String getFamily() {
		return COMPONENT_FAMILY;
	}

	public java.lang.String getPlaceholder() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.placeholder, null);
	}
	public void setPlaceholder(java.lang.String _placeholder) {
		getStateHelper().put(PropertyKeys.placeholder, _placeholder);
	}

	public java.lang.String getWidgetVar() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.widgetVar, null);
	}
	public void setWidgetVar(java.lang.String _widgetVar) {
		getStateHelper().put(PropertyKeys.widgetVar, _widgetVar);
	}

	public int getMax() {
		return (java.lang.Integer) getStateHelper().eval(PropertyKeys.max, java.lang.Integer.MAX_VALUE);
	}
	public void setMax(int _max) {
		getStateHelper().put(PropertyKeys.max, _max);
	}

	public java.lang.String getInputStyle() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.inputStyle, null);
	}
	public void setInputStyle(java.lang.String _inputStyle) {
		getStateHelper().put(PropertyKeys.inputStyle, _inputStyle);
	}

	public java.lang.String getInputStyleClass() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.inputStyleClass, null);
	}
	public void setInputStyleClass(java.lang.String _inputStyleClass) {
		getStateHelper().put(PropertyKeys.inputStyleClass, _inputStyleClass);
	}


    private static final Collection<String> EVENT_NAMES = Collections.unmodifiableCollection(Arrays.asList("blur","change","valueChange","click","dblclick","focus","keydown","keypress","keyup","mousedown","mousemove","mouseout","mouseover","mouseup","select", "itemSelect", "itemUnselect"));
    private static final Collection<String> UNOBSTRUSIVE_EVENT_NAMES = Collections.unmodifiableCollection(Arrays.asList("itemSelect", "itemUnselect"));

    public final static String STYLE_CLASS = "ui-chips ui-widget";
    public final static String CONTAINER_CLASS = "ui-chips-container ui-inputfield ui-state-default ui-corner-all";
    public final static String TOKEN_DISPLAY_CLASS = "ui-chips-token ui-state-active ui-corner-all";
    public final static String TOKEN_LABEL_CLASS = "ui-chips-token-label";
    public final static String TOKEN_CLOSE_ICON_CLASS = "ui-chips-token-icon ui-icon ui-icon-close";
    public final static String TOKEN_INPUT_CLASS = "ui-chips-input-token";

    public String getInputClientId() {
        return this.getClientId(getFacesContext()) + "_input";
    }

    public String getValidatableInputClientId() {
        return this.getInputClientId();
    }

    public void setLabelledBy(String labelledBy) {
        getStateHelper().put("labelledby", labelledBy);
    }

    public String getLabelledBy() {
        return (String) getStateHelper().get("labelledby");
    }
	
    @Override
    public Collection<String> getEventNames() {
        return EVENT_NAMES;
    }

    @Override
    public Collection<String> getUnobstrusiveEventNames() {
        return UNOBSTRUSIVE_EVENT_NAMES;
    }

    @Override
    public void queueEvent(FacesEvent event) {
        FacesContext context = getFacesContext();
        Map<String,String> params = context.getExternalContext().getRequestParameterMap();
        String eventName = params.get(Constants.RequestParams.PARTIAL_BEHAVIOR_EVENT_PARAM);

        if(eventName != null && event instanceof AjaxBehaviorEvent) {
            AjaxBehaviorEvent ajaxBehaviorEvent = (AjaxBehaviorEvent) event;

            if(eventName.equals("itemSelect")) {
                Object selectedItemValue = convertValue(context, params.get(this.getClientId(context) + "_itemSelect"));
                SelectEvent selectEvent = new SelectEvent(this, (Behavior) ajaxBehaviorEvent.getBehavior(), selectedItemValue);
                selectEvent.setPhaseId(ajaxBehaviorEvent.getPhaseId());
                super.queueEvent(selectEvent);
            }
            else if(eventName.equals("itemUnselect")) {
                Object unselectedItemValue = convertValue(context, params.get(this.getClientId(context) + "_itemUnselect"));
                UnselectEvent unselectEvent = new UnselectEvent(this, (Behavior) ajaxBehaviorEvent.getBehavior(), unselectedItemValue);
                unselectEvent.setPhaseId(ajaxBehaviorEvent.getPhaseId());
                super.queueEvent(unselectEvent);
            }
            else {
                //e.g. blur, focus, change
                super.queueEvent(event);
            }
        }
        else {
            //e.g. valueChange
            super.queueEvent(event);
        }
    }
	
	private Object convertValue(FacesContext context, String submittedItemValue) {
        Converter converter = ComponentUtils.getConverter(context, this);

        if(converter == null)
            return submittedItemValue;
        else 
            return converter.getAsObject(context, this, submittedItemValue);
    }
	public String resolveWidgetVar() {
		return ComponentUtils.resolveWidgetVar(getFacesContext(), this);
	}
}