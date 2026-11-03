package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.ms.System.IDisposable;

class u0b {
   static void n5(IColorFormat var0, long var1, double var3) {
      if ((var1 & 268435456L & 4294967295L) != 0L) {
         int var5 = (int)(var1 & 4294967295L & 255L);
         if (var5 <= 30) {
            var0.setSystemColor(var5);
         }

         ((ColorFormat)var0).n5(com.aspose.slides.internal.o9b.c8.m3().o8());
         n5(var0, (int)((var1 & 4294967295L) >> 8 & 4294967295L & 255L), (int)((var1 & 4294967295L) >> 16 & 4294967295L & 255L));
      } else if ((var1 & 134217728L & 4294967295L) != 0L) {
         var0.setSchemeColor(s1f.u3((int)(var1 & 4294967295L & 255L)));
      } else {
         ((ColorFormat)var0).n5(com.aspose.slides.internal.n8e.v4.n5(var1));
      }

      var0.getColorTransform().clear();
      if (var3 < 1.0) {
         var0.getColorTransform().add(5, (float)var3);
      }
   }

   static void n5(IColorFormat var0, com.aspose.slides.internal.k0r.q5 var1, int var2, int var3, long var4) {
      n5(var0, var1, null, var2, var3, var4, 8);
   }

   static void n5(IColorFormat var0, com.aspose.slides.internal.k0r.q5 var1, com.aspose.slides.internal.k0r.q5 var2, int var3, int var4, long var5) {
      n5(var0, var1, var2, var3, var4, var5, 8);
   }

   static void n5(IColorFormat var0, com.aspose.slides.internal.k0r.q5 var1, com.aspose.slides.internal.k0r.q5 var2, int var3, int var4, long var5, int var7) {
      long var8 = com.aspose.slides.internal.k0r.c2.n5(var1, var2, var3, var5);
      n5(var0, var1, var2, var8, var4, var7 - 1);
   }

   static void n5(IColorFormat var0, com.aspose.slides.internal.k0r.q5 var1, com.aspose.slides.internal.k0r.q5 var2, long var3, int var5, int var6) {
      double var7 = (com.aspose.slides.internal.k0r.c2.n5(var1, var2, var5, 65536L) & 4294967295L) / 65536.0;
      if ((var3 & 4294967295L & 268435456L & 4294967295L) != 0L
         && (var3 & 4294967295L & 255L & 4294967295L) >= 240L
         && (var3 & 4294967295L & 255L & 4294967295L) <= 247L
         && var6 > 0) {
         switch ((int)(var3 & 4294967295L & 255L & 4294967295L)) {
            case 240:
            default:
               n5(var0, var1, var2, 385, var5, 16777215L, var6 - 1);
               break;
            case 241:
               n5(var0, var1, var2, 448, var5, 0L, var6 - 1);
               break;
            case 242:
               n5(var0, var1, var2, 448, var5, 0L, var6 - 1);
               break;
            case 243:
               n5(var0, var1, var2, 513, var5, 0L, var6 - 1);
               break;
            case 244:
               ((ColorFormat)var0).n5(com.aspose.slides.internal.o9b.c8.m3().o8());
               break;
            case 245:
               n5(var0, var1, var2, 387, var5, 16777215L, var6 - 1);
               break;
            case 246:
               n5(var0, var1, var2, 450, var5, 16777215L, var6 - 1);
               break;
            case 247:
               com.aspose.slides.internal.k0r.z5 var9 = com.aspose.slides.internal.k0r.c2.k5(var1, 447);
               if (n5(var9, var1, var2)) {
                  n5(var0, var1, var2, 385, var5, 16777215L, var6 - 1);
               } else {
                  n5(var0, var1, var2, 448, var5, 0L, var6 - 1);
               }
         }

         n5(var0, (int)((var3 & 4294967295L) >> 8 & 4294967295L & 255L), (int)((var3 & 4294967295L) >> 16 & 4294967295L & 255L));
      } else {
         n5(var0, var3, var7);
      }
   }

   private static void n5(IColorFormat var0, int var1, int var2) {
      if ((var1 & 128) != 0) {
         var0.getColorTransform().add(4);
      }

      switch (var1 & 15) {
         case 1:
            var0.getColorTransform().add(26);
            var0.getColorTransform().add(1, var2 / 255.0F);
            var0.getColorTransform().add(27);
            break;
         case 2:
            var0.getColorTransform().add(26);
            var0.getColorTransform().add(0, var2 / 255.0F);
            var0.getColorTransform().add(27);
            break;
         case 3:
            var0.getColorTransform().add(18, var2 / 255.0F);
            var0.getColorTransform().add(21, var2 / 255.0F);
            var0.getColorTransform().add(24, var2 / 255.0F);
            break;
         case 4:
            var0.getColorTransform().add(18, -var2 / 255.0F);
            var0.getColorTransform().add(21, -var2 / 255.0F);
            var0.getColorTransform().add(24, -var2 / 255.0F);
            break;
         case 5:
            var0.getColorTransform().add(3);
            var0.getColorTransform().add(18, (var2 - 255) / 255.0F);
            var0.getColorTransform().add(21, (var2 - 255) / 255.0F);
            var0.getColorTransform().add(24, (var2 - 255) / 255.0F);
         case 6:
      }

      if ((var1 & 32) != 0) {
         var0.getColorTransform().add(3);
      }

      if ((var1 & 64) != 0) {
         var0.getColorTransform().add(3);
      }
   }

