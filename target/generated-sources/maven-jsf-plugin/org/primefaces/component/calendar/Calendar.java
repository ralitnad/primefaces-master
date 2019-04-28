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
package org.primefaces.component.calendar;

import javax.faces.component.html.HtmlInputText;
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
import org.primefaces.component.calendar.Calendar;
import org.primefaces.event.SelectEvent;
import org.primefaces.event.DateViewChangeEvent;
import org.primefaces.util.HTML;
import org.primefaces.util.ArrayUtils;
import org.primefaces.util.Constants;
import org.primefaces.util.ComponentUtils;
import org.primefaces.util.LocaleUtils;
import org.primefaces.util.MessageFactory;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
import java.util.Date;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.faces.application.FacesMessage;
import javax.faces.convert.Converter;
import javax.faces.event.AjaxBehaviorEvent;
import javax.faces.event.FacesEvent;
import javax.faces.event.PhaseId;
import org.primefaces.context.PrimeApplicationContext;
import org.primefaces.convert.DateTimeConverter;

@ResourceDependencies({
	@ResourceDependency(library="primefaces", name="components.css"),
	@ResourceDependency(library="primefaces", name="jquery/jquery.js"),
	@ResourceDependency(library="primefaces", name="jquery/jquery-plugins.js"),
	@ResourceDependency(library="primefaces", name="core.js"),
	@ResourceDependency(library="primefaces", name="components.js")
})
public class Calendar extends HtmlInputText implements org.primefaces.component.api.Widget,org.primefaces.component.api.InputHolder,org.primefaces.component.api.MixedClientBehaviorHolder {


	public static final String COMPONENT_TYPE = "org.primefaces.component.Calendar";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";
	public static final String DEFAULT_RENDERER = "org.primefaces.component.CalendarRenderer";

	public enum PropertyKeys {

		placeholder
		,widgetVar
		,mindate
		,maxdate
		,pages
		,mode
		,pattern
		,locale
		,navigator
		,timeZone
		,readonlyInput
		,showButtonPanel
		,effect
		,effectDuration
		,showOn
		,showWeek
		,disabledWeekends
		,showOtherMonths
		,selectOtherMonths
		,yearRange
		,timeOnly
		,stepHour
		,stepMinute
		,stepSecond
		,minHour
		,maxHour
		,minMinute
		,maxMinute
		,minSecond
		,maxSecond
		,pagedate
		,beforeShowDay
		,mask
		,timeControlType
		,beforeShow
		,maskSlotChar
		,maskAutoClear
		,timeControlObject
		,timeInput
		,showHour
		,showMinute
		,showSecond
		,showMillisec
		,showTodayButton
		,buttonTabindex
		,inputStyle
		,inputStyleClass
		,type
		,focusOnSelect
		,oneLine
		,defaultHour
		,defaultMinute
		,defaultSecond
		,defaultMillisec;

		String toString;

		PropertyKeys(String toString) {
			this.toString = toString;
		}

		PropertyKeys() {}

		public String toString() {
			return ((this.toString != null) ? this.toString : super.toString());
}
	}

	public Calendar() {
		setRendererType(DEFAULT_RENDERER);
	}

	public String getFamily() {
		return COMPONENT_FAMILY;
	}

