import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-search-news',
  templateUrl: './search-news.component.html',
  styleUrls: ['./search-news.component.css']
})
export class SearchNewsComponent implements OnInit {
  search;
  news;
  constructor(private http: HttpClient) {
    // this.getNews();
  }
  getValue(event) {
    this.search = event.target.value;
    this.http.get<any>('https://newsapi.org/v2/top-headlines?apiKey=f1f5bbfa84d747e5b533588394db19ff&q=' + this.search).subscribe(data => {
      this.news = data.articles;
      console.log(data);
    }, err => {
      console.log(err);
    }, () => {
      console.log('news got succesfully');
    });
  }

  ngOnInit() {
  }

}
