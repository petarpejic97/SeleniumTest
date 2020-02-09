# Selenium Test for platform [Njuškalo.hr](https://www.njuskalo.h)

The whole test consist three suit cases- login, search bar and advertisiment update suit case.
Login has three test cases, search bar and advertisiment have two. All together,that is seven test cases.

Google chrome web driver was user in this project. It was set manually.

## Suit Cases
Login suit covered : 
  - Login with registered username and valid password
      - login with real username and password
  - Login with registered username and false password
      - the password isn't correct
  - Login with false username and valid password
      - incorrect username
  
 Search bar suit covered : 
  - Searching words which are entered in search bar
  - Searching when is in search bar entered something nonsense
      -the word doesnt have any meaning
  
Advertisiment suit covered :
  - View already created advertisiment
      -detailed view on advertisiment
  - Update already created advertisiment
      -the product price changed
  
  All test cases passed.

  
 ## How to run cases ?
 For running cases we can type "mvn test" in IntelliJ terminal or we can click in right top corner on ![Run tests](https://cdn2.iconfinder.com/data/icons/hand-drawn-file-operations/128/run-512.png)
