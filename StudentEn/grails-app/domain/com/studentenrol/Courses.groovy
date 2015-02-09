package com.studentenrol

class Courses {
String department
String title
Leader leader
String code
Date startDate
Date endDate
String description

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
