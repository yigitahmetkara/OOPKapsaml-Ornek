OOP Kapsamlı Örnek - Araç Hiyerarşisi ve Kalıtım
Bu proje, Java'da Nesne Yönelimli Programlama (OOP) prensiplerini, özellikle de Kalıtım (Inheritance) ve Polimorfizm (Çok Biçimlilik) kavramlarını derinlemesine incelemek için geliştirilmiştir. Bir ana Car sınıfı üzerinden farklı gövde tipleri ve motor teknolojilerine sahip araçların hiyerarşik modellemesini içerir.

Proje Yapısı ve Sınıf Hiyerarşisi
Proje, gerçek dünya nesnelerini kod ortamında modelleyen geniş bir sınıf yelpazesine sahiptir:

Ana Sınıf (Base Class):

Car.java: Tüm araçların sahip olduğu ortak özellikleri ve davranışları tanımlar.

Türetilmiş Sınıflar (Subclasses):

Gövde Tiplerine Göre: Sedan, SedanLarge, HatchBack, SportsCar, Suv.

Motor Teknolojilerine Göre: ElectricCar, HybridCar.

Yürütücü Sınıf:

Main.java: Nesnelerin oluşturulduğu ve kalıtım hiyerarşisinin test edildiği ana giriş noktası.

Uygulanan OOP Kavramları
Inheritance (Kalıtım): Alt sınıfların extends anahtar kelimesi ile Car sınıfındaki özellikleri miras alması.

Method Overriding: Alt sınıfların, ana sınıftan gelen davranışları kendi ihtiyaçlarına göre (Örn: Elektrikli aracın yakıt tüketimi yerine batarya kullanımı) güncellemesi.

Kodun Yeniden Kullanılabilirliği: Ortak kodların tek bir merkezde (Car sınıfı) toplanarak tekrarın önlenmesi.

Teknik Detaylar
Dil: Java (JDK 21)

IDE: Eclipse

Yapı: Default Package mimarisi

Kurulum
Projeyi yerel bilgisayarınıza klonlayın:

Bash
git clone https://github.com/yigitahmetkara/OOPkapsamliornek.git
Eclipse IDE'sini açın.

File > Import > General > Existing Projects into Workspace adımlarıyla projeyi içeri aktarın.

Main.java dosyasını çalıştırarak hiyerarşik yapının çıktılarını gözlemleyin.
