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
package org.primefaces.component.datalist;

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
import javax.faces.FacesException;
import javax.faces.event.PhaseId;
import javax.faces.component.UIColumn;
import javax.faces.component.behavior.Behavior;
import javax.faces.event.BehaviorEvent;
import javax.faces.event.FacesEvent;
import javax.faces.event.FacesListener;
import javax.faces.model.DataModel;
import org.primefaces.model.LazyDataModel;
import org.primefaces.event.SelectEvent;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import javax.faces.component.UIComponent;
import org.primefaces.util.Constants;
import javax.faces.event.AjaxBehaviorEvent;
import javax.faces.event.FacesEvent;
import org.primefaces.event.data.PageEvent;
import javax.faces.event.BehaviorEvent;
import org.primefaces.PrimeFaces;

@ResourceDependencies({
	@ResourceDependency(library="primefaces", name="components.css"),
	@ResourceDependency(library="primefaces", name="jquery/jquery.js"),
	@ResourceDependency(library="primefaces", name="jquery/jquery-plugins.js"),
	@ResourceDependency(library="primefaces", name="core.js"),
	@ResourceDependency(library="primefaces", name="components.js")
})
public class DataList extends UIData implements org.primefaces.component.api.Widget,javax.faces.component.behavior.ClientBehaviorHolder,org.primefaces.component.api.PrimeClientBehaviorHolder,org.primefaces.component.api.Pageable {


	public static final String COMPONENT_TYPE = "org.primefaces.component.DataList";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";
	public static final String DEFAULT_RENDERER = "org.primefaces.component.DataListRenderer";

	public enum PropertyKeys {

		widgetVar
		,type
		,itemType
		,style
		,styleClass
		,varStatus
		,emptyMessage
		,itemStyleClass;

		String toString;

		PropertyKeys(String toString) {
			this.toString = toString;
		}

		PropertyKeys() {}

		public String toString() {
			return ((this.toString != null) ? this.toString : super.toString());
}
	}

