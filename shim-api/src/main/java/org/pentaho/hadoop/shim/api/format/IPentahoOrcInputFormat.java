/*! ******************************************************************************
 *
 * Pentaho Data Integration
 *
 * Copyright (C) 2019 by Hitachi Vantara : http://www.pentaho.com
 *
 *******************************************************************************
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ******************************************************************************/
package org.pentaho.hadoop.shim.api.format;

import java.util.List;

public interface IPentahoOrcInputFormat extends IPentahoInputFormat {
  /**
   * Read schema for display to user.
   */
  List<IOrcInputField> readSchema();

  /**
   * Set schema for file reading.
   */
  void setSchema( List<IOrcInputField> orcInputField );

  /**
   * Set input file.
   */
  void setInputFile( String file );

}
