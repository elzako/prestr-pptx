package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class v0a {
   static void n5(v5s var0) {
      if (var0.y4() && var0.c8() != 1) {
         Shape var1 = r2v.n5(var0);
         if (var1 != null) {
            l3c var19 = com.aspose.slides.internal.v6g.k5.n5(var0.a6(), l3c.class);
            if (var19 != null && com.aspose.slides.internal.v6g.k5.n5(var1, GroupShape.class) == null) {
               List$Enumerator var20 = var19.u9().iterator();

               try {
                  while (var20.hasNext()) {
                     v5s var23 = (v5s)var20.next();
                     var23.n5(false);
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var20, IDisposable.class)) {
                     var20.dispose();
                  }
               }
            }

            ShapeFrame var21 = var1.p8();
            v0q.n5(var0);
            if (var1.p8().n5().u3()) {
               var1.n5(var21);
            }

            GeometryShape var24 = com.aspose.slides.internal.v6g.k5.n5(var1, GeometryShape.class);
            if (var24 != null && var24.e2().x8() == -1) {
               var24.e2().l6(5);
            }

            Shape var25 = (Shape)var0.a6().m1();
            if (((ShapeFrame)var25.getRawFrame()).n5().u3()) {
               com.aspose.slides.internal.k0r.g6 var26 = var0.k5();
               if (var26 == null) {
                  return;
               }

               e4c var7 = new e4c();
               e4c var8 = new e4c();
               x4t var9 = new x4t();
               e4c[] var10 = new e4c[]{var7};
               e4c[] var11 = new e4c[]{var8};
               x4t[] var12 = new x4t[]{var9};
               w9v.n5(var26, var10, var11, var12);
               var10[0].l6(var7);
               var11[0].l6(var8);
               var12[0].n5(var9);
               var25.n5(var7.u9(), var8.u9(), var9.n5());
            }

            var1.c8();
            return;
         }
      }

      String var15 = com.aspose.slides.ms.System.d1.n5;
      switch (var0.c8()) {
         case 1:
            w3p.n5(var0);
            var15 = "Group ";
            break;
         case 2:
         case 5:
         case 6:
         default:
            w6n.u3(var0);
            break;
         case 3:
            t3.n5(var0);
            IAutoShape var17 = com.aspose.slides.internal.v6g.k5.n5(var0.a6().m1(), IAutoShape.class);
            if (var17.getTextFrame() != null && ((TextFrame)var17.getTextFrame()).s7().z1() == 1) {
               var15 = "WordArt ";
            } else if (var17.isTextBox()) {
               var15 = "Text Box ";
            } else {
               var15 = com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.s3.n5(ShapeType.class, var17.getShapeType()), " "});
            }
            break;
         case 4:
            h1f.l6(var0);
            var15 = "Table ";
            break;
         case 7:
            i4x.l6(var0);
            break;
         case 8:
            d3l.n5(var0);
            break;
         case 9:
            t4s.k5(var0);
            var15 = "Picture ";
            break;
         case 10:
         case 11:
         case 12:
            a7.n5(var0);
            AudioFrame var16 = com.aspose.slides.internal.v6g.k5.n5(var0.a6().m1(), AudioFrame.class);
            if (var16 != null && !com.aspose.slides.ms.System.d1.n5(var16.l6)) {
               var15 = var16.l6;
            }
            break;
         case 13:
            y7i.n5(var0);
            VideoFrame var2 = com.aspose.slides.internal.v6g.k5.n5(var0.a6().m1(), VideoFrame.class);
            if (var2 != null && !com.aspose.slides.ms.System.d1.n5(var2.l6)) {
               var15 = var2.l6;
            }
            break;
         case 14:
            h6x.l6(var0);
            var15 = "Object ";
            break;
         case 15:
            h6x.k5(var0);
      }

      if (!com.aspose.slides.ms.System.d1.n5(var15)) {
         IShape var18 = (IShape)var0.a6().m1();
         if (com.aspose.slides.ms.System.d1.n5(var18.getName())) {
            if (!com.aspose.slides.internal.v6g.k5.l6(var18, IAudioFrame.class) && !com.aspose.slides.internal.v6g.k5.l6(var18, IVideoFrame.class)) {
               String var3 = com.aspose.slides.ms.System.l4.n5(var0.t2(), "X4");
               int var4 = 0;
               int[] var5 = new int[]{0};
               boolean var6 = com.aspose.slides.ms.System.a3.n5(com.aspose.slides.ms.System.d1.k5(var3, var3.length() - 2), var5);
               var4 = var5[0];
               if (var6) {
                  var18.setName(com.aspose.slides.ms.System.d1.n5(new String[]{var15, com.aspose.slides.ms.System.a3.l6(var4)}));
               }
            } else {
               var18.setName(var15);
            }
         }
      }
   }
}
