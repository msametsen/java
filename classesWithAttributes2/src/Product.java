public class Product {
    //attribute veya field denir bu değişkenlere-Unutma bir class sadece bir iş yapar hem attribute tutup hem operasyon yazamasın içine temiz kod olmaz.
    //değişkenlerin başına private yazarsan sadece o blokta geçerli olacaktır.default olarak java public veriri sen bunu istersen private çevirirsin.

    public Product(int id,String name,String description,double price,int _stockAmount,String renk) {
        System.out.println("Yapıcı blok çalıştı");
        this._renk=renk;
        this._name=name;
        this._price=price;
        this._id=id;
        this._description=description;
        this._stockAmount=_stockAmount;
    }

    private String _name;
    private int _id;
    private String _description;
    private double _price;
    private int _stockAmount;
    private String _renk;

    //ÇOK ÖNEMLİ!!!!.Getter ve Setter id için biz yazdık diğerlerini ide den yardım aldık tek tek yazmak yerine.Örneğin_name sağ tıkla refactor de ondan sonra Encanpsulate Fields de tek tek seç hepsini otomatik kod olarak getter ve stter yapsın sana.

    //Getter-private olanan özellikleri public açıyoruz-get okunabilir
    public int getId(){
        return _id;
    }
    //Setter-set yaparsanda private olan değişkenleri yazılabilir hale getirilir.Genelde get ve set ikside aynı anda kullanılır.
    //this demek bu class demek içersinde bulunduğum class demektir unutma.Yukarıda değişkenlere alt çizgi vermemizin sebebi this kullanmıyalım ama karıştırmayalımda diye daha temiz kod yazmak için
    public void setId(int id) {
        _id=id;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public String get_description() {
        return _description;
    }

    public void set_description(String _description) {
        this._description = _description;
    }

    public double get_price() {
        return _price;
    }

    public void set_price(double _price) {
        this._price = _price;
    }

    public int get_stockAmount() {
        return _stockAmount;
    }

    public void set_stockAmount(int _stockAmount) {
        this._stockAmount = _stockAmount;
    }

    public String get_renk() {
        return _renk;
    }

    public void set_renk(String _renk) {
        this._renk = _renk;
    }
}
