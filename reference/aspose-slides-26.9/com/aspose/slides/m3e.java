package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

class m3e {
   static void n5(IFillFormat var0, a9x var1) {
      com.aspose.slides.internal.k0r.q5 var2 = var1.n3();
      com.aspose.slides.internal.k0r.z5 var3 = com.aspose.slides.internal.v6g.k5.n5(
         com.aspose.slides.internal.k0r.c2.l6(var2, 447), com.aspose.slides.internal.k0r.z5.class
      );
      com.aspose.slides.internal.k0r.a9 var4 = var2.h0();
      com.aspose.slides.internal.k0r.z5 var5 = null;
      if (var4 != null && var4.l6() != null) {
         var5 = com.aspose.slides.internal.v6g.k5.n5(var4.l6().n5(447), com.aspose.slides.internal.k0r.j4.class);
      }

      com.aspose.slides.internal.k0r.q5 var6 = null;
      if (var1.z1() != null) {
         var6 = (com.aspose.slides.internal.k0r.q5)var1.z1().k5();
      }

      com.aspose.slides.internal.k0r.z5 var7 = var3;
      if (var7 == null) {
         var7 = var5;
      }

      if (!u0b.n5(var7, var2, var6)) {
         com.aspose.slides.internal.k0r.z5 var8 = com.aspose.slides.internal.v6g.k5.n5(
            com.aspose.slides.internal.k0r.c2.l6(var2, 385), com.aspose.slides.internal.k0r.z5.class
         );
         if (var3 == null && var8 != null && var2.u3().t2() != 75) {
            var0.setFillType((byte)1);
            u0b.n5((ColorFormat)var0.getSolidFillColor(), var2, var6, 385, 386, 16777215L);
         } else if ((var3 != null || var2.u3().u3() || var2.u3().t2() != 202) && var2.a6() != null) {
            var0.setFillType((byte)0);
         } else {
            var0.setFillType((byte)1);
            ((ColorFormat)var0.getSolidFillColor()).n5(com.aspose.slides.internal.o9b.c8.w4().o8());
         }
      } else {
         long var9 = var2.u3().t2() != 75 ? 0L : 4294967295L;
         long var11 = com.aspose.slides.internal.k0r.c2.n5(var2, var6, 384, var9);
         switch ((int)var11) {
            case -1:
               long var25 = com.aspose.slides.internal.k0r.c2.n5(var2, var6, 385, 4294967295L);
               long var27 = com.aspose.slides.internal.k0r.c2.n5(var2, var6, 386, 4294967295L);
               if (var25 == 4294967295L && var27 == 4294967295L) {
                  var0.setFillType((byte)0);
               } else {
                  var0.setFillType((byte)1);
                  u0b.n5(var0.getSolidFillColor(), var2, var6, 385, 386, 16777215L);
               }
               break;
            case 0:
               var0.setFillType((byte)1);
               u0b.n5((ColorFormat)var0.getSolidFillColor(), var2, var6, 385, 386, 16777215L);
               break;
            case 1:
               var0.setFillType((byte)3);
               s8f.n5((PatternFormat)var0.getPatternFormat(), false, var1);
               if (var0.getPatternFormat().getPatternStyle() == 0) {
                  long var13 = com.aspose.slides.internal.k0r.c2.n5(var2, var6, 390, 0L);
                  if ((var13 & 4294967295L) > 0L && (var13 & 4294967295L) < var1.y4().a6().t2().size() + 1) {
                     var0.setFillType((byte)4);
                     s4q.n5((PictureFillFormat)var0.getPictureFillFormat(), 2L, var1);
                     PPImage var15 = (PPImage)var0.getPictureFillFormat().getPicture().getImage();
                     if (var15 != null
                        && (com.aspose.slides.internal.k0r.c2.l6(var2, 385) != null || com.aspose.slides.internal.k0r.c2.l6(var2, 387) != null)
                        && !"image/x-wmf".equals(var15.getContentType())) {
                        com.aspose.slides.internal.o9b.l6 var16 = (com.aspose.slides.internal.o9b.l6)var15.n5();

                        try {
                           if (var16.e2() == 8 && var16.h0() == 8) {
                              com.aspose.slides.internal.o9b.l6 var17 = null;

                              try {
                                 var17 = new com.aspose.slides.internal.o9b.l6(8, 8, 2498570);
                                 com.aspose.slides.internal.o9b.c8 var18 = ((ColorFormat)var0.getPatternFormat().getBackColor()).u3().o8();
                                 com.aspose.slides.internal.o9b.c8 var19 = ((ColorFormat)var0.getPatternFormat().getForeColor()).u3().o8();

                                 for (int var20 = 0; var20 < 8; var20++) {
                                    for (int var21 = 0; var21 < 8; var21++) {
                                       if (var16.l6(var20, var21).h0() == com.aspose.slides.internal.o9b.c8.m3().h0()) {
                                          var17.n5(var20, var21, var18.o8());
                                       } else {
                                          var17.n5(var20, var21, var19.o8());
                                       }
                                    }
                                 }

                                 IPPImage var39 = ((ImageCollection)var1.y4().a6().n5().getImages()).n5(var17);
                                 var0.getPictureFillFormat().getPicture().setImage(var39);
                                 var17.dispose();
                              } catch (RuntimeException var35) {
                                 com.aspose.slides.internal.n8e.v4.n5(var35);
                                 if (var17 != null) {
                                    var17.dispose();
                                 }
                              }
                           }
                        } finally {
                           if (var16 != null) {
                              var16.dispose();
                           }
                        }
                     }
                  }
               }
               break;
            case 2:
            case 3:
               PictureFillFormat var23 = (PictureFillFormat)var0.getPictureFillFormat();
               s4q.n5(var23, var11, var1);
               if (var23.getPicture().getImage() != null || var23.getPicture().getLinkPathLong() != null) {
                  var0.setFillType((byte)4);
               }
               break;
            case 4:
            case 5:
            case 6:
            case 7:
               var0.setFillType((byte)2);
               h8y.n5((GradientFormat)var0.getGradientFormat(), var1);
               break;
            case 8:
            default:
               var0.setFillType((byte)-1);
               break;
            case 9:
               AutoShape var24 = com.aspose.slides.internal.v6g.k5.n5(((FillFormat)var0).getParent_IPresentationComponent(), AutoShape.class);
               if (var24 != null) {
                  var24.setUseBackgroundFill(true);
               }
         }
      }

      if (var5 != null) {
         var3 = var5;
      }

      com.aspose.slides.internal.k0r.z5 var38 = null;
      if (var6 != null) {
         var4 = var6.h0();
         if (var4 != null && var4.l6() != null) {
            var38 = com.aspose.slides.internal.v6g.k5.n5(var4.l6().n5(447), com.aspose.slides.internal.k0r.z5.class);
         }

         if (var38 == null) {
            var38 = com.aspose.slides.internal.k0r.c2.k5(var6, 447);
         }
      }

      long var31;
      if (var3 != null) {
         if (var38 != null) {
            long var29 = (var3.j5() & 4294967295L) >> 16 & 4294967295L;
            var31 = (var38.j5() & ~(var29 & 4294967295L) & 4294967295L | var3.j5() & var29) & 4294967295L & 65535L & 4294967295L;
         } else {
            var31 = var3.j5() & 4294967295L & 65535L & 4294967295L;
         }
      } else {
         var31 = var38 != null ? var38.j5() & 4294967295L & 65535L & 4294967295L : 4294967295L;
      }

      if (var31 == 4294967295L) {
         var0.setRotateWithShape((byte)-1);
      } else {
         var0.setRotateWithShape((byte)((var31 & 32L & 4294967295L) != 0L ? 1 : 0));
      }
   }

