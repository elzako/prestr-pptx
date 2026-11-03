package com.aspose.slides.internal.c4i;

import com.aspose.slides.exceptions.InvalidDataException;

public class h0 extends m1 {
   private com.aspose.slides.internal.y5s.w1 n5 = new com.aspose.slides.internal.y5s.w1();
   private float l6;
   private float k5;

   public h0(e5 var1) {
      super(var1);
   }

   @Override
   public int ar_() {
      byte var1 = 0;
      if (this.u3()) {
         var1 = 28;
      } else {
         var1 = 36;
      }

      return var1;
   }

   @Override
   public void b_(int var1) {
      if (this.u3() && var1 == 28) {
         super.l6(var1);
      } else {
         if (this.u3() || var1 != 36) {
            throw new InvalidDataException("Invalid value");
         }

         super.l6(var1);
      }
   }

   public final boolean u3() {
      return this.h0(14);
   }

   @Override
   public int aq_() {
      byte var1 = 0;
      if (this.u3()) {
         var1 = 28;
      } else {
         var1 = 36;
      }

      return var1;
   }

   @Override
   public void l6(int var1) {
      if (this.u3() && var1 == 28) {
         super.l6(var1);
      } else {
         if (this.u3() || var1 != 36) {
            throw new InvalidDataException("Invalid value");
         }

         super.l6(var1);
      }
   }

   public final float u9() {
      return this.l6;
   }

   public final void n5(float var1) {
      this.l6 = var1;
   }

   public final float h0() {
      return this.k5;
   }

   public final void l6(float var1) {
      this.k5 = var1;
   }

   public final com.aspose.slides.internal.y5s.w1 c8() {
      return this.n5;
   }

   public final void n5(com.aspose.slides.internal.y5s.w1 var1) {
      var1.n5(this.n5);
   }
}
