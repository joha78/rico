/*
 * Copyright 2018-2019 Karakun AG.
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
package dev.rico.integrationtests.server.parentchild;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import dev.rico.integrationtests.parentchild.ParentTestBean;
import dev.rico.server.remoting.PostChildCreated;
import dev.rico.server.remoting.PreChildDestroyed;
import dev.rico.server.remoting.RemotingController;
import dev.rico.server.remoting.RemotingModel;

import static dev.rico.integrationtests.parentchild.ParentChildTestConstants.PARENT_CONTROLLER_NAME;

@RemotingController(PARENT_CONTROLLER_NAME)
public class ParentTestController {

    @RemotingModel
    private ParentTestBean model;


    @PostConstruct
    private void init() {
        model.setPostCreatedCalled(true);
    }

    @PostChildCreated
    private void onChildControllerCreated(final ChildTestController childController) {
        model.setPostChildCreatedCalled(true);
    }

    @PreChildDestroyed
    private void onChildControllerDestroyed(final ChildTestController childController) {
        model.setPreChildDestroyedCalled(true);
    }

    @PreDestroy
    private void destroy() {
        model.setPreDestroyedCalled(true);
    }
}