package com.aspose.slides.internal.g7;

class d1 {
   private a5 n5;
   private v0 l6;
   private byte k5;
   private s0 u3;
   private l4 a6;
   private d5 u9;
   private b3 h0;
   private t1 c8;

   public d1(a5 var1, v0 var2) {
      this.n5 = var1;
      this.l6 = var2;
      this.u3 = new s0(var1);
      this.a6 = new l4(this, var1);
      this.u9 = new d5(var2, var1);
      this.h0 = new b3(var2, var1);
      this.c8 = new t1(var2, var1);
   }

   public final v0 n5() {
      int var1 = 0;
      int var2 = 0;
      this.n5.k5();
      this.n5.k5();
      this.k5 = this.n5.k5();
      this.n5.u9();
      this.n5.n5(com.aspose.slides.internal.v6g.k5.u9(this.k5, 6));
      this.l6.n5().n5().l6(com.aspose.slides.internal.v6g.k5.u3(this.k5, 6));
      this.u3.n5(this.l6.n5().k5());
      this.u3.n5(this.l6.n5().u3());
      this.u3.n5(this.l6.n5().a6());
      this.u3.n5(this.l6.n5().u9());
      this.l6.n5(new y8(true));
      int[] var3 = new int[]{0};
      int[] var4 = new int[]{0};
      this.l6.n5().u3().n5(0, var3, var4);
      var1 = var3[0];
      var2 = var4[0];
      this.a6.n5(this.l6.k5(), this.l6.n5().u3().u9(), var1, var2);
      this.n5.n5(this.l6.k5().n5().m3);
      this.u3.n5(this.l6.n5().h0());
      this.u9.n5(this.l6.n5().t2());
      if (!this.l6.h0()) {
         this.h0.n5(this.l6.n5().s7());
      }

      if (this.l6.h0()) {
         this.n5.n5(this.l6.k5().n5().i1);
         this.u3.n5(this.l6.n5().c8());
         this.l6.n5(new y8[this.l6.n5().c8().k5()]);

         for (int var5 = 0; var5 < this.l6.n5().c8().k5(); var5++) {
            this.l6.l6()[var5] = new y8(false);
            var3[0] = var1;
            var4[0] = var2;
            this.l6.n5().c8().n5(var5, var3, var4);
            var1 = var3[0];
            var2 = var4[0];
            this.a6.n5(this.l6.l6()[var5], this.l6.n5().c8().u9(), var1, var2);
         }

         this.c8.n5(this.l6.n5().l6());
      }

      this.l6.n5().n5().n5(this.n5(com.aspose.slides.internal.v6g.k5.k5(this.l6.n5().u9().k5(), 9)));
      return this.l6;
   }

   final int n5(int var1) {
      char var2;
      if (this.l6.k5().n5().y4 == 1) {
         var2 = 0;
      } else if (com.aspose.slides.internal.v6g.k5.k5(var1, 8) < 1240) {
         var2 = 'k';
      } else if (com.aspose.slides.internal.v6g.k5.k5(var1, 8) < 33900) {
         var2 = 1131;
      } else {
         var2 = '耀';
      }

      return var2;
   }
}
