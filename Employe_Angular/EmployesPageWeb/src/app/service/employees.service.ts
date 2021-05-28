import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EmployeesService {

  url = 'localhost:8081/list';

  constructor( private http:HttpClient ) {
    console.log('Service Employees');
   }

   getEmployee(termino:string):Observable<any> {

    return this.http.get<any>(`list/${termino}`);

    //return this.http.get<any>('localhost:8081/list');

     //let header = new HttpHeaders().set('Type-content','aplication/json')

     //return this.http.get(this.url,{headers:header})

   }

   getEmployees():Observable<any> {

    return this.http.get<any>('list');

    //return this.http.get<any>('localhost:8081/list');

     //let header = new HttpHeaders().set('Type-content','aplication/json')

     //return this.http.get(this.url,{headers:header})

   }

}
