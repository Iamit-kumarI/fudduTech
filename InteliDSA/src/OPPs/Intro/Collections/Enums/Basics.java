package OPPs.Intro.Collections.Enums;

public class Basics {
    enum Week{
        mon,tue,wed,thu,fri,sat,sun;
        //these are enums constants
        //everyone is public,static,final
        //final it means we can't create child enums
        //type is week


        Week() {
            System.out.println("Constructor called for "+this);
        }
    }

    public static void main(String[] args) {
         Week week;
         week=Week.mon;

//         for(Week day:Week.values()){
//             System.out.println(day);
//         }

        System.out.println(week.ordinal());
    }
}
