package br.com.abc.Java.classesInterna.teste;

public class ClassesInternasTeste {
    private String nome = "Renan padawan na programação";


    class ClasseInterna {
        public void verClasseExterna() {
            System.out.println ( nome );
        }


    }

    public static void main(String[] args) {
        ClassesInternasTeste externa = new ClassesInternasTeste ();
        ClassesInternasTeste.ClasseInterna in = externa.new ClasseInterna ();
        ClassesInternasTeste.ClasseInterna in2 = new ClassesInternasTeste ().new ClasseInterna ();//segundo modo;
        in2.verClasseExterna ();
        in.verClasseExterna ();

    }
}
