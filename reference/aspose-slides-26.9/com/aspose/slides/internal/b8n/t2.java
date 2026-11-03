package com.aspose.slides.internal.b8n;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.internal.b5j.n3;
import com.aspose.slides.internal.b5j.t9;
import com.aspose.slides.internal.b5j.x8;
import com.aspose.slides.internal.b5j.y4;
import com.aspose.slides.internal.e1.k7;
import com.aspose.slides.internal.e1.m3;
import com.aspose.slides.internal.e1.w1;
import com.aspose.slides.internal.o9b.f2;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.internal.z0k.e2;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.q1;

public class t2 {
   private Dictionary<String, com.aspose.slides.internal.d0e.t2> n5 = new Dictionary<>();
   private int l6 = 0;
   private n3 k5;
   private t9 u3;
   private n5 a6;
   private u3 u9;
   private x8 h0;
   private a6 c8;
   private com.aspose.slides.internal.b5j.u9 t2;
   private com.aspose.slides.internal.b5j.u3 s7;
   private Dictionary<String, IGenericDictionary<String, String>> x8 = new Dictionary<>();
   private static final com.aspose.slides.internal.v6g.u9 n3 = new com.aspose.slides.internal.v6g.u9(
      "a",
      "circle",
      "ellipse",
      "image",
      "line",
      "foreignObject",
      "path",
      "polygon",
      "polyline",
      "rect",
      "rawText",
      "text",
      "tspan",
      "use",
      "symbol",
      "feBlend",
      "x",
      "y",
      "width",
      "height",
      "transform",
      "xlink:href",
      "href"
   );

   public t2() {
      this(new com.aspose.slides.internal.b5j.l6());
   }

   public t2(com.aspose.slides.internal.b5j.u3 var1) {
      this.s7 = var1;
      this.h0 = new x8();
      this.t2 = new com.aspose.slides.internal.b5j.u9();
      this.k5 = new n3();
      this.u3 = new t9(this.k5);
      this.a6 = new n5(this.u3);
      this.u9 = new u3(this, this.h0, this.k5, this.t2, this.a6);
      this.c8 = new a6(this.u9, this.a6, this.h0, this.k5, this.t2, this.s7);
   }

   public final w1 n5(String var1) {
      com.aspose.slides.internal.d0e.s7 var2 = com.aspose.slides.internal.n1n.l6.n5(var1);
      com.aspose.slides.internal.d0e.t2 var3 = var2.u9;
      y4.n5(var3, this.h0, this.s7);
      y4.n5(var3, false, this.x8);
      y4.n5(var3, this.s7, this.t2);
      f2 var4 = new f2(0.0F, 0.0F);
      com.aspose.slides.internal.e1.t2 var5 = new com.aspose.slides.internal.e1.t2();
      f2[] var6 = new f2[]{var4};
      this.n5(var3, var5, var6);
      var6[0].l6(var4);
      if (var4.l6() == 0.0F || var4.k5() == 0.0F) {
         com.aspose.slides.internal.e1.h0 var7 = new com.aspose.slides.internal.e1.h0();
         y1 var8 = var7.n5((m3)var5).y4();
         if (var4.l6() == 0.0F) {
            var4.n5(var8.h0());
         }

         if (var4.k5() == 0.0F) {
            var4.l6(var8.l6());
         }
      }

      w1 var9 = new w1(var4.l6(), var4.k5());
      if (var5.u3() == null) {
         var5.n5(new com.aspose.slides.internal.w0.c8());
      }

      var9.n5(var5);
      return var9;
   }

