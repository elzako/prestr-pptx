package com.aspose.slides.internal.s6;

public class w1 implements com.aspose.slides.ms.System.v4, Cloneable {
   private v3 n5 = new v3();
   private v3 l6 = new v3();
   private v3 k5 = new v3();
   private v3 u3 = new v3();
   private float a6;
   private v3 u9 = new v3();

   public final v3 n5() {
      return this.n5.h0();
   }

   public final void n5(v3 var1) {
      this.n5 = var1.h0();
   }

   public final v3 l6() {
      return this.l6.h0();
   }

   public final void l6(v3 var1) {
      this.l6 = var1.h0();
   }

   public final v3 k5() {
      return this.k5.h0();
   }

   public final void k5(v3 var1) {
      this.k5 = var1.h0();
   }

   public final v3 u3() {
      return this.u3.h0();
   }

   public final void u3(v3 var1) {
      this.u3 = var1.h0();
   }

   public final float a6() {
      return this.a6;
   }

   public final void n5(float var1) {
      this.a6 = var1;
   }

   public final void a6(v3 var1) {
      this.u9 = var1.h0();
   }

   public final w1 u9() {
      this.k5(this.k5().u9().h0());
      return this;
   }

   public static w1 h0() {
      w1 var0 = new w1();
      var0.n5(new v3(0.1F, 0.1F, 0.1F));
      var0.l6(new v3(1.0F, 1.0F, 1.0F));
      var0.k5(new v3(-1.0F, -3.0F, -2.0F).u9().h0());
      var0.u3(new v3(1.0F, 1.0F, 1.0F));
      var0.n5(45.0F);
      var0.a6(new v3(0.0F, 0.0F, 0.0F));
      return var0;
   }

   @Override
   public final Object deepClone() {
      return this.c8();
   }

   protected Object c8() {
      try {
         w1 var1 = (w1)super.clone();
         if (this.n5 != null) {
            var1.n5 = this.n5.h0();
         }

         if (this.l6 != null) {
            var1.l6 = this.l6.h0();
         }

         if (this.k5 != null) {
            var1.k5 = this.k5.h0();
         }

         if (this.u9 != null) {
            var1.u9 = this.u9.h0();
         }

         if (this.u3 != null) {
            var1.u3 = this.u3.h0();
         }

         return var1;
      } catch (CloneNotSupportedException var2) {
         throw new IllegalStateException(var2);
      }
   }
}
