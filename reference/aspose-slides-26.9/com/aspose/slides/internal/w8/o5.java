package com.aspose.slides.internal.w8;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;

public class o5 extends com.aspose.slides.internal.w5.k5 {
   public o5(com.aspose.slides.internal.f5.e2 var1, com.aspose.slides.internal.f5.z1 var2) {
      super(var1, var2);
   }

   public final y0 j9() {
      return this.l6(y0.class);
   }

   public final v8 z6() {
      return this.d2("THEAD");
   }

   public final v8 e9() {
      return this.d2("TFOOT");
   }

   private v8 d2(String var1) {
      s0 var2 = new s0(this, var1);
      return var2.n5() > 0 ? com.aspose.slides.internal.v6g.k5.n5(var2.n5(0), v8.class) : null;
   }

   public final j8 o5() {
      return new j8(this, this.h0("TR"));
   }

   public final s7 j8() {
      return new s0(this, "TBODY");
   }

   public final String w2() {
      return this.t2("align", d1.n5);
   }

   public final void m3(String var1) {
      this.n5("align", var1);
   }

   public final String s0() {
      return this.t2("bgcolor", d1.n5);
   }

   public final void z8(String var1) {
      this.n5("bgcolor", var1);
   }

   public final String v8() {
      return this.t2("border", d1.n5);
   }

   public final void j5(String var1) {
      this.n5("border", var1);
   }

   public final String v3() {
      return this.t2("cellpadding", d1.n5);
   }

   public final void w1(String var1) {
      this.n5("cellpadding", var1);
   }

   public final String g7() {
      return this.t2("cellspacing", d1.n5);
   }

   public final void r4(String var1) {
      this.n5("cellspacing", var1);
   }

   public final String j4() {
      return this.t2("frame", d1.n5);
   }

   public final void c4(String var1) {
      this.n5("frame", var1);
   }

   public final String i9() {
      return this.t2("rules", d1.n5);
   }

   public final void y2(String var1) {
      this.n5("rules", var1);
   }

   public final String f5() {
      return this.t2("summary", d1.n5);
   }

   public final void y1(String var1) {
      this.n5("summary", var1);
   }

   public final String j3() {
      return this.t2("width", d1.n5);
   }

   public final void a0(String var1) {
      this.n5("width", var1);
   }

   public final com.aspose.slides.internal.j3.z3 n1() {
      v8 var1 = this.z6();
      if (var1 != null) {
         return var1;
      }

      com.aspose.slides.internal.h6.n5 var2 = com.aspose.slides.internal.v6g.k5.n5(this.y4().a6("THEAD"), com.aspose.slides.internal.h6.n5.class);
      y0 var3 = this.j9();
      return var3 != null
         ? com.aspose.slides.internal.v6g.k5.n5(this.l6(var2, var3), com.aspose.slides.internal.h6.n5.class)
         : com.aspose.slides.internal.v6g.k5.n5(
            this.n5(var2, com.aspose.slides.internal.v6g.k5.n5(this.t4(), com.aspose.slides.internal.f5.r4.class)), com.aspose.slides.internal.h6.n5.class
         );
   }

   public final void p6() {
      this.n5(this.z6());
   }

   public final com.aspose.slides.internal.j3.z3 d1() {
      return this.e9() != null
         ? this.e9()
         : com.aspose.slides.internal.v6g.k5.n5(
            this.k5(com.aspose.slides.internal.v6g.k5.n5(this.y4().a6("TFOOT"), com.aspose.slides.internal.f5.r4.class)),
            com.aspose.slides.internal.h6.n5.class
         );
   }

   public final void s4() {
      this.n5(this.e9());
   }

   public final com.aspose.slides.internal.j3.z3 h6() {
      return this.j9() != null
         ? this.j9()
         : com.aspose.slides.internal.v6g.k5.n5(
            this.n5(
               com.aspose.slides.internal.v6g.k5.n5(this.y4().a6("CAPTION"), com.aspose.slides.internal.f5.r4.class),
               com.aspose.slides.internal.v6g.k5.n5(this.t4(), com.aspose.slides.internal.f5.r4.class)
            ),
            com.aspose.slides.internal.h6.n5.class
         );
   }

