package com.aspose.slides.internal.z4;

public class m3 {
   private final c8 n5;
   private final z8 l6;
   private z8 k5;

   public m3(c8 var1) {
      this.n5 = var1;
      this.l6 = new z8(this.n5, "Root", -1, null);
      this.k5 = this.l6;
   }

   public final void n5(String var1, int var2, t2 var3) {
      z8 var4 = new z8(this.n5, var1, var2, var3);
      if (var4.k5 > this.k5.k5) {
         this.k5.n5(var4);
      } else if (var4.k5 >= this.k5.k5) {
         this.k5.a6.n5(var4);
      } else {
         while (this.k5.k5 >= var4.k5) {
            this.k5 = this.k5.a6;
         }

         this.k5.n5(var4);
      }

      this.k5 = var4;
   }

   public final void n5(t4 var1) {
      var1.n5(this.l6);
      var1.c8();
      var1.k5("/Type", "/Outlines");
      if (this.l6.c8 != null) {
         var1.k5("/First", this.l6.c8.t2());
      }

      if (this.l6.t2 != null) {
         var1.k5("/Last", this.l6.t2.t2());
      }

      var1.t2();
      var1.l6();

      for (z8 var2 = this.l6.c8; var2 != null; var2 = var2.h0) {
         var2.n5(var1);
      }
   }

   public final boolean n5() {
      return this.l6.c8 == null;
   }

   public final String l6() {
      return this.l6.t2();
   }
}
