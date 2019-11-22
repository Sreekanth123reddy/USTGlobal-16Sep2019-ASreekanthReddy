import { AbstractControl, ValidationErrors } from '@angular/forms';




export class CustomValidation {
    constructor() {}
    static unique(control: AbstractControl): ValidationErrors | null {
if (control.value === 'sreekanthcsc1997@gmail.com') {
    return {unique : true};
} else {
    return null;
}
    }
}
