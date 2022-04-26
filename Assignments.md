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
- Neden belirttiğiniz şekilde kullanımı tercih ediyoruz?

P.S. [Bu linkten](https://developer.android.com/guide/topics/ui/look-and-feel/fonts-in-xml ) faydalanarak font family projenizde deneyebilirsiniz.

## <a name="4"></a> Araştırma Projesi 4

- Property Animation ile ilgili olarak objectAnimator ile animator arasındaki farkı kısaca açıklayınız

P.S. [Bu linkten](https://developer.android.com/guide/topics/resources/animation-resource#Property) faydalanabilirsiniz.
