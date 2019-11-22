import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-countries',
  templateUrl: './countries.component.html',
  styleUrls: ['./countries.component.css']
})
export class CountriesComponent implements OnInit {

  cntryNews;
  input: any;
  constructor(private http: HttpClient) {
    this.getCntrryNews();
  }
  getValue(event) {
    this.input = event.target.value;
    // tslint:disable-next-line: max-line-length
    this.http.get<any>('https://newsapi.org/v2/top-headlines?apiKey=f1f5bbfa84d747e5b533588394db19ff&country=' + this.input).subscribe(data => {
      this.cntryNews = data.articles;
      console.log(data);
    }, err => {
      console.log(err);
    }, () => {
      console.log('news got succesfully');
    });
  }
  getCntrryNews() {
    this.http.get<any>('https://newsapi.org/v2/top-headlines?country=in&apiKey=f1f5bbfa84d747e5b533588394db19ff').subscribe(data => {
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
