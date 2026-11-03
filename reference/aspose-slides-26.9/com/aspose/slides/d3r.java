package com.aspose.slides;

class d3r {
   static void n5(IThreeDFormat var0, boolean var1, a9x var2) {
      com.aspose.slides.internal.k0r.r3 var3 = var2.n3().a6();
      Shape var4 = (Shape)var2.m1();
      com.aspose.slides.internal.k0r.w8 var5 = var3 != null ? var3.l6() : new com.aspose.slides.internal.k0r.w8();
      com.aspose.slides.internal.k0r.r1 var6 = com.aspose.slides.internal.v6g.k5.n5(var5.n5(703), com.aspose.slides.internal.k0r.r1.class);
      if (var6 != null && var6.l6() && var6.k5()) {
         com.aspose.slides.internal.k0r.z5 var7 = com.aspose.slides.internal.v6g.k5.n5(var5.n5(644), com.aspose.slides.internal.k0r.z5.class);
         com.aspose.slides.internal.k0r.z5 var8 = com.aspose.slides.internal.v6g.k5.n5(var5.n5(645), com.aspose.slides.internal.k0r.z5.class);
         com.aspose.slides.internal.k0r.z5 var9 = com.aspose.slides.internal.v6g.k5.n5(var5.n5(647), com.aspose.slides.internal.k0r.z5.class);
         com.aspose.slides.internal.k0r.z5 var10 = com.aspose.slides.internal.v6g.k5.n5(var5.n5(640), com.aspose.slides.internal.k0r.z5.class);
         com.aspose.slides.internal.k0r.z5 var11 = com.aspose.slides.internal.v6g.k5.n5(var5.n5(641), com.aspose.slides.internal.k0r.z5.class);
         com.aspose.slides.internal.k0r.z5 var12 = com.aspose.slides.internal.v6g.k5.n5(var5.n5(642), com.aspose.slides.internal.k0r.z5.class);
         com.aspose.slides.internal.k0r.z5 var13 = com.aspose.slides.internal.v6g.k5.n5(var5.n5(710), com.aspose.slides.internal.k0r.z5.class);
         com.aspose.slides.internal.k0r.z5 var14 = com.aspose.slides.internal.v6g.k5.n5(var5.n5(711), com.aspose.slides.internal.k0r.z5.class);
         com.aspose.slides.internal.k0r.z5 var15 = com.aspose.slides.internal.v6g.k5.n5(var5.n5(712), com.aspose.slides.internal.k0r.z5.class);
         com.aspose.slides.internal.k0r.z5 var16 = com.aspose.slides.internal.v6g.k5.n5(var5.n5(713), com.aspose.slides.internal.k0r.z5.class);
         g3o var17 = ((ThreeDFormat)var0).u3();
         int var18 = var7 != null ? (int)var7.j5() : 0;
         int var19 = -var18 + (var8 != null ? (int)var8.j5() : 457200);
         var0.setExtrusionHeight((var19 - 13500 - 13500) / 12700.0);
         var0.getBevelTop().setWidth(var1 ? 0.0 : 1.062992125984252);
         var0.getBevelTop().setHeight(var1 ? 0.0 : 1.062992125984252);
         var0.getBevelTop().setBevelType(0);
         var0.getBevelBottom().setWidth(var1 ? 0.0 : 1.062992125984252);
         var0.getBevelBottom().setHeight(var1 ? 0.0 : 1.062992125984252);
         var0.getBevelBottom().setBevelType(0);
         var0.setDepth(var18 / 12700.0);
         long var20 = 0L;
         long var22 = 65536L;
         long var24 = 5L;
         long var26 = 0L;
         long var28 = var10 != null ? var10.j5() : 0L;
         long var30 = var11 != null ? var11.j5() : 65536L;
         long var32 = var12 != null ? var12.j5() : 5L;
         long var34 = var16 != null ? var16.j5() : 0L;
         if ((var28 & 4294967295L) == 80000L && var30 == 65536L && var32 == 5L && var34 == 0L) {
            var0.setMaterial(5);
         } else if ((var28 & 4294967295L) == 80000L && (var30 & 4294967295L) == 43712L && var32 == 5L && var34 == 0L) {
            var0.setMaterial(4);
         } else if (var28 == 0L && (var30 & 4294967295L) == 0L && (var32 & 4294967295L) == 0L && (var34 & 4294967295L) == 1L) {
            var0.setMaterial(6);
         } else {
            var0.setMaterial(3);
         }

         if (var13 != null || var14 != null || var15 != null) {
            var2.y4()
               .a6()
               .n5()
               .a6()
               .n5(
                  com.aspose.slides.ms.System.d1.n5(new String[]{
                     "Deserialization of some ThreeDFormat ppt data (Style3Dc3DRotationCenterX, ..Y, ..Z)", " is not imlemented yet."
                  }),
                  3
               );
         }

         var4.getLineFormat().getFillFormat().setFillType((byte)0);
         ((ColorFormat)var0.getContourColor()).n5(((ColorFormat)var4.getFillFormat().getSolidFillColor()).u3().o8());
         if (var9 == null && var4.getFillFormat().getFillType() == 1) {
            ((ColorFormat)var0.getExtrusionColor()).n5(((ColorFormat)var4.getFillFormat().getSolidFillColor()).u3().o8());
         } else {
            u0b.n5(var0.getExtrusionColor(), var9 != null ? var9.j5() : 268435703L, 1.0);
         }

         g5.n5(var0.getCamera(), var3, var2.y4());
         z2t.n5(var0.getLightRig(), var3, var2.y4());
         com.aspose.slides.internal.k0r.a9 var36 = var2.n3().h0();
         j6.n5(var17.k5(), var3, var36);
      }
   }

