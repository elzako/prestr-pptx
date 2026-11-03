package com.aspose.slides.internal.v7y;

public final class q1 extends w8 {
   private com.aspose.slides.internal.x6s.a6 a6 = null;
   private c2<com.aspose.slides.internal.x6s.a6> u9;
   private c2<Integer> h0;
   private boolean c8;

   public q1(j9 var1, String var2, String var3, int var4) {
      super(var1, var2, var3, var4);
      this.u9 = new c2<>();
      this.h0 = new c2<>();
      this.c8 = true;
   }

   private q1(q1 var1) {
      super(var1);
      this.a6 = k5(var1.a6);
      this.u9 = var1.u9.k5();
      this.h0 = var1.h0.k5();
      this.c8 = var1.c8;
   }

   @Override
   public void t2() {
      this.a6 = null;
      this.u9.clear();
      this.h0.clear();
      this.c8 = true;
      super.t2();
   }

   @Override
   public com.aspose.slides.internal.x6s.a6 h0() {
      while (true) {
         if (this.c8) {
            if (this.u9.size() == 0) {
               this.l6 = this.t4();
               if (this.l6 == null) {
                  return null;
               }

               if (!this.l6.t4()) {
                  continue;
               }

               this.u3 = 0;
            } else {
               this.l6 = this.u9.n5();
               this.u3 = this.h0.n5();
               if (!this.z1()) {
                  continue;
               }
            }

            this.c8 = false;
         } else if (!this.l6.z1() || !this.z1()) {
            this.c8 = true;
            continue;
         }

         if (this.l6(this.l6)) {
            this.u3++;
            return this.l6;
         }
      }
   }

   private boolean z1() {
      this.a6 = this.t4();
      if (this.a6 != null && n5(this.l6, this.a6) == 1) {
         this.u9.n5(this.l6);
         this.h0.n5(this.u3);
         this.l6 = this.a6;
         this.a6 = null;
         if (!this.l6.t4()) {
            return false;
         }

         this.u3 = 0;
      }

      return true;
   }

   private com.aspose.slides.internal.x6s.a6 t4() {
      com.aspose.slides.internal.x6s.a6 var1;
      if (this.a6 != null) {
         var1 = this.a6;
         this.a6 = null;
      } else {
         var1 = this.n5.h0();
         if (var1 != null) {
            var1 = var1.n5();
         }
      }

      return var1;
   }

   @Override
   public com.aspose.slides.internal.x6s.h0 n5() {
      return new q1(this);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public com.aspose.slides.internal.x6s.h0 deepClone() {
      return this.n5();
   }

}
