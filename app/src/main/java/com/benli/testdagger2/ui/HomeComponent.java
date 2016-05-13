/*
 * Copyright (C) 2013 Square, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.benli.testdagger2.ui;

import com.benli.testdagger2.AbstractActivityComponent;
import com.benli.testdagger2.ActivityModule;
import com.benli.testdagger2.ApplicationComponent;
import com.benli.testdagger2.PerActivity;
import dagger.Component;

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface HomeComponent extends AbstractActivityComponent {
  void inject(HomeActivity homeActivity);
  void inject(HomeFragment homeFragment);
}
