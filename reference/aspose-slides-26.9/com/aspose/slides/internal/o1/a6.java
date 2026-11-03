package com.aspose.slides.internal.o1;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.g1.u9;
import com.aspose.slides.internal.i3.v4;
import com.aspose.slides.internal.o4.m3;
import com.aspose.slides.internal.o9b.f2;
import com.aspose.slides.internal.o9b.j5;
import com.aspose.slides.internal.o9b.p8;
import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.o9b.z1;
import com.aspose.slides.internal.x4g.m1;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.q1;
import com.aspose.slides.ms.System.s3;

public class a6 extends k5 {
   private u9 u9 = new u9(this);

   public a6(com.aspose.slides.internal.m0.n5 var1, u3 var2) {
      super(var1, var2);
      this.u9.n5(new Object[var1.x8().u9()]);
      com.aspose.slides.internal.g1.k5 var3 = new com.aspose.slides.internal.g1.l6(var1, this.k5()).n5();
      var1.n5(var3);
      this.n5 = new y2(new j5(), var2.u3().u3());
      this.u9.k5(this.n5(y1.n5(this.n5()).y4(), this.a6().y4()));
      this.u3 = new p8(this.n5.t2(), this.n5.l6());
      this.n5(this.u3.u3()).l6(this.a6);
      this.u9.n5(this.u3.l6() / this.a6.l6());
      this.u9.l6(this.u3.k5() / this.a6.k5());
      this.u9.n5(8);
      if (this.u9.d2()) {
         this.u9.l6(this.n5().n3());
      } else {
         if (var1.t9().length > 0) {
            this.u9.l6(var1.z1().n5().n3());
            this.u9.n5(this.n5.n3());
            return;
         }

         this.u9.l6(this.n5.n3());
      }

      this.u9.n5(this.n5.n3());
   }

   protected final y1 a6() {
      return new y1(0.0F, 0.0F, (float)this.l6().u9() * this.l6 / this.u9(), (float)this.l6().h0() * this.k5 / this.u9());
   }

   @Override
   public com.aspose.slides.internal.o9b.l6 u3() {
      return this.n5(((com.aspose.slides.internal.m0.n5)this.l6()).y4(), ((com.aspose.slides.internal.m0.n5)this.l6()).e2());
   }

   @Override
   public com.aspose.slides.internal.o9b.l6 n5(float var1, float var2) {
      com.aspose.slides.internal.o9b.l6 var3 = new com.aspose.slides.internal.o9b.l6(
         com.aspose.slides.internal.v6g.k5.u3(q1.u3(var1), 14), com.aspose.slides.internal.v6g.k5.u3(q1.u3(var2), 14)
      );
      this.u9.n5(var3);
      y1 var4 = new y1(0.0F, 0.0F, ((com.aspose.slides.internal.m0.n5)this.l6()).z1().k5().t2(), ((com.aspose.slides.internal.m0.n5)this.l6()).z1().k5().l6());
      w1[] var5 = new w1[]{new w1(0.0F, 0.0F), new w1(var1, 0.0F), new w1(0.0F, var2)};
      m1 var6 = new m1(var4.y4(), var5);
      z1 var7 = z1.n5(var3);

      try {
         if (!this.k5().k5().t2()) {
            var7.n5(this.k5().k5().o8());
         }

         var7.u9(3);
         this.n5(var7, var6);
      } finally {
         if (var7 != null) {
            var7.dispose();
         }
      }

      return var3;
   }

   @Override
   public void n5(z1 var1, com.aspose.slides.internal.o9b.l6 var2, y1 var3) {
      this.u9.n5(var2);
      com.aspose.slides.internal.m0.n5 var4 = (com.aspose.slides.internal.m0.n5)this.l6();
      m1 var5 = var1.m1().u9();
      var5.k5(var3.a6() + var4.z1().u3().u3(), var3.t2() + var4.z1().u3().c8());
      var5.n5(var3.s7() / var4.z1().k5().t2(), var3.k5() / var4.z1().k5().l6());
      this.n5(var1, var5);
   }

   @Override
   public void n5(com.aspose.slides.internal.o9b.l6 var1) {
      this.u9.n5(var1);
   }

   @Override
   public void n5(Object var1, m1 var2) {
      this.u9.n5(this.k5());
      z1 var3 = com.aspose.slides.internal.v6g.k5.n5(var1, z1.class);
      this.u9.u3(var3.m1());
      this.u9.n5(var3.u9().l6());
      this.u9.l6(var2);
      var3.u3();
      var3.n5(var2.u9());

      try {
         IGenericEnumerator var4 = this.l6().n5().iterator();

         try {
            while (var4.hasNext()) {
               v4 var5 = (v4)var4.next();
               com.aspose.slides.internal.g1.u3 var6 = com.aspose.slides.internal.g1.a6.n5(var5.t9());
               if (var6 == null) {
                  throw new Exception(d1.n5(new String[]{"Player for ", s3.n5(m3.class, var5.t9()), " was not found."}));
               }

               var6.n5(var5, var3, this.u9);
               if (var5.t9() == 0 || var5.t9() == 65535) {
                  break;
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
               var4.dispose();
            }
         }
      } finally {
         if (this.u9.m1() != null && this.u9.k7()) {
            com.aspose.slides.internal.b6.z1.n5(this.u9);
         }
      }
   }

   private int u9() {
      return this.l6().l6() == 2 && (((com.aspose.slides.internal.m0.n5)this.l6()).n3().k5() & 65535) > 0
         ? ((com.aspose.slides.internal.m0.n5)this.l6()).n3().k5() & 65535
         : 96;
   }

   private f2 n5(p8 var1) {
      return new f2(var1.l6() * 25.0F / this.l6, var1.k5() * 25.0F / this.k5);
   }
}
