import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ng-style-ng-class',
  templateUrl: './ng-style-ng-class.component.html',
  styleUrls: ['./ng-style-ng-class.component.css']
})
export class NgStyleNgClassComponent implements OnInit {
    colorName = 'red ';
    isActive = true;
  constructor() { }

  ngOnInit() {
    setTimeout(() => {
      this.isActive = !this.isActive;
    }, 2000);
  }

}
