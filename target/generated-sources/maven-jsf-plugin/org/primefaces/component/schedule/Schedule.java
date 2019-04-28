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
package org.primefaces.component.schedule;

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
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
import java.util.Date;
import java.util.Calendar;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.TimeZone;
import javax.faces.component.UIComponent;
import javax.faces.event.FacesEvent;
import javax.faces.event.AjaxBehaviorEvent;
import org.primefaces.util.Constants;
import org.primefaces.util.LocaleUtils;
import org.primefaces.event.SelectEvent;
import org.primefaces.event.ScheduleEntryMoveEvent;
import org.primefaces.event.ScheduleEntryResizeEvent;
import org.primefaces.model.ScheduleModel;
import org.primefaces.model.ScheduleEvent;
import javax.faces.event.BehaviorEvent;

@ResourceDependencies({
	@ResourceDependency(library="primefaces", name="schedule/schedule.css"),
	@ResourceDependency(library="primefaces", name="components.css"),
	@ResourceDependency(library="primefaces", name="moment/moment.js"),
	@ResourceDependency(library="primefaces", name="jquery/jquery.js"),
	@ResourceDependency(library="primefaces", name="jquery/jquery-plugins.js"),
	@ResourceDependency(library="primefaces", name="core.js"),
	@ResourceDependency(library="primefaces", name="components.js"),
	@ResourceDependency(library="primefaces", name="schedule/schedule.js")
})
public class Schedule extends UIComponentBase implements org.primefaces.component.api.Widget,javax.faces.component.behavior.ClientBehaviorHolder,org.primefaces.component.api.PrimeClientBehaviorHolder {


	public static final String COMPONENT_TYPE = "org.primefaces.component.Schedule";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";
	public static final String DEFAULT_RENDERER = "org.primefaces.component.ScheduleRenderer";

	public enum PropertyKeys {

		widgetVar
		,value
		,locale
		,aspectRatio
		,view
		,initialDate
		,showWeekends
		,style
		,styleClass
		,draggable
		,resizable
		,showHeader
		,leftHeaderTemplate
		,centerHeaderTemplate
		,rightHeaderTemplate
		,allDaySlot
		,slotDuration
		,slotMinutes
		,scrollTime
		,firstHour
		,minTime
		,maxTime
		,slotLabelFormat
		,axisFormat
		,timeFormat
		,columnFormat
		,timeZone
		,clientTimeZone
		,ignoreTimezone
		,tooltip
		,showWeekNumbers
		,extender
		,displayEventEnd
		,weekNumberCalculation
		,weekNumberCalculator
		,nextDayThreshold
		,slotEventOverlap
		,urlTarget;

		String toString;

		PropertyKeys(String toString) {
			this.toString = toString;
		}

		PropertyKeys() {}

		public String toString() {
			return ((this.toString != null) ? this.toString : super.toString());
}
	}

