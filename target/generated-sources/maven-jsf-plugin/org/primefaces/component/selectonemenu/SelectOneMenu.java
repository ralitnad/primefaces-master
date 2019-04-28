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
package org.primefaces.component.selectonemenu;

import javax.faces.component.html.HtmlSelectOneMenu;
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
import org.primefaces.component.column.Column;
import org.primefaces.context.PrimeApplicationContext;
import org.primefaces.config.PrimeConfiguration;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import javax.faces.event.FacesEvent;
import javax.faces.event.AjaxBehaviorEvent;
import javax.faces.component.UIComponent;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
import org.primefaces.util.ComponentUtils;
import org.primefaces.util.MessageFactory;
import org.primefaces.util.Constants;
import org.primefaces.event.SelectEvent;
import java.util.Map;
import javax.faces.render.Renderer;

@ResourceDependencies({
	@ResourceDependency(library="primefaces", name="components.css"),
	@ResourceDependency(library="primefaces", name="jquery/jquery.js"),
	@ResourceDependency(library="primefaces", name="jquery/jquery-plugins.js"),
	@ResourceDependency(library="primefaces", name="core.js"),
	@ResourceDependency(library="primefaces", name="components.js")
})
public class SelectOneMenu extends HtmlSelectOneMenu implements org.primefaces.component.api.Widget,org.primefaces.component.api.InputHolder {


	public static final String COMPONENT_TYPE = "org.primefaces.component.SelectOneMenu";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";
	public static final String DEFAULT_RENDERER = "org.primefaces.component.SelectOneMenuRenderer";

	public enum PropertyKeys {

		widgetVar
		,effect
		,effectSpeed
		,panelStyle
		,panelStyleClass
		,var
		,height
		,editable
		,filter
		,filterMatchMode
		,filterFunction
		,filterPlaceholder
		,caseSensitive
		,maxlength
		,appendTo
		,title
		,syncTooltip
		,labelTemplate
		,placeholder
		,autoWidth
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

	public SelectOneMenu() {
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

	public java.lang.String getEffect() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.effect, null);
	}
	public void setEffect(java.lang.String _effect) {
		getStateHelper().put(PropertyKeys.effect, _effect);
	}