   public final void y8() {
      this.n5(this.j9());
   }

   private void n5(com.aspose.slides.internal.h6.n5 var1) {
      if (var1 != null) {
         this.l6(var1);
      }
   }

   public final com.aspose.slides.internal.j3.z8 n5(int var1) {
      j8 var2 = this.o5();
      if (var1 >= -1 && var1 <= var2.n5()) {
         com.aspose.slides.internal.w5.k5 var3 = var2.n5() > var1 && var1 != -1
            ? com.aspose.slides.internal.v6g.k5.n5(var2.n5(var1), com.aspose.slides.internal.w5.k5.class)
            : null;
         v8 var4 = var3 != null ? var3.n5(v8.class) : null;
         s7 var5 = this.j8();
         com.aspose.slides.internal.w5.k5 var11;
         if (var5.n5() == 0) {
            com.aspose.slides.internal.w5.k5 var6 = this.z6();
            if (var6 == null) {
               var6 = this.j9();
            }

            com.aspose.slides.internal.w5.k5 var7 = var6;
            var11 = com.aspose.slides.internal.v6g.k5.n5(this.y4().a6("TBODY"), com.aspose.slides.internal.w5.k5.class);
            if (var7 != null) {
               var11 = com.aspose.slides.internal.v6g.k5.n5(this.l6(var11, var7), com.aspose.slides.internal.w5.k5.class);
            } else {
               var11 = com.aspose.slides.internal.v6g.k5.n5(
                  this.n5(var11, com.aspose.slides.internal.v6g.k5.n5(this.t4(), com.aspose.slides.internal.f5.r4.class)),
                  com.aspose.slides.internal.w5.k5.class
               );
            }
         } else {
            com.aspose.slides.internal.w5.k5 var9 = var4;
            if (var9 == null) {
               var9 = com.aspose.slides.internal.v6g.k5.n5(var5.n5(var5.n5() - 1), com.aspose.slides.internal.w5.k5.class);
            }

            var11 = var9;
         }

         com.aspose.slides.internal.j3.z3 var10 = this.y4().a6("TR");
         return var4 == var11 && var1 != -1
            ? com.aspose.slides.internal.v6g.k5.n5(
               var11.n5(com.aspose.slides.internal.v6g.k5.n5(var10, com.aspose.slides.internal.f5.r4.class), var3), com.aspose.slides.internal.h6.n5.class
            )
            : com.aspose.slides.internal.v6g.k5.n5(
               var11.k5(com.aspose.slides.internal.v6g.k5.n5(var10, com.aspose.slides.internal.f5.r4.class)), com.aspose.slides.internal.h6.n5.class
            );
      } else {
         throw new com.aspose.slides.internal.j3.l6((byte)1);
      }
   }

   public final void l6(int var1) {
      j8 var2 = this.o5();
      if (var1 >= -1 && var1 < var2.n5()) {
         com.aspose.slides.internal.w5.k5 var3 = com.aspose.slides.internal.v6g.k5.n5(
            var1 != -1 ? var2.n5(var1) : var2.n5(var2.n5() - 1), com.aspose.slides.internal.w5.k5.class
         );
         com.aspose.slides.internal.w5.k5 var4 = var3.p3();
         var4.l6(var3);
      } else {
         throw new com.aspose.slides.internal.j3.l6((byte)1);
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.w5.a6 var1) {
      if (this.a3().g7() != 1) {
         com.aspose.slides.internal.w5.a6 var2 = var1.t2(this);
         IGenericEnumerator var3 = this.j8().iterator();

         try {
            while (var3.hasNext()) {
               com.aspose.slides.internal.j3.z8 var4 = (com.aspose.slides.internal.j3.z8)var3.next();
               v8 var5 = (v8)var4;
               var5.n5(var2);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }

         var2.s7(this);
      }
   }
}
