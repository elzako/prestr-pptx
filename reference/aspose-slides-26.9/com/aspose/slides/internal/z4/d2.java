package com.aspose.slides.internal.z4;

import com.aspose.slides.internal.e1x.b3;
import com.aspose.slides.internal.e1x.i1;
import com.aspose.slides.internal.e1x.u6;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.ms.System.d1;

public class d2 {
   private final c8 n5;
   private final a0 l6;
   private boolean k5;
   private float u3;
   private float a6;
   private com.aspose.slides.internal.w0.c8 u9;
   private String h0;

   public d2(c8 var1, a0 var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   public final void n5(com.aspose.slides.internal.e1.z1 var1) {
      String var2 = this.n5(var1.x8());
      if (var2.length() != 0) {
         int var3;
         if (this.n5.l6().m1().n5(var1.l6().h0())) {
            var3 = this.n5.l6().m1().l6(var1.l6().h0());
         } else {
            var3 = this.n5.l6().k7();
         }

         com.aspose.slides.internal.p1s.l6 var4 = var1.l6();
         if (com.aspose.slides.internal.v6g.k5.l6(var4.n5().y1(), com.aspose.slides.internal.e1x.a0.class) || this.n5.e2()) {
            com.aspose.slides.internal.z0k.t4 var5 = var4.n5().y1().l6();

            byte[] var7;
            try {
               com.aspose.slides.internal.z0k.e2 var6 = new com.aspose.slides.internal.z0k.e2();

               try {
                  com.aspose.slides.internal.q7.n5.n5(var5, var6);
                  var7 = var6.toArray();
               } finally {
                  if (var6 != null) {
                     var6.dispose();
                  }
               }
            } finally {
               if (var5 != null) {
                  var5.dispose();
               }
            }

            if ("OTTO".equals(com.aspose.slides.internal.l7h.j5.z3().l6(var7, 0, 4))) {
               var7 = com.aspose.slides.internal.c8e.n5.n5(var7);
               b3 var17 = new b3();
               i1 var8 = var17.n5(var7, var4.h0());
               var4 = new com.aspose.slides.internal.p1s.l6(var4.c8(), var4.l6(), var8);
            }
         }

         boolean var20 = true;
         if (com.aspose.slides.internal.b8.h0.n5(var3, 1)) {
            var20 = !com.aspose.slides.internal.n2d.t4.k5(var2);
            if (var20 && !com.aspose.slides.internal.b8.h0.n5(var3, 4) && !com.aspose.slides.internal.b8.h0.n5(var3, 2)) {
               var3 |= 2;
            }
         } else if (com.aspose.slides.internal.b8.h0.n5(var3, 4) && var4.n5().a0()) {
            var3 = 2;
         } else if (var3 == 2 && !var4.n5().a0() && !var4.n5().c4()) {
            var20 = !com.aspose.slides.internal.n2d.t4.k5(var2);
         }

         if (!n5(var4, var2)) {
            var4 = l6(var4, var2);
         }

         com.aspose.slides.internal.c0.l6 var16 = this.n5.k5().n5(var4, var20, var3);
         if (var1.l6().a6() == 1) {
            this.n5(var2, var16, 1.0F, var20, var1);
         } else {
            com.aspose.slides.internal.p1s.u3 var18 = new com.aspose.slides.internal.p1s.u3(var2);

            for (com.aspose.slides.internal.o9b.w1 var21 = var1.s7().u3(); var18.hasNext(); var21.n5(var21.l6() + var1.l6().n5(var18.n5().l6()))) {
               if (!var18.n5().n5()) {
                  this.n5(var18.n5().l6(), var16, var21.u3(), 1.0F, var20, var1);
               } else {
                  this.n5(d1.s7(var18.n5().l6()), var16, var21.u3(), var1.l6().u9(), var20, var1);
               }
            }
         }
      }
   }

   private void n5(String var1, com.aspose.slides.internal.c0.l6 var2, float var3, boolean var4, com.aspose.slides.internal.e1.z1 var5) {
      if (var5.m3() == null) {
         this.n5(var1, var2, var5.s7().u3(), 1.0F, var4, var5);
      } else {
         for (int var6 = 0; var6 < var1.length(); var6++) {
            String var7 = com.aspose.slides.ms.System.t9.q0(var1.charAt(var6));
            float var8 = var5.m3()[var6];
            com.aspose.slides.internal.o9b.w1 var9 = new com.aspose.slides.internal.o9b.w1(var8, var5.s7().k5());
            this.n5(var7, var2, var9.u3(), var3, var4, var5);
         }
      }
   }

   private void n5(
      String var1,
      com.aspose.slides.internal.c0.l6 var2,
      com.aspose.slides.internal.o9b.w1 var3,
      float var4,
      boolean var5,
      com.aspose.slides.internal.e1.z1 var6
   ) {
      this.n5();
      this.n5.x8().n5(var2, var6.l6().c8(), this.l6);
      this.n5.x8().l6(var6.t4(), this.l6);
      this.n5(var2, var3.u3(), var4);
      boolean var7 = com.aspose.slides.internal.p1s.n5.u3(var6.h0(), com.aspose.slides.internal.p1s.n5.b2) || var2.k5();
      if (!var7) {
         this.n5(0);
         this.n5.x8().n5(var6.k5(), false, this.l6);
      } else {
         if (com.aspose.slides.internal.p1s.n5.u3(var6.k5(), com.aspose.slides.internal.p1s.n5.b2)) {
            this.n5(2);
            this.n5.x8().n5(var6.k5(), false, this.l6);
         } else {
            this.n5(1);
         }

         if (var2.k5() && var6.h0().u9()) {
            float var8 = var6.l6().c8() / 30.0F;
            this.l6.k5("{0} w", s3.l6(var8));
            com.aspose.slides.internal.p1s.n5 var9 = com.aspose.slides.internal.p1s.n5.u3(var6.k5(), com.aspose.slides.internal.p1s.n5.b2)
               ? var6.k5()
               : var6.h0();
            this.n5.x8().n5(var9, true, this.l6);
         } else if (!var6.h0().u9() && var2.k5()) {
            this.l6.k5("{0} w", s3.l6(var6.t2()));
            this.n5.x8().n5(var6.h0(), true, this.l6);
         } else if (!var6.h0().u9()) {
            this.l6.k5("{0} w", s3.l6(var6.t2()));
            this.n5.x8().n5(var6.h0(), true, this.l6);
         }
      }

      if (var5) {
         boolean var11 = this.n5(var6, var1, (com.aspose.slides.internal.c0.s7)var2);
         boolean var12 = var6.t4() != 0.0F;
         boolean var10 = !var11 && !var12;
         if (var10) {
            this.u3 = this.u3 + var6.y4().l6();
         }
      } else {
         this.n5(var1, (com.aspose.slides.internal.c0.c8)var2, var6.n5());
      }
   }

   public final void n5() {
      if (!this.k5) {
         this.l6.k5("BT");
         this.k5 = true;
         this.h0 = "Tj";
         this.u9 = new com.aspose.slides.internal.w0.c8();
      }
   }

   public final void l6() {
      if (this.k5) {
         this.l6.k5("ET");
         this.k5 = false;
      }
   }

   private void n5(com.aspose.slides.internal.c0.l6 var1, com.aspose.slides.internal.o9b.w1 var2, float var3) {
      com.aspose.slides.internal.w0.c8 var4 = n5(var1, var2.u3());
      var4.n5(var3, var3, 0);
      if (l6(var4) && l6(this.u9)) {
         if (var4.c8() != this.u3 || var4.t2() != this.a6) {
            float var5 = var4.c8() - this.u9.c8();
            float var6 = var4.t2() - this.u9.t2();
            if (var5 == 0.0F) {
               if (var6 != this.n5.x8().l6().t2()) {
                  this.n5.x8().n5(var6, this.l6);
               }

               this.h0 = "'";
            } else if (var6 == this.n5.x8().l6().t2()) {
               this.l6.k5("{0} {1} Td", s3.l6(var5), s3.l6(-var6));
            } else {
               this.l6.k5("{0} {1} TD", s3.l6(var5), s3.l6(-var6));
               this.n5.x8().l6().k5(var6);
            }

            this.k5(var4);
            this.u9 = var4;
         }
      } else {
         this.n5(var4);
         this.k5(var4);
         this.u9 = var4;
      }
   }

   private void n5(com.aspose.slides.internal.w0.c8 var1) {
      this.l6.n5(var1, "Tm");
   }

   private static boolean l6(com.aspose.slides.internal.w0.c8 var0) {
      return var0.u3() == 1.0F && var0.a6() == 0.0F && var0.u9() == 0.0F && var0.h0() == -1.0F;
   }

   private static com.aspose.slides.internal.w0.c8 n5(com.aspose.slides.internal.c0.l6 var0, com.aspose.slides.internal.o9b.w1 var1) {
      return new com.aspose.slides.internal.w0.c8(1.0F, 0.0F, var0.l6() ? (float) (Math.PI / 9) : 0.0F, -1.0F, var1.l6(), var1.k5());
   }

   private void k5(com.aspose.slides.internal.w0.c8 var1) {
      this.u3 = var1.c8();
      this.a6 = var1.t2();
   }

   private void n5(int var1) {
      this.n5.x8().n5(var1, this.l6);
   }

   private boolean n5(com.aspose.slides.internal.e1.z1 var1, String var2, com.aspose.slides.internal.c0.s7 var3) {
      if (d1.c8(var3.u3(), "MicrosoftNewTaiLue") != -1) {
         var2 = d1.n5(var2, "ᦵ", "ᦵ◌");
         var2 = d1.n5(var2, "ᦶ", "ᦶ◌");
         var2 = d1.n5(var2, "ᦷ", "ᦷ◌");
         var2 = d1.n5(var2, "ᦺ", "ᦺ◌");
      }

      boolean var4;
      if (var1.z3() == null) {
         var4 = var3.n5(var1, var2, this.l6.u3());
      } else {
         this.l6.n5("[");
         this.l6.n5("(");
         var4 = var3.n5(com.aspose.slides.internal.v6g.k5.k5(var1.z3(), int[].class), this.l6.u3());
         this.l6.k5(")");
         this.l6.k5("]");
         this.l6.k5("TJ");
      }

      this.h0 = "Tj";
      return var4;
   }

   public static boolean n5(com.aspose.slides.internal.p1s.l6 var0, String var1) {
      for (int var2 = 0; var2 < var1.length(); var2++) {
         int var3 = var1.charAt(var2);
         if (com.aspose.slides.ms.System.t9.a6(var1.charAt(var2))) {
            var3 = com.aspose.slides.ms.System.t9.n5(var1.charAt(var2), var1.charAt(var2 + 1));
            var2++;
         }

         u6 var4 = var0.n5().h0().l6(var3);
         if (var4.equals(var0.n5().h0().l6())) {
            return false;
         }
      }

      return true;
   }

   public static com.aspose.slides.internal.p1s.l6 l6(com.aspose.slides.internal.p1s.l6 var0, String var1) {
      com.aspose.slides.internal.p1s.l6 var2 = null;
      if (com.aspose.slides.internal.e1x.x8.u3().n5("Arial Unicode MS", var0.l6()) != null) {
         var2 = com.aspose.slides.internal.e1x.x8.u3().n5("Arial Unicode MS", var0.c8(), var0.l6());
      }

      com.aspose.slides.internal.p1s.l6 var3 = com.aspose.slides.internal.e1x.x8.u3().n5("MS Gothic", var0.c8(), var0.l6());
      com.aspose.slides.internal.p1s.l6 var4 = com.aspose.slides.internal.e1x.x8.u3().n5("Times New Roman", var0.c8(), var0.l6());
      if ("Arial".equals(var0.h0())) {
         return var2 != null && n5(var2, var1) ? var2 : var3;
      } else if (n5(var4, var1)) {
         return var4;
      } else {
         return var2 != null && n5(var2, var1) ? var2 : var3;
      }
   }

   private void n5(String var1, com.aspose.slides.internal.c0.h0 var2, boolean var3) {
      if (var3) {
         this.l6.n5("[");
         this.l6.n5("(");
         var2.n5(var1);
         var2.n5(var1, this.l6.u3());
         this.l6.k5(")");
         this.l6.k5("]");
         this.l6.k5("TJ");
      } else {
         this.l6.n5("(");
         var2.n5(var1);
         this.l6.u3(var1);
         this.l6.k5(")");
         this.l6.k5(this.h0);
      }

      this.h0 = "Tj";
   }

   private String n5(String var1) {
      if (d1.u3(var1, '\t') == -1) {
         return var1;
      }

      a5 var2 = new a5();

      for (int var3 = 0; var3 < (this.n5.l6().z8() & 4294967295L); var3++) {
         var2.n5(' ');
      }

      String var7 = var2.toString();
      var2 = new a5();

      for (int var4 = 0; var4 < var1.length(); var4++) {
         char var5 = var1.charAt(var4);
         if (var5 == '\t') {
            var2.n5(var7);
         } else {
            var2.n5(var5);
         }
      }

      return var2.toString();
   }
}
