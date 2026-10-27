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
<img width="320" height="555" alt="image" src="https://github.com/user-attachments/assets/3bafef32-f078-4ec9-9c59-a9aa3e7d5287" />
<img width="320" height="555" alt="image" src="https://github.com/user-attachments/assets/435059ad-7ec5-408a-9f26-5a0f59c07808" />
<img width="640" height="320" alt="image" src="https://github.com/user-attachments/assets/93ee4c5d-84f1-433c-9b1e-d01468c801ca" />

