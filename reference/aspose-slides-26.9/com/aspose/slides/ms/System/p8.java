package com.aspose.slides.ms.System;

import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.Collections.IDictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.FileNotFoundException;
import com.aspose.slides.exceptions.InvalidOperationException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class p8 {
   private static int k5 = 0;
   private static Hashtable u3 = null;
   private static Hashtable a6 = new Hashtable();
   public static String n5 = com.aspose.slides.internal.t9p.k5.m3;
   public static boolean l6 = com.aspose.slides.internal.t9p.k5.s0;

   public static String n5() {
      return com.aspose.slides.internal.z0k.u3.n5();
   }

   public static String l6() {
      try {
         return InetAddress.getLocalHost().getHostName();
      } catch (UnknownHostException var1) {
         throw new Exception(var1.getMessage(), var1);
      }
   }

   public static String k5() {
      return n5;
   }

   public static w2 u3() {
      String var0 = com.aspose.slides.internal.t9p.k5.j5;
      String var1 = com.aspose.slides.internal.t9p.k5.w1;
      String var2 = com.aspose.slides.internal.t9p.k5.r4;
      if (com.aspose.slides.internal.t9p.k5.s0) {
         if (com.aspose.slides.internal.t9p.k5.j3) {
            return n5(1, 4, 0, var2);
         } else if (com.aspose.slides.internal.t9p.k5.n1) {
            return n5(1, 4, 10, var2);
         } else if (com.aspose.slides.internal.t9p.k5.d1) {
            return n5(1, 4, 90, var2);
         } else if (com.aspose.slides.internal.t9p.k5.p6) {
            return n5(3, 3, 0, var2);
         } else if (com.aspose.slides.internal.t9p.k5.s4) {
            return var1.equals("4.0") ? n5(2, 4, 0, var2) : n5(2, 3, 51, var2);
         } else if (com.aspose.slides.internal.t9p.k5.h6) {
            return n5(2, 5, 1, var2);
         } else if (com.aspose.slides.internal.t9p.k5.y8) {
            return n5(2, 6, 0, var2);
         } else if (com.aspose.slides.internal.t9p.k5.c3) {
            return n5(2, 6, 1, var2);
         } else if (com.aspose.slides.internal.t9p.k5.l4) {
            return n5(2, 6, 2, var2);
         } else if (com.aspose.slides.internal.t9p.k5.i6) {
            return n5(2, 6, 3, var2);
         } else if (com.aspose.slides.internal.t9p.k5.v8) {
            return n5(2, 5, 0, var2);
         } else if (com.aspose.slides.internal.t9p.k5.v3) {
            return n5(2, 5, 2, var2);
         } else if (com.aspose.slides.internal.t9p.k5.g7) {
            return n5(2, 6, 0, var2);
         } else if (com.aspose.slides.internal.t9p.k5.j4) {
            return n5(2, 6, 1, var2);
         } else if (com.aspose.slides.internal.t9p.k5.i9) {
            return n5(2, 6, 2, var2);
         } else {
            return com.aspose.slides.internal.t9p.k5.f5 ? n5(2, 10, 0, var2) : n5(2, l6(var1), var2);
         }
      } else if (com.aspose.slides.internal.t9p.k5.a3) {
         return n5(6, l6(var1), var2);
      } else if (com.aspose.slides.internal.t9p.k5.o5) {
         return n5(4, l6(var1), var2);
      } else if (com.aspose.slides.internal.t9p.k5.f0) {
         return n5(7, l6(var1), var2);
      } else if (com.aspose.slides.internal.t9p.k5.j8) {
         return n5(8, l6(var1), var2);
      } else {
         throw new InvalidOperationException(d1.n5("Unrecognized OS: {0}, {1}, {2}",new Object[]{ var0, var1, var2}));
      }
   }

   private static b5 l6(String var0) {
      var0 = var0.trim() + '.';
      List var1 = new List();
      String var2 = d1.n5;

      for (char var6 : var0.toCharArray()) {
         if (var6 == ' ') {
            break;
         }

         if ((var6 == '.' || var6 == '-') && !d1.n5(var2)) {
            var1.add(var2);
            var2 = d1.n5;
         } else if (var1.size() != 0 || Character.isDigit(var6)) {
            var2 = var2 + var6;
         }
      }

      int[] var8 = new int[]{0, 0, 0, 0};
      int var9 = var1.size();
      if (var9 > 4) {
         var9 = 4;
      }

      for (int var10 = 0; var10 < var9; var10++) {
         String var11 = (String)var1.get(var10);
         var8[var10] = k5(var11);
      }

      switch (var9) {
         case 1:
         case 2:
            return new b5(var8[0], var8[1]);
         case 3:
            return new b5(var8[0], var8[1], var8[2]);
         case 4:
            return new b5(var8[0], var8[1], var8[2], var8[3]);
         default:
            return new b5(0, 0);
      }
   }

   private static int k5(String var0) {
      boolean var1 = false;
      int[] var2 = new int[]{0};
      a3.n5(var0, var2);
      return var2[0];
   }

   private static w2 n5(int var0, b5 var1, String var2) {
      return new w2(var0, var1, var2);
   }

   private static w2 n5(int var0, int var1, int var2, String var3) {
      return n5(var0, new b5(var1, var2), var3);
   }

   public static int a6() {
      return 0;
   }

   public static String u9() {
      return l6();
   }

   public static String h0() {
      return com.aspose.slides.internal.t9p.k5.d5;
   }

   private static Hashtable t2() {
      if (u3 == null) {
         Process var0 = null;
         Runtime var1 = Runtime.getRuntime();
         String var2 = System.getProperty("os.name").toLowerCase();
         u3 = new Hashtable();

         try {
            if (var2.contains("windows 9")) {
               var0 = var1.exec("command.com /c set");
            } else if (!var2.contains("nt") && !var2.contains("windows")) {
               var0 = var1.exec("env");
            } else {
               var0 = var1.exec("cmd.exe /c set");
            }

            BufferedReader var3 = new BufferedReader(new InputStreamReader(var0.getInputStream()));

            String var4;
            while ((var4 = var3.readLine()) != null) {
               int var5 = var4.indexOf(61);
               if (var5 != -1) {
                  String var6 = var4.substring(0, var5);
                  String var7 = var4.substring(var5 + 1);
                  u3.set_Item(var6.toLowerCase(), var7);
               } else {
                  var5 = var4.indexOf(58);
                  if (var5 != -1) {
                     String var11 = var4.substring(0, var5);
                     String var12 = var4.substring(var5 + 1);
                     u3.set_Item(var11.toLowerCase(), var12);
                  }
               }
            }
         } catch (IOException var8) {
            throw new com.aspose.slides.exceptions.IOException(var8.getMessage(), var8);
         }
      }

      return u3;
   }

   public static IDictionary c8() {
      return t2();
   }

   public static String n5(int var0) {
      String var1 = null;
      if (l6) {
         var1 = k5(var0);
      } else {
         var1 = l6(var0);
      }

      return var1;
   }

   private static String n5(String var0, String var1, String var2, String var3) {
      String var4 = n5(var2);
      if (var4 != null && !d1.a6(var4, d1.n5)) {
         return var4;
      }

      String var5 = com.aspose.slides.internal.z0k.z1.l6(var0, "user-dirs.dirs");
      if (!com.aspose.slides.internal.z0k.u9.k5(var5)) {
         return com.aspose.slides.internal.z0k.z1.l6(var1, var3);
      }

      try {
         com.aspose.slides.internal.z0k.m3 var6 = new com.aspose.slides.internal.z0k.m3(var5);

         String var7;
         try {
            while ((var7 = var6.h0()) != null) {
               var7 = d1.l6(var7);
               int var8 = d1.u3(var7, '=');
               if (var8 > 8 && d1.a6(d1.l6(var7, 0, var8), var2)) {
                  String var9 = d1.k5(d1.k5(var7, var8 + 1),new char[]{ '"'});
                  boolean var10 = false;
                  if (d1.l6(var9, "$HOME/")) {
                     var10 = true;
                     var9 = d1.k5(var9, 6);
                  } else if (!d1.l6(var9, "/")) {
                     var10 = true;
                  }

                  return var10 ? com.aspose.slides.internal.z0k.z1.l6(var1, var9) : var9;
               }
            }
         } finally {
            if (var6 != null) {
               var6.dispose();
            }
         }
      } catch (FileNotFoundException var16) {
      }

      return com.aspose.slides.internal.z0k.z1.l6(var1, var3);
   }

   private static String l6(int var0) {
      String var1 = com.aspose.slides.internal.t9p.k5.a0;
      String var2 = com.aspose.slides.internal.z0k.z1.l6(com.aspose.slides.internal.z0k.z1.l6(var1, ".local"), "share");
      String var3 = com.aspose.slides.internal.z0k.z1.l6(var1, ".config");
      boolean var4 = com.aspose.slides.internal.t9p.k5.f0 || com.aspose.slides.internal.t9p.k5.a3;
      switch (var0) {
         case 0:
         case 16:
            return n5(var3, var1, "XDG_DESKTOP_DIR", "Desktop");
         case 1:
         case 3:
         case 4:
         case 10:
         case 12:
         case 14:
         case 15:
         case 18:
         case 19:
         case 20:
         case 22:
         case 23:
         case 24:
         case 25:
         case 27:
         case 29:
         case 30:
         case 31:
         case 36:
         case 40:
         case 41:
         case 42:
         default:
            return "";
         case 2:
         case 7:
         case 8:
         case 9:
         case 11:
         case 17:
         case 33:
         case 34:
         case 37:
         case 43:
            return d1.n5;
         case 5:
            return var1;
         case 6:
            if (var4) {
               return com.aspose.slides.internal.z0k.z1.l6(com.aspose.slides.internal.z0k.z1.l6(var1, "Library"), "Favorites");
            }

            return d1.n5;
         case 13:
            if (var4) {
               return com.aspose.slides.internal.z0k.z1.l6(var1, "Music");
            }

            return n5(var3, var1, "XDG_MUSIC_DIR", "Music");
         case 21:
            return n5(var3, var1, "XDG_TEMPLATES_DIR", "Templates");
         case 26:
            return var3;
         case 28:
            return var2;
         case 32:
            if (var4) {
               return com.aspose.slides.internal.z0k.z1.l6(com.aspose.slides.internal.z0k.z1.l6(var1, "Library"), "Caches");
            }

            return d1.n5;
         case 35:
            return "/usr/share";
         case 38:
            if (var4) {
               return "/Applications";
            }

            return d1.n5;
         case 39:
            return var4 ? com.aspose.slides.internal.z0k.z1.l6(var1, "Pictures") : n5(var3, var1, "XDG_PICTURES_DIR", "Pictures");
      }
   }

   private static String u3(String var0) {
      try {
         Process var1 = Runtime.getRuntime().exec(var0);
         var1.waitFor();
         InputStream var2 = var1.getInputStream();
         byte[] var3 = new byte[var2.available()];
         var2.read(var3);
         var2.close();
         String var4 = new String(var3);
         String[] var5 = var4.split("\\s\\s+");
         if (var5.length == 0) {
            return "";
         }

         var4 = var5[var5.length - 1];
         var5 = var4.split("\\t");
         return var5.length == 0 ? "" : var5[var5.length - 1];
      } catch (java.lang.Exception var6) {
         return var6.getMessage();
      }
   }

   private static String k5(int var0) {
      switch (var0) {
         case 0:
         case 16:
            return u3("reg query \"HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Explorer\\Shell Folders\" /v Desktop");
         case 1:
         case 3:
         case 4:
         case 10:
         case 12:
         case 14:
         case 15:
         case 18:
         case 19:
         case 20:
         case 22:
         case 23:
         case 24:
         case 25:
         case 27:
         case 29:
         case 30:
         case 31:
         case 36:
         case 40:
         case 41:
         case 42:
         default:
            return "";
         case 2:
            return u3("reg query \"HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Explorer\\Shell Folders\" /v Programs");
         case 5:
            return u3("reg query \"HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Explorer\\Shell Folders\" /v Personal");
         case 6:
            return u3("reg query \"HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Explorer\\Shell Folders\" /v Favorites");
         case 7:
            return u3("reg query \"HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Explorer\\Shell Folders\" /v Startup");
         case 8:
            return u3("reg query \"HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Explorer\\Shell Folders\" /v Recent");
         case 9:
            return u3("reg query \"HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Explorer\\Shell Folders\" /v SendTo");
         case 11:
            return u3("reg query \"HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Explorer\\Shell Folders\" /v \"Start Menu\"");
         case 13:
            return u3("reg query \"HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Explorer\\Shell Folders\" /v \"My Music\"");
         case 17:
            return "";
         case 21:
            return u3("reg query \"HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Explorer\\Shell Folders\" /v Templates");
         case 26:
         case 35:
            return u3("reg query \"HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Explorer\\Shell Folders\" /v AppData");
         case 28:
            return u3("reg query \"HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Explorer\\Shell Folders\" /v \"Local AppData\"");
         case 32:
            return u3("reg query \"HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Explorer\\Shell Folders\" /v Cache");
         case 33:
            return u3("reg query \"HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Explorer\\Shell Folders\" /v Cookies");
         case 34:
            return u3("reg query \"HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Explorer\\Shell Folders\" /v History");
         case 37:
            return n5("SystemRoot");
         case 38:
            return n5("ProgramFiles");
         case 39:
            return u3("reg query \"HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Explorer\\Shell Folders\" /v \"My Pictures\"");
         case 43:
            return n5("CommonProgramFiles");
      }
   }

   public static String n5(String var0) {
      return (String)t2().get_Item(var0.toLowerCase());
   }
}
