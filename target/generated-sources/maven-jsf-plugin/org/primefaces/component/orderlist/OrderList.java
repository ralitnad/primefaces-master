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
package org.primefaces.component.orderlist;

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
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import org.primefaces.event.SelectEvent;
import org.primefaces.event.UnselectEvent;
import org.primefaces.event.ReorderEvent;
import org.primefaces.util.Constants;
import javax.faces.event.AjaxBehaviorEvent;
import javax.faces.event.FacesEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.BehaviorEvent;

@ResourceDependencies({
	@ResourceDependency(library="primefaces", name="components.css"),
	@ResourceDependency(library="primefaces", name="jquery/jquery.js"),
	@ResourceDependency(library="primefaces", name="jquery/jquery-plugins.js"),
	@ResourceDependency(library="primefaces", name="core.js"),
	@ResourceDependency(library="primefaces", name="components.js")
})
public class OrderList extends UIInput implements org.primefaces.component.api.Widget,javax.faces.component.behavior.ClientBehaviorHolder,org.primefaces.component.api.PrimeClientBehaviorHolder {


	public static final String COMPONENT_TYPE = "org.primefaces.component.OrderList";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";
	public static final String DEFAULT_RENDERER = "org.primefaces.component.OrderListRenderer";

	public enum PropertyKeys {

		widgetVar
		,var
		,itemLabel
		,itemValue
		,style
		,styleClass
		,disabled
		,effect
		,moveUpLabel
		,moveTopLabel
		,moveDownLabel
		,moveBottomLabel
		,controlsLocation
		,responsive;

		String toString;

		PropertyKeys(String toString) {
			this.toString = toString;
		}

		PropertyKeys() {}

		public String toString() {
			return ((this.toString != null) ? this.toString : super.toString());
}
	}

