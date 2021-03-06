/**
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright 2012-2016 the original author or authors.
 */
package org.assertj.core.api.exception;

import org.assertj.core.util.Files;
import org.assertj.core.util.URLs;

/**
 * Exception thrown by <code>{@link Files}</code> and <code>{@link URLs}</code>.
 * 
 * @author Yvonne Wang
 */
public final class RuntimeIOException extends RuntimeException {

  private static final long serialVersionUID = -8328554403430790831L;

  /**
   * Creates a new {@link RuntimeIOException}.
   * 
   * @param message the detail message.
   */
  public RuntimeIOException(String message) {
    super(message);
  }

  /**
   * Creates a new {@link RuntimeIOException}.
   * 
   * @param message the detail message.
   * @param cause the cause of the error.
   */
  public RuntimeIOException(String message, Throwable cause) {
    super(message, cause);
  }
}
