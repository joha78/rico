/*
 * Copyright 2018 Karakun AG.
 * Copyright 2015-2018 Canoo Engineering AG.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package dev.rico.internal.server.remoting.controller;

import org.apiguardian.api.API;

import static org.apiguardian.api.API.Status.INTERNAL;

/**
 *  Exception to be thrown in case of bad controller
 */
@API(since = "0.x", status = INTERNAL)
public class ControllerValidationException extends Exception {

    /**
     * Default constructor
     */
    public ControllerValidationException() {
    }

    /**
     * Constructor
     * @param message the message
     */
    public ControllerValidationException(String message) {
        super(message);
    }

    /**
     * Constructor
     * @param message the message
     * @param cause the cause
     */
    public ControllerValidationException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructor
     * @param cause the cause
     */
    public ControllerValidationException(Throwable cause) {
        super(cause);
    }
}
