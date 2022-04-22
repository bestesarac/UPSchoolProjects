## <a name="1"></a> Araştırma Projesi 1

- Lateinit neden kullanıyoruz?

Kelime anlamı geç başlatma anlamına gelen Lateinit kullanılana kadar bellekte yer kaplamaz ve kullanmak için başlatılması gerekir. Oluştururken bir değer atanması gerekmez bu değer sonradan atanabilir. Sadece var değişkenlerde kullanılır ve null değer olmaması gerekmektedir.

- Lateinit kullanımından bahseder misiniz?

Sadece var değişkenlerde kullanılır ve null değer olmaması gerekmektedir.

- Lateinit için bir örnek kullanım gösterir misiniz ?


'''
    
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
    
   '''
