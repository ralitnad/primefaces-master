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
package org.primefaces.component.inputnumber;

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
import java.text.DecimalFormatSymbols;
import java.util.Locale;

@ResourceDependencies({
	@ResourceDependency(library="primefaces", name="components.css"),
	@ResourceDependency(library="primefaces", name="jquery/jquery.js"),
	@ResourceDependency(library="primefaces", name="core.js"),
	@ResourceDependency(library="primefaces", name="components.js"),
	@ResourceDependency(library="primefaces", name="inputnumber/inputnumber.js"),
	@ResourceDependency(library="primefaces", name="inputnumber/inputnumber.css")
})
public class InputNumber extends HtmlInputText implements org.primefaces.component.api.Widget,org.primefaces.component.api.InputHolder {


	public static final String COMPONENT_TYPE = "org.primefaces.component.InputNumber";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";
	public static final String DEFAULT_RENDERER = "org.primefaces.component.InputNumberRenderer";

	public enum PropertyKeys {

		placeholder
		,widgetVar
		,type
		,symbol
		,symbolPosition
		,minValue
		,maxValue
		,roundMethod
		,decimalPlaces
		,emptyValue
		,inputStyle
		,inputStyleClass
		,padControl
		,leadingZero;

		String toString;

		PropertyKeys(String toString) {
			this.toString = toString;
		}

		PropertyKeys() {}

		public String toString() {
			return ((this.toString != null) ? this.toString : super.toString());
}
	}

	public InputNumber() {
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

	public java.lang.String getType() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.type, "text");
	}
	public void setType(java.lang.String _type) {
		getStateHelper().put(PropertyKeys.type, _type);
	}

	public java.lang.String getSymbol() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.symbol, null);
	}
	public void setSymbol(java.lang.String _symbol) {
		getStateHelper().put(PropertyKeys.symbol, _symbol);
	}

	public java.lang.String getSymbolPosition() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.symbolPosition, null);
	}
	public void setSymbolPosition(java.lang.String _symbolPosition) {
		getStateHelper().put(PropertyKeys.symbolPosition, _symbolPosition);
	}

	public java.lang.String getMinValue() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.minValue, null);
	}
	public void setMinValue(java.lang.String _minValue) {
		getStateHelper().put(PropertyKeys.minValue, _minValue);
	}

	public java.lang.String getMaxValue() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.maxValue, null);
	}
	public void setMaxValue(java.lang.String _maxValue) {
		getStateHelper().put(PropertyKeys.maxValue, _maxValue);
	}

	public java.lang.String getRoundMethod() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.roundMethod, null);
	}
	public void setRoundMethod(java.lang.String _roundMethod) {
		getStateHelper().put(PropertyKeys.roundMethod, _roundMethod);
	}

	public java.lang.String getDecimalPlaces() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.decimalPlaces, null);
	}
	public void setDecimalPlaces(java.lang.String _decimalPlaces) {
		getStateHelper().put(PropertyKeys.decimalPlaces, _decimalPlaces);
	}

	public java.lang.String getEmptyValue() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.emptyValue, "empty");
	}
	public void setEmptyValue(java.lang.String _emptyValue) {
		getStateHelper().put(PropertyKeys.emptyValue, _emptyValue);
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

	public boolean isPadControl() {
		return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.padControl, true);
	}
	public void setPadControl(boolean _padControl) {
		getStateHelper().put(PropertyKeys.padControl, _padControl);
	}

	public java.lang.String getLeadingZero() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.leadingZero, "allow");
	}
	public void setLeadingZero(java.lang.String _leadingZero) {
		getStateHelper().put(PropertyKeys.leadingZero, _leadingZero);
	}


    public final static String STYLE_CLASS = "ui-inputnumber ui-widget";

    @Override
	public String getInputClientId() {
		return getClientId() + "_input";
	}

    @Override
    public String getValidatableInputClientId() {
        return getClientId() + "_hinput";
    }

    @Override
    public void setLabelledBy(String labelledBy) {
        getStateHelper().put("labelledby", labelledBy);
    }

    @Override
    public String getLabelledBy() {
        return (String) getStateHelper().get("labelledby");
    } 

    public String getDecimalSeparator() {
        return (String) getStateHelper().eval("decimalSeparator", getCalculatedDecimalSepartor());
    }

    public void setDecimalSeparator(final String decimalSeparator) {
        getStateHelper().put("decimalSeparator", decimalSeparator);
    }

    public String getThousandSeparator() {
        return (String) getStateHelper().eval("thousandSeparator", getCalculatedThousandSeparator());
    }

    public void setThousandSeparator(final String thousandSeparator) {
        getStateHelper().put("thousandSeparator", thousandSeparator);
    }

    private String getCalculatedDecimalSepartor(){
        String decimalSeparator = (String) getStateHelper().eval("decimalSeparator", null);
        if (decimalSeparator==null){
            Locale locale = FacesContext.getCurrentInstance().getViewRoot().getLocale();
            DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(locale);
            decimalSeparator = Character.toString(decimalFormatSymbols.getDecimalSeparator());
        }
        return decimalSeparator;
    }

    private String getCalculatedThousandSeparator(){
        String thousandSeparator = (String) getStateHelper().eval("thousandSeparator", null);
        if (thousandSeparator==null){
            Locale locale = FacesContext.getCurrentInstance().getViewRoot().getLocale();
            DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(locale);
            thousandSeparator =  Character.toString(decimalFormatSymbols.getGroupingSeparator());
        }
        return thousandSeparator;
    }

	public String resolveWidgetVar() {
		return ComponentUtils.resolveWidgetVar(getFacesContext(), this);
	}
}