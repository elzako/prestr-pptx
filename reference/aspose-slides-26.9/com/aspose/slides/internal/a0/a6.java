package com.aspose.slides.internal.a0;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.internal.p3.a5;
import com.aspose.slides.internal.p3.e9;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d1;

public class a6 extends com.aspose.slides.internal.e5.c8 {
   private com.aspose.slides.internal.p3.y1 u3;
   protected u9 n5;
   private boolean a6 = true;
   private q0 u9;
   private com.aspose.slides.internal.t1.k7 h0;
   private com.aspose.slides.internal.y1.h0 c8 = new com.aspose.slides.internal.y1.h0();
   private com.aspose.slides.internal.p3.d2 t2;
   private int s7 = 0;

   public a6(com.aspose.slides.internal.y1.u3 var1, String var2, com.aspose.slides.internal.z0k.t4 var3) {
      super(var1);
      this.n5(var1, var2, var3);
      this.u3 = var1.a6().c8();
      if (this.u3 == null) {
         this.u3 = new a5();
      }

      this.u9 = new q0();
      this.a6 = var1.k7();
   }

   protected final void n5(com.aspose.slides.internal.y1.u3 var1, String var2, com.aspose.slides.internal.z0k.t4 var3) {
      this.n5 = new a0(var1, var2, this.k5, var3);
   }

   public final u9 k5() {
      return this.n5;
   }

   public final com.aspose.slides.internal.p3.y1 u3() {
      return this.u3;
   }

   public final q0 a6() {
      return this.u9;
   }

   public final boolean u9() {
      return this.a6;
   }

   @Override
   public void n5() {
   }

   @Override
   public void n5(com.aspose.slides.internal.t1.k7 var1) {
      com.aspose.slides.internal.x7n.l6 var2 = var1.u6();
      if (var2 != null) {
         this.n5.n5(var2);
      }
   }

   private void n5(com.aspose.slides.internal.f2.u3 var1) {
      if (this.t2 != null) {
         this.t2.n5(var1);
         this.t2.v_();
         this.t2 = null;
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.t1.t2 var1) {
      this.n5((com.aspose.slides.internal.t1.n5)var1);
   }

   private void n5(com.aspose.slides.internal.t1.n5 var1) {
      this.h0 = var1.e2();
      if (this.t2 == null) {
         this.n5(this.h0.s3());
         if (this.h0.o0() != null) {
            this.n5(this.h0.o0().s3());
         }
      }

      this.n5(var1.o0());
      var1.i1();
   }

   private void n5(List<com.aspose.slides.internal.o0.n5> var1) {
      List$Enumerator var2 = var1.iterator();

      try {
         while (var2.hasNext()) {
            com.aspose.slides.internal.o0.n5 var3 = (com.aspose.slides.internal.o0.n5)var2.next();
            this.n5(new w1(var3));
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   @Override
   public void l6(com.aspose.slides.internal.t1.t2 var1) {
      try {
         if (var1.v4() != null) {
            e9 var2 = this.u3().n5(this, var1);
            var2.p8();
            this.t2 = var2;
         }
      } finally {
         com.aspose.slides.internal.x9.z1.l6().h0();
      }
   }

   public final void n5(com.aspose.slides.internal.t1.n5 var1, int var2) {
      this.c8.n5(var1, var2);
   }

   @Override
   public void l6() {
      this.n5((com.aspose.slides.internal.f2.u3)null);
      if (this.h0 != null) {
         List var1 = this.h0.z7();
         if (var1 != null) {
            while (var1.size() > 0) {
               com.aspose.slides.internal.z7.n5 var2 = (com.aspose.slides.internal.z7.n5)var1.get_Item(0);
               var1.removeAt(0);
               t9 var3 = new t9(var2);
               this.n5(var3);
            }
         }

         com.aspose.slides.internal.a5.k5 var4 = this.h0.v4();
         if (var4 != null) {
            y4 var5 = new y4(var4);
            this.n5(var5);
            if (!var5.k5()) {
               this.n5.n5(var5);
            }
         }

         this.u9.l6(this.h0.y1());
      }

      this.n5.n5();
   }

   private void n5(z3 var1) {
      if (com.aspose.slides.internal.v6g.k5.l6(var1, m1.class)) {
         m1 var2 = (m1)var1;
         String[] var3 = var2.u3();

         for (String var7 : var3) {
            List var8 = this.u9.u3(var7);
            if (var8 != null && var8.size() != 0) {
               var2.n5(var7, var8);
            } else {
               t4 var9 = com.aspose.slides.internal.a0.k5.n5(this.b_().m1());
               var9.n5(this, var1.a6(), var7);
               this.u9.n5(var7, var2);
            }
         }

         if (var2.k5()) {
            this.n5.n5(var1);
         }
      } else {
         this.n5.n5(var1);
      }
   }

   public final String h0() {
      this.s7++;
      return d1.n5(new String[]{"P", a3.l6(this.s7)});
   }
}
