package com.aspose.slides;

class g3e {
   static void n5(ISlidesPicture var0, a9x var1) {
      com.aspose.slides.internal.k0r.q5 var2 = var1.n3();
      com.aspose.slides.internal.k0r.r3 var3 = var2.a6();
      if (var3 != null && var3.l6() != null) {
         com.aspose.slides.internal.k0r.z5 var4 = com.aspose.slides.internal.v6g.k5.n5(var3.l6().n5(390), com.aspose.slides.internal.k0r.z5.class);
         com.aspose.slides.internal.k0r.z5 var5 = com.aspose.slides.internal.v6g.k5.n5(var3.l6().n5(386), com.aspose.slides.internal.k0r.z5.class);
         if (var4 != null && var5 != null) {
            var0.getImageTransform().addAlphaModulateFixedEffect((float)(var5.j5() & 4294967295L) * 100.0F / 65536.0F);
         }

         com.aspose.slides.internal.k0r.z5 var6 = com.aspose.slides.internal.v6g.k5.n5(var3.l6().n5(319), com.aspose.slides.internal.k0r.z5.class);
         if (var6 != null) {
            switch ((int)(var6.j5() & 4294967295L & 6L & 4294967295L)) {
               case 4:
                  var0.getImageTransform().addGrayScaleEffect();
                  break;
               case 6:
                  var0.getImageTransform().addGrayScaleEffect();
                  var0.getImageTransform().addBiLevelEffect(50.0F);
            }
         }

         com.aspose.slides.internal.k0r.z5 var7 = com.aspose.slides.internal.v6g.k5.n5(var3.l6().n5(263), com.aspose.slides.internal.k0r.z5.class);
         if (var7 != null) {
            com.aspose.slides.internal.o9b.c8 var8 = com.aspose.slides.internal.n8e.v4.n5(var7.j5()).o8();
            com.aspose.slides.internal.o9b.c8 var9 = com.aspose.slides.internal.o9b.c8.n5(0, var8.o8()).o8();
            IColorChange var10 = var0.getImageTransform().addColorChangeEffect();
            ((ColorFormat)var10.getFromColor()).n5(var8.o8());
            ((ColorFormat)var10.getToColor()).n5(var9.o8());
         }

         double var11 = 0.0;
         com.aspose.slides.internal.k0r.z5 var33 = com.aspose.slides.internal.v6g.k5.n5(var3.l6().n5(265), com.aspose.slides.internal.k0r.z5.class);
         if (var33 != null) {
            var11 = com.aspose.slides.ms.System.q1.u3(com.aspose.slides.internal.n8e.y2.n5(var33.j5()) * 200.0);
         }

         double var13 = 0.0;
         com.aspose.slides.internal.k0r.z5 var15 = com.aspose.slides.internal.v6g.k5.n5(var3.l6().n5(264), com.aspose.slides.internal.k0r.z5.class);
         if (var15 != null) {
            var13 = n5(var15.j5());
         }

         if (var13 != 0.0 || var11 != 0.0) {
            var0.getImageTransform().addLuminanceEffect((float)var11, (float)var13);
         }

         com.aspose.slides.internal.k0r.z5 var16 = com.aspose.slides.internal.v6g.k5.n5(var3.l6().n5(282), com.aspose.slides.internal.k0r.z5.class);
         com.aspose.slides.internal.k0r.z5 var17 = com.aspose.slides.internal.v6g.k5.n5(var3.l6().n5(283), com.aspose.slides.internal.k0r.z5.class);
         if (var16 == null) {
            com.aspose.slides.internal.k0r.a9 var18 = var2.h0();
            if (var18 != null && var18.l6() != null) {
               com.aspose.slides.internal.k0r.j4 var19 = com.aspose.slides.internal.v6g.k5.n5(var18.l6().n5(447), com.aspose.slides.internal.k0r.j4.class);
               if (var19 != null && var19.u3()) {
                  var16 = com.aspose.slides.internal.v6g.k5.n5(var18.l6().n5(282), com.aspose.slides.internal.k0r.z5.class);
                  var17 = com.aspose.slides.internal.v6g.k5.n5(var18.l6().n5(283), com.aspose.slides.internal.k0r.z5.class);
               }
            }
         }

         if (var16 != null) {
            IDuotone var42 = var0.getImageTransform().addDuotoneEffect();
            u0b.n5(var42.getColor1(), var2, null, var16.j5(), 386, 8);
            if (var17 != null) {
               u0b.n5(var42.getColor2(), var2, null, var17.j5(), 386, 8);
            } else {
               ((ColorFormat)var42.getColor2()).n5(com.aspose.slides.internal.o9b.c8.w4().o8());
            }
         }
      }

      if (var2.s7() != null && var2.s7().s7() != null) {
         com.aspose.slides.internal.k0r.k0t var22 = var2.s7().s7();
         byte[] var23 = var22.l6();
         if (var23 != null && var23.length >= 12) {
            int var24 = com.aspose.slides.internal.n8e.y2.l6(var23, 2);
            int var25 = com.aspose.slides.internal.n8e.y2.l6(var23, 4);
            if (var24 <= 64 && var25 <= 64 && (var24 + var25) * 44 + 12 == var23.length) {
               int var26 = 12;
               int var32 = var24;

               for (int var34 = 0; var34 < 2; var34++) {
                  for (; var32 > 0; var32--) {
                     int var43 = com.aspose.slides.internal.n8e.y2.l6(var23, var26);
                     var26 += 2;
                     if ((var43 & 1) != 0) {
                        byte var36 = var23[var26 + 1];
                        byte var38 = var23[var26 + 3];
                        byte var40 = var23[var26 + 5];
                        var26 += 6;
                        long var35 = com.aspose.slides.internal.n8e.y2.u3(var23, var26);
                        var26 += 4;
                        com.aspose.slides.internal.o9b.c8 var44 = com.aspose.slides.internal.o9b.c8.u3.o8();
                        int var20 = -1;
                        if ((var35 & 65535L) < 8L) {
                           var20 = s1f.u3((int)(var35 & 65535L));
                        } else {
                           com.aspose.slides.internal.o9b.c8.n5(var36 & 255, var38 & 255, var40 & 255).n5(var44);
                        }

                        var36 = var23[var26 + 1];
                        var38 = var23[var26 + 3];
                        var40 = var23[var26 + 5];
                        var26 += 6;
                        var26 += 4;
                        var26 += 22;
                        com.aspose.slides.internal.o9b.c8 var21 = com.aspose.slides.internal.o9b.c8.n5(var36 & 255, var38 & 255, var40 & 255).o8();
                        if (var20 != -1) {
                           var0.getImageTransform().addItem(new ColorChange(var21.o8(), var20, false, null));
                        } else {
                           var0.getImageTransform().addItem(new ColorChange(var21.o8(), var44.o8(), false, null));
                        }
                     } else {
                        var26 += 42;
                     }
                  }

                  var32 = var25;
               }
            }
         }
      }
   }

