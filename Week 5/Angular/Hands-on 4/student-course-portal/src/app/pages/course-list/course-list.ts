import { Component, OnInit } from '@angular/core';
import { NgIf, NgFor } from '@angular/common';
import { CourseCard } from '../../components/course-card/course-card';
import { Highlight } from '../../directives/highlight';

@Component({
  selector: 'app-course-list',
  standalone: true,
  imports: [NgIf, NgFor, CourseCard, Highlight],
  templateUrl: './course-list.html',
  styleUrl: './course-list.css'
})
export class CourseList implements OnInit {

  isLoading = true;

  courses = [
    {
      id: 1,
      name: 'Angular',
      code: 'ANG101',
      credits: 4,
      gradeStatus: 'passed'
    },
    {
      id: 2,
      name: 'Java',
      code: 'JAVA201',
      credits: 3,
      gradeStatus: 'failed'
    },
    {
      id: 3,
      name: 'Spring Boot',
      code: 'SPR301',
      credits: 5,
      gradeStatus: 'pending'
    }
  ];

  ngOnInit() {
    setTimeout(() => {
      this.isLoading = false;
    }, 1500);
  }

  trackByCourseId(index: number, course: any) {
    return course.id;
  }
}