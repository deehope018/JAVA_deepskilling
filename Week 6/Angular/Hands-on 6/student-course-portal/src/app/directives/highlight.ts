import { Directive, ElementRef, HostListener, Input } from '@angular/core';

@Directive({
  selector: '[appHighlight]',
  standalone: true
})
export class Highlight {

  @Input()

  appHighlight = "yellow";

  constructor(private element: ElementRef) { }

  @HostListener("mouseenter")

  mouseEnter() {

    this.element.nativeElement.style.backgroundColor = this.appHighlight;

  }

  @HostListener("mouseleave")

  mouseLeave() {

    this.element.nativeElement.style.backgroundColor = "";

  }

}