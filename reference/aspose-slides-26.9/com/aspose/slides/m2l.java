package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.ms.System.IDisposable;

class m2l extends n7d {
   public m2l(float var1) {
      super(var1);
      this.n5(true);
   }

   public final boolean n5(e3 var1, s5u var2, GroupShape var3) {
      g0 var4 = this.n5(var3);
      if (var4 == null) {
         return false;
      }

      float[] var5 = h4.n5(var4.k5(), var4.n5(), var4.l6());
      if (var5 == null) {
         return false;
      }

      x2i var6 = this.l6(var3);
      if (var6 == null) {
         return false;
      }

      List var7 = new List();
      List[] var8 = new List[]{var7};
      this.n5(var3, var8);
      var7 = var8[0];
      if (var7.size() < 2) {
         return false;
      }

      ShapeFrame var9 = (ShapeFrame)var3.getFrame();
      com.aspose.slides.internal.s6.v3 var10 = new com.aspose.slides.internal.s6.v3(0.0F, 0.0F, 0.0F);
      com.aspose.slides.internal.s6.s0 var11 = new com.aspose.slides.internal.s6.s0(var9.getCenterX(), var9.getCenterY());
      com.aspose.slides.internal.s6.r4 var12 = t4x.l6(var5).c8();
      SortedList var13 = new SortedList();
      boolean var14 = false;
      List$Enumerator var15 = var7.iterator();

      try {
         while (var15.hasNext()) {
            GeometryShape var16 = (GeometryShape)var15.next();
            boolean var17 = false;
            boolean[] var18 = new boolean[]{false};
            x2i var19 = l0y.n5(var16, var18);
            var17 = var18[0];
            if (var19 != null) {
               int var20 = n5(var19, false);
               boolean var21 = com.aspose.slides.ms.System.o5.l6(var19.k5(), null) && n5(var20);
               com.aspose.slides.internal.s6.v3 var22 = new com.aspose.slides.internal.s6.v3();
               com.aspose.slides.internal.s6.s0 var23 = new com.aspose.slides.internal.s6.s0();
               ShapeFrame var24 = var16.e5().n5(true);
               ShapeElement[] var25 = var16.e2().n5(var16, var24.getX(), var24.getY(), var24.getWidth(), var24.getHeight());
               com.aspose.slides.internal.s6.v3[] var26 = new com.aspose.slides.internal.s6.v3[]{var22};
               com.aspose.slides.internal.s6.s0[] var27 = new com.aspose.slides.internal.s6.s0[]{var23};
               List var28 = this.n5(var16, var9, var25, var16.getFillFormat(), var20, var1, var2, var19, var12.c8(), var21, var26, var27);
               var26[0].l6(var22);
               var27[0].n5(var23);
               if (var28.size() != 0) {
                  var10.n5(com.aspose.slides.ms.System.q1.n5((float)(var10.n5()), (float)(var22.n5())));
                  var10.l6(com.aspose.slides.ms.System.q1.n5((float)(var10.l6()), (float)(var22.l6())));
                  var10.k5(com.aspose.slides.ms.System.q1.n5((float)(var10.k5()), (float)(var22.k5())));
                  float var29 = Float.MAX_VALUE;
                  List$Enumerator var30 = var28.iterator();

                  try {
                     while (var30.hasNext()) {
                        y5x var31 = (y5x)var30.next();
                        com.aspose.slides.internal.s6.v3 var32 = new com.aspose.slides.internal.s6.v3();
                        com.aspose.slides.internal.s6.v3 var33 = new com.aspose.slides.internal.s6.v3();
                        com.aspose.slides.internal.s6.v3[] var34 = new com.aspose.slides.internal.s6.v3[]{var32};
                        com.aspose.slides.internal.s6.v3[] var35 = new com.aspose.slides.internal.s6.v3[]{var33};
                        var31.h0().n5(var12.c8(), var34, var35);
                        var34[0].l6(var32);
                        var35[0].l6(var33);
                        var29 = com.aspose.slides.ms.System.q1.l6(var32.k5(), com.aspose.slides.ms.System.q1.l6(var29, var33.k5()));
                     }
                  } finally {
                     if (com.aspose.slides.internal.v6g.k5.n5(var30, IDisposable.class)) {
                        var30.dispose();
                     }
                  }

                  if (!var13.containsKey(var29)) {
                     var13.addItem(var29, var28);
                  } else {
                     ((List)var13.get_Item(var29)).addRange(var28);
                  }

                  if (!var14) {
                     List$Enumerator var118 = var28.iterator();

                     try {
                        while (var118.hasNext()) {
                           y5x var122 = (y5x)var118.next();
                           var14 = var122.c8() == 7 || var122.c8() == 2 || var122.c8() == 3;
                           if (var14) {
                              break;
                           }
                        }
                     } finally {
                        if (com.aspose.slides.internal.v6g.k5.n5(var118, IDisposable.class)) {
                           var118.dispose();
                        }
                     }
                  }
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var15, IDisposable.class)) {
            var15.dispose();
         }
      }

      if (var13.size() == 0) {
         return false;
      }

      com.aspose.slides.internal.s6.v8 var100 = new com.aspose.slides.internal.s6.v8();
      com.aspose.slides.internal.s6.v8[] var102 = new com.aspose.slides.internal.s6.v8[]{var100};
      com.aspose.slides.internal.s6.b3 var103 = this.n5(var1, var5, var10.h0(), var12.c8(), var102);
      var102[0].l6(var100);
      com.aspose.slides.internal.o9b.p8 var104 = this.n5(com.aspose.slides.internal.s6.v8.n5(var100).a6(), var1).u3();
      com.aspose.slides.internal.w0.c8 var105 = new com.aspose.slides.internal.w0.c8();
      var105.n5(
         var3.getRotation(),
         new com.aspose.slides.internal.o9b.w1(
            com.aspose.slides.internal.v6g.k5.u3(var11.n5() - var100.n5() / 2.0F, 13) + var100.n5() / 2.0F,
            com.aspose.slides.internal.v6g.k5.u3(var11.l6() - var100.l6() / 2.0F + var100.l6() / 2.0F, 13)
         )
      );
      com.aspose.slides.internal.s6.e5 var106 = new com.aspose.slides.internal.s6.e5(var104.l6(), var104.k5(), var14);
      var106.n5(0L);
      int var107 = 0;
      IGenericEnumerator var108 = var13.iterator();

      try {
         while (var108.hasNext()) {
            KeyValuePair var109 = (KeyValuePair)var108.next();
            var107++;
            List var111 = (List)var109.getValue();

            for (int var112 = 0; var112 < var111.size(); var112++) {
               y5x var113 = (y5x)var111.get_Item(var112);
               IGenericEnumerator var114 = var113.h0().iterator();

               try {
                  while (var114.hasNext()) {
                     com.aspose.slides.internal.s6.c4 var115 = (com.aspose.slides.internal.s6.c4)var114.next();
                     var115.n5((short)((var107 + 1) * 1000 + (var112 + 1) * 100 + var115.a6()));
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var114, IDisposable.class)) {
                     var114.dispose();
                  }
               }

               var6.n5(var113.s7());
               List var116 = j4u.n5(var6);
               List$Enumerator var117 = var116.iterator();

               try {
                  while (var117.hasNext()) {
                     com.aspose.slides.internal.s6.w1 var119 = (com.aspose.slides.internal.s6.w1)var117.next();
                     var119.k5(var12.l6(var119.k5().h0()).u9().h0());
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var117, IDisposable.class)) {
                     var117.dispose();
                  }
               }

               com.aspose.slides.internal.s6.o0 var120 = null;
               com.aspose.slides.internal.s6.o0 var123 = null;
               com.aspose.slides.internal.s6.o0[] var125 = new com.aspose.slides.internal.s6.o0[]{var120};
               com.aspose.slides.internal.s6.o0[] var126 = new com.aspose.slides.internal.s6.o0[]{var123};
               m7b.n5(var113, var103, var116, var125, var126);
               var120 = var125[0];
               var123 = var126[0];
               var106.n5(var113.h0(), var120, var123);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var108, IDisposable.class)) {
            var108.dispose();
         }
      }

