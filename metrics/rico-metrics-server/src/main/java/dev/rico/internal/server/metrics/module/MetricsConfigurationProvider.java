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
package dev.rico.internal.server.metrics.module;

import dev.rico.internal.server.bootstrap.SimpleConfigurationProvider;

import static dev.rico.internal.server.metrics.module.MetricsConfigConstants.METRICS_ENDPOINT_DEFAULT;
import static dev.rico.internal.server.metrics.module.MetricsConfigConstants.METRICS_ENDPOINT_PROPERTY;
import static dev.rico.internal.server.metrics.module.MetricsConfigConstants.METRICS_NOOP_DEFAULT;
import static dev.rico.internal.server.metrics.module.MetricsConfigConstants.METRICS_NOOP_PROPERTY;
import static dev.rico.internal.server.metrics.module.MetricsConfigConstants.METRICS_ACTIVE_DEFAULT;
import static dev.rico.internal.server.metrics.module.MetricsConfigConstants.METRICS_ACTIVE_PROPERTY;

public class MetricsConfigurationProvider extends SimpleConfigurationProvider {

    public MetricsConfigurationProvider() {
        addBoolean(METRICS_ACTIVE_PROPERTY, METRICS_ACTIVE_DEFAULT);
        addBoolean(METRICS_NOOP_PROPERTY, METRICS_NOOP_DEFAULT);
        addString(METRICS_ENDPOINT_PROPERTY, METRICS_ENDPOINT_DEFAULT);
    }
}
