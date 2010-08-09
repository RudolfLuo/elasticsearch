/*
 * Licensed to Elastic Search and Shay Banon under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. Elastic Search licenses this
 * file to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.elasticsearch.search.sort;

/**
 * A set of static factory methods for {@link SortBuilder}s.
 *
 * @author kimchy (shay.banon)
 */
public class SortBuilders {

    /**
     * Constructs a new score sort.
     */
    public static ScoreSortBuilder scoreSort() {
        return new ScoreSortBuilder();
    }

    /**
     * Constructs a new field based sort.
     *
     * @param field The field name.
     */
    public static FieldSortBuilder fieldSort(String field) {
        return new FieldSortBuilder(field);
    }

    /**
     * Constructs a new script based sort.
     *
     * @param script The script to use.
     * @param type   The type, can either be "string" or "number".
     */
    public static ScriptSortBuilder scriptSort(String script, String type) {
        return new ScriptSortBuilder(script, type);
    }

    /**
     * A geo distance based sort.
     *
     * @param fieldName The geo point like field name.
     */
    public static GeoDistanceSortBuilder geoDistanceSort(String fieldName) {
        return new GeoDistanceSortBuilder(fieldName);
    }
}
