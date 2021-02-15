
### POSTMAN call

Call URL https://localhost:44302/api/pay/ with POST
with JSON:
```json
{
	"creditCardNumber": "8422 6256 4830 4152",
	"cardHolder" : "JOY SINHA",
	"expirationDate" : "2021-03-02",
	"securityCode" : "789",
	"amount" : 28
}
```

***

### DB Creation

- Set db connection string in appsettings.json 
- Open Package Manager Console
- Set project to Entity. 
- Set Startup project to WepApi.
- Run command update-database

DB should be created

***
***

# Requirements
VS Code
.net Core


