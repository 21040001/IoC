Bu projede bir online sayt ichidagi to'lov qilish yo'liga ko'ra sistemni ishga tuushirissh program poydevorlarini qurdik 

va qurish davomida branchlar orqali programlamamizni ust saviyalarga ko'tarib bordik.
Branchlarimiz quyidagicha:
* ConstruktorArg
* PropertiesInjecktion
* SetterInjecktionBranch
* StringInjecktion
* XmlBranch
* master

Branchlarimizga ochiqlama kiritadigan bo'lsak:
* master branchimizda programimizning asosiy qism(fayl) ko'dlarini yozib oldik.

* master branchi ichkarisida turgan holda yangi bir 'XmlBranch'i ochdik va kodlarimizni Xml faylidan foydalangan holda kodimiz ichkarisidagi chalkashliklarni yo'qotdik.

* kegin esa yangi bir 'ConstruktorArg' ismli bir yangi branch ochdik, bu branch ichkarisida esa classlarimiz ichidagi parametrlarni construktor-arg fonksiyonidan foydalangan holda hal ettik

* so'ngra yana bir yangi branch ochib olgan holda construktorlarimizni setterlarga almashtirdik, yangi ochgan Branchimizning ismi 'SetterInjecktion'

* yana bir yangi branch ochdik va bu branchimizga 'StringIbjection' deb nom berdik bu branchimiz ichkarisida, projecktimiz ichidagi Stirng qiymatlarni xml faylaridan turgan holda boshqarishni ko'rsatib
  o'tdik va amalda ko'rsatib o'tdik

* va yana bir yangi branch ochdik azizlar, bu orada aytishlaring mumkin juda ham ko'p branch ochayabsizlar deb ammo bularning barchasi projecktning ichidagi kodlarni toza bir shaklda yozilishi uchun,
  yangi ochgan branchimiz 'PropertiesInjecktion'ga keladigan bo'lsak bu branchimizda String icidagi Stringlarni .properties faylida berilgan Stringlar orqali boshqarishni ko'rsatib o'tdik.

* yuqoridagi qilingan ishlarning barchasi kodlarimizning poydevori sog'lom va chalkash bo'lmasligi uchun azizlar. 
