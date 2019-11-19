# Title

Asp.net WebApi with Sql Server Consuming on Android	 

## Description

Basic Asp.net WebApi connection with Sql Sever and Consuming on Android Application

## Knowledge Needed

1) WebApi
2) MVC
3) Android Studio
4) Sql Server Management Studio 2012


## Steps to achieve task

1) Run SqlQuery1 file as it as on Sql Server Management Studio 2012. 
2) Since database is now create Open Visual studio and create a project of webApi.
3) Connect your database with model using ADO.NET DATA.
4) Copy Code from controller file attached in code and paste it.
5) Download Nuget Package of CORS (Cross-Origin Resource Sharaing) in Nuget Package Manager Console.
6) Add "config.enableCors" in WebApiConfig file.
7) Goto ApplicationHost file and change binding from localhost to your IP Address.
8) Download above android studio code run it as it is.
9) In visual studio click on run button in webApi project.
10) Your WebApi will start in default Browser.
11) link will be like "http:192.168.0.1:4000"
    Change it to "http:192.168.0.1:4000/api/web/findall
    Explanation : api is for starting api.
		  web is your controller name you will write name of your controller.
		  findall is function name.
12) Open your public firewall from windows setting.
13) Copy changed link and paste it in android studio where i have commented you ip/link here in ApiClient file.
14) Run the code of android make sure your service is running and alive.
## Developer

* **Sooraj Kumar - BS(CS) FAST NUCES KHI** 
