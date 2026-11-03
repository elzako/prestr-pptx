package com.aspose.slides.internal.w2i;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.s3;

public class t2 {
   private s7 n5;
   private c8 l6 = new c8();
   private final List<x8> k5;

   public t2() {
      this.n5 = null;
      this.l6 = new c8();
      this.k5 = new List<>();
   }

   public final void n5(com.aspose.slides.internal.z0k.t4 var1) {
      this.n5 = new s7(var1);
      this.u3();
   }

   public final void n5() {
      this.n5 = null;
   }

   private void u3() {
      this.l6.n5 = this.n5.k5();
      this.l6.l6 = this.n5.k5();
      this.l6.k5 = this.n5.k5();
      this.l6.u3 = this.n5.k5() & 4294967295L;
      this.l6.a6 = this.n5.k5() & 4294967295L;
      this.l6.u9 = this.n5.k5() & 4294967295L;
      this.l6.h0.n5 = this.n5.l6();
      this.l6.h0.l6 = this.n5.l6();
      this.l6.h0.k5 = this.n5.l6();
      this.l6.h0.u3 = this.n5.l6();
      this.l6.h0.a6 = this.n5.l6();
      this.l6.h0.u9 = this.n5.l6();
      this.l6.c8 = this.n5.k5();
      this.l6.t2 = this.n5.k5() & 4294967295L;
      this.l6.s7 = this.n5.k5() & 4294967295L;
      this.l6.x8 = this.n5.k5();
      this.l6.n3 = this.n5.k5();
      this.l6.y4 = this.n5.u3();
      this.l6.e2 = (int)this.n5.k5();
      this.l6.t9.n5 = (float)(this.n5.k5() & 4294967295L) / 65536.0F;
      this.l6.t9.l6 = (float)(this.n5.k5() & 4294967295L) / 65536.0F;
      this.l6.t9.k5 = (float)(this.n5.k5() & 4294967295L) / 65536.0F;
      this.l6.z1 = this.n5.k5();
      this.l6.t4 = this.n5.n5(16);
      this.l6.q0 = this.n5.n5(28);
      if ((this.l6.c8 & 4294967295L) != 1633907568L) {
         throw new com.aspose.slides.internal.d3l.h0();
      }

      if (this.l6.e2 != 3 && this.l6.e2 != 0 && this.l6.e2 != 1 && this.l6.e2 != 2) {
         throw new com.aspose.slides.internal.d3l.h0(d1.n5("Invalid rendering intent {0}", new Object[]{s3.n5(e2.class, this.l6.e2)}));
      }

      this.k5.clear();
      z1 var1 = new z1();
      long var2 = this.n5.k5();

      for (int var4 = 0; var4 < (var2 & 4294967295L); var4++) {
         var1.n5 = (int)this.n5.k5();
         var1.l6 = this.n5.k5();
         var1.k5 = this.n5.k5();
         this.k5.addItem(new x8(var1.n5()));
      }
   }

   public final com.aspose.slides.internal.u7q.k5 n5(int var1) {
      x8 var2 = null;
      List$Enumerator var3 = this.k5.iterator();

      try {
         while (var3.hasNext()) {
            x8 var4 = (x8)var3.next();
            if (var4.n5().n5 == var1) {
               var2 = var4;
               break;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      if (var2 == null) {
         return null;
      }

      if (var2.l6() == null) {
         this.n5(var2);
      }

      return var2.l6();
   }

   private void n5(x8 var1) {
      this.n5.n5(var1.n5().l6 & 4294967295L);
      com.aspose.slides.internal.u7q.k5 var2 = com.aspose.slides.internal.u7q.k5.n5((int)this.n5.k5());
      this.n5.n5(var1.n5().l6 & 4294967295L);
      var2.n5(this.n5);
      switch (var1.n5().n5) {
         case 1093812784:
         case 1093812785:
         case 1093812786:
            com.aspose.slides.internal.u7q.l6 var3 = com.aspose.slides.internal.v6g.k5.n5(var2, com.aspose.slides.internal.u7q.l6.class);
            if (var3 != null) {
               var3.n5(this.l6().a6, this.l6().u9);
            }
            break;
         case 1110589744:
         case 1110589745:
         case 1110589746:
            com.aspose.slides.internal.u7q.l6 var4 = com.aspose.slides.internal.v6g.k5.n5(var2, com.aspose.slides.internal.u7q.l6.class);
            if (var4 != null) {
               var4.n5(this.l6().u9, this.l6().a6);
            }
      }

      var1.n5(var2);
   }

   public final c8 l6() {
      return this.l6;
   }

   public final boolean k5() {
      return this.l6.a6 == 1129142603L;
   }
}
