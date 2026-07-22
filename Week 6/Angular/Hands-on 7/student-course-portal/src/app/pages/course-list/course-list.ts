import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { Router, ActivatedRoute } from '@angular/router';

import { CourseCard } from '../../components/course-card/course-card';
import { CourseService } from '../../services/course';
import { Course } from '../../models/course.model';

@Component({
  selector: 'app-course-list',
  standalone: true,
  imports: [
    CommonModule,
    FormsModule,
    CourseCard
  ],
  templateUrl: './course-list.html',
  styleUrl: './course-list.css'
})
export class CourseList implements OnInit {

  courses: Course[] = [];

  searchTerm = '';

  selectedCourseId?: number;

  constructor(
    private courseService: CourseService,
    private router: Router,
    private route: ActivatedRoute
  ) { }

  ngOnInit(): void {

    this.courses = this.courseService.getCourses();

    const query = this.route.snapshot.queryParamMap.get('search');

    if (query) {
      this.searchTerm = query;
    }

  }

  search(): void {

    this.router.navigate(
      ['courses'],
      {
        queryParams: {
          search: this.searchTerm
        }
      }
    );

  }

  goToCourse(id: number): void {

    this.router.navigate(
      ['courses', id]
    );

  }

  onEnroll(courseId: number): void {

    console.log(
      'Enrolling in course:',
      courseId
    );

    this.selectedCourseId = courseId;

  }

}