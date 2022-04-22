## <a name="2"></a> Araştırma Projesi 2


- Layout dizini içinde xml dosyalarımız için kullandığımız namespace nedir ?

3 adet namespace bulunur;app,android,tools. Kullanım şeklimize göre hangisini seçeceğimize biz karar verebiliriz.

- Neden kullanılmaktadır ?

APK üzerine herhangi bir etkisi olmadan yaptığımız değişikliği görmek için tools namespace kullanırız.

- Nasıl kullanılmalıdır ?

```kotlin
xmlns:tools="http://schemas.android.com/tools"
```
kodunu xml içine yazarak tools özelliğini kullanabiliriz.

- Bir adet Tools (tools namespace) attribute kullanımını gösterir misiniz ? 

APK içinde farklı bir font kullandık ama başka bir font kullanarak nasıl gözükeceğine bakmak istiyoruz. Bunu yapmak için

```kotlin
tools:fontFamily="@font/allan"
```
kodunu kullanarak fontun nasıl gözükeceğine bakabiliriz.
