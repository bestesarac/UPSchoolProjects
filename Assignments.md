## <a name="1"></a> Araştırma Projesi 1

- Lateinit neden kullanıyoruz?

Kelime anlamı geç başlatma anlamına gelen Lateinit kullanılana kadar bellekte yer kaplamaz ve kullanmak için başlatılması gerekir. Oluştururken bir değer atanması gerekmez bu değer sonradan atanabilir. Sadece var değişkenlerde kullanılır ve null değer olmaması gerekmektedir.

- Lateinit kullanımından bahseder misiniz?

Sadece var değişkenlerde kullanılır ve null değer olmaması gerekmektedir.

- Lateinit için bir örnek kullanım gösterir misiniz ?


```kotlin

class MainActivity : AppCompatActivity() {
    lateinit var button: Button
    lateinit var text: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button= findViewById(R.id.button)
        text=findViewById(R.id.textView3)
        button.setOnClickListener {
            text.text= "Luna"
        }
    }
}
```

## <a name="2"></a> Araştırma Projesi 2


- Layout dizini içinde xml dosyalarımız için kullandığımız namespace nedir ?

3 adet namespace bulunur;app,android,tools. Kullanım şeklimize göre hangisini seçeceğimize biz karar verebiliriz.

- Neden kullanılmaktadır ?

APK üzerine herhangi bir etkisi olmadan yaptığımız değişikliği görmek için tools namespace kullanırız.

- Nasıl kullanılmalıdır ?

```kotlin
xmlns:tools="http://schemas.android.com/tools"
```

- Bir adet Tools (tools namespace) attribute kullanımını gösterir misiniz ? 

APK içinde farklı bir font kullandık ama başka bir font kullanarak nasıl gözükeceğine bakmak istiyoruz. Bunu yapmak için

```kotlin
tools:fontFamily="@font/allan"
```
kodunu kullanarak fontun nasıl gözükeceğine bakabiliriz.

## <a name="3"></a> Araştırma Projesi 3

- Font family dosyası nasıl oluşturulup kullanıyoruz?

Font family dosyasını Android Resource File penceresini açıp ardından Resource Type olarak Font seçerek oluşturabiliriz. Kullanmak istediğimiz font dosyalarını Res klasörü altındaki Font klasörünün içine uzantısı .otf veya .ttf olacak şekilde dosyaları atıp sonrasında bu fontların tanımlamasını oluşturduğumuz Font family dosyasında yapabiliriz. Font dosyalarını Android Studio içine atarken font isimlerinin sadece küçük harf ve alt tire içermesine dikkat edersek olası bir hata durumundan sıyrılmış oluruz.
Örnek bir Font family dosyasını aşağıda görebilirsiniz.

```kotlin
<?xml version="1.0" encoding="utf-8"?>
<font-family xmlns:android="http://schemas.android.com/apk/res/android">
    <font
        android:font="@font/wonder_smile"
        android:fontStyle="normal"
        android:fontWeight="400"
        />
    <font
        android:font="@font/wonder_smile_italic"
        android:fontStyle="italic"
        android:fontWeight="400"
        />
</font-family>
```
- Neden belirttiğiniz şekilde kullanımı tercih ediyoruz?

Font family kullanmamızın amacı proje içinde hep aynı fontları kullanırken hepsini aynı yerde bulabilmek ve aynı zamanda kendimize özel fontları oluşturabilmek. Ayrıca font dosyalarını direk uygulamamızın içine gömülü olarak kullandığımız zaman font dosyasının güncellemesi, kaldırılması gibi olumsuz durumlara karşı önlem almış oluruz.

## <a name="4"></a> Araştırma Projesi 4

- Property Animation ile ilgili olarak objectAnimator ile animator arasındaki farkı kısaca açıklayınız.

objectAnimator, animator'ün alt sınıfıdır.
animator, bir süre boyunca nesnenin özelliklerini değiştirerek animasyon oluşturur.
objectAnimator, bir süre boyunca nesnenin belirli bir özelliğini değiştirerek animasyonu canlandırır.
