package com.aspose.slides.internal.a8;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.j3.z8;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.internal.q0.e2;
import com.aspose.slides.internal.w8.e9;
import com.aspose.slides.internal.w8.j5;
import com.aspose.slides.internal.w8.o5;
import com.aspose.slides.internal.w8.t9;
import com.aspose.slides.internal.w8.w2;
import com.aspose.slides.internal.w8.z6;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.n1;

public class x8 {
   private final s7 n5;
   private final com.aspose.slides.internal.j4.l6 l6;
   private static final com.aspose.slides.internal.r7c.c8 k5 = new com.aspose.slides.internal.r7c.c8("&#[xX][0-9a-fA-F]{2,6};");
   private static final com.aspose.slides.internal.x7n.l6 u3 = com.aspose.slides.internal.h5.n5.n5;
   private final int a6 = com.aspose.slides.internal.o9b.c8.e2().h0();
   private final int u9 = com.aspose.slides.internal.o9b.c8.w4().h0();
   private final c8 h0;
   private static final com.aspose.slides.internal.v6g.u9 c8 = new com.aspose.slides.internal.v6g.u9("src", "background-image");

   public x8(c8 var1, s7 var2, com.aspose.slides.internal.j4.l6 var3) {
      this.n5 = var2;
      this.l6 = var3;
      this.h0 = var1;
   }

   private x8 k7() {
      this.n5.n5("fo:root", null, null, com.aspose.slides.internal.a8.l6.n5.n5());
      return this;
   }

   public final x8 n5(com.aspose.slides.internal.z5.l6 var1, j5 var2) {
      this.k7();
      this.n5.n5("fo", "root", "http://www.w3.org/1999/XSL/Format");
      this.l6(var1, var2);
      return this;
   }

   private x8 l6(com.aspose.slides.internal.z5.l6 var1, j5 var2) {
      t2 var3 = new t2(this.h0);
      int var4 = var2.a3().c8().n5().h0();
      if (this.a6 == var4 || this.u9 == var4) {
         com.aspose.slides.internal.w8.c8 var5 = ((t9)var2.y4()).p3();
         var4 = var5.a3().c8().n5().h0();
      }

      if (this.a6 != var4 && this.u9 != var4) {
         var3.u9(d1.n5("#{0:x6}", new Object[]{var4 & 16777215}));
      }

      this.l6("layout-master-set", "http://www.w3.org/1999/XSL/Format");
      if (var1.h0().a6() != null) {
         t2 var6 = this.n5("any_page", var1.h0().a6());
         this.n5("simple-page-master", "http://www.w3.org/1999/XSL/Format", var6).n5("region-body", var3).l6().l6();
      }

      if (var1.h0().u9() != null) {
         t2 var7 = this.n5("first_page", var1.h0().u9());
         this.n5("simple-page-master", "http://www.w3.org/1999/XSL/Format", var7).n5("region-body", var3).l6().l6();
      }

      if (var1.h0().h0() != null) {
         t2 var8 = this.n5("last_page", var1.h0().h0());
         this.n5("simple-page-master", "http://www.w3.org/1999/XSL/Format", var8).n5("region-body", var3).l6().l6();
      }

      if (var1.h0().k5() != null) {
         t2 var9 = this.n5("odd_page", var1.h0().k5());
         this.n5("simple-page-master", "http://www.w3.org/1999/XSL/Format", var9).n5("region-body", var3).l6().l6();
      }

      if (var1.h0().u3() != null) {
         t2 var10 = this.n5("even_page", var1.h0().u3());
         this.n5("simple-page-master", "http://www.w3.org/1999/XSL/Format", var10).n5("region-body", var3).l6().l6();
      }

      t2 var11 = new t2(this.h0);
      var11.u4("page_layuot");
      this.n5("page-sequence-master", "http://www.w3.org/1999/XSL/Format", var11);
      if (var1.h0().a6() != null && var1.h0().u9() == null && var1.h0().h0() == null) {
         var11 = new t2(this.h0);
         var11.s9("any_page");
         this.n5("single-page-master-reference", "http://www.w3.org/1999/XSL/Format", var11).l6();
      } else {
         this.n5("repeatable-page-master-alternatives", "http://www.w3.org/1999/XSL/Format", var11);
         if (var1.h0().u9() != null) {
            var11 = new t2(this.h0);
            var11.w9("first");
            var11.s9("first_page");
            this.n5("conditional-page-master-reference", "http://www.w3.org/1999/XSL/Format", var11).l6();
         }

         if (var1.h0().h0() != null) {
            var11 = new t2(this.h0);
            var11.w9("last");
            var11.s9("last_page");
            this.n5("conditional-page-master-reference", "http://www.w3.org/1999/XSL/Format", var11).l6();
         }

         if (var1.h0().a6() != null) {
            var11 = new t2(this.h0);
            var11.w9("any");
            var11.s9("any_page");
            this.n5("conditional-page-master-reference", "http://www.w3.org/1999/XSL/Format", var11).l6();
         }

         if (var1.h0().k5() != null) {
            var11 = new t2(this.h0);
            var11.a1("odd");
            var11.s9("odd_page");
            this.n5("conditional-page-master-reference", "http://www.w3.org/1999/XSL/Format", var11).l6();
         }

         if (var1.h0().u3() != null) {
            var11 = new t2(this.h0);
            var11.a1("even");
            var11.s9("even_page");
            this.n5("conditional-page-master-reference", "http://www.w3.org/1999/XSL/Format", var11).l6();
         }

         this.l6();
      }

      this.l6();
      this.l6();
      return this;
   }

