import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent3',
  templateUrl: './parent3.component.html',
  styleUrls: ['./parent3.component.css']
})
export class Parent3Component implements OnInit {
  selectedLaptap ;
  Laptaps = [
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2014/09/24/14/29/mac-459196__340.jpg',
      name : 'Mac'
    } ,
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2014/05/02/21/47/workstation-336369__340.jpg',
      name : 'Windows'
    } ,
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2018/03/01/09/33/laptop-3190194__340.jpg',
      name : 'Unix'
    } ,
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2016/06/28/05/10/laptop-1483974__340.jpg',
      name : 'Cisco'
    }
  ];
  constructor() { }

  ngOnInit() {
  }
  sendLaptap(laptap) {
    console.log(laptap);
    this.selectedLaptap = laptap ;
  }
}
