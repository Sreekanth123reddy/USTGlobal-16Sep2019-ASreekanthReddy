import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-sources',
  templateUrl: './sources.component.html',
  styleUrls: ['./sources.component.css']
})
export class SourcesComponent implements OnInit {
  news;
  input: any;
  constructor(private http: HttpClient) {
    this.getNews();
  }
  getValue(event) {
    this.input = event.target.value;
    // tslint:disable-next-line: max-line-length
    this.http.get<any>('https://newsapi.org/v2/top-headlines?apiKey=f1f5bbfa84d747e5b533588394db19ff&sources=' + this.input).subscribe(data => {
      this.news = data.articles;
      console.log(data);
    }, err => {
      console.log(err);
    }, () => {
      console.log('news got succesfully');
    });
  }
  getNews() {
    this.http.get<any>('https://newsapi.org/v2/top-headlines?sources=bbc-news&apiKey=f1f5bbfa84d747e5b533588394db19ff').subscribe(data => {
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
