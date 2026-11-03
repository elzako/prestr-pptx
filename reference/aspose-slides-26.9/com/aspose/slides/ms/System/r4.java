package com.aspose.slides.ms.System;

import com.aspose.slides.exceptions.FormatException;
import java.util.TimeZone;

public class r4 {
   public static int n5(String var0, int var1, char var2) {
      int var3 = var0.length();
      int var4 = var1 + 1;

      while (var4 < var3 && var0.charAt(var4) == var2) {
         var4++;
      }

      return var4 - var1;
   }

   public static void n5(StringBuilder var0, int var1, int var2) {
      char[] var3 = new char[16];
      int var4 = 16;

      do {
         var3[--var4] = (char)(48 + var1 % 10);
         var1 /= 10;
         var2--;
      } while (var1 > 0);

      while (var2-- > 0) {
         var3[--var4] = '0';
      }

      var0.append(new String(var3, var4, 16 - var4));
   }

   public static int n5(String var0, int var1, StringBuilder var2) {
      int var3 = var0.length();
      int var4 = var1;
      char var5 = var0.charAt(var1++);

      while (var1 < var3) {
         char var6 = var0.charAt(var1++);
         if (var6 == var5) {
            return var1 - var4;
         }

         if (var6 == '\\') {
            if (var1 >= var3) {
               throw new FormatException("Un-ended quote");
            }

            var2.append(var0.charAt(var1++));
         } else {
            var2.append(var6);
         }
      }

      throw new FormatException("Un-ended quote");
   }

   public static String n5(char var0, com.aspose.slides.internal.x7n.u3 var1, boolean[] var2, boolean[] var3) {
      return n5(var0, var1, var2, var3, false);
   }

   public static String n5(char var0, com.aspose.slides.internal.x7n.u3 var1, boolean[] var2, boolean[] var3, boolean var4) {
      var2[0] = false;
      var3[0] = false;
      String var5;
      switch (var0) {
         case 'D':
            var5 = var1.t4();
            break;
         case 'E':
         case 'H':
         case 'I':
         case 'J':
         case 'K':
         case 'L':
         case 'N':
         case 'P':
         case 'Q':
         case 'S':
         case 'V':
         case 'W':
         case 'X':
         case 'Z':
         case '[':
         case '\\':
         case ']':
         case '^':
         case '_':
         case '`':
         case 'a':
         case 'b':
         case 'c':
         case 'e':
         case 'h':
         case 'i':
         case 'j':
         case 'k':
         case 'l':
         case 'n':
         case 'p':
         case 'q':
         case 'v':
         case 'w':
         case 'x':
         default:
            var5 = null;
            break;
         case 'F':
            var5 = var1.z8();
            break;
         case 'G':
            var5 = d1.n5(new String[]{var1.q0(), " ", var1.m1()});
            break;
         case 'M':
         case 'm':
            var5 = var1.k7();
            break;
         case 'O':
         case 'o':
            var5 = var1.a0();
            var3[0] = true;
            break;
         case 'R':
         case 'r':
            var5 = var1.y1();
            if (var4) {
               var2[0] = true;
            }

            var3[0] = true;
            break;
         case 'T':
            var5 = var1.m1();
            break;
         case 'U':
            if (var4) {
               var5 = null;
            } else {
               var5 = var1.z8();
               var2[0] = true;
            }
            break;
         case 'Y':
         case 'y':
            var5 = var1.m3();
            break;
         case 'd':
            var5 = var1.q0();
            break;
         case 'f':
            var5 = d1.n5(new String[]{var1.t4(), " ", var1.z3()});
            break;
         case 'g':
            var5 = d1.n5(new String[]{var1.q0(), " ", var1.z3()});
            break;
         case 's':
            var5 = var1.d2();
            var3[0] = true;
            break;
         case 't':
            var5 = var1.z3();
            break;
         case 'u':
            var5 = var1.d5();
            if (var4) {
               var2[0] = true;
            }

            var3[0] = true;
      }

      return var5;
   }