      com.aspose.slides.internal.o9b.t4 var110 = this.n5(var106);

      try {
         this.n5(var1, var110, var105, var11.a6(), var100.u3());
      } finally {
         if (var110 != null) {
            var110.dispose();
         }
      }

      return true;
   }

   private g0 n5(GroupShape var1) {
      f8j var2 = var1.r4().l6();
      if (var2 != null && var2.u9().getCameraType() != -1) {
         g0 var3 = new g0();
         var3.n5(var2.u9().getRotation());
         var3.n5(var2.u9().getFieldOfViewAngle());
         var3.n5(var2.u9().getCameraType());
         return var3;
      } else {
         return null;
      }
   }

   private x2i l6(GroupShape var1) {
      x2i var2 = l0y.n5(var1.r4());
      return var2 != null ? var2 : null;
   }

   private void n5(IGroupShape var1, List<GeometryShape>[] var2) {
      if (var1.getShapes().size() > 0) {
         IGenericEnumerator var3 = var1.getShapes().iterator();

         try {
            while (var3.hasNext()) {
               IShape var4 = (IShape)var3.next();
               if (com.aspose.slides.internal.v6g.k5.l6(var4, IGroupShape.class)) {
                  this.n5((IGroupShape)var4, var2);
               }

               if (com.aspose.slides.internal.v6g.k5.l6(var4, GeometryShape.class)) {
                  var2[0].addItem((GeometryShape)var4);
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }
      }
   }
}
