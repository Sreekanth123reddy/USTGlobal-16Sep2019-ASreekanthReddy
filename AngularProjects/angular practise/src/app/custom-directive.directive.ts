import { Directive, ElementRef, HostBinding, HostListener } from '@angular/core';

@Directive({
  selector: '[appCustomDirective]'
})
export class CustomDirectiveDirective {

  constructor(private el: ElementRef) {
    this.el.nativeElement.style.backgroundColor = 'red';
   }
@HostBinding('style.backgroundColor') color = 'yellow';
@HostListener('mouseenter') mouseEnterEvent(){
  this.el.nativeElement.style.backgroundColor = 'green';
}
@HostListener('mouseleave') mouseLeaveEvent(){
  this.el.nativeElement.style.backgroundColor ='blue';
}
}
