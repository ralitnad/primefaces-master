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
package org.primefaces.component.mindmap;

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
import org.primefaces.model.mindmap.MindmapNode;
import org.primefaces.event.SelectEvent;
import java.util.Collection;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;
import javax.faces.context.FacesContext;
import javax.faces.event.AjaxBehaviorEvent;
import javax.faces.event.FacesEvent;
import org.primefaces.util.Constants;
import javax.faces.event.BehaviorEvent;
import org.primefaces.util.ComponentUtils;

@ResourceDependencies({
	@ResourceDependency(library="primefaces", name="components.css"),
	@ResourceDependency(library="primefaces", name="jquery/jquery.js"),
	@ResourceDependency(library="primefaces", name="core.js"),
	@ResourceDependency(library="primefaces", name="components.js"),
	@ResourceDependency(library="primefaces", name="raphael/raphael.js"),
	@ResourceDependency(library="primefaces", name="mindmap/mindmap.js")
})
public class Mindmap extends UIComponentBase implements org.primefaces.component.api.Widget,javax.faces.component.behavior.ClientBehaviorHolder,org.primefaces.component.api.PrimeClientBehaviorHolder {


	public static final String COMPONENT_TYPE = "org.primefaces.component.Mindmap";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";
	public static final String DEFAULT_RENDERER = "org.primefaces.component.MindmapRenderer";

	public enum PropertyKeys {

		widgetVar
		,value
		,style
		,styleClass
		,effectSpeed;

		String toString;

		PropertyKeys(String toString) {
			this.toString = toString;
		}

		PropertyKeys() {}

		public String toString() {
			return ((this.toString != null) ? this.toString : super.toString());
}
	}

	public Mindmap() {
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

	public org.primefaces.model.mindmap.MindmapNode getValue() {
		return (org.primefaces.model.mindmap.MindmapNode) getStateHelper().eval(PropertyKeys.value, null);
	}
	public void setValue(org.primefaces.model.mindmap.MindmapNode _value) {
		getStateHelper().put(PropertyKeys.value, _value);
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

	public int getEffectSpeed() {
		return (java.lang.Integer) getStateHelper().eval(PropertyKeys.effectSpeed, 300);
	}
	public void setEffectSpeed(int _effectSpeed) {
		getStateHelper().put(PropertyKeys.effectSpeed, _effectSpeed);
	}


    public final static String STYLE_CLASS = "ui-mindmap ui-widget ui-widget-content ui-corner-all";

    private static final Map<String, Class<? extends BehaviorEvent>> BEHAVIOR_EVENT_MAPPING = Collections.unmodifiableMap(new HashMap<String, Class<? extends BehaviorEvent>>() {{
        put("select", SelectEvent.class);
        put("dblselect", SelectEvent.class);
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

    private MindmapNode selectedNode = null;

    public MindmapNode getSelectedNode() {
        return selectedNode;
    }

    public String getSelectedNodeKey(FacesContext context) {
        return context.getExternalContext().getRequestParameterMap().get(this.getClientId(context) + "_nodeKey");
    }

    @Override
    public void queueEvent(FacesEvent event) {
        FacesContext context = getFacesContext();
        Map<String,String> params = context.getExternalContext().getRequestParameterMap();
        String clientId = this.getClientId(context);
        AjaxBehaviorEvent behaviorEvent = (AjaxBehaviorEvent) event;
        String eventName = params.get(Constants.RequestParams.PARTIAL_BEHAVIOR_EVENT_PARAM);

        if(eventName.equals("select")||eventName.equals("dblselect")) {
            String nodeKey = params.get(clientId + "_nodeKey");
            MindmapNode node = nodeKey.equals("root") ? this.getValue() : this.findNode(this.getValue(), nodeKey);
            this.selectedNode = node;
        
            super.queueEvent(new SelectEvent(this, behaviorEvent.getBehavior(), node));
        }
    }

    protected MindmapNode findNode(MindmapNode searchRoot, String rowKey) {
		String[] paths = rowKey.split("_");
		
		if(paths.length == 0)
			return null;
		
		int childIndex = Integer.parseInt(paths[0]);
		searchRoot = searchRoot.getChildren().get(childIndex);

		if(paths.length == 1) {
			return searchRoot;
		} 
		else {
			String relativeRowKey = rowKey.substring(rowKey.indexOf("_") + 1);
				
			return findNode(searchRoot, relativeRowKey);
		}
	}

    public boolean isNodeSelectRequest(FacesContext context) {
        if (!ComponentUtils.isRequestSource(this, context)) {
            return false;
        }
        Map<String,String> params = context.getExternalContext().getRequestParameterMap();
        String eventName = params.get(Constants.RequestParams.PARTIAL_BEHAVIOR_EVENT_PARAM);
        return eventName.equals("select");
    }
	public String resolveWidgetVar() {
		return ComponentUtils.resolveWidgetVar(getFacesContext(), this);
	}
}