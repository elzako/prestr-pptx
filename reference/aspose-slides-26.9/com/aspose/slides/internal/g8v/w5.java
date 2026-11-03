package com.aspose.slides.internal.g8v;

public class w5 {
   private static final char[] n5 = new char[]{';', '&'};

   public static String n5(String var0) {
      if (com.aspose.slides.ms.System.d1.n5(var0)) {
         return var0;
      }

      int var1 = n5(var0, 0);
      if (var1 == -1) {
         return var0;
      }

      com.aspose.slides.internal.l7h.a5 var2 = new com.aspose.slides.internal.l7h.a5(var0.length());
      n5(var0, var1, var2);
      return var2.toString();
   }

   private static void n5(String var0, int var1, com.aspose.slides.internal.l7h.a5 var2) {
      com.aspose.slides.internal.f8y.n5.n5(var0 != null);
      com.aspose.slides.internal.f8y.n5.n5(var2 != null);
      com.aspose.slides.internal.f8y.n5.n5(0 <= var1 && var1 <= var0.length(), "0 <= index && index <= value.Length");
      int[] var3 = new int[]{var0.length() - var1};
      int[] var4 = new int[]{0};

      while (var1-- > 0) {
         var2.n5(var0.charAt((int)(var4[0]++)));
      }

      while (var3[0] > 0) {
         char var5 = var0.charAt(var4[0]);
         if (var5 <= '>') {
            switch (var5) {
               case '"':
                  var2.n5("&quot;");
                  break;
               case '&':
                  var2.n5("&amp;");
                  break;
               case '\'':
                  var2.n5("&#39;");
                  break;
               case '<':
                  var2.n5("&lt;");
                  break;
               case '>':
                  var2.n5("&gt;");
                  break;
               default:
                  var2.n5(var5);
            }
         } else {
            int var6 = -1;
            if (var5 >= 160 && var5 < 256) {
               var6 = var5;
            } else if (com.aspose.slides.ms.System.t9.y4(var5)) {
               int var7 = n5(var0, var4, var3);
               if (var7 >= 65536) {
                  var6 = var7;
               } else {
                  var5 = (char)var7;
               }
            }

            if (var6 >= 0) {
               var2.n5("&#");
               var2.n5(com.aspose.slides.ms.System.a3.n5(var6, com.aspose.slides.internal.x7n.l6.k5()));
               var2.n5(';');
            } else {
               var2.n5(var5);
            }
         }

         var3[0]--;
         var4[0]++;
      }
   }

   public static String l6(String var0) {
      if (com.aspose.slides.ms.System.d1.n5(var0)) {
         return var0;
      }

      if (!k5(var0)) {
         return var0;
      }

      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5(var0.length());
      n5(var0, var1);
      return var1.toString();
   }

   private static void n5(String var0, com.aspose.slides.internal.l7h.a5 var1) {
      com.aspose.slides.internal.f8y.n5.n5(var1 != null);
      int var2 = var0.length();

      for (int var3 = 0; var3 < var2; var3++) {
         char var4 = var0.charAt(var3);
         if (var4 == '&') {
            int var5 = com.aspose.slides.ms.System.d1.n5(var0, n5, var3 + 1);
            if (var5 > 0 && var0.charAt(var5) == ';') {
               int var6 = var3 + 1;
               int var7 = var5 - var6;
               if (var7 > 1 && var0.charAt(var6) == '#') {
                  long[] var12 = new long[]{0L};
                  boolean var13;
                  if (var0.charAt(var6 + 1) != 'x' && var0.charAt(var6 + 1) != 'X') {
                     var13 = com.aspose.slides.ms.System.l4.n5(
                        com.aspose.slides.ms.System.d1.l6(var0, var6 + 1, var7 - 1), 7, com.aspose.slides.internal.x7n.l6.k5(), var12
                     );
                  } else {
                     var13 = com.aspose.slides.ms.System.l4.n5(
                        com.aspose.slides.ms.System.d1.l6(var0, var6 + 2, var7 - 2), 512, com.aspose.slides.internal.x7n.l6.k5(), var12
                     );
                  }

                  if (var13) {
                     var13 = (var12[0] & 4294967295L) < 55296L || 57343L < (var12[0] & 4294967295L) && (var12[0] & 4294967295L) <= 1114111L;
                  }

                  if (var13) {
                     if ((var12[0] & 4294967295L) <= 65535L) {
                        var1.n5((char)var12[0]);
                     } else {
                        char[] var10 = new char[]{'\u0000'};
                        char[] var11 = new char[]{'\u0000'};
                        n5(var12[0], var10, var11);
                        var1.n5(var10);
                        var1.n5(var11);
                     }

                     var3 = var5;
                     continue;
                  }
               } else {
                  String var9 = com.aspose.slides.ms.System.d1.l6(var0, var6, var7);
                  var3 = var5;
                  char var8 = w5$n5.n5(var9);
                  if (var8 == 0) {
                     var1.n5('&');
                     var1.n5(var9);
                     var1.n5(';');
                     continue;
                  }

                  var4 = var8;
               }
            }
         }

         var1.n5(var4);
      }
   }

   private static int n5(String var0, int var1) {
      com.aspose.slides.internal.f8y.n5.n5(0 <= var1 && var1 <= var0.length(), "0 <= startPos && startPos <= s.Length");
      int var2 = var0.length() - var1;
      int var3 = var1;

      while (var2 > 0) {
         char var4 = var0.charAt(var3);
         if (var4 <= '>') {
            switch (var4) {
               case '"':
               case '&':
               case '\'':
               case '<':
               case '>':
                  return var0.length() - var2;
            }
         } else {
            if (var4 >= 160 && var4 < 256) {
               return var0.length() - var2;
            }

            if (com.aspose.slides.ms.System.t9.y4(var4)) {
               return var0.length() - var2;
            }
         }

         var3++;
         var2--;
      }

      return -1;
   }

   private static void n5(long var0, char[] var2, char[] var3) {
      com.aspose.slides.internal.f8y.n5.n5(65536L <= (var0 & 4294967295L) && (var0 & 4294967295L) <= 1114111L);
      int var4 = (int)((var0 & 4294967295L) - 65536L);
      var2[0] = (char)(var4 / 1024 + 55296);
      var3[0] = (char)(var4 % 1024 + 56320);
   }

   private static int n5(String var0, int[] var1, int[] var2) {
      com.aspose.slides.internal.f8y.n5.n5(var2[0] >= 1);
      com.aspose.slides.internal.f8y.n5.n5(com.aspose.slides.ms.System.t9.y4(var0.charAt(var1[0])));
      if (var2[0] <= 1) {
         return 65533;
      } else {
         char var3 = var0.charAt(0);
         char var4 = var0.charAt(1);
         if (com.aspose.slides.ms.System.t9.k5(var3, var4)) {
            var1[0]++;
            var2[0]--;
            return (var3 - 55296) * 1024 + (var4 - 56320) + 65536;
         } else {
            return 65533;
         }
      }
   }

   private static boolean k5(String var0) {
      for (int var1 = 0; var1 < var0.length(); var1++) {
         char var2 = var0.charAt(var1);
         if (var2 == '&' || com.aspose.slides.ms.System.t9.y4(var2)) {
            return true;
         }
      }

      return false;
   }
}
