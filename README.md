# dio-estudos-java
## Curso de Java pela DIO; projetos e materiais de apoio.


### 📚Material de apoio para Java
- [Java básico](https://glysns.gitbook.io/java-basico/sintaxe/variaveis).
- [Java DOC](https://web.dio.me/course/aprendendo-a-sintaxe-java/learning/22291e9a-f214-4429-9701-3c6e050e2e19?back=/track/santander-2024-backend-com-java&tab=undefined&moduleId=undefined)
- [Springboot](https://github.com/digitalinnovationone/dio-springboot)



### Propriedades
- **Final**:
  _torna a variável imutável_
- **Protected**:
  _limita o aceso da variável às classes filhas que herdam a classe mae_
- **Private**:
    _Apenas a classe pode acessar aquela variável_
- **Default**:
_É usado em variáveis de abstract, não classes normais_


### Ⓜ️Maven
**Estrutura**
![Minha imagem](imagens/estrutura-maven-1.png)

#### Comandos:

- _Para transformar aquele projeto em uma dependencia local na pasta .m2_:
````mvn install````
- _Para compilar o arquivo após adicionar uma dependência_: ````mvn compile````


#### Escopos:
- Compile:

*Default / Disponível em todos classpaths / Transitivo*
- Provided: 

*Fornecido por uma implementação que rodará em tempo de execução / Não é transitivo*
- Runtime: 

*necessária apenas para a execução e não compilação*
- Test: 

*Disponível somente para compilação e execução dos testes*
- System: 

*Similar ao provided sendo necessário prover o JAR explicitamente*
- Import:

*Disponível apenas com uma dependência do tipo POM / reutilizar dependencias de outro projeto*

- A tag <_optional_> é usada nas dependências que não se quer que haja transitividade na hora de importar em outras dependecias


#### Maven build lifesycle

* Composto por 3 ciclos de vida
* Cada ciclo possui fases e objetivos

    
  * **Default Lifecycle**
    * principal ciclo
    * responsvaél pelo deploy local
    * composto por 23 fases
  * **Clean Lyfecycle**
    * Faz a limpeza
    * composto por 3 fazes
      * pre-clean
      * clean
      * post-clean
  * **Site Lifecycle**
    * ciclo final
    * criação do site de documentação do projeto
    * 4 fases
      * pre-site
      * sote
      * post-site
      * site-deploy

### JUnit
**Asserts**

_Para comparar números inteiros_

````Assertions.assertEquals()````

_Verificações Booleanas_

````Assertions.assertTrue()````
````Assertions.assertFalse()````

_Comparação de Arrays_

````Assertion.assertArrayEquals()````

_Throws exception_

````Assertions.assertTrows(<Exception>.class, () -> <chamar a função para verificar se ocorre a exception>)````



**Boas práticas**

* Primeiro você faz o teste e depois faz o código
* Crie um código inicial de forma que ele de errado para a partir daí seguir os 3 passos da TDD
* Faça o código retornar o valor certo com a menor quantidade de linhas possíveis
* Refatore o código, arrume
* Os testes devem ser o mais simples possóvel para que todos entendam a documentação do código
* Quando o teste passa sem que você tenha escrito o código especificamente para ele, suspeite


**@**

* @TestMethodOrder(MethodOrder.OrderAnnotation.class)
  * @Order()

### 🍃 Spring (boot) Framework

**Slides**
- [Slide Gleyson Sampaio](https://docs.google.com/presentation/d/1jS5Ov8UCSnzgW3TLBcAsGrXo__kL6FOG/edit#slide=id.p1)

**Fundamentos**
- Para utilizar as classes como Beans (Objetos administrados por um container do spring) é necessário implementar a interface "CommandLineRunner"
 
![Minha imagem](imagens/springboot-criacao-beans.png)

- Quando um componente precisar utilizar outro componente é necessário fazer a injeção de dependência: ````@Autowired````

- ````@Component```` é utilizado quando se tem acesso ao código; ```@Beans``` é utilizado para classes externas, e pe recomendado utilizar uma classe para fazer a injeção:
  ![Minha imagem](imagens/beans.png)

  ![Minha imagem](imagens/sla.png)


- O ````@Values```` é utilizado para se atribuir valores de forma não declarativa no escopo, utilizando a pasta "aplications.properties":
![Minha](imagens/aplication-propeties.png)


- É possível criar-se uma classe com os atributos que se quer usar com as atribuições no "aplications.properties"
  ![Minha](imagens/configurationProperties.png)
  ![Minha](imagens/aplications-properties.png)

## Spring web
- ````@RestController````: Responsável por designar o bean de compoment que suporta requisições HTTP com base na arquitetura REST
- ````@RequestMapping````(*"prefix"*): Determina qual a URI comum para todos os recursos disponibilizados pelo Controller
- ````@GetMapping````: Determina que o método receberá requisições **HTTP** do tipo **GET**
- ````@PostMapping````: Determina que o método receberá requisições **HTTP** do tipo **POST**
- ````@PutMapping````: Determina que o método receberá requisições **HTTP** do tipo **PUT**
- ````@DeleteMapping````: Determina que o método receberá requisições **HTTP** do tipo **DELETE**
- ````@RequestBody````: Converte um **JSON** para o tipo de objeto esperado como parâmetro no método
- ````PathVariable````: Consegue determinar que parte da URI será composta por parâmetros recebidos na requisição


## Spring Security
- Permite criar uma tela de autenticação de login
- Você pode definir usuário e senha padrão no aplications.properties com a notação:


  * ````@spring.security.user.name=<nome de usuário>````
  * ````@spring.security.user.password=<senha>````
  * ````@spring.security.user.roles=<caminho de acesso na URL (geralmente em caps)>````


- Ou você pode criar um classe a parte e fazer as confirguraçõs de múltiplos usuários:
![minha imagemn](imagens/spring-security-users.png)

  
- Para filtrar o acesso de determinados usuários é possível se fazer a pré autenticação a partir dos ROLES de cada usuários:

![minha imagem](imagens/spring-autenticacao-roles.png)



### ✨ Extras
**Operador ternário**

_É uma espécie de if resumida:_
```
String resultado = a==b ? "Verdadeiro" "Falso"
```
_A variável resultado vai receber o valor "Verdadeiro" caso a==b, se não receberá "Falso"._

**Operadores lógicos**

_Operador &&, para o caso das 2 condições serem verdadeiras_
```
if (a && b){System.out.println("True");}
```

_Operador ||, para quando pelo menos uma das operações for verdadeira_
```
if (a||b){System.out.println("Pelo menos um é true")}
```

**Como executar arquivos .class usando args no terminal**
- [Terminal e argumentos - Aula 3](https://web.dio.me/course/aprendendo-a-sintaxe-java/learning/1e236fcb-c01a-49ee-bd79-e9a41cde9cff?back=/track/santander-2024-backend-com-java&tab=undefined&moduleId=undefined)


**Material de apoio sobre MongoDB**
- [Site MongoDB](https://www.mongodb.com/blog/post/building-with-patterns-a-summary)
- [Agregation - MongoDB manual](https://www.mongodb.com/blog/post/building-with-patterns-a-summary)


**ORM (Object-Relational-Mapping)**
- É uma forma de fazer o mapeamento dos objetos para uma tabela a partir de uma biblioteca ou framework 
- Utilizado para fazer integração com um banco de dados
 
**JPA**
- Uma especificação baseada em interfaces, que através de um framework realiza operações de persistência de objetos em java
- Principais imlementações:
  * Hibernate
  * EclipseLink
  * Oracle TOPLINK
  * Open JPA

![Minha](imagens/mapeamento-classes.png)

**Exemplo de projeto com Sprimg Data JPA:**
[Spring Data JPA](https://github.com/digitalinnovationone/dio-springboot/tree/main/dio-spring-data-jpa)





