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
package org.primefaces.component.ring;

import org.primefaces.component.api.UIData;
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
	@ResourceDependency(library="primefaces", name="ring/ring.css"),
	@ResourceDependency(library="primefaces", name="jquery/jquery.js"),
	@ResourceDependency(library="primefaces", name="core.js"),
	@ResourceDependency(library="primefaces", name="components.js"),
	@ResourceDependency(library="primefaces", name="ring/ring.js")
})
public class Ring extends UIData implements org.primefaces.component.api.Widget {


	public static final String COMPONENT_TYPE = "org.primefaces.component.Ring";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";
	public static final String DEFAULT_RENDERER = "org.primefaces.component.RingRenderer";

	public enum PropertyKeys {

		widgetVar
		,style
		,styleClass
		,easing
		,autoplay
		,autoplayDuration
		,autoplayPauseOnHover
		,autoplayInitialDelay;

		String toString;

		PropertyKeys(String toString) {
			this.toString = toString;
		}

		PropertyKeys() {}

		public String toString() {
			return ((this.toString != null) ? this.toString : super.toString());
}
	}

	public Ring() {
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

	public java.lang.String getEasing() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.easing, null);
	}
	public void setEasing(java.lang.String _easing) {
		getStateHelper().put(PropertyKeys.easing, _easing);
	}

	public boolean isAutoplay() {
		return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.autoplay, false);
	}
	public void setAutoplay(boolean _autoplay) {
		getStateHelper().put(PropertyKeys.autoplay, _autoplay);
	}

	public int getAutoplayDuration() {
		return (java.lang.Integer) getStateHelper().eval(PropertyKeys.autoplayDuration, 1000);
	}
	public void setAutoplayDuration(int _autoplayDuration) {
		getStateHelper().put(PropertyKeys.autoplayDuration, _autoplayDuration);
	}

	public boolean isAutoplayPauseOnHover() {
		return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.autoplayPauseOnHover, false);
	}
	public void setAutoplayPauseOnHover(boolean _autoplayPauseOnHover) {
		getStateHelper().put(PropertyKeys.autoplayPauseOnHover, _autoplayPauseOnHover);
	}

	public int getAutoplayInitialDelay() {
		return (java.lang.Integer) getStateHelper().eval(PropertyKeys.autoplayInitialDelay, 0);
	}
	public void setAutoplayInitialDelay(int _autoplayInitialDelay) {
		getStateHelper().put(PropertyKeys.autoplayInitialDelay, _autoplayInitialDelay);
	}


    public static final String STYLE_CLASS = "ui-ring ui-widget";
	public String resolveWidgetVar() {
		return ComponentUtils.resolveWidgetVar(getFacesContext(), this);
	}
}