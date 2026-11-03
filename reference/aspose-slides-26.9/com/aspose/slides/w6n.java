package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;

class w6n {
   static void u3(v5s var0) {
      a9x var1 = var0.a6();
      Shape var2;
      if (var1.m1() != null) {
         var2 = (Shape)var1.m1();
      } else {
         var2 = var1.t9().n5();
         var1.n5(var2);
      }

      var2.u3(var0.t2());
      var2.setAlternativeText("");
      n5(var0);
      a6(var0);
      n5(var2.k7(), var0.k5());
      l6(var0);
      o7.n5(var0);
   }

   private static void n5(v5s var0) {
      com.aspose.slides.internal.k0r.g6 var1 = var0.k5();
      if (var1.a6() != null) {
         Shape var2 = (Shape)var0.a6().m1();
         com.aspose.slides.internal.k0r.v8 var3 = com.aspose.slides.internal.v6g.k5.n5(var1.a6().l6().n5(897), com.aspose.slides.internal.k0r.v8.class);
         if (var3 != null) {
            n5(var2, var3);
         }

         com.aspose.slides.internal.k0r.v8 var4 = com.aspose.slides.internal.v6g.k5.n5(var1.a6().l6().n5(896), com.aspose.slides.internal.k0r.v8.class);
         if (var4 != null) {
            l6(var2, var4);
         }

         com.aspose.slides.internal.k0r.z5 var5 = com.aspose.slides.internal.v6g.k5.n5(var1.a6().l6().n5(959), com.aspose.slides.internal.k0r.z5.class);
         if (var5 != null) {
            var2.setHidden((var5.j5() & 4294967295L & 2L & 4294967295L) != 0L);
         }
      }
   }

   private static void n5(Shape var0, com.aspose.slides.internal.k0r.v8 var1) {
      String var2 = n5(var1.l6());
      var0.setAlternativeText(com.aspose.slides.internal.n8e.v4.l6(var2));
   }

   private static void l6(Shape var0, com.aspose.slides.internal.k0r.v8 var1) {
      String var2 = n5(var1.l6());
      if (var2 != null) {
         var0.setName(var2);
      }
   }

   static void a6(v5s var0) {
      com.aspose.slides.internal.k0r.c9 var1 = var0.k5().s7();
      if (var1 != null) {
         a9x var2 = var0.a6();
         Shape var3 = (Shape)var2.m1();
         if (var1.c8() != null) {
            com.aspose.slides.internal.k0r.k6 var4 = var1.c8().l6();
            if (var4 != null) {
               var3.setHyperlinkMouseOver(s6h.n5(var4, var0.a6()));
            }
         }

         if (var1.h0() != null) {
            com.aspose.slides.internal.k0r.k6 var5 = var1.h0().l6();
            if (var5 != null) {
               var3.setHyperlinkClick(s6h.n5(var5, var0.a6()));
            }
         }

         if (var1.u9() != null && !var3.isGrouped()) {
            com.aspose.slides.internal.k0r.n5 var6 = var1.u9().l6();
            if ((var6.t2() & 255) != 0) {
               var0.u3().z8().addItem(var3, var1.u9());
            }
         }

         u5b.n5(var3.getCustomData(), var1.x8());
         if (var3.getCustomData().getTags().contains("AS_UNIQUEID")) {
            var3.u3(var3.getCustomData().getTags().get_Item("AS_UNIQUEID"));
            var3.getCustomData().getTags().remove("AS_UNIQUEID");
         }
      }
   }

   protected static void n5(b1b var0, com.aspose.slides.internal.k0r.g6 var1) {
      var0.n5(var1.u3());
      var0.n5(var1.a6());
      var0.n5(var1.u9());
      var0.n5(var1.h0());
      if (var1.s7() != null) {
         n5(var0, var1.s7());
      }
   }

   private static void n5(b1b var0, com.aspose.slides.internal.k0r.c9 var1) {
      if (var0 == null) {
         throw new ArgumentNullException("unsupportedProps");
      }

      if (var1 == null) {
         throw new ArgumentNullException("clientData");
      }

      var0.n5(var1.l6());
      var0.n5(var1.u3());
      var0.n5(var1.c8());
      var0.n5(var1.t9());
      var0.n5(var1.z1());
      var0.n5(var1.t4());
      var0.n5(var1.q0());
      if (var1.u9() != null) {
         var0.n5(var1.u9().l6().l6());
         var0.l6(var1.u9().l6().k5());
         var0.u3(var1.u9().l6().y4());
      }

      if (var1.h0() != null) {
         var0.n5(var1.h0().u3());
      }

      if (var1.x8() != null) {
         if (var1.x8().u3() != null) {
            var0.n5(var1.x8().u3().l6());
         }

         if (var1.x8().a6() != null) {
            var0.n5(var1.x8().a6().l6());
         }
      }
   }

