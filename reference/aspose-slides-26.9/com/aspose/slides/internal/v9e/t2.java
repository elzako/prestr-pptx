package com.aspose.slides.internal.v9e;

public class t2 extends y2 {
   private int n5;
   private String l6;
   private String k5;
   private String u3;
   private boolean a6;
   private Object u9;

   public t2(z1 var1) {
      z7 var2 = var1.u3();
      this.n5 = var2.n3();
      this.l6 = var2.t9();
      this.k5 = var2.e2();
      this.u3 = var2.z1();
      this.a6 = var2.q0();
      if (this.n5 == 1) {
         this.u9 = d2.n5(this.k5);
      } else if (this.n5 == 2) {
         this.u9 = a0.n5(this.k5);
      }
   }

   @Override
   public void n5(z1 var1) {
      if (this.n5 != 2 || this.l6.length() != 0) {
         o0 var2 = var1.u9(this.l6);
         if (var2 != null) {
            this.l6 = var2.l6;
            if (var2.n5 != null) {
               this.u3 = var2.n5;
            }
         }
      }
   }

   @Override
   public boolean n5(p3 var1, l6 var2) {
      return var1.n5(this.n5, this.u3, this.k5, this.l6, this.a6, this.u9, false);
   }
}