	public java.lang.String getEffectSpeed() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.effectSpeed, null);
	}
	public void setEffectSpeed(java.lang.String _effectSpeed) {
		getStateHelper().put(PropertyKeys.effectSpeed, _effectSpeed);
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

	public java.lang.String getVar() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.var, null);
	}
	public void setVar(java.lang.String _var) {
		getStateHelper().put(PropertyKeys.var, _var);
	}

	public java.lang.String getHeight() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.height, "200");
	}
	public void setHeight(java.lang.String _height) {
		getStateHelper().put(PropertyKeys.height, _height);
	}

	public boolean isEditable() {
		return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.editable, false);
	}
	public void setEditable(boolean _editable) {
		getStateHelper().put(PropertyKeys.editable, _editable);
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

	public java.lang.String getFilterPlaceholder() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.filterPlaceholder, null);
	}
	public void setFilterPlaceholder(java.lang.String _filterPlaceholder) {
		getStateHelper().put(PropertyKeys.filterPlaceholder, _filterPlaceholder);
	}

	public boolean isCaseSensitive() {
		return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.caseSensitive, false);
	}
	public void setCaseSensitive(boolean _caseSensitive) {
		getStateHelper().put(PropertyKeys.caseSensitive, _caseSensitive);
	}

	public int getMaxlength() {
		return (java.lang.Integer) getStateHelper().eval(PropertyKeys.maxlength, Integer.MAX_VALUE);
	}
	public void setMaxlength(int _maxlength) {
		getStateHelper().put(PropertyKeys.maxlength, _maxlength);
	}

	public java.lang.String getAppendTo() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.appendTo, "@(body)");
	}
	public void setAppendTo(java.lang.String _appendTo) {
		getStateHelper().put(PropertyKeys.appendTo, _appendTo);
	}

	public java.lang.String getTitle() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.title, null);
	}
	public void setTitle(java.lang.String _title) {
		getStateHelper().put(PropertyKeys.title, _title);
	}

	public boolean isSyncTooltip() {
		return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.syncTooltip, false);
	}
	public void setSyncTooltip(boolean _syncTooltip) {
		getStateHelper().put(PropertyKeys.syncTooltip, _syncTooltip);
	}

	public java.lang.String getLabelTemplate() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.labelTemplate, null);
	}
	public void setLabelTemplate(java.lang.String _labelTemplate) {
		getStateHelper().put(PropertyKeys.labelTemplate, _labelTemplate);
	}

	public java.lang.String getPlaceholder() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.placeholder, null);
	}
	public void setPlaceholder(java.lang.String _placeholder) {
		getStateHelper().put(PropertyKeys.placeholder, _placeholder);
	}

	public boolean isAutoWidth() {
		return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.autoWidth, true);
	}
	public void setAutoWidth(boolean _autoWidth) {
		getStateHelper().put(PropertyKeys.autoWidth, _autoWidth);
	}

	public boolean isDynamic() {
		return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.dynamic, false);
	}
	public void setDynamic(boolean _dynamic) {
		getStateHelper().put(PropertyKeys.dynamic, _dynamic);
	}


    public final static String STYLE_CLASS = "ui-selectonemenu ui-widget ui-state-default ui-corner-all";
    public final static String LABEL_CLASS = "ui-selectonemenu-label ui-inputfield ui-corner-all";
    public final static String TRIGGER_CLASS = "ui-selectonemenu-trigger ui-state-default ui-corner-right";
    public final static String PANEL_CLASS = "ui-selectonemenu-panel ui-widget ui-widget-content ui-corner-all ui-helper-hidden ui-shadow ui-input-overlay";
    public final static String ITEMS_WRAPPER_CLASS = "ui-selectonemenu-items-wrapper";
    public final static String LIST_CLASS = "ui-selectonemenu-items ui-selectonemenu-list ui-widget-content ui-widget ui-corner-all ui-helper-reset";
    public final static String TABLE_CLASS = "ui-selectonemenu-items ui-selectonemenu-table ui-widget-content ui-widget ui-corner-all ui-helper-reset";
    public final static String ITEM_GROUP_CLASS = "ui-selectonemenu-item-group ui-corner-all";
    public final static String ITEM_CLASS = "ui-selectonemenu-item ui-selectonemenu-list-item ui-corner-all";
    public final static String ROW_CLASS = "ui-selectonemenu-item ui-selectonemenu-row ui-widget-content";
    public final static String FILTER_CONTAINER_CLASS = "ui-selectonemenu-filter-container";
    public final static String FILTER_CLASS = "ui-selectonemenu-filter ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all";
    public final static String FILTER_ICON_CLASS = "ui-icon ui-icon-search";

    private static final Collection<String> EVENT_NAMES = Collections.unmodifiableCollection(Arrays.asList("itemSelect","blur","change","valueChange","click","dblclick","focus","keydown","keypress","keyup","mousedown","mousemove","mouseout","mouseover","mouseup","select"));

    public Collection<String> getEventNames() {
        return EVENT_NAMES;    
    }

    public boolean isDynamicLoadRequest(FacesContext context) {
        return context.getExternalContext().getRequestParameterMap().containsKey(this.getClientId(context) + "_dynamicload");
    }

    public String getDefaultEventName() {
        return "valueChange";    
    }

    public List<Column> getColumns() {
        List<Column> columns = new ArrayList<Column>();
        
        for(UIComponent kid : this.getChildren()) {
            if(kid instanceof Column)
                columns.add((Column) kid);
        }

        return columns;
    }

    @Override
    public void queueEvent(FacesEvent event) {
        if(event instanceof AjaxBehaviorEvent) {
            FacesContext context = getFacesContext();
            AjaxBehaviorEvent behaviorEvent = (AjaxBehaviorEvent) event;
            Map<String,String> params = context.getExternalContext().getRequestParameterMap();
            String eventName = params.get(Constants.RequestParams.PARTIAL_BEHAVIOR_EVENT_PARAM);
            
            if("itemSelect".equals(eventName)) {
                Renderer renderer = ComponentUtils.getUnwrappedRenderer(
                    context,
                    "javax.faces.SelectOne",
                    "javax.faces.Menu",
                    Renderer.class);
                
                Object item = renderer.getConvertedValue(context, this, this.getSubmittedValue());
                SelectEvent selectEvent = new SelectEvent(this, behaviorEvent.getBehavior(), item);
                selectEvent.setPhaseId(event.getPhaseId());
                super.queueEvent(selectEvent);
            }
            else {
                super.queueEvent(event);
            }
        }
        else {
            super.queueEvent(event);
        }
    }

    @Override
    protected void validateValue(FacesContext context, Object value) {
        if(this.isEditable()) {
            
            //required field validation
            if(isValid() && isRequired() && isEmpty(value)) {
                String requiredMessageStr = getRequiredMessage();
                FacesMessage message;
                if(null != requiredMessageStr) {
                    message = new FacesMessage(FacesMessage.SEVERITY_ERROR,
                                               requiredMessageStr,
                                               requiredMessageStr);
                } else {                    
                    message = MessageFactory.getMessage(REQUIRED_MESSAGE_ID, FacesMessage.SEVERITY_ERROR, new Object[]{MessageFactory.getLabel(context, this)});
                }
                context.addMessage(getClientId(context), message);
                setValid(false);
            }

            PrimeConfiguration config = PrimeApplicationContext.getCurrentInstance(getFacesContext()).getConfig();
            
            //other validators
            if(isValid() && (!isEmpty(value) || config.isValidateEmptyFields())) {
                Validator[] validators = getValidators();
                    
                for(Validator validator : validators) {
                    try {
                        validator.validate(context, this, value);
                    }
                    catch(ValidatorException ve) {
                        setValid(false);
                        FacesMessage message;
                        String validatorMessageString = getValidatorMessage();

                        if(null != validatorMessageString) {
                            message =new FacesMessage(FacesMessage.SEVERITY_ERROR, validatorMessageString, validatorMessageString);
                        } 
                        else {
                            Collection<FacesMessage> messages = ve.getFacesMessages();
                            
                            if(null != messages) {
                                message = null;
                                String cid = getClientId(context);
                                for(FacesMessage m : messages) {
                                    context.addMessage(cid, m);
                                }
                            } 
                            else {
                                message = ve.getFacesMessage();
                            }
                        }
                        
                        if(message != null) {
                            context.addMessage(getClientId(context), message);
                        }
                    }
                }
            }
        }
        else {
            super.validateValue(context, value);
        }
    }

    public String getInputClientId() {
        return this.getClientId(getFacesContext()) + "_focus";
    }

    public String getValidatableInputClientId() {
        return this.getClientId(getFacesContext()) + "_input";
    }

    public void setLabelledBy(String labelledBy) {
        getStateHelper().put("labelledby", labelledBy);
    }
    public String getLabelledBy() {
        return (String) getStateHelper().get("labelledby");
    }

    


    
	public String resolveWidgetVar() {
		return ComponentUtils.resolveWidgetVar(getFacesContext(), this);
	}
}