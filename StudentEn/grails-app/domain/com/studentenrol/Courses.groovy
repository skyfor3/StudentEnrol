package com.studentenrol

class Courses {
String department
String title
Leader leader
String code
Date startDate
Date endDate
String description
static hasMany=[lecturers:Lecturer,modules:Module,students:Student]

String toString(){
"$title, $code, $department"
}

    static constraints = {
department()
title()
leader()
code()
startDate()
endDate()
description maxSize:5000

    }
}