   static void n5(IImageTransformOperationCollection var0, com.aspose.slides.internal.k0r.r3 var1, g6o var2) {
      int var3 = -1;

      for (int var4 = 0; var4 < var0.size(); var4++) {
         ColorChange var5 = com.aspose.slides.internal.v6g.k5.n5(var0.get_Item(var4), ColorChange.class);
         if (var5 != null) {
            long var6 = com.aspose.slides.internal.n8e.v4.n5(((ColorFormat)var5.getFromColor()).u3().o8());
            long var8 = com.aspose.slides.internal.n8e.v4.n5(((ColorFormat)var5.getToColor()).u3().o8());
            if (var6 == var8 && (((ColorFormat)var5.getToColor()).u3().s7() & 255) == 0) {
               var3 = (int)var6;
               break;
            }
         }
      }

      if (var3 > -1) {
         com.aspose.slides.internal.k0r.z5 var23 = new com.aspose.slides.internal.k0r.z5(263, false, var3 & 4294967295L);
         var1.l6().n5(var23);
      }

      long var10 = 0L;
      long var24 = 65536L;

      for (int var12 = 0; var12 < var0.size(); var12++) {
         Luminance var13 = com.aspose.slides.internal.v6g.k5.n5(var0.get_Item(var12), Luminance.class);
         if (var13 != null) {
            var10 = com.aspose.slides.internal.n8e.y2.n5(var13.u3() / 200.0F);
            var24 = n5(var13.a6());
            break;
         }
      }

      if ((var10 & 4294967295L) != 0L) {
         com.aspose.slides.internal.k0r.z5 var25 = new com.aspose.slides.internal.k0r.z5(265, false, var10);
         var1.l6().n5(var25);
      }

      if ((var24 & 4294967295L) != 65536L) {
         com.aspose.slides.internal.k0r.z5 var26 = new com.aspose.slides.internal.k0r.z5(264, false, var24);
         var1.l6().n5(var26);
      }

      for (int var27 = 0; var27 < var0.size(); var27++) {
         IAlphaModulateFixed var29 = com.aspose.slides.internal.v6g.k5.n5(var0.get_Item(var27), AlphaModulateFixed.class);
         if (var29 != null && var29.getAmount() < 100.0F) {
            com.aspose.slides.internal.k0r.z5 var14 = new com.aspose.slides.internal.k0r.z5(
               386, false, com.aspose.slides.internal.v6g.k5.a6(var29.getAmount() * 65536.0F / 100.0F, 13) & 4294967295L & 65535L & 4294967295L
            );
            var1.l6().l6(var14);
            break;
         }
      }

      boolean var28 = false;
      boolean var30 = false;
      long var15 = 16777215L;
      long var17 = 16777215L;

      for (int var19 = 0; var19 < var0.size(); var19++) {
         IDuotone var20 = com.aspose.slides.internal.v6g.k5.n5(var0.get_Item(var19), IDuotone.class);
         if (var20 != null) {
            var15 = u0b.n5(var20.getColor1(), var2);
            var17 = u0b.n5(var20.getColor2(), var2);
            if ((var15 & 4294967295L) != 16777215L) {
               com.aspose.slides.internal.k0r.z5 var21 = new com.aspose.slides.internal.k0r.z5(282, false, var15);
               var1.l6().n5(var21);
               if ((var17 & 4294967295L) != 16777215L) {
                  com.aspose.slides.internal.k0r.z5 var22 = new com.aspose.slides.internal.k0r.z5(283, false, var17);
                  var1.l6().n5(var22);
               }
            }
         }

         if (com.aspose.slides.internal.v6g.k5.l6(var0.get_Item(var19), GrayScale.class)) {
            var28 = true;
         }

         if (com.aspose.slides.internal.v6g.k5.l6(var0.get_Item(var19), BiLevel.class)) {
            var30 = true;
         }
      }

      if (var28) {
         com.aspose.slides.internal.k0r.w2 var33 = com.aspose.slides.internal.v6g.k5.n5(var1.l6().n5(319), com.aspose.slides.internal.k0r.w2.class);
         if (var33 == null) {
            var33 = new com.aspose.slides.internal.k0r.w2();
            var1.l6().n5(var33);
         }

         var33.u9(true);
         if (var30) {
            var33.h0(true);
         }
      }
   }

   private static double n5(long var0) {
      if ((var0 & 4294967295L) == 65536L) {
         return 0.0;
      } else if ((var0 & 4294967295L) == 0L) {
         return -100.0;
      } else {
         return (var0 & 4294967295L) > 65536L
            ? com.aspose.slides.ms.System.q1.u3(100.0 - 6553600.0 / (var0 & 4294967295L))
            : com.aspose.slides.ms.System.q1.u3((float)((var0 & 4294967295L) * 100L & 4294967295L) / 65536.0F - 100.0F);
      }
   }

   private static long n5(double var0) {
      if (var0 == 0.0) {
         return 65536L;
      } else if (var0 == 100.0) {
         return 2147483647L;
      } else {
         return var0 > 0.0
            ? com.aspose.slides.internal.v6g.k5.a6(com.aspose.slides.ms.System.q1.u3(6553600.0 / (100.0 - var0)), 14)
            : com.aspose.slides.internal.v6g.k5.a6(com.aspose.slides.ms.System.q1.u3((var0 + 100.0) * 65536.0 / 100.0), 14);
      }
   }
}
