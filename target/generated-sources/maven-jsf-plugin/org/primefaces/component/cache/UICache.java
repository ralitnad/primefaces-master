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
package org.primefaces.component.cache;

import javax.faces.component.UIPanel;
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
import javax.faces.component.visit.VisitContext;

@ResourceDependencies({

})
public class UICache extends UIPanel {


	public static final String COMPONENT_TYPE = "org.primefaces.component.Cache";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";
	public static final String DEFAULT_RENDERER = "org.primefaces.component.UICacheRenderer";

	public enum PropertyKeys {

		disabled
		,region
		,key
		,processEvents;

		String toString;

		PropertyKeys(String toString) {
			this.toString = toString;
		}

		PropertyKeys() {}

		public String toString() {
			return ((this.toString != null) ? this.toString : super.toString());
}
	}

	public UICache() {
		setRendererType(DEFAULT_RENDERER);
	}

	public String getFamily() {
		return COMPONENT_FAMILY;
	}

	public boolean isDisabled() {
		return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.disabled, false);
	}
	public void setDisabled(boolean _disabled) {
		getStateHelper().put(PropertyKeys.disabled, _disabled);
	}

	public java.lang.String getRegion() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.region, null);
	}
	public void setRegion(java.lang.String _region) {
		getStateHelper().put(PropertyKeys.region, _region);
	}

	public java.lang.String getKey() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.key, null);
	}
	public void setKey(java.lang.String _key) {
		getStateHelper().put(PropertyKeys.key, _key);
	}

	public boolean isProcessEvents() {
		return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.processEvents, false);
	}
	public void setProcessEvents(boolean _processEvents) {
		getStateHelper().put(PropertyKeys.processEvents, _processEvents);
	}


    private boolean cacheSetInCurrentRequest = false;

    public boolean isCacheSetInCurrentRequest() {
        return this.cacheSetInCurrentRequest;
    }

    public void setCacheSetInCurrentRequest(boolean cacheSetInCurrentRequest) {
        this.cacheSetInCurrentRequest = cacheSetInCurrentRequest;
    }

    @Override
    protected boolean isVisitable(VisitContext visitContext) {
        return this.isDisabled() || this.isCacheSetInCurrentRequest();
    }

    protected boolean shouldProcess() {
        return this.isDisabled() || this.isCacheSetInCurrentRequest() || this.isProcessEvents();
    }

    @Override
    public void processDecodes(FacesContext context) {
        if(shouldProcess()) {
            super.processDecodes(context);
        }
    }

    @Override
    public void processValidators(FacesContext context) {
        if(shouldProcess()) {
            super.processValidators(context);
        }
    }

    @Override
    public void processUpdates(FacesContext context) {
        if(shouldProcess()) {
            super.processUpdates(context);
        }
    }
}