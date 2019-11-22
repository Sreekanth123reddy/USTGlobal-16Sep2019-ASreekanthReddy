import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent4',
  templateUrl: './parent4.component.html',
  styleUrls: ['./parent4.component.css']
})
export class Parent4Component implements OnInit {
  selectedMobile ;
  Mobiles = [
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2016/09/20/11/27/phone-1682317__340.png',
      name : 'Samsung',
    } ,
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2013/07/12/13/57/smartphone-147656__340.png',
      name : 'LG'
    } ,
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2015/01/20/12/51/mobile-605422__340.jpg',
      name : 'oppo x1 atom'
    } ,
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2013/07/12/18/39/smartphone-153650__340.png',
      name : 'Iphone 11 pro'
    }
  ];

  constructor() { }

  ngOnInit() {
  }
  sendMobile(mobile) {
    console.log(mobile);
    this.selectedMobile = mobile ;
  }
}
