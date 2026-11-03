package com.aspose.slides;

class r9a {
   static void n5(ILineFormat var0, byte var1, boolean var2, a9x var3) {
      u7n.n5(var0.getFillFormat(), var3);
      com.aspose.slides.internal.k0r.r3 var4 = var3.n3().a6();
      com.aspose.slides.internal.k0r.q5 var5 = null;
      if (var3.z1() != null) {
         var5 = (com.aspose.slides.internal.k0r.q5)var3.z1().k5();
      }

      com.aspose.slides.internal.k0r.r3 var6 = var5 != null ? var5.a6() : null;
      com.aspose.slides.internal.k0r.a7 var7 = var4 != null ? (com.aspose.slides.internal.k0r.a7)var4.l6().n5(511) : null;
      if (var7 == null) {
         var7 = new com.aspose.slides.internal.k0r.a7();
      }

      com.aspose.slides.internal.k0r.z5 var8 = com.aspose.slides.internal.v6g.k5.n5(n5(var4, var6, 462), com.aspose.slides.internal.k0r.z5.class);
      var0.setDashStyle(var8 != null && (var8.j5() & 4294967295L) < 11L ? s1f.a6((int)var8.j5()) : -1);
      var8 = com.aspose.slides.internal.v6g.k5.n5(n5(var4, var6, 459), com.aspose.slides.internal.k0r.z5.class);
      var0.setWidth(var8 != null ? (var8.j5() & 4294967295L) / 12700.0 : Double.NaN);
      var8 = com.aspose.slides.internal.v6g.k5.n5(n5(var4, var6, 471), com.aspose.slides.internal.k0r.z5.class);
      var0.setCapStyle(var8 != null ? (byte)var8.j5() : -1);
      var8 = com.aspose.slides.internal.v6g.k5.n5(n5(var4, var6, 461), com.aspose.slides.internal.k0r.z5.class);
      var0.setStyle(var8 != null ? (byte)var8.j5() : -1);
      if (var2) {
         switch (var0.getStyle()) {
            case 2:
               var0.setStyle((byte)3);
               break;
            case 3:
               var0.setStyle((byte)2);
         }
      }

      var0.setAlignment((byte)(var7.c8() && var7.t2() ? 1 : -1));
      var8 = com.aspose.slides.internal.v6g.k5.n5(n5(var4, var6, 460), com.aspose.slides.internal.k0r.z5.class);
      var0.setMiterLimit(var8 != null ? (float)(var8.j5() & 4294967295L) / 65536.0F : 8.0F);
      var8 = com.aspose.slides.internal.v6g.k5.n5(n5(var4, var6, 470), com.aspose.slides.internal.k0r.z5.class);
      var0.setJoinStyle(var8 != null && (var8.j5() & 4294967295L) < 3L ? s1f.u9((int)var8.j5()) : var1);
      boolean var9 = false;
      if (var3.m3() == 3) {
         AutoShape var10 = (AutoShape)var3.m1();
         int var11 = var10.e2().x8();
         var9 = var11 >= 105 && var11 <= 116;
      }

      var8 = com.aspose.slides.internal.v6g.k5.n5(n5(var4, var6, !var9 ? 464 : 465), com.aspose.slides.internal.k0r.z5.class);
      var0.setBeginArrowheadStyle(var8 == null ? -1 : (byte)var8.j5());
      var8 = com.aspose.slides.internal.v6g.k5.n5(n5(var4, var6, !var9 ? 465 : 464), com.aspose.slides.internal.k0r.z5.class);
      var0.setEndArrowheadStyle(var8 == null ? -1 : (byte)var8.j5());
      var8 = com.aspose.slides.internal.v6g.k5.n5(n5(var4, var6, !var9 ? 466 : 468), com.aspose.slides.internal.k0r.z5.class);
      var0.setBeginArrowheadWidth(var8 == null ? -1 : (byte)var8.j5());
      var8 = com.aspose.slides.internal.v6g.k5.n5(n5(var4, var6, !var9 ? 467 : 469), com.aspose.slides.internal.k0r.z5.class);
      var0.setBeginArrowheadLength(var8 == null ? -1 : (byte)var8.j5());
      var8 = com.aspose.slides.internal.v6g.k5.n5(n5(var4, var6, !var9 ? 468 : 466), com.aspose.slides.internal.k0r.z5.class);
      var0.setEndArrowheadWidth(var8 == null ? -1 : (byte)var8.j5());
      var8 = com.aspose.slides.internal.v6g.k5.n5(n5(var4, var6, !var9 ? 469 : 467), com.aspose.slides.internal.k0r.z5.class);
      var0.setEndArrowheadLength(var8 == null ? -1 : (byte)var8.j5());
   }

   private static Object n5(com.aspose.slides.internal.k0r.r3 var0, com.aspose.slides.internal.k0r.r3 var1, int var2) {
      com.aspose.slides.internal.k0r.q1 var3 = var0 != null ? var0.l6().n5(var2) : null;
      return var3 == null && var1 != null ? var1.l6().n5(var2) : var3;
   }

