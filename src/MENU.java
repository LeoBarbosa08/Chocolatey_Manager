

import java.awt.Desktop;

import java.util.Scanner;

import java.io.IOException;



import java.net.URI;
public class MENU {

    public static void main(String[] args) throws IOException, InterruptedException {
        // TODO Auto-generated method stub

        Scanner leia = new Scanner(System.in);

        menus menus = new menus();
        int segundosDeLatencia = 2;
        String b;
        String opS2;
        String opS;
        String ops3;
        String ops4;
        String ops5;
        String ops6;
        String ops7;
        String ops8;
        String ops9;
        String ops10;
        String ops11;
        String ops12;
        String ops13;
        String ops14;
        String ops15;
        String ops16;
        String ops17;
        String ops18;
        String ops19;


        System.out.println("PARA EXECUTAR O PROGRAMA NECESSITAMOS INSTALAR UMA BIBLIOTECA\n"
                + "EM SEU SISTEMA OPERACIONAL,ACEITA BAIXAR A BIBLIOTECA?\n"
                + "DIGITE (SIM) OU (NÃO) :");
        b = leia.next();

        if(b.equalsIgnoreCase("sim")) {
            biblioteca();
        }else {
            System.exit(0);
        }




        do {

            limpa();

            menus.menu_principal();

            opS = leia.nextLine();

            limpa();

            switch (opS) {

                case "1" :


                    do {


                        limpa();

                        menus.menu_download();
                        opS2 = leia.nextLine();


                        if(opS2.matches("^[0-8]+$")) {




                            if(opS2.equalsIgnoreCase("1")) {


                                do {


                                    limpa();



                                    menus.menu_download_navegador();
                                    ops3 = leia.nextLine();

                                    if(ops3.matches("^[0-5]+$")) {

                                        if(ops3.equals("1")) {


                                            download("GoogleChrome 113.0.5672.127"); //ERRO
                                        }

                                        else if(ops3.equals("2")) {


                                            download("microsoft-edge 113.0.1774.50");
                                        }

                                        else if(ops3.equals("3")) {


                                            download("Firefox");
                                        }

                                        else if(ops3.equals("4")) {


                                            download("Opera");
                                        }

                                        else if(ops3.equals("5")) {
                                            download("Opera-gx");
                                        }


                                    }else{

                                        limpa();
                                        System.out.println("\nOPÇÃO INVÁLIDA!, AGUARDE ALGUNS SEGUNDO E TENTE NOVAMENTE!: ");

                                        Thread.sleep(segundosDeLatencia * 1000);

                                    }


                                    leia.nextLine(); //NECESSITA APERTA ENTER






                                }while(!ops3.equals("0"));


                            }












                            else if (opS2.equalsIgnoreCase("2")) {



                                do {



                                    limpa();



                                    menus.menu_download_compiladores();
                                    ops11 = leia.nextLine();




                                    if(ops11.matches("^[0-9]+$")) {

                                        if(ops11.equals("1")) {

                                            download("eclipse 4.27");
                                        }

                                        else if(ops11.equals("2")) {

                                            download("Pycharm 2023.1.2");
                                        }


                                        else if(ops11.equals("3")) {

                                            download("vscode 1.78.2");
                                        }

                                        else if(ops11.equals("4")) {


                                            download("apache-netbeans.portable 17.0");  //ERR0

                                        }

                                        else if(ops11.equals("5")) {

                                            download("notepadplusplus 8.5.3");

                                        }

                                        else if(ops11.equals("6")) {

                                            download("Atom 1.63.1");  //?

                                        }

                                        else if(ops11.equals("7")) {

                                            download("codeblocks 20.3.0.20210213");

                                        }
                                        else if(ops11.equals("8")) {

                                            download("sql-server-management-studio 19.0.20209.0");

                                        }

                                        else if(ops11.equals("9")) {

                                            download("unity 2022.2.19");

                                        }

                                        else if(ops11.equals("10")) {

                                            download("epicgameslauncher 1.3.51.0");

                                        }

                                    }else {

                                        limpa();
                                        System.out.println("\nOPÇÃO INVÁLIDA!, AGUARDE ALGUNS SEGUNDO E TENTE NOVAMENTE!: ");

                                        Thread.sleep(segundosDeLatencia * 1000);
                                    }





                                }while(!ops11.equals("0"));


                            }











                            else if (opS2.equalsIgnoreCase("3")) {

                                do {


                                    limpa();


                                    menus.menu_download_edicao();
                                    ops4 = leia.nextLine();
                                    if(ops4.matches("^[0-8]+$")) {

                                        if(ops4.equals("1")) {

                                            download("gimp 2.10.34");
                                        }

                                        else if(ops4.equals("2")) {

                                            download("paint.net 5.0.3");
                                        }



                                        else if(ops4.equals("3")) {

                                            download("InkScape 1.2.2.20230220");
                                        }

                                        else if(ops4.equals("4")) {

                                            download("blender 3.5.1");

                                        }
                                        else if(ops4.equals("5")) {

                                            download("krita 5.1.5");

                                        }


                                        else if(ops4.equals("6")) {

                                            download("obs-studio 29.1.1c");
                                        }

                                        else if(ops4.equals("7")) {

                                            download("audacity 3.3.2ch");
                                        }

                                        else if(ops4.equals("8")) {

                                            download("lmms 1.2.2.20210505");
                                        }

                                        else if(ops4.equals("9")) {

                                            download("reaper 6.79");
                                        }
                                    }else {
                                        limpa();
                                        System.out.println("\nOPÇÃO INVÁLIDA!, AGUARDE ALGUNS SEGUNDO E TENTE NOVAMENTE!: ");

                                        Thread.sleep(segundosDeLatencia * 1000);

                                    }





                                }while(!ops4.equals("0"));
                            }










                            else if (opS2.equalsIgnoreCase("4")) {

                                do {

                                    limpa();


                                    menus.menu_download_antivirus();
                                    ops5 = leia.nextLine();



                                    if(ops5.matches("^[0-7]+$")) {



                                        if(ops5.equals("1")) {

                                            download("avastfreeantivirus 23.4.8118.0");

                                        }



                                        else if(ops5.equals("2")) {

                                            download("avirafreeantivirus 14.0.6.552");

                                        }

                                        else if(ops5.equals("3")) {

                                            download("malwarebytes 4.5.28.336");

                                        }


                                        else if(ops5.equals("4")) {

                                            download("stinger 12.2.0.172"); //ERRO

                                        }

                                        else if(ops5.equals("5")) {

                                            download("bitdefenderavfree 1.0.20.1083"); //ERRO

                                        }

                                        else if(ops5.equals("6")) {

                                            download("ccleaner 6.11.10455");

                                        }
                                    }
                                    else {
                                        limpa();
                                        System.out.println("\nOPÇÃO INVÁLIDA!, AGUARDE ALGUNS SEGUNDO E TENTE NOVAMENTE!: ");

                                        Thread.sleep(segundosDeLatencia * 1000);

                                    }





                                }while(!ops5.equals("0"));

                            }






                            else if (opS2.equalsIgnoreCase("5")) {

                                do {

                                    limpa();


                                    menus.menu_download_video_conferencia();
                                    ops6 = leia.nextLine();


                                    if(ops6.matches("^[0-7]+$")) {

                                        if(ops6.equals("1")) {

                                            download("unofficial-google-meet 1.2.0.20220726");

                                        }


                                        else if(ops6.equals("2")) {

                                            download("skype 8.97.0.404");

                                        }


                                        else if(ops6.equals("3")) {

                                            download("discord 1.0.9005");

                                        }


                                        else if(ops6.equals("4")) {

                                            download("zoom 5.14.8.16213");

                                        }

                                        else if(ops6.equals("5")) {

                                            download("slack 4.31.152");

                                        }


                                        else if(ops6.equals("6")) {

                                            download("microsoft-teams 1.6.00.11166");

                                        }

                                        else if(ops6.equals("7")) {

                                            download("BlueJeansApp 2.23.193");

                                        }
                                    }else {
                                        limpa();
                                        System.out.println("\nOPÇÃO INVÁLIDA!, AGUARDE ALGUNS SEGUNDO E TENTE NOVAMENTE!: ");

                                        Thread.sleep(segundosDeLatencia * 1000);

                                    }






                                }while(!ops6.equals("0"));

                            }












                            else if (opS2.equalsIgnoreCase("6")) {

                                do {

                                    limpa();

                                    menus.menu_download_armazenamento();
                                    ops7 = leia.nextLine();


                                    if(ops7.matches("^[0-6]+$")) {

                                        if(ops7.equals("1")) {

                                            download("googledrive 74.0.3.0");

                                        }


                                        else if(ops7.equals("2")) {

                                            download("dropbox 173.4.6706");

                                        }

                                        else if(ops7.equals("3")) {

                                            download("iCloud 7.21.0.23");

                                        }

                                        else if(ops7.equals("4")) {

                                            download("onedrive 23.086.0423.0001");

                                        }


                                        else if(ops7.equals("5")) {

                                            download("box-drive 2.30.87");

                                        }
                                    }else {
                                        limpa();
                                        System.out.println("\nOPÇÃO INVÁLIDA!, AGUARDE ALGUNS SEGUNDO E TENTE NOVAMENTE!: ");

                                        Thread.sleep(segundosDeLatencia * 1000);

                                    }







                                }while(!ops7.equals("0"));
                            }











                            else if (opS2.equalsIgnoreCase("7")) {
                                do {
                                    limpa();
                                    menus.menu_download_reprodutor();

                                    ops8 = leia.nextLine();
                                    if(ops8.matches("^[0-5]+$")) {

                                        if(ops8.equals("1")) {

                                            download("foobar2000 2.0"); //ERRO

                                        }



                                        else if(ops8.equals("2")) {

                                            download("vlc 3.0.18");

                                        }


                                        else if(ops8.equals("3")) {

                                            download("iTunes 12.12.8.2");

                                        }


                                        else if(ops8.equals("4")) {

                                            download("Quicktime 7.7.9.20161124");

                                        }



                                        else if(ops8.equals("5")) {

                                            download("kodi 20.1");


                                        }

                                    }else {
                                        limpa();
                                        System.out.println("\nOPÇÃO INVÁLIDA!, AGUARDE ALGUNS SEGUNDO E TENTE NOVAMENTE!: ");

                                        Thread.sleep(segundosDeLatencia * 1000);

                                    }









                                }while(!ops8.equals("0"));

                            }











                            else if (opS2.equalsIgnoreCase("8")) {
                                do{
                                    limpa();

                                    menus.menu_download_outros();
                                    ops9 = leia.nextLine();
                                    if (ops9.matches("^(0|[1-9]|1[0-4])$")) {

                                        if(ops9.equals("1")) {

                                            download("GitHub 3.2.0.20181119");

                                        }


                                        else if(ops9.equals("2")) {

                                            download("steam 2.10.91.91221129chco");

                                        }

                                        else if(ops9.equals("3")) {

                                            download("telegram 4.8.1");

                                        }

                                        else if(ops9.equals("4")) {

                                            download("Spark 3.0.2");

                                        }

                                        else if(ops9.equals("5")) {

                                            download("libreoffice 5.4.4.20180111");

                                        }

                                        else if(ops9.equals("6")) {

                                            download("winrar 6.21");

                                        }

                                        else if(ops9.equals("7")) {

                                            download("TeraCopy 3.9.7");

                                        }

                                        else if(ops9.equals("8")) {

                                            download("adobereader 2023.001.20143");

                                        }

                                        else if(ops9.equals("9")) {

                                            download("googleearth 7.1.8.30360001");

                                        }



                                        else if(ops9.equals("10")) {

                                            download("teamviewer 15.41.10");

                                        }

                                        else if(ops9.equals("11")) {

                                            download("putty 0.78");

                                        }

                                        else if(ops9.equals("12")) {

                                            download("WhatsApp 2.2319.9"); //OUTDATED


                                        }

                                        else if(ops9.equals("13")) {

                                            download("qbittorrent 4.5.2");


                                        }

                                        else if(ops9.equals("14")) {

                                            download("stremio 4.4.159");


                                        }




                                    } else {
                                        limpa();
                                        System.out.println("\nOPÇÃO INVÁLIDA!, AGUARDE ALGUNS SEGUNDO E TENTE NOVAMENTE!: ");

                                        Thread.sleep(segundosDeLatencia * 1000);						}



                                }while(!ops9.equals("0"));





                            }



                        }   else {
                            limpa();
                            System.out.println("\nOPÇÃO INVÁLIDA!, AGUARDE ALGUNS SEGUNDO E TENTE NOVAMENTE!: ");

                            Thread.sleep(segundosDeLatencia * 1000);


                        }















                    }while(!opS2.equals("0"));
                    break;


                case "2":

                    do {
                        limpa();

                        menus.menu_video_aula();
                        ops10 = leia.nextLine();




                        if(ops10.equals("1")) {

                            try {
                                Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=aW5KRCGSkfw"));
                            } catch (Exception e) {
                                e.printStackTrace();


                            }

                            System.out.println("!!VIDEO ABERTO NA INTERNET!!");

                        }


                        else if(ops10.equals("2")) {

                            try {
                                Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=qpI1gMpIaiI"));
                            } catch (Exception e) {
                                e.printStackTrace();


                            }
                            System.out.println("!!VIDEO ABERTO NA INTERNET!!");
                        }

                        else if (ops10.equals("3")) {
                            try {
                                Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=xeOJwUyZeMU"));
                            } catch (Exception e) {
                                e.printStackTrace();


                            }
                            System.out.println("!!VIDEO ABERTO NA INTERNET!!");
                        }
                        else if (ops10.equals("4")) {
                            try {
                                Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=4IK1b5CNA40"));
                            } catch (Exception e) {
                                e.printStackTrace();


                            }
                            System.out.println("!!VIDEO ABERTO NA INTERNET!!");
                        }
                        else if (ops10.equals("5")) {
                            try {
                                Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=H4jM7J6C3JI"));
                            } catch (Exception e) {
                                e.printStackTrace();


                            }
                            System.out.println("!!VIDEO ABERTO NA INTERNET!!");
                        }
                        else if (ops10.equals("6")) {
                            try {
                                Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=FdofxE52DCk"));
                            } catch (Exception e) {
                                e.printStackTrace();


                            }
                            System.out.println("!!VIDEO ABERTO NA INTERNET!!");
                        }


                        if(ops10.matches("^[0]+$")) {

                            continue;
                        }else {
                            System.out.println("\nOPÇÃO INVÁLIDA!, DIGITE NOVAMENTE: ");

                        }


                    }while(!ops10.equals("0"));

                    break;


                case "3":

                    do {

                        limpa();

                        menus.menu_atalho();
                        ops12 = leia.nextLine();




                        if(ops12.matches("^[0-6]+$")) {

                            if(ops12.equals("1")) {
                                do {
                                    limpa();




                                    menus.menu_atalho_windows();
                                    ops13  = leia.nextLine();
                                    if(!ops13.equals("0")) {
                                        limpa();
                                        System.out.println("\nOPÇÃO INVÁLIDA!, AGUARDE ALGUNS SEGUNDO E TENTE NOVAMENTE!: ");

                                        Thread.sleep(segundosDeLatencia * 1000);
                                    }

                                }while(!ops13.equals("0"));
                            }

                            else if(ops12.equals("2")) {


                                do {
                                    limpa();

                                    menus.menu_atalho_linux();
                                    ops14 = leia.nextLine();



                                    if(!ops14.equals("0")) {
                                        System.out.println("\nOPÇÃO INVÁLIDA!, DIGITE (O) PARA VOLTAR!");
                                    }




                                }while(!ops14.equals("0"));

                            }

                            else if (ops12.equals("3")) {

                                do {

                                    limpa();

                                    menus.menu_atalho_navegador();
                                    ops15 = leia.nextLine();


                                    if(!ops15.equals("0")) {
                                        limpa();
                                        System.out.println("\nOPÇÃO INVÁLIDA!, AGUARDE ALGUNS SEGUNDO E TENTE NOVAMENTE!: ");

                                        Thread.sleep(segundosDeLatencia * 1000);
                                    }

                                }while(!ops15.equals("0"));




                            }

                            else if (ops12.equals("4")) {

                                do {
                                    limpa();
                                    menus.menu_atalho_pacote_office();
                                    ops16 = leia.nextLine();

                                    if(!ops16.equals("0")) {
                                        limpa();
                                        System.out.println("\nOPÇÃO INVÁLIDA!, AGUARDE ALGUNS SEGUNDO E TENTE NOVAMENTE!: ");

                                        Thread.sleep(segundosDeLatencia * 1000);
                                    }

                                }while(!ops16.equals("0"));

                            }


                            else if (ops12.equals("5")) {

                                do {

                                    limpa();
                                    menus.menu_atalho_adobe();
                                    ops17 = leia.nextLine();

                                    if(!ops17.equals("0")) {
                                        limpa();
                                        System.out.println("\nOPÇÃO INVÁLIDA!, AGUARDE ALGUNS SEGUNDO E TENTE NOVAMENTE!: ");

                                        Thread.sleep(segundosDeLatencia * 1000);
                                    }


                                }while(!ops17.equals("0"));
                            }

                            else if (ops12.equals("6")) {
                                do {

                                    limpa();

                                    menus.menu_atalho_IDE();
                                    ops18 = leia.nextLine();

                                    if(!ops18.equals("0")) {
                                        System.out.println("ENTRADA INVÁLIDA, (0) PARA VOLTAR!");
                                    }


                                }while(!ops18.equals("0"));


                            }

                        }else {
                            limpa();
                            System.out.println("\nOPÇÃO INVÁLIDA!, AGUARDE ALGUNS SEGUNDO E TENTE NOVAMENTE!: ");

                            Thread.sleep(segundosDeLatencia * 1000);

                        }








                    }while(!ops12.equals("0"));
                    break;

                case "4":

                    do {
                        limpa();
                        menus.menu_utilitarios();
                        ops19 = leia.nextLine();


                        if(ops19.equals("1")) {

                            download("driverbooster 10.4.0.128");


                        } else if(ops19.equals("2")) {

                            download("driverbooster 10.4.0.128");
                        }






                    }while(!ops19.equals("0"));

            }




        }while(!opS.equals("0"));






        System.out.println("\nPROGRAMA FINALIZADO!");






        leia.close();





    }


