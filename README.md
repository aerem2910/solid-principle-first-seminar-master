1. Main.java:
    В методе main создается объект User и вызываются его методы report и save.
    Добавлено использование интерфейса Persister для сохранения пользователя.
    Вместо создания Persister внутри метода save, мы теперь передаем его через параметр, что обеспечивает инъекцию зависимостей.

2.Persister.java:
    Создан интерфейс Persister, определяющий метод save. Этот интерфейс представляет собой абстракцию для классов, ответственных за сохранение объектов.

3.DatabasePersister.java:
  Создан класс DatabasePersister, реализующий интерфейс Persister.
  Метод save этого класса реализует конкретную логику сохранения в базу данных.

4.User.java:
  В методе save класса User параметром добавлен интерфейс Persister, чтобы обеспечить инъекцию зависимостей.
  Метод save теперь передает себя (this) в Persister, что позволяет абстрагировать логику сохранения от класса User.
  Такие изменения следуют принципам SOLID, особенно принципу инверсии зависимостей (Dependency Inversion Principle), поскольку мы инвертировали зависимость от Persister, передавая его через параметр, а не создавая внутри класса User. 
  Это делает код более гибким и расширяемым, позволяя использовать различные реализации Persister без изменения кода класса User.
