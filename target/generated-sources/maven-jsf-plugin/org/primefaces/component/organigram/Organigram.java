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
package org.primefaces.component.organigram;

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
import org.primefaces.event.organigram.OrganigramNodeCollapseEvent;
import org.primefaces.event.organigram.OrganigramNodeDragDropEvent;
import org.primefaces.event.organigram.OrganigramNodeExpandEvent;
import org.primefaces.event.organigram.OrganigramNodeSelectEvent;
import org.primefaces.model.OrganigramNode;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.faces.context.FacesContext;
import javax.faces.event.AjaxBehaviorEvent;
import javax.faces.event.BehaviorEvent;
import javax.faces.event.FacesEvent;
import org.primefaces.component.api.PrimeClientBehaviorHolder;
import org.primefaces.component.api.Widget;
import org.primefaces.util.ComponentUtils;
import org.primefaces.util.Constants;

@ResourceDependencies({
	@ResourceDependency(library="primefaces", name="components.css"),
	@ResourceDependency(library="primefaces", name="jquery/jquery.js"),
	@ResourceDependency(library="primefaces", name="jquery/jquery-plugins.js"),
	@ResourceDependency(library="primefaces", name="core.js"),
	@ResourceDependency(library="primefaces", name="organigram/organigram.js"),
	@ResourceDependency(library="primefaces", name="organigram/organigram.css")
})
public class Organigram extends UIComponentBase implements org.primefaces.component.api.Widget,javax.faces.component.behavior.ClientBehaviorHolder,org.primefaces.component.api.PrimeClientBehaviorHolder {


	public static final String COMPONENT_TYPE = "org.primefaces.component.Organigram";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";
	public static final String DEFAULT_RENDERER = "org.primefaces.component.OrganigramRenderer";

	public enum PropertyKeys {

		widgetVar
		,value
		,var
		,selection
		,style
		,styleClass
		,leafNodeConnectorHeight
		,zoom
		,autoScrollToSelection;

		String toString;

		PropertyKeys(String toString) {
			this.toString = toString;
		}

		PropertyKeys() {}

		public String toString() {
			return ((this.toString != null) ? this.toString : super.toString());
}
	}

