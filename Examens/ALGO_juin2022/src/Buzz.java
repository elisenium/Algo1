public class Buzz {

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args){

        // creation des 2 equipes

        Equipe equipe1 = chargerEquipe1();
        Equipe equipe2 = chargerEquipe2();

        // creation du questionnaire

        Questionnaire questionnaire = chargerQuestions();

        System.out.println("Quizz - Capitales des pays de l'union europeenne");

       //TODO
        do {
            System.out.println("\nVoici les candidats en jeu de l'equipe 1 :\n" +equipe1.toString());
            System.out.println("Voici les candidats en jeu de l'equipe 2 :\n" + equipe2.toString());
            System.out.println("\nNouvelle question");
            System.out.println("Selectionnez les 2 candidats");
            String candidatSelectionneEquipe1 = equipe1.selectionnerCandidat();
            String candidatSelectionneEquipe2 = equipe2.selectionnerCandidat();
            System.out.println("Le candidat selectionne de l'equipe 1 est " + candidatSelectionneEquipe1);
            System.out.println("Le candidat selectionne de l'equipe 2 est " + candidatSelectionneEquipe2);

            if(questionnaire.getNombreQuestionsRestantes()==0){
                questionnaire.reinitialiser();
            }
            QuestionCM qcm = questionnaire.fournirQuestion();
            System.out.println("Voici la question : ");
            System.out.println(qcm);


            System.out.print("Entrez le numero de l'equipe qui a buzze (1 ou 2) : ");
            int equipBuzz = scanner.nextInt();
            System.out.print("Entrez son choix (1, 2 ou 3) : ");
            int choix = scanner.nextInt();

            if (equipBuzz==1 && choix != qcm.getNumeroChoixCorrect()){
                System.out.println("\nLa reponse n'est pas bonne");
                System.out.println("\n"+ candidatSelectionneEquipe1 + " est elimine");
                equipe2.remettreEnJeu(candidatSelectionneEquipe2);
            }

            if (equipBuzz==2 && choix != qcm.getNumeroChoixCorrect()){
                System.out.println("\nLa reponse n'est pas bonne");
                System.out.println("\n"+ candidatSelectionneEquipe2 + " est elimine");
                equipe1.remettreEnJeu(candidatSelectionneEquipe1);
            }


            if (equipBuzz==1 && choix == qcm.getNumeroChoixCorrect()){
                System.out.println("\nBravo! La reponse est bonne");
                System.out.println("\nl'equipe 1 a gagne 1 point");
                equipe1.ajouter1Point();
                equipe1.remettreEnJeu(candidatSelectionneEquipe1);
                equipe2.remettreEnJeu(candidatSelectionneEquipe2);
            }

            if (equipBuzz==2 && choix == qcm.getNumeroChoixCorrect()){
                System.out.println("\nBravo! La reponse est bonne");
                System.out.println("\nl'equipe 2 a gagne 1 point");
                equipe2.ajouter1Point();
                equipe2.remettreEnJeu(candidatSelectionneEquipe2);
                equipe1.remettreEnJeu(candidatSelectionneEquipe1);
            }

            System.out.println("\nl'equipe 1 a " + equipe1.getPoints()+ " point(s)");
            System.out.println("l'equipe 2 a "+ equipe2.getPoints()+ " point(s)");

        }while ((equipe1.getPoints()<3 && equipe2.getPoints()<3) && (equipe1.getNombreCandidatsEnJeu()>0 && equipe2.getNombreCandidatsEnJeu()>0));


        if (equipe1.getNombreCandidatsEnJeu()==0){
            System.out.println("\nLe jeu est termine");
            System.out.println("l'equipe 1 n'a plus de candidat");
        }

        if (equipe2.getNombreCandidatsEnJeu()==0){
            System.out.println("\nLe jeu est termine");
            System.out.println("l'equipe 2 n'a plus de candidat");
        }

        if (equipe1.getPoints()==3){
            System.out.println("\nLe jeu est termine");
            System.out.println("l'equipe 1 a gagne !");
        }

        if (equipe2.getPoints()==3){
            System.out.println("\nLe jeu est termine");
            System.out.println("l'equipe 2 a gagne !");
        }
    }

    public static Questionnaire chargerQuestions(){
        QuestionCM[] questions = new QuestionCM[5];
        questions[0]= new QuestionCM("Allemagne","Amsterdam","Dublin","Berlin",3);
        questions[1]= new QuestionCM("France","Paris","Prague", "Vilnius",1);
        questions[2]= new QuestionCM("Belgique","Amsterdam", "Bruxelles","Paris",2);
        questions[3]= new QuestionCM("Espagne"	,"Madrid","Budapest","Bucarest",1);
        questions[4]= new QuestionCM("Italie","Nicosie","Riga","Rome",3);
        return new Questionnaire(questions);
    }

    public static Equipe chargerEquipe1(){
        String[] candidats = new String[4];
        candidats[0] = "Lea";
        candidats[1] = "Marie";
        candidats[2] = "Chloe";
        candidats[3] = "Julie";
        return new Equipe(1,candidats);
    }

    public static Equipe chargerEquipe2(){
        String[] candidats = new String[4];
        candidats[0] = "Pierre";
        candidats[1] = "Sam";
        candidats[2] = "Tom";
        candidats[3] = "Hugo";
        return new Equipe(2,candidats);
    }

}


