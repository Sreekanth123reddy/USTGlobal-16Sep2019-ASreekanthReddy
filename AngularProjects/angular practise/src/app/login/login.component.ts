import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { CustomValidation } from './custom.validation';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  get username() {
    return this.loginForm.get('username');
  }
get password() {
  return this.loginForm.get('password');
}
  loginForm =  new FormGroup({
    username: new FormControl('' , [Validators.required , CustomValidation.unique]),
    password: new FormControl('' , [Validators.required])
  });
  constructor() { }

  ngOnInit() {
  }

}
