import { Component } from '@angular/core';
import { NgFor, NgIf } from '@angular/common';
import { CourseCard } from '../../components/course-card/course-card';

@Component({
  selector: 'app-course-list',
  imports: [CourseCard, NgFor, NgIf],
  templateUrl: './course-list.html',
  styleUrl: './course-list.css'
})
export class CourseList {

  selectedCourseId = 0;

  courses = [

    { id: 1, name: 'Angular', code: 'ANG101', credits: 4 },
    { id: 2, name: 'Java', code: 'JAVA201', credits: 3 },
    { id: 3, name: 'Spring', code: 'SPR301', credits: 4 },
    { id: 4, name: 'Python', code: 'PY401', credits: 2 },
    { id: 5, name: 'React', code: 'RE501', credits: 3 }

  ];

  onEnroll(courseId: number) {

    console.log("Enrolling in course : " + courseId);

    this.selectedCourseId = courseId;

  }

}