### Poetry(Android 日志织入框架)
Poetry 是仿照[JakeWharton的Hugo](https://github.com/JakeWharton/hugo)项目实现的AOP日志框架.核心AOP的使用方法都来自Hugo.Hugo在
```
com.android.tools.build:gradle:3.0+ 
```
及以上的版本无法使用,但JakeWharton好像并没有像维护Hugo项目的意思.所以在此复刻了该项目的实现.(功能还有缺失,后续会加上)

#### 使用方式

gradle(project)
````
buildscript {
    
    repositories {
        google()
        jcenter()
        maven {
            url "https://plugins.gradle.org/m2/"
        }
    }
    dependencies {
        ...
        classpath "com.deity.poetry:poetry:1.0.09"
    }
}
````
build.gradle(app)
```
apply plugin: 'com.deity.poetry'
```
```
@DebugLog
public String getName(String first, String last) {
  SystemClock.sleep(15); // Don't ever really do this!
  return first + " " + last;
}
```

```
V/Example: ⇢ getName(first="Jake", last="Wharton")
V/Example: ⇠ getName [16ms] = "Jake Wharton"
```
毕竟复刻,使用方式跟Hugo是一致的.弄这个项目主要是学习Gradle插件的开发.
以下参考资料给我提供了很大的帮助:

感谢 [JakeWharton/hugo开源项目](https://github.com/JakeWharton/hugo)
1. [阿拉神农-深入理解Android之AOP](https://blog.csdn.net/innost/article/details/49387395)
2. [在 Android Studio 中自定义 Gradle 插件](https://juejin.im/entry/577bc26e165abd005530ead8)
3. [深入理解Android之Gradle](https://blog.csdn.net/innost/article/details/48228651)
4. [Hugo源码分析](https://blog.csdn.net/xxxzhi/article/details/53048476)
5. [Groovy中文文档](http://cndoc.github.io/groovy-doc-cn/)
6. [如何使用Android Studio开发Gradle插件](https://blog.csdn.net/sbsujjbcy/article/details/50782830)
7. [multi-library-bintray](https://github.com/quangctkm9207/multi-library-bintray/blob/master/doraemon/build.gradle)
8. [如何上传插件](https://github.com/bintray/gradle-bintray-plugin)
9. [Gradle for Android 第一篇( 从 Gradle 和 AS 开始 )](https://segmentfault.com/a/1190000004229002)
10. [转载Gradle 插件 发布到本地和远程仓库](https://www.jianshu.com/p/376ae605ebf1)
11. [Writing Custom Plugins](https://docs.gradle.org/current/userguide/custom_plugins.html)
12. 发布时如何不带gradle.plugin前缀
[How do I use the Plugin Publishing Plugin?](https://plugins.gradle.org/docs/publish-plugin?_ga=2.140076019.1543827645.1549010633-1927265851.1539001240)