	public Organigram() {
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

	public org.primefaces.model.OrganigramNode getValue() {
		return (org.primefaces.model.OrganigramNode) getStateHelper().eval(PropertyKeys.value, null);
	}
	public void setValue(org.primefaces.model.OrganigramNode _value) {
		getStateHelper().put(PropertyKeys.value, _value);
	}

	public java.lang.String getVar() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.var, null);
	}
	public void setVar(java.lang.String _var) {
		getStateHelper().put(PropertyKeys.var, _var);
	}

	public org.primefaces.model.OrganigramNode getSelection() {
		return (org.primefaces.model.OrganigramNode) getStateHelper().eval(PropertyKeys.selection, null);
	}
	public void setSelection(org.primefaces.model.OrganigramNode _selection) {
		getStateHelper().put(PropertyKeys.selection, _selection);
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

	public int getLeafNodeConnectorHeight() {
		return (java.lang.Integer) getStateHelper().eval(PropertyKeys.leafNodeConnectorHeight, 10);
	}
	public void setLeafNodeConnectorHeight(int _leafNodeConnectorHeight) {
		getStateHelper().put(PropertyKeys.leafNodeConnectorHeight, _leafNodeConnectorHeight);
	}

	public boolean isZoom() {
		return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.zoom, false);
	}
	public void setZoom(boolean _zoom) {
		getStateHelper().put(PropertyKeys.zoom, _zoom);
	}

	public boolean isAutoScrollToSelection() {
		return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.autoScrollToSelection, false);
	}
	public void setAutoScrollToSelection(boolean _autoScrollToSelection) {
		getStateHelper().put(PropertyKeys.autoScrollToSelection, _autoScrollToSelection);
	}



    private static final String DEFAULT_EVENT = "select";

    private static final Map<String, Class<? extends BehaviorEvent>> BEHAVIOR_EVENT_MAPPING = Collections.unmodifiableMap(new HashMap<String, Class<? extends BehaviorEvent>>() {{
        put("select", OrganigramNodeSelectEvent.class);
        put("expand", OrganigramNodeExpandEvent.class);
        put("collapse", OrganigramNodeCollapseEvent.class);
        put("dragdrop", OrganigramNodeDragDropEvent.class);
        put("contextmenu", OrganigramNodeSelectEvent.class);
    }});

    private static final Collection<String> EVENT_NAMES = BEHAVIOR_EVENT_MAPPING.keySet();

    @Override
    public Map<String, Class<? extends BehaviorEvent>> getBehaviorEventMapping() {
         return BEHAVIOR_EVENT_MAPPING;
    }

    @Override
    public Collection<String> getEventNames()
    {
        return EVENT_NAMES;
    }

    @Override
    public String getDefaultEventName()
    {
        return DEFAULT_EVENT;
    }

    @Override
    public void queueEvent(FacesEvent event)
    {
        FacesContext context = getFacesContext();

        if (ComponentUtils.isRequestSource(this, context) && event instanceof AjaxBehaviorEvent)
        {
            Map<String, String> params = context.getExternalContext().getRequestParameterMap();
            String eventName = params.get(Constants.RequestParams.PARTIAL_BEHAVIOR_EVENT_PARAM);
            String clientId = this.getClientId(context);
            FacesEvent wrapperEvent = null;
            AjaxBehaviorEvent behaviorEvent = (AjaxBehaviorEvent) event;

            if (eventName.equals("expand"))
            {
                OrganigramNode node = findTreeNode(getValue(), params.get(clientId + "_expandNode"));
                node.setExpanded(true);

                wrapperEvent = new OrganigramNodeExpandEvent(this, behaviorEvent.getBehavior(), node);
            }
            else if (eventName.equals("collapse"))
            {
                OrganigramNode node = findTreeNode(getValue(), params.get(clientId + "_collapseNode"));
                node.setExpanded(false);

                wrapperEvent = new OrganigramNodeCollapseEvent(this, behaviorEvent.getBehavior(), node);
            }
            else if (eventName.equals("select") || eventName.equals("contextmenu"))
            {
                OrganigramNode node = findTreeNode(getValue(), params.get(clientId + "_selectNode"));

                wrapperEvent = new OrganigramNodeSelectEvent(this, behaviorEvent.getBehavior(), node);
            }
            else if (eventName.equals("dragdrop"))
            {
                OrganigramNode dragNode = findTreeNode(getValue(), params.get(clientId + "_dragNode"));
                OrganigramNode dropNode = findTreeNode(getValue(), params.get(clientId + "_dropNode"));

                // remove node from current parent
                if (dragNode != null && dropNode != null)
                {
                    OrganigramNode sourceNode = dragNode.getParent();

                    if (sourceNode != null)
                    {
                        sourceNode.getChildren().remove(dragNode);
                    }

                    // set new parent
                    dragNode.setParent(dropNode);

                    wrapperEvent = new OrganigramNodeDragDropEvent(this, behaviorEvent.getBehavior(), dragNode, dropNode, sourceNode);
                }
            }

            wrapperEvent.setPhaseId(behaviorEvent.getPhaseId());

            super.queueEvent(wrapperEvent);
        }
        else
        {
            super.queueEvent(event);
        }
    }


    public OrganigramNode findTreeNode(OrganigramNode searchRoot, String rowKey)
    {
        if (rowKey != null && rowKey.equals("root"))
        {
            return getValue();
        }

        return OrganigramHelper.findTreeNode(searchRoot, rowKey);
    }
	public String resolveWidgetVar() {
		return ComponentUtils.resolveWidgetVar(getFacesContext(), this);
	}
}