# Test N°2 : Backend - Spring Boot Fizz Buzz

## Lancement de l'API REST avec Spring Boot

#### Exécuter l'API REST :

Ouvrez le projet dans un IDE (par exemple, IntelliJ IDEA, Eclipse, etc.).

Exécutez la classe ***`ManageoTest2Application`***. Cela démarrera l'application Spring Boot et l'API sera accessible à l'URL http://localhost:8080.

#### Tester l'API REST :

Utilisez un client REST, tel que **Postman**, ou un **navigateur** pour envoyer des requêtes à l'URL de l'API. Dans notre cas, vous pouvez envoyer une requête GET à l'URL http://localhost:8080/fizzbuzz/{number}, où **{number}** est un nombre **entier**.

Vérifiez les réponses renvoyées par l'API. Pour chaque nombre de **1 à {number}**, l'API appliquera la logique **FizzBuzz** et renverra une **liste de résultats**.

Par exemple, si vous envoyez une requête GET à **http://localhost:8080/fizzbuzz/15**, vous devriez obtenir une liste de résultats FizzBuzz pour les nombres de **1 à 15**.