package com.aspose.slides.internal.v7y;

public final class t1 extends v3 {
   private j9 n5 = null;
   private int l6;
   private com.aspose.slides.internal.k4s.h0 u3;

   public t1(int var1, j9 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public void n5(com.aspose.slides.internal.k4s.h0 var1) {
      this.u3 = var1.a6() ? var1 : null;
      if (this.n5 != null) {
         this.n5.n5(var1);
      }
   }

   private com.aspose.slides.internal.x6s.a6 k5(com.aspose.slides.internal.x6s.h0 var1) {
      if (this.n5 == null) {
         return var1.k5();
      }

      this.n5.n5(var1);
      return this.n5.h0();
   }

   @Override
   public Object n5(com.aspose.slides.internal.x6s.h0 var1) {
      switch (this.l6) {
         case 0:
            return (double)var1.a6();
         case 1:
            return (double)var1.u3();
         case 2:
            this.n5.n5(var1);
            int var3 = 0;
            com.aspose.slides.internal.x6s.a6 var4;
            if (this.u3 != null) {
               while ((var4 = this.n5.h0()) != null) {
                  if (var4.k5() != 6 || this.u3.n5(var4)) {
                     var3++;
                  }
               }
            } else {
               while (this.n5.h0() != null) {
                  var3++;
               }
            }

            return (double)var3;
         case 3:
         default:
            break;
         case 4:
            com.aspose.slides.internal.x6s.a6 var6 = this.k5(var1);
            if (var6 != null) {
               return var6.u3();
            }
            break;
         case 5:
            com.aspose.slides.internal.x6s.a6 var5 = this.k5(var1);
            if (var5 != null) {
               return var5.a6();
            }
            break;
         case 6:
            com.aspose.slides.internal.x6s.a6 var2 = this.k5(var1);
            if (var2 != null) {
               return var2.u9();
            }
      }

      return com.aspose.slides.ms.System.d1.n5;
   }

   @Override
   public int u9() {
      return com.aspose.slides.internal.v7y.k5.n5[this.l6];
   }

   @Override
   public com.aspose.slides.internal.x6s.h0 n5() {
      t1 var1 = new t1(this.l6, n5(this.n5));
      var1.u3 = this.u3;
      return var1;
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public com.aspose.slides.internal.x6s.h0 deepClone() {
      return this.n5();
   }

}
