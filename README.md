<br/>
<p align="center">
  <a href="https://github.com/ZeadShalaby/Staff-Management-System">
    <img src="https://i.imgur.com/LrPHedV.png" alt="Logo" width="100" height="100">
  </a>
  

<h3 align="center">Staff-Management-System</h3>

  <p align="center">
    Project With Java
    <br/>
    <br/>
  </p>


![Forks](https://img.shields.io/github/forks/ZeadShalaby/Staff-Management-System?style=social) ![Issues](https://img.shields.io/github/issues/ZeadShalaby/Staff-Management-System) ![License](https://img.shields.io/github/license/ZeadShalaby/Staff-Management-System)

## Table Of Contents

* [About the Project](#about-the-project)

* [Usage](#usage)
    * [Locally](#running-locally)
    * [Via Container](#running-via-container)
* [Contributing](#contributing)
* [Authors](#authors)

## About The Project


 <img src="https://i.imgur.com/KmyU5zz.png" alt="Logo" width="900" height="500">
  



## Usage

### Running Locally

Make the migrations to update the database

```bash
    php artisan migrate
```

Seed the Database

```bash
    php artisan db:seed
```

Start the server and run watch

```bash
    php artisan serve
```

```bash
    npx run watch
````

or alternatively run the .bat

```bash
    /autorun.bat
```

go to the following route

```
    http://127.0.0.1:8000/
```

### Running via container

pull the image 

```
docker pull zodicslanser/lms
``` 

 run the container

 ```
 docker run --name lms -p 8000:8000 -d zodicslanser/lms
 ```
 
 connect to Container Terminal
 
 ```
 docker exec -it lms /bin/sh
 ```
 
 make the migrations to update the database

```bash
    php artisan migrate
```

 go to the following page
 ```
 <container-ip>:8000
 ```
## Contributing

Any contributions you make are **greatly appreciated**.

* If you have suggestions for adding or removing projects, feel free
  to [open an issue](https://github.com/ZodicSlanser/Learning-Management-System/issues/new) to discuss it, or directly
  create a pull request after you edit the *README.md* file with necessary changes.
* Please make sure you check your spelling and grammar.
* Create individual PR for each suggestion.
* Make sure to add a meaningful description

### Creating A Pull Request

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## Authors

* **Ziad Shalaby** - *Computer Science Student* - [Ziad Shalaby](https://github.com/ZeadShalaby)