    public static void download(String nome) {
        try {

            //-WindowStyle Hidden

            // Comando para abrir o PowerShell como administrador
            String comando = "powershell.exe  -Command \"Start-Process powershell.exe -Verb RunAs -ArgumentList '-Command', 'choco install -y " + nome + " --force ; pause'\"";

            // Criação do processo para abrir o PowerShell como administrador
            ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", comando);

            // Executa o processo
            Process processo = builder.start();

            // Espera o processo terminar
            int resultado = processo.waitFor();

            // Verifica o resultado do processo
            if (resultado == 0) {
                System.out.println("DOWNLOAD EM ANDAMENTO...., AGUARDE!");
            } else {
                System.out.println("DOWNLOAD RECUSADO!");
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void biblioteca() {
        try {



            // Comando para abrir o PowerShell como administrad
            String comando = "powershell.exe  -Command \"Start-Process powershell -Verb RunAs -ArgumentList '-Command', '//Set-ExecutionPolicy Bypass -Scope Process -Force; iex ((New-Object System.Net.WebClient).DownloadString(''https://chocolatey.org/install.ps1''))'";


            // Criação do processo para abrir o PowerShell como administrador
            ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", comando);

            // Executa o processo
            Process processo = builder.start();

            // Espera o processo terminar
            int resultado = processo.waitFor();

            // Verifica o resultado do processo
            if (resultado == 0) {
                System.out.println("DOWNLOAD EM ANDAMENTO...., AGUARDE!");
            } else {
                System.out.println("DOWNLOAD RECUSADO!");
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void limpa() throws InterruptedException, IOException {
        new ProcessBuilder ("cmd", "/c",  "cls" ).inheritIO().start().waitFor();

    }




}



