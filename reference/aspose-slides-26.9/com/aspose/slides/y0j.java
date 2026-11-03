package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;

class y0j {
   private static final float[] n5 = new float[]{1.0F, 3.0F};
   private static final float[] l6 = new float[]{4.0F, 3.0F};
   private static final float[] k5 = new float[]{4.0F, 3.0F, 1.0F, 3.0F};
   private static final float[] u3 = new float[]{8.0F, 3.0F};
   private static final float[] a6 = new float[]{8.0F, 3.0F, 1.0F, 3.0F};
   private static final float[] u9 = new float[]{8.0F, 3.0F, 1.0F, 3.0F, 1.0F, 3.0F};

   public static void n5(ISlide var0, com.aspose.slides.internal.g4.h0 var1, com.aspose.slides.internal.e7.c8 var2) {
      com.aspose.slides.internal.z0k.e2 var3 = new com.aspose.slides.internal.z0k.e2();

      try {
         var1.u3().n5(var3);
         var3.flush();
         byte[] var4 = var3.toArray();
         if (var3.getLength() > 0L) {
            com.aspose.slides.internal.z0k.e2 var5 = new com.aspose.slides.internal.z0k.e2(var4);

            try {
               com.aspose.slides.internal.o9b.l6 var6 = new com.aspose.slides.internal.o9b.l6(var5);

               try {
                  com.aspose.slides.internal.l9.u3 var7 = var1.u3().u3();
                  IPPImage var8;
                  if (!com.aspose.slides.internal.v6g.k5.l6(var1.u3(), com.aspose.slides.internal.l9.c8.class) && var7 != null) {
                     var8 = n5(var0, var7, var6);
                  } else {
                     var8 = ((ImageCollection)var0.getPresentation().getImages()).n5(var6);
                  }

                  com.aspose.slides.internal.o9b.y1 var9 = var1.a6().y4();
                  if (var1.h0() != null) {
                  }

                  if (com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var1.n5()), 14) != 0) {
                     var1.a6().a6(var9);
                  }

                  IPictureFrame var10 = var0.getShapes().addPictureFrame(5, var9.x8(), var9.n3(), var9.s7(), var9.k5(), var8);
                  var10.setFrame(new ShapeFrame(var9.x8(), var9.n3(), var9.s7(), var9.k5(), (byte)(var1.l6() ? 1 : 0), (byte)(var1.k5() ? 1 : 0), var1.n5()));
                  PictureFillFormat var11 = (PictureFillFormat)var10.getPictureFormat();
                  com.aspose.slides.internal.o9b.y1 var12 = var1.a6().y4();
                  i2h var13 = new i2h();
                  var13.a6 = (var12.l6() - var9.l6()) / var12.k5() * 100.0F;
                  var13.k5 = (var9.t2() - var12.t2()) / var12.k5() * 100.0F;
                  var13.u3 = (var12.h0() - var9.h0()) / var12.s7() * 100.0F;
                  var13.l6 = (var9.a6() - var12.a6()) / var12.s7() * 100.0F;
                  var11.n5(var13.k5());
               } finally {
                  if (var6 != null) {
                     var6.dispose();
                  }
               }
            } finally {
               if (var5 != null) {
                  var5.dispose();
               }
            }
         }
      } finally {
         if (var3 != null) {
            var3.dispose();
         }
      }
   }

   public static void n5(ISlide var0, com.aspose.slides.internal.g4.x8 var1, com.aspose.slides.internal.e7.c8 var2) {
      if (!var1.a6() && (!var1.u3() || (var1.k5().s7() & 255) != 0 || var1.z1() != null || var1.t4() != null || var1.u9())) {
         if (var1.u9() || var1.u3()) {
            com.aspose.slides.internal.o9b.y1 var3 = var1.n5().s7().y4();
            if (!(var3.s7() <= 0.0F) || !(var3.k5() <= 0.0F)) {
               com.aspose.slides.internal.x4g.m1 var4 = new com.aspose.slides.internal.x4g.m1();
               var4.k5(-var3.x8(), -var3.n3());
               var1.n5(var4);
               com.aspose.slides.internal.x4g.s7 var5 = var1.n5();
               com.aspose.slides.internal.o9b.y1 var6 = new com.aspose.slides.internal.o9b.y1();
               float var7 = com.aspose.slides.ms.System.q1.n5(var2.u3(), var2.a6());
               com.aspose.slides.internal.o9b.y1[] var8 = new com.aspose.slides.internal.o9b.y1[]{var6};
               boolean var9 = (var3.s7() > var7 || var3.k5() > var7) && n5(var5, var8);
               var8[0].a6(var6);
               if (var9) {
                  com.aspose.slides.internal.o9b.y1 var10 = new com.aspose.slides.internal.o9b.y1(var2.l6(), var2.k5(), var2.u3(), var2.a6());
                  var6.n5(var10.y4());
                  if (var6.u3()) {
                     return;
                  }

                  var5 = new com.aspose.slides.internal.x4g.s7();
                  var5.l6(var6.y4());
                  var6.a6(var3);
               }

               IGeometryPath var18 = ShapeUtil.n5(var5);
               GeometryShape var11 = com.aspose.slides.internal.v6g.k5.n5(
                  var0.getShapes().addAutoShape(5, var3.x8(), var3.n3(), var3.s7(), var3.k5()), GeometryShape.class
               );
               var11.setGeometryPath(var18);
               if (var1.u9()) {
                  com.aspose.slides.internal.o9b.c8 var12 = com.aspose.slides.internal.o9b.c8.n5(
                        var1.l6().s7() & 255, var1.l6().x8() & 255, var1.l6().n3() & 255, var1.l6().y4() & 255
                     )
                     .o8();
                  var11.getLineFormat().setStyle((byte)0);
                  float var13 = com.aspose.slides.ms.System.q1.n5(com.aspose.slides.internal.t8.u3.n5(var1.z3()));
                  float var14 = com.aspose.slides.ms.System.q1.n5(com.aspose.slides.internal.t8.u3.l6(var1.z3()));
                  var11.getLineFormat().setWidth(var1.h0() * com.aspose.slides.ms.System.q1.l6(var13, var14));
                  var11.getLineFormat().getFillFormat().setFillType((byte)1);
                  ((ColorFormat)var11.getLineFormat().getFillFormat().getSolidFillColor()).n5(var12.o8());
                  var11.getLineFormat().setMiterLimit(var1.y4());
                  var11.getLineFormat().setJoinStyle(n5(var1.s7()));
                  var11.getLineFormat().setCapStyle(l6(var1.c8()));
                  var11.getLineFormat().setMiterLimit(var1.y4());
                  float[] var15 = null;
                  float[][] var16 = new float[][]{var15};
                  var11.getLineFormat().setDashStyle(n5(var1, var16));
                  var15 = var16[0];
                  if (var11.getLineFormat().getDashStyle() == 11) {
                     var11.getLineFormat().setCustomDashPattern(var15);
                  }
               } else {
                  var11.getLineFormat().getFillFormat().setFillType((byte)0);
               }

               if (var1.u3()) {
                  IFillFormat var19 = var11.getFillFormat();
                  if (var1.z1() != null) {
                     var19.setFillType((byte)2);
                     GradientFormat var20 = (GradientFormat)var19.getGradientFormat();
                     var20.setGradientShape((byte)0);
                     var20.setLinearGradientAngle(n5(var1.z1().n5().u3(), var1.z1().l6().u3()));

                     for (int var24 = 0; var24 < var1.z1().u3().length; var24++) {
                        ((GradientStopCollection)var20.getGradientStops()).n5(var1.z1().u3()[var24], var1.z1().k5()[var24].o8());
                     }
                  } else if (var1.t4() != null) {
                     var19.setFillType((byte)2);
                     GradientFormat var21 = (GradientFormat)var19.getGradientFormat();
                     var21.setGradientShape((byte)2);
                     com.aspose.slides.internal.o9b.w1 var25 = var1.t4().k5().u3();
                     float var27 = var25.l6() / var3.s7();
                     float var28 = var25.k5() / var3.k5();
                     if (com.aspose.slides.ms.System.q1.n5(var27 - 0.5F) <= Float.MIN_VALUE) {
                        var21.setGradientDirection(4);
                     } else {
                        var21.n5(var27, var28, 0.0F, 0.0F);
                        var21.u3().n5(var27 - 1.0F);
                        var21.u3().l6(var28 - 1.0F);
                        var21.u3().k5(var21.u3().n5() + 1.0F);
                        var21.u3().u3(var21.u3().l6() + 1.0F);
                     }

                     for (int var17 = 0; var17 < var1.t4().u9().length; var17++) {
                        ((GradientStopCollection)var21.getGradientStops()).n5(var1.t4().u9()[var17], var1.t4().a6()[var17].o8());
                     }
                  } else if (var1.q0() != null) {
                     var19.setFillType((byte)4);
                     IPictureFillFormat var22 = var19.getPictureFillFormat();
                     var22.setTileAlignment((byte)2);
                     var22.getPicture().setImage(var0.getPresentation().getImages().addImage(u4i.n5(var1.q0().n5())));
                  } else {
                     com.aspose.slides.internal.o9b.c8 var23 = com.aspose.slides.internal.o9b.c8.n5(
                           var1.k5().s7() & 255, var1.k5().x8() & 255, var1.k5().n3() & 255, var1.k5().y4() & 255
                        )
                        .o8();
                     var19.setFillType((byte)1);
                     ((ColorFormat)var19.getSolidFillColor()).n5(var23.o8());
                  }
               } else {
                  var11.getFillFormat().setFillType((byte)0);
               }
            }
         }
      }
   }

   private static byte n5(com.aspose.slides.internal.g4.x8 var0, float[][] var1) {
      var1[0] = null;
      if (var0.e2() == 0) {
         return 0;
      } else {
         var1[0] = var0.t2() == 2 ? n5(var0.n3()) : var0.n3();
         if (n5(var1[0], n5)) {
            return 1;
         } else if (n5(var1[0], l6)) {
            return 2;
         } else if (n5(var1[0], u3)) {
            return 3;
         } else if (n5(var1[0], k5)) {
            return 4;
         } else if (n5(var1[0], a6)) {
            return 5;
         } else if (n5(var1[0], u9)) {
            return 6;
         } else if (n5(var1[0], com.aspose.slides.internal.w0.s7.u3)) {
            return 8;
         } else if (n5(var1[0], com.aspose.slides.internal.w0.s7.n5)) {
            return 7;
         } else if (n5(var1[0], com.aspose.slides.internal.w0.s7.l6)) {
            return 9;
         } else {
            return (byte)(n5(var1[0], com.aspose.slides.internal.w0.s7.k5) ? 10 : 11);
         }
      }
   }

   private static byte n5(int var0) {
      switch (var0) {
         case 0:
            return 2;
         case 1:
            return 1;
         case 2:
            return 0;
         case 3:
            return 2;
         default:
            return 2;
      }
   }

   private static byte l6(int var0) {
      var0 &= 3;
      switch (var0) {
         case 0:
            return 2;
         case 1:
            return 1;
         case 2:
            return 0;
         default:
            return -1;
      }
   }

   private static int n5(com.aspose.slides.internal.o9b.w1 var0, com.aspose.slides.internal.o9b.w1 var1) {
      double var2 = var1.l6() - var0.l6();
      double var4 = var1.k5() - var0.k5();
      double var6 = com.aspose.slides.ms.System.q1.u3(var4, var2);
      double var8 = var6 * 180.0 / Math.PI;
      if (var8 < 0.0) {
         var8 += 360.0;
      }

      return com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var8), 14);
   }

   private static float[] n5(float[] var0) {
      List var1 = new List();
      var1.addRange(com.aspose.slides.ms.System.u3.l6(com.aspose.slides.ms.System.u3.n5((Object)(var0))));

      for (int var2 = 0; var2 < var1.size(); var2++) {
         if (var2 % 2 == 0) {
            var1.set_Item(var2, (Float)var1.get_Item(var2) + 1.0F);
         } else {
            float var3 = (Float)var1.get_Item(var2) - 1.0F;
            float var4 = var3 < 0.0F ? 0.0F : Float.MIN_VALUE;
            var1.set_Item(var2, var3 <= 0.0F ? var4 : var3);
         }
      }

      return com.aspose.slides.internal.n8e.v4.a6(var1);
   }

   private static boolean n5(float[] var0, float[] var1) {
      if (var0 != null && var1 != null) {
         if (var0.length != var1.length) {
            return false;
         }

         for (int var2 = 0; var2 < var0.length; var2++) {
            if (com.aspose.slides.ms.System.q1.n5(var0[var2] - var1[var2]) > 0.05F) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private static boolean n5(com.aspose.slides.internal.x4g.s7 var0, com.aspose.slides.internal.o9b.y1[] var1) {
      com.aspose.slides.internal.o9b.y1.n5.a6(var1[0]);
      if (var0 == null) {
         return false;
      }

      com.aspose.slides.internal.x4g.k7 var2 = var0.u3();
      com.aspose.slides.internal.o9b.w1[] var3 = var2.n5();
      byte[] var4 = var2.l6();
      if (var3.length != 4) {
         return false;
      }

      if ((var4[0] & 255 & 7) != 0) {
         return false;
      }

      for (int var5 = 1; var5 < 3; var5++) {
         if ((var4[var5] & 255 & 7) != 1) {
            return false;
         }
      }

      if ((var4[3] & 255 & 128) == 0) {
         return false;
      } else {
         com.aspose.slides.internal.o9b.w1 var18 = var3[0].u3();
         com.aspose.slides.internal.o9b.w1 var6 = var3[1].u3();
         com.aspose.slides.internal.o9b.w1 var7 = var3[2].u3();
         com.aspose.slides.internal.o9b.w1 var8 = var3[3].u3();
         float var9 = 0.01F;
         boolean var10 = com.aspose.slides.ms.System.q1.n5(var18.k5() - var6.k5()) < 0.01F;
         boolean var11 = com.aspose.slides.ms.System.q1.n5(var6.l6() - var7.l6()) < 0.01F;
         boolean var12 = com.aspose.slides.ms.System.q1.n5(var7.k5() - var8.k5()) < 0.01F;
         boolean var13 = com.aspose.slides.ms.System.q1.n5(var8.l6() - var18.l6()) < 0.01F;
         if (var10 && var11 && var12 && var13) {
            float var14 = com.aspose.slides.ms.System.q1.l6(
               com.aspose.slides.ms.System.q1.l6(var18.l6(), var6.l6()), com.aspose.slides.ms.System.q1.l6(var7.l6(), var8.l6())
            );
            float var15 = com.aspose.slides.ms.System.q1.l6(
               com.aspose.slides.ms.System.q1.l6(var18.k5(), var6.k5()), com.aspose.slides.ms.System.q1.l6(var7.k5(), var8.k5())
            );
            float var16 = com.aspose.slides.ms.System.q1.n5(
               com.aspose.slides.ms.System.q1.n5(var18.l6(), var6.l6()), com.aspose.slides.ms.System.q1.n5(var7.l6(), var8.l6())
            );
            float var17 = com.aspose.slides.ms.System.q1.n5(
               com.aspose.slides.ms.System.q1.n5(var18.k5(), var6.k5()), com.aspose.slides.ms.System.q1.n5(var7.k5(), var8.k5())
            );
            com.aspose.slides.internal.o9b.y1.n5(var14, var15, var16, var17).a6(var1[0]);
            return true;
         } else {
            return false;
         }
      }
   }

   private static IPPImage n5(ISlide var0, com.aspose.slides.internal.l9.u3 var1, com.aspose.slides.internal.o9b.l6 var2) {
      com.aspose.slides.internal.o9b.l6 var3 = n5(var1, var2);

      try {
         return ((ImageCollection)var0.getPresentation().getImages()).n5(var3);
      } finally {
         if (var3 != null) {
            var3.dispose();
         }
      }
   }

   private static com.aspose.slides.internal.o9b.l6 n5(com.aspose.slides.internal.l9.u3 var0, com.aspose.slides.internal.o9b.l6 var1) {
      int var2 = var0.u9();
      int var3 = var0.a6();
      byte[] var4 = var0.t9().n5();
      com.aspose.slides.internal.o9b.l6 var5 = new com.aspose.slides.internal.o9b.l6(var1.e2(), var1.h0(), 2498570);
      com.aspose.slides.internal.j9e.n5 var6 = var1.n5(new com.aspose.slides.internal.o9b.y2(0, 0, var2, var3), 1, 2498570);
      com.aspose.slides.internal.j9e.n5 var7 = var5.n5(new com.aspose.slides.internal.o9b.y2(0, 0, var2, var3), 2, 2498570);

      try {
         long var8 = var6.u3().l6();
         byte[] var10 = new byte[var6.a6()];
         long var11 = var7.u3().l6();
         byte[] var13 = new byte[var7.a6()];

         for (int var14 = 0; var14 < var3; var14++) {
            com.aspose.slides.internal.e3m.n5.n5(new com.aspose.slides.ms.System.x9(var8 + var14 * var6.a6()), var10, 0, var10.length);
            byte var15 = 0;
            int var16 = var14 * var2;

            for (int var17 = 0; var17 < var2; var17++) {
               var13[var15] = (byte)(var10[var15] & 0xFF);
               var13[var15 + 1] = (byte)(var10[var15 + 1] & 0xFF);
               var13[var15 + 2] = (byte)(var10[var15 + 2] & 0xFF);
               var13[var15 + 3] = (byte)(var4[var16] & 0xFF);
               var15 += 4;
               var16++;
            }

            com.aspose.slides.internal.e3m.n5.n5(var13, 0, new com.aspose.slides.ms.System.x9(var11 + var14 * var7.a6()), var13.length);
         }
      } finally {
         var1.n5(var6);
         var5.n5(var7);
      }

      return var5;
   }
}
