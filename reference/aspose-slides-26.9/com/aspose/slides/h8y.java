package com.aspose.slides;

import com.aspose.slides.exceptions.Exception;

class h8y {
   static void n5(GradientFormat var0, a9x var1) {
      com.aspose.slides.internal.k0r.q5 var2 = var1.n3();
      com.aspose.slides.internal.k0r.q5 var3 = null;
      if (var1.z1() != null) {
         var3 = (com.aspose.slides.internal.k0r.q5)var1.z1().k5();
      }

      com.aspose.slides.internal.k0r.v8 var4 = com.aspose.slides.internal.k0r.c2.l6(var2, var3, 407);
      com.aspose.slides.internal.k0r.z5 var5 = com.aspose.slides.internal.k0r.c2.n5(var2, var3, 412);
      if (var4 != null && var4.k5() > 6) {
         float var25 = (float)(com.aspose.slides.internal.k0r.c2.n5(var2, var3, 388, 65536L) & 4294967295L) / 65536.0F;
         float var27 = (float)(com.aspose.slides.internal.k0r.c2.n5(var2, var3, 386, 65536L) & 4294967295L) / 65536.0F;
         float var29 = var27 - var25;
         byte[] var9 = var4.l6();
         int var39 = 0;
         short var46 = com.aspose.slides.internal.n8e.y2.n5(var9, var39);
         var39 += 4;
         short var48 = com.aspose.slides.internal.n8e.y2.n5(var9, var39);
         if (var4.k5() < 6 + var48 * var46 || var48 != 8) {
            throw new PptReadException("Error reading gradient stops.");
         }

         for (int var13 = 0; var13 < var46; var13++) {
            int var14 = 6 + var48 * var13;
            float var15 = com.aspose.slides.internal.n8e.y2.k5(var9, var14 + 4) / 65536.0F;
            if (var15 >= 0.0F && var15 <= 1.0F) {
               float var16 = var25 + var15 * var29;
               if (var16 > 1.0F) {
                  var16 = 1.0F;
               }

               if (var16 < 0.0F) {
                  var16 = 0.0F;
               }

               long var17 = com.aspose.slides.internal.n8e.y2.u3(var9, var14) & 4294967295L;
               IGradientStop var19 = ((GradientStopCollection)var0.getGradientStops()).u3();
               var19.setPosition(var15);
               u0b.n5(var19.getColor(), var17, var16);
            }
         }

         if (((GradientStopCollection)var0.getGradientStops()).n5(0.0F) == null) {
            IGradientStop var50 = ((GradientStopCollection)var0.getGradientStops()).u3();
            var50.setPosition(0.0F);
            u0b.n5(var50.getColor(), var2, var3, 385, 386, 16777215L);
         }

         if (((GradientStopCollection)var0.getGradientStops()).n5(1.0F) == null) {
            IGradientStop var51 = ((GradientStopCollection)var0.getGradientStops()).u3();
            var51.setPosition(1.0F);
            u0b.n5(var51.getColor(), var2, var3, 387, 388, 16777215L);
         }
      } else if (var5 == null || (var5.j5() & 4294967295L) == 1073741827L) {
         ((GradientStopCollection)var0.getGradientStops()).n5(0.0F, com.aspose.slides.internal.o9b.c8.m3().o8());
         ((GradientStopCollection)var0.getGradientStops()).n5(1.0F, com.aspose.slides.internal.o9b.c8.w4().o8());
         u0b.n5((ColorFormat)var0.getGradientStops().get_Item(0).getColor(), var2, var3, 385, 386, 16777215L);
         u0b.n5((ColorFormat)var0.getGradientStops().get_Item(1).getColor(), var2, var3, 387, 388, 16777215L);
      } else if ((var5.j5() & 4294967295L) == 1073741835L) {
         ((GradientStopCollection)var0.getGradientStops()).n5(0.0F, com.aspose.slides.internal.o9b.c8.m3().o8());
         ((GradientStopCollection)var0.getGradientStops()).n5(1.0F, com.aspose.slides.internal.o9b.c8.w4().o8());
         u0b.n5((ColorFormat)var0.getGradientStops().get_Item(0).getColor(), var2, var3, 385, 386, 16777215L);
         com.aspose.slides.internal.k0r.z5 var6 = com.aspose.slides.internal.k0r.c2.n5(var2, var3, 387);
         ColorFormat var7 = (ColorFormat)var0.getGradientStops().get_Item(1).getColor();
         var7.n5((ColorFormat)var0.getGradientStops().get_Item(0).getColor());
         int var8 = 0;

         while (var8 < var7.getColorTransform().size()) {
            if (((ColorOperation)var7.getColorTransform().get_Item(var8)).n5()) {
               var7.getColorTransform().removeAt(var8);
            } else {
               var8++;
            }
         }

         long var20 = com.aspose.slides.internal.k0r.c2.n5(var2, var3, 388, 65536L);
         if ((var20 & 4294967295L) < 65536L) {
            var7.getColorTransform().add(5, (float)(var20 & 4294967295L) / 65536.0F);
         }

         int var10 = 0;
         if (var6 != null) {
            boolean var11 = (var6.j5() & 4294967295L & 65535L & 4294967295L) == 496L;
            boolean var12 = (var6.j5() & 4294967295L & 65535L & 4294967295L) == 752L;
            if (!var11 && !var12) {
               u0b.n5(var7, var2, var3, 387, 388, 16777215L);
            } else {
               var7.getColorTransform().add(26, 0.0F);
               var10 = (int)((var6.j5() & 4294967295L) >> 16 & 4294967295L & 255L);
               if (var11) {
                  var7.getColorTransform().add(1, var10 / 255.0F);
               } else if (var12) {
                  var7.getColorTransform().add(0, var10 / 255.0F);
               }

               var7.getColorTransform().add(27, 0.0F);
            }
         }
      }

      var5 = com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.k0r.c2.l6(var2, 384), com.aspose.slides.internal.k0r.z5.class);
      com.aspose.slides.internal.k0r.w8 var26 = com.aspose.slides.internal.k0r.c2.n5(var2);
      float var28 = (int)com.aspose.slides.internal.k0r.c2.n5(var2, var3, 396, 0L) / 100.0F;
      if (var5 != null) {
         switch ((int)var5.j5()) {
            case 4:
            case 7:
               var0.setGradientShape((byte)0);
               float var55 = com.aspose.slides.internal.k0r.c2.n5(var2, var3, 395, 0) / 65536.0F;
               if (var55 < 0.0F) {
                  var55 += 180.0F;
                  if (var28 != 0.0F && var28 != 1.0F && var0.getGradientStops().size() > 1) {
                     GradientStopCollection var22 = new GradientStopCollection(var0);

                     for (int var23 = var0.getGradientStops().size() - 1; var23 >= 0; var23--) {
                        IGradientStop var56 = var22.u3();
                        var56.setPosition(1.0F - var0.getGradientStops().get_Item(var23).getPosition());
                        var56.getColor().copyFrom(var0.getGradientStops().get_Item(var23).getColor());
                     }

                     var0.n5(var22);
                  }
               }

               var0.setLinearGradientAngle(90.0F - var55);
               if (var0.getLinearGradientAngle() < 0.0F) {
                  var0.setLinearGradientAngle(var0.getLinearGradientAngle() + 360.0F);
               }

               if ((var5.j5() & 4294967295L) == 7L) {
                  var0.setLinearGradientScaled((byte)1);
               }
               break;
            case 5:
               var0.setGradientShape((byte)1);
               com.aspose.slides.internal.k0r.z5 var30 = com.aspose.slides.internal.v6g.k5.n5(var26.n5(397), com.aspose.slides.internal.k0r.z5.class);
               com.aspose.slides.internal.k0r.z5 var33 = com.aspose.slides.internal.v6g.k5.n5(var26.n5(398), com.aspose.slides.internal.k0r.z5.class);
               com.aspose.slides.internal.k0r.z5 var41 = com.aspose.slides.internal.v6g.k5.n5(var26.n5(399), com.aspose.slides.internal.k0r.z5.class);
               com.aspose.slides.internal.k0r.z5 var47 = com.aspose.slides.internal.v6g.k5.n5(var26.n5(400), com.aspose.slides.internal.k0r.z5.class);
               float var49 = (float)((var30 != null ? var30.j5() : 0L) & 4294967295L) / 65536.0F;
               float var52 = (float)((var33 != null ? var33.j5() : 0L) & 4294967295L) / 65536.0F;
               float var53 = (float)((var41 != null ? var41.j5() : 0L) & 4294967295L) / 65536.0F;
               float var54 = (float)((var47 != null ? var47.j5() : 0L) & 4294967295L) / 65536.0F;
               var0.n5(var49, var52, var53 - var49, var54 - var52);
               break;
            case 6:
               var0.setGradientShape((byte)3);
               var0.n5(0.5F, 0.5F, 0.0F, 0.0F);
               var0.setGradientDirection(4);
         }

         if (var28 != 1.0F) {
            if (var28 >= 0.0F) {
               GradientStopCollection var31 = new GradientStopCollection(var0);
               if (var28 > 0.0F) {
                  for (int var34 = 0; var34 < var0.getGradientStops().size() - 1; var34++) {
                     IGradientStop var42 = var31.u3();
                     var42.setPosition(var0.getGradientStops().get_Item(var34).getPosition() * var28);
                     var42.getColor().copyFrom(var0.getGradientStops().get_Item(var34).getColor());
                  }
               }

               for (int var35 = var0.getGradientStops().size() - 1; var35 >= 0; var35--) {
                  IGradientStop var43 = var31.u3();
                  var43.setPosition(1.0F - var0.getGradientStops().get_Item(var35).getPosition() * (1.0F - var28));
                  var43.getColor().copyFrom(var0.getGradientStops().get_Item(var35).getColor());
               }

               var0.n5(var31);
            } else if (var28 < 0.0F) {
               GradientStopCollection var32 = new GradientStopCollection(var0);
               if (var28 > -1.0F) {
                  for (int var36 = var0.getGradientStops().size() - 1; var36 > 0; var36--) {
                     IGradientStop var44 = var32.u3();
                     var44.setPosition((1.0F - var0.getGradientStops().get_Item(var36).getPosition()) * (1.0F + var28));
                     var44.getColor().copyFrom(var0.getGradientStops().get_Item(var36).getColor());
                  }
               }

               for (int var37 = 0; var37 < var0.getGradientStops().size(); var37++) {
                  IGradientStop var45 = var32.u3();
                  var45.setPosition(1.0F - (1.0F - var0.getGradientStops().get_Item(var37).getPosition()) * -var28);
                  var45.getColor().copyFrom(var0.getGradientStops().get_Item(var37).getColor());
               }

               var0.n5(var32);
            }
         }
      }
   }

   static void n5(GradientFormat var0, com.aspose.slides.internal.k0r.r3 var1, g6o var2) {
      com.aspose.slides.internal.k0r.w8 var3 = var1.l6();
      var3.k5(384);
      var3.k5(395);
      switch (var0.getGradientShape()) {
         case -1:
            break;
         case 0:
            if (var0.getLinearGradientScaled() == 1) {
               var3.n5(new com.aspose.slides.internal.k0r.z5(384, 7L));
            } else {
               var3.n5(new com.aspose.slides.internal.k0r.z5(384, 4L));
            }

            if (var0.getLinearGradientAngle() != 90.0F) {
               float var4 = 90.0F - var0.getLinearGradientAngle();
               if (var4 < 0.0F) {
                  var4 += 360.0F;
               }

               if (var4 != 0.0F) {
                  var3.n5(new com.aspose.slides.internal.k0r.z5(395, com.aspose.slides.internal.v6g.k5.a6(var4 * 65536.0F, 13)));
               }
            }
            break;
         case 1:
            var3.n5(new com.aspose.slides.internal.k0r.z5(384, 5L));
            break;
         case 2:
            var2.n5("Radial gradient is not implemented for saving to PPT yet.", 2);
            break;
         case 3:
            var3.n5(new com.aspose.slides.internal.k0r.z5(384, 6L));
            break;
         default:
            throw new Exception();
      }

      var3.k5(385);
      var3.k5(386);
      var3.k5(387);
      var3.k5(388);
      var3.k5(407);
      int var13 = var0.getGradientStops().size();
      boolean var5 = false;
      boolean var6 = false;
      if (var13 > 0) {
         IColorFormat var7 = new ColorFormat(null);
         if (var0.getGradientStops().get_Item(0).getColor().getColorTransform().size() > 1) {
            ((ColorFormat)var7).n5(((ColorFormat)var0.getGradientStops().get_Item(0).getColor()).u3().o8());
         } else {
            var7 = var0.getGradientStops().get_Item(0).getColor();
         }

         u0b.n5(var7, var3, 385, 386, var2);
         var7 = new ColorFormat(null);
         if (var0.getGradientStops().get_Item(var13 - 1).getColor().getColorTransform().size() > 1) {
            ((ColorFormat)var7).n5(((ColorFormat)var0.getGradientStops().get_Item(var13 - 1).getColor()).u3().o8());
         } else {
            var7 = var0.getGradientStops().get_Item(var13 - 1).getColor();
         }

         u0b.n5(var7, var3, 387, 388, var2);
         var5 = var0.getGradientStops().get_Item(0).getPosition() == 0.0F;
         var6 = var0.getGradientStops().get_Item(var13 - 1).getPosition() == 1.0F;
      }

      if (!var5 || !var6 || var13 != 2) {
         int var15 = var6 ? 1 : 0;
         byte var8 = 0;
         com.aspose.slides.internal.k0r.b2 var9 = new com.aspose.slides.internal.k0r.b2(407, var13 - var15 - var8 & 65535, 8);

         for (int var10 = var8; var10 < var13 - var15; var10++) {
            IGradientStop var11 = var0.getGradientStops().get_Item(var10 - var8);
            IColorFormat var12 = new ColorFormat(null);
            if (var11.getColor().getColorTransform().size() > 1) {
               ((ColorFormat)var12).n5(((ColorFormat)var11.getColor()).u3().o8());
            } else {
               var12 = var11.getColor();
            }

            var9.n5(
               var10 - var8,
               com.aspose.slides.internal.v6g.k5.h0(
                  com.aspose.slides.internal.v6g.k5.h0(u0b.n5(var12, var2), 10)
                     | com.aspose.slides.internal.v6g.k5.h0(var11.getPosition() * 65536.0F, 13) << 32,
                  12
               )
            );
         }

         var3.n5(var9);
      }

      var3.l6(new com.aspose.slides.internal.k0r.z5(396, 100L));
      var3.k5(397);
      var3.k5(398);
      var3.k5(399);
      var3.k5(400);
      if (var0.getGradientShape() == 1 || var0.getGradientShape() == 3) {
         s4s var16 = var0.u9().l6();
         var3.n5(new com.aspose.slides.internal.k0r.z5(397, com.aspose.slides.internal.v6g.k5.a6(var16.n5.n5 * 65536.0F, 13)));
         var3.n5(new com.aspose.slides.internal.k0r.z5(398, com.aspose.slides.internal.v6g.k5.a6(var16.n5.l6 * 65536.0F, 13)));
         var3.n5(new com.aspose.slides.internal.k0r.z5(399, com.aspose.slides.internal.v6g.k5.a6(var16.n5().n5 * 65536.0F, 13)));
         var3.n5(new com.aspose.slides.internal.k0r.z5(400, com.aspose.slides.internal.v6g.k5.a6(var16.n5().l6 * 65536.0F, 13)));
      }

      if (var0.getTileFlip() != 0 && var0.getTileFlip() != -1) {
         var2.n5("Non default GradientFormat.TileFlip is not implemented for saving to PPT yet.", 2);
      }
   }
}
