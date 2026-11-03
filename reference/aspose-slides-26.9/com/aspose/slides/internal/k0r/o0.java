package com.aspose.slides.internal.k0r;

public class o0 extends d0 {
   private g3 n5;
   private p2 l6;
   private h7 k5;
   private t8 u3;

   public final g3 l6() {
      if (this.n5 != null) {
         return this.n5;
      }

      z4 var1 = this.n5("___PPT9");
      if (var1 != null) {
         this.n5 = (g3)var1.l6();
      } else if (this.n3()) {
         var1 = new b3();
         var1.l6(this);
         this.e2().addItem(var1);
         z1 var2 = new z1("___PPT9", (short)0);
         var2.l6(var1);
         var1.e2().addItem(var2);
         this.n5 = new g3();
         this.n5.l6(true);
         this.n5.l6(var1);
         var1.e2().addItem(this.n5);
      }

      return this.n5;
   }

   public final p2 u3() {
      if (this.l6 != null) {
         return this.l6;
      }

      z4 var1 = this.n5("___PPT10");
      if (var1 != null) {
         this.l6 = (p2)var1.l6();
      } else if (this.n3()) {
         var1 = new b3();
         var1.l6(this);
         this.e2().addItem(var1);
         z1 var2 = new z1("___PPT10", (short)0);
         var2.l6(var1);
         var1.e2().addItem(var2);
         this.l6 = new p2();
         this.l6.l6(true);
         this.l6.l6(var1);
         var1.e2().addItem(this.l6);
      }

      return this.l6;
   }

   public final h7 a6() {
      if (this.k5 != null) {
         return this.k5;
      }

      z4 var1 = this.n5("___PPT11");
      if (var1 != null) {
         this.k5 = (h7)var1.l6();
      } else if (this.n3()) {
         var1 = new b3();
         var1.l6(this);
         this.e2().addItem(var1);
         z1 var2 = new z1("___PPT11", (short)0);
         var2.l6(var1);
         var1.e2().addItem(var2);
         this.k5 = new h7();
         this.k5.l6(true);
         this.k5.l6(var1);
         var1.e2().addItem(this.k5);
      }

      return this.k5;
   }

   public final t8 u9() {
      if (this.u3 != null) {
         return this.u3;
      }

      z4 var1 = this.n5("___PPT12");
      if (var1 != null) {
         this.u3 = (t8)var1.l6();
      } else if (this.n3()) {
         var1 = new b3();
         var1.l6(this);
         this.e2().addItem(var1);
         z1 var2 = new z1("___PPT12", (short)0);
         var2.l6(var1);
         var1.e2().addItem(var2);
         this.u3 = new t8();
         this.u3.l6(true);
         this.u3.l6(var1);
         var1.e2().addItem(this.k5);
      }

      return this.u3;
   }

   public final z4 h0() {
      return this.n5("___PPTMac11");
   }
}
