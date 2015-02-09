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


   
}
    def destroy = {
    }
}