   static void n5(IFillFormat var0, k1z var1) {
      if (var0 != null) {
         IPresentationComponent var2 = ((FillFormat)var0).getParent_IPresentationComponent();
         com.aspose.slides.internal.k0r.r3 var3 = var1.z8();
         com.aspose.slides.internal.k0r.w8 var4 = var3.l6();
         com.aspose.slides.internal.k0r.j4 var5 = new com.aspose.slides.internal.k0r.j4();
         var4.l6(var5);
         boolean var6 = com.aspose.slides.internal.v6g.k5.n5(var1, j9p.class) != null;
         if (var6) {
            var5.e2(true);
            var4.n5(new com.aspose.slides.internal.k0r.z5(403, false, 9150350L));
            var4.n5(new com.aspose.slides.internal.k0r.z5(404, false, 6864350L));
         }

         if (com.aspose.slides.internal.v6g.k5.l6(var2, AutoShape.class) && ((AutoShape)var2).getUseBackgroundFill()) {
            var4.l6(new com.aspose.slides.internal.k0r.z5(384, 9L));
            var5.n3(true);
         } else {
            g6o var7 = var1.a6().n5();
            com.aspose.slides.internal.k0r.a9 var8 = var1.j5();
            switch (var0.getFillType()) {
               case -1:
               case 0:
                  if (com.aspose.slides.internal.v6g.k5.l6(var2, Cell.class)) {
                     var5.t9(true);
                     var5.y4(false);
                  } else {
                     var5.t9(false);
                     var5.y4(true);
                  }

                  var5.n3(false);
                  break;
               case 1:
                  var5.n3(true);
                  if (com.aspose.slides.internal.v6g.k5.l6(var2, Cell.class)) {
                     var5.y4(false);
                  } else {
                     var5.y4(true);
                  }

                  IColorFormat var9 = new ColorFormat(null);
                  if (var0.getSolidFillColor().getColorTransform().size() <= 1
                     && (
                        var0.getSolidFillColor().getColorTransform().size() != 1
                           || var0.getSolidFillColor().getColorTransform().get_Item(0).getOperationType() == 5
                     )) {
                     var9 = var0.getSolidFillColor();
                  } else {
                     ((ColorFormat)var9).n5(((ColorFormat)var0.getSolidFillColor()).u3().o8());
                  }

                  u0b.n5(var9, var4, 385, 386, var7);
                  break;
               case 2:
                  var5.n3(true);
                  h8y.n5((GradientFormat)var0.getGradientFormat(), var3, var7);
                  var4.k5(447);
                  var4.n5(new com.aspose.slides.internal.k0r.z5(447, 1048592L));
                  if (!var6) {
                     n5(var0.getRotateWithShape(), var8);
                  }
                  break;
               case 3:
                  var5.n3(true);
                  s8f.n5((PatternFormat)var0.getPatternFormat(), var3, false, var7);
                  break;
               case 4:
                  var5.n3(true);
                  if (!com.aspose.slides.internal.v6g.k5.l6(var2, PictureFrame.class)) {
                     s4q.n5((PictureFillFormat)var0.getPictureFillFormat(), var3, var7);
                  }

                  if (!var6) {
                     n5(var0.getRotateWithShape(), var8);
                  }
                  break;
               case 5:
                  var7.n5("FillType.Group PPT serialization is not implemented yet.", 3);
                  break;
               default:
                  throw new ArgumentOutOfRangeException();
            }
         }
      }
   }

   static void n5(byte var0, com.aspose.slides.internal.k0r.a9 var1) {
      if (var0 != -1) {
         com.aspose.slides.internal.k0r.j4 var2 = (com.aspose.slides.internal.k0r.j4)var1.l6().n5(447);
         if (var2 == null) {
            var1.l6().n5(var2 = new com.aspose.slides.internal.k0r.j4());
         }

         var2.x8(var0 == 1);
      }
   }
}
