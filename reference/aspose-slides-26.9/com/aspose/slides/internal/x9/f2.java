package com.aspose.slides.internal.x9;

import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.internal.p3.p6;
import com.aspose.slides.internal.p3.t1;
import com.aspose.slides.ms.System.IDisposable;

public class f2 extends y1 {
   private com.aspose.slides.internal.v4.a0 t2;
   private com.aspose.slides.internal.v0.u3 s7;

   public f2(com.aspose.slides.internal.v4.a0 var1) {
      super(var1);
      this.t2 = var1;
   }

   @Override
   public void t4() {
      com.aspose.slides.internal.v0.h0 var1 = this.t2.n_().c_();
      com.aspose.slides.internal.v0.s7[] var2 = this.t2.e5().n5(var1);
      this.s7 = var1.n5(var2[0], this.t2.e5().n5.l6(this), var2[0].a6());
      this.n5(this.t2.o0());
   }

   @Override
   protected k5 n5(t1 var1) {
      return new k5(this.s7, this.t2.h2().u3(this).c8().l6(this), this.t2.v4(), this.t2.u6(), this.t2.t1(), this.t2.a5(), var1.j5());
   }

   @Override
   public com.aspose.slides.internal.d2.c8 l6(t1 var1) {
      com.aspose.slides.internal.d2.t9 var2 = new com.aspose.slides.internal.d2.t9();
      String var3 = this.w1().u9();
      int var4 = this.n5(var3);
      var2.n5(var3, 0);
      var2.l6(var4);
      var2.k5(this.s7.a6() - this.s7.u9());
      var2.n3(this.s7.a6());
      p6.n5(var2, this.s7);
      var2.n5(7, this.t2.b3().o8());
      p6.n5(var2, this.t2.v0());
      p6.n5(var2, this.t2.z7());
      return var2;
   }

   @Override
   protected com.aspose.slides.internal.d2.c8 a0() {
      com.aspose.slides.internal.d2.t9 var1 = (com.aspose.slides.internal.d2.t9)this.n3;
      com.aspose.slides.internal.d2.t9 var2 = new com.aspose.slides.internal.d2.t9();
      p6.n5(var2, this.t2.y1());
      var2.l6(var1.l6());
      var2.k5(var1.e_());
      var2.t9(var1.w1());
      var2.n3(var1.m3());
      var2.n5(7, this.t2.b3().o8());
      Dictionary$Enumerator var3 = var1.q0().iterator();

      try {
         while (var3.hasNext()) {
            KeyValuePair var4 = (KeyValuePair)var3.next();
            var2.q0().set_Item((Integer)var4.getKey(), var4.getValue());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      this.n5(var2);
      return var2;
   }

   private void n5(com.aspose.slides.internal.d2.t9 var1) {
      var1.y1();
      var1.n5(this.w1().u9(), 0);
      var1.z1(this.n5(var1.a0()) - var1.l6());
      this.z1.l6 = com.aspose.slides.internal.v8.u9.n5(var1.l6());
   }

   private int n5(String var1) {
      int var2 = 0;

      for (int var3 = 0; var3 < var1.length(); var3++) {
         var2 += this.s7.l6(var1.charAt(var3));
      }

      return var2;
   }
}
