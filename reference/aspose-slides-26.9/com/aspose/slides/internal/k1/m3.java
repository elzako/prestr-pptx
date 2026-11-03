package com.aspose.slides.internal.k1;

import com.aspose.slides.internal.o9b.a0;
import com.aspose.slides.internal.o9b.y2;

public class m3 extends com.aspose.slides.internal.y6.u3 {
   private short n5;
   private short l6;
   private int k5;
   private short u3;
   private short a6;
   private short u9;
   private m1 h0;
   private z8[] c8;

   public final short n5() {
      return this.n5;
   }

   public final void n5(short var1) {
      this.n5 = var1;
   }

   public final short l6() {
      return this.l6;
   }

   public final void l6(short var1) {
      this.l6 = var1;
   }

   public final int k5() {
      return this.k5;
   }

   public final void n5(int var1) {
      this.k5 = var1;
   }

   public final short u3() {
      return this.u3;
   }

   public final void k5(short var1) {
      this.u3 = var1;
   }

   public final short u9() {
      return this.a6;
   }

   public final void u3(short var1) {
      this.a6 = var1;
   }

   public final short h0() {
      return this.u9;
   }

   public final void a6(short var1) {
      this.u9 = var1;
   }

   public final m1 c8() {
      return this.h0;
   }

   public final void n5(m1 var1) {
      this.h0 = var1;
   }

   public final z8[] t2() {
      return this.c8;
   }

   public final void n5(z8[] var1) {
      this.c8 = var1;
   }

   public final a0 s7() {
      a0 var1 = new a0();
      var1.u3();

      for (z8 var5 : this.t2()) {
         for (j5 var9 : var5.u3()) {
            y2 var10 = y2.n5(var9.n5() & 65535, var5.l6() & 65535, var9.l6() & 65535, var5.k5() & 65535).n3();
            var1.k5(var10.n3());
         }
      }

      return var1;
   }
}
