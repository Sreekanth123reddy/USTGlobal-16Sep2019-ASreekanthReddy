import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ng-for',
  templateUrl: './ng-for.component.html',
  styleUrls: ['./ng-for.component.css']
})
export class NgForComponent implements OnInit {
  Products = [{
    img : 'https://cdn.pixabay.com/photo/2016/04/15/08/04/strawberries-1330459__340.jpg',
    name : 'strawberrys',
    cost : 200
  },
  {
    img : 'https://cdn.pixabay.com/photo/2016/10/13/22/52/walnut-1739021__340.jpg',
    name : 'nuts',
    cost : 290
  }, {
    img : 'https://cdn.pixabay.com/photo/2018/05/29/23/18/potato-3440360__340.jpg',
    name : 'Potatoes',
    cost : 100
  } ];
  constructor() { }

  ngOnInit() {
  }

}
