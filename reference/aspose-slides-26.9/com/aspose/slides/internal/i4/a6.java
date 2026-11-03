package com.aspose.slides.internal.i4;

public class a6 extends z8 {
   private u6 u3;
   private u6 a6;
   private u6 u9;
   private u6 h0;
   private u6 c8;
   private u6 t2;
   private u6 s7;
   private u6 x8;
   private u6 n3;
   private u6 y4;
   private u6 e2;
   private u6 t9;
   private u6 z1;
   private u6 t4;
   private j4 q0;

   @Override
   public void n5(j9 var1) {
      j4 var2 = this.z1();
      c8 var3 = new c8(var1, var2, "length");
      var3.n5(false);
      var2.n5(var3);
      this.u3 = new h0(var1, "toString", var2);
      this.a6 = new h0(var1, "toLocaleString", var2);
      this.u9 = new h0(var1, "concat", var2);
      this.h0 = new h0(var1, "join", var2);
      this.c8 = new h0(var1, "pop", var2);
      this.t2 = new h0(var1, "push", var2);
      this.s7 = new h0(var1, "reverse", var2);
      this.x8 = new h0(var1, "shift", var2);
      this.n3 = new h0(var1, "slice", var2);
      this.y4 = new h0(var1, "sort", var2);
      this.e2 = new h0(var1, "splice", var2);
      this.t9 = new h0(var1, "unshift", var2);
      this.z1 = new h0(var1, "indexOf", var2);
      this.t4 = new h0(var1, "lastIndexOf", var2);
      var2.n5("toString", this.u3, 2);
      var2.n5("toLocaleString", this.a6, 2);
      var2.n5("concat", this.u9, 2);
      var2.n5("join", this.h0, 2);
      var2.n5("pop", this.c8, 2);
      var2.n5("push", this.t2, 2);
      var2.n5("reverse", this.s7, 2);
      var2.n5("shift", this.x8, 2);
      var2.n5("slice", this.n3, 2);
      var2.n5("sort", this.y4, 2);
      var2.n5("splice", this.e2, 2);
      var2.n5("unshift", this.t9, 2);
      var2.n5("indexOf", this.z1, 2);
      var2.n5("lastIndexOf", this.t4, 2);
   }

   public final u3 h0() {
      return new u3(this.z1());
   }

   public final u3 n5(g7[] var1) {
      return new u3(this.z1()).n5(this.x8(), var1);
   }

   @Override
   public j4 n5(g7[] var1, com.aspose.slides.ms.System.y8[] var2, w2 var3) {
      u3 var4 = this.h0();

      for (int var5 = 0; var5 < var1.length; var5++) {
         var4.n5(var5, var1[var5]);
      }

      return var4;
   }

   @Override
   public g7 n5(w2 var1, y1 var2, g7[] var3) {
      if (var2 != null && com.aspose.slides.internal.v6g.k5.n5(var2, j9.class) != var1.u3()) {
         for (int var4 = 0; var4 < var3.length; var4++) {
            var2.n5(com.aspose.slides.ms.System.a3.l6(var4), var3[var4]);
         }

         return var1.l6(var2);
      } else {
         return var1.l6(this.n5(var3, null, var1));
      }
   }

   public a6(j9 var1) {
      super(var1);
      this.h0("Array");
      this.q0 = var1.n3().n5(this);
      this.n5("prototype", this.q0, 7);
   }
}
