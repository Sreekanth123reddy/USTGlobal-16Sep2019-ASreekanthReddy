import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CategoriesComponent } from './categories/categories.component';
import { CountriesComponent } from './countries/countries.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { SearchNewsComponent } from './search-news/search-news.component';
import { SourcesComponent } from './sources/sources.component';
import { RouterModule } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    CategoriesComponent,
    CountriesComponent,
    HeaderComponent,
    HomeComponent,
    SearchNewsComponent,
    SourcesComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule ,
    HttpClientModule ,
    RouterModule.forRoot([
      {path : 'countries' , component : CountriesComponent} ,
      {path : 'categories' , component : CategoriesComponent} ,
      {path : 'source' , component : SourcesComponent} ,
      {path : 'search' , component : SearchNewsComponent} ,
      {path : '' , component : HomeComponent}
      ])
 ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