   private void n5(com.aspose.slides.internal.d0e.t2 var1, com.aspose.slides.internal.e1.t2 var2, f2[] var3) {
      try {
         if ("svg".equals(var1.u9)) {
            String[] var4 = null;
            if (var1.l6.n5("viewBox")) {
               var4 = d1.n5(var1.l6.k5("viewBox"), new String[]{" ", ","}, 1);
            }

            y4.n5(var1, this.k5, var3, ((com.aspose.slides.internal.d8v.a6)var1).i1());
            if (var1.l6.n5("viewBox")) {
               String var5 = "xMidYMid";
               if (var1.l6.n5("preserveAspectRatio")) {
                  var5 = var1.l6.k5("preserveAspectRatio");
               }

               if (var4.length == 4) {
                  float var6 = com.aspose.slides.internal.v6g.k5.u3(this.k5.n5(var4[0], d1.n5, var1), 13);
                  float var7 = com.aspose.slides.internal.v6g.k5.u3(this.k5.n5(var4[1], d1.n5, var1), 13);
                  this.k5.n5(this.k5.n5(var4[2], "viewBox", var1));
                  this.k5.l6(this.k5.n5(var4[3], "viewBox", var1));
                  float[] var8 = new float[]{var6, var7, this.k5.u3(), this.k5.a6()};
                  com.aspose.slides.internal.w0.c8 var9 = this.u3.n5(var8, var3[0].l6(), var3[0].k5(), var5);
                  if (var2.u3() == null) {
                     var2.n5(new com.aspose.slides.internal.w0.c8());
                  }

                  var2.u3().n5(var9, 1);
               }
            }
         }

         for (int var11 = 0; var11 < var1.j5().n5(); var11++) {
            com.aspose.slides.internal.d0e.t2 var12 = var1.j5().l6(var11);
            if (y4.n5(var12)) {
               if (com.aspose.slides.internal.v6g.k5.l6(var12, com.aspose.slides.internal.d8v.h0.class)) {
                  var12 = n5(var1, var12, var3[0].a6(), this.h0, this.k5, this.x8, true);
               }

               com.aspose.slides.internal.e1.t2 var13 = var2;
               if (var12.l6.n5("clip-path") && "g".equals(var12.u9)) {
                  com.aspose.slides.internal.e1.t2 var14 = new com.aspose.slides.internal.e1.t2();
                  var14.n5(this.u9.n5(var3[0].a6(), var12));
                  var2.n5(var14);
                  if (var14.a6() != null && var12.l6.n5("transform")) {
                     var14.a6().n5(com.aspose.slides.internal.j7.c8.n5(this.u3.n5(var12.l6.k5("transform").toString(), var3[0].a6())));
                  }

                  var2 = var14;
               }

               this.n5(var12, var2, var3[0].a6(), true);
               this.n5(var12, var2, var3);
               var2 = var13;
            }
         }
      } catch (RuntimeException var10) {
         if (!com.aspose.slides.internal.n1n.n5.n5) {
            throw var10;
         }
      }
   }

   public static com.aspose.slides.internal.d0e.t2 n5(
      com.aspose.slides.internal.d0e.t2 var0,
      com.aspose.slides.internal.d0e.t2 var1,
      f2 var2,
      x8 var3,
      n3 var4,
      Dictionary<String, IGenericDictionary<String, String>> var5,
      boolean var6
   ) {
      com.aspose.slides.internal.d8v.h0 var7 = com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.d8v.h0.class);
      String var8 = var7.f2();
      if (var8 == null) {
         var8 = var7.p8();
      }

      com.aspose.slides.internal.d0e.t2 var9 = var3.n5(var8);
      if (var9 == null) {
         return null;
      }

      com.aspose.slides.internal.d0e.t2 var10 = var9.y1();
      if ("rect".equals(var10.u9) && !var10.l6.n5("x")) {
         var10.l6.n5("x", "0");
      }

      if ("rect".equals(var10.u9) && !var10.l6.n5("y")) {
         var10.l6.n5("y", "0");
      }

      var1.j5().l6(var1.j5().n5(), var10);
      if (var1.l6.n5("width") && !var1.l6.n5("bounding-box-width")) {
         var1.l6.n5("bounding-box-width", var1.l6.k5("width"));
      }