	public DataList() {
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

	public java.lang.String getType() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.type, "unordered");
	}
	public void setType(java.lang.String _type) {
		getStateHelper().put(PropertyKeys.type, _type);
	}

	public java.lang.String getItemType() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.itemType, null);
	}
	public void setItemType(java.lang.String _itemType) {
		getStateHelper().put(PropertyKeys.itemType, _itemType);
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

	public java.lang.String getVarStatus() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.varStatus, null);
	}
	public void setVarStatus(java.lang.String _varStatus) {
		getStateHelper().put(PropertyKeys.varStatus, _varStatus);
	}

	public java.lang.String getEmptyMessage() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.emptyMessage, "No records found.");
	}
	public void setEmptyMessage(java.lang.String _emptyMessage) {
		getStateHelper().put(PropertyKeys.emptyMessage, _emptyMessage);
	}

	public java.lang.String getItemStyleClass() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.itemStyleClass, null);
	}
	public void setItemStyleClass(java.lang.String _itemStyleClass) {
		getStateHelper().put(PropertyKeys.itemStyleClass, _itemStyleClass);
	}


	public static final String DATALIST_CLASS = "ui-datalist ui-widget";
    public static final String CONTENT_CLASS = "ui-datalist-content ui-widget-content";
	public static final String LIST_CLASS = "ui-datalist-data";
    public static final String NO_BULLETS_CLASS = "ui-datalist-nobullets";
	public static final String LIST_ITEM_CLASS = "ui-datalist-item";
    public static final String HEADER_CLASS = "ui-datalist-header ui-widget-header ui-corner-top";
    public static final String FOOTER_CLASS = "ui-datalist-footer ui-widget-header ui-corner-bottom";
	public static final String DATALIST_EMPTYMESSAGE_CLASS = "ui-datalist-empty-message";

    private static final Map<String, Class<? extends BehaviorEvent>> BEHAVIOR_EVENT_MAPPING = Collections.unmodifiableMap(new HashMap<String, Class<? extends BehaviorEvent>>() {{
        put("page", PageEvent.class);
        put("tap", SelectEvent.class);
        put("taphold", SelectEvent.class);
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

	public String getListTag() {
		String type = getType();
		
		if(type.equalsIgnoreCase("unordered"))
			return "ul";
		else if(type.equalsIgnoreCase("ordered"))
			return "ol";
		else if(type.equalsIgnoreCase("definition"))
			return "dl";
        else if(type.equalsIgnoreCase("none"))
            return null;
        else
			throw new FacesException("DataList '" + this.getClientId() + "' has invalid list type:'" + type + "'");
	}
	
	public boolean isDefinition() {
		return getType().equalsIgnoreCase("definition");
	}

    public void loadLazyData() {
        DataModel model = getDataModel();
        
        if(model != null && model instanceof LazyDataModel) {            
            LazyDataModel lazyModel = (LazyDataModel) model;

            List<?> data = lazyModel.load(getFirst(), getRows(), null, null, null);
            
            lazyModel.setPageSize(getRows());
            lazyModel.setWrappedData(data);

            //Update paginator for callback
            if(ComponentUtils.isRequestSource(this, getFacesContext()) && this.isPaginator()) {
                PrimeFaces.current().ajax().addCallbackParam("totalRecords", lazyModel.getRowCount());
            }
        }
    }

    @Override
    public void queueEvent(FacesEvent event) {
        FacesContext context = getFacesContext();

        if(ComponentUtils.isRequestSource(this, context) && event instanceof AjaxBehaviorEvent) {
            setRowIndex(-1);
            AjaxBehaviorEvent behaviorEvent = (AjaxBehaviorEvent) event;
            Map<String,String> params = context.getExternalContext().getRequestParameterMap();
            String eventName = params.get(Constants.RequestParams.PARTIAL_BEHAVIOR_EVENT_PARAM);

            if(eventName.equals("page")) {
                String clientId = this.getClientId(context);
                int rows = this.getRowsToRender();
                int first = Integer.parseInt(params.get(clientId + "_first"));
                int page = rows > 0 ? (int) (first / rows) : 0;
        
                PageEvent pageEvent = new PageEvent(this, behaviorEvent.getBehavior(), page);
                pageEvent.setPhaseId(behaviorEvent.getPhaseId());

                super.queueEvent(pageEvent);
            }
            else if(eventName.equals("tap")||eventName.equals("taphold")) {
                String clientId = this.getClientId(context);
                int index = Integer.parseInt(params.get(clientId + "_item"));
                this.setRowIndex(index);
        
                SelectEvent selectEvent = new SelectEvent(this, behaviorEvent.getBehavior(), this.getRowData());
                selectEvent.setPhaseId(behaviorEvent.getPhaseId());

                this.setRowIndex(-1);
                super.queueEvent(selectEvent);
            }
        }
        else {
            super.queueEvent(event);
        }
    }

    @Override
    protected void processFacets(FacesContext context, PhaseId phaseId) {
        if(this.getFacetCount() > 0) {
            UIComponent descriptionFacet = getFacet("description");
            for(UIComponent facet : getFacets().values()) {
                if(facet.equals(descriptionFacet)) {
                   continue;
                }
                process(context, facet, phaseId);
            }
        }
    }
    
    @Override
    protected void processChildren(FacesContext context, PhaseId phaseId) {
        int first = getFirst();
        int rows = getRows();
        int last = rows == 0 ? getRowCount() : (first + rows);
        
        for(int rowIndex = first; rowIndex < last; rowIndex++) {
            setRowIndex(rowIndex);

            if(!isRowAvailable()) {
                break;
            }
            
            for(UIComponent child : this.getIterableChildren()) {
                if(child.isRendered()) {
                    process(context, child, phaseId);
                }
            }

            UIComponent descriptionFacet = getFacet("description");
            if(descriptionFacet != null && isDefinition()) {
                process(context, descriptionFacet, phaseId);
            }
        }
    }

	public String resolveWidgetVar() {
		return ComponentUtils.resolveWidgetVar(getFacesContext(), this);
	}
}