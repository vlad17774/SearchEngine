# Функции поискового движка:
 
<li>выдача основных сведений по сайтам;</li>
<li>индексирование сайтов;</li>
<li>поиск слов по сайтам прошедшим индексацию.</li>

## Используемые технологии:
JPA, JSOUP, Morphology Library Lucene, SQL, Spring Framework.  

## Веб-страница
<p>
логин: root, пароль: !DC77lqdc для входа на веб-страницу по адресу localhost:8080.
<p>
Страница содержит три вкладки.

### Вкладка DASHBOARD
![image](https://github.com/vlad17774/SearchEngine/images/Dashboard.jpg)
Вкладка по умолчанию. На ней отображается общая статистика по всем проиндексированным сайтам, а также статистика и 
статус по каждому из сайтов.

### Вкладка MANAGEMENT
![image](https://github.com/vlad17774/SearchEngine/images/Management.jpg)
На этой вкладке находятся инструменты управления поисковым движком — запуск и остановка полной индексации
(переиндексации), а также возможность добавить (обновить)отдельную страницу.

### Вкладка SEARCH
![image](https://github.com/vlad17774/SearchEngine/images/Search.jpg)
На ней находится поле поиска и выпадающий список сайтов, по которому выполняется поиск, а при нажатии на кнопку SEARCH 
выводятся результаты поиска.

## Индексация сайтов:

### 1.	В адресной строке браузера наберите localhost:8080. Нажмите на клавиатуре Enter.
![image](https://github.com/vlad17774/SearchEngine/images/1.jpg)

### 2.	В верхнем поле введите root, в нижнем - !DC77lqdc, нажмите кнопку Sign in.
![image](https://github.com/vlad17774/SearchEngine/images/1.5.jpg)

### 3.	В обновившейся странице нажмите выберете вкладку MANAGEMENT.
![image](https://github.com/vlad17774/SearchEngine/images/2.jpg)

### 4.	Нажмите на кнопку START INDEXING.
![image](https://github.com/vlad17774/SearchEngine/images/3.jpg)


## Поиск по сайту:

### 1.	В адресной строке браузера наберите localhost:8080. Нажмите на клавиатуре Enter.
![image](https://github.com/vlad17774/SearchEngine/images/1.jpg)

### 2.	В верхнем поле введите root, в нижнем - !DC77lqdc, нажмите кнопку Sign in.
![image](https://github.com/vlad17774/SearchEngine/images/1.5.jpg)

### 3.	В обновившейся странице выберете вкладку SEARCH.
![image](https://github.com/vlad17774/SearchEngine/images/4.jpg)

### 4.	В ниспадающем списке выберете сайт, по которому хотите осуществить поиск.
![image](https://github.com/vlad17774/SearchEngine/images/5.jpg)

### 5.	Введите в поле искомое слово. Нажмите кнопку SEARCH.
![image](https://github.com/vlad17774/SearchEngine/images/6.jpg)


