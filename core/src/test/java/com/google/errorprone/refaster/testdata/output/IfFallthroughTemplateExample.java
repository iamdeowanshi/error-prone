/*
 * Copyright 2015 Google Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.errorprone.refaster.testdata;

import com.google.common.collect.Ordering;

import java.util.Comparator;

/**
 * Test data for {@code IfFallthroughTemplate}.
 */
public class IfFallthroughTemplateExample {
  public Comparator<String> example1() {
    return new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        return Ordering.natural().nullsFirst().compare(o1, o2);
      }
    };
  }

  public Comparator<String> example2() {
    return new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        return Ordering.natural().nullsFirst().compare(o1, o2);
      }
    };
  }
}
