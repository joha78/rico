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
package dev.rico.internal.server.projection.notifications;

import dev.rico.internal.projection.notifications.NotificationData;
import dev.rico.server.remoting.event.Topic;

/**
 * Created by hendrikebbers on 31.05.16.
 */
public interface NotificationsTopics {

    Topic<NotificationData> GLOBAL_NOTIFICATION = Topic.create();
}