   static void n5(IThreeDFormat var0, com.aspose.slides.internal.k0r.r3 var1, com.aspose.slides.internal.k0r.a9 var2, g6o var3) {
      com.aspose.slides.internal.k0r.w8 var4 = var1.l6();
      if (var0 == null) {
         for (int var15 = 640; var15 < 653; var15++) {
            var4.k5(var15);
         }

         var4.k5(703);

         for (int var16 = 704; var16 < 730; var16++) {
            var4.k5(var16);
         }

         var4.k5(767);
      } else {
         boolean var5 = false;
         com.aspose.slides.internal.k0r.r1 var6 = new com.aspose.slides.internal.k0r.r1();
         var6.n5(true);
         var6.u3(true);
         var4.l6(var6);
         com.aspose.slides.internal.k0r.h5 var7 = new com.aspose.slides.internal.k0r.h5();
         var4.l6(var7);
         g3o var8 = ((ThreeDFormat)var0).u3();
         if (((ThreeDFormat)var0).u9() != -1 || ((ThreeDFormat)var0).h0() != -1) {
            boolean[] var9 = new boolean[]{false};
            g5.n5(var0.getCamera(), var1, var9, var3);
            var5 = var9[0];
            var9[0] = var5;
            z2t.n5(var0.getLightRig(), var1, var9, var3);
            var5 = var9[0];
            j6.n5(var8.k5(), var1, var2, var3);
         }

         if (var0.getContourWidth() != 0.0 || var0.getExtrusionHeight() != 0.0 || ((ThreeDFormat)var0).c8() != -1 || ((ThreeDFormat)var0).t2() != -1) {
            if (!(com.aspose.slides.ms.System.q1.n5(var0.getBevelTop().getWidth() - 1.062992125984252) > 1.0E-6)
               && !(com.aspose.slides.ms.System.q1.n5(var0.getBevelTop().getHeight() - 1.062992125984252) > 1.0E-6)
               && var0.getBevelTop().getBevelType() == 0
               && !(com.aspose.slides.ms.System.q1.n5(var0.getBevelBottom().getWidth() - 1.062992125984252) > 1.0E-6)
               && !(com.aspose.slides.ms.System.q1.n5(var0.getBevelBottom().getHeight() - 1.062992125984252) > 1.0E-6)
               && var0.getBevelBottom().getBevelType() == 0) {
               int var17 = com.aspose.slides.internal.v6g.k5.u3(var0.getDepth() * 12700.0, 14);
               if (var17 != 0) {
                  var4.l6(new com.aspose.slides.internal.k0r.z5(644, var17 & 4294967295L));
               }

               long var10 = com.aspose.slides.internal.v6g.k5.a6(var0.getExtrusionHeight() * 12700.0 + 13500.0 + 13500.0 + var17, 14);
               if ((var10 & 4294967295L) != 457200L) {
                  var4.l6(new com.aspose.slides.internal.k0r.z5(645, var10 & 4294967295L));
               }

               var5 = true;
            } else {
               var3.n5("Ppt serialization of the Bevel is not imlemented yet.", 2);
            }

            if (var0.getExtrusionColor().getColorType() != -1) {
               long var12 = u0b.n5(var0.getExtrusionColor(), var3);
               if ((var12 & 4294967295L) != 268435703L) {
                  var4.l6(new com.aspose.slides.internal.k0r.z5(647, var12 & 4294967295L));
               }

               var6.k5(true);
               var6.u9(true);
               var5 = true;
            }
         }

         if (var0.getMaterial() == -1 || var0.getMaterial() == 3) {
            var4.k5(640);
            var4.k5(641);
            var4.k5(642);
            if (var0.getMaterial() == 3) {
               var5 = true;
            }
         } else if (var0.getMaterial() == 5) {
            var4.l6(new com.aspose.slides.internal.k0r.z5(640, 80000L));
            var4.k5(641);
            var4.k5(642);
            var5 = true;
         } else if (var0.getMaterial() == 4) {
            var4.l6(new com.aspose.slides.internal.k0r.z5(640, 80000L));
            var4.l6(new com.aspose.slides.internal.k0r.z5(641, 43712L));
            var4.k5(642);
            var6.l6(true);
            var6.a6(true);
            var5 = true;
         } else if (var0.getMaterial() == 6) {
            var4.k5(640);
            var4.l6(new com.aspose.slides.internal.k0r.z5(641, 0L));
            var4.l6(new com.aspose.slides.internal.k0r.z5(642, 0L));
            var4.l6(new com.aspose.slides.internal.k0r.z5(713, 1L));
            var5 = true;
         } else {
            var3.n5("Ppt serialization of the non-Legacy material is not imlemented yet.", 3);
         }

         if (!var5) {
            var4.k5(703);
            var4.k5(767);
         }
      }
   }
}
