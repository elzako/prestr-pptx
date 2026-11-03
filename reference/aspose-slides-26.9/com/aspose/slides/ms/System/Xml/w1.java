package com.aspose.slides.ms.System.Xml;

public abstract class w1 extends com.aspose.slides.internal.x6s.h0 {
   private q0 n5;
   private int l6;
   private int u3;

   public w1(q0 var1) {
      this.n5 = (q0)var1.n5();
      this.l6 = 0;
      this.u3 = 0;
   }

   public w1(w1 var1) {
      this.n5 = (q0)var1.n5.n5();
      this.l6 = var1.l6;
      this.u3 = var1.u3;
   }

   protected abstract boolean n5(l0 var1);

   @Override
   public com.aspose.slides.internal.x6s.a6 k5() {
      return this.n5;
   }

   @Override
   public int u3() {
      return this.u3;
   }

   protected final void n5(int var1) {
      this.u3 = var1;
   }

   @Override
   public boolean l6() {
      l0 var1;
      do {
         if (this.n5.t4()) {
            this.l6++;
         } else {
            if (this.l6 == 0) {
               return false;
            }

            while (!this.n5.z1()) {
               this.l6--;
               if (this.l6 == 0) {
                  return false;
               }

               if (!this.n5.q0()) {
                  return false;
               }
            }
         }

         var1 = (l0)this.n5.n3();
      } while (var1.getNodeType() != 1 || !this.n5(var1));

      this.u3++;
      return true;
   }
}
