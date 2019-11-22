import { BrowserModule } from '@angular/platform-browser';
import { NgModule, Component } from '@angular/core';
import {ReactiveFormsModule} from '@angular/forms' ;
import {FormsModule} from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { HelpComponent } from './help/help.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { HeaderComponent } from './header/header.component';
import { RouterModule } from '@angular/router';
import { InterpolationComponent } from './binding/interpolation/interpolation.component';
import { PropertybindingComponent } from './binding/propertybinding/propertybinding.component';
import { ClassbindingComponent } from './binding/classbinding/classbinding.component';
import { StyleAttributeBindingComponent } from './binding/style-attribute-binding/style-attribute-binding.component';
import { EventbindingComponent } from './binding/eventbinding/eventbinding.component';
import { TwowaybindingComponent } from './binding/twowaybinding/twowaybinding.component';
import { NgIfComponent } from './StructuralDirectives/ng-if/ng-if.component';
import { NgForComponent } from './StructuralDirectives/ng-for/ng-for.component';
import { NgSwitchComponent } from './StructuralDirectives/ng-switch/ng-switch.component';
import { NgStyleNgClassComponent } from './attributedirectives/ng-style-ng-class/ng-style-ng-class.component';
import { CustomDirectiveDirective } from './custom-directive.directive';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    AboutComponent,
    HelpComponent,
    LoginComponent,
    RegisterComponent,
    HeaderComponent,
    InterpolationComponent,
    PropertybindingComponent,
    ClassbindingComponent,
    StyleAttributeBindingComponent,
    EventbindingComponent,
    TwowaybindingComponent,
    NgIfComponent,
    NgForComponent,
    NgSwitchComponent,
    NgStyleNgClassComponent,
    CustomDirectiveDirective
  ],
  imports: [
    BrowserModule,
    FormsModule ,
    ReactiveFormsModule,
    RouterModule.forRoot([
      {path : 'home' , component : HomeComponent} ,
      {path : 'about' , component : AboutComponent},
      {path: 'help' , component : HelpComponent},
      {path : 'login' , component : LoginComponent} ,
      {path : 'register' , component : RegisterComponent}
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
