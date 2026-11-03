package com.aspose.slides.internal.z4;

public class z8 extends z1 {
   public String n5;
   public int k5;
   public t2 u3;
   public z8 a6;
   public z8 u9;
   public z8 h0;
   public z8 c8;
   public z8 t2;

   public z8(c8 var1, String var2, int var3, t2 var4) {
      super(var1);
      this.n5 = var2;
      this.k5 = var3;
      this.u3 = var4;
   }

   @Override
   public void n5(t4 var1) {
      var1.n5(this.e2());
      var1.n5(this);
      var1.c8();
      var1.u3("/Title", this.n5);
      var1.k5("/Parent", this.a6.t2());
      if (this.u9 != null) {
         var1.k5("/Prev", this.u9.t2());
      }

      if (this.h0 != null) {
         var1.k5("/Next", this.h0.t2());
      }

      if (this.c8 != null) {
         var1.k5("/First", this.c8.t2());
      }

      if (this.t2 != null) {
         var1.k5("/Last", this.t2.t2());
      }

      if (this.c8 != null) {
         int var2 = this.n5();
         if (this.k5 >= this.l6.l6().u3()) {
            var2 = -var2;
         }

         var1.n5("/Count", var2);
      }

      var1.n5("/Dest");
      this.u3.n5(var1);
      var1.t2();
      var1.l6();

      for (z8 var3 = this.c8; var3 != null; var3 = var3.h0) {
         var3.n5(var1);
      }
   }

   public final void n5(z8 var1) {
      if (this.c8 == null) {
         this.c8 = var1;
      } else {
         this.t2.h0 = var1;
         var1.u9 = this.t2;
      }

      this.t2 = var1;
      var1.a6 = this;
   }

   private int n5() {
      int var1 = 0;

      for (z8 var2 = this.c8; var2 != null; var2 = var2.h0) {
         var1++;
      }

      return var1;
   }
}