   private static void l6(v5s var0) {
      com.aspose.slides.internal.k0r.g6 var1 = var0.k5();
      if (var1 != null) {
         v0q.n5(var0);
         Shape var2 = (Shape)var0.a6().m1();
         e4c var3 = new e4c();
         e4c var4 = new e4c();
         x4t var5 = new x4t();
         e4c[] var6 = new e4c[]{var3};
         e4c[] var7 = new e4c[]{var4};
         x4t[] var8 = new x4t[]{var5};
         w9v.n5(var1, var6, var7, var8);
         var6[0].l6(var3);
         var7[0].l6(var4);
         var8[0].n5(var5);
         var2.n5(var3.u9(), var4.u9(), var5.n5());
      }
   }

   static byte[] n5(String var0) {
      if (com.aspose.slides.ms.System.d1.n5(var0)) {
         return null;
      }

      byte[] var1 = com.aspose.slides.internal.l7h.j5.z1().l6(com.aspose.slides.ms.System.d1.c8(var0));
      byte[] var2 = new byte[var1.length + 2];
      com.aspose.slides.ms.System.y4.n5(com.aspose.slides.ms.System.u3.n5((Object)(var1)), 0, com.aspose.slides.ms.System.u3.n5((Object)(var2)), 0, var1.length);
      return var2;
   }