	public OrderList() {
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

	public java.lang.String getVar() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.var, null);
	}
	public void setVar(java.lang.String _var) {
		getStateHelper().put(PropertyKeys.var, _var);
	}

	public java.lang.String getItemLabel() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.itemLabel, null);
	}
	public void setItemLabel(java.lang.String _itemLabel) {
		getStateHelper().put(PropertyKeys.itemLabel, _itemLabel);
	}

	public java.lang.Object getItemValue() {
		return (java.lang.Object) getStateHelper().eval(PropertyKeys.itemValue, null);
	}
	public void setItemValue(java.lang.Object _itemValue) {
		getStateHelper().put(PropertyKeys.itemValue, _itemValue);
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

	public boolean isDisabled() {
		return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.disabled, false);
	}
	public void setDisabled(boolean _disabled) {
		getStateHelper().put(PropertyKeys.disabled, _disabled);
	}

	public java.lang.String getEffect() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.effect, null);
	}
	public void setEffect(java.lang.String _effect) {
		getStateHelper().put(PropertyKeys.effect, _effect);
	}

	public java.lang.String getMoveUpLabel() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.moveUpLabel, "Move Up");
	}
	public void setMoveUpLabel(java.lang.String _moveUpLabel) {
		getStateHelper().put(PropertyKeys.moveUpLabel, _moveUpLabel);
	}

	public java.lang.String getMoveTopLabel() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.moveTopLabel, "Move Top");
	}
	public void setMoveTopLabel(java.lang.String _moveTopLabel) {
		getStateHelper().put(PropertyKeys.moveTopLabel, _moveTopLabel);
	}

	public java.lang.String getMoveDownLabel() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.moveDownLabel, "Move Down");
	}
	public void setMoveDownLabel(java.lang.String _moveDownLabel) {
		getStateHelper().put(PropertyKeys.moveDownLabel, _moveDownLabel);
	}

	public java.lang.String getMoveBottomLabel() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.moveBottomLabel, "Move Bottom");
	}
	public void setMoveBottomLabel(java.lang.String _moveBottomLabel) {
		getStateHelper().put(PropertyKeys.moveBottomLabel, _moveBottomLabel);
	}

	public java.lang.String getControlsLocation() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.controlsLocation, "left");
	}
	public void setControlsLocation(java.lang.String _controlsLocation) {
		getStateHelper().put(PropertyKeys.controlsLocation, _controlsLocation);
	}

	public boolean isResponsive() {
		return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.responsive, false);
	}
	public void setResponsive(boolean _responsive) {
		getStateHelper().put(PropertyKeys.responsive, _responsive);
	}


    public static final String CONTAINER_CLASS = "ui-orderlist ui-grid ui-widget";
    public static final String LIST_CLASS = "ui-widget-content ui-orderlist-list";
    public static final String CONTROLS_CLASS = "ui-orderlist-controls ui-g-12 ui-md-2";
    public static final String CAPTION_CLASS = "ui-orderlist-caption ui-widget-header ui-corner-top";
    public static final String ITEM_CLASS = "ui-orderlist-item ui-corner-all";
    public static final String MOVE_UP_BUTTON_CLASS = "ui-orderlist-button-move-up";
    public static final String MOVE_DOWN_BUTTON_CLASS = "ui-orderlist-button-move-down";
    public static final String MOVE_TOP_BUTTON_CLASS = "ui-orderlist-button-move-top";
    public static final String MOVE_BOTTOM_BUTTON_CLASS = "ui-orderlist-button-move-bottom";
    public static final String MOVE_UP_BUTTON_ICON_CLASS = "ui-icon ui-icon-arrow-1-n";
    public static final String MOVE_DOWN_BUTTON_ICON_CLASS = "ui-icon ui-icon-arrow-1-s";
    public static final String MOVE_TOP_BUTTON_ICON_CLASS = "ui-icon ui-icon-arrowstop-1-n";
    public static final String MOVE_BOTTOM_BUTTON_ICON_CLASS = "ui-icon ui-icon-arrowstop-1-s";

    private Map<String,AjaxBehaviorEvent> customEvents = new HashMap<String,AjaxBehaviorEvent>();
    
    private static final Map<String, Class<? extends BehaviorEvent>> BEHAVIOR_EVENT_MAPPING = Collections.unmodifiableMap(new HashMap<String, Class<? extends BehaviorEvent>>() {{
        put("select", SelectEvent.class);
        put("unselect", UnselectEvent.class);
        put("reorder", null);
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

    private Map<String,AjaxBehaviorEvent> getCustomEvents() {
        if(customEvents == null) {
            customEvents = new HashMap<String,AjaxBehaviorEvent>();
        }

        return customEvents;
    }

    @Override
    public void queueEvent(FacesEvent event) {
        FacesContext context = getFacesContext();

        if(ComponentUtils.isRequestSource(this, context) && (event instanceof AjaxBehaviorEvent)) {
            String eventName = context.getExternalContext().getRequestParameterMap().get(Constants.RequestParams.PARTIAL_BEHAVIOR_EVENT_PARAM);
            customEvents.put(eventName, (AjaxBehaviorEvent) event);
        } 
        else {
            super.queueEvent(event);
        }
    }

    @Override
    public void validate(FacesContext context) {
        super.validate(context);

        if(isValid() && customEvents != null) {
            for(Iterator<String> customEventIter = customEvents.keySet().iterator(); customEventIter.hasNext();) {
                String eventName = customEventIter.next();
                AjaxBehaviorEvent behaviorEvent = customEvents.get(eventName);
                Map<String,String> params = context.getExternalContext().getRequestParameterMap();
                String clientId = this.getClientId(context);
                List<?> list = (List) this.getValue();
                FacesEvent wrapperEvent = null;

                if(eventName.equals("select")) {
                    int itemIndex = Integer.parseInt(params.get(clientId + "_itemIndex"));
                    boolean metaKey = Boolean.valueOf(params.get(clientId + "_metaKey"));
                    boolean ctrlKey = Boolean.valueOf(params.get(clientId + "_ctrlKey"));
                    wrapperEvent = new SelectEvent(this, behaviorEvent.getBehavior(), list.get(itemIndex), metaKey, ctrlKey);
                }
                else if(eventName.equals("unselect")) {
                    int itemIndex = Integer.parseInt(params.get(clientId + "_itemIndex"));
                    wrapperEvent = new UnselectEvent(this, behaviorEvent.getBehavior(), list.get(itemIndex));
                }
                else if(eventName.equals("reorder")) {
                    wrapperEvent = behaviorEvent;
                }

                wrapperEvent.setPhaseId(behaviorEvent.getPhaseId());
                
                super.queueEvent(wrapperEvent);
            }
        }
    }

	public String resolveWidgetVar() {
		return ComponentUtils.resolveWidgetVar(getFacesContext(), this);
	}
}