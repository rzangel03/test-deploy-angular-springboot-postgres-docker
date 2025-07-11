import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class ApiService {
  private readonly server: string = environment.API_BASE_URL;

  constructor(private httpClient: HttpClient) { 

  }

  public getDemoMethod(){  
		return this.httpClient.get(`${this.server}/api/v1/employees`);  
	}  
}