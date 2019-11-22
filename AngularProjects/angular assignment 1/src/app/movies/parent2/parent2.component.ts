import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent2',
  templateUrl: './parent2.component.html',
  styleUrls: ['./parent2.component.css']
})
export class Parent2Component implements OnInit {
  selectedMovie ;
  Movies = [
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2017/08/27/23/59/capitanamerica-2688069__340.jpg',
      name : 'Captain America' ,
      content : 'Chris Evans is the hero of Captain america .Rating 4.5/5 .Thriller and Action adventure'
    } ,
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2017/08/27/23/59/marvel-2688068__340.jpg',
      name : 'DeadPool' ,
      content : 'Rating 5/5 . Comedy and action .'
    } ,
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2019/09/07/12/29/man-4458689__340.jpg',
      name : 'Spider man' ,
      content : ' Rating 3/5 .Spyder man , its a tribute to the Iron man who lost his life by killing Thanos'
    } ,
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2017/06/07/19/30/wonder-woman-2381272__340.jpg',
      name : 'Wonder Woman',
      content : 'Its DC movie .The movie rating is 2.9/5 . Fully action film'
    }
  ];
  constructor() { }

  ngOnInit() {
  }
  sendMovie(movie) {
    console.log(this.selectedMovie);
    this.selectedMovie = movie ;
  }

}
