import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { ReactiveFormsModule } from '@angular/forms';
import {FormsModule} from '@angular/forms';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { LoginComponent } from './login/login.component';
import { AddMoviesComponent } from './add-movies/add-movies.component';
import { MoviesearchComponent } from './moviesearch/moviesearch.component';
import { RouterModule } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    LoginComponent,
    AddMoviesComponent,
    MoviesearchComponent
  ],
  imports: [
    BrowserModule,
    FormsModule ,
    ReactiveFormsModule ,
    HttpClientModule ,
   RouterModule.forRoot([
     {path : 'moviesearch' , component : MoviesearchComponent} ,
     {path : 'addmovie' , component : AddMoviesComponent} ,
     {path : 'login' , component : LoginComponent}
   ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
