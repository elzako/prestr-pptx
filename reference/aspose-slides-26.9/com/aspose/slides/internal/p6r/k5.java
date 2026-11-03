package com.aspose.slides.internal.p6r;

import com.aspose.slides.exceptions.OutOfMemoryException;
import com.aspose.slides.internal.b7s.q0;
import com.aspose.slides.internal.b8u.e2;
import com.aspose.slides.internal.b8u.t9;
import com.aspose.slides.internal.l3e.u9;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.r1x.a6;
import com.aspose.slides.internal.r1x.d2;
import com.aspose.slides.internal.r1x.m1;
import com.aspose.slides.internal.r1x.z6;
import java.awt.image.BufferedImage;

public class k5 extends n5<u9> implements e2 {
   public k5(u9 var1, t9 var2, z6 var3, m1 var4, d2 var5, q0 var6, BufferedImage var7) {
      super(var1, var2, var3, var4, var5, var6, var7);
   }

   @Override
   public final void n5(y2 var1) {
      if (com.aspose.slides.internal.r1x.a6.n5() > 0) {
         int var2 = var1.t2() * var1.l6() * com.aspose.slides.internal.v6g.k5.n5(9);
         if (var2 > com.aspose.slides.internal.r1x.a6.n5()) {
            throw new OutOfMemoryException();
         }
      }

      this.u3.c8().n3().h0();
      this.u3.n5(this.u3.c8().n3(), var1.n3());
      this.n5(this.u3.n5());
   }
}
