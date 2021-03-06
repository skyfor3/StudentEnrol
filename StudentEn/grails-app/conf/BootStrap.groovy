import com.studentenrol.*

class BootStrap {

    def init = { servletContext ->
      

      def leader1= new Leader(fullName:'Dr Ibolit Holmes',
                             post:'Senior Lecturer',
                             subject:'Animation',
                             email:'ibolit@theUni.ac.uk',
                             office:'Room 234',
                             bio:'''Lorem ipsum dolor sit amet''').save()

      def leader2= new Leader(fullName:'Dr Anna Roberts',
                             post:'Senior Lecturer',
                             subject:'Databases',
                             email:'a.d.roberts@theUni.ac.uk',
                             office:'Room 1234',
                             bio:'''Lorem ipsum dolor sit amet''').save()

      def course1=new Courses(title:'Interactive Media with Animation',
                              department:'Computing',
                              description:'''Lorem ipsum dolor sit amet, ad sea solum brute sensibus, te summo senserit vix, mel reque corpora vulputate ei.''',
                              leader:Leader.findByFullName('Dr Anna Roberts'),
                              code:'IMA101',
                              startDate: new Date('19/01/2015'),
                              endDate: new Date('19/01/2020')).save()


      def course2=new Courses(title:'Web Systems Design',
                              department:'Computing',
                              description:'''Lorem ipsum dolor sit amet, ad sea solum brute sensibus, te summo senserit vix, mel reque corpora vulputate ei.''',
                              leader:Leader.findByFullName('Dr Ibolit Holmes'),
                              code:'WEB1',
                              startDate: new Date('01/09/2015'),
                              endDate: new Date('02/09/2040')).save()

      def lect1=new Lecturer (name:'Dr Steve Crossbar',
                              post:'Lecturer',
                              email:'s.h.crossbar@theUni.ac.uk',
                              department:'Computing',
                              subject:'Web Desin',
                              research:'Knowledge Management').save()

      def module1=new Module (title: 'Web Architectures',
                             code:'WA234',
                             credits:5,
                             lecturer:Lecturer.findByName('Dr Steve Crossbar'),
                             description:'''Ldafert ergdsf gfdg sdg''').save()

      def module2=new Module (title: 'Programming',
                             code:'WA2w24234234',
                             credits:10,
                             lecturer:Lecturer.findByName('Dr Steve Crossbar'),
                             description:'''PROGRAMMMMMMMMMMMMMING''').save()

    def student1=new Student (name: 'John Smith',
                             studentid:1,
                             dob:'10.01.2000',
                             email:'mail@box.com',
                             username:'st1',
                             password:'pwd1').save()
                             

course1.addToModules(module1)
course1.addToModules(module2)                             
course1.addToLecturers(lect1)
course2.addToLecturers(lect1)
course1.addToStudents(student1)

   
}
    def destroy = {
    }
}
