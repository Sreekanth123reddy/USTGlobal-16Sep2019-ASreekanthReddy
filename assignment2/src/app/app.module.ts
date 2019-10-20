import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { CarsComponent } from './cars/cars.component';
import { BikesComponent } from './bikes/bikes.component';
import { RouterModule } from '@angular/router';
import { ParentComponent } from './cars/parent/parent.component';
import { ChildComponent } from './cars/child/child.component';
import { Child1Component } from './bikes/child1/child1.component';
import { Parent1Component } from './bikes/parent1/parent1.component';
import { Child2Component } from './movies/child2/child2.component';
import { Parent2Component } from './movies/parent2/parent2.component';
import { Child3Component } from './laptaps/child3/child3.component';
import { Parent3Component } from './laptaps/parent3/parent3.component';
import { Child4Component } from './mobiles/child4/child4.component';
import { Parent4Component } from './mobiles/parent4/parent4.component';
import { TechComponent } from './techelevate/tech/tech.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    CarsComponent,
    BikesComponent,
    ParentComponent ,
    ChildComponent,
    Child1Component,
    Parent1Component,
    Child2Component,
    Parent2Component,
    Child3Component,
    Parent3Component,
    Child4Component,
    Parent4Component,
    TechComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot([
      {path : 'car' , component : ParentComponent} ,
      {path : 'bike' , component : BikesComponent} ,
      {path : 'movie' , component : Parent2Component} ,
      {path : 'laptap' , component : Parent3Component} ,
      {path : 'mobile' , component : Parent4Component} ,
      {path : 'home' , component : HomeComponent} ,
      {path : 'tech' , component : TechComponent}
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
