import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-eventbinding',
  templateUrl: './eventbinding.component.html',
  styleUrls: ['./eventbinding.component.css']
})
export class EventbindingComponent implements OnInit {
    greeting = '';
  constructor() { }

  ngOnInit() {
  }
  onClick(event) {
     this.greeting = 'Hi Hello Sreekanth Reddy';
     console.log(event);
     this.greeting = event.type;
  }

}