   static String n5(byte[] var0) {
      if (var0 != null && var0.length != 0) {
         com.aspose.slides.internal.l7h.t1 var1 = new com.aspose.slides.internal.l7h.t1();
         char[] var2 = var1.n5(var0);
         if (var2 != null && var2.length > 0) {
            return var2[var2.length - 1] == 0 ? com.aspose.slides.ms.System.d1.n5(var2, 0, var2.length - 1) : com.aspose.slides.ms.System.d1.n5(var2);
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   static void n5(y6z var0) {
      Control var1 = var0.t2();
      g6o var2 = var0.a6().n5();
      com.aspose.slides.internal.k0r.q5 var3 = var0.z3();
      n5(var3, var1.getFrame(), true, false, false);
      com.aspose.slides.internal.k0r.p1 var4 = var3.u3();
      var4.n5(201);
      var4.n3(true);
      com.aspose.slides.internal.k0r.r3 var5 = var0.z8();
      var5.l6().l6(new com.aspose.slides.internal.k0r.z5(127, 262144L));
      if (var1.getSubstitutePictureFormat() != null) {
         s4q.n5((PictureFillFormat)var1.getSubstitutePictureFormat(), var5, var2);
         if (var5.l6().n5(319) == null) {
            com.aspose.slides.internal.k0r.w2 var6 = new com.aspose.slides.internal.k0r.w2();
            var5.l6().l6(var6);
         }
      }

      if (var1.l6().n3() != null) {
         n5(var5, var1.l6().n3());
      }

      IShapeFrame var9 = var1.getFrame();
      x4t var7 = new x4t();
      var7.l6 = 0.0F;
      var7.u3 = var9.getFlipH() == 1;
      var7.k5 = var9.getFlipV() == 1;
      n5(var3, var9, var7);
      com.aspose.slides.internal.k0r.t5 var8 = new com.aspose.slides.internal.k0r.t5();
      var3.s7().n5(var8);
      var8.n5(h6x.n5(var1, var0));
      var0.c8();
   }

   static void k5(k1z var0) {
      g6o var1 = var0.a6().n5();
      Shape var2 = var0.s7();
      com.aspose.slides.internal.k0r.q5 var3 = var0.z3();
      OleObjectFrame var4 = com.aspose.slides.internal.v6g.k5.n5(var2, OleObjectFrame.class);
      n5(var3, var2.getFrame(), var4 != null, com.aspose.slides.internal.v6g.k5.l6(var2, IConnector.class), !var0.u9());
      v8r.l6(var0);
      com.aspose.slides.internal.k0r.r3 var5 = var0.z8();
      var5.l6().l6(new com.aspose.slides.internal.k0r.z5(127, 262144L));
      com.aspose.slides.internal.k0r.a9 var6 = var0.j5();
      if (com.aspose.slides.internal.v6g.k5.l6(var2, SmartArt.class)) {
         com.aspose.slides.internal.k0r.t3 var7 = new com.aspose.slides.internal.k0r.t3();
         var7.n5(true);
         var6.l6().l6(var7);
      }

      o7.n5(var0);
      v8r.n5(var0);
      if (var2.getHidden()) {
         com.aspose.slides.internal.k0r.d1 var14 = new com.aspose.slides.internal.k0r.d1();
         var5.l6().l6(var14);
         var14.n5(true);
         var14.u3(true);
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var2, SmartArt.class)) {
         com.aspose.slides.internal.k0r.z5 var15 = new com.aspose.slides.internal.k0r.z5(260, true, 0L);
         var5.l6().l6(var15);
         String var8 = n5(var2);
         SvgImage var9 = new SvgImage(var8);
         IPPImage var10 = var2.getPresentation().getImages().addImage(var9);
         var1.n5(var15, var10);
      } else {
         u9(var0);
      }

      boolean var16 = com.aspose.slides.internal.v6g.k5.l6(var2, GeometryShape.class) && ((GeometryShape)var2).getShapeStyle() != null;
      IFillFormatEffectiveData var20 = var2.z3();
      FillFormat var17;
      if (var20 == null || !var16 && var2.getFillFormat().getFillType() != -1) {
         var17 = (FillFormat)var2.getFillFormat();
      } else {
         var17 = new FillFormat(var2);
         var17.n5(var20);
      }

      m3e.n5(var17, var0);
      ILineFormatEffectiveData var21 = var2.q0();
      LineFormat var18;
      if (var21 == null || !var16 && var2.getLineFormat().getFillFormat().getFillType() != -1) {
         var18 = (LineFormat)var2.getLineFormat();
      } else {
         var18 = new LineFormat(var2);
         var18.n5(var21);
      }

      GeometryShape var22 = com.aspose.slides.internal.v6g.k5.n5(var2, GeometryShape.class);
      byte var25 = var22 != null ? s1f.l6(var22.getShapeType()) : -1;
      if (var18 != null) {
         r9a.n5(var18, var3, var25, var1);
      }

      f7k.l6(var0);
      f7k.n5(var0);
      d3r.n5(var2.getThreeDFormat(), var5, var6, var1);
      float var19 = var2.R_().k5();
      if (com.aspose.slides.ms.System.q1.n5(var2.R_().k5()) > 1.0E-6) {
         if (var2.R_().u3() != var2.R_().a6()) {
            var19 = -var19;
         }

         if (var19 < 0.0F) {
            var19 += 360.0F;
         }

         com.aspose.slides.internal.k0r.z5 var23 = new com.aspose.slides.internal.k0r.z5(
            4, false, ((com.aspose.slides.internal.v6g.k5.a6(var19, 13) & 4294967295L) % 360L & 4294967295L) << 16 & 4294967295L
         );
         var5.l6().l6(var23);
      }

      if (var2.k7().n3() != null) {
         n5(var5, var2.k7().n3());
      }

      u3(var0);
      a6(var0);
      o4f var24 = var2.R_();
      x4t var26 = new x4t();
      var26.l6 = var19;
      var26.u3 = var24.u3() == 1;
      var26.k5 = var24.a6() == 1;
      if (!var0.u9()) {
         n5(var3, var24.n5().u9(), var2.z7().u9(), var26.n5());
      } else {
         n5(var3, var2.getFrame(), var26.n5());
      }

      com.aspose.slides.internal.k0r.c9 var11 = var0.w1();
      if (var4 != null) {
         com.aspose.slides.internal.k0r.t5 var12 = new com.aspose.slides.internal.k0r.t5();
         var11.n5(var12);
         var12.n5(h6x.n5(var4, var0));
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var2, VideoFrame.class)) {
         com.aspose.slides.internal.k0r.c5 var27 = var1.l6().a6().h0().h0();
         y7i.n5(com.aspose.slides.internal.v6g.k5.n5(var2, VideoFrame.class), var27, var0);
         com.aspose.slides.internal.k0r.t5 var13 = new com.aspose.slides.internal.k0r.t5();
         var13.n5((var27.l6().l6() & 4294967295L) - 1L & 4294967295L);
         var11.n5(var13);
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var2, AudioFrame.class)) {
         com.aspose.slides.internal.k0r.c5 var28 = var1.l6().a6().h0().h0();
         a7.n5(com.aspose.slides.internal.v6g.k5.n5(var2, AudioFrame.class), var28, var0);
      }

      u8j.n5(var0);
      if (var2.getHyperlinkClick() != null) {
         s6h.n5((Hyperlink)var2.getHyperlinkClick(), true, var0);
      }

      if (var2.getHyperlinkMouseOver() != null) {
         s6h.n5((Hyperlink)var2.getHyperlinkMouseOver(), false, var0);
      }

      n5(var0);
   }

