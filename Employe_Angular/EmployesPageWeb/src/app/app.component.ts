import { Component } from '@angular/core';
import {EmployeesService} from './service/employees.service'

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  providers: [EmployeesService]
})
export class AppComponent {
  title = 'EmployesPageWeb';

  public employes:Array<any> = []

  //employes: any[] =[];

  constructor(private EmployeesSrv:EmployeesService) {

    this.EmployeesSrv.getEmployees().subscribe((resp:any) => {
      console.log(resp);
      this.employes = resp;
    })

  }

  buscar(termino:string) {

    console.log(termino)
    this.EmployeesSrv.getEmployee(termino).subscribe((resp:any) => {
      console.log(resp);
      this.employes = [{"anualSalary":resp.anualSalary,
                         "contractTypeName":resp.contractTypeName,
                         "hourlySalary":resp.hourlySalary,
                         "id":resp.id,
                         "monthlySalary":resp.monthlySalary,
                         "name":resp.name,
                         "roleDescription":resp.roleDescription,
                         "roleId":resp.roleId,
                         "roleName":resp.roleName    
    }]; 
      console.log(this.employes) 
      }
    )
   
  }

  ngOnInit(){
    this.EmployeesSrv.getEmployees().subscribe((resp:any) => {
      console.log(resp);
      this.employes = resp;
    })
  }

}
