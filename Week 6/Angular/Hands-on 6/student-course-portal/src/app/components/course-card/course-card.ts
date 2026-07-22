import {
  Component,
  Input,
  Output,
  EventEmitter
} from '@angular/core';
import { NgClass, NgStyle, NgSwitch, NgSwitchCase, NgSwitchDefault } from '@angular/common';
import { CreditLabelPipe } from '../../pipes/credit-label-pipe';

@Component({
  selector: 'app-course-card',
  standalone: true,
  imports: [NgClass, NgStyle, NgSwitch, NgSwitchCase, NgSwitchDefault, CreditLabelPipe],
  templateUrl: './course-card.html',
  styleUrl: './course-card.css'
})
export class CourseCard {

  @Input()
  course!: {
    id: number;
    name: string;
    code: string;
    credits: number;
    gradeStatus: string;
  };

  @Output()
  enrollRequested = new EventEmitter<number>();

  isExpanded = false;
  isEnrolled = false;

  toggleDetails() {
    this.isExpanded = !this.isExpanded;
  }

  enroll() {
    this.isEnrolled = !this.isEnrolled;
    this.enrollRequested.emit(this.course?.id);
  }

  get cardClasses() {
    return {
      "card--enrolled": this.isEnrolled,
      "card--full": (this.course?.credits ?? 0) >= 4,
      "expanded": this.isExpanded
    };
  }
}