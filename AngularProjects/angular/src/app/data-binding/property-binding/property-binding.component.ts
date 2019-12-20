import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-property-binding',
  templateUrl: './property-binding.component.html',
  styleUrls: ['./property-binding.component.css']
})
export class PropertyBindingComponent implements OnInit {

  name = 'Sreekanth Reddy';
  imgUrl = 'https://cdn.pixabay.com/photo/2019/09/27/14/38/zoo-4508682__340.jpg';
  address = ['singareddy gari palle' , ' kosuvaripalle' , 'Madanapaalle'];
  colorName = 'yellow';
  isActive = false;
  colspanValue = 2;
 constructor() { }

  ngOnInit() {
    setInterval(() => {
      this.colorName = 'red';
      this.isActive = ! this.isActive;
    }, 2000);
  }

}
