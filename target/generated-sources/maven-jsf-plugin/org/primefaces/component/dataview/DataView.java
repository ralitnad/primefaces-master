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
package org.primefaces.component.dataview;

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
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import javax.faces.context.FacesContext;
import javax.faces.event.AjaxBehaviorEvent;
import javax.faces.event.FacesEvent;
import org.primefaces.event.data.PageEvent;
import org.primefaces.util.Constants;
import java.util.HashMap;
import javax.faces.component.UIComponent;
import javax.faces.event.BehaviorEvent;

@ResourceDependencies({
	@ResourceDependency(library="primefaces", name="components.css"),
	@ResourceDependency(library="primefaces", name="jquery/jquery.js"),
	@ResourceDependency(library="primefaces", name="jquery/jquery-plugins.js"),
	@ResourceDependency(library="primefaces", name="core.js"),
	@ResourceDependency(library="primefaces", name="components.js")
})
public class DataView extends UIData implements org.primefaces.component.api.Widget,javax.faces.component.behavior.ClientBehaviorHolder,org.primefaces.component.api.PrimeClientBehaviorHolder,org.primefaces.component.api.Pageable {


	public static final String COMPONENT_TYPE = "org.primefaces.component.DataView";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";
	public static final String DEFAULT_RENDERER = "org.primefaces.component.DataViewRenderer";

	public enum PropertyKeys {

		widgetVar
		,style
		,styleClass
		,layout
		,gridIcon
		,listIcon;

		String toString;

		PropertyKeys(String toString) {
			this.toString = toString;
		}

		PropertyKeys() {}

		public String toString() {
			return ((this.toString != null) ? this.toString : super.toString());
}
	}

	public DataView() {
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

	public java.lang.String getLayout() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.layout, "list");
	}
	public void setLayout(java.lang.String _layout) {
		getStateHelper().put(PropertyKeys.layout, _layout);
	}

	public java.lang.String getGridIcon() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.gridIcon, null);
	}
	public void setGridIcon(java.lang.String _gridIcon) {
		getStateHelper().put(PropertyKeys.gridIcon, _gridIcon);
	}

	public java.lang.String getListIcon() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.listIcon, null);
	}
	public void setListIcon(java.lang.String _listIcon) {
		getStateHelper().put(PropertyKeys.listIcon, _listIcon);
	}


        public static final String DATAVIEW_CLASS = "ui-dataview ui-widget";
        public static final String LIST_LAYOUT_CLASS = "ui-dataview-list";
        public static final String GRID_LAYOUT_CLASS = "ui-dataview-grid";
        public static final String HEADER_CLASS = "ui-dataview-header ui-widget-header ui-helper-clearfix ui-corner-top";
        public static final String FOOTER_CLASS = "ui-dataview-footer ui-widget-header ui-corner-bottom";
        public static final String CONTENT_CLASS = "ui-dataview-content ui-widget-content";
        public static final String BUTTON_CONTAINER_CLASS = "ui-dataview-layout-options ui-selectonebutton ui-buttonset";
        public static final String BUTTON_CLASS = "ui-button ui-button-icon-only ui-state-default";
        public static final String LIST_LAYOUT_CONTAINER_CLASS = "ui-dataview-list-container";
        public static final String ROW_CLASS = "ui-dataview-row";
        public static final String GRID_LAYOUT_ROW_CLASS = "ui-dataview-row ui-g";
        public static final String GRID_LAYOUT_COLUMN_CLASS = "ui-dataview-column";

        private static final Map<String, Class<? extends BehaviorEvent>> BEHAVIOR_EVENT_MAPPING = Collections.unmodifiableMap(new HashMap<String, Class<? extends BehaviorEvent>>() {{
            put("page", PageEvent.class);
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

        public boolean isLayoutRequest(FacesContext context) {
            return context.getExternalContext().getRequestParameterMap().containsKey(this.getClientId(context) + "_layout");
        }

        public boolean isPaginationRequest(FacesContext context) {
            return context.getExternalContext().getRequestParameterMap().containsKey(this.getClientId(context) + "_pagination");
        }

        @Override
        public void queueEvent(FacesEvent event) {
            FacesContext context = getFacesContext();

            if(ComponentUtils.isRequestSource(this, context) && event instanceof AjaxBehaviorEvent) {
                setRowIndex(-1);
                Map<String,String> params = context.getExternalContext().getRequestParameterMap();
                String eventName = params.get(Constants.RequestParams.PARTIAL_BEHAVIOR_EVENT_PARAM);

                if(eventName.equals("page")) {
                    AjaxBehaviorEvent behaviorEvent = (AjaxBehaviorEvent) event;
                    String clientId = this.getClientId(context);
                    int rows = this.getRowsToRender();
                    int first = Integer.parseInt(params.get(clientId + "_first"));
                    int page = rows > 0 ? (int) (first / rows) : 0;

                    PageEvent pageEvent = new PageEvent(this, behaviorEvent.getBehavior(), page);
                    pageEvent.setPhaseId(behaviorEvent.getPhaseId());

                    super.queueEvent(pageEvent);
                }
            }
            else {
                super.queueEvent(event);
            }
        }

        private DataViewGridItem gridItem = null;
        private DataViewListItem listItem = null;

        public DataViewGridItem getGridItem() {
            return gridItem;
        }

        public DataViewListItem getListItem() {
            return listItem;
        }

        public void findViewItems() {
            for (UIComponent kid : this.getChildren()) {
                if (kid.isRendered()) {
                    if(kid instanceof DataViewListItem) {
                        listItem = (DataViewListItem) kid;
                    }
                    else if (kid instanceof DataViewGridItem) {
                        gridItem = (DataViewGridItem) kid;
                    }
                }
            }
        }



	public String resolveWidgetVar() {
		return ComponentUtils.resolveWidgetVar(getFacesContext(), this);
	}
}