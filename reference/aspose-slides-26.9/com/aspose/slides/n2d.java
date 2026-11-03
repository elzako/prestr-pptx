package com.aspose.slides;

class n2d {
   public static com.aspose.slides.internal.x4g.s7 n5(
      String var0, e3 var1, TextParam var2, com.aspose.slides.internal.o9b.w1 var3, com.aspose.slides.internal.o9b.e5 var4, float var5
   ) {
      com.aspose.slides.internal.x4g.s7 var6 = new com.aspose.slides.internal.x4g.s7(1);
      if (com.aspose.slides.ms.System.d1.n5(var0)) {
         return var6;
      }

      boolean var7 = false;
      if (var2.a6 != null && var2.a6.getLanguageId() != null && com.aspose.slides.internal.v6g.k5.l6(var1, w2.class)) {
         String var8 = Fonts.n5(var2.a6.getLanguageId());
         var7 = ("Arab".equals(var8) || "Hebr".equals(var8)) && var2.q0() == 0.0F;
      }

      if (var7) {
         com.aspose.slides.internal.l7h.a5 var17 = new com.aspose.slides.internal.l7h.a5();
         com.aspose.slides.internal.x7n.y4 var9 = com.aspose.slides.internal.x7n.x8.l6(var0);

         while (var9.hasNext()) {
            var17.n5(0, var9.n5());
         }

         var0 = var17.toString();
      }

      e4z var18 = var2.d2();
      if (var2.e2() != 1) {
         n5(var6, var0, var1, var2, var18, var3.u3(), var4, var5);
      } else {
         TextParam var19;
         if (!com.aspose.slides.ms.System.n1.k5(var18.a6())) {
            var19 = var2.l6(var2.t4() * var18.a6());
         } else {
            var19 = var2.r4();
         }

         e4z var10 = var19.d2();
         com.aspose.slides.internal.l7h.a5 var11 = new com.aspose.slides.internal.l7h.a5(var0.length());
         boolean var12 = e3.n5(var0, 0);
         int var13 = 0;

         while (var13 < var0.length()) {
            do {
               var11.n5(var0.charAt(var13++));
            } while (var13 < var0.length() && var12 == e3.n5(var0, var13));

            String var14;
            TextParam var15;
            e4z var16;
            if (var12) {
               var14 = com.aspose.slides.ms.System.d1.s7(var11.toString());
               var15 = var19;
               var16 = var10;
            } else {
               var14 = var11.toString();
               var15 = var2;
               var16 = var18;
            }

            n5(var6, var14, var1, var15, var16, var3.u3(), var4, var5);
         }
      }

      return var6;
   }