      if (var1.l6.n5("height") && !var1.l6.n5("bounding-box-height")) {
         var1.l6.n5("bounding-box-width", var1.l6.k5("height"));
      }

      float var11 = 0.0F;
      float var12 = 0.0F;
      if (var1.l6.n5("x")) {
         var11 = var4.n5(var1.l6.k5("x"), d1.n5, var0);
      }

      if (var1.l6.n5("y")) {
         var12 = var4.n5(var1.l6.k5("y"), d1.n5, var0);
      }

      IGenericEnumerator var13 = var1.l6.iterator();

      try {
         while (var13.hasNext()) {
            KeyValuePair var14 = (KeyValuePair)var13.next();
            if (!"x".equals(var14.getKey()) && !"y".equals(var14.getKey())) {
               if ("fill".equals(var14.getKey()) && var10.l6.n5((String)var14.getKey())) {
                  var10.l6.l6((String)var14.getKey());
               }

               if ("stroke".equals(var14.getKey()) && var10.l6.n5((String)var14.getKey())) {
                  var10.l6.l6((String)var14.getKey());
               }

               if (!var10.l6.n5((String)var14.getKey())) {
                  var10.l6.n5((String)var14.getKey(), (String)var14.getValue());
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var13, IDisposable.class)) {
            var13.dispose();
         }
      }

      var1 = var10;
      y4.n5(var1, true, var5);
      return var1;
   }

   public final void n5(com.aspose.slides.internal.d0e.t2 var1, com.aspose.slides.internal.e1.t2 var2, f2 var3, boolean var4) {
      String var5 = var1.l6.k5("visibility");
      if (!d1.u3("hidden", var5, (short)3) && !d1.u3("collapse", var5, (short)3)) {
         String var6 = var1.l6.k5("display");
         if (!d1.u3("none", var6, (short)3)) {
            if (y4.l6(var1)) {
               this.c8.n5(var2);

               try {
                  switch (n3.n5(var1.u9)) {
                     case 0:
                        this.n5(var1);
                        break;
                     case 1:
                        this.u9.l6(var1, var2, var3.a6());
                        break;
                     case 2:
                        this.u9.k5(var1, var2, var3.a6());
                        break;
                     case 3:
                        this.n5(var1, var2, var3.a6());
                        break;
                     case 4:
                        var1.z3();
                        this.u9.u3(var1, var2, var3.a6());
                        break;
                     case 5:
                        this.l6(var1);
                        break;
                     case 6:
                        this.u9.n5(var1, var2, var3.a6());
                        break;
                     case 7:
                        this.u9.l6(var1, var2, var3.a6(), true);
                        break;
                     case 8:
                        this.u9.l6(var1, var2, var3.a6(), false);
                        break;
                     case 9:
                        Dictionary var7 = var1.k5;
                        if (var7.containsKey("stroke-width") && "-1".equals(var7.get_Item("stroke-width"))) {
                           var7.removeItemByKey("stroke-width");
                           var7.addItem("stroke-width", "1");
                        }

                        this.u9.n5(var1, var2, var3.a6(), var4);
                        break;
                     case 10:
                        if ("text".equals(var1.n5.u9) || "altGlyph".equals(var1.n5.u9) || "tspan".equals(var1.n5.u9)) {
                           this.c8.n5((com.aspose.slides.internal.j7h.n5)var1, var3.a6());
                        }
                        break;
                     case 11:
                        this.c8.n5(0.0F);
                        this.c8.n5((com.aspose.slides.internal.j7h.u3)var1, var3.a6());
                        break;
                     case 12:
                        this.c8.n5((com.aspose.slides.internal.j7h.u3)var1, var3.a6());
                        break;
                     case 13:
                        this.l6(var1, var2, var3.a6(), true);
                        break;
                     case 14:
                        IGenericEnumerator var8 = var1.j5().iterator();

                        try {
                           while (var8.hasNext()) {
                              KeyValuePair var9 = (KeyValuePair)var8.next();
                              this.n5((com.aspose.slides.internal.d0e.t2)var9.getValue(), var2, var3.a6(), var4);
                           }
                        } finally {
                           if (com.aspose.slides.internal.v6g.k5.n5(var8, IDisposable.class)) {
                              var8.dispose();
                           }
                        }
                  }
               } catch (RuntimeException var14) {
                  if (!com.aspose.slides.internal.n1n.n5.n5) {
                     throw var14;
                  }
               }
            }
         }
      }
   }

