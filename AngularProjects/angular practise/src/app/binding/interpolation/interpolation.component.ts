import { Component, OnInit } from '@angular/core';

@Component({
  selector: '.app-interpolation',
  templateUrl: './interpolation.component.html',
  styleUrls: ['./interpolation.component.css']
})
export class InterpolationComponent implements OnInit {
    public name ="Sreekanth Reddy";
  constructor() { }

  ngOnInit() {
  }
  greetUser(){
    return "Hello "+this.name ;
  }

}
