# Selenium Test for platform [Njuškalo.hr](https://www.njuskalo.h)

The whole test consist three suit cases- login, search bar and advertisiment update suit case.
Login has three test cases, search bar and advertisiment have two. All together,that is seven test cases.

Google chrome web driver was user in this project. It was set manually.

## Cases
Login suit covered : 
  -Login with registered username and valid password
  -Login with registered username and false password
  -Login with false username and valid password
  
 Search bar suit covered : 
  -Searching words which are entered in search bar
  -Searching when is in search bar entered something no sense
  
Advertisiment suit covered :
  - View already created advertisiment
  - Update already created advertisiment
  
 ## How to run cases ?
 For running cases we can type "mvn test" in IntelliJ terminal or we can click on ![Run tests](https://www.iconfinder.com/icons/978327/movie_play_run_start_triangle_icon)
