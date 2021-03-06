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

import java.net.URI;

/**
 * URI expression.
 *
 * @author edgar.espina
 * @since 0.0.1
 */
class UrlExpression extends BaseExpression {

  /**
   * The URI expression.
   */
  private URI uri;

  /**
   * Creates a new {@link UrlExpression}.
   *
   * @param uri The uri expression.
   */
  public UrlExpression(final String uri) {
    this.uri = URI.create(uri);
  }

  @Override
  public String text() {
    return uri.toString();
  }

  @Override
  public boolean matches(final Semver expr) {
    return uri.toString().equals(expr.toString());
  }

  @Override
  public int compareTo(final Semver expr) {
    throw new UnsupportedOperationException("for " + this);
  }

  @Override
  public Type type() {
    return Type.URL;
  }
}
