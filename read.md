# Домашнее задание по Java

Порядок действий:

1. Запустить файл `src/main/resources/sql/init.sql` в СУБД от своего пользователя;
2. Прописать подключение в файле `src/main/resources/META-INF/data-source.xml` переменные
    * <YOURIP\>
    * <YOURPORT\>
    * <YOURDD\>
    * <YOURUSER\>
    * <YOURPASSWD\>
```postgresql
<bean id="dataSource" class="org.springframework.jdbc.datasource.DriverManagerDataSource">
    <property name="driverClassName" value="org.postgresql.Driver"/>
    <property name="url" value="jdbc:postgresql://<YOURIP>:<YOURPORT>/<YOURDB>"/>
    
    <property name="username" value="<YOURUSER>"/>
    <property name="password" value="<YOURPASSWD>"/>
</bean>
```

3. Произвести запуск
4. Для просмотра списка команд написать `help`, для выхоад - `exit`
