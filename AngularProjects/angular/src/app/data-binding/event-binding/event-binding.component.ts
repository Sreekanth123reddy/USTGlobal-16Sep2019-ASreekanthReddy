import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-event-binding',
  templateUrl: './event-binding.component.html',
  styleUrls: ['./event-binding.component.css']
})
export class EventBindingComponent implements OnInit {
  inputEvent = '';
  constructor() { }

  ngOnInit() {
  }
printAlertMsg() {
  alert('Hi hello from Angular');
}
dataInput(event) {
  console.log(event.target.value);
  this.inputEvent = event.target.value;
}
}
