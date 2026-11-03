package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

class u1b {
   public static void n5(PictureFillFormat var0, r2c var1, h6j var2) {
      if (var0 == null) {
         throw new ArgumentNullException("pictureFillFormat");
      }

      if (var1 == null) {
         throw new ArgumentNullException("pictureFillFormatDeserializationContext");
      }

      if (var2.l6().a6().containsKey(var1.n5())) {
         com.aspose.slides.internal.k4y.r9i var3 = var2.l6().a6().get_Item(var1.n5());
         var0.getPicture().setImage(var2.n5().n5(var3.l6()));
      }

      if (var1.l6() == 3) {
         var0.setPictureFillMode(1);
      } else {
         var0.setPictureFillMode(0);
         var0.h0().n5(n5(var1.h0()));
         if (var0.getPicture().getImage() != null) {
            double var4 = com.aspose.slides.internal.n2d.t2.n5(t2f.u9(var1.k5()));
            double var6 = com.aspose.slides.internal.n2d.t2.n5(t2f.u9(var1.u3()));
            PPImage var8 = (PPImage)var0.getPicture().getImage();
            com.aspose.slides.internal.o9b.w1 var9 = var8.t2().u3();
            com.aspose.slides.internal.o9b.p8 var10 = var8.k5().h0().u3();
            d2k var11 = d2k.u3.u3();
            if (!com.aspose.slides.ms.System.d2.k5(var4) && var4 != 0.0) {
               var11.n5 = (float)(var4 * var9.l6() / 96.0 / var10.l6());
            }

            if (!com.aspose.slides.ms.System.d2.k5(var6) && var6 != 0.0) {
               var11.l6 = (float)(var6 * var9.k5() / 96.0 / var10.k5());
            }

            var0.h0().n5(var11.u3());
            double var12 = t2f.u3(var1.a6());
            double var14 = t2f.u3(var1.u9());
            if (var12 != 100.0 || var14 != 100.0) {
               float var16 = var10.l6() * 96 / var9.l6() * var11.n5;
               float var17 = var10.k5() * 96 / var9.k5() * var11.l6;
               var0.h0().n5(new e4c(var12 / 100.0 * var16, var14 / 100.0 * var17));
            }
         }
      }
   }

   public static void n5(PictureFillFormat var0, com.aspose.slides.internal.k4y.v9d var1, h6j var2) {
      if (var0 == null) {
         throw new ArgumentNullException("pictureFillFormat");
      }

      if (var1 == null) {
         throw new ArgumentNullException("backgroundImageElementData");
      }

      IPPImage var3 = var2.n5().n5(var1.l6());
      if (var3 != null) {
         var0.getPicture().setImage(var3);
      }

      if (var1.n5() == 3) {
         var0.setPictureFillMode(1);
      }
   }

   private static byte n5(int var0) {
      switch (var0) {
         case 0:
            return -1;
         case 1:
            return 0;
         case 2:
            return 1;
         case 3:
            return 2;
         case 4:
            return 3;
         case 5:
            return 4;
         case 6:
            return 5;
         case 7:
            return 6;
         case 8:
            return 7;
         case 9:
            return 8;
         default:
            throw new ArgumentOutOfRangeException("fillImageRefPoint");
      }
   }

   public static void n5(IPictureFillFormatEffectiveData var0, Shape var1, i4v var2, OdpSerializationContext var3) {
      if (var0 == null) {
         throw new ArgumentNullException("pictureFillFormat");
      }

      if (var2 == null) {
         throw new ArgumentNullException("fillFormatContext");
      }

      switch (var0.getPictureFillMode()) {
         case 0:
            n5(var0, var2);
            break;
         case 1:
            var2.n5(3);
            break;
         default:
            var2.n5(1);
      }

      m4a var4 = (m4a)var0.getPicture();
      PPImage var5 = (PPImage)var4.getImage();
      if (var5 != null) {
         c1t var6 = ((f3f)var0).u3();
         boolean var7 = var1 != null && c1t.l6(var6.u3().l6());
         boolean var8 = !var7 && m4a.n5((ImageTransformOCollectionEffectiveData)var4.getImageTransform());
         if (!var8) {
            com.aspose.slides.internal.k9.h0 var9 = null;
            com.aspose.slides.internal.k9.h0[] var10 = new com.aspose.slides.internal.k9.h0[]{var9};
            com.aspose.slides.internal.k9.u9 var11 = var4.n5(null, var10);
            var9 = var10[0];
            byte[] var12;
            if (var7) {
               var12 = n5(var11.a6(), var6, var1);
            } else {
               var12 = var11.a6();
            }

            String var13 = var3.n5(PPImage.n5(var12), PPImage.l6(var12).n5(), var12, null);
            var3.n5(var2, var13);
         } else {
            var3.n5(var2, var5);
         }
      }
   }

