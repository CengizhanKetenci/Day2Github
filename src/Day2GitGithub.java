public class Day2GitGithub {

    /*
    1-  git init --> Local repo oluşturma için, yani .git ile klasörümüzün içindeki dosyaları
        ilişkilendirmek için kullanılır.
    2-  git add . --> Working Space'den , yani yerel'den dosyalarımı staging area'ya
        yani (commitlemek için beklenen yer) gönderir.
    3-  git status --> Working space'deki ve staging area'daki durumu gösterir.
    4-  git commit -m "mesaj" --> Staging area'dan commit store'a dosyalarımı göndermek için kullanılır.
        (commit yani versiyon yani sürüm oluşturmuş olurum.)
    5-  git push --> uzak repo'ya (yani remote - Github) göndermek için kullandığımız koddur.
        not: git push komutunu direkt kullanmak istersek 1 kereye mahsus aşağıdaki adreslemeyi yapmalıyız.
            git remote add orijin "adress"
            git push -u orijin master
    Not: yukarıdaki iki komutu ilk seferde kullandıktan sonra diğer ikinci yapacağım commit lerim için sadece
    git push yazmam yeterli olacaktır.
    6-  git pull --> Remote (yani uzak repo) daki dosyalarımızı güncellemek yani localimize çekmek için kullanılır.
    
    Not : Not: Not : Not: Not : Not:
    Branch oluşturup tekrar birleştirelim.

     */
    public static void main(String[] args) {
        System.out.println("Github'ı da öğrendim");
        System.out.println("Branch oluştur ve birleştir");
        System.out.println("master 1.deneme");
        System.out.println("master 2.deneme");
    }
}
