package com.aspose.slides;

class f2a {
   public static SmartArt n5(IShapeCollection var0, com.aspose.slides.internal.k4y.s1k var1, i1x var2) {
      if (var1 == null) {
         return null;
      }

      ShapeCollection var3 = (ShapeCollection)var0;
      SmartArt[] var4 = new SmartArt[]{var3.u3()};
      d2c var5 = var4[0].u9();
      l5u.n5(var4[0], var1, var2);
      t5w var6 = var2.n5();
      com.aspose.slides.internal.k4y.i3 var7 = var1.k5().n5().t9();
      String var8 = var7.u3();
      com.aspose.slides.internal.c8m.j8 var9 = var6.k7().n5(var8).l6();
      z6s var10 = new z6s(var9, var6);
      var10.n5(var5);
      String var11 = var7.n5();
      com.aspose.slides.internal.c8m.j8 var12 = var6.k7().n5(var11).l6();
      s1q var13 = new s1q(var12, var6);
      var13.n5(var5);
      com.aspose.slides.internal.c8m.a2 var14 = var12.e2();
      String var15 = var7.l6();
      com.aspose.slides.internal.c8m.j8 var16 = var6.k7().n5(var15).l6();
      r2s var17 = new r2s(var16, var6);
      var17.n5(var5);
      String var18 = var7.k5();
      com.aspose.slides.internal.c8m.j8 var19 = var6.k7().n5(var18).l6();
      r0a var20 = new r0a(var19, var6);
      var20.n5(var5);
      com.aspose.slides.ms.System.Xml.m8 var21 = null;
      com.aspose.slides.internal.k4y.w8d var22 = com.aspose.slides.internal.k4y.x1f.n5(var5.l6().t2());
      if (var22 != null) {
         String var23 = "http://schemas.microsoft.com/office/drawing/2008/diagram";
         var21 = (com.aspose.slides.ms.System.Xml.m8)j2z.n5(var22.l6().getDocumentElement(), "dataModelExt", var23);
      }

      if (var21 != null) {
         String var27 = var21.n5("relId");
         com.aspose.slides.internal.c8m.r7 var24 = var6.k7().n5(var27);
         if (var24 != null) {
            com.aspose.slides.internal.c8m.j8 var25 = var24.l6();
            if (var25 != null && com.aspose.slides.internal.v6g.k5.l6(var25.y4(), com.aspose.slides.internal.c8m.f2.class)) {
               v4c var26 = new v4c(var25, var6);
               var26.n5(var5, var2);
            }
         }

         ((GroupShape)var5.h0()).n5().n5(var4[0]);
      }

      com.aspose.slides.internal.c8m.a2 var28 = var6.k7();
      var6.n5(var14);
      if (var5.l6().h0() != null) {
         if (var5.l6().h0().n5() != null) {
            x9f.n5(var4[0].getFillFormat(), var5.l6().h0().n5(), var6);
         }

         if (var5.l6().h0().l6() != null) {
            w5i.n5(new f2a$1(var4), var5.l6().h0().l6(), var6);
         }
      }

      if (var5.l6().c8() != null && var5.l6().c8().l6() != null) {
         i3z.n5(var4[0].c4(), var5.l6().c8().l6());
      }

      var4[0].n5(var6);
      var6.n5(var28);
      return var4[0];
   }

   public static void n5(SmartArt var0, com.aspose.slides.internal.k4y.s1k var1, n4i var2) {
      d2c var3 = var0.u9();
      g6c var4 = var2.n5();
      t5w var5 = new t5w(var0.getPresentation(), InterruptionToken.getNone());
      var5.n5(var3.k5());
      l5u.n5(var0, var1, var4);
      String var6 = var2.n5().c8() ? "drs" : "ppt";

      String var8;
      String var9;
      String var10;
      String var11;
      String var12;
      do {
         int var7 = var4.z8();
         var8 = com.aspose.slides.ms.System.d1.n5("/", var6, "/diagrams/drawing", com.aspose.slides.ms.System.a3.l6(var7), ".xml");
         var9 = com.aspose.slides.ms.System.d1.n5("/", var6, "/diagrams/data", com.aspose.slides.ms.System.a3.l6(var7), ".xml");
         var10 = com.aspose.slides.ms.System.d1.n5("/", var6, "/diagrams/layout", com.aspose.slides.ms.System.a3.l6(var7), ".xml");
         var11 = com.aspose.slides.ms.System.d1.n5("/", var6, "/diagrams/quickStyle", com.aspose.slides.ms.System.a3.l6(var7), ".xml");
         var12 = com.aspose.slides.ms.System.d1.n5("/", var6, "/diagrams/colors", com.aspose.slides.ms.System.a3.l6(var7), ".xml");
      } while (
         var4.a6().u9(var8) != null || var4.a6().u9(var9) != null || var4.a6().u9(var10) != null || var4.a6().u9(var11) != null || var4.a6().u9(var12) != null
      );

      com.aspose.slides.internal.c8m.r7 var13 = null;
      if (var3.u9() != null) {
         com.aspose.slides.internal.c8m.j8 var14 = var4.a6().n5(var8, null, new com.aspose.slides.internal.c8m.f2());
         v4c var15 = new v4c(var14, var4);
         var15.n5(var3, var2);
         var13 = var4.u6().l6(var14);
      }

      com.aspose.slides.internal.k4y.i3 var25 = var1.k5().n5().u3();
      com.aspose.slides.internal.c8m.j8 var26 = var4.a6().n5(var9, null, new com.aspose.slides.internal.c8m.p8());
      com.aspose.slides.internal.c8m.a2 var16 = var4.u6();
      var4.n5(var26.e2());
      var0.n5(var4);
      var4.n5(var16);
      s1q var17 = new s1q(var26, var4);
      var17.n5(var3, var13);
      com.aspose.slides.internal.c8m.r7 var18 = var4.u6().l6(var26);
      var25.n5(var18.a6());
      com.aspose.slides.internal.c8m.j8 var19 = var4.a6().n5(var10, null, new com.aspose.slides.internal.c8m.i1());
      r2s var20 = new r2s(var19, var4);
      var20.l6(var3);
      var18 = var4.u6().l6(var19);
      var25.l6(var18.a6());
      com.aspose.slides.internal.c8m.j8 var21 = var4.a6().n5(var11, null, new com.aspose.slides.internal.c8m.e5());
      r0a var22 = new r0a(var21, var4);
      var22.l6(var3);
      var18 = var4.u6().l6(var21);
      var25.k5(var18.a6());
      com.aspose.slides.internal.c8m.j8 var23 = var4.a6().n5(var12, null, new com.aspose.slides.internal.c8m.s3());
      z6s var24 = new z6s(var23, var4);
      var24.l6(var3);
      var18 = var4.u6().l6(var23);
      var25.u3(var18.a6());
   }
}
