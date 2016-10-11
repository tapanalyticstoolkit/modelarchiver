/**
 *  Copyright (c) 2016 Intel Corporation 
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.trustedanalytics.scoring.interfaces

import org.apache.commons.lang3.StringUtils

/**
 * For providing information about Model inputs and outputs
 * @param name name of the observation column
 * @param dataType data type of the observation column
 */
case class Field(name: String, dataType: String) {
  require(StringUtils.isNotEmpty(name), "name should not be empty")
  require(StringUtils.isNotEmpty(dataType), "data type should not be empty")

  override def toString: String = {
    s"""{"name": "${name}", "data_type": "${dataType}"}"""
  }
}
