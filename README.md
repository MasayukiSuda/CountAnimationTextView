# CountAnimationTextView
[![License](https://img.shields.io/badge/license-Apache%202-blue.svg)](https://www.apache.org/licenses/LICENSE-2.0)
[![Platform](https://img.shields.io/badge/platform-android-green.svg)](http://developer.android.com/index.html)

A tiny Android library makes very easier count animation of TextView.

<img src="art/demo.gif" width="32%">

# Usage
Include the CountAnimationTextView widget in your layout.
```xml
    <com.daasuu.library.CountAnimationTextView
        android:id="@+id/count_animation_textView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="0"
        />
```
In your onCreate method (or onCreateView for a fragment), bind the widget and set default value.
```JAVA
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCountAnimationTextView = (CountAnimationTextView) findViewById(R.id.count_animation_textView);
    }
```
Animate Count with Duration
```JAVA
    mCountAnimationTextView
        .setAnimationDuration(5000)
        .countAnimation(0, 99999);
```
Animate Count with DecimalFormat
```JAVA
    mCountAnimationTextView
        .setDecimalFormat(new DecimalFormat("###,###,###"))
        .setAnimationDuration(10000)
        .countAnimation(0, 9999999);
```

# Gradle

Add the dependency to your build.gradle.

```
dependencies {
    compile 'com.daasuu:CountAnimationTextView:0.0.2'
}
```

## License
    Copyright 2015 MasayukiSuda

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