   private void n5(com.aspose.slides.internal.d0e.t2 var1, com.aspose.slides.internal.d0e.t2 var2, String[] var3) {
      for (String var7 : var3) {
         if (var1.l6.n5(var7) && !var2.l6.n5(var7)) {
            var2.l6.n5(var7, var1.l6.k5(var7));
         }
      }
   }

   private void l6(com.aspose.slides.internal.d0e.t2 var1, com.aspose.slides.internal.e1.t2 var2, f2 var3) {
      for (int var4 = 0; var4 < var1.j5().n5(); var4++) {
         com.aspose.slides.internal.d0e.t2 var5 = var1.j5().l6(var4);
         if (var5.l6.n5("result")) {
            if ("feImage".equals(var5.u9)) {
               this.n5(var1, var5, new String[]{"x", "y", "width", "height"});
            }

            this.n5.addItem(var5.l6.k5("result"), var5);
         }
      }

      for (int var6 = 0; var6 < var1.j5().n5(); var6++) {
         com.aspose.slides.internal.d0e.t2 var7 = var1.j5().l6(var6);
         switch (n3.n5(var7.u9)) {
            case 15:
               this.k5(var7, var2, var3.a6());
               break;
         }
      }
   }

   private void k5(com.aspose.slides.internal.d0e.t2 var1, com.aspose.slides.internal.e1.t2 var2, f2 var3) {
      if (var1.l6.n5("in") && this.n5.containsKey(var1.l6.k5("in"))) {
         com.aspose.slides.internal.d0e.t2 var4 = this.n5.get_Item(var1.l6.k5("in").toString());
         if (var1.l6.n5("mode")) {
            var4.l6.n5("mode", var1.l6.k5("mode").toString());
         }

         this.l6++;
         this.n5(var4, var2, var3.a6());
      }

      if (var1.l6.n5("in2") && this.n5.containsKey(var1.l6.k5("in2"))) {
         com.aspose.slides.internal.d0e.t2 var5 = this.n5.get_Item(var1.l6.k5("in2").toString());
         if (var1.l6.n5("mode")) {
            var5.l6.n5("mode", var1.l6.k5("mode").toString());
         }

         var5.h0 = this.l6++;
         this.n5(var5, var2, var3.a6());
      }
   }

   public final void l6(com.aspose.slides.internal.d0e.t2 var1, com.aspose.slides.internal.e1.t2 var2, f2 var3, boolean var4) {
      try {
         String var5 = d1.n5;
         if (var1.l6.n5("xlink:href")) {
            var5 = d1.n5(var1.l6.k5("xlink:href").toString(), "#", d1.n5);
         }

         if (this.h0.l6().containsKey(var5)) {
            com.aspose.slides.internal.d0e.t2 var6 = this.h0.l6().get_Item(var5);
            this.n5(var6, var2, var3.a6(), true);
         }

         if (var1.l6.n5("filter")) {
            String var8 = y4.k5(var1.l6.k5("filter").toString());
            this.l6(this.h0.l6().get_Item(var8), var2, var3.a6());
         }
      } catch (RuntimeException var7) {
         if (!com.aspose.slides.internal.n1n.n5.n5) {
            throw var7;
         }
      }
   }

   public final void n5(com.aspose.slides.internal.d0e.t2 var1) {
   }

