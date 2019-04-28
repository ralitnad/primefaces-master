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
package org.primefaces.component.knob;

import javax.faces.component.UIInput;
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
import java.util.HashMap;
import javax.faces.event.BehaviorEvent;

@ResourceDependencies({
	@ResourceDependency(library="primefaces", name="components.css"),
	@ResourceDependency(library="primefaces", name="jquery/jquery.js"),
	@ResourceDependency(library="primefaces", name="jquery/jquery-plugins.js"),
	@ResourceDependency(library="primefaces", name="core.js"),
	@ResourceDependency(library="primefaces", name="components.js"),
	@ResourceDependency(library="primefaces", name="knob/knob.js")
})
public class Knob extends UIInput implements org.primefaces.component.api.Widget,javax.faces.component.behavior.ClientBehaviorHolder,org.primefaces.component.api.PrimeClientBehaviorHolder {


	public static final String COMPONENT_TYPE = "org.primefaces.component.Knob";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";
	public static final String DEFAULT_RENDERER = "org.primefaces.component.KnobRenderer";

	public enum PropertyKeys {

		widgetVar
		,min
		,max
		,step
		,thickness
		,width
		,height
		,foregroundColor
		,backgroundColor
		,colorTheme
		,disabled
		,showLabel
		,cursor
		,labelTemplate
		,onchange
		,lineCap;

		String toString;

		PropertyKeys(String toString) {
			this.toString = toString;
		}

		PropertyKeys() {}

		public String toString() {
			return ((this.toString != null) ? this.toString : super.toString());
}
	}

	public Knob() {
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

	public int getMin() {
		return (java.lang.Integer) getStateHelper().eval(PropertyKeys.min, 0);
	}
	public void setMin(int _min) {
		getStateHelper().put(PropertyKeys.min, _min);
	}

	public int getMax() {
		return (java.lang.Integer) getStateHelper().eval(PropertyKeys.max, 100);
	}
	public void setMax(int _max) {
		getStateHelper().put(PropertyKeys.max, _max);
	}

	public int getStep() {
		return (java.lang.Integer) getStateHelper().eval(PropertyKeys.step, 1);
	}
	public void setStep(int _step) {
		getStateHelper().put(PropertyKeys.step, _step);
	}

	public java.lang.Float getThickness() {
		return (java.lang.Float) getStateHelper().eval(PropertyKeys.thickness, null);
	}
	public void setThickness(java.lang.Float _thickness) {
		getStateHelper().put(PropertyKeys.thickness, _thickness);
	}

	public java.lang.Object getWidth() {
		return (java.lang.Object) getStateHelper().eval(PropertyKeys.width, null);
	}
	public void setWidth(java.lang.Object _width) {
		getStateHelper().put(PropertyKeys.width, _width);
	}

	public java.lang.Object getHeight() {
		return (java.lang.Object) getStateHelper().eval(PropertyKeys.height, null);
	}
	public void setHeight(java.lang.Object _height) {
		getStateHelper().put(PropertyKeys.height, _height);
	}

	public java.lang.Object getForegroundColor() {
		return (java.lang.Object) getStateHelper().eval(PropertyKeys.foregroundColor, null);
	}
	public void setForegroundColor(java.lang.Object _foregroundColor) {
		getStateHelper().put(PropertyKeys.foregroundColor, _foregroundColor);
	}

	public java.lang.Object getBackgroundColor() {
		return (java.lang.Object) getStateHelper().eval(PropertyKeys.backgroundColor, null);
	}
	public void setBackgroundColor(java.lang.Object _backgroundColor) {
		getStateHelper().put(PropertyKeys.backgroundColor, _backgroundColor);
	}

	public java.lang.String getColorTheme() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.colorTheme, null);
	}
	public void setColorTheme(java.lang.String _colorTheme) {
		getStateHelper().put(PropertyKeys.colorTheme, _colorTheme);
	}

	public boolean isDisabled() {
		return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.disabled, false);
	}
	public void setDisabled(boolean _disabled) {
		getStateHelper().put(PropertyKeys.disabled, _disabled);
	}

	public boolean isShowLabel() {
		return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.showLabel, true);
	}
	public void setShowLabel(boolean _showLabel) {
		getStateHelper().put(PropertyKeys.showLabel, _showLabel);
	}

	public boolean isCursor() {
		return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.cursor, false);
	}
	public void setCursor(boolean _cursor) {
		getStateHelper().put(PropertyKeys.cursor, _cursor);
	}

	public java.lang.String getLabelTemplate() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.labelTemplate, "{value}");
	}
	public void setLabelTemplate(java.lang.String _labelTemplate) {
		getStateHelper().put(PropertyKeys.labelTemplate, _labelTemplate);
	}

	public java.lang.String getOnchange() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.onchange, null);
	}
	public void setOnchange(java.lang.String _onchange) {
		getStateHelper().put(PropertyKeys.onchange, _onchange);
	}

	public java.lang.String getLineCap() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.lineCap, "butt");
	}
	public void setLineCap(java.lang.String _lineCap) {
		getStateHelper().put(PropertyKeys.lineCap, _lineCap);
	}


    private final static String DEFAULT_EVENT = "change";

    private static final Map<String, Class<? extends BehaviorEvent>> BEHAVIOR_EVENT_MAPPING = Collections.unmodifiableMap(new HashMap<String, Class<? extends BehaviorEvent>>() {{
        put("change", null);
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

	public String resolveWidgetVar() {
		return ComponentUtils.resolveWidgetVar(getFacesContext(), this);
	}
}