import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-style-attribute-binding',
  templateUrl: './style-attribute-binding.component.html',
  styleUrls: ['./style-attribute-binding.component.css']
})
export class StyleAttributeBindingComponent implements OnInit {
 colorName = 'yellow';
 isActive = true;
 colspanValue = 2;
  constructor() { }

  ngOnInit() {
    setTimeout(() => {
      this.colorName = 'red';
      this.isActive = !this.isActive;
    }, 2000);
  }

}
