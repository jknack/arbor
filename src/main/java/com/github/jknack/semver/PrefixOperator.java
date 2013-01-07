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
package com.github.jknack.semver;

/**
 * A prefix operator.
 *
 * @author edgar.espina
 * @since 0.0.1
 */
interface PrefixOperator {

  /**
   * Set the expression.
   *
   * @param expr The prefixed expression.
   */
  void setExpression(Semver expr);
}
