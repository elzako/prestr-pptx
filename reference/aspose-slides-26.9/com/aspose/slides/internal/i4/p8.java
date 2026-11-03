package com.aspose.slides.internal.i4;

public class p8 extends z8 {
   private String u3;
   private j4 a6;
   private i9 u9;
   private u6 h0;
   private u6 c8;

   @Override
   public void n5(j9 var1) {
      j4 var2 = this.z1();
      this.u9 = var1.c4().u9(this.u3);
      this.h0 = new f2(var1, "toString", var2);
      this.c8 = new f2(var1, "toString", var2);
      var2.n5("name", this.u9, 7);
      var2.n5("toString", this.h0, 2);
      var2.n5("toLocaleString", this.c8, 2);
   }

   public final s3 u9(String var1) {
      s3 var2 = new s3(this.x8());
      var2.n5("message", this.x8().c4().u9(var1));
      return var2;
   }

   public final s3 s7() {
      return this.u9(com.aspose.slides.ms.System.d1.n5);
   }

   @Override
   public g7 n5(w2 var1, y1 var2, g7[] var3) {
      if (var2 != null && com.aspose.slides.internal.v6g.k5.n5(var2, j9.class) != var1.u3()) {
         if (var3.length > 0) {
            var2.n5((Object)var3[0].toString());
         } else {
            var2.n5((Object)com.aspose.slides.ms.System.d1.n5);
         }

         var1.l6(var2);
      } else {
         var1.l6(var3.length > 0 ? this.u9(var3[0].toString()) : this.s7());
      }

      return var2;
   }

   @Override
   public j4 n5(g7[] var1, com.aspose.slides.ms.System.y8[] var2, w2 var3) {
      return var1 != null && var1.length > 0 ? var3.u3().t4().u9(var1[0].toString()) : var3.u3().t4().s7();
   }

   public p8(j9 var1, String var2) {
      super(var1);
      this.u3 = var2;
      this.h0(var2);
      this.a6 = var1.n3().n5(this);
      this.n5("prototype", this.a6, 7);
   }
}