   public static void n5(ILineFormat var0, com.aspose.slides.internal.k0r.q5 var1, byte var2, g6o var3) {
      com.aspose.slides.internal.k0r.w8 var4 = var1.a6().l6();
      com.aspose.slides.internal.k0r.a7 var5 = (com.aspose.slides.internal.k0r.a7)var4.n5(511);
      if (var5 == null) {
         var5 = new com.aspose.slides.internal.k0r.a7();
         var4.l6(var5);
         var5.k5(true);
      }

      u7n.n5(var0.getFillFormat(), var1, var3);
      var4.k5(462);
      if (var0.getDashStyle() != -1) {
         if (var0.getDashStyle() != 11) {
            com.aspose.slides.internal.k0r.z5 var6 = new com.aspose.slides.internal.k0r.z5(462, s1f.a6(var0.getDashStyle()) & 4294967295L);
            var4.n5(var6);
         } else {
            var3.n5("Line format dash style LineDashStyle.Custom PPT serialization is not implemented yet.", 3);
         }
      }

      var4.k5(459);
      if (!com.aspose.slides.ms.System.d2.k5(var0.getWidth()) && com.aspose.slides.ms.System.q1.n5(var0.getWidth() - 0.75) > 1.0E-6) {
         com.aspose.slides.internal.k0r.z5 var14 = new com.aspose.slides.internal.k0r.z5(
            459, com.aspose.slides.internal.v6g.k5.a6(var0.getWidth() * 12700.0, 14)
         );
         var4.n5(var14);
      }

      var4.k5(471);
      if (var0.getCapStyle() != -1 && var0.getCapStyle() != 1) {
         com.aspose.slides.internal.k0r.z5 var15 = new com.aspose.slides.internal.k0r.z5(471, var0.getCapStyle() & 4294967295L);
         var4.n5(var15);
      }

      var4.k5(461);
      if (var0.getStyle() != -1 && var0.getStyle() != 0) {
         com.aspose.slides.internal.k0r.z5 var16 = new com.aspose.slides.internal.k0r.z5(461, var0.getStyle() & 4294967295L);
         var4.n5(var16);
      }

      var5.t2(var0.getAlignment() == 1);
      var4.k5(470);
      if (var0.getJoinStyle() != -1 && var0.getJoinStyle() != var2) {
         com.aspose.slides.internal.k0r.z5 var17 = new com.aspose.slides.internal.k0r.z5(470, s1f.u9(var0.getJoinStyle()) & 4294967295L);
         var4.n5(var17);
      }

      var4.k5(460);
      if (!com.aspose.slides.ms.System.n1.k5(var0.getMiterLimit()) && var0.getMiterLimit() != 8.0F) {
         com.aspose.slides.internal.k0r.z5 var18 = new com.aspose.slides.internal.k0r.z5(
            460, com.aspose.slides.internal.v6g.k5.a6(var0.getMiterLimit() * 65536.0F, 13)
         );
         var4.n5(var18);
      }

      var5.s7(var1.u3().t2() == 20 || var1.u3().t2() == 0);
      boolean var19 = var1.u3().t2() >= 41 && var1.u3().t2() <= 52;
      var4.k5(464);
      byte var7 = !var19 ? var0.getBeginArrowheadStyle() : var0.getEndArrowheadStyle();
      if (var7 != -1) {
         com.aspose.slides.internal.k0r.z5 var8 = new com.aspose.slides.internal.k0r.z5(464, var7 & 4294967295L);
         var4.n5(var8);
      }

      var4.k5(466);
      byte var20 = !var19 ? var0.getBeginArrowheadWidth() : var0.getEndArrowheadWidth();
      if (var20 != -1) {
         com.aspose.slides.internal.k0r.z5 var9 = new com.aspose.slides.internal.k0r.z5(466, var20 & 4294967295L);
         var4.n5(var9);
      }

      var4.k5(467);
      byte var21 = !var19 ? var0.getBeginArrowheadLength() : var0.getEndArrowheadLength();
      if (var21 != -1) {
         com.aspose.slides.internal.k0r.z5 var10 = new com.aspose.slides.internal.k0r.z5(467, var21 & 4294967295L);
         var4.n5(var10);
      }

      var4.k5(465);
      byte var22 = !var19 ? var0.getEndArrowheadStyle() : var0.getBeginArrowheadStyle();
      if (var22 != -1) {
         com.aspose.slides.internal.k0r.z5 var11 = new com.aspose.slides.internal.k0r.z5(465, var22 & 4294967295L);
         var4.n5(var11);
      }

      var4.k5(468);
      byte var23 = !var19 ? var0.getEndArrowheadWidth() : var0.getBeginArrowheadWidth();
      if (var23 != -1) {
         com.aspose.slides.internal.k0r.z5 var12 = new com.aspose.slides.internal.k0r.z5(468, var23 & 4294967295L);
         var4.n5(var12);
      }

      var4.k5(469);
      byte var24 = !var19 ? var0.getEndArrowheadLength() : var0.getBeginArrowheadLength();
      if (var24 != -1) {
         com.aspose.slides.internal.k0r.z5 var13 = new com.aspose.slides.internal.k0r.z5(469, var24 & 4294967295L);
         var4.n5(var13);
      }
   }
}
