import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-form-one',
  templateUrl: './form-one.component.html',
  styleUrls: ['./form-one.component.css']
})
export class FormOneComponent implements OnInit {
  model: any = {};
  countries: any;

  constructor() { }

  ngOnInit() {
    this.countries = [
      {'id' : 1, 'name': 'India', 'code': "IN"},
      {'id' : 2, 'name': 'Nepal', 'code':'NP'},
      {'id' : 3, 'name': 'United Arab Emirates', 'code': 'AE'},
      {'id' : 4, 'name': 'United Kingdom', 'code': 'GB'},
      {'id' : 5, 'name': 'United States', 'code': 'US'},
      {'id' : 6, 'name': 'Australia', 'code': 'AU'},
      {'id' : 7, 'name': 'Austria', 'code': 'AT'},
      {'id' : 8, 'name': 'Canada', 'code': 'CA'},
      {'id' : 9, 'name': 'China', 'code': 'CN'},
    ];

  }
  public onSubmitCustomer() {
    alert('Your information has been submitted successfully. :-)\n\n' + JSON.stringify(this.model))
  }
}
