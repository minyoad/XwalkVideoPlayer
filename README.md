# XwalkVideoPlayer
html5 video player base on [crosswalk project](https://crosswalk-project.org/) webview on android

## features
1. inject js script to html5 video for play control
2. add default remote keyevent control


## usage

1. import two xwalk modules to project 
xwalk_core_library xwalkvideoplayer

2. edit settings.gradle
add 
```xml
include ':xwalkvideoplayer'
include ':xwalk_core_library'
```
and sync project, will show imported modules

3. implement activity extends from XwalkWebViewActivity, need to implement three on functions as below.
then you can play http url video using play.

other functions can refer XwalkWebViewActivity.java

```java
public class MainActivity extends XwalkWebViewActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        play("http://www.dgua.xyz/webcloud/?url=http://v.youku.com/v_show/id_XMzA4OTA4OTQyMA==.html");

    }

    @Override
    public void onPlayingEventChanged(String event) {

    }

    @Override
    public void onProgressUpdated(double position) {

    }

    @Override
    public void onPlayingProperties(String propertiesJson) {

    }
}
```