   static void u3(k1z var0) {
      Shape var1 = var0.q0();
      if (var1 == null) {
         var1 = var0.s7();
      }

      if (var1 != null) {
         com.aspose.slides.internal.k0r.r3 var2 = var1.k7().n3();
         com.aspose.slides.internal.k0r.h6 var3 = null;
         if (!com.aspose.slides.ms.System.d1.n5(var1.getName())) {
            byte[] var4 = n5(var1.getName());
            var3 = new com.aspose.slides.internal.k0r.h6(896, var4);
         } else if (var2 != null) {
            var3 = com.aspose.slides.internal.v6g.k5.n5(var2.l6().n5(959), com.aspose.slides.internal.k0r.h6.class);
         }

         if (var3 != null) {
            com.aspose.slides.internal.k0r.r3 var6 = var0.z8();
            var6.l6().l6(var3);
            com.aspose.slides.internal.k0r.d1 var5 = com.aspose.slides.internal.v6g.k5.n5(var6.l6().n5(959), com.aspose.slides.internal.k0r.d1.class);
            if (var5 == null) {
               var5 = new com.aspose.slides.internal.k0r.d1();
               var6.l6().l6(var5);
            }

            var5.n5(true);
         }
      }
   }

   static void a6(k1z var0) {
      Shape var1 = var0.q0();
      if (var1 == null) {
         var1 = var0.s7();
      }

      if (var1 != null) {
         if (!com.aspose.slides.ms.System.d1.n5(var1.getAlternativeText())) {
            byte[] var2 = n5(var1.getAlternativeText());
            com.aspose.slides.internal.k0r.v8 var3 = new com.aspose.slides.internal.k0r.v8(897, var2);
            var0.z8().l6().l6(var3);
         }
      }
   }

   static void u9(k1z var0) {
      PictureFillFormat var1 = null;
      PictureFrame var2 = com.aspose.slides.internal.v6g.k5.n5(var0.s7(), PictureFrame.class);
      if (var2 == null) {
         OleObjectFrame var3 = com.aspose.slides.internal.v6g.k5.n5(var0.s7(), OleObjectFrame.class);
         if (var3 == null) {
            return;
         }

         var1 = var3.l6;
         PPImage var4 = (PPImage)var1.getPicture().getImage();
         if (var3.isObjectIcon() && var4 != null) {
            var1 = var3.z8();
         }
      } else {
         var1 = (PictureFillFormat)var2.getPictureFormat();
      }

      if (var1 != null) {
         com.aspose.slides.internal.k0r.r3 var7 = var0.z8();
         g6o var8 = var0.u3().a6().n5();
         s4q.n5(var1, var7, var8);
         if (var7.l6().n5(319) == null) {
            com.aspose.slides.internal.k0r.w2 var5 = new com.aspose.slides.internal.k0r.w2();
            var7.l6().l6(var5);
         }
      }
   }

   static String n5(Shape var0) {
      return n5(var0, new com.aspose.slides.internal.o9b.y1(var0.getX(), var0.getY(), var0.getWidth(), var0.getHeight()));
   }

