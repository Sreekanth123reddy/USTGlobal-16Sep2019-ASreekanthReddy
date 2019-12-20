import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-categories',
  templateUrl: './categories.component.html',
  styleUrls: ['./categories.component.css']
})
export class CategoriesComponent implements OnInit {
  cntryNews;
  input: any;
  constructor(private http: HttpClient) {
    this.getCntrryNews();
  }
  getValue(event) {
    this.input = event.target.value;
    // tslint:disable-next-line: max-line-length
    this.http.get<any>('https://newsapi.org/v2/top-headlines?country=in&apiKey=f1f5bbfa84d747e5b533588394db19ff&category=' + this.input).subscribe(data => {
      this.cntryNews = data.articles;
      console.log(data);
    }, err => {
      console.log(err);
    }, () => {
      console.log('news got succesfully');
    });
  }
  getCntrryNews() {
    // tslint:disable-next-line: max-line-length
    this.http.get<any>('https://newsapi.org/v2/top-headlines?country=in&category=entertainment&apiKey=f1f5bbfa84d747e5b533588394db19ff').subscribe(data => {
      this.cntryNews = data.articles;
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
