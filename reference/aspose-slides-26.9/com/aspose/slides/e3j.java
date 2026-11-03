package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;

class e3j {
   public static Shape n5(ShapeCollection var0, com.aspose.slides.internal.k4y.g3c var1, h6j var2) {
      if (var0 == null) {
         throw new ArgumentNullException("shapes");
      }

      if (var1 == null) {
         throw new ArgumentNullException("customShapeElementData");
      }

      if (var1.t9() == null) {
         return null;
      }

      q4v var3 = new q4v(var1);
      com.aspose.slides.internal.o9b.y1 var4 = t2f.n5(var1.l6(), var1.k5(), var1.u3(), var1.a6()).y4();
      AutoShape var5 = null;
      if (var1.t9().x8()) {
         var5 = (AutoShape)var0.addAutoShape(5, var4.x8(), var4.n3(), var4.s7(), var4.k5(), false);
         l4t.n5((TextFrame)var5.addTextFrame(""), var2);
         l4t.n5((TextFrame)var5.getTextFrame(), var3, var2);
         ((TextFrameFormat)var5.getTextFrame().getTextFrameFormat()).c8().n5((byte)1);
         d7g.n5((TextFrame)var5.getTextFrame(), var3, var1.e2(), var2, h2k.l6());
         if (t2f.k5(var1.c8())) {
            n7n.n5(var5.getTextFrame().getParagraphs(), var3.l6(), var2);
         }
      } else {
         if ("ellipse".equals(var1.t9().l6())) {
            var5 = (AutoShape)var0.addAutoShape(35, var4.x8(), var4.n3(), var4.s7(), var4.k5(), true);
         } else if ("ooxml-rect".equals(var1.t9().l6())) {
            var5 = (AutoShape)var0.addAutoShape(5, var4.x8(), var4.n3(), var4.s7(), var4.k5(), true);
         } else {
            String var6 = var1.t9().l6();
            boolean var7 = com.aspose.slides.ms.System.d1.l6(var6, "ooxml-");
            if (var7) {
               String var8 = com.aspose.slides.ms.System.d1.n5(var6, "ooxml-", "");
               if (!"non-primitive".equals(var8)) {
                  var5 = (AutoShape)var0.addAutoShape(com.aspose.slides.internal.k4y.b9.n5(var8), var4.x8(), var4.n3(), var4.s7(), var4.k5(), true);
               }
            } else if (!com.aspose.slides.ms.System.d1.a6("trapezoid", var6)) {
               var5 = n5(var1.t9().h0(), var0, var4.y4());
            }

            if (var5 == null) {
               var5 = (AutoShape)var0.addAutoShape(0, var4.x8(), var4.n3(), var4.s7(), var4.k5(), true);
               var5.e2().n5(0);

               try {
                  b1k.n5(var5.e2(), var4.y4(), var1.t9());
               } catch (RuntimeException var12) {
                  var2.n5().n5("Geometry adjustments parse failed", 1);
               }
            }

            if (var1.t9().u3() || var1.t9().a6()) {
               o4f var14 = var5.R_();
               int var9 = var1.t9().a6() ? 1 : 0;
               int var10 = var1.t9().u3() ? 1 : 0;
               var14.n5(var14.n5().u9());
               var5.k5(var5.z7().u9());
               var14.n5(var14.k5(), (byte)var9, (byte)var10);
            }

            if (t2f.k5(var1.t9().n3()) && var5.getShapeType() > 0) {
               int[] var15 = n5(var1.t9().n3(), 10000);
               y2[] var16 = var5.e2().l6();
               if (var7) {
                  int var17 = com.aspose.slides.ms.System.q1.l6(var16.length, var15.length);

                  for (int var11 = 0; var11 < var17; var11++) {
                     var16[var11].n5(var15[var11]);
                  }
               } else {
                  s1f.n5(var16, var5.getShapeType(), var15, var5.getRawFrame().getWidth(), var5.getRawFrame().getHeight());
               }
            }
         }

         l4t.n5((TextFrame)var5.getTextFrame(), var2);
         h2k var13 = h2k.l6();
         if (t2f.k5(var3.n5())) {
            var13 = h2k.n5(var3.n5(), 10);
         } else if (t2f.k5(var3.l6())) {
            var13 = h2k.n5(var3.l6(), 9);
         }

         d7g.n5((TextFrame)var5.getTextFrame(), var3, var1.e2(), var2, var13);
         d7g.n5(var5, var1.c8(), var2);
         d7g.n5(var5, var1.t2(), var2);
         d7g.n5((IShape)var5, var1.h0(), var2);
      }

      return var5;
   }

   private static AutoShape n5(String var0, IShapeCollection var1, com.aspose.slides.internal.o9b.y1 var2) {
      int var3 = n5(var0);
      if (var3 == -1) {
         return null;
      }

      AutoShape var4 = (AutoShape)var1.addAutoShape(var3, var2.x8(), var2.n3(), var2.s7(), var2.k5(), true);
      var4.getLineFormat().setWidth(0.5);
      var4.getLineFormat().setDashStyle((byte)0);
      return var4;
   }

   private static int n5(String var0) {
      for (int var1 = 0; var1 < s1h.n5.length; var1++) {
         if (com.aspose.slides.ms.System.d1.a6(s1h.n5[var1], var0)) {
            return s1h.l6[var1];
         }
      }

      return -1;
   }

   private static int[] n5(String var0, int var1) {
      if (com.aspose.slides.ms.System.d1.n5(var0)) {
         return new int[0];
      }

      String[] var2 = com.aspose.slides.ms.System.d1.n5(com.aspose.slides.ms.System.d1.l6(var0), ' ');
      int[] var3 = new int[var2.length];

      for (int var4 = 0; var4 < var3.length; var4++) {
         float var5 = 0.0F;
         float[] var6 = new float[]{0.0F};
         boolean var7 = !com.aspose.slides.ms.System.d1.n5(var2[var4]) && com.aspose.slides.ms.System.n1.n5(var2[var4], var6);
         var5 = var6[0];
         if (var7) {
            var3[var4] = com.aspose.slides.internal.v6g.k5.u3(var5, 13);
         } else {
            var3[var4] = var1;
         }
      }

      return var3;
   }
}
