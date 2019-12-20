import { ElementRef, Directive, HostBinding, HostListener } from '@angular/core';


@Directive({
    selector : ' [custDir] '

})


// tslint:disable-next-line: directive-class-suffix
export class CustomDirectiveComponent  {
    constructor(private el: ElementRef) {
        this.el.nativeElement.style.backgroundColor = 'red' ;
    }
    @HostBinding('style.backgroundColor') color = 'yellow';
    @HostListener('mouseenter') mouseEnterEvent() {
        this.el.nativeElement.style.backgroundColor = 'brown' ;
    }
    @HostListener('mouseleave') mouseLeaveEvent() {
        this.el.nativeElement.style.backgroundColor = 'blue' ;
    }
}