   static boolean n5(com.aspose.slides.internal.k0r.z5 var0, com.aspose.slides.internal.k0r.q5 var1, com.aspose.slides.internal.k0r.q5 var2) {
      com.aspose.slides.internal.k0r.v3 var3 = com.aspose.slides.internal.k0r.v3.n5(new com.aspose.slides.internal.k0r.z5(447, 0L), false);
      var3.n5(28L, (byte)1);
      com.aspose.slides.internal.k0r.z5 var4 = null;
      if (var2 != null) {
         var4 = com.aspose.slides.internal.k0r.c2.k5(var2, 447);
      }

      if (var4 != null) {
         var3.n5(var4);
      }

      if (var0 != null) {
         var3.n5(var0);
      }

      if (var0 == null && var4 == null) {
         return (com.aspose.slides.internal.k0r.c2.n5(var1, var2, 384, 10L) & 4294967295L) < 10L;
      }

      byte var5 = var3.n5(16L);
      return var5 == 1;
   }

   static long n5(IColorFormat var0, g6o var1) {
      long var2;
      switch (var0.getColorType()) {
         case 0:
         case 5:
         default:
            var2 = com.aspose.slides.ms.System.z3.c8(var0.getR() & 255 | (var0.getG() & 255) << 8 | (var0.getB() & 255) << 16);
            break;
         case 1:
            float var4 = var0.getFloatR();
            float var5 = var0.getFloatG();
            float var6 = var0.getFloatB();
            float[] var7 = new float[]{var4};
            float[] var8 = new float[]{var5};
            float[] var9 = new float[]{var6};
            com.aspose.slides.internal.n8e.c8.l6(var7, var8, var9);
            var4 = var7[0];
            var5 = var8[0];
            var6 = var9[0];
            var2 = com.aspose.slides.ms.System.z3.c8(
               com.aspose.slides.internal.v6g.k5.n5((Object)(var4 * 100.0F), 13) & 255
                  | (com.aspose.slides.internal.v6g.k5.n5((Object)(var5 * 100.0F), 13) & 255) << 8
                  | (com.aspose.slides.internal.v6g.k5.n5((Object)(var6 * 100.0F), 13) & 255) << 16
            );
            break;
         case 2:
            var2 = com.aspose.slides.ms.System.z3.c8(8355711);
            var1.n5("ColorType ColorType.HSL is not supported for saving yet", 2);
            break;
         case 3:
            long var10 = n5(var0.getSchemeColor());
            if (var10 != 254L) {
               var2 = com.aspose.slides.ms.System.z3.c8((byte)var10 & 255 | 0 | 0 | 134217728);
            } else {
               var2 = com.aspose.slides.ms.System.z3.c8(var0.getR() & 255 | (var0.getG() & 255) << 8 | (var0.getB() & 255) << 16);
            }
            break;
         case 4:
            var2 = com.aspose.slides.ms.System.z3.c8((byte)var0.getSystemColor() & 255 | 0 | 0 | 268435456);
      }

      return var2;
   }

   static void n5(IColorFormat var0, com.aspose.slides.internal.k0r.w8 var1, int var2, int var3, g6o var4) {
      if (var0 != null && var0.getColorType() != -1) {
         com.aspose.slides.internal.k0r.z5 var5 = new com.aspose.slides.internal.k0r.z5(var2, n5(var0, var4));
         var1.l6(var5);
         IGenericEnumerator var6 = var0.getColorTransform().iterator();

         try {
            while (var6.hasNext()) {
               IColorOperation var7 = (IColorOperation)var6.next();
               switch (var7.getOperationType()) {
                  case 5:
                     long var8 = com.aspose.slides.internal.v6g.k5.a6(var7.getParameter() * 65536.0F, 13);
                     com.aspose.slides.internal.k0r.z5 var10 = new com.aspose.slides.internal.k0r.z5(var3, var8);
                     var1.l6(var10);
                     break;
                  default:
                     var4.n5(
                        com.aspose.slides.ms.System.d1.n5(new String[]{
                           "ColorOperation #",
                           com.aspose.slides.ms.System.s3.n5(ColorTransformOperation.class, var7.getOperationType()),
                           " is not implemented yet."
                        }),
                        2
                     );
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
               var6.dispose();
            }
         }
      }
   }

   static void n5(IColorFormat var0, com.aspose.slides.internal.k0r.m1 var1) {
      if (var1.l6() == 255L) {
         ((ColorFormat)var0).c8();
      } else if (var1.l6() == 254L) {
         ((ColorFormat)var0).n5(var1.n5().o8());
      } else {
         var0.setSchemeColor(s1f.u3((byte)var1.l6() & 255));
      }
   }

   static com.aspose.slides.internal.k0r.m1 n5(IColorFormat var0) {
      com.aspose.slides.internal.k0r.m1 var1 = new com.aspose.slides.internal.k0r.m1(255L, com.aspose.slides.internal.o9b.c8.u3.o8());
      if (var0 != null && var0.getColorType() != -1) {
         var1 = new com.aspose.slides.internal.k0r.m1(254L, ((ColorFormat)var0).u3().o8());
      }

      return var1;
   }

   static long n5(int var0) {
      switch (var0) {
         case 0:
            return 0L;
         case 1:
            return 1L;
         case 2:
            return 2L;
         case 3:
            return 3L;
         case 4:
            return 4L;
         case 5:
            return 5L;
         case 6:
         case 7:
         case 8:
         case 9:
         default:
            return 254L;
         case 10:
            return 6L;
         case 11:
            return 7L;
      }
   }
}
