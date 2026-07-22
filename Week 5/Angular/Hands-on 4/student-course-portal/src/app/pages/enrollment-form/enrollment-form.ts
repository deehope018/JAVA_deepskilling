import { Component } from '@angular/core';
import { NgForm, FormsModule } from '@angular/forms';
import { NgIf } from '@angular/common';

@Component({
  selector: 'app-enrollment-form',
  standalone: true,
  imports: [FormsModule, NgIf],
  templateUrl: './enrollment-form.html',
  styleUrl: './enrollment-form.css'
})
export class EnrollmentFormComponent {
  studentName = '';
  studentEmail = '';
  courseId: number | null = null;
  preferredSemester = '';
  agreeToTerms = false;
  submitted = false;

  onSubmit(form: NgForm) {
    console.log(form.value);
    console.log(form.valid);
    if (form.valid) {
      this.submitted = true;
    }
  }
}