   private t2 n5(String var1, com.aspose.slides.internal.z5.u9 var2) {
      t2 var3 = new t2(this.h0);
      var3.u4(var1);
      var3.t3(var2.l6().n5().toString());
      var3.c2(var2.l6().l6().toString());
      var3.u5(var2.l6().k5().toString());
      var3.w8(var2.l6().u3().toString());
      var3.m8(var2.n5().n5().toString());
      var3.j6(var2.n5().l6().toString());
      return var3;
   }

   public final x8 n5(String var1, String var2) {
      this.n5.l6(var1, var2);
      return this;
   }

   private x8 y4(t2 var1) {
      IGenericEnumerator var2 = var1.iterator();

      try {
         while (var2.hasNext()) {
            h0 var3 = (h0)var2.next();
            String var4;
            switch (c8.n5(var3.n5())) {
               case 0:
               case 1:
                  var4 = var3.l6();
                  break;
               default:
                  var4 = d1.u9(var3.l6());
            }

            this.n5.l6(var3.n5(), var4);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return this;
   }

   public final x8 n5() {
      t2 var1 = new t2(this.h0);
      var1.s9("page_layuot");
      t2 var2 = new t2(this.h0);
      var2.f5("xsl-region-body");
      return this.n5("page-sequence", var1).n5("flow", var2);
   }

   public final x8 l6() {
      this.n5.k5();
      return this;
   }

   public final x8 k5() {
      this.n5.u3();
      return this;
   }

   public final x8 u3() {
      return this.k5("block-container");
   }

   public final x8 n5(com.aspose.slides.internal.w5.k5 var1) {
      return this.u3().y4(new t2(this.h0, var1, this.l6));
   }

   public final x8 n5(com.aspose.slides.internal.w5.k5 var1, t2 var2) {
      var2 = new t2(this.h0, var1, this.l6).n5(var2);
      return this.u3().y4(var2);
   }

   public final x8 n5(t2 var1) {
      return this.u3().y4(var1);
   }

   public final x8 a6() {
      return this.n5(true);
   }

   public final x8 n5(boolean var1) {
      t2 var2 = new t2(this.h0);
      var2.x0("0");
      if (var1) {
         var2.g7("0");
      }

      return this.k5("block").y4(var2);
   }

   public final x8 l6(com.aspose.slides.internal.w5.k5 var1) {
      return this.a6().y4(new t2(this.h0, var1, this.l6));
   }

   public final x8 n5(t2 var1, boolean var2) {
      return this.n5(var2).y4(var1);
   }

   public final x8 l6(t2 var1) {
      return this.a6().y4(var1);
   }

   public final x8 l6(com.aspose.slides.internal.w5.k5 var1, t2 var2) {
      var2 = new t2(this.h0, var1, this.l6).n5(var2);
      return this.a6().y4(var2);
   }

   public final x8 n5(int var1) {
      t2 var2 = new t2(this.h0);
      var2.i9(var1 == 0 ? "left" : "right");
      return this.k5("float").y4(var2);
   }

   public final x8 u9() {
      return this.k5("basic-link");
   }

   public final x8 k5(com.aspose.slides.internal.w5.k5 var1, t2 var2) {
      com.aspose.slides.internal.t9.u3 var3;
      if (!var1.t2("href")) {
         var3 = var1.a3();
      } else {
         com.aspose.slides.internal.t9.u3 var4 = var1.a3().u3();
         if (var4 == null) {
            var4 = var1.a3();
         }

         var3 = var4;
      }

      var2 = new t2(this.h0, var1, var3, this.l6).n5(var2);
      return this.u9().y4(var2);
   }

   public final x8 h0() {
      return this.k5("external-graphic");
   }

   public final x8 u3(com.aspose.slides.internal.w5.k5 var1, t2 var2) {
      com.aspose.slides.internal.t9.u3 var3 = var1.a3().u3();
      if (var3 == null) {
         var3 = var1.a3();
      }

      com.aspose.slides.internal.t9.u3 var4 = var3;
      var2 = new t2(this.h0, var1, var4, this.l6).n5(var2);
      boolean var5 = false;
      if (!d1.n5(var2.z1())) {
         this.u3().n5("position", var2.z1()).n5("top", var2.q0()).n5("left", var2.h0()).a6();
         var2.h9(null);
         var2.s2(null);
         var2.y5(null);
         var5 = true;
      }

      this.h0().y4(var2);
      if (var5) {
         this.l6().l6();
      }

      return this;
   }

   public final x8 c8() {
      return this.k5("list-block");
   }

   public final x8 k5(com.aspose.slides.internal.w5.k5 var1) {
      return this.c8().y4(new t2(this.h0, var1, this.l6));
   }

   public final x8 t2() {
      return this.k5("list-item");
   }

   public final x8 k5(t2 var1) {
      return this.t2().y4(var1);
   }

   public final x8 s7() {
      return this.k5("list-item-label");
   }

   public final x8 u3(t2 var1) {
      return this.s7().y4(var1);
   }

   public final x8 x8() {
      return this.k5("list-item-body");
   }

   public final x8 a6(t2 var1) {
      return this.x8().y4(var1);
   }

   public final x8 n3() {
      return this.k5("inline-container");
   }

   public final x8 u3(com.aspose.slides.internal.w5.k5 var1) {
      return this.u9(new t2(this.h0, var1, this.l6));
   }

   public final x8 u9(t2 var1) {
      return this.n3().y4(var1);
   }

   public final x8 y4() {
      return this.k5("inline");
   }

   public final x8 h0(t2 var1) {
      return this.y4().y4(var1);
   }

   public final x8 a6(com.aspose.slides.internal.w5.k5 var1) {
      return this.h0(new t2(this.h0, var1, this.l6));
   }

   public final x8 a6(com.aspose.slides.internal.w5.k5 var1, t2 var2) {
      return this.h0(new t2(this.h0, var1, this.l6).n5(var2));
   }

   public final x8 n5(e2 var1, t2 var2) {
      if (var2 == null) {
         var2 = new t2(this.h0);
      }

      var2.i8(var1.toString());
      this.u9(var2).a6().n5("&nbsp;").l6().l6();
      return this;
   }

   public final x8 n5(e2 var1) {
      return this.n5(var1, null);
   }

   public final x8 e2() {
      return this.k5("instream-foreign-object");
   }

   public final x8 t9() {
      return this.k5("leader");
   }

   public final x8 c8(t2 var1) {
      return this.t9().y4(var1);
   }

   public final x8 z1() {
      return this.k5("table");
   }

   public final x8 t2(t2 var1) {
      return this.z1().y4(var1);
   }

   public final x8 u9(com.aspose.slides.internal.w5.k5 var1, t2 var2) {
      var2 = new t2(this.h0, var1, this.l6).n5(var2);
      return this.z1().y4(var2);
   }

   public final x8 t4() {
      return this.k5("table-body");
   }

   public final x8 q0() {
      return this.k5("table-row");
   }

   public final x8 u9(com.aspose.slides.internal.w5.k5 var1) {
      return this.q0().y4(new t2(this.h0, var1, this.l6));
   }

   public final x8 s7(t2 var1) {
      return this.q0().y4(var1);
   }

   public final x8 z3() {
      return this.k5("table-column");
   }

   public final x8 x8(t2 var1) {
      return this.z3().y4(var1);
   }

   public final x8 m1() {
      return this.k5("table-cell");
   }

   public final x8 n3(t2 var1) {
      return this.m1().y4(var1);
   }

   private o5 h0(com.aspose.slides.internal.w5.k5 var1) {
      if (var1 == null) {
         return null;
      }

      o5 var2 = com.aspose.slides.internal.v6g.k5.n5(var1, o5.class);
      return var2 != null ? var2 : this.h0(var1.p3());
   }

   public final x8 h0(com.aspose.slides.internal.w5.k5 var1, t2 var2) {
      var2 = new t2(this.h0, var1, this.l6).n5(var2);
      z6 var3 = com.aspose.slides.internal.v6g.k5.n5(var1, z6.class);
      if (var3 != null) {
         w2 var4 = var3.n5(w2.class);
         o5 var5 = var3.n5(o5.class);
         if (var4 != null && var5 != null) {
            com.aspose.slides.internal.j3.j5 var6 = var5.h0("COL");
            List var7 = new List();
            IGenericEnumerator var8 = var6.iterator();

            try {
               while (var8.hasNext()) {
                  z8 var9 = (z8)var8.next();
                  com.aspose.slides.internal.w5.k5 var10 = (com.aspose.slides.internal.w5.k5)var9;
                  if (var10 != null) {
                     o5 var11 = this.h0(var10);
                     if (d1.u3(var11.z1(), var5.z1(), (short)3)) {
                        var7.addItem(com.aspose.slides.internal.v6g.k5.n5(var9, e9.class));
                     }
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var8, IDisposable.class)) {
                  var8.dispose();
               }
            }

            if (var6.n5() != 0 && var3.j9() < var7.size()) {
               int var20 = 0;

               for (z8 var23 : var4.e9()) {
                  z6 var12 = (z6)var23;
                  if (var12.j9() == var3.j9()) {
                     break;
                  }

                  var20 += var12.v8();
               }

               com.aspose.slides.ms.System.o5 var22 = new com.aspose.slides.ms.System.o5();
               int var24 = 8;

               for (int var25 = var20; var25 < var20 + var3.v8() && var25 < var7.size(); var25++) {
                  e9 var13 = (e9)var7.get_Item(var25);
                  if (!d1.n5(var13.w2()) && com.aspose.slides.ms.System.t9.s7(var13.w2().charAt(0))) {
                     float var14 = 0.0F;
                     if (d1.k5(var13.w2(), "%")) {
                        if (var3.v8() == 1) {
                           var14 = n1.n5(d1.a6(var13.w2(), '%'));
                           if (var22.l6()) {
                              (var22.l6() ? new com.aspose.slides.ms.System.o5<>((Float)var22.n5(float.class) + var14) : new com.aspose.slides.ms.System.o5<>())
                                 .n5(var22);
                           } else {
                              var22 = new com.aspose.slides.ms.System.o5<>(var14);
                           }

                           var24 = 1;
                        }
                     } else {
                        float[] var15 = new float[]{0.0F};
                        boolean var16 = com.aspose.slides.internal.w3.u3.n5(var13.w2(), var15);
                        var14 = var15[0];
                        if (var16) {
                           if (var22.l6()) {
                              (var22.l6() ? new com.aspose.slides.ms.System.o5<>((Float)var22.n5(float.class) + var14) : new com.aspose.slides.ms.System.o5<>())
                                 .n5(var22);
                           } else {
                              var22 = new com.aspose.slides.ms.System.o5<>(var14);
                           }

                           var24 = 8;
                        }
                     }
                  } else if (!var13.a3().f5().h0()) {
                     if (var22.l6()) {
                        (var22.l6()
                              ? new com.aspose.slides.ms.System.o5<>((Float)var22.n5(float.class) + var13.a3().f5().c8().l6())
                              : new com.aspose.slides.ms.System.o5<>())
                           .n5(var22);
                     } else {
                        var22 = new com.aspose.slides.ms.System.o5<>(var13.a3().f5().c8().l6());
                     }

                     var24 = var13.a3().f5().c8().n5();
                  }
               }

               if (var22.l6()) {
                  t2 var26 = new t2(this.h0);
                  var26.i8(new e2((Float)var22.n5(), var24).toString());
                  var2.n5(var26);
               }
            }
         }
      }

      return this.m1().y4(var2);
   }

   private x8 k5(String var1) {
      this.n5.n5(var1, "http://www.w3.org/1999/XSL/Format");
      return this;
   }

   private x8 n5(String var1, t2 var2) {
      return this.n5(var1, "http://www.w3.org/1999/XSL/Format", var2);
   }

   private x8 l6(String var1, String var2) {
      this.n5.n5(var1, var2);
      return this;
   }

   private x8 n5(String var1, String var2, t2 var3) {
      return this.l6(var1, var2).y4(var3);
   }

   public final x8 n5(String var1) {
      this.n5.n5(u3(var1));
      return this;
   }

   public final x8 l6(String var1) {
      this.n5.n5(var1);
      return this;
   }

   private static String l6(com.aspose.slides.internal.r7c.u3 var0) {
      int var1 = 0;
      int[] var2 = new int[]{0};
      boolean var3 = !a3.n5(d1.l6(var0.k5(), 3, var0.k5().length() - 4), 515, u3, var2);
      var1 = var2[0];
      if (var3) {
         return var0.k5();
      }

      a5 var4 = new a5();
      var4.n5("&#").k5(var1).n5(";");
      return var4.toString();
   }

   private static String u3(String var0) {
      if (var0.length() == 0) {
         return var0;
      }

      int var1 = d1.u3(var0, '&');
      if (var1 != -1) {
         for (; var1 != -1; var1 = d1.l6(var0, '&', var1 + 1)) {
            n5 var2 = null;
            n5[] var3 = new n5[]{var2};
            boolean var4 = !com.aspose.slides.internal.a8.l6.n5.n5(var0, var1, var3);
            var2 = var3[0];
            if (var4) {
               var0 = d1.n5(var0, var1, 1);
               var0 = d1.n5(var0, var1, "&amp;");
            }

            if (var2 != null) {
               int var5 = var1 + var2.n5().length() + 1;
               if (var0.length() == var5 || var0.charAt(var5) != ';') {
                  var0 = d1.n5(var0, var5, ";");
               }

               for (int var6 = var1; var6 < var5; var6++) {
                  if (!com.aspose.slides.ms.System.t9.e2(var0.charAt(var6))) {
                     var0 = d1.n5(var0, var1 + 1, var2.n5().length());
                     var0 = d1.n5(var0, var1 + 1, var2.n5());
                     break;
                  }
               }
            }
         }
      }

      var1 = d1.u3(var0, '<');
      if (var1 != -1) {
         while (var1 != -1) {
            String var9 = d1.n5(var0, var1, 1);
            var0 = d1.n5(var9, var1, "&lt;");
            var1 = d1.l6(var0, '<', var1 + 1);
         }
      }

      var1 = d1.u3(var0, '>');
      if (var1 != -1) {
         while (var1 != -1) {
            String var10 = d1.n5(var0, var1, 1);
            var0 = d1.n5(var10, var1, "&gt;");
            var1 = d1.l6(var0, '>', var1 + 1);
         }
      }

      return k5.n5(var0, new x8$1());
   }

   // $VF: synthetic method
   static String n5(com.aspose.slides.internal.r7c.u3 var0) {
      return l6(var0);
   }
}