   private static void n5(
      com.aspose.slides.internal.x4g.s7 var0,
      String var1,
      e3 var2,
      TextParam var3,
      e4z var4,
      com.aspose.slides.internal.o9b.w1 var5,
      com.aspose.slides.internal.o9b.e5 var6,
      float var7
   ) {
      if (var1.length() > 2 && var1.charAt(0) == 8237 && var1.charAt(var1.length() - 1) == 8236) {
         com.aspose.slides.internal.l7h.a5 var8 = new com.aspose.slides.internal.l7h.a5();

         for (int var9 = 0; var9 < var1.length(); var9++) {
            if (var1.charAt(var9) == 8205 || var1.charAt(var9) == 8237 || var1.charAt(var9) == 8238 || var1.charAt(var9) == 8236) {
               for (int var10 = 0; var10 < var1.length(); var10++) {
                  if (var1.charAt(var10) != 8205 && var1.charAt(var10) != 8237 && var1.charAt(var10) != 8238 && var1.charAt(var10) != 8236) {
                     var8.n5(var1.charAt(var10));
                  }
               }

               var1 = var8.toString();
               break;
            }
         }

         var8 = new com.aspose.slides.internal.l7h.a5();
         com.aspose.slides.internal.x7n.y4 var26 = com.aspose.slides.internal.x7n.x8.l6(var1);

         while (var26.hasNext()) {
            var8.n5(0, var26.n5());
         }

         var1 = var8.toString();
      }

      com.aspose.slides.internal.o9b.n3 var25 = var4.n5();
      int var27 = var25.x8();
      com.aspose.slides.internal.o9b.y4 var28 = var25.l6();
      float var11 = var3.t4();
      float var12 = (float)var28.k5(var27) / var28.h0(var27) * var25.n5(var2.a0());
      var5.l6(var5.k5() - (var12 + var11 * var3.k5() / 100.0F));
      if (var3.k5() != 0) {
         var11 *= 0.66F;
      }

      float[] var13 = var3.z8();
      if (com.aspose.slides.internal.v6g.k5.l6(var2, q4b.class) && var3.z8() != null && var7 != 0.0F) {
         var13 = null;
      }

      if (var1.length() > 0 && (com.aspose.slides.ms.System.q1.n5(var3.q0()) > 0.005 || !com.aspose.slides.ms.System.n1.k5(var3.c4()))) {
         com.aspose.slides.internal.l7h.a5 var14 = new com.aspose.slides.internal.l7h.a5();
         int var15 = 0;
         int var16 = 0;
         int var17 = 0;
         int[] var18 = new int[]{0};
         int[] var19 = new int[]{0};
         n5(var1, var18, var19);
         var15 = var18[0];
         var16 = var19[0];
         String var20 = null;

         do {
            if ((var15 == var16 || !com.aspose.slides.internal.n2d.u9.n3(var1.charAt(var15))) && var14.l6() > 0) {
               String var21 = var14.toString();
               var14.l6(0, var14.l6());
               if (var13 != null) {
                  float[] var22 = new float[var21.length()];
                  com.aspose.slides.ms.System.u3.n5(
                     com.aspose.slides.ms.System.u3.n5((Object)(var13)), var17, com.aspose.slides.ms.System.u3.n5((Object)(var22)), 0, var21.length()
                  );
                  n5(var0, var21, var28, var27, var11, var3, var5.u3(), var22, var6);
                  var17 += var21.length();
               } else {
                  if (!com.aspose.slides.ms.System.d1.n5(var20)) {
                     float var35 = var2.n5(var20, var3).l6() + var2.n5(var21, var3).l6();
                     float var23 = var2.n5(com.aspose.slides.ms.System.d1.n5(new String[]{var20, var21}), var3).l6();
                     var5.n5(var5.l6() + (var23 - var35));
                  }

                  n5(var0, var21, var28, var27, var11, var3, var5.u3(), var6);
                  var5.n5(var5.l6() + var2.n5(var21, var3).l6());
                  var20 = var21;
               }
            }

            if (var15 < var16) {
               if (com.aspose.slides.internal.n2d.u9.x8(var1.charAt(var15)) == 4) {
                  var14.n5('\u200d');
                  var14.n5(var1.charAt(var15++));
                  var14.n5('\u200d');
               } else {
                  var14.n5(var1.charAt(var15++));
               }
            }
         } while (var14.l6() > 0);
      } else {
         n5(var0, var1, var28, var27, var11, var3, var5.u3(), var13, var6);
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var2, q4b.class) && var3.z8() != null && var7 != 0.0F) {
         com.aspose.slides.internal.x4g.m1 var29 = new com.aspose.slides.internal.x4g.m1();
         com.aspose.slides.internal.o9b.y1 var31 = var0.s7().y4();
         float var33 = var31.x8();
         float var34 = var31.n3();
         var29.k5(var33, var34);
         var29.n5(var7 / var31.s7(), 1.0F);
         var29.k5(-var33, -var34);
         var0.l6(var29);
      }
   }

   public static void n5(String var0, int[] var1, int[] var2) {
      var1[0] = 0;
      var2[0] = var0.length();
      if (var0.charAt(0) == 8237) {
         var1[0]++;
      }

      if (var0.charAt(var0.length() - 1) == 8236) {
         var2[0]--;
      }
   }

   public static void n5(
      com.aspose.slides.internal.x4g.s7 var0,
      String var1,
      com.aspose.slides.internal.o9b.y4 var2,
      int var3,
      float var4,
      TextParam var5,
      com.aspose.slides.internal.o9b.w1 var6,
      float[] var7,
      com.aspose.slides.internal.o9b.e5 var8
   ) {
      v7z.n5(var0, var1, var2, var3, var4, var5, var6.u3(), var7, var8);
   }

   static void n5(
      com.aspose.slides.internal.x4g.s7 var0,
      String var1,
      com.aspose.slides.internal.o9b.y4 var2,
      int var3,
      float var4,
      TextParam var5,
      com.aspose.slides.internal.o9b.w1 var6,
      com.aspose.slides.internal.o9b.e5 var7
   ) {
      n5(var0, var1, var2, var3, var4, var5, var6.u3(), null, var7);
   }

   static com.aspose.slides.internal.o9b.c8 n5(com.aspose.slides.internal.o9b.c8 var0, byte var1) {
      int var2 = var1 & 255;
      int var3 = var0.s7() & 255;
      int var4 = 0;
      int var5 = 0;
      if (var2 > var3) {
         var4 = var2;
         var5 = var3;
      } else {
         var4 = var3;
         var5 = var2;
      }

      int var6 = com.aspose.slides.internal.v6g.k5.u3(var5 - var5 * ((255 - var4) / 255.0F), 13);
      var6 = var6 > 255 ? 255 : (var6 < 0 ? 0 : var6);
      return com.aspose.slides.internal.o9b.c8.n5(var6, var0.o8());
   }

   static boolean n5(com.aspose.slides.internal.o9b.l6 var0, com.aspose.slides.internal.o9b.c8 var1) {
      byte var2 = var1.x8();
      byte var3 = var1.n3();
      byte var4 = var1.y4();
      if (var0.s7() == 2498570) {
         com.aspose.slides.internal.j9e.n5 var5 = var0.n5(new com.aspose.slides.internal.o9b.y2(0, 0, var0.e2(), var0.h0()), 3, var0.s7());
         byte[] var6 = (byte[])var5.u3().k5().n5();
         int var7 = com.aspose.slides.ms.System.q1.n5(var5.a6()) * var0.h0();
         byte[] var8 = new byte[var7];
         System.arraycopy(var6, 0, var8, 0, var7);

         for (int var9 = 0; var9 < var8.length; var9 += 4) {
            if ((var8[var9 + 3] & 255) == 0) {
               var8[var9] = var4;
               var8[var9 + 1] = var3;
               var8[var9 + 2] = var2;
            }
         }

         System.arraycopy(var8, 0, var6, 0, var7);
         var0.n5(var5);
         return true;
      } else {
         return false;
      }
   }

   static void n5(com.aspose.slides.internal.o9b.l6 var0, byte var1, int var2) {
      if (var0.s7() == 2498570 && var2 >= 1) {
         com.aspose.slides.internal.j9e.n5 var3 = var0.n5(new com.aspose.slides.internal.o9b.y2(0, 0, var0.e2(), var0.h0()), 3, var0.s7());
         int var4 = com.aspose.slides.ms.System.q1.n5(var3.a6()) * var0.h0();
         byte[] var5 = new byte[var4];
         byte[] var6 = (byte[])var3.u3().k5().n5();
         System.arraycopy(var6, 0, var5, 0, var4);
         int var7 = var0.e2() << 2;
         int var8 = var2 << 2;
         int var9 = var0.h0() - var2;
         int var10 = var7 - var8 + 3;

         for (int var11 = 0; var11 < var0.h0(); var11++) {
            int var12 = var11 * var7;
            if (var11 >= var2 && var11 < var9) {
               for (int var14 = 3; var14 <= var8; var14 += 4) {
                  var5[var12 + var14] = var1;
               }

               for (int var15 = var10; var15 < var7; var15 += 4) {
                  var5[var12 + var15] = var1;
               }
            } else {
               for (int var13 = 3; var13 < var7; var13 += 4) {
                  var5[var12 + var13] = var1;
               }
            }
         }

         System.arraycopy(var5, 0, var6, 0, var4);
         var0.n5(var3);
      }
   }

   static byte[] n5(com.aspose.slides.internal.o9b.l6 var0) {
      com.aspose.slides.internal.o9b.y2 var1 = new com.aspose.slides.internal.o9b.y2(0, 0, var0.e2(), var0.h0());
      com.aspose.slides.internal.j9e.n5 var2 = var0.n5(var1.n3(), 3, var0.s7());
      byte[] var3 = (byte[])var2.u3().k5().n5();
      int var4 = com.aspose.slides.ms.System.q1.n5(var2.a6()) * var0.h0();
      byte[] var5 = new byte[var4];
      System.arraycopy(var3, 0, var5, 0, var4);
      var0.n5(var2);
      return var5;
   }

   static void n5(com.aspose.slides.internal.o9b.l6 var0, byte[] var1) {
      com.aspose.slides.internal.o9b.y2 var2 = new com.aspose.slides.internal.o9b.y2(0, 0, var0.e2(), var0.h0());
      com.aspose.slides.internal.j9e.n5 var3 = var0.n5(var2.n3(), 3, var0.s7());
      System.arraycopy(var1, 0, (byte[])var3.u3().k5().n5(), 0, var1.length);
      var0.n5(var3);
   }

   static com.aspose.slides.internal.x4g.m1 n5(com.aspose.slides.internal.o9b.u3 var0) {
      com.aspose.slides.internal.x4g.m1 var1 = new com.aspose.slides.internal.x4g.m1(1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
      if (com.aspose.slides.internal.v6g.k5.l6(var0, com.aspose.slides.internal.o9b.u6.class)) {
         var1 = ((com.aspose.slides.internal.o9b.u6)var0).c8();
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var0, com.aspose.slides.internal.x4g.z3.class)) {
         var1 = ((com.aspose.slides.internal.x4g.z3)var0).n3();
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var0, com.aspose.slides.internal.x4g.m3.class)) {
         var1 = ((com.aspose.slides.internal.x4g.m3)var0).e2();
      }

      return var1;
   }

   static void n5(com.aspose.slides.internal.o9b.u3 var0, com.aspose.slides.internal.x4g.m1 var1) {
      if (com.aspose.slides.internal.v6g.k5.l6(var0, com.aspose.slides.internal.o9b.u6.class)) {
         ((com.aspose.slides.internal.o9b.u6)var0).k5(var1);
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var0, com.aspose.slides.internal.x4g.z3.class)) {
         ((com.aspose.slides.internal.x4g.z3)var0).k5(var1);
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var0, com.aspose.slides.internal.x4g.m3.class)) {
         ((com.aspose.slides.internal.x4g.m3)var0).k5(var1);
      }
   }

   static com.aspose.slides.internal.o9b.z1 n5(com.aspose.slides.internal.o9b.l6 var0, e3 var1) {
      com.aspose.slides.internal.o9b.z1 var2 = com.aspose.slides.internal.o9b.z1.n5(var0);
      com.aspose.slides.internal.o9b.z1 var3 = var1.a0();
      if (var3 != null) {
         var2.l6(var3.t2());
         var2.u9(var3.t4());
         var2.c8(var3.z3());
         var2.a6(var3.t9());
         var2.n5(var3.y4());
         var2.u3(var3.e2());
      }

      return var2;
   }

   static com.aspose.slides.internal.o9b.y1 n5(IEffectFormatEffectiveData var0, com.aspose.slides.internal.o9b.y1 var1) {
      if (var0.isNoEffects()) {
         return var1;
      }

      com.aspose.slides.internal.x4g.s7 var2 = new com.aspose.slides.internal.x4g.s7();
      var2.l6(var1.y4());
      com.aspose.slides.internal.o9b.y1 var3 = var1.y4();
      if (var0.getOuterShadowEffect() != null) {
         n7q var4 = new n7q(var0.getOuterShadowEffect());
         com.aspose.slides.internal.o9b.y1 var5 = var4.n5(var2, null).y4();
         com.aspose.slides.internal.o9b.y1.l6(var1.y4(), var5.y4()).a6(var3);
      }

      if (var0.getReflectionEffect() != null) {
         q2b var6 = new q2b(var0.getReflectionEffect());
         com.aspose.slides.internal.o9b.y1 var8 = var6.n5(var2, (e3)null).y4();
         com.aspose.slides.internal.o9b.y1.l6(var1.y4(), var8.y4()).a6(var3);
      }

      if (var0.getGlowEffect() != null) {
         i5q var7 = new i5q(var0.getGlowEffect());
         com.aspose.slides.internal.o9b.y1 var9 = var7.n5(var2).y4();
         com.aspose.slides.internal.o9b.y1.l6(var1.y4(), var9.y4()).a6(var3);
      }

      return var3;
   }
}
