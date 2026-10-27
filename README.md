# HelloConstraint

V tej nalogi sem naredil Aplikacijo Helloconstraints, ki ponastavi števec. Gumbi ob kliku spreminjajo barvo, postavitev pa sem prilagodil tudi za ležečo orientacijo in tablico.

## Cilji

- odpreti obstoječi projekt HelloConstraint v Android Studiu,
- v `activity_main.xml` dodati tretji gumb **Zero** med gumboma **Toast** in **Count**,
- gumbu Zero nastaviti začetno sivo ozadje (`android:backgroundTint`),
- vse tri gumbe postaviti levo od `show_count` in jih z verigo omejitev (`layout_constraintVertical_chainStyle="spread_inside"`) navpično razporediti med zgornjim in spodnjim robom elementa `show_count`,
- gumb Zero dodati tudi v postavitvi za ležečo orientacijo (`layout-land`) in za tablico (`layout-xlarge`), z istimi ID-ji in imeni metod,
- v `MainActivity.java` napisati metodo `zero(View view)`, ki števec nastavi na 0 in gumbu Zero vrne sivo barvo,
- metodo `countUp(View view)` dopolniti tako, da gumb Count spreminja svojo barvo glede na sodo ali liho vrednost (zelena/rdeča), pri čemer sem uporabil parameter `view` in ne `findViewById()`,
- ob kliku na Count gumb Zero obarvati rumeno, kar nakaže, da je aktiven,
- za barve uporabiti konstante iz razreda `Color` (`Color.GREEN`, `Color.RED`, `Color.YELLOW`, `Color.GRAY`),
- odstraniti nepotrebno kodo (odvečne odmike, podvojene atribute in nepotreben uvoz razreda `R`),
- preizkusiti aplikacijo v emulatorju telefona v pokončni in ležeči legi ter na emulatorju tablice.

## Zaslonske slike aplikacije
<img width="320" height="555" alt="Slika1" src="https://github.com/user-attachments/assets/2965ca72-8fd0-4f62-80a2-5569744ee73e" />
<img width="320" height="555" alt="image" src="https://github.com/user-attachments/assets/a1559abd-2bd8-43f9-ad99-0ef628e5a98f" />
<img width="640" height="320" alt="image" src="https://github.com/user-attachments/assets/54d620fc-1d11-44cb-b8b7-42b37de18bd6" />

