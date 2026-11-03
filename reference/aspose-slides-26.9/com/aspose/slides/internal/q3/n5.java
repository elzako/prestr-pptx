package com.aspose.slides.internal.q3;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.internal.i4.a1;
import com.aspose.slides.internal.i4.a5;
import com.aspose.slides.internal.i4.a7;
import com.aspose.slides.internal.i4.b3;
import com.aspose.slides.internal.i4.c5;
import com.aspose.slides.internal.i4.d2;
import com.aspose.slides.internal.i4.d5;
import com.aspose.slides.internal.i4.d6;
import com.aspose.slides.internal.i4.d9;
import com.aspose.slides.internal.i4.f4;
import com.aspose.slides.internal.i4.g7;
import com.aspose.slides.internal.i4.h2;
import com.aspose.slides.internal.i4.h5;
import com.aspose.slides.internal.i4.h6;
import com.aspose.slides.internal.i4.i6;
import com.aspose.slides.internal.i4.j4;
import com.aspose.slides.internal.i4.j5;
import com.aspose.slides.internal.i4.j6;
import com.aspose.slides.internal.i4.j8;
import com.aspose.slides.internal.i4.j9;
import com.aspose.slides.internal.i4.m1;
import com.aspose.slides.internal.i4.n3;
import com.aspose.slides.internal.i4.n7;
import com.aspose.slides.internal.i4.p4;
import com.aspose.slides.internal.i4.p6;
import com.aspose.slides.internal.i4.q2;
import com.aspose.slides.internal.i4.r1;
import com.aspose.slides.internal.i4.s0;
import com.aspose.slides.internal.i4.s7;
import com.aspose.slides.internal.i4.t3;
import com.aspose.slides.internal.i4.t5;
import com.aspose.slides.internal.i4.u5;
import com.aspose.slides.internal.i4.u6;
import com.aspose.slides.internal.i4.v0;
import com.aspose.slides.internal.i4.v3;
import com.aspose.slides.internal.i4.v4;
import com.aspose.slides.internal.i4.v8;
import com.aspose.slides.internal.i4.w2;
import com.aspose.slides.internal.i4.w8;
import com.aspose.slides.internal.i4.y0;
import com.aspose.slides.internal.i4.y1;
import com.aspose.slides.internal.i4.y6;
import com.aspose.slides.internal.i4.z1;
import com.aspose.slides.internal.i4.z7;
import com.aspose.slides.ms.System.IDisposable;

public class n5 implements j8, w2 {
   private j4 n5;
   private v0 l6;
   private g7 k5;
   private List<String> u3 = new List<>();

   public n5(j4 var1, v0 var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   @Override
   public final void n5(u5 var1) {
      IGenericEnumerator var2 = var1.n5().iterator();

      try {
         while (var2.hasNext()) {
            h6 var3 = (h6)var2.next();
            a1 var4 = (a1)var3.n5();
            var4.n5(this);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      if (this.u3.size() != 0) {
         List$Enumerator var14 = this.u3.iterator();

         try {
            while (var14.hasNext()) {
               String var15 = (String)var14.next();
               u6 var5 = (u6)this.n5.n5(var15);
               u3 var6 = new u3(this.u3);
               var5.y4().n5(var6);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var14, IDisposable.class)) {
               var14.dispose();
            }
         }
      }
   }

   @Override
   public final void n5(com.aspose.slides.internal.i4.t2 var1) {
      switch (var1.k5()) {
         case 0:
            var1.l6().n5(this);
         default:
            if (this.t2() != null) {
               i6 var2 = com.aspose.slides.internal.v6g.k5.n5(var1.n5(), i6.class);
               if (var2 == null) {
                  var2 = new i6(var1.n5(), null);
               }

               if (com.aspose.slides.internal.v6g.k5.l6(var2.n5(), s0.class)) {
                  String var3 = ((s0)var2.n5()).n5();
                  if (com.aspose.slides.internal.v6g.k5.l6(this.t2(), y0.class)) {
                     this.u3.addItem(var3);
                  }

                  this.n5.n5(var3, this.t2());
               }
            }
      }
   }

   @Override
   public final void n5(n3 var1) {
   }

   @Override
   public final void n5(z1 var1) {
   }

   @Override
   public final void n5(j5 var1) {
   }

   @Override
   public final void n5(d2 var1) {
   }

   @Override
   public final void n5(d5 var1) {
   }

   @Override
   public final void n5(b3 var1) {
      var1.n5().n5(this);
   }

   @Override
   public final void n5(z7 var1) {
   }

   @Override
   public final void n5(v4 var1) {
   }

   @Override
   public final void n5(a5 var1) {
      this.n5.n5(var1.n5(), this.n5((y0)var1));
      this.u3.addItem(var1.n5());
   }

   @Override
   public final void n5(v8 var1) {
   }

   @Override
   public final void n5(f4 var1) {
   }

   @Override
   public final void n5(q2 var1) {
   }

   @Override
   public final void n5(j6 var1) {
   }

   @Override
   public final void n5(d6 var1) {
   }

   @Override
   public final void n5(y6 var1) {
   }

   @Override
   public final void n5(c5 var1) {
   }

   @Override
   public final void n5(t5 var1) {
   }

   @Override
   public final void n5(com.aspose.slides.internal.i4.u9 var1) {
   }

   @Override
   public final void n5(m1 var1) {
   }

   @Override
   public final void n5(h2 var1) {
      this.n5(this.n5((y0)var1));
   }

   @Override
   public final void n5(i6 var1) {
   }

   @Override
   public final void n5(a7 var1) {
   }

   @Override
   public final void n5(v3 var1) {
   }

   @Override
   public final void n5(t3 var1) {
   }

   @Override
   public final void n5(w8 var1) {
   }

   @Override
   public final void n5(s0 var1) {
   }

   @Override
   public final void n5(p6 var1) {
   }

   @Override
   public final void n5(r1 var1) {
   }

   @Override
   public final void n5(s7 var1) {
   }

   @Override
   public final void n5(p4 var1) {
   }

   @Override
   public final void n5(n7 var1) {
   }

   @Override
   public final void n5(d9 var1) {
   }

   @Override
   public final void n5(h5 var1) {
   }

   @Override
   public final g7 t2() {
      return this.k5;
   }

   @Override
   public final void n5(g7 var1) {
      this.k5 = var1;
   }

   @Override
   public final j9 u3() {
      return this.l6;
   }

   @Override
   public final g7 h0() {
      return null;
   }

   @Override
   public final g7 l6(g7 var1) {
      return null;
   }

   @Override
   public final void n5(u6 var1, y1 var2, g7[] var3) {
   }

   private u6 n5(y0 var1) {
      u6 var2 = this.u3().y4().s7();
      var2.n5(var1.k5());
      var2.h0(var1.n5());
      var2.n5(var1.l6());
      return var2;
   }
}
