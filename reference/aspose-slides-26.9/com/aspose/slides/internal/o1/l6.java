package com.aspose.slides.internal.o1;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.b9.s9;
import com.aspose.slides.internal.c5.e2;
import com.aspose.slides.internal.r6.u9;
import com.aspose.slides.internal.x4g.m1;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.s3;

public abstract class l6 extends k5 {
   private u9 u9;

   protected l6(com.aspose.slides.internal.d9.n5 var1, u3 var2) {
      super(var1, var2);
      com.aspose.slides.internal.r6.n5 var3 = new com.aspose.slides.internal.r6.n5();
      this.u9 = new u9(var3);
      this.u9.n5(new com.aspose.slides.internal.r6.k5(var1.x8().n5().x8() & 65535));
      this.u9.t4().n5(0L, var1);
   }

   @Override
   public void n5(com.aspose.slides.internal.o9b.l6 var1) {
      this.u9.n5(var1);
   }

   @Override
   public void n5(Object var1, m1 var2) {
      this.u9.n5(this.k5());
      this.u9.n5(var1);
      this.n5(var2, this.u9);
      IGenericEnumerator var3 = this.l6().n5().iterator();

      try {
         while (var3.hasNext()) {
            s9 var4 = (s9)var3.next();
            com.aspose.slides.internal.r6.u3 var5 = com.aspose.slides.internal.r6.a6.n5(var4.c4());
            if (var5 == null) {
               throw new com.aspose.slides.internal.p5.n5(d1.n5(new String[]{"Player for ", s3.n5(e2.class, var4.c4()), " was not found."}));
            }

            var5.n5(var4, this.u9);
            if (var4.c4() == 14L) {
               break;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }
   }

   protected abstract void n5(m1 var1, u9 var2);
}
