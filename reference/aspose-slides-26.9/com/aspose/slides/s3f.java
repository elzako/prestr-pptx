package com.aspose.slides;

final class s3f {
   private int n5;
   private d5f l6;
   private t2s k5;
   private com.aspose.slides.internal.k0r.l1b[] u3 = new com.aspose.slides.internal.k0r.l1b[5];
   private boolean a6 = false;
   private boolean u9 = false;
   private TextStyle h0;

   s3f(com.aspose.slides.internal.k0r.o6t var1, t2s var2) {
      this.k5 = var2;
      this.l6 = this.k5.a6();
      this.n5 = var1.w1().k5();
      this.k5.e2()[this.n5] = this;
      this.n5(var1);
   }

   s3f(com.aspose.slides.internal.k0r.o6t var1, d5f var2) {
      this.l6 = var2;
      this.n5 = var1.w1().k5();
      this.l6.m3().addItem(this.n5, this);
      this.n5(var1);
   }

   final void n5(com.aspose.slides.internal.k0r.o6t var1) {
      if (var1 != null) {
         this.u3 = new com.aspose.slides.internal.k0r.l1b[5];

         for (int var2 = 0; var2 < var1.u3().size(); var2++) {
            this.u3[var2] = new com.aspose.slides.internal.k0r.l1b();
            this.u3[var2].n5(var1.u3().get_Item(var2));
         }

         this.a6 = false;
      }
   }

   final void n5() {
      if (!this.a6) {
         for (int var1 = 4; var1 > 0; var1--) {
            if (this.u3[var1] != null) {
               for (int var2 = var1 - 1; var2 >= 0; var2--) {
                  if (this.u3[var2] != null) {
                     this.u3[var1].n5(this.u3[var2]);
                  }
               }
            }
         }

         this.a6 = true;
      }
   }

   final void n5(s3f var1) {
      if (var1 != null) {
         for (int var2 = 0; var2 < 5; var2++) {
            if (this.u3[var2] != null) {
               int var3;
               for (var3 = var2; var3 >= 0; var3--) {
                  if (var1.a6()[var3] != null) {
                     this.u3[var2].n5(var1.a6()[var3]);
                     break;
                  }
               }

               if (var3 < 0) {
                  break;
               }
            }
         }
      }
   }

   final void l6() {
      if (this.h0 == null) {
         this.h0 = new TextStyle(this.k5.y4());
      }

      l4e.n5(this);
      this.u9 = true;
   }

   final t2s k5() {
      return this.k5;
   }

   public final d5f u3() {
      return this.l6;
   }

   final com.aspose.slides.internal.k0r.l1b[] a6() {
      return this.u3;
   }

   final int u9() {
      return this.n5;
   }

   final TextStyle h0() {
      return this.h0;
   }

   final void n5(TextStyle var1) {
      this.h0 = var1;
   }

   final int c8() {
      int var1 = this.n5;
      if (var1 < 5) {
         return -1;
      } else {
         return var1 == 6 ? 0 : 1;
      }
   }

   public final boolean t2() {
      return this.u9;
   }
}
