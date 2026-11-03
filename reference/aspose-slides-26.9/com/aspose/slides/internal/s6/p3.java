package com.aspose.slides.internal.s6;

public class p3 {
   i9 n5;
   h2 l6;
   t9 k5;
   t9 u3;
   v4 a6;

   public final i9 n5() {
      return this.n5;
   }

   public final t9 l6() {
      return this.k5;
   }

   public final t9 k5() {
      return this.u3;
   }

   public final void n5(t9 var1) {
      this.u3 = var1;
   }

   public final h2 u3() {
      return this.l6;
   }

   public final v4 a6() {
      return this.a6;
   }

   public final void n5(v4 var1) {
      this.a6 = var1;
   }

   public p3() {
      this.n5 = new i9();
      this.k5 = new t9();
      this.l6 = new h2();
      this.u3 = null;
      this.a6 = null;
   }

   public p3(i9 var1, t9 var2) {
      if (var1.n5() >= 3) {
         this.n5 = var1;
         this.k5 = new t9();
         this.l6 = new h2();
         this.u3 = var2;
         new e9(this);
         x9.n5(this);
      }
   }

   public p3(com.aspose.slides.internal.x4g.s7 var1) {
      this();
      com.aspose.slides.internal.o9b.w1[] var2 = var1.a6();
      d2 var3 = new d2(var1.a6().length);
      int var4 = var1.a6().length;

      for (int var5 = 0; var5 < var4; var5++) {
         var3.n5(new a0(var2[var5].l6(), var2[var5].k5()));
      }

      byte[] var6 = var1.u9();
      if (var4 >= 3) {
         new e9(this, var3, var6);
         x9.n5(this);
      }
   }

   public final n3 u9() {
      n3 var1 = new n3();
      var1.n5.n5(this.n5.l6());
      int var2 = this.n5().n5();

      for (int var3 = 0; var3 < var2; var3++) {
         this.n5().l6(var3).n5(new j4[1]);
         j4 var4 = new j4(this.n5().l6(var3));
         this.n5().l6(var3).u9()[0] = var4;
         var1.n5.n5(var4);
      }

      var1.k5.n5(this.k5.l6());
      int var8 = this.l6().n5();

      for (int var11 = 0; var11 < var8; var11++) {
         e2 var5 = new e2(this.l6().l6(var11).n5()[0].u9()[0], this.l6().l6(var11).n5()[1].u9()[0]);
         this.l6().l6(var11).l6(var5);
         var1.k5.n5(var5);
         this.l6().l6(var11).u9().n5(this.l6().l6(var11).k5());
      }

      var1.u3 = new t9(this.u3.l6());
      var8 = this.u3.n5();

      for (int var12 = 0; var12 < var8; var12++) {
         e2 var14 = new e2(this.u3.l6(var12).n5()[0].u9()[0], this.u3.l6(var12).n5()[1].u9()[0]);
         this.u3.l6(var12).l6(var14);
         var1.u3.n5(var14);
      }

      var1.l6.n5(this.l6.l6());
      int var13 = this.l6.n5();

      for (int var6 = 0; var6 < var13; var6++) {
         a5 var15 = new a5(
            this.l6.l6(var6).n5()[0].u9()[0],
            this.l6.l6(var6).n5()[1].u9()[0],
            this.l6.l6(var6).n5()[2].u9()[0],
            this.l6.l6(var6).l6()[0].u9(),
            this.l6.l6(var6).l6()[1].u9(),
            this.l6.l6(var6).l6()[2].u9()
         );
         var15.n5(this.l6.l6(var6).k5());
         var1.l6.n5(var15);
      }

      if (this.a6() != null) {
         var1.a6 = new v4();
         var1.a6.n5().n5(this.a6.n5().l6());
         var2 = this.a6().n5().n5();

         for (int var16 = 0; var16 < var2; var16++) {
            var1.a6.n5().n5(this.a6().n5().l6(var16).u9()[0]);
         }

         var1.a6.l6().n5(this.a6.l6().l6());
         var8 = this.a6().l6().n5();

         for (int var17 = 0; var17 < var8; var17++) {
            var1.a6.l6().n5(this.a6().l6().l6(var17).u9());
         }
      }

      return var1;
   }
}
