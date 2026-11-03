package com.aspose.slides.internal.b8n;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.b5j.e2;
import com.aspose.slides.internal.b5j.n3;
import com.aspose.slides.internal.b5j.t9;
import com.aspose.slides.internal.b5j.x8;
import com.aspose.slides.internal.b5j.y4;
import com.aspose.slides.internal.e1.r4;
import com.aspose.slides.internal.n2d.t4;
import com.aspose.slides.internal.o9b.f2;
import com.aspose.slides.internal.o9b.i1;
import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.internal.x4g.m1;
import com.aspose.slides.internal.x4g.m3;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.n1;
import com.aspose.slides.ms.System.q1;
import com.aspose.slides.ms.System.z3;

public class k5 {
   private List<String> n5 = new List<>(com.aspose.slides.ms.System.u3.n5(new String[]{"path", "circle", "rect", "ellipse", "polygon"}));
   private final n3 l6;
   private final x8 k5;
   private final t9 u3;
   private final n5 a6;
   private final com.aspose.slides.internal.b5j.u9 u9;
   private u3 h0;
   private static final com.aspose.slides.internal.v6g.u9 c8 = new com.aspose.slides.internal.v6g.u9(
      "fill",
      "fill-opacity",
      "fill-rule",
      "opacity",
      "stroke",
      "stroke-dasharray",
      "stroke-dashoffset",
      "stroke-linecap",
      "stroke-linejoin",
      "stroke-opacity",
      "stroke-width",
      "scale",
      "butt",
      "square",
      "round",
      "miter",
      "bevel"
   );

   public k5(u3 var1, x8 var2, n3 var3, t9 var4, com.aspose.slides.internal.b5j.u9 var5, n5 var6) {
      this.l6 = var3;
      this.k5 = var2;
      this.u3 = var4;
      this.u9 = var5;
      this.a6 = var6;
      this.h0 = var1;
   }

