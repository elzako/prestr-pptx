package com.aspose.slides.internal.r7c;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.IndexOutOfRangeException;
import com.aspose.slides.ms.System.a3;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class c8 {
   private static final int[] n5 = new int[]{
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      2,
      2,
      0,
      2,
      2,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      2,
      0,
      0,
      3,
      4,
      0,
      0,
      0,
      4,
      4,
      5,
      5,
      0,
      0,
      4,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      5,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      4,
      4,
      0,
      4,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      5,
      4,
      0,
      0,
      0
   };
   private Pattern l6;
   private String k5;

   public c8(String var1) {
      this.k5 = var1;
      var1 = com.aspose.slides.internal.l2p.n5.n5(var1);
      this.l6 = Pattern.compile(var1, 32);
   }

   public c8(String var1, int var2) {
      this.k5 = var1;
      var1 = com.aspose.slides.internal.l2p.n5.n5(var1);
      this.l6 = Pattern.compile(var1, 32 | var2);
   }

   private c8(Pattern var1) {
      this.l6 = var1;
   }

   @Override
   public String toString() {
      return this.l6.toString();
   }

   public String[] n5(String var1) {
      return this.l6.split(var1);
   }

   public String[] n5(String var1, int var2) {
      return this.l6.split(var1, var2);
   }

   public u3 l6(String var1) {
      return new u3(this.l6, var1);
   }

   public u3 l6(String var1, int var2) {
      return new u3(this.l6, var1, var2);
   }

   public u3 n5(String var1, int var2, int var3) {
      if (var1 == null) {
         throw new ArgumentNullException("input");
      } else if (var2 < 0) {
         throw new ArgumentOutOfRangeException("beginning");
      } else if (var3 < 0) {
         throw new ArgumentOutOfRangeException("length");
      } else if (var2 + var3 > var1.length()) {
         throw new IndexOutOfRangeException("beginning + length > input.length");
      } else {
         return new u3(this.l6, var1.substring(0, var2 + var3), var2);
      }
   }

   public static u3 n5(String var0, String var1) {
      return new c8(var1).l6(var0);
   }

   public static u3 n5(String var0, String var1, int var2) {
      return new c8(var1, var2).l6(var0);
   }

   public u9 k5(String var1) {
      return n5(this, var1);
   }

   public static u9 l6(String var0, String var1) {
      return n5(new c8(var1), var0);
   }

   public static u9 l6(String var0, String var1, int var2) {
      return n5(new c8(var1, var2), var0);
   }

   private static u9 n5(c8 var0, String var1) {
      u9 var2 = new u9();
      int var3 = 0;
      int var4 = var1.length();

      while (var3 < var4) {
         u3 var5 = new u3(n5(var0), var1, var3);
         if (!var5.u3()) {
            break;
         }

         var2.n5(var5);
         var3 = u3.n5(var5).end();
         if (var3 == var5.n5()) {
            break;
         }
      }

      return var2;
   }

   public static String n5(String var0, String var1, String var2) {
      if (var0 == null) {
         throw new ArgumentNullException("input");
      }

      if (var1 == null) {
         throw new ArgumentNullException("pattern");
      }

      if (var2 == null) {
         throw new ArgumentNullException("replacement");
      }

      c8 var3 = new c8(var1);
      u3 var4 = var3.l6(var0);
      StringBuffer var5 = new StringBuffer();
      Matcher var6 = u3.n5(var4);
      if (var4.u3()) {
         var2 = n5(var2, var6);
      }

      while (var4.u3()) {
         var6.appendReplacement(var5, var2);
         var4 = var4.u9();
      }

      var6.appendTail(var5);
      return var5.toString();
   }

   public static String n5(String var0, String var1, h0 var2) {
      if (var0 == null) {
         throw new ArgumentNullException("input");
      }

      if (var1 == null) {
         throw new ArgumentNullException("pattern");
      }

      if (var2 == null) {
         throw new ArgumentNullException("evaluator");
      }

      c8 var3 = new c8(var1);
      u3 var4 = var3.l6(var0);
      StringBuffer var5 = new StringBuffer();

      while (var4.u3()) {
         String var6 = var2.n5(var4);
         var6 = n5(var6, u3.n5(var4));
         u3.n5(var4).appendReplacement(var5, var6);
         var4 = var4.u9();
      }

      u3.n5(var4).appendTail(var5);
      return var5.toString();
   }

   public static String n5(String var0, String var1, String var2, int var3) {
      if (var0 == null) {
         throw new ArgumentNullException("input");
      }

      if (var1 == null) {
         throw new ArgumentNullException("pattern");
      }

      if (var2 == null) {
         throw new ArgumentNullException("replacement");
      }

      c8 var4 = new c8(var1, var3);
      u3 var5 = var4.l6(var0);
      StringBuffer var6 = new StringBuffer();
      Matcher var7 = u3.n5(var5);
      if (var5.u3()) {
         var2 = n5(var2, var7);
      }

      while (var5.u3()) {
         var7.appendReplacement(var6, var2);
         var5 = var5.u9();
      }

      var7.appendTail(var6);
      return var6.toString();
   }

   public String k5(String var1, String var2) {
      if (var2 == null) {
         throw new ArgumentNullException("replacement");
      }

      u3 var3 = this.l6(var1);
      Matcher var4 = u3.n5(var3);
      if (var3.u3()) {
         var2 = n5(var2, var4);
      }

      StringBuffer var5 = new StringBuffer();

      while (var3.u3()) {
         var4.appendReplacement(var5, var2);
         var3 = var3.u9();
      }

      var4.appendTail(var5);
      return var5.toString();
   }

   public String n5(String var1, h0 var2) {
      if (var1 == null) {
         throw new ArgumentNullException("input");
      }

      if (var2 == null) {
         throw new ArgumentNullException("evaluator");
      }

      u3 var3 = this.l6(var1);
      StringBuffer var4 = new StringBuffer();

      while (var3.u3()) {
         String var5 = var2.n5(var3);
         var5 = n5(var5, u3.n5(var3));
         u3.n5(var3).appendReplacement(var4, var5);
         var3 = var3.u9();
      }

      u3.n5(var3).appendTail(var4);
      return var4.toString();
   }

   public String n5(String var1, h0 var2, int var3, int var4) {
      if (var1 == null) {
         throw new ArgumentNullException("input");
      }

      if (var2 == null) {
         throw new ArgumentNullException("evaluator");
      }

      if (var4 >= 0 && var4 <= var1.length()) {
         String var5 = var1.substring(0, var4);
         String var6 = var1.substring(var4);
         u3 var7 = this.l6(var6);
         StringBuffer var8 = new StringBuffer(var5);

         while (var7.u3() && var3 > 0) {
            String var9 = var2.n5(var7);
            var9 = n5(var9, u3.n5(var7));
            u3.n5(var7).appendReplacement(var8, var9);
            var7 = var7.u9();
            var3--;
         }

         u3.n5(var7).appendTail(var8);
         return var8.toString();
      } else {
         throw new ArgumentOutOfRangeException("startat");
      }
   }

   private static String n5(String var0, Matcher var1) {
      var0 = var0.replace("\\", "\\\\");
      char[] var2 = var0.toCharArray();
      StringBuilder var3 = new StringBuilder();
      StringBuilder var4 = new StringBuilder();
      int var5 = 0;
      boolean var6 = false;

      while (var5 < var2.length) {
         char var7 = var2[var5];
         switch (var7) {
            case '$':
               var6 = false;
               if (var4.length() == 1) {
                  var3.append("\\$");
                  var4 = new StringBuilder();
               } else if (var4.length() > 1) {
                  if (var4.charAt(1) == '{') {
                     var3.append("\\").append(var4.toString());
                  } else if (Integer.valueOf(var4.substring(1)) > var1.groupCount()) {
                     var3.append("\\").append(var4.toString());
                  } else {
                     var3.append(var4.toString());
                  }

                  var4 = new StringBuilder();
                  var4.append(var7);
               } else {
                  var4.append(var7);
               }
               break;
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
               if (var4.length() == 1) {
                  var4.append(var7);
               } else if (var4.length() > 1) {
                  var4.append(var7);
                  int var17 = var4.charAt(1) == '{' ? 2 : 1;
                  if (!var6 && Integer.valueOf(var4.substring(var17)) > var1.groupCount()) {
                     var3.append("\\").append(var4.toString());
                     var4 = new StringBuilder();
                  }
               } else {
                  var3.append(var7);
               }
               break;
            case '{':
               if (var4.length() == 1) {
                  var4.append(var7);
               } else if (var4.length() > 1) {
                  if (var4.charAt(1) == '{') {
                     var3.append("\\").append(var4.toString());
                  } else if (Integer.valueOf(var4.substring(1)) > var1.groupCount()) {
                     var3.append("\\").append(var4.toString());
                  } else {
                     var3.append(var4.toString());
                  }

                  var3.append(var7);
                  var4 = new StringBuilder();
               } else {
                  var3.append(var7);
               }
               break;
            case '}':
               if (var4.length() == 1) {
                  var3.append("\\").append(var4.toString());
                  var3.append(var7);
                  var4 = new StringBuilder();
               } else if (var4.length() > 1) {
                  if (var4.charAt(1) == '{') {
                     if (var4.length() > 2) {
                        int[] var8 = new int[1];
                        boolean var9 = a3.n5(var4.substring(2), var8);
                        if (var9) {
                           if (var8[0] > var1.groupCount()) {
                              var3.append("\\").append(var4.toString());
                              var3.append(var7);
                           } else {
                              var3.append(var4.toString().replace("{", ""));
                           }
                        } else {
                           var4.append(var7);

                           try {
                              var1.replaceFirst(var4.toString());
                           } catch (IllegalArgumentException var14) {
                              var3.append("\\");
                           } finally {
                              var3.append(var4.toString());
                              var1.reset();
                              var1.find();
                           }
                        }
                     } else {
                        var3.append("\\").append(var4.toString());
                        var3.append(var7);
                     }
                  } else if (Integer.valueOf(var4.substring(1)) > var1.groupCount()) {
                     var3.append("\\").append(var4.toString());
                     var3.append(var7);
                  } else {
                     var3.append(var4.toString());
                  }

                  var4 = new StringBuilder();
               } else {
                  var3.append(var7);
               }

               var6 = false;
               break;
            default:
               if (var4.length() == 1) {
                  var3.append("\\").append(var4.toString());
                  var3.append(var7);
                  var4 = new StringBuilder();
               } else if (var4.length() > 1) {
                  if (var4.charAt(1) == '{') {
                     var4.append(var7);
                     var6 = true;
                  } else {
                     if (Integer.valueOf(var4.substring(1)) > var1.groupCount()) {
                        var3.append("\\").append(var4.toString());
                     } else {
                        var3.append(var4.toString());
                     }

                     var3.append(var7);
                     var4 = new StringBuilder();
                  }
               } else {
                  var3.append(var7);
               }
         }

         var5++;
      }

      if (var4.length() > 0) {
         if (var4.length() == 1) {
            var3.append("\\").append(var4.toString());
         } else if (var4.length() > 1) {
            if (var4.charAt(1) == '{') {
               var3.append("\\").append(var4.toString());
            } else if (Integer.valueOf(var4.substring(1)) > var1.groupCount()) {
               var3.append("\\").append(var4.toString());
            } else {
               var3.append(var4.toString());
            }
         }
      }

      return var3.toString();
   }

   public static boolean k5(String var0, String var1, int var2) {
      c8 var3 = new c8(var1, var2);
      return var3.u3(var0);
   }

   public static boolean u3(String var0, String var1) {
      return k5(var0, var1, 0);
   }

   public boolean u3(String var1) {
      Matcher var2 = this.l6.matcher(var1);
      return var2.find();
   }

   public static String a6(String var0) {
      for (int var1 = 0; var1 < var0.length(); var1++) {
         if (n5(var0.charAt(var1))) {
            StringBuilder var2 = new StringBuilder();
            char var3 = var0.charAt(var1);
            var2.append(var0, 0, var1);

            do {
               var2.append('\\');
               switch (var3) {
                  case '\t':
                     var3 = 't';
                     break;
                  case '\n':
                     var3 = 'n';
                  case '\u000b':
                  default:
                     break;
                  case '\f':
                     var3 = 'f';
                     break;
                  case '\r':
                     var3 = 'r';
               }

               var2.append(var3);
               int var4 = ++var1;

               while (var1 < var0.length()) {
                  var3 = var0.charAt(var1);
                  if (n5(var3)) {
                     break;
                  }

                  var1++;
               }

               var2.append(var0, var4, var1);
            } while (var1 < var0.length());

            return var2.toString();
         }
      }

      return var0;
   }

   public static Pattern n5(c8 var0) {
      return var0 == null ? null : var0.l6;
   }

   public static c8 n5(Pattern var0) {
      return var0 == null ? null : new c8(var0);
   }

   private static boolean n5(char var0) {
      return var0 <= '|' && n5[var0] >= 1;
   }
}
