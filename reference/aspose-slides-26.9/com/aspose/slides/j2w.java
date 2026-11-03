package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.ms.System.IDisposable;

class j2w extends x0q {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9(
      "relSizeAnchor", "absSizeAnchor", "sp", "grpSp", "cxnSp", "pic", "graphicFrame"
   );

   final void n5(IChart var1, i1x var2) {
      this.n5();

      while (this.s7().u9()) {
         if (this.s7().s7() == 1 && "userShapes".equals(this.s7().n3())) {
            com.aspose.slides.internal.k4y.o3 var3 = new com.aspose.slides.internal.k4y.o3(this.s7());
            o4f var4 = ((Chart)var1).R_();
            e4c var5 = ((Chart)var1).z7().u9();
            GroupShape var6 = (GroupShape)var1.getUserShapes();
            ShapeCollection var7 = (ShapeCollection)var6.getShapes();
            List$Enumerator var8 = var3.n5().iterator();

            try {
               while (var8.hasNext()) {
                  com.aspose.slides.internal.k4y.g7 var9 = (com.aspose.slides.internal.k4y.g7)var8.next();
                  com.aspose.slides.internal.k4y.g7 var11;
                  float var12;
                  float var13;
                  float var14;
                  float var15;
                  switch (n5.n5(var9.n5())) {
                     case 0:
                        com.aspose.slides.internal.k4y.w2v var10 = (com.aspose.slides.internal.k4y.w2v)var9.l6();
                        var11 = var10.k5();
                        var12 = (float)com.aspose.slides.ms.System.q1.n5((double)(var5.n5 * var10.n5().n5()), 7);
                        var13 = (float)com.aspose.slides.ms.System.q1.n5((double)(var5.l6 * var10.n5().l6()), 7);
                        var14 = (float)com.aspose.slides.ms.System.q1.n5((double)(var5.n5 * var10.l6().n5() - var12), 7);
                        var15 = (float)com.aspose.slides.ms.System.q1.n5((double)(var5.l6 * var10.l6().l6() - var13), 7);
                        if (var15 < 0.0F) {
                           var15 = 0.0F;
                        }

                        if (var14 < 0.0F) {
                           var14 = 0.0F;
                        }
                        break;
                     case 1:
                        com.aspose.slides.internal.k4y.o7p var16 = (com.aspose.slides.internal.k4y.o7p)var9.l6();
                        var11 = var16.k5();
                        var12 = (float)com.aspose.slides.ms.System.q1.n5((double)(var5.n5 * var16.n5().n5()), 7);
                        var13 = (float)com.aspose.slides.ms.System.q1.n5((double)(var5.l6 * var16.n5().l6()), 7);
                        var14 = (float)var16.l6().n5();
                        var15 = (float)var16.l6().l6();
                        break;
                     default:
                        throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Unknown element \"", var9.n5(), "\""}));
                  }

                  if (var11 != null) {
                     switch (n5.n5(var11.n5())) {
                        case 2:
                           com.aspose.slides.internal.k4y.q0 var27 = (com.aspose.slides.internal.k4y.q0)var11.l6();
                           AutoShape var28 = var7.y4();
                           u4.n5(var28, var27, var2);
                           n5(var28, var12, var13, var14, var15);
                           break;
                        case 3:
                           com.aspose.slides.internal.k4y.u7q var17 = (com.aspose.slides.internal.k4y.u7q)var11.l6();
                           GroupShape var18 = var7.e2();
                           r3m.n5(var18, var17, var2);
                           break;
                        case 4:
                           com.aspose.slides.internal.k4y.t2 var19 = (com.aspose.slides.internal.k4y.t2)var11.l6();
                           Connector var20 = var7.t4();
                           u7q.n5(var20, var19, var2);
                           n5(var20, var12, var13, var14, var15);
                           break;
                        case 5:
                           com.aspose.slides.internal.k4y.z1 var21 = (com.aspose.slides.internal.k4y.z1)var11.l6();
                           PictureFrame var22 = var7.q0();
                           o3g.n5(var22, var21, var2);
                           n5(var22, var12, var13, var14, var15);
                           break;
                        case 6:
                           var2.n5().n5("graphicFrame Chart UserShapes loading is not implemented yet.", 1);
                           break;
                        default:
                           throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Unknown element \"", var11.n5(), "\""}));
                     }
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var8, IDisposable.class)) {
                  var8.dispose();
               }
            }

            o4f var26 = var6.R_();
            var26.n5(var4.n5().u9());
            var6.k5(var5.u9());
            var26.n5(var4.k5(), var4.u3(), var4.a6());
            var6.n5(e4c.k5.u9());
            var6.l6(var5.u9());
         }
      }

      this.n3();
   }

   final void n5(IChart var1, j8m var2) {
      this.y4();
      com.aspose.slides.internal.k4y.o3 var3 = new com.aspose.slides.internal.k4y.o3();
      IGroupShape var4 = var1.getUserShapes();
      g6c var5 = var2.n5().n5();
      IGenericEnumerator var6 = var4.getShapes().iterator();

      try {
         while (var6.hasNext()) {
            Shape var7 = (Shape)var6.next();
            com.aspose.slides.internal.k4y.w2v var8 = (com.aspose.slides.internal.k4y.w2v)var3.n5("relSizeAnchor").l6();
            n5(var8, var7, var1.getWidth(), var1.getHeight());
            if (com.aspose.slides.internal.v6g.k5.l6(var7, IAutoShape.class)) {
               com.aspose.slides.internal.k4y.q0 var9 = (com.aspose.slides.internal.k4y.q0)var8.n5("sp").l6();
               IAutoShape var10 = (IAutoShape)var7;
               if (var10.getTextFrame().getParagraphs().get_Item(0).getParagraphFormat().getDefaultPortionFormat().getFontHeight() == 11.0F) {
                  var10.getTextFrame().getParagraphs().get_Item(0).getParagraphFormat().getDefaultPortionFormat().setFontHeight(Float.NaN);
               }

               u4.n5(var10, var9, var2.n5(), var2);
            } else if (com.aspose.slides.internal.v6g.k5.l6(var7, IGroupShape.class)) {
               com.aspose.slides.internal.k4y.u7q var14 = (com.aspose.slides.internal.k4y.u7q)var8.n5("grpSp").l6();
               r3m.n5((IGroupShape)var7, var14, var2.n5(), var2);
            } else if (com.aspose.slides.internal.v6g.k5.l6(var7, IConnector.class)) {
               com.aspose.slides.internal.k4y.a3p var15 = (com.aspose.slides.internal.k4y.a3p)var8.n5("cxnSp").l6();
               u7q.n5((IConnector)var7, var15, var5);
            } else {
               if (!com.aspose.slides.internal.v6g.k5.l6(var7, IPictureFrame.class)) {
                  throw new NotImplementedException();
               }

               com.aspose.slides.internal.k4y.d8y var16 = (com.aspose.slides.internal.k4y.d8y)var8.n5("pic").l6();
               o3g.n5((IPictureFrame)var7, var16, var5);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
            var6.dispose();
         }
      }

      var3.n5(null, this.x8(), "userShapes");
      this.e2();
   }

   public j2w(com.aspose.slides.internal.c8m.j8 var1, t5w var2) {
      super(var1, var2);
   }

   public j2w(com.aspose.slides.internal.c8m.j8 var1, g6c var2) {
      super(var1, var2);
   }

   private static void n5(Shape var0, float var1, float var2, float var3, float var4) {
      o4f var5 = var0.R_();
      if (var0.b3()) {
         com.aspose.slides.internal.o9b.w1[] var6 = new com.aspose.slides.internal.o9b.w1[]{
            new com.aspose.slides.internal.o9b.w1(var1, var2),
            new com.aspose.slides.internal.o9b.w1(var1 + var3, var2),
            new com.aspose.slides.internal.o9b.w1(var1 + var3, var2 + var4)
         };
         com.aspose.slides.internal.w0.c8 var7 = new com.aspose.slides.internal.w0.c8();
         float var8 = var1 + var3 / 2.0F;
         float var9 = var2 + var4 / 2.0F;
         var7.n5(-90.0F, new com.aspose.slides.internal.o9b.w1(var8, var9));
         var7.n5(var6);
         double var10 = com.aspose.slides.ms.System.q1.n5(var6[2].l6() - var6[1].l6());
         double var12 = com.aspose.slides.ms.System.q1.n5(var6[0].k5() - var6[1].k5());
         var5.n5(new e4c(var6[1].l6(), var6[1].k5()));
         var0.n5(var10, var12);
      } else {
         var5.n5(new e4c(var1, var2));
         var0.n5((double)var3, (double)var4);
      }
   }

   private static void n5(com.aspose.slides.internal.k4y.w2v var0, Shape var1, float var2, float var3) {
      o4f var4 = var1.R_();
      d2k var5 = var4.n5().a6().u3();
      d2k var6 = var1.z7().a6().u3();
      if (var1.b3()) {
         com.aspose.slides.internal.o9b.w1[] var7 = new com.aspose.slides.internal.o9b.w1[]{
            new com.aspose.slides.internal.o9b.w1(var5.n5, var5.l6),
            new com.aspose.slides.internal.o9b.w1(var5.n5 + var6.n5, var5.l6),
            new com.aspose.slides.internal.o9b.w1(var5.n5, var5.l6 + var6.l6)
         };
         com.aspose.slides.internal.w0.c8 var8 = new com.aspose.slides.internal.w0.c8();
         var8.n5(90.0F, new com.aspose.slides.internal.o9b.w1(var5.n5 + var6.n5 / 2.0F, var5.l6 + var6.l6 / 2.0F));
         var8.n5(var7);
         var5.n5 = var7[2].l6();
         var5.l6 = var7[2].k5();
         var6.n5 = com.aspose.slides.ms.System.q1.n5(var7[2].l6() - var7[0].l6());
         var6.l6 = com.aspose.slides.ms.System.q1.n5(var7[1].k5() - var7[0].k5());
      }

      var0.n5().n5(com.aspose.slides.ms.System.q1.n5((double)(var5.n5 / var2), (int)(5)));
      var0.n5().l6(com.aspose.slides.ms.System.q1.n5((double)(var5.l6 / var3), (int)(5)));
      var0.l6().n5(com.aspose.slides.ms.System.q1.n5((double)((var5.n5 + var6.n5) / var2), (int)(5)));
      var0.l6().l6(com.aspose.slides.ms.System.q1.n5((double)((var5.l6 + var6.l6) / var3), (int)(5)));
   }
}
