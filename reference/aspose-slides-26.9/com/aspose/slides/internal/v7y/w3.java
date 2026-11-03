package com.aspose.slides.internal.v7y;

import com.aspose.slides.Collections.Generic.List;

public final class w3 extends k8 {
   private c2<com.aspose.slides.internal.x6s.a6> a6;
   private List<com.aspose.slides.internal.x6s.a6> u9;
   private com.aspose.slides.internal.x6s.a6 h0;

   public w3(j9 var1, String var2, String var3, int var4) {
      super(var1, var2, var3, var4);
      this.a6 = new c2<>();
      this.u9 = new List<>();
   }

   private w3(w3 var1) {
      super(var1);
      this.a6 = var1.a6.k5();
      this.u9 = new List<>(var1.u9);
      this.h0 = k5(var1.h0);
   }

   @Override
   public void t2() {
      this.a6.clear();
      this.u9.clear();
      this.h0 = null;
      super.t2();
   }

   private boolean u3(com.aspose.slides.internal.x6s.a6 var1) {
      com.aspose.slides.internal.x6s.a6 var2 = var1.n5();
      var2.q0();

      for (int var3 = 0; var3 < this.u9.size(); var3++) {
         if (var2.l6(this.u9.get_Item(var3))) {
            return true;
         }
      }

      this.u9.addItem(var2);
      return false;
   }

   private com.aspose.slides.internal.x6s.a6 z1() {
      com.aspose.slides.internal.x6s.a6 var1;
      do {
         var1 = this.n5.h0();
         if (var1 == null) {
            return null;
         }
      } while (this.u3(var1));

      return var1.n5();
   }

   @Override
   public com.aspose.slides.internal.x6s.a6 h0() {
      while (true) {
         if (this.l6 == null) {
            if (this.h0 == null) {
               this.h0 = this.z1();
            }

            if (this.a6.size() == 0) {
               if (this.h0 == null) {
                  return null;
               }

               this.l6 = this.h0;
               this.h0 = this.z1();
            } else {
               this.l6 = this.a6.n5();
            }
         }

         while (this.l6.k5(this.h0)) {
            this.a6.n5(this.l6);
            this.l6 = this.h0;
            this.h0 = this.n5.h0();
            if (this.h0 != null) {
               this.h0 = this.h0.n5();
            }
         }

         while (this.l6.z1()) {
            if (this.l6(this.l6)) {
               this.u3++;
               return this.l6;
            }
         }

         this.l6 = null;
      }
   }

   @Override
   public com.aspose.slides.internal.x6s.h0 n5() {
      return new w3(this);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public com.aspose.slides.internal.x6s.h0 deepClone() {
      return this.n5();
   }

}
