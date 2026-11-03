package com.aspose.slides.internal.i4;

public class p7 extends z8 {
   private z5 u3;
   private u6 a6;
   private u6 u9;
   private u6 h0;
   private u6 c8;
   private u6 t2;

   @Override
   public void n5(j9 var1) {
      j4 var2 = this.z1();
      this.a6 = new z5(var1, "toString", var2);
      this.u9 = new z5(var1, "toLocaleString", var2);
      this.h0 = new z5(var1, "lastIndex", var2);
      this.c8 = new z5(var1, "exec", var2);
      this.t2 = new z5(var1, "test", var2);
      var2.n5("toString", this.a6, 2);
      var2.n5("toLocaleString", this.u9, 2);
      var2.n5("lastIndex", this.h0, 2);
      var2.n5("exec", this.c8, 2);
      var2.n5("test", this.t2, 2);
   }

   public final s9 s7() {
      return this.n5(com.aspose.slides.ms.System.d1.n5, false, false, false);
   }

   public final s9 n5(String var1, boolean var2, boolean var3, boolean var4) {
      s9 var5 = new s9(var1, var2, var3, var4, this.z1());
      var5.n5("source", this.x8().c4().u9(var1));
      var5.n5("lastIndex", this.x8().w1().n5(0.0));
      var5.n5("global", this.x8().t9().n5(var2));
      return var5;
   }

   public final g7 n5(s9 var1, g7[] var2) {
      return this.u3.l6(var1, var2);
   }

   @Override
   public g7 n5(w2 var1, y1 var2, g7[] var3) {
      return var3.length == 0 ? var1.l6(this.s7()) : var1.l6(this.n5(var3[0].toString(), false, false, false));
   }

   public p7(j9 var1) {
      super(var1);
      this.n5 = "RegExp";
      this.u3 = new z5(var1, null, this.z1());
      this.n5("prototype", var1.n3().n5(this), 7);
   }
}
