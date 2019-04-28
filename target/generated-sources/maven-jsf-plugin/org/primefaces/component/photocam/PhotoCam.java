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
package org.primefaces.component.photocam;

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

@ResourceDependencies({
	@ResourceDependency(library="primefaces", name="components.css"),
	@ResourceDependency(library="primefaces", name="jquery/jquery.js"),
	@ResourceDependency(library="primefaces", name="core.js"),
	@ResourceDependency(library="primefaces", name="components.js"),
	@ResourceDependency(library="primefaces", name="photocam/photocam.js")
})
public class PhotoCam extends UIInput implements org.primefaces.component.api.Widget {


	public static final String COMPONENT_TYPE = "org.primefaces.component.PhotoCam";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";
	public static final String DEFAULT_RENDERER = "org.primefaces.component.PhotoCamRenderer";

	public enum PropertyKeys {

		widgetVar
		,style
		,styleClass
		,process
		,update
		,listener
		,width
		,height
		,photoWidth
		,photoHeight
		,format
		,jpegQuality
		,forceFlash
		,autoStart;

		String toString;

		PropertyKeys(String toString) {
			this.toString = toString;
		}

		PropertyKeys() {}

		public String toString() {
			return ((this.toString != null) ? this.toString : super.toString());
}
	}

	public PhotoCam() {
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

	public java.lang.String getProcess() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.process, null);
	}
	public void setProcess(java.lang.String _process) {
		getStateHelper().put(PropertyKeys.process, _process);
	}

	public java.lang.String getUpdate() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.update, null);
	}
	public void setUpdate(java.lang.String _update) {
		getStateHelper().put(PropertyKeys.update, _update);
	}

	public javax.el.MethodExpression getListener() {
		return (javax.el.MethodExpression) getStateHelper().eval(PropertyKeys.listener, null);
	}
	public void setListener(javax.el.MethodExpression _listener) {
		getStateHelper().put(PropertyKeys.listener, _listener);
	}

	public int getWidth() {
		return (java.lang.Integer) getStateHelper().eval(PropertyKeys.width, 320);
	}
	public void setWidth(int _width) {
		getStateHelper().put(PropertyKeys.width, _width);
	}

	public int getHeight() {
		return (java.lang.Integer) getStateHelper().eval(PropertyKeys.height, 240);
	}
	public void setHeight(int _height) {
		getStateHelper().put(PropertyKeys.height, _height);
	}

	public int getPhotoWidth() {
		return (java.lang.Integer) getStateHelper().eval(PropertyKeys.photoWidth, 320);
	}
	public void setPhotoWidth(int _photoWidth) {
		getStateHelper().put(PropertyKeys.photoWidth, _photoWidth);
	}

	public int getPhotoHeight() {
		return (java.lang.Integer) getStateHelper().eval(PropertyKeys.photoHeight, 240);
	}
	public void setPhotoHeight(int _photoHeight) {
		getStateHelper().put(PropertyKeys.photoHeight, _photoHeight);
	}

	public java.lang.String getFormat() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.format, null);
	}
	public void setFormat(java.lang.String _format) {
		getStateHelper().put(PropertyKeys.format, _format);
	}

	public int getJpegQuality() {
		return (java.lang.Integer) getStateHelper().eval(PropertyKeys.jpegQuality, 90);
	}
	public void setJpegQuality(int _jpegQuality) {
		getStateHelper().put(PropertyKeys.jpegQuality, _jpegQuality);
	}

	public boolean isForceFlash() {
		return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.forceFlash, false);
	}
	public void setForceFlash(boolean _forceFlash) {
		getStateHelper().put(PropertyKeys.forceFlash, _forceFlash);
	}

	public boolean isAutoStart() {
		return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.autoStart, true);
	}
	public void setAutoStart(boolean _autoStart) {
		getStateHelper().put(PropertyKeys.autoStart, _autoStart);
	}


    public void broadcast(javax.faces.event.FacesEvent event) throws javax.faces.event.AbortProcessingException {
		super.broadcast(event);
		
		FacesContext facesContext = getFacesContext();
		MethodExpression me = getListener();
		
		if (me != null && event instanceof org.primefaces.event.CaptureEvent) {
			me.invoke(facesContext.getELContext(), new Object[] {event});
		}
	}
	public String resolveWidgetVar() {
		return ComponentUtils.resolveWidgetVar(getFacesContext(), this);
	}
}