   public static String l6(char var0, com.aspose.slides.internal.x7n.u3 var1, boolean[] var2, boolean[] var3, boolean var4) {
      var2[0] = false;
      var3[0] = false;
      String var5;
      switch (var0) {
         case 'D':
            var5 = var1.t4();
            break;
         case 'E':
         case 'H':
         case 'I':
         case 'J':
         case 'K':
         case 'L':
         case 'N':
         case 'P':
         case 'Q':
         case 'S':
         case 'V':
         case 'W':
         case 'X':
         case 'Z':
         case '[':
         case '\\':
         case ']':
         case '^':
         case '_':
         case '`':
         case 'a':
         case 'b':
         case 'c':
         case 'e':
         case 'h':
         case 'i':
         case 'j':
         case 'k':
         case 'l':
         case 'n':
         case 'p':
         case 'q':
         case 'v':
         case 'w':
         case 'x':
         default:
            var5 = null;
            break;
         case 'F':
            var5 = d1.n5(new String[]{var1.t4(), " ", var1.m1()});
            break;
         case 'G':
            var5 = d1.n5(new String[]{var1.q0(), " ", var1.m1()});
            break;
         case 'M':
         case 'm':
            var5 = var1.k7();
            break;
         case 'O':
         case 'o':
            var5 = var1.a0();
            var3[0] = true;
            break;
         case 'R':
         case 'r':
            var5 = var1.y1();
            if (var4) {
               var2[0] = true;
            }

            var3[0] = true;
            break;
         case 'T':
            var5 = var1.m1();
            break;
         case 'U':
            if (var4) {
               var5 = null;
            } else {
               var5 = d1.n5(new String[]{var1.t4(), " ", var1.m1()});
               var2[0] = true;
            }
            break;
         case 'Y':
         case 'y':
            var5 = var1.m3();
            break;
         case 'd':
            var5 = var1.q0();
            break;
         case 'f':
            var5 = d1.n5(new String[]{var1.t4(), " ", var1.z3()});
            break;
         case 'g':
            var5 = d1.n5(new String[]{var1.q0(), " ", var1.z3()});
            break;
         case 's':
            var5 = var1.d2();
            var3[0] = true;
            break;
         case 't':
            var5 = var1.z3();
            break;
         case 'u':
            var5 = var1.d5();
            if (var4) {
               var2[0] = true;
            }

            var3[0] = true;
      }

      return var5;
   }

   public static String n5(j5 var0, String var1, com.aspose.slides.internal.x7n.u3 var2, boolean var3) {
      return n5(var0.m3(), null, var1, var2, var3);
   }

