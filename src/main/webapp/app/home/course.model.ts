export class Course {
    public courseName: string;
    public courseLocation: string;
    public courseContent: string;
    public teacherId: string;

    constructor(courseName: string, courseLocation: string, courseContent: string, teacherId: string) {
        this.courseName = courseName;
        this.courseLocation = courseLocation;
        this.courseContent = courseContent;
        this.teacherId = teacherId;
    }
}
