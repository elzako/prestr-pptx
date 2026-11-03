package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.k4y.g7$n5;
import com.aspose.slides.ms.System.IDisposable;

class c4i {
   private static final com.aspose.slides.internal.n8e.e2 n5 = new com.aspose.slides.internal.n8e.e2(
      "tint",
      "shade",
      "comp",
      "inv",
      "gray",
      "alpha",
      "alphaOff",
      "alphaMod",
      "hue",
      "hueOff",
      "hueMod",
      "sat",
      "satOff",
      "satMod",
      "lum",
      "lumOff",
      "lumMod",
      "red",
      "redOff",
      "redMod",
      "green",
      "greenOff",
      "greenMod",
      "blue",
      "blueOff",
      "blueMod",
      "gamma",
      "invGamma"
   );
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9(
      "scrgbClr", "srgbClr", "hslClr", "sysClr", "schemeClr", "prstClr"
   );

   public static void n5(IColorFormat var0, com.aspose.slides.internal.k4y.z4 var1) {
      if (var1 != null) {
         n5(var0, var1.n5());
      }
   }

   public static void n5(IColorFormat var0, com.aspose.slides.internal.k4y.g7 var1) {
      if (var1 != null) {
         ColorFormat var2 = (ColorFormat)var0;
         m2n var3 = var2.a6();
         List var11;
         switch (l6.n5(var1.n5())) {
            case 0:
               com.aspose.slides.internal.k4y.e4w var4 = (com.aspose.slides.internal.k4y.e4w)var1.l6();
               float var19 = var4.n5() / 100.0F;
               float var6 = var4.l6() / 100.0F;
               float var7 = var4.k5() / 100.0F;
               float[] var23 = new float[]{var19};
               float[] var26 = new float[]{var6};
               float[] var28 = new float[]{var7};
               com.aspose.slides.internal.n8e.c8.n5(var23, var26, var28);
               var19 = var23[0];
               var6 = var26[0];
               var7 = var28[0];
               var2.n5(var19, var6, var7, 1);
               var11 = var4.u3();
               break;
            case 1:
               com.aspose.slides.internal.k4y.e8p var5 = (com.aspose.slides.internal.k4y.e8p)var1.l6();
               long var12 = var5.n5();
               var2.n5(
                  (byte)((var12 & 4294967295L) >> 16 & 4294967295L) & 0xFF,
                  (byte)((var12 & 4294967295L) >> 8 & 4294967295L & 255L & 4294967295L) & 0xFF,
                  (byte)(var12 & 4294967295L & 255L & 4294967295L) & 0xFF,
                  0
               );
               var11 = var5.l6();
               break;
            case 2:
               com.aspose.slides.internal.k4y.d0p var8 = (com.aspose.slides.internal.k4y.d0p)var1.l6();
               float var24 = var8.n5();
               var24 %= 360.0F;
               if (var24 < 0.0F) {
                  var24 += 360.0F;
               }

               float var27 = var8.l6() / 100.0F;
               float var29 = var8.k5() / 100.0F;
               var2.n5(var24, var27, var29, 2);
               var11 = var8.u3();
               break;
            case 3:
               com.aspose.slides.internal.k4y.s0i var9 = (com.aspose.slides.internal.k4y.s0i)var1.l6();
               var2.setSystemColor(var9.n5());
               int var10 = (int)var9.l6();
               byte var14 = (byte)(var10 >> 16);
               byte var15 = (byte)(var10 >> 8 & 0xFF);
               byte var16 = (byte)(var10 & 0xFF);
               var3.n5(com.aspose.slides.internal.o9b.c8.n5(var14 & 255, var15 & 255, var16 & 255).o8());
               var11 = var9.k5();
               break;
            case 4:
               com.aspose.slides.internal.k4y.q4d var17 = (com.aspose.slides.internal.k4y.q4d)var1.l6();
               var2.setSchemeColor(var17.n5());
               var11 = var17.l6();
               break;
            case 5:
               com.aspose.slides.internal.k4y.x4a var18 = (com.aspose.slides.internal.k4y.x4a)var1.l6();
               var2.setPresetColor(var18.n5());
               var11 = var18.l6();
               break;
            default:
               throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Unknown element \"", var1.n5(), "\""}));
         }

         n5(var2, var11);
      }
   }

   public static void n5(IColorFormat var0, IGenericEnumerable<com.aspose.slides.internal.k4y.g7> var1) {
      var0.getColorTransform().clear();
      IGenericEnumerator var2 = var1.iterator();

      try {
         while (var2.hasNext()) {
            com.aspose.slides.internal.k4y.g7 var3 = (com.aspose.slides.internal.k4y.g7)var2.next();
            int var4 = n5.n5(var3.n5());
            float var5;
            switch (var4) {
               case 2:
               case 3:
               case 4:
               case 26:
               case 27:
                  var5 = 0.0F;
                  break;
               case 8:
               case 9:
                  if (!com.aspose.slides.internal.v6g.k5.l6(var3.l6(), com.aspose.slides.internal.k4y.v1.class)) {
                     throw new Exception();
                  }

                  var5 = com.aspose.slides.internal.v6g.k5.n5(var3.l6(), com.aspose.slides.internal.k4y.v1.class).n5();
                  break;
               default:
                  if (!com.aspose.slides.internal.v6g.k5.l6(var3.l6(), com.aspose.slides.internal.k4y.d2n.class)) {
                     throw new Exception();
                  }

                  var5 = com.aspose.slides.internal.v6g.k5.n5(var3.l6(), com.aspose.slides.internal.k4y.d2n.class).n5() / 100.0F;
            }

            var0.getColorTransform().add(var4, var5);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   public static void n5(IColorFormat var0, com.aspose.slides.internal.f3.k5<com.aspose.slides.internal.k4y.z4> var1) {
      if (var0 != null && var0.getColorType() != -1) {
         com.aspose.slides.internal.k4y.z4 var2 = (com.aspose.slides.internal.k4y.z4)var1.invoke();
         l6(var0, var2);
      }
   }

   public static void l6(IColorFormat var0, com.aspose.slides.internal.k4y.z4 var1) {
      if (var0 != null && var0.getColorType() != -1) {
         com.aspose.slides.internal.k4y.b3 var2;
         if (var1.n5() == null) {
            var2 = var1.n5(n5(var0.getColorType())).l6();
         } else {
            var2 = var1.n5().l6();
         }

         n5(var0, var2);
      }
   }

   public static void n5(IColorFormat var0, g7$n5 var1) {
      if (var0 != null && var0.getColorType() != -1) {
         com.aspose.slides.internal.k4y.b3 var2 = var1.n5(n5(var0.getColorType())).l6();
         n5(var0, var2);
      }
   }

   private static String n5(int var0) {
      switch (var0) {
         case 0:
         default:
            return "srgbClr";
         case 1:
            return "scrgbClr";
         case 2:
            return "hslClr";
         case 3:
            return "schemeClr";
         case 4:
            return "sysClr";
         case 5:
            return "prstClr";
      }
   }

   public static void n5(IColorFormat var0, com.aspose.slides.internal.k4y.b3 var1) {
      g7$n5 var2 = null;
      switch (var0.getColorType()) {
         case 0:
         default:
            com.aspose.slides.internal.k4y.e8p var3 = (com.aspose.slides.internal.k4y.e8p)var1;
            var2 = new c4i$1(var3);
            var3.n5((((var0.getR() & 255) << 16 & 4294967295L) + ((var0.getG() & 255) << 8 & 4294967295L) & 4294967295L) + (var0.getB() & 0xFF) & 4294967295L);
            break;
         case 1:
            com.aspose.slides.internal.k4y.e4w var16 = (com.aspose.slides.internal.k4y.e4w)var1;
            var2 = new c4i$2(var16);
            float var19 = var0.getFloatR();
            float var22 = var0.getFloatG();
            float var24 = var0.getFloatB();
            float[] var26 = new float[]{var19};
            float[] var27 = new float[]{var22};
            float[] var10 = new float[]{var24};
            com.aspose.slides.internal.n8e.c8.l6(var26, var27, var10);
            var19 = var26[0];
            var22 = var27[0];
            var24 = var10[0];
            var16.n5(var19 * 100.0F);
            var16.l6(var22 * 100.0F);
            var16.k5(var24 * 100.0F);
            break;
         case 2:
            com.aspose.slides.internal.k4y.d0p var4 = (com.aspose.slides.internal.k4y.d0p)var1;
            var2 = new c4i$3(var4);
            float var5 = var0.getHue();
            var5 %= 360.0F;
            if (var5 < 0.0F) {
               var5 += 360.0F;
            }

            var4.n5(var5);
            var4.l6(var0.getSaturation() * 100.0F);
            var4.k5(var0.getLuminance() * 100.0F);
            break;
         case 3:
            com.aspose.slides.internal.k4y.q4d var9 = (com.aspose.slides.internal.k4y.q4d)var1;
            var2 = new c4i$6(var9);
            var9.n5(var0.getSchemeColor());
            break;
         case 4:
            com.aspose.slides.internal.k4y.s0i var6 = (com.aspose.slides.internal.k4y.s0i)var1;
            var2 = new c4i$4(var6);
            var6.n5(var0.getSystemColor());
            com.aspose.slides.internal.o9b.c8 var7 = ((ColorFormat)var0).a6().n5().o8();
            var6.n5((((var7.x8() & 255) << 16 & 4294967295L) + ((var7.n3() & 255) << 8 & 4294967295L) & 4294967295L) + (var7.y4() & 0xFF) & 4294967295L);
            break;
         case 5:
            com.aspose.slides.internal.k4y.x4a var8 = (com.aspose.slides.internal.k4y.x4a)var1;
            var2 = new c4i$5(var8);
            var8.n5(var0.getPresetColor());
      }

      IGenericEnumerator var15 = var0.getColorTransform().iterator();

      try {
         while (var15.hasNext()) {
            IColorOperation var17 = (IColorOperation)var15.next();
            com.aspose.slides.internal.k4y.g7 var21 = var2.n5(n5.n5(var17.getOperationType()));
            switch (var17.getOperationType()) {
               case 2:
               case 3:
               case 4:
               case 26:
               case 27:
                  break;
               case 8:
               case 9:
                  ((com.aspose.slides.internal.k4y.v1)var21.l6()).n5(var17.getParameter());
                  break;
               default:
                  ((com.aspose.slides.internal.k4y.d2n)var21.l6()).n5(var17.getParameter() * 100.0F);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var15, IDisposable.class)) {
            var15.dispose();
         }
      }
   }
}
