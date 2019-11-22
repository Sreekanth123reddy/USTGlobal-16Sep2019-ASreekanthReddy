import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { HelpComponent } from './help/help.component';
import { AboutComponent } from './about/about.component';
import { RouterModule } from '@angular/router';
import { FooterComponent } from './footer/footer.component';
import { DataBindingComponent } from './data-binding/data-binding.component';
import { PropertyBindingComponent } from './data-binding/property-binding/property-binding.component';
import { EventBindingComponent } from './data-binding/event-binding/event-binding.component';
import { TwowayDataBindingComponent } from './data-binding/twoway-data-binding/twoway-data-binding.component';
import { DirectivesComponent } from './directives/directives.component';
import { NgIfComponent } from './directives/ng-if/ng-if.component';
import { NgForComponent } from './directives/ng-for/ng-for.component';
import { NgSwitchComponent } from './directives/directives/ng-switch/ng-switch.component';
import { CustomDirectiveComponent } from './custom.directive';
import { RegisterComponent } from './register/register.component';
import { FormOneComponent } from './form-one/form-one.component';
import { FormTwoComponent } from './form-two/form-two.component';
import { ReactiveFormComponent } from './reactive-form/reactive-form.component';
import { ParentComponent } from './parent/parent.component';
import { ChildComponent } from './child/child.component';
import { CommentComponent } from './comment/comment.component';
import { CommentSectionComponent } from './comment-section/comment-section.component';
import { DollarPipe } from './dollar.pipe';



@NgModule({
  declarations: [
    AppComponent ,
    HeaderComponent ,
    HomeComponent ,
    HelpComponent ,
    AboutComponent ,
    FooterComponent,
    DataBindingComponent,
    PropertyBindingComponent,
    EventBindingComponent,
    TwowayDataBindingComponent,
    DirectivesComponent,
    NgIfComponent,
    NgForComponent,
    NgSwitchComponent ,
    CustomDirectiveComponent,
    RegisterComponent,
    FormOneComponent,
    FormTwoComponent,
    ReactiveFormComponent,
    ParentComponent,
    ChildComponent,
    CommentComponent,
    CommentSectionComponent,
    DollarPipe,
    ],
  imports: [
    BrowserModule,
    FormsModule ,
    ReactiveFormsModule ,
    HttpClientModule ,
    RouterModule.forRoot([
      {path : '', component : HomeComponent } ,
      {path :  'about' , component : AboutComponent},
      {path : 'help' , component : HelpComponent} ,
      {path : 'property-binding' , component : PropertyBindingComponent} ,
      {path : 'event-binding' , component : EventBindingComponent} ,
      {path : 'twoway-binding' , component : TwowayDataBindingComponent} ,
      {path : 'ng-if' , component : NgIfComponent} ,
      {path : 'ng-for' , component : NgForComponent} ,
      {path : 'ng-switch' , component : NgSwitchComponent},
      {path : 'register' , component : RegisterComponent} ,
      {path : 'form-1' , component : FormOneComponent} ,
      {path : 'form-2' , component : FormTwoComponent} ,
      {path : 'reactive-form' , component : ReactiveFormComponent} ,
      {path : 'parent' , component : ParentComponent },
      {path : 'comment-details' , component : CommentSectionComponent}
     ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
