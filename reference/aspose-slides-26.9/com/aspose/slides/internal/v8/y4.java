package com.aspose.slides.internal.v8;

public class y4 implements a6 {
   private k5 n5;
   private k5 l6;
   private k5 k5;
   private k5 u3;
   private k5 a6;
   private n3 u9;
   private s7 h0;

   public y4() {
      this(n3.n5);
   }

   public y4(n3 var1) {
      this.l6(var1);
   }

   public y4(n3 var1, s7 var2) {
      this.l6(var1);
      this.h0 = var2;
   }

   @Override
   public final s7 z6() {
      return this.h0;
   }

   @Override
   public final k5 j9() {
      return this.n5;
   }

   @Override
   public final void n5(k5 var1) {
      this.n5 = var1;
   }

   @Override
   public final void l6(k5 var1) {
      this.l6 = var1;
   }

   @Override
   public final k5 e9() {
      return this.k5;
   }

   @Override
   public final void k5(k5 var1) {
      this.k5 = var1;
   }

   @Override
   public final void u3(k5 var1) {
      this.u3 = var1;
   }

   @Override
   public final void a6(k5 var1) {
      this.a6 = var1;
   }

   public final n3 n5() {
      return this.u9;
   }

   @Override
   public final void n5(n3 var1) {
      this.u9 = var1;
   }

   public final void l6(n3 var1) {
      var1.n5(this);
   }

   public static u3 n5(com.aspose.slides.internal.e5.t2 var0) {
      for (com.aspose.slides.internal.e5.t2 var1 = var0; var1 != null; var1 = var1.s_()) {
         if (com.aspose.slides.internal.v6g.k5.l6(var1, u3.class)) {
            return (u3)var1;
         }
      }

      return null;
   }
}
