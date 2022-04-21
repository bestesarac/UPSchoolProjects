## <a name="1"></a> Araştırma Projesi 1

- Lateinit neden kullanıyoruz?
Kelime anlamı geç başlatma anlamına gelen Lateinit kullanılana kadar bellekte yer kaplamaz ve kullanmak için başlatılması gerekir. Oluştururken bir değer atanması gerekmez bu bu değer sonradan atanabilir. Sadece var değişkenlerde kullanılır ve null değer olmaması gerekmektedir.

- Lateinit kullanımından bahseder misiniz?

- Lateinit için bir örnek kullanım gösterir misiniz ?

'''kotlin
class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var button: Button
    private lateinit var dice: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.mybutton)
        dice=findViewById(R.id.dice)
        button.setOnClickListener(this) } 
        '''