   static String n5(Shape var0, com.aspose.slides.internal.o9b.y1 var1) {
      String var2 = "";
      com.aspose.slides.internal.z0k.e2 var3 = new com.aspose.slides.internal.z0k.e2();

      try {
         q4b var4 = new q4b(
            com.aspose.slides.internal.v6g.k5.u3(var1.s7(), 13),
            com.aspose.slides.internal.v6g.k5.u3(var1.k5(), 13),
            72.0F,
            72.0F,
            72.0F,
            new SVGOptions(),
            null
         );

         try {
            var4.n5(-var1.x8(), -var1.n3());
            f1f var5 = new f1f(
               var0.getSlide(),
               new com.aspose.slides.internal.t4r.n5<>(com.aspose.slides.internal.k9.h0.class, com.aspose.slides.internal.k9.u9.class),
               new y4x(),
               null
            );
            var4.n5(var5);
            var0.e5().n5(var4, var5, InterruptionToken.getNone());
            var4.n5(var3, true);
         } finally {
            if (var4 != null) {
               var4.dispose();
            }
         }

         var3.setPosition(0L);
         com.aspose.slides.internal.z0k.m3 var22 = new com.aspose.slides.internal.z0k.m3(var3);

         try {
            var2 = var22.c8();
         } finally {
            if (var22 != null) {
               var22.dispose();
            }
         }
      } finally {
         if (var3 != null) {
            var3.dispose();
         }
      }

      return var2;
   }

   private static void n5(com.aspose.slides.internal.k0r.r3 var0, com.aspose.slides.internal.k0r.r3 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("source");
      }

      com.aspose.slides.internal.k0r.w8 var2 = var1.l6();
      com.aspose.slides.internal.k0r.p6 var3 = com.aspose.slides.internal.v6g.k5.n5(var2.n5(255), com.aspose.slides.internal.k0r.p6.class);
      if (var3 != null) {
         var0.l6().l6(var3);
      }

      com.aspose.slides.internal.k0r.y8 var4 = com.aspose.slides.internal.v6g.k5.n5(var2.n5(197), com.aspose.slides.internal.k0r.y8.class);
      if (var4 != null) {
         var0.l6().l6(var4);
      }

      com.aspose.slides.internal.k0r.i6 var5 = com.aspose.slides.internal.v6g.k5.n5(var2.n5(192), com.aspose.slides.internal.k0r.i6.class);
      if (var5 != null) {
         var0.l6().l6(var5);
      }

      com.aspose.slides.internal.k0r.j4 var6 = com.aspose.slides.internal.v6g.k5.n5(var2.n5(447), com.aspose.slides.internal.k0r.j4.class);
      if (!var0.l6().l6(447) && var6 != null) {
         var0.l6().l6(var6);
      }

      com.aspose.slides.internal.k0r.g7 var7 = com.aspose.slides.internal.v6g.k5.n5(var2.n5(385), com.aspose.slides.internal.k0r.g7.class);
      if (!var0.l6().l6(385) && var7 != null) {
         var0.l6().l6(var7);
      }

      com.aspose.slides.internal.k0r.a7 var8 = com.aspose.slides.internal.v6g.k5.n5(var2.n5(511), com.aspose.slides.internal.k0r.a7.class);
      if (!var0.l6().l6(511) && var8 != null) {
         var0.l6().l6(var8);
         com.aspose.slides.internal.k0r.a7 var9 = com.aspose.slides.internal.v6g.k5.n5(var0.l6().n5(511), com.aspose.slides.internal.k0r.a7.class);
         var9.k5(true);
      }

      com.aspose.slides.internal.k0r.a8 var11 = com.aspose.slides.internal.v6g.k5.n5(var2.n5(191), com.aspose.slides.internal.k0r.a8.class);
      if (var11 != null) {
         var0.l6().l6(var11);
      }