   private static void n5(IPictureFillFormatEffectiveData var0, i4v var1) {
      f3f var2 = (f3f)var0;
      var1.n5(2);
      var1.l6(q9k.u9.get_Item(var2.c8()));
      PPImage var3 = (PPImage)var0.getPicture().getImage();
      if (var3 != null) {
         com.aspose.slides.internal.o9b.w1 var4 = var3.t2().u3();
         d2k var5 = var2.u9().u3();
         double var6 = var3.getWidth() * 96 / var4.l6() * var5.n5;
         double var8 = var3.getHeight() * 96 / var4.k5() * var5.l6;
         var1.l6(t2f.n5(com.aspose.slides.internal.n2d.t2.a6(var6)));
         var1.k5(t2f.n5(com.aspose.slides.internal.n2d.t2.a6(var8)));
         e4c var10 = var2.a6().u9();
         if (e4c.u3(var10, e4c.k5)) {
            int var11 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var10.n5 / var6 * 100.0), 14);
            int var12 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var10.l6 / var8 * 100.0), 14);
            var1.u3(t2f.n5(var11));
            var1.a6(t2f.n5(var12));
         }
      }
   }

   private static byte[] n5(byte[] var0, c1t var1, Shape var2) {
      try {
         com.aspose.slides.internal.o9b.t4 var3 = com.aspose.slides.internal.n8e.k7.x8(var0);

         try {
            com.aspose.slides.internal.o9b.y1 var4 = ((ShapeFrame)var2.getFrame()).n5().y4();
            var4.n5(com.aspose.slides.internal.o9b.j5.n5(new com.aspose.slides.internal.o9b.j5(0, 0)).u3());
            com.aspose.slides.internal.o9b.y1 var5 = var1.n5(var4.y4()).y4();
            c1t var6 = new c1t();
            var6.n5(new s4s(-(var5.a6() - var4.a6()) / var5.s7(), -(var5.t2() - var4.t2()) / var5.k5(), var4.s7() / var5.s7(), var4.k5() / var5.k5()));
            com.aspose.slides.internal.o9b.y1 var7 = new com.aspose.slides.internal.o9b.y1(0.0F, 0.0F, var3.e2(), var3.h0());
            com.aspose.slides.internal.o9b.y1 var8 = var6.n5(var7.y4()).y4();
            com.aspose.slides.internal.o9b.l6 var9 = new com.aspose.slides.internal.o9b.l6(
               com.aspose.slides.internal.v6g.k5.u3(var8.s7(), 13), com.aspose.slides.internal.v6g.k5.u3(var8.k5(), 13)
            );

            try {
               com.aspose.slides.internal.o9b.z1 var10 = com.aspose.slides.internal.o9b.z1.n5(var9);

               try {
                  var10.c8(3);
                  var10.a6(2);
                  var10.n5(var3, new com.aspose.slides.internal.o9b.y1(0.0F, 0.0F, var8.s7(), var8.k5()), var8.y4(), 2);
               } finally {
                  if (var10 != null) {
                     var10.dispose();
                  }
               }

               com.aspose.slides.internal.j9e.s7 var11 = com.aspose.slides.internal.s5.h0.n5(com.aspose.slides.internal.j9e.x8.c8());
               if (com.aspose.slides.ms.System.o0.n5(var3.x8().n5(), com.aspose.slides.internal.j9e.x8.c8().n5()) && var11 != null) {
                  com.aspose.slides.internal.z0k.e2 var12 = new com.aspose.slides.internal.z0k.e2();

                  try {
                     com.aspose.slides.internal.j9e.h0 var13 = new com.aspose.slides.internal.j9e.h0();
                     var13.n5()[0] = new com.aspose.slides.internal.j9e.u9(com.aspose.slides.internal.j9e.a6.a6, 99L);
                     var9.n5(var12, var11, var13);
                     return var12.toArray();
                  } finally {
                     if (var12 != null) {
                        var12.dispose();
                     }
                  }
               } else {
                  return com.aspose.slides.internal.n8e.k7.n5((com.aspose.slides.internal.o9b.t4)var9);
               }
            } finally {
               if (var9 != null) {
                  var9.dispose();
               }
            }
         } finally {
            if (var3 != null) {
               var3.dispose();
            }
         }
      } catch (RuntimeException var42) {
         return var0;
      }
   }
}
