package com.aspose.slides.internal.v7y;

public final class p7 extends s9 {
   private int h0 = 0;

   public p7(j9 var1, boolean var2, String var3, String var4, int var5, boolean var6) {
      super(var1, var3, var4, var5, var2, var6);
   }

   private p7(p7 var1) {
      super(var1);
      this.h0 = var1.h0;
   }

   @Override
   public void t2() {
      this.h0 = 0;
      super.t2();
   }

   @Override
   public com.aspose.slides.internal.x6s.a6 h0() {
      label30:
      while (true) {
         if (this.h0 == 0) {
            this.l6 = this.n5.h0();
            this.u3 = 0;
            if (this.l6 == null) {
               return null;
            }

            if (this.a6 && this.l6(this.l6)) {
               this.u3 = 1;
               return this.l6;
            }

            this.l6 = this.l6.n5();
            if (!this.z1()) {
               continue;
            }
         } else if (!this.t4()) {
            continue;
         }

         while (!this.l6(this.l6)) {
            if (!this.z1()) {
               continue label30;
            }
         }

         this.u3++;
         return this.l6;
      }
   }

   private boolean z1() {
      if (this.l6.t4()) {
         this.h0++;
         return true;
      } else {
         return false;
      }
   }

   private boolean t4() {
      while (!this.l6.z1()) {
         this.h0--;
         if (this.h0 == 0) {
            return false;
         }

         boolean var1 = this.l6.q0();
      }

      return true;
   }

   @Override
   public com.aspose.slides.internal.x6s.h0 n5() {
      return new p7(this);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public com.aspose.slides.internal.x6s.h0 deepClone() {
      return this.n5();
   }

}
