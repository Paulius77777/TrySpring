# TrySpring first time

Use SpringToolSuite4(STS)

Open STS->File->Exist Maven Projects->Browse(this file)->finish

Run File

Open link "http://localhost:8080/browser/index.html"

Everythink you can do in link and also in App: PostMan(Add,delete,update,read)

if you want to do something in PostMan "

{

  "owner": "Paulius",
  
  "address": {
  
    "city": "Vilnius",
    
    "street": "Zalgirio",
    
    "number": 90
    
  },
  
  "size": 50,
  
  "value": 1000000,
  
  "type": "APARTAMENT",
  
  "taxes": 0,
  
  "_links": {
  
    "self": {
    
      "href": "http://localhost:8080/buildings/3"
      
    },
    
    "building": {
    
      "href": "http://localhost:8080/buildings/3"
      
    }
    
  }
  
}

"

Tax calculating auto

