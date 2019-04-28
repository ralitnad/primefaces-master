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
package org.primefaces.component.terminal;

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
import org.primefaces.model.terminal.TerminalAutoCompleteModel;
import org.primefaces.model.terminal.TerminalCommand;
import org.primefaces.model.terminal.TerminalAutoCompleteMatches;
import java.util.Arrays;
import java.util.ArrayDeque;

@ResourceDependencies({
	@ResourceDependency(library="primefaces", name="terminal/terminal.css"),
	@ResourceDependency(library="primefaces", name="components.css"),
	@ResourceDependency(library="primefaces", name="jquery/jquery.js"),
	@ResourceDependency(library="primefaces", name="jquery/jquery-plugins.js"),
	@ResourceDependency(library="primefaces", name="core.js"),
	@ResourceDependency(library="primefaces", name="components.js"),
	@ResourceDependency(library="primefaces", name="terminal/terminal.js")
})
public class Terminal extends UIPanel implements org.primefaces.component.api.Widget {


	public static final String COMPONENT_TYPE = "org.primefaces.component.Terminal";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";
	public static final String DEFAULT_RENDERER = "org.primefaces.component.TerminalRenderer";

	public enum PropertyKeys {

		widgetVar
		,style
		,styleClass
		,welcomeMessage
		,prompt
		,commandHandler
		,autoCompleteModel
		,escape;

		String toString;

		PropertyKeys(String toString) {
			this.toString = toString;
		}

		PropertyKeys() {}

		public String toString() {
			return ((this.toString != null) ? this.toString : super.toString());
}
	}

	public Terminal() {
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

	public java.lang.String getWelcomeMessage() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.welcomeMessage, null);
	}
	public void setWelcomeMessage(java.lang.String _welcomeMessage) {
		getStateHelper().put(PropertyKeys.welcomeMessage, _welcomeMessage);
	}

	public java.lang.String getPrompt() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.prompt, "prime $");
	}
	public void setPrompt(java.lang.String _prompt) {
		getStateHelper().put(PropertyKeys.prompt, _prompt);
	}

	public javax.el.MethodExpression getCommandHandler() {
		return (javax.el.MethodExpression) getStateHelper().eval(PropertyKeys.commandHandler, null);
	}
	public void setCommandHandler(javax.el.MethodExpression _commandHandler) {
		getStateHelper().put(PropertyKeys.commandHandler, _commandHandler);
	}

	public org.primefaces.model.terminal.TerminalAutoCompleteModel getAutoCompleteModel() {
		return (org.primefaces.model.terminal.TerminalAutoCompleteModel) getStateHelper().eval(PropertyKeys.autoCompleteModel, null);
	}
	public void setAutoCompleteModel(org.primefaces.model.terminal.TerminalAutoCompleteModel _autoCompleteModel) {
		getStateHelper().put(PropertyKeys.autoCompleteModel, _autoCompleteModel);
	}

	public boolean isEscape() {
		return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.escape, true);
	}
	public void setEscape(boolean _escape) {
		getStateHelper().put(PropertyKeys.escape, _escape);
	}


    public static final String CONTAINER_CLASS = "ui-terminal ui-widget ui-widget-content ui-corner-all";
    public static final String WELCOME_MESSAGE_CLASS = "ui-terminal-welcome";
    public static final String CONTENT_CLASS = "ui-terminal-content";
    public static final String PROMPT_CLASS = "ui-terminal-prompt";
    public static final String INPUT_CLASS = "ui-terminal-input";

    public boolean isCommandRequest() {
        FacesContext context = getFacesContext();
        return context.getExternalContext().getRequestParameterMap().containsKey(this.getClientId(context) + "_command");
    }

    public boolean isAutoCompleteRequest() {
        FacesContext context = getFacesContext();
        return context.getExternalContext().getRequestParameterMap().containsKey(this.getClientId(context) + "_autocomplete");
    }

    TerminalAutoCompleteMatches traverseAutoCompleteModel(TerminalAutoCompleteModel commandModel, String input, String[] args) {
        ArrayDeque argumentQueue = new ArrayDeque(Arrays.asList(args));
        return traverseAutoCompleteModel(commandModel, input, argumentQueue);
    }

    private TerminalAutoCompleteMatches traverseAutoCompleteModel(TerminalAutoCompleteModel commandModel, String input, ArrayDeque<String> inputArguments) {
        TerminalAutoCompleteMatches matches = new TerminalAutoCompleteMatches();

        for (TerminalCommand command : commandModel.getCommands()) {
            if (isPartialMatch(command, input)) {
                if (isExactMatch(command, input) && command.hasArguments()) {
                    matches.extendBaseCommand(input);
                    return traverseArguments(command, matches, inputArguments);
                }

                matches.addMatch(command);
            }
        }

        return matches;
    }

    private TerminalAutoCompleteMatches traverseArguments(TerminalCommand command, TerminalAutoCompleteMatches matches, ArrayDeque<String> inputArguments) {
        if (command.getArguments() != null) {
            for (TerminalCommand argument : command.getArguments()) {
                if (!inputArguments.isEmpty()) {
                    String inputArgument = inputArguments.peek();

                    if (isPartialMatch(argument, inputArgument)) {
                        if (isExactMatch(argument, inputArgument) && argument.hasArguments()) {
                            matches.extendBaseCommand(argument);
                            inputArguments.removeFirst();
                            return traverseArguments(argument, matches, inputArguments);
                        }

                        matches.addMatch(argument);
                    }
                }
                else {
                    matches.addMatch(argument);
                }
            }
        }

        return matches;
    }

    private boolean isPartialMatch(TerminalCommand command, String input) {
        return command.getText().startsWith(input);
    }

    private boolean isExactMatch(TerminalCommand command, String input) {
        return command.getText().equalsIgnoreCase(input);
    }
	public String resolveWidgetVar() {
		return ComponentUtils.resolveWidgetVar(getFacesContext(), this);
	}
}