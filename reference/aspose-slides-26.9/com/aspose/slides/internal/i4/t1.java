package com.aspose.slides.internal.i4;

public class t1 extends z8 {
   private u6 u3;
   private u6 a6;
   private u6 u9;
   private u6 h0;

   @Override
   public void n5(j9 var1) {
      j4 var2 = this.z1();
      this.u3 = new t4(this);
      this.a6 = new n5(this);
      this.u9 = new f0(var1, null, "toString", var2);
      this.h0 = new f0(var1, null, "toLocaleString", var2);
      var2.n5("constructor", this, 2);
      var2.n5("call".toString(), this.u3, 2);
      var2.n5("apply".toString(), this.a6, 2);
      var2.n5("toString", this.u9, 2);
      var2.n5("toLocaleString", this.h0, 2);
      var2.n5(new a3(var1, var2, "length"));
   }

   public final u6 s7() {
      u6 var1 = new u6(this.z1());
      var1.n5(this.x8().n3().n5(var1));
      return var1;
   }

   @Override
   public g7 n5(w2 var1, y1 var2, g7[] var3) {
      return var1.l6(this.n5(var3, null, var1));
   }

   @Override
   public j4 n5(g7[] var1, com.aspose.slides.ms.System.y8[] var2, w2 var3) {
      u6 var4 = this.s7();

      for (int var5 = 0; var5 < var1.length - 1; var5++) {
         String var6 = var1[var5].toString();

         for (String var10 : com.aspose.slides.ms.System.d1.n5(var6, ',')) {
            var4.e2().addItem(com.aspose.slides.ms.System.d1.l6(var10));
         }
      }

      if (var1.length >= 1) {
         u5 var11 = f5.n5(var1[var1.length - 1].C_().toString());
         var4.n5(new n3(var11.n5()));
      }

      return var4;
   }

   public t1(j9 var1, j4 var2) {
      super(var1, var2);
      this.h0("Function");
      this.n5("prototype", var2, 7);
   }
}