	public java.lang.String getPlaceholder() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.placeholder, null);
	}
	public void setPlaceholder(java.lang.String _placeholder) {
		getStateHelper().put(PropertyKeys.placeholder, _placeholder);
	}

	public java.lang.String getWidgetVar() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.widgetVar, null);
	}
	public void setWidgetVar(java.lang.String _widgetVar) {
		getStateHelper().put(PropertyKeys.widgetVar, _widgetVar);
	}

	public java.lang.Object getMindate() {
		return (java.lang.Object) getStateHelper().eval(PropertyKeys.mindate, null);
	}
	public void setMindate(java.lang.Object _mindate) {
		getStateHelper().put(PropertyKeys.mindate, _mindate);
	}

	public java.lang.Object getMaxdate() {
		return (java.lang.Object) getStateHelper().eval(PropertyKeys.maxdate, null);
	}
	public void setMaxdate(java.lang.Object _maxdate) {
		getStateHelper().put(PropertyKeys.maxdate, _maxdate);
	}

	public int getPages() {
		return (java.lang.Integer) getStateHelper().eval(PropertyKeys.pages, 1);
	}
	public void setPages(int _pages) {
		getStateHelper().put(PropertyKeys.pages, _pages);
	}

	public java.lang.String getMode() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.mode, "popup");
	}
	public void setMode(java.lang.String _mode) {
		getStateHelper().put(PropertyKeys.mode, _mode);
	}

	public java.lang.String getPattern() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.pattern, null);
	}
	public void setPattern(java.lang.String _pattern) {
		getStateHelper().put(PropertyKeys.pattern, _pattern);
	}

	public java.lang.Object getLocale() {
		return (java.lang.Object) getStateHelper().eval(PropertyKeys.locale, null);
	}
	public void setLocale(java.lang.Object _locale) {
		getStateHelper().put(PropertyKeys.locale, _locale);
	}

	public boolean isNavigator() {
		return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.navigator, false);
	}
	public void setNavigator(boolean _navigator) {
		getStateHelper().put(PropertyKeys.navigator, _navigator);
	}

	public java.lang.Object getTimeZone() {
		return (java.lang.Object) getStateHelper().eval(PropertyKeys.timeZone, null);
	}
	public void setTimeZone(java.lang.Object _timeZone) {
		getStateHelper().put(PropertyKeys.timeZone, _timeZone);
	}

	public boolean isReadonlyInput() {
		return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.readonlyInput, false);
	}
	public void setReadonlyInput(boolean _readonlyInput) {
		getStateHelper().put(PropertyKeys.readonlyInput, _readonlyInput);
	}

	public boolean isShowButtonPanel() {
		return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.showButtonPanel, false);
	}
	public void setShowButtonPanel(boolean _showButtonPanel) {
		getStateHelper().put(PropertyKeys.showButtonPanel, _showButtonPanel);
	}

	public java.lang.String getEffect() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.effect, null);
	}
	public void setEffect(java.lang.String _effect) {
		getStateHelper().put(PropertyKeys.effect, _effect);
	}

	public java.lang.String getEffectDuration() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.effectDuration, "normal");
	}
	public void setEffectDuration(java.lang.String _effectDuration) {
		getStateHelper().put(PropertyKeys.effectDuration, _effectDuration);
	}

	public java.lang.String getShowOn() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.showOn, "focus");
	}
	public void setShowOn(java.lang.String _showOn) {
		getStateHelper().put(PropertyKeys.showOn, _showOn);
	}

	public boolean isShowWeek() {
		return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.showWeek, false);
	}
	public void setShowWeek(boolean _showWeek) {
		getStateHelper().put(PropertyKeys.showWeek, _showWeek);
	}

	public boolean isDisabledWeekends() {
		return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.disabledWeekends, false);
	}
	public void setDisabledWeekends(boolean _disabledWeekends) {
		getStateHelper().put(PropertyKeys.disabledWeekends, _disabledWeekends);
	}

	public boolean isShowOtherMonths() {
		return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.showOtherMonths, false);
	}
	public void setShowOtherMonths(boolean _showOtherMonths) {
		getStateHelper().put(PropertyKeys.showOtherMonths, _showOtherMonths);
	}

	public boolean isSelectOtherMonths() {
		return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.selectOtherMonths, false);
	}
	public void setSelectOtherMonths(boolean _selectOtherMonths) {
		getStateHelper().put(PropertyKeys.selectOtherMonths, _selectOtherMonths);
	}

	public java.lang.String getYearRange() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.yearRange, null);
	}
	public void setYearRange(java.lang.String _yearRange) {
		getStateHelper().put(PropertyKeys.yearRange, _yearRange);
	}

	public boolean isTimeOnly() {
		return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.timeOnly, false);
	}
	public void setTimeOnly(boolean _timeOnly) {
		getStateHelper().put(PropertyKeys.timeOnly, _timeOnly);
	}

	public int getStepHour() {
		return (java.lang.Integer) getStateHelper().eval(PropertyKeys.stepHour, 1);
	}
	public void setStepHour(int _stepHour) {
		getStateHelper().put(PropertyKeys.stepHour, _stepHour);
	}

	public int getStepMinute() {
		return (java.lang.Integer) getStateHelper().eval(PropertyKeys.stepMinute, 1);
	}
	public void setStepMinute(int _stepMinute) {
		getStateHelper().put(PropertyKeys.stepMinute, _stepMinute);
	}

	public int getStepSecond() {
		return (java.lang.Integer) getStateHelper().eval(PropertyKeys.stepSecond, 1);
	}
	public void setStepSecond(int _stepSecond) {
		getStateHelper().put(PropertyKeys.stepSecond, _stepSecond);
	}

	public int getMinHour() {
		return (java.lang.Integer) getStateHelper().eval(PropertyKeys.minHour, 0);
	}
	public void setMinHour(int _minHour) {
		getStateHelper().put(PropertyKeys.minHour, _minHour);
	}

	public int getMaxHour() {
		return (java.lang.Integer) getStateHelper().eval(PropertyKeys.maxHour, 23);
	}
	public void setMaxHour(int _maxHour) {
		getStateHelper().put(PropertyKeys.maxHour, _maxHour);
	}

	public int getMinMinute() {
		return (java.lang.Integer) getStateHelper().eval(PropertyKeys.minMinute, 0);
	}
	public void setMinMinute(int _minMinute) {
		getStateHelper().put(PropertyKeys.minMinute, _minMinute);
	}

	public int getMaxMinute() {
		return (java.lang.Integer) getStateHelper().eval(PropertyKeys.maxMinute, 59);
	}
	public void setMaxMinute(int _maxMinute) {
		getStateHelper().put(PropertyKeys.maxMinute, _maxMinute);
	}

	public int getMinSecond() {
		return (java.lang.Integer) getStateHelper().eval(PropertyKeys.minSecond, 0);
	}
	public void setMinSecond(int _minSecond) {
		getStateHelper().put(PropertyKeys.minSecond, _minSecond);
	}

	public int getMaxSecond() {
		return (java.lang.Integer) getStateHelper().eval(PropertyKeys.maxSecond, 59);
	}
	public void setMaxSecond(int _maxSecond) {
		getStateHelper().put(PropertyKeys.maxSecond, _maxSecond);
	}

	public java.lang.Object getPagedate() {
		return (java.lang.Object) getStateHelper().eval(PropertyKeys.pagedate, null);
	}
	public void setPagedate(java.lang.Object _pagedate) {
		getStateHelper().put(PropertyKeys.pagedate, _pagedate);
	}

	public java.lang.String getBeforeShowDay() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.beforeShowDay, null);
	}
	public void setBeforeShowDay(java.lang.String _beforeShowDay) {
		getStateHelper().put(PropertyKeys.beforeShowDay, _beforeShowDay);
	}

	public java.lang.String getMask() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.mask, "false");
	}
	public void setMask(java.lang.String _mask) {
		getStateHelper().put(PropertyKeys.mask, _mask);
	}

	public java.lang.String getTimeControlType() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.timeControlType, "slider");
	}
	public void setTimeControlType(java.lang.String _timeControlType) {
		getStateHelper().put(PropertyKeys.timeControlType, _timeControlType);
	}

	public java.lang.String getBeforeShow() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.beforeShow, null);
	}
	public void setBeforeShow(java.lang.String _beforeShow) {
		getStateHelper().put(PropertyKeys.beforeShow, _beforeShow);
	}

	public java.lang.String getMaskSlotChar() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.maskSlotChar, null);
	}
	public void setMaskSlotChar(java.lang.String _maskSlotChar) {
		getStateHelper().put(PropertyKeys.maskSlotChar, _maskSlotChar);
	}

	public boolean isMaskAutoClear() {
		return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.maskAutoClear, true);
	}
	public void setMaskAutoClear(boolean _maskAutoClear) {
		getStateHelper().put(PropertyKeys.maskAutoClear, _maskAutoClear);
	}

	public java.lang.String getTimeControlObject() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.timeControlObject, null);
	}
	public void setTimeControlObject(java.lang.String _timeControlObject) {
		getStateHelper().put(PropertyKeys.timeControlObject, _timeControlObject);
	}

	public boolean isTimeInput() {
		return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.timeInput, false);
	}
	public void setTimeInput(boolean _timeInput) {
		getStateHelper().put(PropertyKeys.timeInput, _timeInput);
	}

	public java.lang.String getShowHour() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.showHour, null);
	}
	public void setShowHour(java.lang.String _showHour) {
		getStateHelper().put(PropertyKeys.showHour, _showHour);
	}

	public java.lang.String getShowMinute() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.showMinute, null);
	}
	public void setShowMinute(java.lang.String _showMinute) {
		getStateHelper().put(PropertyKeys.showMinute, _showMinute);
	}

	public java.lang.String getShowSecond() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.showSecond, null);
	}
	public void setShowSecond(java.lang.String _showSecond) {
		getStateHelper().put(PropertyKeys.showSecond, _showSecond);
	}

	public java.lang.String getShowMillisec() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.showMillisec, null);
	}
	public void setShowMillisec(java.lang.String _showMillisec) {
		getStateHelper().put(PropertyKeys.showMillisec, _showMillisec);
	}

	public boolean isShowTodayButton() {
		return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.showTodayButton, true);
	}
	public void setShowTodayButton(boolean _showTodayButton) {
		getStateHelper().put(PropertyKeys.showTodayButton, _showTodayButton);
	}

	public java.lang.String getButtonTabindex() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.buttonTabindex, null);
	}
	public void setButtonTabindex(java.lang.String _buttonTabindex) {
		getStateHelper().put(PropertyKeys.buttonTabindex, _buttonTabindex);
	}

	public java.lang.String getInputStyle() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.inputStyle, null);
	}
	public void setInputStyle(java.lang.String _inputStyle) {
		getStateHelper().put(PropertyKeys.inputStyle, _inputStyle);
	}

	public java.lang.String getInputStyleClass() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.inputStyleClass, null);
	}
	public void setInputStyleClass(java.lang.String _inputStyleClass) {
		getStateHelper().put(PropertyKeys.inputStyleClass, _inputStyleClass);
	}

	public java.lang.String getType() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.type, "text");
	}
	public void setType(java.lang.String _type) {
		getStateHelper().put(PropertyKeys.type, _type);
	}

	public boolean isFocusOnSelect() {
		return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.focusOnSelect, false);
	}
	public void setFocusOnSelect(boolean _focusOnSelect) {
		getStateHelper().put(PropertyKeys.focusOnSelect, _focusOnSelect);
	}

	public boolean isOneLine() {
		return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.oneLine, false);
	}
	public void setOneLine(boolean _oneLine) {
		getStateHelper().put(PropertyKeys.oneLine, _oneLine);
	}

	public int getDefaultHour() {
		return (java.lang.Integer) getStateHelper().eval(PropertyKeys.defaultHour, 0);
	}
	public void setDefaultHour(int _defaultHour) {
		getStateHelper().put(PropertyKeys.defaultHour, _defaultHour);
	}

	public int getDefaultMinute() {
		return (java.lang.Integer) getStateHelper().eval(PropertyKeys.defaultMinute, 0);
	}
	public void setDefaultMinute(int _defaultMinute) {
		getStateHelper().put(PropertyKeys.defaultMinute, _defaultMinute);
	}

	public int getDefaultSecond() {
		return (java.lang.Integer) getStateHelper().eval(PropertyKeys.defaultSecond, 0);
	}
	public void setDefaultSecond(int _defaultSecond) {
		getStateHelper().put(PropertyKeys.defaultSecond, _defaultSecond);
	}

	public int getDefaultMillisec() {
		return (java.lang.Integer) getStateHelper().eval(PropertyKeys.defaultMillisec, 0);
	}
	public void setDefaultMillisec(int _defaultMillisec) {
		getStateHelper().put(PropertyKeys.defaultMillisec, _defaultMillisec);
	}


    public final static String CONTAINER_CLASS = "ui-calendar";
    public final static String INPUT_STYLE_CLASS = "ui-inputfield ui-widget ui-state-default ui-corner-all";

    private static final Collection<String> EVENT_NAMES = Collections.unmodifiableCollection(Arrays.asList("blur","change","valueChange","click","dblclick","focus","keydown","keypress","keyup","mousedown","mousemove","mouseout","mouseover","mouseup","select","dateSelect","viewChange","close"));
    private static final Collection<String> UNOBSTRUSIVE_EVENT_NAMES = Collections.unmodifiableCollection(Arrays.asList("dateSelect","viewChange","close"));

    private Map<String,AjaxBehaviorEvent> customEvents = new HashMap<String,AjaxBehaviorEvent>();

    private java.util.Locale calculatedLocale;
    private java.util.TimeZone appropriateTimeZone;
    
    public java.util.Locale calculateLocale(FacesContext facesContext) {
        if (calculatedLocale == null) {
           calculatedLocale = LocaleUtils.resolveLocale(getLocale(), this.getClientId(facesContext));
        }
        
        return calculatedLocale;
    }
    
    public java.util.TimeZone calculateTimeZone() {
        if(appropriateTimeZone == null) {
            Object usertimeZone = getTimeZone();
            if(usertimeZone != null) {
                if(usertimeZone instanceof String)
                    appropriateTimeZone =  java.util.TimeZone.getTimeZone((String) usertimeZone);
                else if(usertimeZone instanceof java.util.TimeZone)
                    appropriateTimeZone = (java.util.TimeZone) usertimeZone;
                else
                    throw new IllegalArgumentException("TimeZone could be either String or java.util.TimeZone");
            } else {
                appropriateTimeZone = java.util.TimeZone.getDefault();
            }
        }
        
        return appropriateTimeZone;
    }
    
    public boolean isPopup() {
        return getMode().equalsIgnoreCase("popup");
    }

    public boolean hasTime() {
        String pattern = getPattern();

        return (pattern != null && (pattern.contains("HH") || pattern.contains("mm") || pattern.contains("ss")));
    }

    @Override
    public Collection<String> getEventNames() {
        return EVENT_NAMES;
    }

    @Override
    public Collection<String> getUnobstrusiveEventNames() {
        return UNOBSTRUSIVE_EVENT_NAMES;
    }

    @Override
    public void queueEvent(FacesEvent event) {
        FacesContext context = getFacesContext();

        if(ComponentUtils.isRequestSource(this, context) && (event instanceof AjaxBehaviorEvent)) {
            Map<String,String> params = context.getExternalContext().getRequestParameterMap();
            String eventName = params.get(Constants.RequestParams.PARTIAL_BEHAVIOR_EVENT_PARAM);
            String clientId = this.getClientId(context);
            AjaxBehaviorEvent behaviorEvent = (AjaxBehaviorEvent) event;

            if(eventName != null) {
                if(eventName.equals("dateSelect")) {
                    customEvents.put("dateSelect", (AjaxBehaviorEvent) event);
                }
                else if(eventName.equals("close")) {
                    customEvents.put("close", (AjaxBehaviorEvent) event);
                }
                else if(eventName.equals("viewChange")) {
                    int month = Integer.parseInt(params.get(clientId + "_month"));
                    int year = Integer.parseInt(params.get(clientId + "_year"));
                    DateViewChangeEvent dateViewChangeEvent = new DateViewChangeEvent(this, behaviorEvent.getBehavior(), month, year);
                    dateViewChangeEvent.setPhaseId(behaviorEvent.getPhaseId());
                    super.queueEvent(dateViewChangeEvent);
                }
                else {
                    super.queueEvent(event);        //regular events like change, click, blur
                }
            } 
        }
        else {
            super.queueEvent(event);            //valueChange
        }
    }

    @Override
    public void validate(FacesContext context) {
        super.validate(context);
       
        if(isValid() && ComponentUtils.isRequestSource(this, context)) {
            for(Iterator<String> customEventIter = customEvents.keySet().iterator(); customEventIter.hasNext();) {
                AjaxBehaviorEvent behaviorEvent = customEvents.get(customEventIter.next());
                SelectEvent selectEvent = new SelectEvent(this, behaviorEvent.getBehavior(), this.getValue());

                if(behaviorEvent.getPhaseId().equals(PhaseId.APPLY_REQUEST_VALUES)) {
                    selectEvent.setPhaseId(PhaseId.PROCESS_VALIDATIONS);
                }
                else {
                    selectEvent.setPhaseId(PhaseId.INVOKE_APPLICATION);
                }

                super.queueEvent(selectEvent);
            }
        }
    }

    public final static String DATE_OUT_OF_RANGE_MESSAGE_ID = "primefaces.calendar.OUT_OF_RANGE";

    @Override
    protected void validateValue(FacesContext context, Object value) {
        super.validateValue(context, value);

        if (isValid() && !isEmpty(value) && value instanceof Date) {
            Date date = (Date) value;
            
            Date minDate = CalendarUtils.getObjectAsDate(context, this, getMindate());
            if (minDate != null && date.before(minDate)) {
                setValid(false);
            }
            
            if (isValid()) {
                Date maxDate = CalendarUtils.getObjectAsDate(context, this, getMaxdate());
                if (maxDate != null && date.after(maxDate)) {
                    setValid(false);
                }
            }
            
            if (!isValid()) {
                FacesMessage msg = null;
                String validatorMessage = getValidatorMessage();
                if (validatorMessage != null) {
                    msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, validatorMessage, validatorMessage);
                } 
                else {
                    msg = MessageFactory.getMessage(DATE_OUT_OF_RANGE_MESSAGE_ID, FacesMessage.SEVERITY_ERROR, null);
                }
                context.addMessage(getClientId(context), msg);
            }
        }
    }
    
    public String calculatePattern() {
        String pattern = this.getPattern();
        Locale locale = this.calculateLocale(getFacesContext());

        return pattern == null ? ((SimpleDateFormat) DateFormat.getDateInstance(DateFormat.SHORT, locale)).toPattern() : pattern;
    }

    private String timeOnlyPattern = null;

    public String calculateTimeOnlyPattern() {
        if(timeOnlyPattern == null) {
            String localePattern = ((SimpleDateFormat) DateFormat.getDateInstance(DateFormat.SHORT, calculateLocale(getFacesContext()))).toPattern();
            String userTimePattern = getPattern();

            timeOnlyPattern = localePattern + " " + userTimePattern;
        }

        return timeOnlyPattern;
    }

    private boolean conversionFailed = false;

    public void setConversionFailed(boolean value) {
        this.conversionFailed = value;
    }

    public boolean isConversionFailed() {
        return this.conversionFailed;
    }

    public String getInputClientId() {
        return this.getClientId(getFacesContext()) + "_input";
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

    @Override
    public Converter getConverter() {
        Converter converter = super.getConverter();
        
        if(converter == null && PrimeApplicationContext.getCurrentInstance(getFacesContext()).getConfig().isClientSideValidationEnabled()) {
            DateTimeConverter con = new DateTimeConverter();
            con.setPattern(this.calculatePattern());
            con.setTimeZone(this.calculateTimeZone());
            con.setLocale(this.calculateLocale(getFacesContext()));

            return con;
        }
        
        return converter;
    }

	public String resolveWidgetVar() {
		return ComponentUtils.resolveWidgetVar(getFacesContext(), this);
	}
}