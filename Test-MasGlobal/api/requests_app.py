import requests
from requests.exceptions import URLRequired

class RequestsApi:

    url = "http://localhost:9090/employees/list/"
    #headers = {'x-api-key': 'ceaaedaf-7b48-4b21-bab0-0c14590e9899'}

    @staticmethod
    def getAll_api():
        try:
            #response = requests.request("GET", RequestsApi.url, headers=RequestsApi.headers)
            response = requests.get(RequestsApi.url)
            if response.status_code != 200:
                return {"mesage": "Employe not found"}
            else:
                return response.json()
        except:
            return {"mesage": "Service not response"}

    @staticmethod
    def getOne_api(employe_id):
        try:
            response = requests.get(RequestsApi.url)
            if response.status_code != 200:
                return False
            else:
                EmployeFound = [employe for employe in response.json() if employe['id'] == int(employe_id) ]
                if (len(EmployeFound) > 0):
                    return EmployeFound[0]
                else:
                    return {"mesage": "Employe not found"}
        except:
            return {"mesage": "Service not response"}
