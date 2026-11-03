package com.aspose.slides.internal.u3;

import com.aspose.slides.exceptions.SystemException;
import com.aspose.slides.internal.n2d.s7;
import com.aspose.slides.internal.o9b.p8;
import com.aspose.slides.internal.q0.e2;

public final class l6 {
   private int n5;
   private p8 l6 = new p8();
   private p8 k5 = new p8();
   private int u3;
   private l6$n5 a6 = new l6$n5();
   private e2 u9 = new e2(96.0F, 17);
   private int h0;
   private boolean c8 = false;

   public static l6 n5() {
      l6 var0 = new l6();
      var0.n5(7);

      try {
         var0.n5(s7().u3());
      } catch (SystemException var2) {
         var0.n5(new p8(1024, 768));
      }

      var0.l6(var0.k5().u3());
      var0.l6(var0.k5().l6() >= var0.k5().k5() ? 1 : 0);
      return var0;
   }

   private static p8 s7() {
      return s7.n5();
   }

   public final int l6() {
      return this.n5;
   }

   public final void n5(int var1) {
      this.n5 = var1;
   }

   public final p8 k5() {
      return this.l6;
   }

   public final void n5(p8 var1) {
      var1.k5(this.l6);
   }

   public final int u3() {
      return this.u3;
   }

   public final void l6(int var1) {
      this.u3 = var1;
   }

   public final p8 a6() {
      return this.k5;
   }

   public final void l6(p8 var1) {
      var1.k5(this.k5);
   }

   public final l6$n5 u9() {
      return this.a6;
   }

   public final e2 h0() {
      return this.u9;
   }

   public final void n5(e2 var1) {
      this.u9 = var1;
   }

   public final int c8() {
      return this.h0;
   }

   public final void k5(int var1) {
      this.h0 = var1;
   }

   public final boolean t2() {
      return this.c8;
   }
}