      com.aspose.slides.internal.k0r.f4 var10 = com.aspose.slides.internal.v6g.k5.n5(var2.n5(133), com.aspose.slides.internal.k0r.f4.class);
      if (var10 != null) {
         var0.l6().l6(var10);
      }
   }

   private static void n5(com.aspose.slides.internal.k0r.q5 var0, e4c var1, e4c var2, x4t var3) {
      double var4;
      double var6;
      double var8;
      double var10;
      if ((!(var3.l6 >= 45.0F) || !(var3.l6 < 135.0F)) && (!(var3.l6 >= 225.0F) || !(var3.l6 < 315.0F))) {
         var4 = var1.n5 * 12700.0;
         var6 = var1.l6 * 12700.0;
         var8 = var2.n5 * 12700.0;
         var10 = var2.l6 * 12700.0;
         var0.u3().h0(var3.u3);
         var0.u3().c8(var3.k5);
      } else {
         var4 = (var1.n5 - (var2.l6 - var2.n5) / 2.0) * 12700.0;
         var6 = (var1.l6 - (var2.n5 - var2.l6) / 2.0) * 12700.0;
         var8 = var2.l6 * 12700.0;
         var10 = var2.n5 * 12700.0;
         var0.u3().h0(var3.u3);
         var0.u3().c8(var3.k5);
      }

      com.aspose.slides.internal.k0r.v7 var12 = new com.aspose.slides.internal.k0r.v7();
      var12.n5(
         new com.aspose.slides.internal.o9b.y2(
            com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var4), 14),
            com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var6), 14),
            com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var8), 14),
            com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var10), 14)
         )
      );
      var0.n5(var12);
   }

   private static void n5(com.aspose.slides.internal.k0r.q5 var0, IShapeFrame var1, x4t var2) {
      float var3 = var1.getX();
      float var4 = var1.getY();
      float var5 = var1.getWidth();
      float var6 = var1.getHeight();
      double var7;
      double var9;
      double var11;
      double var13;
      if ((!(var2.l6 >= 45.0F) || !(var2.l6 < 135.0F)) && (!(var2.l6 >= 225.0F) || !(var2.l6 < 315.0F))) {
         var7 = var3 * 8.0F;
         var9 = var4 * 8.0F;
         var11 = var5 * 8.0F;
         var13 = var6 * 8.0F;
         var0.u3().h0(var2.u3);
         var0.u3().c8(var2.k5);
      } else {
         var7 = (var3 - (var6 - var5) / 2.0F) * 8.0F;
         var9 = (var4 - (var5 - var6) / 2.0F) * 8.0F;
         var11 = var6 * 8.0F;
         var13 = var5 * 8.0F;
         var0.u3().h0(var2.u3);
         var0.u3().c8(var2.k5);
      }

      com.aspose.slides.internal.k0r.t7 var15 = new com.aspose.slides.internal.k0r.t7();
      var15.n5(
         new com.aspose.slides.internal.o9b.y2(
            com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var7), 14),
            com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var9), 14),
            com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var11), 14),
            com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var13), 14)
         )
      );
      var0.n5(var15);
   }

   static void n5(com.aspose.slides.internal.k0r.q5 var0, IShapeFrame var1, boolean var2, boolean var3, boolean var4) {
      com.aspose.slides.internal.k0r.p1 var5 = var0.u3();
      var5.n5(false);
      var5.l6(var4);
      var5.k5(false);
      var5.u3(false);
      var5.a6(var2);
      var5.h0(var1.getFlipH() == 1);
      var5.c8(var1.getFlipV() == 1);
      var5.t2(var3);
      var5.s7(true);
   }

   private static void n5(k1z var0) {
      g6o var1 = var0.u3().a6().n5();
      com.aspose.slides.internal.k0r.c9 var2 = var0.w1();
      Shape var3 = var0.s7();
      if (var1.n5().k5() || var3.getCustomData().getTags().size() != 0) {
         com.aspose.slides.internal.k0r.k9m var4 = new com.aspose.slides.internal.k0r.k9m();
         if (var1.n5().k5()) {
            com.aspose.slides.internal.k0r.h3 var5 = new com.aspose.slides.internal.k0r.h3();
            var4.e2().addItem(var5);
            com.aspose.slides.internal.k0r.z1 var6 = new com.aspose.slides.internal.k0r.z1("AS_UNIQUEID", (short)0);
            var5.e2().addItem(var6);
            com.aspose.slides.internal.k0r.z1 var7 = new com.aspose.slides.internal.k0r.z1(
               com.aspose.slides.ms.System.l4.n5(var3.getUniqueId(), com.aspose.slides.internal.x7n.l6.k5()), (short)1
            );
            var5.e2().addItem(var7);
         }

         String[] var10 = var3.getCustomData().getTags().getNamesOfTags();

         for (int var11 = 0; var11 < var10.length; var11++) {
            com.aspose.slides.internal.k0r.h3 var12 = new com.aspose.slides.internal.k0r.h3();
            var4.e2().addItem(var12);
            com.aspose.slides.internal.k0r.z1 var8 = new com.aspose.slides.internal.k0r.z1(var10[var11], (short)0);
            var12.e2().addItem(var8);
            com.aspose.slides.internal.k0r.z1 var9 = new com.aspose.slides.internal.k0r.z1(var3.getCustomData().getTags().get_Item(var10[var11]), (short)1);
            var12.e2().addItem(var9);
         }

         if (var4.e2().size() > 0) {
            var2.n5(var4);
         }
      }
   }
}
