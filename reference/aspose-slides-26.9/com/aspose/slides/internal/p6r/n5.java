package com.aspose.slides.internal.p6r;

import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.b7s.q0;
import com.aspose.slides.internal.b8u.t9;
import com.aspose.slides.internal.n5p.h0;
import com.aspose.slides.internal.o9b.j5;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.r1x.d2;
import com.aspose.slides.internal.r1x.k7;
import com.aspose.slides.internal.r1x.m1;
import com.aspose.slides.internal.r1x.v3;
import com.aspose.slides.internal.r1x.v4;
import com.aspose.slides.internal.r1x.z6;
import com.aspose.slides.internal.r6a.a6;
import com.aspose.slides.internal.r6a.c8;
import com.aspose.slides.internal.r6a.u9;
import com.aspose.slides.internal.z0k.t4;
import com.aspose.slides.ms.System.d1;
import java.awt.image.BufferedImage;

public class n5<T extends com.aspose.slides.internal.l3e.l6> {
   private final q0 c8;
   private final BufferedImage t2;
   protected y2 n5 = new y2();
   protected y2 l6 = new y2();
   protected final boolean k5;
   protected final T u3;
   protected final t9 a6;
   protected final m1 u9;
   protected final z6 h0;

   n5(T var1, t9 var2, z6 var3, m1 var4, d2 var5, q0 var6, BufferedImage var7) {
      this.u3 = (T)var1;
      this.a6 = var2;
      this.u9 = var4;
      this.h0 = var3 != null ? var3 : this.u3.h0();
      this.k5 = var3 != null && this.u3.h0().n5().t4() != var3.n5().t4();
      this.c8 = var6;
      this.t2 = var7;
   }

   protected void n5(byte[][] var1) {
      y2 var2 = this.l6.n3();
      var2.k5(-this.n5.s7(), -this.n5.x8());
      v4 var3 = this.u3.h0().n5();
      int var4 = com.aspose.slides.internal.n5p.h0.k5(com.aspose.slides.internal.v6g.k5.u3(this.u3.c8().u3().c8(), 8), 8 * this.u3.c8().u3().u3());
      u9 var5 = this.n5(this.l6.t2(), this.l6.l6(), var3);
      var5.l6(var1, var4);
      this.a6.n5(this.l6.n3(), new byte[0], this.l6.a6().k5(), new j5(this.l6.u9(), this.l6.n5()));
   }

   private u9 n5(int var1, int var2, v4 var3) {
      if (var3.t4() == 5) {
         return this.k5 ? new c8(var1, var2, new v3(this.n5()), new v3(this.l6()), this.t2) : new com.aspose.slides.internal.r6a.u3(var1, var2, this.t2);
      } else if (var3.t4() == 4) {
         return this.k5
            ? new com.aspose.slides.internal.r6a.l6(var1, var2, new v3(this.n5()), new v3(this.l6()), this.t2)
            : new com.aspose.slides.internal.r6a.u3(var1, var2, this.t2);
      } else if (var3.t4() == 1) {
         return new com.aspose.slides.internal.r6a.n5(var1, var2, this.t2);
      } else if (var3.t4() == 2) {
         return new a6(var1, var2, this.t2);
      } else if (var3.t4() == 0) {
         return new com.aspose.slides.internal.r6a.k5(var1, var2, this.t2);
      } else if (var3.t4() == 3) {
         return new com.aspose.slides.internal.r6a.h0(var1, var2, this.t2);
      } else {
         throw new NotImplementedException(d1.n5("Cannot perform conversion for {0} format.", new Object[]{var3}));
      }
   }

   private t4 n5() {
      return this.c8.u6() != null && !this.c8.t1() ? this.c8.u6().n5() : k7.n5().n5();
   }

   private t4 l6() {
      return this.c8.v4() != null && !this.c8.t1() ? this.c8.v4().n5() : k7.l6().n5();
   }
}
