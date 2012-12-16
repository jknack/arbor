/**
 * This copy of Woodstox XML processor is licensed under the
 * Apache (Software) License, version 2.0 ("the License").
 * See the License for details about distribution rights, and the
 * specific rights regarding derivate works.
 *
 * You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/
 *
 * A copy is also included in the downloadable source code package
 * containing Woodstox, in file "ASL2.0", under the same directory
 * as this file.
 */
package com.github.jknack.arbor.commonjs;

import java.io.IOException;

/**
 * Raised when a package is not found.
 *
 * @author edgar.espina
 * @since 0.1.0
 */
@SuppressWarnings("serial")
public class PackageNotFoundException extends IOException {

  /**
   * Creates a new {@link PackageNotFoundException}.
   *
   * @param id The package's id.
   */
  public PackageNotFoundException(final String id) {
    super(id);
  }
}
