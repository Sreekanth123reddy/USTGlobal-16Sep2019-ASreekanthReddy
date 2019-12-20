import { Component, OnInit } from '@angular/core';

@Component({
  selector: '[app-propertybinding]',
  templateUrl: './propertybinding.component.html',
  styleUrls: ['./propertybinding.component.css']
})
export class PropertybindingComponent implements OnInit {
public  myId ="testId";
public name="sree";
public img ='https://cdn.pixabay.com/photo/2019/09/15/14/22/coast-4478424__340.jpg';
public isDisabled = true;
  constructor() { }

  ngOnInit() {
  }

}