   public final void n5(r4 var1, com.aspose.slides.internal.d0e.t2 var2, f2 var3, com.aspose.slides.internal.e1.t2 var4) {
      try {
         com.aspose.slides.internal.d0e.a6 var5 = com.aspose.slides.internal.v6g.k5.n5(var2, com.aspose.slides.internal.d0e.a6.class);
         com.aspose.slides.internal.b5j.a6 var6 = new com.aspose.slides.internal.b5j.a6();
         if (var2.l6.n5("style")) {
            String var24 = var2.l6.k5("style");
            String[] var26 = d1.n5(var24, new String[]{";", "\r", "\n", "\t"}, 1);

            for (String var12 : var26) {
               this.n5(d1.l6(d1.n5(var12, ':')[0]), d1.l6(d1.n5(var12, ':')[1]), var1, var2, var3.a6(), var6, var4);
            }
         } else {
            List var7 = com.aspose.slides.internal.f5n.k5.n5(this.u9.n5(), var5.u9(), var5.a6());
            List$Enumerator var8 = var7.iterator();

            try {
               while (var8.hasNext()) {
                  com.aspose.slides.internal.k5.n5 var9 = (com.aspose.slides.internal.k5.n5)var8.next();
                  if (d1.u3("hidden", var9.h9(), (short)3) || d1.u3("collapse", var9.h9(), (short)3)) {
                     return;
                  }

                  if (d1.u3("none", var9.a5(), (short)3)) {
                     return;
                  }

                  if (!d1.n5(var9.o2())) {
                     var5.u3(var9.o2());
                  }

                  if (!d1.n5(var9.e0())) {
                     var5.k5(var9.e0());
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var8, IDisposable.class)) {
                  var8.dispose();
               }
            }
         }

         IGenericEnumerator var25 = var2.l6.iterator();

         try {
            while (var25.hasNext()) {
               KeyValuePair var27 = (KeyValuePair)var25.next();
               String var31 = var27.getValue() != null ? (String)var27.getValue() : d1.n5;
               this.n5(d1.l6((String)var27.getKey()), d1.l6(var31), var1, var2, var3.a6(), var6, var4);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var25, IDisposable.class)) {
               var25.dispose();
            }
         }

         if (!var2.l6.n5("fill") && this.n5.containsItem(var2.u9)) {
            var1.n5(new com.aspose.slides.internal.w0.n3(com.aspose.slides.internal.t6j.k5.n5(com.aspose.slides.internal.o9b.c8.m3().o8())));
         }

         if (var6.t2 != 0.0F) {
            if (var1.k5() != null && com.aspose.slides.internal.v6g.k5.l6(var1.k5(), com.aspose.slides.internal.w0.n3.class)) {
               com.aspose.slides.internal.w0.n3 var28 = (com.aspose.slides.internal.w0.n3)var1.k5();
               var28.n5(
                  new com.aspose.slides.internal.p1s.n5(
                     com.aspose.slides.internal.v6g.k5.u3(var28.l6().l6() * var6.t2, 13), var28.l6().k5(), var28.l6().u3(), var28.l6().a6()
                  )
               );
            }
         } else {
            var1.n5((com.aspose.slides.internal.w0.l6)null);
         }

         if (var6.c8 != 0.0F) {
            com.aspose.slides.internal.p1s.n5 var29 = new com.aspose.slides.internal.p1s.n5(
               com.aspose.slides.internal.v6g.k5.u3(var6.n5.l6() * var6.c8, 13), var6.n5.k5(), var6.n5.u3(), var6.n5.a6()
            );
            float var32 = this.l6.n5(var5.c8(), "xy", var2, var3.a6());
            com.aspose.slides.internal.w0.s7 var33 = new com.aspose.slides.internal.w0.s7(var29, var32 * q1.n5(var6.s7));
            if (var6.a6.length > 1) {
               var33.n5(var6.a6);
            }

            if (var6.u9 != -1.0F) {
               var33.k5(var6.u9);
            }

            if (var6.k5 != -1) {
               switch (var6.k5) {
                  case 2:
                     var33.a6(2);
                     break;
                  case 3:
                     var33.a6(3);
                     break;
                  default:
                     var33.a6(0);
               }

               var33.l6(var6.k5);
               var33.k5(var6.k5);
            }

            switch (var6.u3) {
               case 1:
                  var33.u3(2);
                  break;
               case 2:
                  var33.u3(1);
                  break;
               default:
                  var33.u3(0);
                  var33.l6(com.aspose.slides.internal.b3z.c8.n5(var2.l6.k5("stroke-miterlimit", "4"), 4.0F));
            }

            var1.n5(var33);
         } else {
            var1.n5((com.aspose.slides.internal.w0.s7)null);
         }
      } catch (RuntimeException var23) {
         if (!com.aspose.slides.internal.n1n.n5.n5) {
            throw var23;
         }
      }
   }

   public final void n5(
      String var1,
      String var2,
      r4 var3,
      com.aspose.slides.internal.d0e.t2 var4,
      f2 var5,
      com.aspose.slides.internal.b5j.a6 var6,
      com.aspose.slides.internal.e1.t2 var7
   ) {
      try {
         var3.k5(1);
         switch (c8.n5(var1)) {
            case 0:
               if (!"none".equals(var2)) {
                  this.n5(var3, var4, var2, var5.a6(), var7);
               }
               break;
            case 1:
               var6.t2 = com.aspose.slides.internal.v6g.k5.c8(z3.y4(var2, com.aspose.slides.internal.x7n.l6.k5()), 15);
               break;
            case 2:
               if ("winding".equals(var2)) {
                  var3.k5(1);
               } else if ("evenodd".equals(var2)) {
                  var3.k5(0);
               }
               break;
            case 3:
               var6.t2 = com.aspose.slides.internal.v6g.k5.c8(z3.y4(var2, com.aspose.slides.internal.x7n.l6.k5()), 15);
               break;
            case 4:
               if (!"none".equals(var2)) {
                  var6.l6 = true;
                  var6.n5 = com.aspose.slides.internal.t6j.k5.n5(com.aspose.slides.internal.b3z.u3.n5(var2).n5().o8());
               } else {
                  var6.l6 = false;
               }
               break;
            case 5:
               var6.a6 = this.n5(var2, var3, var5.a6());
               break;
            case 6:
               var6.u9 = (float)q1.a6(this.l6.n5(var2, d1.n5, var4));
               break;
            case 7:
               var6.k5 = this.n5(var2);
               break;
            case 8:
               var6.u3 = this.l6(var2);
               break;
            case 9:
               var6.c8 = com.aspose.slides.internal.v6g.k5.c8(z3.y4(var2, com.aspose.slides.internal.x7n.l6.k5()), 15);
               break;
            case 10:
               var6.h0 = this.l6.n5(var2, "xy", var4);
         }

         if (var4.l6.n5("transform") && d1.t2(var4.l6.k5("transform"), "scale")) {
            Dictionary var8 = this.u3.l6(var4.l6.k5("transform"), var5.a6());
            float var9 = 1.0F;
            int var10 = var8.size() - 1;

            while (var10 >= 0) {
               e2 var11 = (e2)var8.get_Item(var10);
               String var12 = var11.n5;
               float[] var13 = var11.l6;
               switch (c8.n5(var12)) {
                  case 11:
                     float var14 = var13[0];
                     if (var13[1] < var14) {
                        var14 = var13[1];
                     }

                     if (var9 == 1.0F) {
                        var9 = var14;
                     } else {
                        var9 *= var14;
                     }
                  default:
                     var10--;
               }
            }

            var6.s7 = var9;
         }
      } catch (RuntimeException var15) {
         if (!com.aspose.slides.internal.n1n.n5.n5) {
            throw var15;
         }
      }
   }

   public final int n5(String var1) {
      switch (c8.n5(var1)) {
         case 12:
            return 0;
         case 13:
            return 1;
         case 14:
            return 2;
         default:
            return 0;
      }
   }

   public final int l6(String var1) {
      switch (c8.n5(var1)) {
         case 14:
            return 1;
         case 15:
            return 0;
         case 16:
            return 2;
         default:
            return 0;
      }
   }

   public final float[] n5(String var1, r4 var2, f2 var3) {
      String[] var4 = d1.n5(var1, new String[]{" ", ","}, 1);
      if (var4.length == 1 && "null".equals(var4[0])) {
         return new float[0];
      }

      float[] var5 = new float[var4.length];

      for (int var6 = 0; var6 < var4.length; var6++) {
         var5[var6] = com.aspose.slides.internal.v6g.k5.c8(z3.y4(this.l6.n5(var4[var6], d1.n5, null)), 15);
      }

      return var5;
   }

   public final void n5(r4 var1, com.aspose.slides.internal.d0e.t2 var2, String var3, f2 var4, com.aspose.slides.internal.e1.t2 var5) {
      if (d1.l6(var3, "url(#")) {
         String var6 = y4.k5(var3);
         if (this.k5.l6().containsKey(var6)) {
            com.aspose.slides.internal.d0e.t2 var7 = this.k5.l6().get_Item(var6);
            if ("linearGradient".equals(var7.u9)) {
               if (var7.l6.n5("xlink:href")) {
                  String var8 = y4.k5(var7.l6.k5("xlink:href").toString());
                  if (this.k5.l6().containsKey(var8)) {
                     com.aspose.slides.internal.d0e.t2 var9 = this.k5.l6().get_Item(var8);

                     for (int var10 = 0; var10 < var9.j5().n5(); var10++) {
                        var7.j5().l6(var10, var9.j5().l6(var10));
                     }
                  }
               }

               new w1();
               new w1();
               y1 var29 = this.h0.n5(var1).y4();
               w1 var21;
               w1 var25;
               if (var7.l6.n5("x1") && var7.l6.n5("x2") && var7.l6.n5("y1") && var7.l6.n5("y2")) {
                  float var11 = this.n5("x1", var7.l6, var29.y4());
                  float var12 = this.n5("y1", var7.l6, var29.y4());
                  float var13 = this.n5("x2", var7.l6, var29.y4());
                  float var14 = this.n5("y2", var7.l6, var29.y4());
                  var21 = new w1(var11, var12);
                  var25 = new w1(var13, var14);
               } else {
                  var21 = new w1(var29.a6(), 0.0F);
                  var25 = new w1(var29.h0(), 0.0F);
               }

               y1 var33 = var29.y4();
               if (n1.l6(var33.k5(), 0.0F)) {
                  var33.n5(var33.k5() + 0.01F);
               }

               if (n1.l6(var33.s7(), 0.0F)) {
                  var33.l6(var33.s7() + 0.01F);
               }

               var1.n5(this.n5(var7, var21.u3(), var25.u3(), var33.y4(), var4.a6()));
            }

            if ("radialGradient".equals(var7.u9)) {
               if (var7.l6.n5("xlink:href")) {
                  String var22 = y4.k5(var7.l6.k5("xlink:href").toString());
                  if (this.k5.l6().containsKey(var22)) {
                     com.aspose.slides.internal.d0e.t2 var26 = this.k5.l6().get_Item(var22);

                     for (int var30 = 0; var30 < var26.j5().n5(); var30++) {
                        var7.j5().l6(var30, var26.j5().l6(var30));
                     }
                  }
               }

               y1 var23 = this.h0.n5(var1).y4();
               float var27 = this.l6.n5(var23.y4(), 50.0F, false);
               float var31 = this.l6.n5(var23.y4(), 50.0F, true);
               float var34 = this.l6.n5(var23.y4(), 50.0F, false);
               float var35 = 0.0F;
               float var36 = 0.0F;
               if (var7.l6.n5("cx")) {
                  var27 = this.l6.n5(var7.l6.k5("cx").toString(), "x", var2, var23.c8().a6());
               }

               if (var7.l6.n5("cy")) {
                  var31 = this.l6.n5(var7.l6.k5("cy").toString(), "y", var2, var23.c8().a6());
               }

               if (var7.l6.n5("fx")) {
                  var35 = this.l6.n5(var7.l6.k5("fx").toString(), "x", var2, var23.c8().a6());
               }

               if (var7.l6.n5("fy")) {
                  var36 = this.l6.n5(var7.l6.k5("fy").toString(), "y", var2, var23.c8().a6());
               }

               if (var7.l6.n5("r")) {
                  var34 = this.l6.n5(var7.l6.k5("r").toString(), "xy", var2, var23.c8().a6());
               }

               List var37 = new List();
               List var15 = new List();

               for (int var16 = 0; var16 < var7.j5().n5(); var16++) {
                  com.aspose.slides.internal.w5i.u9 var17 = com.aspose.slides.internal.v6g.k5.n5(var7.j5().l6(var16), com.aspose.slides.internal.w5i.u9.class);
                  if (var17 != null) {
                     var15.addItem(this.l6.n5(var23.y4(), var17.a0() * 100.0F, false));
                     var37.addItem(var17);
                  }
               }

               var37.reverse();
               var1.n5(
                  n5(
                     this.n5(var27, var31, var34, var35, var36, 1.0F, (com.aspose.slides.internal.w5i.u9[])var37.toArray(new com.aspose.slides.internal.w5i.u9[0]), t4.k5(var15), var23.s7()),
                     var23.y4(),
                     1.0F
                  )
               );
            } else if ("pattern".equals(var7.u9) && this.k5.l6().containsKey(var6)) {
               com.aspose.slides.internal.e1.t2 var24 = new com.aspose.slides.internal.e1.t2();
               IGenericEnumerator var28 = var7.j5().iterator();

               try {
                  while (var28.hasNext()) {
                     KeyValuePair var32 = (KeyValuePair)var28.next();
                     this.h0.l6().n5((com.aspose.slides.internal.d0e.t2)var32.getValue(), var24, var4.a6(), true);
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var28, IDisposable.class)) {
                     var28.dispose();
                  }
               }

               var5.n5(var24);
            }
         }
      } else {
         var1.n5(new com.aspose.slides.internal.w0.n3(com.aspose.slides.internal.t6j.k5.n5(com.aspose.slides.internal.b3z.u3.n5(var3).n5().o8())));
      }
   }

   private float n5(String var1, com.aspose.slides.internal.d0e.k5 var2, y1 var3) {
      if (!d1.n5(var1) && (d1.t2(var1, "x") || d1.t2(var1, "y"))) {
         if (!var2.n5(var1)) {
            throw new ArgumentException("keyValue is not present in properties collection.");
         } else {
            String var4 = var2.k5(var1);
            float var5 = d1.t2(var1, "x") ? var3.x8() : var3.n3();
            float var6 = d1.t2(var1, "x") ? var3.s7() : var3.k5();
            if (d1.t2(var4, "%")) {
               float var7 = n1.n5(d1.n5(var4, "%", d1.n5), com.aspose.slides.internal.x7n.l6.k5()) / 100.0F;
               return var5 + var6 * var7;
            } else {
               return n1.n5(var4, com.aspose.slides.internal.x7n.l6.k5());
            }
         }
      } else {
         throw new ArgumentException("Invalid or missing keyValue.");
      }
   }

   public static com.aspose.slides.internal.w0.y4 n5(m3 var0, y1 var1, float var2) {
      com.aspose.slides.internal.j7.n5 var3 = new com.aspose.slides.internal.j7.n5(
         com.aspose.slides.internal.v6g.k5.u3(q1.l6((double)var1.s7()), 14), com.aspose.slides.internal.v6g.k5.u3(q1.l6((double)var1.k5()), 14)
      );

      try {
         com.aspose.slides.internal.j7.h0 var4 = new com.aspose.slides.internal.j7.h0(var3);

         try {
            com.aspose.slides.internal.z0k.e2 var5 = new com.aspose.slides.internal.z0k.e2();

            try {
               com.aspose.slides.internal.w0.c8 var6 = com.aspose.slides.internal.j7.c8.n5(var0.e2());
               var0.k5(new m1());
               var4.l6().n5(new i1(var0.n3().n5()[0].o8()), 0, 0, var3.l6(), var3.k5());
               var4.l6().n5(var0, 0, 0, var3.l6(), var3.k5());
               var3.n5(var5, 5);
               byte[] var7 = var5.toArray();
               com.aspose.slides.internal.w0.y4 var8 = new com.aspose.slides.internal.w0.y4(var7);
               var8.n5(4);
               var8.n5(var2);
               return var8;
            } finally {
               if (var5 != null) {
                  var5.dispose();
               }
            }
         } finally {
            if (var4 != null) {
               var4.dispose();
            }
         }
      } finally {
         if (var3 != null) {
            var3.dispose();
         }
      }
   }

   public final m3 n5(
      float var1, float var2, float var3, float var4, float var5, float var6, com.aspose.slides.internal.w5i.u9[] var7, float[] var8, float var9
   ) {
      com.aspose.slides.internal.x4g.s7 var10 = new com.aspose.slides.internal.x4g.s7();
      if (var3 > 0.0F) {
         y1 var11 = new y1(0.0F, 0.0F, var3 * 2.0F, var3 * 2.0F);
         var10.n5(var11.x8() - (var11.s7() * 0.5F - var1), var11.n3() - (var11.k5() * 0.5F - var2), var11.s7(), var11.k5());
         m3 var12 = new m3(var10);
         var12.n5(new w1(var4, var5));
         com.aspose.slides.internal.x4g.a6 var13 = this.n5(var6, var7, var8, var9);
         var12.n5(var13);
         return var12;
      } else {
         return null;
      }
   }

   public final com.aspose.slides.internal.w0.h0 n5(com.aspose.slides.internal.d0e.t2 var1, w1 var2, w1 var3, y1 var4, f2 var5) {
      float var6 = 1.0F;
      if (var1.l6.n5("fill-opacity")) {
         String var7 = var1.l6.k5("fill-opacity");
         if (!d1.n5(var7)) {
            var6 = com.aspose.slides.internal.v6g.k5.c8(z3.y4(var7, com.aspose.slides.internal.x7n.l6.k5()), 15);
         }
      }

      List var13 = new List();
      List var8 = new List();

      for (int var9 = 0; var9 < var1.j5().n5(); var9++) {
         com.aspose.slides.internal.w5i.u9 var10 = com.aspose.slides.internal.v6g.k5.n5(var1.j5().l6(var9), com.aspose.slides.internal.w5i.u9.class);
         if (var10 != null) {
            var8.addItem(this.l6.n5(var4.y4(), var10.a0() * 100.0F, false));
            var13.addItem(var10);
         }
      }

      var13.reverse();
      if (var13.size() <= 0) {
         return null;
      }

      com.aspose.slides.internal.x4g.a6 var14 = this.n5(var6, (com.aspose.slides.internal.w5i.u9[])var13.toArray(new com.aspose.slides.internal.w5i.u9[0]), t4.k5(var8), var4.s7());
      List var15 = new List();

      for (int var11 = 0; var11 < var14.n5().length; var11++) {
         com.aspose.slides.internal.w0.u9 var12 = new com.aspose.slides.internal.w0.u9(
            com.aspose.slides.internal.p1s.n5.n5(var14.n5()[var11].o8()), var14.l6()[var11]
         );
         var15.addItem(var12);
      }

      com.aspose.slides.internal.w0.h0 var16 = new com.aspose.slides.internal.w0.h0(
         var2.u3(),
         var3.u3(),
         ((com.aspose.slides.internal.w0.u9)var15.get_Item(0)).n5(),
         ((com.aspose.slides.internal.w0.u9)var15.get_Item(var15.size() - 1)).n5()
      );
      var16.n5(var4.y4());
      var16.n5((com.aspose.slides.internal.w0.u9[])var15.toArray(new com.aspose.slides.internal.w0.u9[0]));
      var16.n5(1);
      if (var1.l6.n5("gradientTransform")) {
         var16.n5(com.aspose.slides.internal.j7.c8.n5(this.u3.n5(var1.l6.k5("gradientTransform"), var5.a6())));
      }

      return var16;
   }

   private com.aspose.slides.internal.x4g.a6 n5(float var1, com.aspose.slides.internal.w5i.u9[] var2, float[] var3, float var4) {
      com.aspose.slides.internal.x4g.a6 var5 = new com.aspose.slides.internal.x4g.a6();
      int var6 = var2.length;
      boolean var7 = false;
      boolean var8 = false;
      if (var3[0] > 0.0F) {
         var6++;
         var7 = true;
      }

      float var9 = var3[var2.length - 1];
      if (var9 < 100.0F || var9 < 1.0F) {
         var6++;
         var8 = true;
      }

      var5.n5(new float[var6]);
      var5.n5(
         (com.aspose.slides.internal.o9b.c8[])com.aspose.slides.ms.System.u3.n5(
            com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.c8.class), var6)
         )
      );
      int var10 = 0;
      float var11 = 0.0F;
      float var12 = 0.0F;
      com.aspose.slides.internal.o9b.c8 var13 = com.aspose.slides.internal.o9b.c8.m3().o8();

      for (int var14 = 0; var14 < var6; var14++) {
         var11 = var1 * var2[var10].d5();
         var12 = var3[var10] / var4;
         com.aspose.slides.internal.o9b.c8.n5(com.aspose.slides.internal.v6g.k5.u3(var11 * 255.0F, 13), var2[var10++].d2().n5().o8()).n5(var13);
         if (var7 && var14 == 0) {
            var5.l6()[var14] = 0.0F;
            var13.n5(var5.n5()[var14++]);
         }

         var5.l6()[var14] = var12;
         var13.n5(var5.n5()[var14]);
         if (var8 && var14 == var6 - 2) {
            var5.l6()[var14 + 1] = 1.0F;
            var13.n5(var5.n5()[++var14]);
         }
      }

      if (var5.l6()[var5.l6().length - 1] != 1.0F) {
         var5.l6()[var5.l6().length - 1] = 1.0F;
      }

      return var5;
   }
}
