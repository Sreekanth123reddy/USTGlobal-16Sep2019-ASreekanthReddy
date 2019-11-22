import { AbstractControl, ValidationErrors } from '@angular/forms';

export class CustomValidation {
    constructor() {}
    static unique(control: AbstractControl): ValidationErrors | null {
        if (control.value === 'admin') {
            return {uniqu: true};
            } else {
                return null;
            }

    }
}
