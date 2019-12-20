import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-classbinding',
  templateUrl: './classbinding.component.html',
  styleUrls: ['./classbinding.component.css']
})
export class ClassbindingComponent implements OnInit {
  isActive = true;
  address = ['singareddy gari palle' , ' kosuvaripalle' , 'Madanapaalle'];
  img = 'https://cdn.pixabay.com/photo/2019/09/27/14/38/zoo-4508682__340.jpg';
  constructor() { }
  ngOnInit() {
    setInterval(() => {
      this.isActive = !this.isActive;
    }, 2000);
  }

}