   public static String n5(j5 var0, s4 var1, String var2, com.aspose.slides.internal.x7n.u3 var3, boolean var4) {
      StringBuilder var5 = new StringBuilder(var2.length() + 10);
      int var6 = 0;

      while (var6 < var2.length()) {
         boolean var7 = false;
         char var8 = var2.charAt(var6);
         int var9;
         switch (var8) {
            case '"':
            case '\'':
               var9 = n5(var2, var6, var5);
               break;
            case '#':
            case '$':
            case '&':
            case '(':
            case ')':
            case '*':
            case '+':
            case ',':
            case '-':
            case '.':
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
            case ';':
            case '<':
            case '=':
            case '>':
            case '?':
            case '@':
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'G':
            case 'I':
            case 'J':
            case 'L':
            case 'N':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
            case 'T':
            case 'U':
            case 'V':
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
            case '[':
            case ']':
            case '^':
            case '_':
            case '`':
            case 'b':
            case 'c':
            case 'e':
            case 'i':
            case 'j':
            case 'k':
            case 'l':
            case 'n':
            case 'o':
            case 'p':
            case 'q':
            case 'r':
            case 'u':
            case 'v':
            case 'w':
            case 'x':
            default:
               var5.append(var8);
               var9 = 1;
               break;
            case '%':
               if (var6 >= var2.length() - 1) {
                  throw new FormatException("% at end of date time string");
               }

               if (var2.charAt(var6 + 1) == '%') {
                  throw new FormatException("%% in date string");
               }

               var9 = 1;
               break;
            case '/':
               var5.append(var4 ? var8 : var3.t9());
               var9 = 1;
               break;
            case ':':
               var5.append(var4 ? var8 : var3.z1());
               var9 = 1;
               break;
            case 'E':
               var9 = n5(var2, var6, var8);
               if (var9 == 4) {
                  var5.append(var3.u9(var3.c4().l6(var0.m3())));
               }
               break;
            case 'F':
            case 'f':
               if (var8 == 'F') {
                  var7 = true;
               }

               var9 = n5(var2, var6, var8);
               if (var9 > 7) {
                  throw new FormatException("Invalid Format String");
               }

               int var11 = (int)(var0.n3() % 10000000L / (long)Math.pow(10.0, 7 - var9));
               int var12 = var5.length();
               n5(var5, var11, var9);
               if (!var7) {
                  break;
               }

               while (var5.length() > var12 && var5.charAt(var5.length() - 1) == '0') {
                  var5.setLength(var5.length() - 1);
               }

               if (var11 == 0 && var12 > 0 && var5.charAt(var12 - 1) == '.') {
                  var5.setLength(var5.length() - 1);
               }
               break;
            case 'H':
               var9 = n5(var2, var6, var8);
               n5(var5, var0.u3(), var9 == 1 ? 1 : 2);
               break;
            case 'K':
               var9 = 1;
               if (var1 == null && var0.a6() != 2L) {
                  if (var0.a6() == 1L) {
                     var5.append('Z');
                  }
                  break;
               }

               s4 var17 = var1 != null ? var1 : h6.n5(TimeZone.getDefault(), var0.m3()).n3();
               if (var17.a6() >= 0L) {
                  var5.append('+');
               } else {
                  var5.append('-');
               }

               var5.append(a3.n5(Math.abs(var17.l6()), "D2"));
               var5.append(':');
               var5.append(a3.n5(Math.abs(var17.k5()), "D2"));
               break;
            case 'M':
               var9 = n5(var2, var6, var8);
               int var15 = var3.c4().a6(var0.m3());
               if (var9 <= 2) {
                  n5(var5, var15, var9);
               } else if (var9 == 3) {
                  var5.append(var3.n5(var15));
               } else {
                  if (n5(var2) && var3.x8() != null && var3.x8().length > 0) {
                     var5.append(var3.x8()[var15 - 1]);
                     break;
                  }

                  var5.append(var3.k5(var15));
               }
               break;
            case '\\':
               if (var6 >= var2.length() - 1) {
                  throw new FormatException("\\ at end of date time string");
               }

               var5.append(var2.charAt(var6 + 1));
               var9 = 2;
               break;
            case 'a':
               var9 = n5(var2, var6, var8);
               String var16 = var0.u3() < 12 ? var3.y4() : var3.e2();
               var5.append(var16);
               break;
            case 'd':
               var9 = n5(var2, var6, var8);
               if (var9 <= 2) {
                  n5(var5, var3.c4().n5(var0.m3()), var9 == 1 ? 1 : 2);
               } else if (var9 == 3) {
                  var5.append(var3.h0(var3.c4().l6(var0.m3())));
               } else {
                  var5.append(var3.u9(var3.c4().l6(var0.m3())));
               }
               break;
            case 'g':
               var9 = n5(var2, var6, var8);
               var5.append(var3.l6(var3.c4().u3(var0.m3())));
               break;
            case 'h':
               var9 = n5(var2, var6, var8);
               int var10 = var0.u3() % 12;
               if (var10 == 0) {
                  var10 = 12;
               }

               n5(var5, var10, var9 == 1 ? 1 : 2);
               break;
            case 'm':
               var9 = n5(var2, var6, var8);
               n5(var5, var0.h0(), var9 == 1 ? 1 : 2);
               break;
            case 's':
               var9 = n5(var2, var6, var8);
               n5(var5, var0.x8(), var9 == 1 ? 1 : 2);
               break;
            case 't':
               var9 = n5(var2, var6, var8);
               String var13 = var0.u3() < 12 ? var3.y4() : var3.e2();
               if (var9 == 1) {
                  if (var13.length() >= 1) {
                     var5.append(var13.charAt(0));
                  }
               } else {
                  var5.append(var13);
               }
               break;
            case 'y':
               var9 = n5(var2, var6, var8);
               if (var9 <= 2) {
                  n5(var5, var3.c4().u9(var0.m3()) % 100, var9);
               } else {
                  n5(var5, var3.c4().u9(var0.m3()), var9);
               }
               break;
            case 'z':
               var9 = n5(var2, var6, var8);
               s4 var14 = var1 != null ? var1 : h6.n5(TimeZone.getDefault(), var0.m3()).n3();
               if (var14.a6() >= 0L) {
                  var5.append('+');
               } else {
                  var5.append('-');
               }

               switch (var9) {
                  case 1:
                     var5.append(Math.abs(var14.l6()));
                     break;
                  case 2:
                     var5.append(a3.n5(Math.abs(var14.l6()), "D2"));
                     break;
                  default:
                     var5.append(a3.n5(Math.abs(var14.l6()), "D2"));
                     var5.append(':');
                     var5.append(a3.n5(Math.abs(var14.k5()), "D2"));
               }
         }

         var6 += var9;
      }

      return var5.toString();
   }

   private static boolean n5(String var0) {
      boolean var1 = false;

      for (char var5 : d1.c8(var0)) {
         if (var5 == '\'') {
            var1 = !var1;
         }

         if (var5 == 'd' && !var1) {
            return true;
         }
      }

      return false;
   }
}
