package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.IDisposable;
import java.util.Iterator;

class f6z extends com.aspose.slides.internal.v6g.h0<f6z> {
   static final String n5 = com.aspose.slides.ms.System.d1.n5(new String[]{
      "MMM|DD|YYYY|M/|/M|D/|D\\\\|/D|Y/|/Y|-M|M-|-D|D-|-Y|Y-|MM|M/D|D/M|", "M-D|D-M|^D$|\\[H\\]|H:MM|MM:SS|m:ss|", "Дк|ФВ|ИХ|К±|·Ц|Гл"
   });
   static final List<String> l6 = new List<>();
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("=", "<", ">", "<=", ">=", "<>");

   public f6z() {
   }

   static String n5(Object var0, String var1, boolean var2) {
      if (var0 == null) {
         return null;
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var0, Boolean.class)) {
         return com.aspose.slides.internal.v6g.k5.u3(var0, boolean.class) ? "TRUE" : "FALSE";
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var0, String.class)) {
         return (String)var0;
      }

      try {
         if (com.aspose.slides.internal.v6g.k5.l6(var0, Double.class)) {
            return n5(var1, com.aspose.slides.internal.v6g.k5.u3(var0, double.class));
         } else if (com.aspose.slides.internal.v6g.k5.l6(var0, Integer.class)) {
            return n5(var1, (double)((Integer)var0).intValue());
         } else {
            return com.aspose.slides.internal.v6g.k5.l6(var0, com.aspose.slides.ms.System.j5.class)
               ? n5(var1, com.aspose.slides.internal.v6g.k5.u3(var0, com.aspose.slides.ms.System.j5.class).m3(), var2)
               : var0.toString();
         }
      } catch (RuntimeException var4) {
         com.aspose.slides.internal.n8e.v4.n5(var4);
         return var0.toString();
      }
   }

   private static String n5(String var0) {
      int var1 = var0.length();
      com.aspose.slides.internal.l7h.a5 var2 = new com.aspose.slides.internal.l7h.a5(var1);
      int var3 = 0;

      while (var3 < var1) {
         if (var0.charAt(var3) == 'm') {
            int var4 = var3 + 1;

            while (var4 < var1 && var0.charAt(var4) == 'm') {
               var4++;
            }

            int var5 = (var3 <= 0 || !n5(var0.charAt(var3 - 1))) && (var4 >= var1 || !n5(var0.charAt(var4))) ? 77 : 109;
            var2.n5((char)var5, (int)(var4 - var3));
            var3 = var4;
         } else {
            if (var0.charAt(var3) == '_') {
               if (var3 != var1 - 1) {
                  var3++;
               }
            } else if (var0.charAt(var3) != '*') {
               if (var0.charAt(var3) == 'h') {
                  var2.n5('H');
               } else {
                  var2.n5(var0.charAt(var3));
               }
            }

            var3++;
         }
      }

      return l6.containsItem(var2.toString()) ? "" : var2.toString();
   }

   private static boolean n5(char var0) {
      return var0 == 'h' || var0 == 's' || var0 == ':';
   }

   private static String n5(String var0, com.aspose.slides.ms.System.j5 var1, boolean var2) {
      String[] var3 = com.aspose.slides.ms.System.d1.n5(var0, ';');
      return var3.length == 1 ? l6(var0, var1.m3(), var2) : l6(var3[0], var1.m3(), var2);
   }

   private static String l6(String var0, com.aspose.slides.ms.System.j5 var1, boolean var2) {
      if (var0 != null && !"".equals(var0)) {
         var0 = com.aspose.slides.ms.System.d1.n5(com.aspose.slides.ms.System.d1.u9(var0), "am/pm", "tt");
         var0 = n5(var0);
         var0 = com.aspose.slides.ms.System.d1.n5(var0, "[HH]", "HH");
         int var3 = com.aspose.slides.ms.System.d1.c8(var0, "[");
         if (var3 != -1) {
            int var4 = com.aspose.slides.ms.System.d1.c8(var0, "]");
            if (var4 == -1) {
               return var1.toString();
            }

            var0 = com.aspose.slides.ms.System.d1.n5(var0, var3, var4 - var3 + 1);
            String var5;
            if (var2) {
               var5 = var1.n5(var0, com.aspose.slides.internal.x7n.u3.w1());
            } else {
               var5 = var1.n5(var0);
               if ("MMMMM".equals(var0)) {
                  var5 = com.aspose.slides.ms.System.d1.l6(var5, 0, 1);
               }
            }

            return var5;
         } else {
            return var2 ? var1.n5(var0, com.aspose.slides.internal.x7n.u3.w1()) : var1.n5(var0);
         }
      } else {
         return var2 ? var1.n5(com.aspose.slides.internal.x7n.u3.w1()) : var1.toString();
      }
   }

   private static String n5(String var0, double var1) {
      String var3 = var0;
      if (com.aspose.slides.ms.System.d1.n5(var3) || l6.containsItem(var3)) {
         byte var4 = 9;
         String var5 = com.aspose.slides.ms.System.d2.n5(var1, com.aspose.slides.ms.System.d1.n5(new String[]{"0.", com.aspose.slides.ms.System.d1.n5('#', 339)}));
         if (var5.length() > var4) {
            double var6 = com.aspose.slides.ms.System.q1.a6(var1);
            double var8 = var1 - var6;
            if (var6 != 0.0 && com.aspose.slides.ms.System.d2.u9(var6).length() <= var4) {
               var1 = com.aspose.slides.ms.System.q1.n5((double)(var1), var4 - (com.aspose.slides.ms.System.d2.u9(var6).length() + 1));
               var5 = com.aspose.slides.ms.System.d2.u9(var1);
            }
         }

         return var5;
      } else if (com.aspose.slides.ms.System.d1.l6(var3, "General")) {
         var3 = com.aspose.slides.ms.System.d1.n5(var3, "\\", null);
         return com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.d2.u9(var1), com.aspose.slides.ms.System.d1.k5(var3, 7)});
      } else {
         return n5(var3, var1, false);
      }
   }

   private static String n5(String var0, double var1, boolean var3) {
      String[] var4 = com.aspose.slides.ms.System.d1.n5(var0, ';');
      if (var4.length == 1) {
         return l6(var0, var1, false);
      }

      if (var0.length() > 2 && var0.charAt(0) == '[') {
         String var5;
         var5 = null;
         label51:
         switch (var0.charAt(1)) {
            case '<':
               switch (var0.charAt(2)) {
                  case '=':
                     var5 = "<=";
                     break label51;
                  case '>':
                     var5 = ">";
                     break label51;
                  default:
                     var5 = "<";
                     break label51;
               }
            case '=':
               var5 = "=";
               break;
            case '>':
               if (var0.charAt(2) == '=') {
                  var5 = ">=";
               } else {
                  var5 = ">";
               }
         }

         if (var5 != null) {
            int var6 = com.aspose.slides.ms.System.d1.u3(var0, ']');
            String var7 = com.aspose.slides.ms.System.d1.l6(var0, var5.length() + 1, var6 - (var5.length() + 1));
            if (k5(var7)) {
               try {
                  double var8 = com.aspose.slides.ms.System.z3.n3(var7, com.aspose.slides.internal.x7n.l6.k5());
                  if (n5(var1, var8, var5)) {
                     return l6(var4[0], var1, false);
                  }

                  if (var4.length > 1) {
                     String[] var10 = new String[var4.length - 1];
                     System.arraycopy(var4, 1, var10, 0, var10.length);
                     return n5(com.aspose.slides.ms.System.d1.n5(";", var10), var1, false);
                  }

                  return com.aspose.slides.ms.System.d1.n5;
               } catch (RuntimeException var12) {
                  com.aspose.slides.internal.n8e.v4.n5(var12);
               }
            }
         }
      }

      if (var1 > 0.0) {
         return l6(var4[0], var1, false);
      } else if (var1 < 0.0) {
         return l6(var4[1], com.aspose.slides.ms.System.q1.n5(var1), false);
      } else {
         return var4.length < 3 ? l6(var4[0], var1, false) : l6(var4[2], var1, false);
      }
   }

   private static String l6(String var0, double var1, boolean var3) {
      if (var0 != null && !"".equals(var0)) {
         com.aspose.slides.internal.r7c.u3 var4 = com.aspose.slides.internal.r7c.c8.n5(var0, "(^\\?+$)|(^\\?+/\\?+$)");
         if (var4.u3()) {
            return var4.a6().n5(1).u3() ? com.aspose.slides.ms.System.d2.n5(var1, "0") : com.aspose.slides.ms.System.d2.n5(var1, var0);
         }

         String var5 = var0;
         var0 = com.aspose.slides.ms.System.d1.n5(var0, "_(", null);
         var0 = com.aspose.slides.ms.System.d1.n5(var0, "G/", "/");
         var0 = n5(var0, 1);
         int var6 = com.aspose.slides.ms.System.d1.c8(var0, "[");
         if (var6 == -1) {
            if (var1 == 0.0) {
               var0 = com.aspose.slides.ms.System.d1.n5(var0, "?", null);
            }

            String var34 = l6(var0);
            if (com.aspose.slides.internal.r7c.c8.k5(var34, n5, 66)) {
               com.aspose.slides.ms.System.j5 var40 = n5(var1, false).m3();
               return var40.n5(var0);
            }

            if (!"GENERAL".equals(com.aspose.slides.ms.System.d1.t2(var0)) && !"@".equals(var0)) {
               if (com.aspose.slides.ms.System.d1.c8(var0, "\"'") != -1) {
                  return com.aspose.slides.ms.System.d2.n5(var1, var0);
               }

               var6 = com.aspose.slides.ms.System.d1.c8(var0, "\"");
               if (var6 == -1) {
                  return l6(var0, var1);
               }

               com.aspose.slides.internal.l7h.a5 var39 = new com.aspose.slides.internal.l7h.a5();
               int var46 = 0;

               for (int var52 = 0; var52 < var0.length(); var52++) {
                  if (var0.charAt(var52) == '"') {
                     if (var46 < var52) {
                        var39.n5(l6(com.aspose.slides.ms.System.d1.l6(var0, var46, var52 - var46), var1));
                     }

                     var52++;

                     while (var52 < var0.length()) {
                        if (var0.charAt(var52) == '"') {
                           var46 = var52 + 1;
                           break;
                        }

                        var39.n5(var0.charAt(var52));
                        var52++;
                     }
                  }
               }

               if (var46 < var0.length()) {
                  if (var1 < 0.0) {
                     var39.l6(0, '-');
                     var39.n5(l6(com.aspose.slides.ms.System.d1.k5(var0, var46), -var1));
                  } else {
                     var39.n5(l6(com.aspose.slides.ms.System.d1.k5(var0, var46), var1));
                  }
               }

               return var39.toString();
            } else {
               return com.aspose.slides.ms.System.d2.u9(var1);
            }
         } else {
            int var11 = com.aspose.slides.ms.System.d1.c8(var0, "]");
            if (var11 == -1) {
               return com.aspose.slides.ms.System.d2.u9(var1);
            }

            if (var0.charAt(var6 + 1) != '$') {
               var0 = com.aspose.slides.ms.System.d1.l6(com.aspose.slides.ms.System.d1.n5(var0, var6, var11 - var6 + 1));
               var6 = com.aspose.slides.ms.System.d1.c8(var0, "[");
               var11 = com.aspose.slides.ms.System.d1.c8(var0, "]");
               if (var6 == -1 || var0.charAt(var6 + 1) != '$') {
                  int var33 = n5(var0, ',');
                  if (var33 > 1) {
                     var1 /= var33;
                  }

                  return com.aspose.slides.ms.System.d2.n5(var1, var0);
               } else if (var6 == 0) {
                  String var32 = com.aspose.slides.ms.System.d1.l6(var0, 2, var11 - 2);
                  int var38 = com.aspose.slides.ms.System.d1.c8(var32, "-");
                  if (var38 != -1) {
                     var32 = com.aspose.slides.ms.System.d1.l6(var32, 0, var38);
                  }

                  var0 = com.aspose.slides.ms.System.d1.k5(var0, var11 + 1);
                  if (var0.charAt(0) == '*') {
                     var0 = com.aspose.slides.ms.System.d1.l6(com.aspose.slides.ms.System.d1.k5(var0, 1));
                  }

                  if (com.aspose.slides.ms.System.d1.k5(var0, "_")) {
                     var0 = com.aspose.slides.ms.System.d1.l6(var0, 0, var0.length() - 1);
                  }

                  if (com.aspose.slides.ms.System.d1.n5("M", var0, true) == 0) {
                     int var45 = n5(var1, false).c8();
                     if (com.aspose.slides.ms.System.d1.l6(var5, "[DBNum1]")) {
                        switch (var45) {
                           case 1:
                              return "Т»";
                           case 2:
                              return "¶ю";
                           case 3:
                              return "Иэ";
                           case 4:
                              return "ЛД";
                           case 5:
                              return "Ое";
                           case 6:
                              return "Бщ";
                           case 7:
                              return "ЖЯ";
                           case 8:
                              return "°Л";
                           case 9:
                              return "ѕЕ";
                           case 10:
                              return "К®";
                           case 11:
                              return "К®Т»";
                           case 12:
                              return "К®¶ю";
                        }
                     }

                     return com.aspose.slides.ms.System.a3.l6(var45);
                  } else {
                     String var44 = com.aspose.slides.ms.System.d2.n5(var1, var0);
                     if (com.aspose.slides.ms.System.d1.k5(var44, "_)")) {
                        var44 = com.aspose.slides.ms.System.d1.l6(var44, 0, var44.length() - 2);
                     }

                     return com.aspose.slides.ms.System.d1.n5(var32, var44);
                  }
               } else if (var0.charAt(0) == '(' && var0.charAt(var0.length() - 1) == ')') {
                  String var31 = "([[]\\$\\S*-\\S*[]])([ ]*)(\\S+)\\)";
                  com.aspose.slides.internal.r7c.c8 var37 = new com.aspose.slides.internal.r7c.c8(var31, 66);
                  com.aspose.slides.internal.r7c.u3 var43 = var37.l6(var0);
                  com.aspose.slides.internal.r7c.k5 var51 = var43.a6();
                  if (var51.n5() == 1) {
                     return com.aspose.slides.ms.System.d1.n5(new String[]{
                        "(", com.aspose.slides.ms.System.d2.n5(var1, com.aspose.slides.ms.System.d1.l6(var0, 1, var0.length() - 2)), ")"
                     });
                  }

                  String var57 = "";

                  for (int var62 = 1; var62 < var51.n5(); var62++) {
                     String var65 = var51.n5(var62).k5();
                     if (com.aspose.slides.ms.System.d1.c8(var65, "$") != -1) {
                        if (var65.length() != 3 && var65.charAt(2) != '-') {
                           var57 = com.aspose.slides.ms.System.d1.l6(var57, var65.charAt(2));
                        } else {
                           var57 = com.aspose.slides.ms.System.d1.n5(var57, "$");
                        }
                     } else if ("".equals(com.aspose.slides.ms.System.d1.n5(var65, " ", null))) {
                        var57 = com.aspose.slides.ms.System.d1.n5(var57, var65);
                     } else {
                        var57 = com.aspose.slides.ms.System.d1.n5(var57, com.aspose.slides.ms.System.d2.n5(var1, var65));
                     }
                  }

                  return com.aspose.slides.ms.System.d1.n5(new String[]{"(", var57, ")"});
               } else {
                  return com.aspose.slides.ms.System.d1.n5(new String[]{
                     com.aspose.slides.ms.System.d2.n5(var1, com.aspose.slides.ms.System.d1.l6(var0, 0, var6)),
                     com.aspose.slides.ms.System.d1.l6(var0, var6 + 2, var11 - var6 - 2)
                  });
               }
            } else if (var6 == 0) {
               String var30 = com.aspose.slides.ms.System.d1.l6(var0, 2, var11 - 2);
               com.aspose.slides.ms.System.o5 var36 = new com.aspose.slides.ms.System.o5();
               int var42 = com.aspose.slides.ms.System.d1.c8(var30, "-");
               if (var42 != -1) {
                  int var48 = 0;
                  String var55 = com.aspose.slides.ms.System.d1.l6(var30, var42 + 1, var30.length() - var42 - 1);
                  int[] var60 = new int[]{0};
                  boolean var64 = com.aspose.slides.ms.System.a3.n5(var55, 515, null, var60);
                  var48 = var60[0];
                  if (var64) {
                     var36 = new com.aspose.slides.ms.System.o5<>(var48);
                  }

                  var30 = com.aspose.slides.ms.System.d1.l6(var30, 0, var42);
               }

               var0 = com.aspose.slides.ms.System.d1.k5(var0, var11 + 1);
               if ("general".equals(com.aspose.slides.ms.System.d1.u9(var0))) {
                  return com.aspose.slides.ms.System.d2.u9(var1);
               }

               var0 = n5(var0, 0);
               var0 = com.aspose.slides.ms.System.d1.n5(var0, "?", "");
               int var50 = n5(var0, ',');
               if (var50 > 1) {
                  var1 /= var50;
               }

               boolean var56 = false;
               String var61;
               if (com.aspose.slides.internal.r7c.c8.k5(var0, n5, 66)) {
                  var61 = n5(var1, false).n5(var0, n5(var36.k5()));
               } else {
                  var56 = com.aspose.slides.ms.System.q1.u9(var1) < 0;
                  var61 = com.aspose.slides.ms.System.d2.n5(com.aspose.slides.ms.System.q1.n5(var1), var0);
               }

               return com.aspose.slides.ms.System.d1.n5("{0}{1}{2}", var56 ? "-" : com.aspose.slides.ms.System.d1.n5, var30, var61);
            } else if (var0.charAt(0) == '(' && var0.charAt(var0.length() - 1) == ')') {
               String var29 = "(\\[\\$\\S*\\-\\S*\\])(\\[ \\]*)(\\S+)\\)";
               com.aspose.slides.internal.r7c.c8 var35 = new com.aspose.slides.internal.r7c.c8(var29, 66);
               com.aspose.slides.internal.r7c.u3 var41 = var35.l6(var0);
               com.aspose.slides.internal.r7c.k5 var47 = var41.a6();
               if (var47.n5() == 1) {
                  return com.aspose.slides.ms.System.d1.n5(new String[]{
                     "(", com.aspose.slides.ms.System.d2.n5(var1, com.aspose.slides.ms.System.d1.l6(var0, 1, var0.length() - 2)), ")"
                  });
               }

               String var54 = "";

               for (int var59 = 1; var59 < var47.n5(); var59++) {
                  String var63 = var47.n5(var59).k5();
                  if (var59 == 1 && var63.charAt(1) == '$') {
                     if (var63.length() > 3 && var63.charAt(3) == '-') {
                        var54 = com.aspose.slides.ms.System.d1.l6(var54, var63.charAt(2));
                     }
                  } else if ("".equals(com.aspose.slides.ms.System.d1.n5(var63, " ", null))) {
                     var54 = com.aspose.slides.ms.System.d1.n5(var54, var63);
                  } else {
                     var54 = com.aspose.slides.ms.System.d1.n5(var54, com.aspose.slides.ms.System.d2.n5(var1, var63));
                  }
               }

               return com.aspose.slides.ms.System.d1.n5(new String[]{"(", var54, ")"});
            } else {
               com.aspose.slides.internal.l7h.a5 var7 = new com.aspose.slides.internal.l7h.a5();
               int var8 = 0;
               String var9 = "\\[\\$\\S*\\-\\S*\\]";
               com.aspose.slides.internal.r7c.u9 var10 = com.aspose.slides.internal.r7c.c8.l6(var0, var9, 66);
               Iterator var12 = var10.iterator();

               try {
                  while (var12.hasNext()) {
                     com.aspose.slides.internal.r7c.u3 var13 = (com.aspose.slides.internal.r7c.u3)var12.next();
                     if (var13.u3()) {
                        var6 = var13.n5();
                        int var14 = var13.l6() + var6;
                        var7.n5(com.aspose.slides.ms.System.d1.l6(var0, var8, var6));

                        for (int var15 = var6 + 2; var15 < var14 && var0.charAt(var15) != '-'; var15++) {
                           var7.n5(var0.charAt(var15));
                        }

                        var8 = var14;
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var12, IDisposable.class)) {
                     ((IDisposable)var12).dispose();
                  }
               }

               if (var8 != 0) {
                  if (var8 < var0.length() - 1 && var0.charAt(var8) == '*') {
                     var8++;
                  }

                  int var58 = var0.length() - var8;
                  if (com.aspose.slides.ms.System.d1.k5(var0, "_-")) {
                     var58 -= 2;
                  }

                  var7.n5(com.aspose.slides.ms.System.d1.l6(var0, var8, var58));
               }

               return var7.l6() != 0
                  ? com.aspose.slides.ms.System.d2.n5(var1, var7.toString())
                  : com.aspose.slides.ms.System.d1.n5(new String[]{
                     com.aspose.slides.ms.System.d2.n5(var1, com.aspose.slides.ms.System.d1.l6(var0, 0, var6)),
                     com.aspose.slides.ms.System.d1.l6(var0, var6 + 2, var11 - var6 - 2)
                  });
            }
         }
      } else {
         return "";
      }
   }

   private static String l6(String var0) {
      int var1 = var0.length();
      com.aspose.slides.internal.l7h.a5 var2 = new com.aspose.slides.internal.l7h.a5(var1);

      for (int var3 = 0; var3 < var1; var3++) {
         switch (var0.charAt(var3)) {
            case '"':
               var3++;

               while (var3 < var1 && var0.charAt(var3) != '"') {
                  var3++;
               }
               break;
            default:
               var2.n5(var0.charAt(var3));
         }
      }

      return var2.toString();
   }

   private static int n5(String var0, char var1) {
      int var2 = var0.length();
      short var3 = 1;

      for (int var4 = var2 - 1; var4 >= 0; var4--) {
         char var5 = var0.charAt(var4);
         switch (var5) {
            case '"':
               var4--;

               while (var4 >= 0 && var0.charAt(var4) != '"') {
                  var4--;
               }
               break;
            case '#':
            case '0':
               return 1;
            default:
               if (var5 == var1) {
                  boolean var6 = false;
                  var3 = 1000;
                  var4--;

                  while (var4 >= 0) {
                     var5 = var0.charAt(var4);
                     switch (var5) {
                        case '#':
                        case '0':
                           return var3;
                     }

                     if (var5 == var1) {
                        var3 *= 1000;
                        var6 = true;
                     } else {
                        var6 = false;
                     }

                     if (!var6) {
                        var4++;
                        var3 = 1;
                        break;
                     }

                     var4--;
                  }
               }
         }
      }

      return var3;
   }

   private static String n5(String var0, int var1) {
      int var2 = var0.length();
      com.aspose.slides.internal.l7h.a5 var3 = new com.aspose.slides.internal.l7h.a5(var2);
      int var4 = 0;

      while (var4 < var2) {
         label142:
         switch (var0.charAt(var4)) {
            case '"':
               var3.n5(var0.charAt(var4));
               var4++;

               while (var4 < var2) {
                  var3.n5(var0.charAt(var4));
                  if (var0.charAt(var4) == '"') {
                     break label142;
                  }

                  var4++;
               }
               break;
            case '\'':
               var3.n5("\"'");

               while (true) {
                  if (++var4 >= var2) {
                     var3.n5('"');
                     break;
                  }

                  if (var0.charAt(var4) == '\'') {
                     var3.n5('\'');
                  } else {
                     if (var0.charAt(var4) != '\\') {
                        var3.n5('"');
                        var4--;
                        break;
                     }

                     var3.n5(var0.charAt(var4 + 1));
                     var4++;
                  }
               }
            case '*':
               break;
            case 'A':
            case 'a':
               if (var0.length() - var4 >= 3) {
                  int var7 = 1;

                  for (int var8 = var4 + 1; var8 < var0.length(); var8++) {
                     if (var0.charAt(var8) == 'a') {
                        var7++;
                     }
                  }

                  if (var7 >= 3) {
                     if (var7 == 3) {
                        var3.n5("ddd");
                     } else {
                        var3.n5("dddd");
                     }

                     var4 += var7 - 1;
                     break;
                  }
               }

               if (var0.length() > var4 + 4
                  && var0.charAt(var4 + 1) == 'M'
                  && var0.charAt(var4 + 2) == '/'
                  && var0.charAt(var4 + 3) == 'P'
                  && var0.charAt(var4 + 4) == 'M') {
                  switch (var1) {
                     case 49:
                        if (!com.aspose.slides.ms.System.d1.l6(var0, "[$-F400]")) {
                           var3.n5("tt");
                           var3.n5('H', 'h');
                        }
                        break;
                     default:
                        var3.n5("tt");
                        var3.n5('H', 'h');
                  }

                  var4 += 4;
               } else {
                  switch (var1) {
                     case 39:
                        var3.n5('y');
                        break label142;
                     default:
                        var3.n5(var0.charAt(var4));
                  }
               }
               break;
            case 'D':
            case 'd':
               var3.n5('d');
               break;
            case 'G':
            case 'g':
               switch (var1) {
                  case 39:
                     var3.n5('d');
                     break label142;
                  default:
                     var3.n5(var0.charAt(var4));
                     break label142;
               }
            case 'H':
            case 'h':
               if (var4 == 0 || var0.charAt(var4 - 1) != 'h' || var4 < var0.length() - 1 && var0.charAt(var4 + 1) == ':') {
                  var3.n5('H');
               }
               break;
            case 'J':
               if (var1 == 49) {
                  var3.n5('y');
               } else {
                  var3.n5('J');
               }
               break;
            case 'M':
            case 'm':
               int var5 = var4 + 1;

               while (var5 < var2 && var0.charAt(var5) == 'm') {
                  var5++;
               }

               int var6 = (var4 <= 0 || !n5(var0.charAt(var4 - 1))) && (var5 >= var2 || !n5(var0.charAt(var5))) ? 77 : 109;
               var3.n5((char)var6, (int)(var5 - var4));
               var4 = var5;
               continue;
            case 'T':
               if (var1 == 49) {
                  var3.n5('d');
               } else {
                  var3.n5('T');
               }
               break;
            case 'Y':
            case 'y':
               var3.n5('y');
               break;
            case '\\':
               if (var4 + 1 < var2) {
                  switch (var0.charAt(var4 + 1)) {
                     case ' ':
                     case '\'':
                     case '-':
                     case '/':
                        break;
                     default:
                        var3.n5(var0.charAt(var4));
                  }
               }
               break;
            case '_':
               if (var4 != var2 - 1) {
                  var4++;
               }
               break;
            default:
               var3.n5(var0.charAt(var4));
         }

         var4++;
      }

      String var9 = var3.toString();
      switch (var1) {
         case 49:
            if (com.aspose.slides.ms.System.d1.l6(var9, "[$-F800]")) {
               var9 = com.aspose.slides.ms.System.d1.n5(var9, "MMMM\\ dd\\,", "dd. MMMM");
            }
         default:
            return var9;
      }
   }

   private static boolean k5(String var0) {
      if (var0 != null && !"".equals(var0)) {
         var0 = com.aspose.slides.ms.System.d1.l6(var0);
         if (var0.length() == 0) {
            return false;
         }

         int var1 = 0;
         int var2 = 0;
         boolean var3 = false;
         char var4 = com.aspose.slides.internal.r5t.t2.n5().u9().e2().q0().charAt(0);
         int var5 = -1;

         for (int var6 = 0; var6 < var0.length(); var6++) {
            if (var0.charAt(var6) >= '0' && var0.charAt(var6) <= '9') {
               var3 = true;
            } else if (var0.charAt(var6) != var4 && var0.charAt(var6) != '.') {
               switch (var0.charAt(var6)) {
                  case '+':
                  case '-':
                     if (var6 != 0 || var0.length() == 1) {
                        return false;
                     }
                     break;
                  case 'E':
                     if (var0.length() == 1 || var6 == 0 || var6 > var0.length() - 3) {
                        return false;
                     }

                     if (var0.charAt(var6 + 1) != '+' && var0.charAt(var6 + 1) != '-') {
                        return false;
                     }

                     if (++var2 > 1) {
                        return false;
                     }

                     var6++;
                     break;
                  default:
                     if (var1 != 0) {
                        return false;
                     }

                     if (var0.charAt(var6) != com.aspose.slides.internal.x7n.l6.u3().e2().z3().charAt(0)) {
                        return false;
                     }

                     if (var5 != -1 && var6 - var5 <= 3) {
                        return false;
                     }

                     var5 = var6;
                     if (var6 + 3 >= var0.length()) {
                        return false;
                     }
               }
            } else if (++var1 > 1 || var0.length() == 1) {
               return false;
            }
         }

         return var3;
      } else {
         return false;
      }
   }

   private static boolean n5(double var0, double var2, String var4) {
      switch (k5.n5(var4)) {
         case 0:
            if (n5(var0, var2)) {
               return true;
            } else {
               if (com.aspose.slides.ms.System.q1.n5(var0 - var2) <= 1.0E-16) {
                  return true;
               }

               return false;
            }
         case 1:
            if (n5(var0, var2)) {
               return false;
            } else {
               if (var0 < var2) {
                  return true;
               }

               return false;
            }
         case 2:
            if (n5(var0, var2)) {
               return false;
            } else {
               if (var0 > var2) {
                  return true;
               }

               return false;
            }
         case 3:
            if (!(var0 < var2) && !(com.aspose.slides.ms.System.q1.n5(var0 - var2) <= 1.0E-16)) {
               return false;
            }

            return true;
         case 4:
            if (!(var0 > var2) && !(com.aspose.slides.ms.System.q1.n5(var0 - var2) <= 1.0E-16)) {
               return false;
            }

            return true;
         case 5:
            if (com.aspose.slides.ms.System.q1.n5(var0 - var2) <= Double.MIN_VALUE) {
               return false;
            }

            return true;
         default:
            return false;
      }
   }

   private static boolean n5(double var0, double var2) {
      double var4 = com.aspose.slides.ms.System.q1.n5(var0 - var2);
      if (var4 < Double.MIN_VALUE) {
         return true;
      } else {
         return var4 < 1.0E-4 && com.aspose.slides.ms.System.q1.n5(var0) < com.aspose.slides.internal.v6g.k5.t2(com.aspose.slides.ms.System.c4.l6, 15)
            ? com.aspose.slides.ms.System.c4.c8(com.aspose.slides.internal.v6g.k5.s7(var0, 14), com.aspose.slides.internal.v6g.k5.s7(var2, 14))
            : var0 == var2;
      }
   }

   private static com.aspose.slides.ms.System.j5 n5(double var0, boolean var2) {
      if (var0 > 2958465.99) {
         return com.aspose.slides.ms.System.j5.k5;
      }

      if (var2) {
         var0 += 1462.0;
      }

      if (var0 < 60.0) {
         var0++;
      }

      return com.aspose.slides.ms.System.j5.h0(var0);
   }

   private static String l6(String var0, double var1) {
      if (!com.aspose.slides.ms.System.d1.k5(var0, ",") && !com.aspose.slides.ms.System.d1.k5(var0, ",)")) {
         int var6 = 0;

         int var8;
         for (var8 = var0.length() - 1; var8 >= 0; var8--) {
            char var10 = var0.charAt(var8);
            if (com.aspose.slides.ms.System.t9.u3(var10) || var10 == '#' || var10 == '.') {
               break;
            }

            if (var10 == ',') {
               var6++;
            }
         }

         if (var6 > 0) {
            var1 /= com.aspose.slides.ms.System.q1.a6(1000.0, var6);
            if (var8 < 0) {
               var0 = com.aspose.slides.ms.System.d1.k5(var0, var6);
            } else {
               var0 = com.aspose.slides.ms.System.d1.n5(var0, var8 + 1, var6);
            }
         }
      } else {
         int var3 = 0;
         int var4 = var0.length() - 1;
         if (var0.charAt(var4) == ')') {
            var4--;
         }

         for (int var5 = var4; var5 >= 0 && var0.charAt(var5) == ','; var5--) {
            var3++;
         }

         var1 /= com.aspose.slides.ms.System.q1.a6(1000.0, var3);
         var0 = com.aspose.slides.ms.System.d1.n5(var0, var4 - var3 + 1, var3);
      }

      if (com.aspose.slides.ms.System.d1.c8(var0, "/?") != -1 || com.aspose.slides.ms.System.d1.c8(var0, "?/") != -1) {
         return k5(var0, var1);
      }

      if (com.aspose.slides.ms.System.d1.u3(var0, '"') != -1) {
         return com.aspose.slides.ms.System.d2.n5(var1, var0);
      }

      if (com.aspose.slides.ms.System.d1.u3(var0, 'E') == -1 && com.aspose.slides.ms.System.d1.u3(var0, 'e') == -1) {
         if (com.aspose.slides.ms.System.d1.l6(var0, "\\")) {
            var0 = com.aspose.slides.ms.System.d1.n5(var0, "\\", null);
         }

         com.aspose.slides.internal.r7c.c8 var7 = new com.aspose.slides.internal.r7c.c8("^([a-z|A-Z|(]*,)([^a-z|A-Z]+)([a-z|A-Z|)]*)$");
         com.aspose.slides.internal.r7c.u3 var9 = var7.l6(var0);
         return var9.u3()
            ? com.aspose.slides.ms.System.d1.n5(new String[]{
               var9.a6().n5(1).k5(),
               com.aspose.slides.ms.System.d2.n5(var1, com.aspose.slides.ms.System.d1.n5(var9.a6().n5(2).k5(), "?", null)),
               var9.a6().n5(3).k5()
            })
            : com.aspose.slides.ms.System.d2.n5(var1, var0);
      } else {
         return com.aspose.slides.ms.System.d2.n5(var1, var0);
      }
   }

   private static String k5(String var0, double var1) {
      int var3 = com.aspose.slides.ms.System.d1.u3(var0, ' ');
      String var4 = null;
      double var5 = com.aspose.slides.ms.System.q1.k5(var1);
      double var7 = var1 - var5;
      if (var3 != -1) {
         var4 = com.aspose.slides.ms.System.d1.l6(var0, 0, var3);
         var0 = com.aspose.slides.ms.System.d1.k5(var0, var3 + 1);
      }

      com.aspose.slides.internal.l7h.a5 var9 = new com.aspose.slides.internal.l7h.a5();
      if (var5 == var1) {
         return var4 != null ? com.aspose.slides.ms.System.d2.n5(var1, var4) : com.aspose.slides.ms.System.d2.n5(var1, "0");
      }

      if (var4 != null) {
         var9.n5(com.aspose.slides.ms.System.d2.n5(var5, var4));
         var9.n5(' ');
         var1 -= var5;
      }

      String[] var10 = com.aspose.slides.ms.System.d1.n5(var0, '/');
      if (var10.length == 1) {
         return var9.toString();
      }

      int var11 = 0;
      int var12 = 2;
      if (com.aspose.slides.ms.System.d1.u3(var10[1], '?') == -1) {
         var12 = com.aspose.slides.ms.System.a3.n5(var10[1]);
         var11 = com.aspose.slides.internal.v6g.k5.u3(var1 * var12 + 0.5, 14);
         if (var11 == var12) {
            return com.aspose.slides.ms.System.d2.n5(var5 + 1.0, var4);
         }

         if (var11 == 0) {
            return var9.toString();
         }

         var9.k5(var11);
         var9.n5("/");
         var9.n5(var10[1]);
         return var9.toString();
      } else {
         int var13 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.a6(10.0, var10[1].length()), 14);
         double var14 = 1.0;

         for (int var18 = 2; var18 < var13; var18++) {
            double var16 = var7 * var18;
            var16 -= com.aspose.slides.internal.v6g.k5.u3(var16, 14);
            if (var16 < 0.5) {
               if (var16 < var14) {
                  var14 = var16;
                  var12 = var18;
               }
            } else {
               var16 = 1.0 - var16;
               if (var16 < var14) {
                  var14 = var16;
                  var12 = var18;
               }
            }
         }

         var11 = com.aspose.slides.internal.v6g.k5.u3(var1 * var12 + 0.5, 14);
         if (var11 == 0) {
            return "0";
         }

         var9.k5(var11);
         var9.n5("/");
         var9.k5(var12);
         return var9.toString();
      }
   }

   private static com.aspose.slides.internal.x7n.l6 n5(com.aspose.slides.ms.System.o5<Integer> var0) {
      if (!var0.l6()) {
         return null;
      }

      try {
         return new com.aspose.slides.internal.x7n.l6((Integer)var0.n5());
      } catch (RuntimeException var2) {
         return null;
      }
   }

   public void n5(f6z var1) {
   }

   public f6z n5() {
      f6z var1 = new f6z();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(f6z var1) {
      return true;
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof f6z) ? false : this.l6((f6z)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public f6z Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(f6z bridgeArg0) {
      this.n5(bridgeArg0);
   }


   static {
      l6.addItem("General");
      l6.addItem("Yleinen");
      l6.addItem("Standard");
   }
}
