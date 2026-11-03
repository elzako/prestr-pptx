package com.aspose.slides.internal.o2b;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.r1x.a0;
import com.aspose.slides.internal.r1x.f0;
import com.aspose.slides.ms.System.IDisposable;

public class z8 {
   private f0 n5;
   private com.aspose.slides.internal.f2i.n5 l6;
   private y2 k5 = new y2();
   private List<com.aspose.slides.internal.u2w.a6> u3;

   protected z8(f0 var1, com.aspose.slides.internal.f2i.n5 var2, y2 var3) {
      if (var1 == null) {
         throw new ArgumentNullException("imageToLoadPixelsFrom");
      }

      if (var2 == null) {
         throw new ArgumentNullException("options");
      }

      this.n5 = var1;
      this.l6 = var2;
      var3.u3(this.k5);
      this.u3 = new List<>();
      if (this.k5.k5()) {
         var1.x8().u3(this.k5);
      }
   }

   public final com.aspose.slides.internal.f2i.n5 t9() {
      return this.l6;
   }

   public final y2 z1() {
      return this.k5;
   }

   public List<com.aspose.slides.internal.u2w.a6> t4() {
      return this.u3;
   }

   public List<com.aspose.slides.internal.u2w.a6> n5(boolean var1) {
      List var2 = new List();
      com.aspose.slides.internal.u2w.a6[] var3 = this.l6.u6();
      if (!var1) {
         for (com.aspose.slides.internal.u2w.a6 var7 : var3) {
            var2.addItem(var7);
         }

         List$Enumerator var17 = this.u3.iterator();

         try {
            while (var17.hasNext()) {
               com.aspose.slides.internal.u2w.a6 var19 = (com.aspose.slides.internal.u2w.a6)var17.next();
               if (!this.l6.n5(var19.k5())) {
                  var2.addItem(var19);
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var17, IDisposable.class)) {
               var17.dispose();
            }
         }
      } else {
         List$Enumerator var18 = this.u3.iterator();

         try {
            while (var18.hasNext()) {
               com.aspose.slides.internal.u2w.a6 var20 = (com.aspose.slides.internal.u2w.a6)var18.next();
               var2.addItem(var20);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var18, IDisposable.class)) {
               var18.dispose();
            }
         }

         for (com.aspose.slides.internal.u2w.a6 var8 : var3) {
            int[] var9 = new int[]{var8.k5()};
            com.aspose.slides.internal.u2w.a6[] var10 = a0.n5(com.aspose.slides.internal.u2w.a6.class, this.u3, new j5(this, var9));
            if (var10 == null || var10.length == 0) {
               var2.addItem(var8);
            }
         }
      }

      return var2;
   }

   public void q0() {
   }

   public void z3() {
   }

   public void l6() {
   }

   public void k5() {
   }

   public void u3() {
   }

   public void a6() {
   }

   public void u9() {
   }

   public void m1() {
   }

   public void k7() {
   }

   public void m3() {
   }

   public void z8() {
   }

   public void j5() {
   }

   public void w1() {
   }

   public void r4() {
   }

   public void c4() {
   }

   public void h0() {
   }

   public void y2() {
   }

   public void e2() {
   }

   public void c8() {
   }

   public void t2() {
   }

   public void y1() {
   }

   public void a0() {
   }

   public void s7() {
   }

   public void x8() {
   }

   public void d2() {
   }

   public void d5() {
   }

   public void s3() {
   }

   public void p8() {
   }

   public void f2() {
   }

   public void i1() {
   }

   public void e5() {
   }

   public void b3() {
   }

   public void o0() {
   }

   public void z7() {
   }

   public void n3() {
   }

   public void v4() {
   }

   public void u6() {
   }

   public void t1() {
   }

   public void a5() {
   }

   public void h2() {
   }

   public void v0() {
   }

   public void f0() {
   }

   public void a3() {
   }

   public void p3() {
   }

   public void x9() {
   }

   public void y4() {
   }

   public void y0() {
   }

   public void j9() {
   }

   public void z6() {
   }

   public void e9() {
   }

   public void o5() {
   }

   public void j8() {
   }

   public void w2() {
   }

   public void s0() {
   }

   public void v8() {
   }

   public void v3() {
   }

   public void g7() {
   }

   public void j4() {
   }

   public void i9() {
   }

   public void f5() {
   }

   public void j3() {
   }

   public void n1() {
   }

   public void p6() {
   }

   public void d1() {
   }

   public void s4() {
   }

   public void h6() {
   }

   public void y8() {
   }

   public void c3() {
   }

   public void l4() {
   }

   public void i6() {
   }

   public void a7() {
   }

   public void r8() {
   }

   public void r1() {
   }

   public void y5() {
   }

   public void k8() {
   }

   public void b5() {
   }

   public void u8() {
   }

   public void w5() {
   }

   public void q1() {
   }

   public void u5() {
   }

   public void w8() {
   }

   public void c2() {
   }

   public void t3() {
   }

   public void u4() {
   }

   public void s9() {
   }

   public void p7() {
   }

   public void z5() {
   }

   public void h5() {
   }

   public void a8() {
   }

   public void f4() {
   }
}
