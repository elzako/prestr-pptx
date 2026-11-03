package com.aspose.slides;

import com.aspose.slides.exceptions.Exception;

class o4z {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9("noAutofit", "normAutofit", "spAutoFit");

   public static void n5(ITextFrame var0, com.aspose.slides.internal.k4y.j3z var1, t5w var2) {
      if (var1 != null) {
         com.aspose.slides.internal.k4y.f4l var3 = var1.k5();
         TextFrameFormat var4 = (TextFrameFormat)var0.getTextFrameFormat();
         p6k var5 = var4.u9();
         var5.n5(var3.w1());
         var4.n5((byte)-1);
         if (var3.m3() != null) {
            switch (n5.n5(var3.m3().n5())) {
               case 0:
                  var4.n5((byte)0);
                  break;
               case 1:
                  com.aspose.slides.internal.k4y.x5e var6 = (com.aspose.slides.internal.k4y.x5e)var3.m3().l6();
                  var4.n5((byte)1);
                  var4.n5(var6.n5() / 100.0F);
                  var4.l6(var6.l6() / 100.0F);
                  break;
               case 2:
                  var4.n5((byte)2);
                  break;
               default:
                  throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Unknown element \"", var3.m3().n5(), "\""}));
            }
         }

         var4.setColumnCount(var3.n3());
         var4.setColumnSpacing(var3.y4());
         var4.l6(var3.e2());
         var4.setRotationAngle(var3.l6());
         var4.k5(var3.a6());
         d0v.n5(var4.c8(), var3.k7());
         var4.u3(var3.k5());
         var4.a6(var3.u3());
         var4.u9(var3.t9());
         var4.h0(var3.q0());
         var4.n5(var3.z3());
         var4.c8(var3.m1());
         var4.setTextVerticalType(var3.u9());
         var4.n5(new c0u(var3.c8(), var3.t2(), var3.s7(), var3.x8()));
         if (var3.h0() != 0) {
            var4.setWrapText((byte)(var3.h0() == 2 ? 1 : 0));
         }

         var4.setAnchoringType(var3.z1());
         var4.setCenterText(var3.t4());
         p2m.n5(var4.h0(), var1.u3(), var2);
         f5q.n5(var0.getParagraphs(), var1.a6(), var2);
         r6k.n5(
            var4.getThreeDFormat(),
            var3.z8(),
            var3.j5() == null ? null : com.aspose.slides.internal.v6g.k5.n5(var3.j5().k5(), com.aspose.slides.internal.k4y.q9u.class),
            var3.j5() == null ? null : com.aspose.slides.internal.v6g.k5.n5(var3.j5().k5(), com.aspose.slides.internal.k4y.p6w.class)
         );
         ((TextFrame)var0).l6(false);
      }
   }

   public static void n5(ITextFrame var0, com.aspose.slides.internal.f3.k5<com.aspose.slides.internal.k4y.j3z> var1, g6c var2) {
      if (var0 != null) {
         com.aspose.slides.internal.k4y.j3z var3 = (com.aspose.slides.internal.k4y.j3z)var1.invoke();
         n5(var0, var3, var2);
      }
   }

   public static void n5(ITextFrame var0, com.aspose.slides.internal.k4y.j3z var1, g6c var2) {
      if (var0 != null) {
         com.aspose.slides.internal.k4y.f4l var3 = var1.k5();
         p6k var4 = ((TextFrame)var0).n5.u9();
         switch (var0.getTextFrameFormat().getAutofitType()) {
            case -1:
               break;
            case 0:
               var3.n5("noAutofit");
               break;
            case 1:
               com.aspose.slides.internal.k4y.x5e var5 = (com.aspose.slides.internal.k4y.x5e)var3.n5("normAutofit").l6();
               if (!com.aspose.slides.ms.System.n1.k5(((TextFrame)var0).n5.n3())) {
                  var5.n5(((TextFrame)var0).n5.n3() * 100.0F);
               }

               if (!com.aspose.slides.ms.System.n1.k5(((TextFrame)var0).n5.y4())) {
                  var5.l6(((TextFrame)var0).n5.y4() * 100.0F);
               }
               break;
            case 2:
               var3.n5("spAutoFit");
               break;
            default:
               throw new Exception();
         }

         TextFrameFormat var10 = (TextFrameFormat)var0.getTextFrameFormat();
         var3.u3(var10.getTextVerticalType());
         c0u var6 = var10.u3().l6();
         var3.n5(var6.l6);
         var3.l6(var6.k5);
         var3.k5(var6.u3);
         var3.u3(var6.a6);
         if (var0.getTextFrameFormat().getWrapText() != -1) {
            var3.n5(var0.getTextFrameFormat().getWrapText() == 1 ? 2 : 1);
         }

         var3.h0(var10.getAnchoringType());
         var3.c8(var10.getCenterText());
         p2m.n5(var10.h0(), new o4z$1(var1), var2);
         f5q.n5(var0.getParagraphs(), new o4z$2(var1), var2);
         if (var10.getColumnCount() > 0) {
            var3.l6(var10.getColumnCount());
            var3.a6(var10.getColumnSpacing());
         }

         var3.a6(var10.s7());
         var3.n5(var10.getRotationAngle());
         var3.k5(var10.x8());
         d0v.n5(var10.c8(), new o4z$3(var3), var2);
         var3.n5(var10.e2());
         var3.l6(var10.t9());
         var3.u9(var10.z1());
         var3.t2(var10.t4());
         var3.n5(var10.q0());
         var3.s7(var10.j5());
         IThreeDFormat var7 = var10.getThreeDFormat();
         if (((ThreeDFormat)var7).u9() != -1 || ((ThreeDFormat)var7).h0() != -1) {
            com.aspose.slides.internal.k4y.h6l var8 = new com.aspose.slides.internal.k4y.h6l();
            m7.l6(var7.getCamera(), var8.l6());
            w9q.l6(var7.getLightRig(), var8.k5());
            var3.n5(var8);
         }

         if (var7.getMaterial() != -1 && var7.getMaterial() != 14
            || var7.getContourWidth() != 0.0
            || var7.getExtrusionHeight() != 0.0
            || ((ThreeDFormat)var7).c8() != -1
            || ((ThreeDFormat)var7).t2() != -1) {
            com.aspose.slides.internal.k4y.q9u var11 = new com.aspose.slides.internal.k4y.q9u();
            var11.k5(var7.getContourWidth());
            var11.l6(var7.getExtrusionHeight());
            var11.n5(var7.getDepth());
            var11.n5(var7.getMaterial() == -1 ? 14 : var7.getMaterial());
            z8c.n5(var7.getBevelTop(), new o4z$4(var11));
            z8c.n5(var7.getBevelBottom(), new o4z$5(var11));
            c4i.n5(var7.getExtrusionColor(), new o4z$6(var11));
            c4i.n5(var7.getContourColor(), new o4z$7(var11));
            com.aspose.slides.internal.k4y.g7 var9 = new com.aspose.slides.internal.k4y.g7("sp3d", var11);
            var3.n5(var9);
         }

         if (var10.getKeepTextFlat()) {
            com.aspose.slides.internal.k4y.p6w var12 = new com.aspose.slides.internal.k4y.p6w();
            var12.n5(0.0);
            com.aspose.slides.internal.k4y.g7 var13 = new com.aspose.slides.internal.k4y.g7("flatTx", var12);
            var3.n5(var13);
         }

         var3.n5(var4.n5());
      }
   }
}