	public Schedule() {
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

	public org.primefaces.model.ScheduleModel getValue() {
		return (org.primefaces.model.ScheduleModel) getStateHelper().eval(PropertyKeys.value, null);
	}
	public void setValue(org.primefaces.model.ScheduleModel _value) {
		getStateHelper().put(PropertyKeys.value, _value);
	}

	public java.lang.Object getLocale() {
		return (java.lang.Object) getStateHelper().eval(PropertyKeys.locale, null);
	}
	public void setLocale(java.lang.Object _locale) {
		getStateHelper().put(PropertyKeys.locale, _locale);
	}

	public double getAspectRatio() {
		return (java.lang.Double) getStateHelper().eval(PropertyKeys.aspectRatio, java.lang.Double.MIN_VALUE);
	}
	public void setAspectRatio(double _aspectRatio) {
		getStateHelper().put(PropertyKeys.aspectRatio, _aspectRatio);
	}

	public java.lang.String getView() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.view, "month");
	}
	public void setView(java.lang.String _view) {
		getStateHelper().put(PropertyKeys.view, _view);
	}

	public java.lang.Object getInitialDate() {
		return (java.lang.Object) getStateHelper().eval(PropertyKeys.initialDate, null);
	}
	public void setInitialDate(java.lang.Object _initialDate) {
		getStateHelper().put(PropertyKeys.initialDate, _initialDate);
	}

	public boolean isShowWeekends() {
		return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.showWeekends, true);
	}
	public void setShowWeekends(boolean _showWeekends) {
		getStateHelper().put(PropertyKeys.showWeekends, _showWeekends);
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

	public boolean isDraggable() {
		return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.draggable, true);
	}
	public void setDraggable(boolean _draggable) {
		getStateHelper().put(PropertyKeys.draggable, _draggable);
	}

	public boolean isResizable() {
		return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.resizable, true);
	}
	public void setResizable(boolean _resizable) {
		getStateHelper().put(PropertyKeys.resizable, _resizable);
	}

	public boolean isShowHeader() {
		return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.showHeader, true);
	}
	public void setShowHeader(boolean _showHeader) {
		getStateHelper().put(PropertyKeys.showHeader, _showHeader);
	}

	public java.lang.String getLeftHeaderTemplate() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.leftHeaderTemplate, "prev,next today");
	}
	public void setLeftHeaderTemplate(java.lang.String _leftHeaderTemplate) {
		getStateHelper().put(PropertyKeys.leftHeaderTemplate, _leftHeaderTemplate);
	}

	public java.lang.String getCenterHeaderTemplate() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.centerHeaderTemplate, "title");
	}
	public void setCenterHeaderTemplate(java.lang.String _centerHeaderTemplate) {
		getStateHelper().put(PropertyKeys.centerHeaderTemplate, _centerHeaderTemplate);
	}

	public java.lang.String getRightHeaderTemplate() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.rightHeaderTemplate, "month,agendaWeek,agendaDay");
	}
	public void setRightHeaderTemplate(java.lang.String _rightHeaderTemplate) {
		getStateHelper().put(PropertyKeys.rightHeaderTemplate, _rightHeaderTemplate);
	}

	public boolean isAllDaySlot() {
		return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.allDaySlot, true);
	}
	public void setAllDaySlot(boolean _allDaySlot) {
		getStateHelper().put(PropertyKeys.allDaySlot, _allDaySlot);
	}

	public java.lang.String getSlotDuration() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.slotDuration, "00:30:00");
	}
	public void setSlotDuration(java.lang.String _slotDuration) {
		getStateHelper().put(PropertyKeys.slotDuration, _slotDuration);
	}

	public int getSlotMinutes() {
		return (java.lang.Integer) getStateHelper().eval(PropertyKeys.slotMinutes, 30);
	}
	public void setSlotMinutes(int _slotMinutes) {
		getStateHelper().put(PropertyKeys.slotMinutes, _slotMinutes);
	}

	public java.lang.String getScrollTime() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.scrollTime, "06:00:00");
	}
	public void setScrollTime(java.lang.String _scrollTime) {
		getStateHelper().put(PropertyKeys.scrollTime, _scrollTime);
	}

	public int getFirstHour() {
		return (java.lang.Integer) getStateHelper().eval(PropertyKeys.firstHour, 6);
	}
	public void setFirstHour(int _firstHour) {
		getStateHelper().put(PropertyKeys.firstHour, _firstHour);
	}

	public java.lang.String getMinTime() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.minTime, null);
	}
	public void setMinTime(java.lang.String _minTime) {
		getStateHelper().put(PropertyKeys.minTime, _minTime);
	}

	public java.lang.String getMaxTime() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.maxTime, null);
	}
	public void setMaxTime(java.lang.String _maxTime) {
		getStateHelper().put(PropertyKeys.maxTime, _maxTime);
	}

	public java.lang.String getSlotLabelFormat() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.slotLabelFormat, null);
	}
	public void setSlotLabelFormat(java.lang.String _slotLabelFormat) {
		getStateHelper().put(PropertyKeys.slotLabelFormat, _slotLabelFormat);
	}

	public java.lang.String getAxisFormat() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.axisFormat, null);
	}
	public void setAxisFormat(java.lang.String _axisFormat) {
		getStateHelper().put(PropertyKeys.axisFormat, _axisFormat);
	}

	public java.lang.String getTimeFormat() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.timeFormat, null);
	}
	public void setTimeFormat(java.lang.String _timeFormat) {
		getStateHelper().put(PropertyKeys.timeFormat, _timeFormat);
	}

	public java.lang.String getColumnFormat() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.columnFormat, null);
	}
	public void setColumnFormat(java.lang.String _columnFormat) {
		getStateHelper().put(PropertyKeys.columnFormat, _columnFormat);
	}

	public java.lang.Object getTimeZone() {
		return (java.lang.Object) getStateHelper().eval(PropertyKeys.timeZone, null);
	}
	public void setTimeZone(java.lang.Object _timeZone) {
		getStateHelper().put(PropertyKeys.timeZone, _timeZone);
	}

	public java.lang.String getClientTimeZone() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.clientTimeZone, null);
	}
	public void setClientTimeZone(java.lang.String _clientTimeZone) {
		getStateHelper().put(PropertyKeys.clientTimeZone, _clientTimeZone);
	}

	public boolean isIgnoreTimezone() {
		return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.ignoreTimezone, true);
	}
	public void setIgnoreTimezone(boolean _ignoreTimezone) {
		getStateHelper().put(PropertyKeys.ignoreTimezone, _ignoreTimezone);
	}

	public boolean isTooltip() {
		return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.tooltip, false);
	}
	public void setTooltip(boolean _tooltip) {
		getStateHelper().put(PropertyKeys.tooltip, _tooltip);
	}

	public boolean isShowWeekNumbers() {
		return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.showWeekNumbers, false);
	}
	public void setShowWeekNumbers(boolean _showWeekNumbers) {
		getStateHelper().put(PropertyKeys.showWeekNumbers, _showWeekNumbers);
	}

	public java.lang.String getExtender() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.extender, null);
	}
	public void setExtender(java.lang.String _extender) {
		getStateHelper().put(PropertyKeys.extender, _extender);
	}

	public java.lang.String getDisplayEventEnd() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.displayEventEnd, null);
	}
	public void setDisplayEventEnd(java.lang.String _displayEventEnd) {
		getStateHelper().put(PropertyKeys.displayEventEnd, _displayEventEnd);
	}

	public java.lang.String getWeekNumberCalculation() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.weekNumberCalculation, "local");
	}
	public void setWeekNumberCalculation(java.lang.String _weekNumberCalculation) {
		getStateHelper().put(PropertyKeys.weekNumberCalculation, _weekNumberCalculation);
	}

	public java.lang.String getWeekNumberCalculator() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.weekNumberCalculator, null);
	}
	public void setWeekNumberCalculator(java.lang.String _weekNumberCalculator) {
		getStateHelper().put(PropertyKeys.weekNumberCalculator, _weekNumberCalculator);
	}

	public java.lang.String getNextDayThreshold() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.nextDayThreshold, "09:00:00");
	}
	public void setNextDayThreshold(java.lang.String _nextDayThreshold) {
		getStateHelper().put(PropertyKeys.nextDayThreshold, _nextDayThreshold);
	}

	public boolean isSlotEventOverlap() {
		return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.slotEventOverlap, true);
	}
	public void setSlotEventOverlap(boolean _slotEventOverlap) {
		getStateHelper().put(PropertyKeys.slotEventOverlap, _slotEventOverlap);
	}

	public java.lang.String getUrlTarget() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.urlTarget, "_blank");
	}
	public void setUrlTarget(java.lang.String _urlTarget) {
		getStateHelper().put(PropertyKeys.urlTarget, _urlTarget);
	}


    private static final TimeZone DEFAULT_TIME_ZONE = TimeZone.getTimeZone("UTC");

    private static final Map<String, Class<? extends BehaviorEvent>> BEHAVIOR_EVENT_MAPPING = Collections.unmodifiableMap(new HashMap<String, Class<? extends BehaviorEvent>>() {{
        put("dateSelect", SelectEvent.class);
        put("eventSelect", SelectEvent.class);
        put("eventMove", ScheduleEntryMoveEvent.class);
        put("eventResize", ScheduleEntryResizeEvent.class);
        put("viewChange", SelectEvent.class);
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


	private java.util.Locale appropriateLocale;
	
	java.util.Locale calculateLocale(FacesContext facesContext) {
		if(appropriateLocale == null) {
		    appropriateLocale = LocaleUtils.resolveLocale(getLocale(), this.getClientId(facesContext));
		}
		
		return appropriateLocale;
	}

    private TimeZone appropriateTimeZone;

	protected TimeZone calculateTimeZone() {
		if(appropriateTimeZone == null) {
			Object usertimeZone = getTimeZone();
			if(usertimeZone != null) {
				if(usertimeZone instanceof String)
					appropriateTimeZone =  TimeZone.getTimeZone((String) usertimeZone);
				else if(usertimeZone instanceof java.util.TimeZone)
					appropriateTimeZone = (TimeZone) usertimeZone;
				else
					throw new IllegalArgumentException("TimeZone could be either String or java.util.TimeZone");
			} else {
				appropriateTimeZone = DEFAULT_TIME_ZONE;
			}
		}
		
		return appropriateTimeZone;
	}

	@Override
    public void queueEvent(FacesEvent event) {
        FacesContext context = getFacesContext();
        Map<String,String> params = context.getExternalContext().getRequestParameterMap();
        String eventName = params.get(Constants.RequestParams.PARTIAL_BEHAVIOR_EVENT_PARAM);
        String clientId = this.getClientId(context);
        TimeZone tz = calculateTimeZone();

        if(isSelfRequest(context)) {

            AjaxBehaviorEvent behaviorEvent = (AjaxBehaviorEvent) event;
            FacesEvent wrapperEvent = null;

            if(eventName.equals("dateSelect")) {
                Long milliseconds = Long.valueOf(params.get(clientId + "_selectedDate"));
                Calendar calendar = Calendar.getInstance(tz);
                calendar.setTimeInMillis(milliseconds - tz.getOffset(milliseconds));
                Date selectedDate = calendar.getTime();
                SelectEvent selectEvent = new SelectEvent(this, behaviorEvent.getBehavior(), selectedDate);
                selectEvent.setPhaseId(behaviorEvent.getPhaseId());

                wrapperEvent = selectEvent;
            }
            else if(eventName.equals("eventSelect")) {
                String selectedEventId = params.get(clientId + "_selectedEventId");
				ScheduleEvent selectedEvent = this.getValue().getEvent(selectedEventId);

                wrapperEvent = new SelectEvent(this, behaviorEvent.getBehavior(), selectedEvent);
            }
            else if(eventName.equals("eventMove")) {
                String movedEventId = params.get(clientId + "_movedEventId");
				ScheduleEvent movedEvent = this.getValue().getEvent(movedEventId);
                int dayDelta = (int) Double.parseDouble(params.get(clientId + "_dayDelta"));
				int minuteDelta = (int) Double.parseDouble(params.get(clientId + "_minuteDelta"));

                Calendar calendar = Calendar.getInstance();
                calendar.setTime(movedEvent.getStartDate());
                calendar.setTimeZone(tz);
                calendar.add(Calendar.DATE, dayDelta);
                calendar.add(Calendar.MINUTE, minuteDelta);
                movedEvent.getStartDate().setTime(calendar.getTimeInMillis());

                calendar = Calendar.getInstance();
                calendar.setTime(movedEvent.getEndDate());
                calendar.setTimeZone(tz);
                calendar.add(Calendar.DATE, dayDelta);
                calendar.add(Calendar.MINUTE, minuteDelta);
				movedEvent.getEndDate().setTime(calendar.getTimeInMillis());

                wrapperEvent = new ScheduleEntryMoveEvent(this, behaviorEvent.getBehavior(), movedEvent, dayDelta, minuteDelta);
            }
            else if(eventName.equals("eventResize")) {
                String resizedEventId = params.get(clientId + "_resizedEventId");
				ScheduleEvent resizedEvent = this.getValue().getEvent(resizedEventId);
                int dayDelta = Integer.valueOf(params.get(clientId + "_dayDelta"));
				int minuteDelta = Integer.valueOf(params.get(clientId + "_minuteDelta"));

                Calendar calendar = Calendar.getInstance();
                calendar.setTime(resizedEvent.getEndDate());
                calendar.setTimeZone(tz);
				calendar.add(Calendar.DATE, dayDelta);
                calendar.add(Calendar.MINUTE, minuteDelta);
				resizedEvent.getEndDate().setTime(calendar.getTimeInMillis());

                wrapperEvent = new ScheduleEntryResizeEvent(this, behaviorEvent.getBehavior(), resizedEvent, dayDelta, minuteDelta);
            }
            else if(eventName.equals("viewChange")) {
				wrapperEvent = new SelectEvent(this, behaviorEvent.getBehavior(), this.getView());
            }

            wrapperEvent.setPhaseId(behaviorEvent.getPhaseId());

            super.queueEvent(wrapperEvent);
        }
        else {
            super.queueEvent(event);
        }
    }

    private boolean isSelfRequest(FacesContext context) {
        return this.getClientId(context).equals(context.getExternalContext().getRequestParameterMap().get(Constants.RequestParams.PARTIAL_SOURCE_PARAM));
    }

    @Override
    public void processUpdates(FacesContext context) {
        if(!isRendered()) {
            return;
        }

        super.processUpdates(context);

        ValueExpression expr = this.getValueExpression(PropertyKeys.view.toString());
        if(expr != null) {
            expr.setValue(getFacesContext().getELContext(), this.getView());
            getStateHelper().remove(PropertyKeys.view);
        }
    }
	public String resolveWidgetVar() {
		return ComponentUtils.resolveWidgetVar(getFacesContext(), this);
	}
}