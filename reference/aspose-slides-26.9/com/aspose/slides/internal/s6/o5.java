package com.aspose.slides.internal.s6;

final class o5 {
   private p3 n5;
   private i9 l6;
   private t9 k5;
   private a3 u3;
   private t9 a6;
   private h2 u9;

   public final i9 n5() {
      return this.l6;
   }

   public final t9 l6() {
      return this.k5;
   }

   public final a3 k5() {
      return this.u3;
   }

   public final t9 u3() {
      return this.a6;
   }

   public final h2 a6() {
      return this.u9;
   }

   public o5(p3 var1) {
      this.n5 = var1;
      this.l6 = new i9();
      this.k5 = new t9();
      this.u3 = new a3();
      this.a6 = new t9();
      this.u9 = new h2();
   }

   public final h2 u9() {
      for (int var1 = 0; var1 < this.u3().n5(); var1++) {
         z6.n5(this.n5, this.u3().l6(var1), true);
      }

      for (int var4 = 0; var4 < this.n5().n5(); var4++) {
         this.n5.n5().n5(this.n5().l6(var4));
      }

      for (int var5 = 0; var5 < this.l6().n5(); var5++) {
         this.n5.l6().u3(this.l6().l6(var5));
      }

      h2 var6 = new h2();

      for (int var2 = 0; var2 < this.k5().n5(); var2++) {
         a5 var3;
         this.n5
            .u3()
            .n5(
               var3 = new a5(
                  this.k5().n5(var2).n5, this.k5().n5(var2).l6, this.k5().n5(var2).k5, this.k5().n5(var2).u3, this.k5().n5(var2).a6, this.k5().n5(var2).u9
               )
            );
         var6.n5(var3);
      }

      return var6;
   }
}
