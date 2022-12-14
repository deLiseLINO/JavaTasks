# Запуск
##### База данных
База данных по умолчанию храниться в памяти, если нужно, можно привязать свою в `resources\application.properties`
Spring JPA (Hibernate в частности) автоматически создает таблицы на освное классов в пакете `dto`
##### Проект
Запуск через метод `main` в классе `ExampleProjectApplication`
# Запросы
В классах есть комментарии с небольшими пояснениями, как работает адресация
### Создание 
`POST запрос: localhost:8080\first\object`
body: 
``` JSON
{
    "title":"firstTitleFO",
    "status":"OPENED"
}
```
### Получение по id 
`GET запрос: localhost:8080\first\object\{id}`
### Получение всех объектов
`GET запрос: localhost:8080\first\object`
### Обновление объекта
`PUT запрос: localhost:8080\first\object\id`
body: 
``` JSON
{
    "title":"firstTitleFO",
    "status":"OPENED"
}
```
### Удаление объекта
`DELETE запрос: localhost:8080\first\object\id`

# Изменение проекта
При добавлении новых полей в объекты, соответствующие поля добавляются в body запросов
Не забудьте сделать обновление по аналогии в методе `updateFO` класса `FirstObjectService`
### Пакеты
Пакет `controller` хранит в себе конечные точки запросов (url endpoints)
Пакет `dto` хранит в себе объекты сервиса
Пакет `repository` хранит в себе интерфейсы благодаря которым происходит взаимодействие с базами данных, там автоматически прописаны некоторые методы, которые позволяют сохранять, удалять и получать объекты из БД.
Пакет `service` хранит в себе классы со всей логикой
