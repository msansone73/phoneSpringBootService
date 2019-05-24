# phoneSpringBootService
Phone spring boot service

# About the PhoneList

The PhoneList Solution is divided into two layers: WEB layer and API layer

The WEB Layer is responsible for front-end and was developed in ReactJS.

The API Layer is responsible for front-end and was developed in Java Spring.

Both layers were separated into different dock containers, the docker-compose start both container and solution run together.


# Steps to install:

1 - Git Clone

`$ git clone https://github.com/msansone73/phoneSpringBootService.git`


2 - Java build

`$ cd phoneSpringBootService
$ mvn clean install`

3 - Start service with docker compose

`$ docker-compose build
$ docker-compose up`


4 - Open Browse: http://localhost