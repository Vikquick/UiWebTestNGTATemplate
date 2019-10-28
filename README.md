# UiWebTATemplate
## Базовый проект для UI Web тестирования (JAVA 1.8)
### Фреймворки:
1) TestNG
2) Allure
3) Cucumber-JVM
4) Selenide
5) Selenoid
### Установка Selenoid
```
curl -s https://aerokube.com/cm/bash | bash \
&& ./cm selenoid start --vnc
```
### Запуск локально
```
mvn clean test
mvn allure:serve
```