   public final void n5(com.aspose.slides.internal.d0e.t2 var1, com.aspose.slides.internal.e1.t2 var2, f2 var3) {
      try {
         float var4 = 0.0F;
         float var5 = 0.0F;
         float var6 = 0.0F;
         float var7 = 0.0F;
         com.aspose.slides.internal.w0.c8 var8 = new com.aspose.slides.internal.w0.c8();
         byte[] var9 = new byte[0];
         IGenericEnumerator var10 = var1.l6.iterator();

         try {
            while (var10.hasNext()) {
               KeyValuePair var11 = (KeyValuePair)var10.next();
               switch (n3.n5((String)var11.getKey())) {
                  case 16:
                     var4 = this.k5.n5(var1.l6.k5("x").toString(), "x", var1);
                     break;
                  case 17:
                     var5 = this.k5.n5(var1.l6.k5("y").toString(), "y", var1);
                     break;
                  case 18:
                     var6 = this.k5.n5(var1.l6.k5("width").toString(), "width", var1);
                     break;
                  case 19:
                     var7 = this.k5.n5(var1.l6.k5("height").toString(), "height", var1);
                     break;
                  case 20:
                     var8 = com.aspose.slides.internal.j7.c8.n5(this.u3.n5(var1.l6.k5("transform"), var3.a6()));
                     break;
                  case 21:
                     var9 = this.s7.n5(this, new com.aspose.slides.internal.n1n.k5(var1.l6.k5("xlink:href").toString())).n5();
                     break;
                  case 22:
                     var9 = ((com.aspose.slides.internal.d8v.k5)var1).n5(this.s7);
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var10, IDisposable.class)) {
               var10.dispose();
            }
         }

         if (var9.length > 0) {
            com.aspose.slides.internal.e1.t2 var25 = new com.aspose.slides.internal.e1.t2();
            var25.n5(new com.aspose.slides.internal.w0.c8());
            float var12 = 0.0F;
            float var13 = 0.0F;
            float[] var14 = new float[]{0.0F};
            float[] var15 = new float[]{0.0F};
            n5(var9, var14, var15);
            var12 = var14[0];
            var13 = var15[0];
            f2 var16 = new f2(var12, var13);
            float[] var17 = new float[]{0.0F, 0.0F, var12, var13};
            var12 = q1.l6(var6, var3.l6());
            var13 = q1.l6(var7, var3.k5());
            String var18 = "xMidYMid";
            if (var1.l6.n5("preserveAspectRatio")) {
               var18 = var1.l6.k5("preserveAspectRatio");
            }

            com.aspose.slides.internal.w0.c8 var19 = this.u3.n5(var17, var12, var13, var18);
            y1 var20 = var19.n5(new y1(new com.aspose.slides.internal.o9b.w1(0.0F, 0.0F), var16.a6())).y4();
            var8.n5(new y1(new com.aspose.slides.internal.o9b.w1(var4 + var20.x8(), var5 + var20.n3()), var20.c8().a6())).a6(var20);
            var25.n5(new k7(new com.aspose.slides.internal.o9b.w1(var20.x8(), var20.n3()), var20.c8().a6(), var9));
            var2.n5(var25);
         }
      } catch (RuntimeException var24) {
         if (!com.aspose.slides.internal.n1n.n5.n5) {
            throw var24;
         }
      }
   }

   private static void n5(byte[] var0, float[] var1, float[] var2) {
      com.aspose.slides.internal.o9b.l6 var3 = new com.aspose.slides.internal.o9b.l6(new e2(var0));

      try {
         var1[0] = var3.e2();
         var2[0] = var3.h0();
      } finally {
         if (var3 != null) {
            var3.dispose();
         }
      }
   }

   public final void l6(com.aspose.slides.internal.d0e.t2 var1) {
      try {
         String var2 = d1.n5;
         if (var1.l6.n5("requiredExtensions")) {
            var2 = var1.l6.k5("requiredExtensions").toString();
         }

         switch (n3.n5(var2)) {
         }
      } catch (RuntimeException var3) {
         if (!com.aspose.slides.internal.n1n.n5.n5) {
            throw var3;
         }
      }
   }
}
